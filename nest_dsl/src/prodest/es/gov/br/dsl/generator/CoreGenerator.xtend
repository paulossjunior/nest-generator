package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.MethodArg
import prodest.es.gov.br.dsl.nestdsl.Method
import prodest.es.gov.br.dsl.nestdsl.Property
import java.util.ArrayList
import java.util.List

class CoreGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
				
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                "src/"+e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".entity.ts",
                e.compile)
           fsa.generateFile(
                 "src/"+e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".controller.ts",
                e.controllerCompile)
           fsa.generateFile(
                "src/"+e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".service.ts",
                e.serviceCompile)
            fsa.generateFile(
                "src/"+e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".providers.ts",
                e.providersCompile)
            fsa.generateFile(
                "src/"+e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".module.ts",
                e.moduleCompile)
        }    
	}
	
	def compile(Entity e) 
	    ''' 
	    	import { Entity, Column, PrimaryGeneratedColumn, JoinColumn, JoinTable, OneToOne, OneToMany, ManyToMany, ManyToOne } from 'typeorm';
	    	import { ApiModelProperty } from '@nestjs/swagger';
	    	«FOR p: e.properties»
	    		«IF p.relation !== null»
		    		«IF p.relation.oneArgument !== null»
		    			import { «p.relation.oneArgument.type.name» } from '../«p.relation.oneArgument.type.name»/«p.relation.oneArgument.type.name.toLowerCase».entity'
		    		«ELSEIF p.relation.multipleArgument !== null»
		    			import { «p.relation.multipleArgument.type.name» } from '../«p.relation.multipleArgument.type.name»/«p.relation.multipleArgument.type.name.toLowerCase».entity'
		    		«ENDIF»
		    	«ENDIF»   	
	    	«ENDFOR»
	    	
	    	@Entity()
	    	export class «e.name» «IF e.superType !== null
		            »extends «e.superType.fullyQualifiedName» «ENDIF»{
		        «FOR p : e.properties»
	        	
	        		«p.compile»
		        «ENDFOR»
	    	}
	    '''
 
	def compile(Property p) 
	'''
		@ApiModelProperty()
		«IF p.name == 'id' || p.name == 'ID'»
				@PrimaryGeneratedColumn()
		«ELSE»
			«IF p.relation !== null»
				«IF p.relation.oneArgument !== null»
					«var oneArgument = p.relation.oneArgument.argument»
					@«oneArgument»(type => «p.relation.oneArgument.type.name»)
					«IF oneArgument == 'OneToOne'»
						@JoinColumn()
					«ELSEIF oneArgument == 'ManyToMany'»
						@JoinTable()
					«ENDIF»
				«ELSEIF p.relation.multipleArgument !== null»
					«var secondArgument = p.relation.multipleArgument.secondArgument»
					@«p.relation.multipleArgument.argument»(type => «p.relation.multipleArgument.type.name», «secondArgument»)
				«ENDIF»
				«ELSE»
					@Column()
			«ENDIF»
		«ENDIF»
		«IF p.classType !== null»
			«p.name»: «p.classType.fullyQualifiedName»«p.array»;
		«ELSE»
			«p.name»: «p.type»«p.array»;
		«ENDIF»
    '''
	
	def controllerCompile(Entity e)
	'''
		import { Controller, Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from '@nestjs/common';
		import { ApiUseTags, ApiOperation, ApiResponse, ApiImplicitParam } from '@nestjs/swagger';
		import{ «e.name»Service } from './«e.name.toLowerCase».service';
		import { «e.name» } from './«e.name.toLowerCase».entity';
		import { BaseController } from '../BaseModule/base.controller';
		
		@ApiUseTags('«e.name»')
		@Controller('«e.name.toLowerCase»')
		export class «e.name»Controller extends BaseController<«e.name»> {
			
			constructor(private readonly service: «e.name»Service) {
					super(service)
			}
			«FOR method: e.methods»
			
			@«method.verb»('«method.name»')
			@ApiOperation({
				title: 'Insert your operation title',
				description: 'Insert your operation description'
			})
			@ApiResponse({
				status: 200,
				description: 'Insert your response description',
				type: «e.name»,
				isArray: false // or true
			})
			
			public async «method.name»(@Res() res): Promise<«IF method.returnClassType !== null»«method.returnClassType.fullyQualifiedName»«ELSE»«method.returnType»«ENDIF»> {
				try{
					res
					.status(HttpStatus.OK)
					.send(await this.service.«method.name»(/*Parameters*/));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						 .status(badGateWay)
						 .send({error, badGateWay});
				}
			}
			«ENDFOR»
		}
	'''
	def serviceCompile(Entity e)
	'''
		import { Injectable, Inject } from '@nestjs/common';
		import { Repository } from 'typeorm';
		import { «e.name» } from './«e.name.toLowerCase».entity';
		import { BaseService } from "../BaseModule/base.service";
		
		@Injectable()
		export class «e.name»Service extends BaseService<«e.name»>{
			
			constructor(
				@Inject('«e.name.toUpperCase»_REPOSITORY')
				private readonly «e.name.toLowerCase»Repository: Repository<«e.name»>
			){
				super(«e.name.toLowerCase»Repository);
			}
			
			«FOR method: e.methods»	
				«var newArgs = generateArgList(method)»
				async «method.name»(«FOR arg: newArgs»«arg»«ENDFOR»): Promise<«IF method.returnClassType !== null»«method.returnClassType.fullyQualifiedName»«ELSE»«method.returnType»«ENDIF»> {
					//To do «method.name»
				}
				
			«ENDFOR»
		}
	'''
	def generateArgList(Method m){
		var List<String> newArgs = new ArrayList();
		
		for(var i = 0; i < m.args.size(); i++){
			newArgs.add(m.args.get(i).compile)
			if(i+1 < m.args.size()){
				newArgs.add(', ')
			}	
		}
		
		return newArgs;
	}
	
	def compile(MethodArg arg){
		var response = arg.name + ': '
		if(arg.classType !== null){
			if(arg.array !== null)
				response += arg.classType.fullyQualifiedName+arg.array
			response += arg.classType.fullyQualifiedName
		}
		else{			
			if(arg.array !== null)
				response += arg.type+arg.array
			response += arg.type
		}
		return response
	}
	
	def providersCompile(Entity e)
	'''
		import { Connection, Repository } from 'typeorm';
		import { «e.name» } from './«e.name.toLowerCase».entity'
		
		export const «e.name.toLowerCase»Providers = [
			{
				provide: '«e.name.toUpperCase»_REPOSITORY',
				useFactory: (connection: Connection) => connection.getRepository(«e.name»),
				inject: ['DATABASE_CONNECTION'],
			}
		];
	'''
	
	def moduleCompile(Entity e)
	'''
		import { Module } from '@nestjs/common';
		import { «e.name»Controller } from './«e.name.toLowerCase».controller';
		import { «e.name»Service } from './«e.name.toLowerCase».service';
		import { «e.name.toLowerCase»Providers } from './«e.name.toLowerCase».providers'
		import { DatabaseModule } from '../Database/database.module';
		
		@Module({
		  imports: [ DatabaseModule ],
		  controllers: [«e.name»Controller],
		  providers: [«e.name»Service, ...«e.name.toLowerCase»Providers],
		})
		
		export class «e.name»Module {}
	'''
   
}
package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.MethodArg
import prodest.es.gov.br.dsl.nestdsl.Property

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
	    	import { ApiModelProperty } from "@nestjs/swagger";
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
		«p.name»: «p.type.fullyQualifiedName»«p.array»;
    '''
	
	def controllerCompile(Entity e)
	'''
		import { Controller, Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from '@nestjs/common';
		import { ApiUseTags, ApiOperation, ApiResponse, ApiImplicitParam } from '@nestjs/swagger';
		import{ «e.name»Service } from './«e.name.toLowerCase».service'
		import { «e.name» } from './«e.name.toLowerCase».entity'
		
		@ApiUseTags('Insert your description')
		@Controller('«e.name.toLowerCase»')
		export class «e.name»Controller{
			constructor(
				private readonly service: «e.name»Service,
			){}
			
			@Get()
			@ApiOperation({
		        title: 'Insert your operation title',
		        description: 'Insert your operation description'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'Insert your response description',
		        type: «e.name»,
		        isArray: true
		    })
		    
			public async findAll(@Res() res): Promise<«e.name»[]> {
				try{
					return res
				 			.status(HttpStatus.OK)
					 		.send(await this.service.findAll());
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						.status(badGateWay)
			 			.send({error, badGateWay});
				}
			}
			
			@Get('/:id')
			@ApiOperation({
		        title: 'Insert your operation title',
		        description: 'Insert your operation description'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'Insert your response description',
		        type: «e.name»,
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Insert your param description',
		        required: true, //or false
		        type: 'number'
		    })
			
			public async findOne(@Res() res, @Param('id') id): Promise<«e.name»> {
				try{
					return res
					 	.status(HttpStatus.OK)
					 	.send(await this.service.findOne(id));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						 .status(badGateWay)
						 .send({error, badGateWay});
				}
			}
			
			@Post()
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
		    
			public async createOne(@Res() res, @Body() «e.name.toLowerCase»: «e.name»): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.createOne(«e.name.toLowerCase»));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
						 .status(badGateWay)
						 .send({error, badGateWay});
				}
			}
			
			@Put('/:id')
			@ApiOperation({
		        title: 'Insert your operation title',
		        description: 'Insert your operation description'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'Insert your response description',
		        type: «e.name»,
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Insert your param description',
		        required: true, //or false
		        type: 'number'
		    })
					    
			public async updateOne(@Res() res, @Param('id') id, @Body() «e.name.toLowerCase»: «e.name»): Promise<void> {
				try{
					«e.name.toLowerCase».id = Number(id);
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.updateOne(«e.name.toLowerCase»));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
					 .status(badGateWay)
					 .send({error, badGateWay});
				}
			}
			
			@Delete('/:id')
			@ApiOperation({
		        title: 'Insert your operation title',
		        description: 'Insert your operation description'
		    })
		    @ApiResponse({
		        status: 200,
		        description: 'Insert your response description',
		        type: «e.name»,
		        isArray: false
		    })
		    @ApiImplicitParam({
		        name: 'id',
		        description: 'Insert your param description',
		        required: true, //or false
		        type: 'number'
		    })
					    
			public async deleteOne(@Res() res, @Param('id') id): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.deleteOne(id));
				}
				catch(error){
					const badGateWay = HttpStatus.BAD_GATEWAY;
					res
					 .status(badGateWay)
					 .send({error, badGateWay});
				}
			}
			«FOR method: e.methods»
			
			@«method.verb»('/«method.name»')
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
			
			public async «method.name»(@Res() res): Promise<«method.returnType.fullyQualifiedName»> {
				try{
					res
					.status(HttpStatus.OK)
					.send(await this.service.«method.name»(//Parameters));
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
		import { «e.name» } from './«e.name.toLowerCase».entity'
		
		@Injectable()
		export class «e.name»Service {
			
			constructor(
				@Inject('«e.name.toUpperCase»_REPOSITORY')
				private readonly «e.name.toLowerCase»Repository: Repository<«e.name»>
			){}
			
			async findAll(): Promise<«e.name»[]> {
				return await this.«e.name.toLowerCase»Repository.find();
			}
			
			async findOne(id: number): Promise<«e.name»> {
				return await this.«e.name.toLowerCase»Repository.findOne({id: id});
			}
			
			async createOne(«e.name.toLowerCase»: «e.name»): Promise<void> {
				await this.«e.name.toLowerCase»Repository.save(«e.name.toLowerCase»);
			}
			
			async updateOne(«e.name.toLowerCase»: «e.name»): Promise<void> {
				await this.«e.name.toLowerCase»Repository.update(«e.name.toLowerCase».id, «e.name.toLowerCase»);
			}
			
			async deleteOne(id: number): Promise<void> {
				await this.«e.name.toLowerCase»Repository.delete(id)
			}
			
			«FOR method: e.methods»	
				async «method.name»(«IF method.args.size()>0»«method.args.remove(0).compile»«FOR arg: method.args», «arg.compile»«ENDFOR»«ENDIF»): Promise<«method.returnType.fullyQualifiedName»«method.array»> {
					//To do «method.name»
				}
			«ENDFOR»
		}
	'''
	def compile(MethodArg arg)
	'''«arg.name»: «arg.type.fullyQualifiedName»«arg.array»'''
	
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
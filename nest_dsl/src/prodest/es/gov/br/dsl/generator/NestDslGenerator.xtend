package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.Property

class NestDslGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
 
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".entity.ts",
                e.compile)
           fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".controller.ts",
                e.compileController)
        }
    }
 
    def compile(Entity e) 
	    ''' 
	    	import { Entity, Column, PrimaryGeneratedColumn, JoinColumn, JoinTable, OneToOne, OneToMany, ManyToMany, ManyToOne } from 'typeorm';
	    	
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
	
	def compileController(Entity e)
	'''
		import { Controller, Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from '@nestjs/common';
		import{ «e.name»Service } from './«e.name.toLowerCase».service'
		
		@Controller('«e.name.toLowerCase»')
		export class «e.name»Controller{
			constructor(
				private readonly service: «e.name»Service,
			){}
			
			@Get()
			public async findAll(@Res() res): Promise<«e.name»[]> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.findAll());
				}
				catch(error){
					res
					 .status(HttpStatus.BAD_GATEWAY)
					 .send({error.message, HttpStatus.BAD_GATEWAY})
				}
			}
			
			@Get(/:id)
			public async findOne(@Res() res, @Param('id') id): Promise<«e.name»> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.findOne(id));
				}
				catch(error){
					res
					 .status(HttpStatus.BAD_GATEWAY)
					 .send({error.message, HttpStatus.BAD_GATEWAY})
				}
			}
			
			@Post()
			public async createOne(@Res() res, @Body() «e.name.toLowerCase»: «e.name»): Promise<void> {
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.createOne(«e.name.toLowerCase»));
				}
				catch(error){
					res
					 .status(HttpStatus.BAD_GATEWAY)
					 .send({error.message, HttpStatus.BAD_GATEWAY})
				}
			}
			
			@Put(/:id)
			public async updateOne(@Res() res, @Param('id') id, @Body() «e.name.toLowerCase»: «e.name»): Promise<void> {
				try{
					«e.name.toLowerCase».id = Number(id);
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.updateOne(«e.name.toLowerCase»));
				}
				catch(error){
					res
					 .status(HttpStatus.BAD_GATEWAY)
					 .send({error.message, HttpStatus.BAD_GATEWAY})
				}
			}
			@Delete(/:id)
			public async deleteOne(@Res() res, @Param('id') id){
				try{
					res
					 .status(HttpStatus.OK)
					 .send(await this.service.deleteOne(id));
				}
				catch(error){
					res
					 .status(HttpStatus.BAD_GATEWAY)
					 .send({error.message, HttpStatus.BAD_GATEWAY})
				}
			}
		}
	'''
  
}
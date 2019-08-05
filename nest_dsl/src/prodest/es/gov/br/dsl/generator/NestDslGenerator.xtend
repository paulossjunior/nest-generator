package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.Property
import prodest.es.gov.br.dsl.nestdsl.MethodArg
import java.util.List
import java.util.ArrayList
import prodest.es.gov.br.dsl.nestdsl.Dto
import prodest.es.gov.br.dsl.nestdsl.DtoProperty

class NestDslGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
 	
 	var List<String> modules = new ArrayList();
 	
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        
        for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".entity.ts",
                e.compile)
           fsa.generateFile(
                 e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".controller.ts",
                e.compileController)
           fsa.generateFile(
                e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".service.ts",
                e.compileService)
            fsa.generateFile(
                e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".providers.ts",
                e.compileProviders)
            fsa.generateFile(
                e.name+'/'+e.fullyQualifiedName.toString("/").toLowerCase + ".module.ts",
                e.compileModule)
        	modules.add(e.name);
        }
     //Dto
     for (dto : resource.allContents.toIterable.filter(Dto)) {
     	fsa.generateFile(
                'DTOs/'+dto.fullyQualifiedName.toString("/").toLowerCase + ".dto.ts",
                dto.compile)
     }
     // Database
        fsa.generateFile(
           "Database/database.module.ts",
            dbModuleCompile)
        fsa.generateFile(
           "Database/database.providers.ts",
            dbProvidersCompile)
            
     // Auxiliares
     	fsa.generateFile(
           "main.ts",
            mainCompile)
        fsa.generateFile(
           "app.module.ts",
            appModuleCompile(modules))
        fsa.generateFile(
           "Dockerfile",
            dockerfileCompile)
        fsa.generateFile(
           " .gitlab-ci.yml",
            ciCompile)
        fsa.generateFile(
           "sonar-project.properties",
            sonarCompile)
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
	
	def compileController(Entity e)
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
	def compileService (Entity e)
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
	
	def compileProviders (Entity e)
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
	
	def compileModule (Entity e)
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
	
	def dbModuleCompile()
	'''
		import { Module } from '@nestjs/common';
		import { databaseProviders } from './database.providers';
		
		@Module({
		  providers: [...databaseProviders],
		  exports: [...databaseProviders],
		})
		
		export class DatabaseModule {}
	'''
	
	def dbProvidersCompile()
	'''
		import { createConnection } from 'typeorm';
		
		export const databaseProviders = [
		  {
		    provide: 'DATABASE_CONNECTION',
		    useFactory: async () => await createConnection({
		      type: 'postgres',
		      host: 'localhost',
		      port: 5432,
		      username: 'postgres',
		      password: 'senha',
		      database: 'postgres',
		      entities: [
		          __dirname + '/../**/*.entity{.ts,.js}',
		      ],
		      synchronize: true,
		    }),
		  },
		];
	'''
	
	def mainCompile()
	'''
		import { NestFactory } from '@nestjs/core';
		import { AppModule } from './app.module';
		import { SwaggerModule, DocumentBuilder } from '@nestjs/swagger';
		const pacote = require( '../package.json' );
		const fs = require( 'fs' );
		
		async function bootstrap() {
		  const app = await NestFactory.create(AppModule);
		
		  const options = new DocumentBuilder()
		    .setTitle( pacote.name )
		    .setDescription( pacote.description )
		    .setVersion( pacote.version )
		    .setSchemes( 'http', 'https' )
		    .build();
		
		  const document = SwaggerModule.createDocument( app, options );
		
		  fs.writeFileSync( 'swagger.json', JSON.stringify( document, null, 2 ) );
		
		  SwaggerModule.setup( `/`, app, document );
		
		
		  await app.listen(3000);
		}
		bootstrap();
	'''
	
	def appModuleCompile(List<String> modules)
	'''
	import { Module } from '@nestjs/common';
	«FOR module: modules»
		import { «module»Module } from './«module»/«module.toLowerCase».module';
	«ENDFOR»
	
	@Module({
		imports: [
		«FOR module: modules»		«module»Module,
		«ENDFOR»
		],
		controllers: [],
		providers: [],
	})
	
	export class AppModule {}
	'''
	
	def compile(Dto dto)
	'''
	«FOR p : dto.properties»
		«IF p.type.eClass.name.equals('Dto')»import { «p.type.fullyQualifiedName» } from './«p.type.fullyQualifiedName.toLowerCase».dto'«ENDIF»
	«ENDFOR»
	
	export class «dto.name»Dto «IF dto.superType !== null
	»extends «dto.superType.fullyQualifiedName» «ENDIF» {
    constructor(		
    «FOR p : dto.properties»
		«compileDtoProperty(p, true)»
	«ENDFOR»
   	) {
	«FOR p : dto.properties»
		«compileDtoConstructor(p)»
	«ENDFOR»
		}
	«FOR p : dto.properties»
		«compileDtoProperty(p, false)»
	«ENDFOR»
	}
	'''
	
	def compileDtoProperty(DtoProperty p, Boolean constructor)
	'''
		«IF constructor == false»	readonly «p.name»«ELSE»		«p.name»«ENDIF»: «p.type.fullyQualifiedName»«p.array»«IF constructor == true»,«ELSE»;«ENDIF»
	'''
	
	def compileDtoConstructor(DtoProperty p)
	'''
		«IF p !== null»		this.«p.name» = «p.name»«ENDIF»;
	'''
	
	def dockerfileCompile()
	'''
		FROM registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3
		
		WORKDIR /app
		RUN mkdir /src
		
		COPY package.json .
		COPY tsconfig.json .
		RUN npm install
		COPY src/ /app/src
		
		EXPOSE 3000
		
		CMD ["npm","run", "start"]
		
	'''
	
	def ciCompile()
	'''
		stages:
		  - test
		  - quality
		  - build
		  - deploy
		  #- stress
		
		cache:
		  key: 'YOUR-KEY'
		  paths:
		  - node_modules/
		  
		test_job:
		  image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3
		  stage: test
		  script:
		     - npm install #--registry http://verdaccio.10.243.9.12.xip.io
		     - npm run test
		     - npm run test:e2e
		  retry: 2   
		
		quality_job:
		  image: registry.es.gov.br/espm/infraestrutura/containers/sonar-scanner:3.3.0.1492
		  stage: quality
		  dependencies:
		      - test_job    
		  script:
		   - npm install #--registry http://verdaccio.10.243.9.12.xip.io
		   - npm run test:cov
		   - sonar-scanner
		
		build_job:
		  stage: build
		  image: docker:stable
		
		  services:
		    - docker:dind
		  only:
		    - tags
		  script:
		    - docker login -u gitlab-ci-token -p $CI_BUILD_TOKEN $CI_REGISTRY
		    - docker build -t $CI_REGISTRY_IMAGE:$CI_BUILD_TAG .
		    - docker push $CI_REGISTRY_IMAGE:$CI_BUILD_TAG
		    - docker tag $CI_REGISTRY_IMAGE:$CI_BUILD_TAG $CI_REGISTRY_IMAGE:latest
		    - docker push $CI_REGISTRY_IMAGE:latest
		   
		deploy_job:
		  stage: deploy
		  image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3
		  
		  only:
		    - tags
		  script:
		    - npm i upgrade-rancher
		    - ./node_modules/.bin/upgrade-rancher --IMAGE $CI_REGISTRY_IMAGE:$CI_BUILD_TAG --SERVICE_ID RANCHER_SERVICE_ID
		  dependencies:
		    - build_job
		    
		#stress_job:
		#  stage: stress
		#  image: docker:stable
		#  dependencies:
		#    - deploy_job
		#  only:
		#    - tags
		#  services:
		#    - docker:dind
		#  script:
		#    - docker run -i --rm -v $(pwd)/stress:/bzt-configs -v $(pwd)/stress/artifacts:/tmp/artifacts blazemeter/taurus quick_test.yml 2>&1
		#  artifacts:
		#    paths:
		#      - $(pwd)/stress/artifacts
		#    expire_in: 2 week
		'''
		
		def sonarCompile()
		'''
			sonar.projectKey = YOUR KEY
			sonar.projectName = YOUR PROJECT NAME
			sonar.projectVersion = 3.0
			sonar.sources = src
			sonar.language = ts
			sonar.sourceEncoding = UTF-8
			sonar.typescript.lcov.reportPaths=coverage/lcov.info
			sonar.exclusions= **/__mocks__/**
			sonar.host.url = http://sonarqube.dcpr.es.gov.br
			sonar.login = YOUR SONAR LOGIN HASH
			
		'''
}
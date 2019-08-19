package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import prodest.es.gov.br.dsl.nestdsl.Entity
import java.util.List
import java.util.ArrayList

class HelpersGenerator extends AbstractGenerator {
 
	var List<String> modules;
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		modules = new ArrayList();
		
		for (e : resource.allContents.toIterable.filter(Entity)) {
			modules.add(e.name);
		}
		
		fsa.generateFile(
       		"src/main.ts",
    		mainCompile)
    	fsa.generateFile(
       		"src/app.module.ts",
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
    	fsa.generateFile(
       		"package.json",
    		packageCompile)
		fsa.generateFile(
       		" .env.example",
    		envCompile)
	}
	
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
		
		def packageCompile()
		'''
			{
			  "name": "your_application_name",
			  "version": "0.0.1",
			  "description": "",
			  "author": "",
			  "license": "MIT",
			  "scripts": {
			    "build": "rimraf dist && tsc -p tsconfig.build.json",
			    "format": "prettier --write \"src/**/*.ts\"",
			    "start": "ts-node -r tsconfig-paths/register src/main.ts",
			    "start:dev": "tsc-watch -p tsconfig.build.json --onSuccess \"node dist/main.js\"",
			    "start:debug": "tsc-watch -p tsconfig.build.json --onSuccess \"node --inspect-brk dist/main.js\"",
			    "start:prod": "node dist/main.js",
			    "lint": "tslint -p tsconfig.json -c tslint.json",
			    "test": "jest",
			    "test:watch": "jest --watch",
			    "test:cov": "jest --coverage",
			    "test:debug": "node --inspect-brk -r tsconfig-paths/register -r ts-node/register node_modules/.bin/jest --runInBand",
			    "test:e2e": "jest --config ./test/jest-e2e.json",
			    "classDiagram": "mmdc -i classDiagram.mmd -o classDiagram.png"
			  },
			  "dependencies": {
			    "@nestjs/common": "^6.0.0",
			    "@nestjs/core": "^6.0.0",
			    "@nestjs/platform-express": "^6.0.0",
			    "@nestjs/swagger": "^3.1.0",
			    "@types/dotenv": "^6.1.1",
			    "pg": "^7.11.0",
			    "reflect-metadata": "^0.1.12",
			    "rimraf": "^2.6.2",
			    "rxjs": "^6.3.3",
			    "swagger-ui-express": "^4.0.7",
			    "typeorm": "^0.2.18"
			  },
			  "devDependencies": {
			    "@nestjs/testing": "6.1.1",
			    "@types/express": "4.16.1",
			    "@types/jest": "24.0.11",
			    "@types/node": "11.13.4",
			    "@types/supertest": "2.0.7",
			    "jest": "24.7.1",
			    "prettier": "1.17.0",
			    "supertest": "4.0.2",
			    "ts-jest": "24.0.2",
			    "ts-node": "8.1.0",
			    "tsc-watch": "2.2.1",
			    "tsconfig-paths": "3.8.0",
			    "tslint": "5.16.0",
			    "typescript": "3.4.3"
			  },
			  "jest": {
			    "moduleFileExtensions": [
			      "js",
			      "json",
			      "ts"
			    ],
			    "rootDir": "src",
			    "testRegex": ".spec.ts$",
			    "transform": {
			      "^.+\\.(t|j)s$": "ts-jest"
			    },
			    "coverageDirectory": "../coverage",
			    "testEnvironment": "node"
			  }
			}
		'''
		def envCompile()
		'''
			HOST=localhost
			PORT=5432
			USER=admin
			PASSWORD=admin123
			SCHEMA=master
			ORM_SYNC=false
			
		'''
}
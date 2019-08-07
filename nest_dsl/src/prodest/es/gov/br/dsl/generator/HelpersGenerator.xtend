package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import prodest.es.gov.br.dsl.nestdsl.Entity
import java.util.List
import java.util.ArrayList

class HelpersGenerator extends AbstractGenerator {
 
	var List<String> modules = new ArrayList();
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (e : resource.allContents.toIterable.filter(Entity)) {
			modules.add(e.name);
		}
		
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
   
}
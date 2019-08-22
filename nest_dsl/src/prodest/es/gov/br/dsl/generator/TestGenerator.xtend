package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Entity
import prodest.es.gov.br.dsl.nestdsl.Property
import prodest.es.gov.br.dsl.nestdsl.Method
import prodest.es.gov.br.dsl.nestdsl.MethodArg
import java.util.List
import java.util.ArrayList

class TestGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                "test/"+e.fullyQualifiedName.toString("/").toLowerCase + ".e2e-spec.ts",
                e.e2eCompile)
               
            }
	}
	
	def e2eCompile(Entity e)
	'''
		import { Test, TestingModule } from '@nestjs/testing';
		import * as request from 'supertest';
		import { AppModule } from './../src/app.module';
		
		describe('AppController (e2e)', () => {
		  let app;
		
		  beforeEach(async () => {
		    const moduleFixture: TestingModule = await Test.createTestingModule({
		      imports: [AppModule],
		    }).compile();
		
		    app = moduleFixture.createNestApplication();
		    await app.init();
		  });
		
		  it('/«e.name.toLowerCase» (GET)', () => {
			throw('Not implemented yet !')
		  });
		
		  it('/«e.name.toLowerCase»/:id (GET)', () => {
			throw('Not implemented yet !')
		  });
		
		 it('/«e.name.toLowerCase» (POST)', () => {
			throw('Not implemented yet !')
		 });
		 
		 it('/«e.name.toLowerCase»/:id (PUT)', () => {
		 	throw('Not implemented yet !')
		 });
		 
		 it('/«e.name.toLowerCase»/:id (DELETE)', () => {
		 	throw('Not implemented yet !')
		 });
		 
		});
	'''
}
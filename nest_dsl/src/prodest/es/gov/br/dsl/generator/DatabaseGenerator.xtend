package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class DatabaseGenerator extends AbstractGenerator {
				
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		 fsa.generateFile(
           "Database/database.module.ts",
            moduleCompile)
        fsa.generateFile(
           "Database/database.providers.ts",
            providersCompile)
	}
	
	def moduleCompile()
	'''
		import { Module } from '@nestjs/common';
		import { databaseProviders } from './database.providers';
		
		@Module({
		  providers: [...databaseProviders],
		  exports: [...databaseProviders],
		})
		
		export class DatabaseModule {}
	'''
	
	def providersCompile()
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
   
}
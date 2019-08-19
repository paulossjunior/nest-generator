package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class DatabaseGenerator extends AbstractGenerator {
				
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		 fsa.generateFile(
           "src/Database/database.module.ts",
            moduleCompile)
        fsa.generateFile(
           "src/Database/database.providers.ts",
            providersCompile)
        fsa.generateFile(
           "src/common/configs/database.configs.ts",
            configDatabaseCompile)
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
		import { DatabaseConfig } from '../common/configs/database.configs'
		
		const config: DatabaseConfig = new DatabaseConfig();
		
		export const databaseProviders = [
		  {
		    provide: 'DATABASE_CONNECTION',
		    useFactory: async () => await createConnection({
		      type: config.type,
		      host: config.host,
		      port: config.port,
		      username: config.user,
		      password: config.password,
		      database: config.schema,
		      entities: [
		          __dirname + '/../**/*.entity{.ts,.js}',
		      ],
		      synchronize: config.sync,
		    }),
		  },
		];
	'''
   
   def configDatabaseCompile()
   '''
	   	import * as dotenv from 'dotenv';
	   	if ( process.env.NODE_ENV != 'production' ) {
	   	    dotenv.config();
	   	}
	   	const db_host = process.env.HOST;
	   	const db_port: number = Number( process.env.PORT );
	   	const db_username = process.env.USER;
	   	const db_password = process.env.PASSWORD;
	   	const db_schema = process.env.SCHEMA;
	   	const orm_sync: boolean = Boolean( process.env.ORM_SYNC == 'true' ) || false;
	   	
	   	export class DatabaseConfig {
	   	    constructor(
	   	        readonly type: 'postgres' = 'postgres',
	   	        readonly host: string = db_host,
	   	        readonly port: number = db_port,
	   	        readonly user: string = db_username,
	   	        readonly password = db_password,
	   	        readonly schema = db_schema,
	   	        readonly sync = orm_sync
	   	    ) { }
	   	}
   '''
}
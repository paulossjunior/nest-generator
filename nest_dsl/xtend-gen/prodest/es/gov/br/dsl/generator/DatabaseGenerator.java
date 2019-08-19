package prodest.es.gov.br.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class DatabaseGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(
      "src/Database/database.module.ts", 
      this.moduleCompile());
    fsa.generateFile(
      "src/Database/database.providers.ts", 
      this.providersCompile());
    fsa.generateFile(
      "src/common/configs/database.configs.ts", 
      this.configDatabaseCompile());
  }
  
  public CharSequence moduleCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Module } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import { databaseProviders } from \'./database.providers\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Module({");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("providers: [...databaseProviders],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("exports: [...databaseProviders],");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class DatabaseModule {}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence providersCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { createConnection } from \'typeorm\';");
    _builder.newLine();
    _builder.append("import { DatabaseConfig } from \'../common/configs/database.configs\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("const config: DatabaseConfig = new DatabaseConfig();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export const databaseProviders = [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("provide: \'DATABASE_CONNECTION\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("useFactory: async () => await createConnection({");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("type: config.type,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("host: config.host,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("port: config.port,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("username: config.user,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("password: config.password,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("database: config.schema,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("entities: [");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("__dirname + \'/../**/*.entity{.ts,.js}\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("synchronize: config.sync,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}),");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence configDatabaseCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import * as dotenv from \'dotenv\';");
    _builder.newLine();
    _builder.append("if ( process.env.NODE_ENV != \'production\' ) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("dotenv.config();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("const db_host = process.env.HOST;");
    _builder.newLine();
    _builder.append("const db_port: number = Number( process.env.PORT );");
    _builder.newLine();
    _builder.append("const db_username = process.env.USER;");
    _builder.newLine();
    _builder.append("const db_password = process.env.PASSWORD;");
    _builder.newLine();
    _builder.append("const db_schema = process.env.SCHEMA;");
    _builder.newLine();
    _builder.append("const orm_sync: boolean = Boolean( process.env.ORM_SYNC == \'true\' ) || false;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class DatabaseConfig {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("constructor(");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly type: \'postgres\' = \'postgres\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly host: string = db_host,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly port: number = db_port,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly user: string = db_username,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly password = db_password,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly schema = db_schema,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("readonly sync = orm_sync");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(") { }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

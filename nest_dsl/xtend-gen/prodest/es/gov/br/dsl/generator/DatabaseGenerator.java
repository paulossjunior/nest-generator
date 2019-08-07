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
      "Database/database.module.ts", 
      this.moduleCompile());
    fsa.generateFile(
      "Database/database.providers.ts", 
      this.providersCompile());
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
    _builder.append("type: \'postgres\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("host: \'localhost\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("port: 5432,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("username: \'postgres\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("password: \'senha\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("database: \'postgres\',");
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
    _builder.append("synchronize: true,");
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
}

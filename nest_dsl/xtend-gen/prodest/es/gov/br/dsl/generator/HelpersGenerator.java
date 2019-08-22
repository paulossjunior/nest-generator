package prodest.es.gov.br.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import prodest.es.gov.br.dsl.nestdsl.Dto;
import prodest.es.gov.br.dsl.nestdsl.Entity;

@SuppressWarnings("all")
public class HelpersGenerator extends AbstractGenerator {
  private List<String> entities;
  
  private List<String> dtos;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.entities = _arrayList;
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    this.dtos = _arrayList_1;
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      this.entities.add(e.getName());
    }
    Iterable<Dto> _filter_1 = Iterables.<Dto>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Dto.class);
    for (final Dto dto : _filter_1) {
      this.dtos.add(dto.getName());
    }
    fsa.generateFile(
      "src/main.ts", 
      this.mainCompile());
    fsa.generateFile(
      "src/app.module.ts", 
      this.appModuleCompile(this.entities));
    fsa.generateFile(
      "Dockerfile", 
      this.dockerfileCompile());
    fsa.generateFile(
      " .gitlab-ci.yml", 
      this.ciCompile());
    fsa.generateFile(
      "sonar-project.properties", 
      this.sonarCompile());
    fsa.generateFile(
      "package.json", 
      this.packageCompile());
    fsa.generateFile(
      " .env.example", 
      this.envCompile());
    fsa.generateFile(
      "docs/entitiesDescription.md", 
      this.mdCompiler(this.entities, this.dtos));
  }
  
  public CharSequence mainCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { NestFactory } from \'@nestjs/core\';");
    _builder.newLine();
    _builder.append("import { AppModule } from \'./app.module\';");
    _builder.newLine();
    _builder.append("import { SwaggerModule, DocumentBuilder } from \'@nestjs/swagger\';");
    _builder.newLine();
    _builder.append("const pacote = require( \'../package.json\' );");
    _builder.newLine();
    _builder.append("const fs = require( \'fs\' );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("async function bootstrap() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const app = await NestFactory.create(AppModule);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const options = new DocumentBuilder()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setTitle( pacote.name )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setDescription( pacote.description )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setVersion( pacote.version )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setSchemes( \'http\', \'https\' )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const document = SwaggerModule.createDocument( app, options );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fs.writeFileSync( \'swagger.json\', JSON.stringify( document, null, 2 ) );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SwaggerModule.setup( `/`, app, document );");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("await app.listen(3000);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("bootstrap();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence appModuleCompile(final List<String> modules) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Module } from \'@nestjs/common\';");
    _builder.newLine();
    {
      for(final String module : modules) {
        _builder.append("import { ");
        _builder.append(module);
        _builder.append("Module } from \'./");
        _builder.append(module);
        _builder.append("/");
        String _lowerCase = module.toLowerCase();
        _builder.append(_lowerCase);
        _builder.append(".module\';");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@Module({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("imports: [");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final String module_1 : modules) {
        _builder.append("\t\t");
        _builder.append(module_1, "\t");
        _builder.append("Module,");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("controllers: [],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("providers: [],");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class AppModule {}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence dockerfileCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("FROM registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.newLine();
    _builder.append("WORKDIR /app");
    _builder.newLine();
    _builder.append("RUN mkdir /src");
    _builder.newLine();
    _builder.newLine();
    _builder.append("COPY package.json .");
    _builder.newLine();
    _builder.append("COPY tsconfig.json .");
    _builder.newLine();
    _builder.append("RUN npm install");
    _builder.newLine();
    _builder.append("COPY src/ /app/src");
    _builder.newLine();
    _builder.newLine();
    _builder.append("EXPOSE 3000");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CMD [\"npm\",\"run\", \"start\"]");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ciCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("stages:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- test");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- quality");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- build");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- deploy");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("#- stress");
    _builder.newLine();
    _builder.newLine();
    _builder.append("cache:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("key: \'YOUR-KEY\'");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("paths:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- node_modules/");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("test_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: test");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm install #--registry http://verdaccio.10.243.9.12.xip.io");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm run test");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm run test:e2e");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("retry: 2   ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("quality_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/sonar-scanner:3.3.0.1492");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: quality");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("dependencies:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- test_job    ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- npm install #--registry http://verdaccio.10.243.9.12.xip.io");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- npm run test:cov");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- sonar-scanner");
    _builder.newLine();
    _builder.newLine();
    _builder.append("build_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: build");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: docker:stable");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("services:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker:dind");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("only:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- tags");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker login -u gitlab-ci-token -p $CI_BUILD_TOKEN $CI_REGISTRY");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker build -t $CI_REGISTRY_IMAGE:$CI_BUILD_TAG .");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker push $CI_REGISTRY_IMAGE:$CI_BUILD_TAG");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker tag $CI_REGISTRY_IMAGE:$CI_BUILD_TAG $CI_REGISTRY_IMAGE:latest");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker push $CI_REGISTRY_IMAGE:latest");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("deploy_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: deploy");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("only:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- tags");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- npm i upgrade-rancher");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- ./node_modules/.bin/upgrade-rancher --IMAGE $CI_REGISTRY_IMAGE:$CI_BUILD_TAG --SERVICE_ID RANCHER_SERVICE_ID");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("dependencies:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- build_job");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("#stress_job:");
    _builder.newLine();
    _builder.append("#  stage: stress");
    _builder.newLine();
    _builder.append("#  image: docker:stable");
    _builder.newLine();
    _builder.append("#  dependencies:");
    _builder.newLine();
    _builder.append("#    - deploy_job");
    _builder.newLine();
    _builder.append("#  only:");
    _builder.newLine();
    _builder.append("#    - tags");
    _builder.newLine();
    _builder.append("#  services:");
    _builder.newLine();
    _builder.append("#    - docker:dind");
    _builder.newLine();
    _builder.append("#  script:");
    _builder.newLine();
    _builder.append("#    - docker run -i --rm -v $(pwd)/stress:/bzt-configs -v $(pwd)/stress/artifacts:/tmp/artifacts blazemeter/taurus quick_test.yml 2>&1");
    _builder.newLine();
    _builder.append("#  artifacts:");
    _builder.newLine();
    _builder.append("#    paths:");
    _builder.newLine();
    _builder.append("#      - $(pwd)/stress/artifacts");
    _builder.newLine();
    _builder.append("#    expire_in: 2 week");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence sonarCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sonar.projectKey = YOUR KEY");
    _builder.newLine();
    _builder.append("sonar.projectName = YOUR PROJECT NAME");
    _builder.newLine();
    _builder.append("sonar.projectVersion = 3.0");
    _builder.newLine();
    _builder.append("sonar.sources = src");
    _builder.newLine();
    _builder.append("sonar.language = ts");
    _builder.newLine();
    _builder.append("sonar.sourceEncoding = UTF-8");
    _builder.newLine();
    _builder.append("sonar.typescript.lcov.reportPaths=coverage/lcov.info");
    _builder.newLine();
    _builder.append("sonar.exclusions= **/__mocks__/**");
    _builder.newLine();
    _builder.append("sonar.host.url = http://sonarqube.dcpr.es.gov.br");
    _builder.newLine();
    _builder.append("sonar.login = YOUR SONAR LOGIN HASH");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence packageCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"name\": \"your_application_name\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"version\": \"0.0.1\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"description\": \"\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"author\": \"\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"license\": \"MIT\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"scripts\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"build\": \"rimraf dist && tsc -p tsconfig.build.json\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"format\": \"prettier --write \\\"src/**/*.ts\\\"\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"start\": \"ts-node -r tsconfig-paths/register src/main.ts\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"start:dev\": \"tsc-watch -p tsconfig.build.json --onSuccess \\\"node dist/main.js\\\"\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"start:debug\": \"tsc-watch -p tsconfig.build.json --onSuccess \\\"node --inspect-brk dist/main.js\\\"\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"start:prod\": \"node dist/main.js\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"lint\": \"tslint -p tsconfig.json -c tslint.json\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"test\": \"jest\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"test:watch\": \"jest --watch\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"test:cov\": \"jest --coverage\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"test:debug\": \"node --inspect-brk -r tsconfig-paths/register -r ts-node/register node_modules/.bin/jest --runInBand\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"test:e2e\": \"jest --config ./test/jest-e2e.json\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"generate:classDiagram\": \"mmdc -i classDiagram.mmd -o ./docs/classDiagram.png\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"generate:archDiagram\": \"mmdc -i archDiagram.mmd -o ./docs/archDiagram.png\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"dependencies\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@nestjs/common\": \"^6.0.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@nestjs/core\": \"^6.0.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@nestjs/platform-express\": \"^6.0.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@nestjs/swagger\": \"^3.1.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@types/dotenv\": \"^6.1.1\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"pg\": \"^7.11.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"reflect-metadata\": \"^0.1.12\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"rimraf\": \"^2.6.2\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"rxjs\": \"^6.3.3\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"swagger-ui-express\": \"^4.0.7\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"typeorm\": \"^0.2.18\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"devDependencies\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@nestjs/testing\": \"6.1.1\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@types/express\": \"4.16.1\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@types/jest\": \"24.0.11\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@types/node\": \"11.13.4\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"@types/supertest\": \"2.0.7\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"jest\": \"24.7.1\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"prettier\": \"1.17.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"supertest\": \"4.0.2\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"ts-jest\": \"24.0.2\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"ts-node\": \"8.1.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"tsc-watch\": \"2.2.1\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"tsconfig-paths\": \"3.8.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"tslint\": \"5.16.0\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"typescript\": \"3.4.3\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"jest\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"moduleFileExtensions\": [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"js\",");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"json\",");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"ts\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"rootDir\": \"src\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"testRegex\": \".spec.ts$\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"transform\": {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"^.+\\\\.(t|j)s$\": \"ts-jest\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"coverageDirectory\": \"../coverage\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"testEnvironment\": \"node\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence envCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("HOST=localhost");
    _builder.newLine();
    _builder.append("PORT=5432");
    _builder.newLine();
    _builder.append("USER=admin");
    _builder.newLine();
    _builder.append("PASSWORD=admin123");
    _builder.newLine();
    _builder.append("SCHEMA=master");
    _builder.newLine();
    _builder.append("ORM_SYNC=false");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mdCompiler(final List<String> entities, final List<String> dtos) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = entities.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("###Entidades");
        _builder.newLine();
        _builder.newLine();
        _builder.append("Entidade  | Descricao");
        _builder.newLine();
        _builder.append(":-------------: | :-------------:");
        _builder.newLine();
        {
          for(final String e : entities) {
            _builder.append(e);
            _builder.append(" | Preencha este campo");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      int _size_1 = dtos.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.newLine();
        _builder.newLine();
        _builder.append("###DTOs");
        _builder.newLine();
        _builder.newLine();
        _builder.append("Entidade  | Descricao");
        _builder.newLine();
        _builder.append(":-------------: | :-------------:");
        _builder.newLine();
        {
          for(final String dto : dtos) {
            _builder.append(dto);
            _builder.append(" | Preencha este campo");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("###Diagrama de classe");
        _builder.newLine();
        _builder.append("![classDiagram](./classDiagram.png)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("###Arquitetura generica");
        _builder.newLine();
        _builder.append("![archDiagram](./archDiagram.png)");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}

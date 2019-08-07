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
import prodest.es.gov.br.dsl.nestdsl.Entity;

@SuppressWarnings("all")
public class HelpersGenerator extends AbstractGenerator {
  private List<String> modules = new ArrayList<String>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      this.modules.add(e.getName());
    }
    fsa.generateFile(
      "main.ts", 
      this.mainCompile());
    fsa.generateFile(
      "app.module.ts", 
      this.appModuleCompile(this.modules));
    fsa.generateFile(
      "Dockerfile", 
      this.dockerfileCompile());
    fsa.generateFile(
      " .gitlab-ci.yml", 
      this.ciCompile());
    fsa.generateFile(
      "sonar-project.properties", 
      this.sonarCompile());
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
}

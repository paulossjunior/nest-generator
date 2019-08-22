package prodest.es.gov.br.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import prodest.es.gov.br.dsl.nestdsl.Entity;

@SuppressWarnings("all")
public class TestGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      String _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
      String _plus = ("test/" + _lowerCase);
      String _plus_1 = (_plus + ".e2e-spec.ts");
      fsa.generateFile(_plus_1, 
        this.e2eCompile(e));
    }
  }
  
  public CharSequence e2eCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Test, TestingModule } from \'@nestjs/testing\';");
    _builder.newLine();
    _builder.append("import * as request from \'supertest\';");
    _builder.newLine();
    _builder.append("import { AppModule } from \'./../src/app.module\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe(\'AppController (e2e)\', () => {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("let app;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("beforeEach(async () => {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const moduleFixture: TestingModule = await Test.createTestingModule({");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("imports: [AppModule],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}).compile();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("app = moduleFixture.createNestApplication();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("await app.init();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it(\'/");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "  ");
    _builder.append(" (GET)\', () => {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("throw(\'Not implemented yet !\')");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it(\'/");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "  ");
    _builder.append("/:id (GET)\', () => {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("throw(\'Not implemented yet !\')");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("it(\'/");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, " ");
    _builder.append(" (POST)\', () => {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("throw(\'Not implemented yet !\')");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("});");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("it(\'/");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3, " ");
    _builder.append("/:id (PUT)\', () => {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("throw(\'Not implemented yet !\')");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("});");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("it(\'/");
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, " ");
    _builder.append("/:id (DELETE)\', () => {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("throw(\'Not implemented yet !\')");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("});");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
}

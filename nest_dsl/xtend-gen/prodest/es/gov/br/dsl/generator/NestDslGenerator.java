package prodest.es.gov.br.dsl.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import prodest.es.gov.br.dsl.generator.ClassDiagramGenerator;
import prodest.es.gov.br.dsl.generator.CoreGenerator;
import prodest.es.gov.br.dsl.generator.DatabaseGenerator;
import prodest.es.gov.br.dsl.generator.DtoGenerator;
import prodest.es.gov.br.dsl.generator.HelpersGenerator;

@SuppressWarnings("all")
public class NestDslGenerator extends AbstractGenerator {
  @Inject
  private CoreGenerator coreGenerator;
  
  @Inject
  private HelpersGenerator helperGenerator;
  
  @Inject
  private DtoGenerator dtoGenerator;
  
  @Inject
  private DatabaseGenerator dbGenerator;
  
  @Inject
  private ClassDiagramGenerator classDiagramGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.coreGenerator.doGenerate(resource, fsa, context);
    this.helperGenerator.doGenerate(resource, fsa, context);
    this.dtoGenerator.doGenerate(resource, fsa, context);
    this.dbGenerator.doGenerate(resource, fsa, context);
    this.classDiagramGenerator.doGenerate(resource, fsa, context);
  }
}

package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject

class NestDslGenerator extends AbstractGenerator {
 
    @Inject CoreGenerator coreGenerator
    @Inject HelpersGenerator helperGenerator
    @Inject DtoGenerator dtoGenerator
    @Inject DatabaseGenerator dbGenerator
    @Inject ClassDiagramGenerator classDiagramGenerator
    @Inject GenericCoreGenerator genericCoreGenerator
 	
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        coreGenerator.doGenerate(resource, fsa, context);
     	helperGenerator.doGenerate(resource, fsa, context);
     	dtoGenerator.doGenerate(resource, fsa, context);
     	dbGenerator.doGenerate(resource, fsa, context);
     	classDiagramGenerator.doGenerate(resource, fsa, context);
     	genericCoreGenerator.doGenerate(resource, fsa, context);
    }
	
}
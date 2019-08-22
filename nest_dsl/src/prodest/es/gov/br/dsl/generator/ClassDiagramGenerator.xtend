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

class ClassDiagramGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
            "install.sh",
            mermaidInstaller)
        fsa.generateFile(
            "classDiagram.mmd",
            classDiagramCompiler(resource))
        fsa.generateFile(
            "archDiagram.mmd",
            archDiagram())
	}
	
	def mermaidInstaller()
	'''
		npm i && npm i -g mermaid.cli
	'''
	
	def classDiagramCompiler(Resource resource)
	'''
		classDiagram
		«FOR e : resource.allContents.toIterable.filter(Entity)»
			«FOR p: e.properties»«relationCompile(e, p)»«ENDFOR»
			«FOR p: e.properties»«propertyCompile(e, p)»«ENDFOR»
			«methodCompile(e)»
		«ENDFOR»
	'''
   
   def relationCompile(Entity e, Property p)
   '''
	«IF p.relation !== null»
		«IF p.relation.oneArgument !== null»
			«e.name» --> «p.relation.oneArgument.type.name»: «p.relation.oneArgument.argument»
		«ELSEIF p.relation.multipleArgument !== null»
			«e.name» --> «p.relation.multipleArgument.type.name»: «p.relation.multipleArgument.argument»
		«ENDIF»
	«ENDIF»
   '''
   
   def propertyCompile(Entity e, Property p)
   '''
	«IF p.classType !== null»
		«e.name»: «p.classType.fullyQualifiedName»«p.array» «p.name»
	«ELSE»
		«e.name»: «p.type»«p.array» «p.name»
	«ENDIF»
   '''
   
   def methodCompile(Entity e)
   '''
   	«FOR method: e.methods»
   		«var newArgs = generateArgList(method)»
   		«e.name»: «IF method.returnClassType !== null»«method.returnClassType.fullyQualifiedName»«ELSE»«method.returnType»«ENDIF» «method.name»(«FOR arg: newArgs»«arg»«ENDFOR»)
   	«ENDFOR»
   '''
   
   def generateArgList(Method m){
		var List<String> newArgs = new ArrayList();
		
		for(var i = 0; i < m.args.size(); i++){
			newArgs.add(m.args.get(i).compile)
			if(i+1 < m.args.size()){
				newArgs.add(', ')
			}	
		}
		
		return newArgs;
	}
	
	def compile(MethodArg arg){
		var response = arg.name + ': '
		if(arg.classType !== null){
			if(arg.array !== null)
				response += arg.classType.fullyQualifiedName+arg.array
			response += arg.classType.fullyQualifiedName
		}
		else{			
			if(arg.array !== null)
				response += arg.type+arg.array
			response += arg.type
		}
		return response
	}
	
	def archDiagram()
	'''
		classDiagram
		BaseController *-- BaseService
		BaseService --> IBase : implements
		IBase: T[] findAll()
		IBase: T findOne(id: number)
		IBase: void createOne(object: T)
		IBase: void updateOne(id: number, object: T)
		IBase: void deleteOne(id: number)
		
	'''
}
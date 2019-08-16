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

class ClassDiagramGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
                "install.sh",
                mermaidInstaller)
        fsa.generateFile(
                "classDiagram.mmd",
                classDiagramCompiler(resource))
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
			«FOR m: e.methods»«methodCompile(e, m)»«ENDFOR»
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
	«e.name»: «p.type.fullyQualifiedName»«p.array» «p.name»
   '''
   
   def methodCompile(Entity e, Method m)
   '''
   	«e.name»: «m.returnType.fullyQualifiedName» «m.name»(«IF m.args.size()>0»«m.args.get(0).compile»«ENDIF»)
   '''
   
   def compile(MethodArg arg)
   '''«arg.type.fullyQualifiedName»«arg.array» «arg.name»'''
}
package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import prodest.es.gov.br.dsl.nestdsl.Dto
import prodest.es.gov.br.dsl.nestdsl.DtoProperty

class DtoGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
				
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (dto : resource.allContents.toIterable.filter(Dto)) {
 				fsa.generateFile(
            		'src/DTOs/'+dto.fullyQualifiedName.toString("/").toLowerCase + ".dto.ts",
            		dto.compile)
 		}
	}
	
	def compile(Dto dto)
	'''
		«FOR p : dto.properties»
			«IF p.classType !== null»«IF p.classType.eClass.name.equals('Dto')»import { «p.classType.fullyQualifiedName» } from './«p.classType.fullyQualifiedName.toLowerCase».dto'«ENDIF»«ENDIF»
		«ENDFOR»
		
		export class «dto.name»Dto «IF dto.superType !== null
		»extends «dto.superType.fullyQualifiedName» «ENDIF» {
			constructor(
	    «FOR p : dto.properties»
			«compileProperty(p, true)»
		«ENDFOR»
			) {
		«FOR p : dto.properties»
			«compileConstructor(p)»
		«ENDFOR»
			}
		«FOR p : dto.properties»
			«compileProperty(p, false)»
		«ENDFOR»
		}
	'''
	
	def compileProperty(DtoProperty p, Boolean readonly)
	'''
		«IF readonly == false»	readonly «p.name»«ELSE»		«p.name»«ENDIF»: «IF p.classType !== null»«p.classType.fullyQualifiedName»«ELSE»«p.type»«ENDIF»«p.array»«IF readonly == true»,«ELSE»;«ENDIF»
	'''
	
	def compileConstructor(DtoProperty p)
	'''
		«IF p !== null»		this.«p.name» = «p.name»«ENDIF»;
	'''
}
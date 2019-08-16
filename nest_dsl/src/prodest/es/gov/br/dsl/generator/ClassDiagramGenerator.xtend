package prodest.es.gov.br.dsl.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class ClassDiagramGenerator extends AbstractGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
                "mermaidInstaller.sh",
                mermaidInstaller)
        fsa.generateFile(
                "classDiagram.mmd",
                classDiagramCompiler)
	}
	
	def mermaidInstaller()
	'''
		npm i -g mermaid.cli
	'''
	
	def classDiagramCompiler()
	'''
		classDiagram
		Class01 <|-- AveryLongClass : Cool
		Class03 *-- Class04
		Class05 o-- Class06
		Class07 .. Class08
		Class09 --> C2 : Where am i?
		Class09 --* C3
		Class09 --|> Class07
		Class07 : equals()
		Class07 : Object[] elementData
		Class01 : size()
		Class01 : int chimp
		Class01 : int gorilla
		Class08 <--> C2: Cool label
	'''
   
}
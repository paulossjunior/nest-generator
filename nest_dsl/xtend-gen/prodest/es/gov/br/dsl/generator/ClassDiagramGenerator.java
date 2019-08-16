package prodest.es.gov.br.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class ClassDiagramGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(
      "mermaidInstaller.sh", 
      this.mermaidInstaller());
    fsa.generateFile(
      "classDiagram.mmd", 
      this.classDiagramCompiler());
  }
  
  public CharSequence mermaidInstaller() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("npm i -g mermaid.cli");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence classDiagramCompiler() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("classDiagram");
    _builder.newLine();
    _builder.append("Class01 <|-- AveryLongClass : Cool");
    _builder.newLine();
    _builder.append("Class03 *-- Class04");
    _builder.newLine();
    _builder.append("Class05 o-- Class06");
    _builder.newLine();
    _builder.append("Class07 .. Class08");
    _builder.newLine();
    _builder.append("Class09 --> C2 : Where am i?");
    _builder.newLine();
    _builder.append("Class09 --* C3");
    _builder.newLine();
    _builder.append("Class09 --|> Class07");
    _builder.newLine();
    _builder.append("Class07 : equals()");
    _builder.newLine();
    _builder.append("Class07 : Object[] elementData");
    _builder.newLine();
    _builder.append("Class01 : size()");
    _builder.newLine();
    _builder.append("Class01 : int chimp");
    _builder.newLine();
    _builder.append("Class01 : int gorilla");
    _builder.newLine();
    _builder.append("Class08 <--> C2: Cool label");
    _builder.newLine();
    return _builder;
  }
}

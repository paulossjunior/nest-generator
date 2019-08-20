package prodest.es.gov.br.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.Method;
import prodest.es.gov.br.dsl.nestdsl.MethodArg;
import prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.Property;
import prodest.es.gov.br.dsl.nestdsl.Relation;

@SuppressWarnings("all")
public class ClassDiagramGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(
      "install.sh", 
      this.mermaidInstaller());
    fsa.generateFile(
      "classDiagram.mmd", 
      this.classDiagramCompiler(resource));
  }
  
  public CharSequence mermaidInstaller() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("npm i && npm i -g mermaid.cli");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence classDiagramCompiler(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("classDiagram");
    _builder.newLine();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        {
          EList<Property> _properties = e.getProperties();
          for(final Property p : _properties) {
            CharSequence _relationCompile = this.relationCompile(e, p);
            _builder.append(_relationCompile);
          }
        }
        _builder.newLineIfNotEmpty();
        {
          EList<Property> _properties_1 = e.getProperties();
          for(final Property p_1 : _properties_1) {
            CharSequence _propertyCompile = this.propertyCompile(e, p_1);
            _builder.append(_propertyCompile);
          }
        }
        _builder.newLineIfNotEmpty();
        CharSequence _methodCompile = this.methodCompile(e);
        _builder.append(_methodCompile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence relationCompile(final Entity e, final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Relation _relation = p.getRelation();
      boolean _tripleNotEquals = (_relation != null);
      if (_tripleNotEquals) {
        {
          OneArgumentRelation _oneArgument = p.getRelation().getOneArgument();
          boolean _tripleNotEquals_1 = (_oneArgument != null);
          if (_tripleNotEquals_1) {
            String _name = e.getName();
            _builder.append(_name);
            _builder.append(" --> ");
            String _name_1 = p.getRelation().getOneArgument().getType().getName();
            _builder.append(_name_1);
            _builder.append(": ");
            String _argument = p.getRelation().getOneArgument().getArgument();
            _builder.append(_argument);
            _builder.newLineIfNotEmpty();
          } else {
            MultipleArgumentRelation _multipleArgument = p.getRelation().getMultipleArgument();
            boolean _tripleNotEquals_2 = (_multipleArgument != null);
            if (_tripleNotEquals_2) {
              String _name_2 = e.getName();
              _builder.append(_name_2);
              _builder.append(" --> ");
              String _name_3 = p.getRelation().getMultipleArgument().getType().getName();
              _builder.append(_name_3);
              _builder.append(": ");
              String _argument_1 = p.getRelation().getMultipleArgument().getArgument();
              _builder.append(_argument_1);
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence propertyCompile(final Entity e, final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _classType = p.getClassType();
      boolean _tripleNotEquals = (_classType != null);
      if (_tripleNotEquals) {
        String _name = e.getName();
        _builder.append(_name);
        _builder.append(": ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getClassType());
        _builder.append(_fullyQualifiedName);
        String _array = p.getArray();
        _builder.append(_array);
        _builder.append(" ");
        String _name_1 = p.getName();
        _builder.append(_name_1);
        _builder.newLineIfNotEmpty();
      } else {
        String _name_2 = e.getName();
        _builder.append(_name_2);
        _builder.append(": ");
        String _type = p.getType();
        _builder.append(_type);
        String _array_1 = p.getArray();
        _builder.append(_array_1);
        _builder.append(" ");
        String _name_3 = p.getName();
        _builder.append(_name_3);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence methodCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Method> _methods = e.getMethods();
      for(final Method method : _methods) {
        List<String> newArgs = this.generateArgList(method);
        _builder.newLineIfNotEmpty();
        String _name = e.getName();
        _builder.append(_name);
        _builder.append(": ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(method.getReturnType());
        _builder.append(_fullyQualifiedName);
        _builder.append(" ");
        String _name_1 = method.getName();
        _builder.append(_name_1);
        _builder.append("(");
        {
          for(final String arg : newArgs) {
            _builder.append(arg);
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public List<String> generateArgList(final Method m) {
    List<String> newArgs = new ArrayList<String>();
    for (int i = 0; (i < m.getArgs().size()); i++) {
      {
        newArgs.add(this.compile(m.getArgs().get(i)));
        int _size = m.getArgs().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          newArgs.add(", ");
        }
      }
    }
    return newArgs;
  }
  
  public String compile(final MethodArg arg) {
    String _array = arg.getArray();
    boolean _tripleNotEquals = (_array != null);
    if (_tripleNotEquals) {
      String _name = arg.getName();
      String _plus = (_name + ": ");
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(arg.getType());
      String _plus_1 = (_plus + _fullyQualifiedName);
      String _array_1 = arg.getArray();
      return (_plus_1 + _array_1);
    }
    String _name_1 = arg.getName();
    String _plus_2 = (_name_1 + ": ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(arg.getType());
    return (_plus_2 + _fullyQualifiedName_1);
  }
}

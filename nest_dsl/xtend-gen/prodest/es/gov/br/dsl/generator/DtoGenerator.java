package prodest.es.gov.br.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
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
import prodest.es.gov.br.dsl.nestdsl.Dto;
import prodest.es.gov.br.dsl.nestdsl.DtoProperty;

@SuppressWarnings("all")
public class DtoGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Dto> _filter = Iterables.<Dto>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Dto.class);
    for (final Dto dto : _filter) {
      String _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(dto).toString("/").toLowerCase();
      String _plus = ("DTOs/" + _lowerCase);
      String _plus_1 = (_plus + ".dto.ts");
      fsa.generateFile(_plus_1, 
        this.compile(dto));
    }
  }
  
  public CharSequence compile(final Dto dto) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DtoProperty> _properties = dto.getProperties();
      for(final DtoProperty p : _properties) {
        {
          boolean _equals = p.getType().eClass().getName().equals("Dto");
          if (_equals) {
            _builder.append("import { ");
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType());
            _builder.append(_fullyQualifiedName);
            _builder.append(" } from \'./");
            QualifiedName _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType()).toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(".dto\'");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("export class ");
    String _name = dto.getName();
    _builder.append(_name);
    _builder.append("Dto ");
    {
      Dto _superType = dto.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append("extends ");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(dto.getSuperType());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(" ");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("constructor(");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_1 = dto.getProperties();
      for(final DtoProperty p_1 : _properties_1) {
        CharSequence _compileProperty = this.compileProperty(p_1, Boolean.valueOf(true));
        _builder.append(_compileProperty);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append(") {");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_2 = dto.getProperties();
      for(final DtoProperty p_2 : _properties_2) {
        CharSequence _compileConstructor = this.compileConstructor(p_2);
        _builder.append(_compileConstructor);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_3 = dto.getProperties();
      for(final DtoProperty p_3 : _properties_3) {
        CharSequence _compileProperty_1 = this.compileProperty(p_3, Boolean.valueOf(false));
        _builder.append(_compileProperty_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileProperty(final DtoProperty p, final Boolean readonly) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((readonly).booleanValue() == false)) {
        _builder.append("\treadonly ");
        String _name = p.getName();
        _builder.append(_name);
      } else {
        _builder.append("\t\t");
        String _name_1 = p.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(": ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType());
    _builder.append(_fullyQualifiedName);
    String _array = p.getArray();
    _builder.append(_array);
    {
      if (((readonly).booleanValue() == true)) {
        _builder.append(",");
      } else {
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileConstructor(final DtoProperty p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((p != null)) {
        _builder.append("\t\tthis.");
        String _name = p.getName();
        _builder.append(_name);
        _builder.append(" = ");
        String _name_1 = p.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

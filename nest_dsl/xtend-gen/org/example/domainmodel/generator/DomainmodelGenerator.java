package org.example.domainmodel.generator;

import com.google.common.base.Objects;
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
import org.example.domainmodel.domainmodel.Entity;
import org.example.domainmodel.domainmodel.Property;

@SuppressWarnings("all")
public class DomainmodelGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
      String _plus = (_string + ".entity.ts");
      fsa.generateFile(_plus, 
        this.compile(e));
    }
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import {Entity, PrimaryGeneratedColumn, Column} from \"typeorm\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("@Entity()");
    _builder.newLine();
    _builder.append("export class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append("extends ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties = e.getProperties();
      for(final Property f : _properties) {
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "     ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Property f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((Objects.equal(f.getName(), "id") || Objects.equal(f.getName(), "ID"))) {
        _builder.append("@PrimaryGeneratedColumn()");
        _builder.newLine();
      } else {
        _builder.append("@Column()");
        _builder.newLine();
      }
    }
    String _name = f.getName();
    _builder.append(_name);
    _builder.append(": ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(f.getType());
    _builder.append(_fullyQualifiedName);
    String _array = f.getArray();
    _builder.append(_array);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

package prodest.es.gov.br.dsl.generator;

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
import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.Property;
import prodest.es.gov.br.dsl.nestdsl.Relation;

@SuppressWarnings("all")
public class NestDslGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
        String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
        String _plus = (_string + ".entity.ts");
        fsa.generateFile(_plus, 
          this.compile(e));
        String _string_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
        String _plus_1 = (_string_1 + ".controller.ts");
        fsa.generateFile(_plus_1, 
          this.compileController(e));
      }
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
      for(final Property p : _properties) {
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        CharSequence _compile = this.compile(p);
        _builder.append(_compile, "     ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((Objects.equal(p.getName(), "id") || Objects.equal(p.getName(), "ID"))) {
        _builder.append("@PrimaryGeneratedColumn()");
        _builder.newLine();
      } else {
        {
          Relation _relation = p.getRelation();
          boolean _tripleNotEquals = (_relation != null);
          if (_tripleNotEquals) {
            {
              OneArgumentRelation _oneArgument = p.getRelation().getOneArgument();
              boolean _tripleNotEquals_1 = (_oneArgument != null);
              if (_tripleNotEquals_1) {
                String oneArgument = p.getRelation().getOneArgument().getArgument();
                _builder.newLineIfNotEmpty();
                _builder.append("@");
                _builder.append(oneArgument);
                _builder.append("(type => ");
                String _name = p.getRelation().getOneArgument().getType().getName();
                _builder.append(_name);
                _builder.append(")");
                _builder.newLineIfNotEmpty();
                {
                  boolean _equals = Objects.equal(oneArgument, "OneToOne");
                  if (_equals) {
                    _builder.append("@JoinColumn()");
                    _builder.newLine();
                  } else {
                    boolean _equals_1 = Objects.equal(oneArgument, "ManyToMany");
                    if (_equals_1) {
                      _builder.append("@JoinTable()");
                      _builder.newLine();
                    }
                  }
                }
              } else {
                MultipleArgumentRelation _multipleArgument = p.getRelation().getMultipleArgument();
                boolean _tripleNotEquals_2 = (_multipleArgument != null);
                if (_tripleNotEquals_2) {
                  String secondArgument = p.getRelation().getMultipleArgument().getSecondArgument();
                  _builder.newLineIfNotEmpty();
                  _builder.newLine();
                  _builder.append("@");
                  String _argument = p.getRelation().getMultipleArgument().getArgument();
                  _builder.append(_argument);
                  _builder.append("(type => ");
                  String _name_1 = p.getRelation().getMultipleArgument().getType().getName();
                  _builder.append(_name_1);
                  _builder.append(", ");
                  _builder.append(secondArgument);
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          } else {
            _builder.append("@Column()");
            _builder.newLine();
          }
        }
      }
    }
    String _name_2 = p.getName();
    _builder.append(_name_2);
    _builder.append(": ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType());
    _builder.append(_fullyQualifiedName);
    String _array = p.getArray();
    _builder.append(_array);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileController(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Controller, Get, Req } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("@Controller(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

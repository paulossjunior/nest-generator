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
    _builder.append("import { Entity, Column, PrimaryGeneratedColumn, JoinColumn, JoinTable, OneToOne, OneToMany, ManyToMany, ManyToOne } from \'typeorm\';");
    _builder.newLine();
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
    _builder.append("\t\t            \t");
    _builder.newLine();
    {
      EList<Property> _properties = e.getProperties();
      for(final Property p : _properties) {
        CharSequence _compile = this.compile(p);
        _builder.append(_compile);
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
                _builder.append("\t");
                _builder.append("@");
                _builder.append(oneArgument, "\t");
                _builder.append("(type => ");
                String _name = p.getRelation().getOneArgument().getType().getName();
                _builder.append(_name, "\t");
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
                  _builder.append("\t");
                  _builder.append("@");
                  String _argument = p.getRelation().getMultipleArgument().getArgument();
                  _builder.append(_argument, "\t");
                  _builder.append("(type => ");
                  String _name_1 = p.getRelation().getMultipleArgument().getType().getName();
                  _builder.append(_name_1, "\t");
                  _builder.append(", ");
                  _builder.append(secondArgument, "\t");
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
    _builder.append("\t");
    String _name_2 = p.getName();
    _builder.append(_name_2, "\t");
    _builder.append(": ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType());
    _builder.append(_fullyQualifiedName, "\t");
    String _array = p.getArray();
    _builder.append(_array, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileController(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Controller, Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import{ ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("Service } from \'./");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".service\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Controller(\'");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("export class ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Controller{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("constructor(");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private readonly service: ");
    String _name_2 = e.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("Service,");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("){}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Get()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async findAll(@Res() res): Promise<");
    String _name_3 = e.getName();
    _builder.append(_name_3, "\t");
    _builder.append("[]> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send(await this.service.findAll());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.BAD_GATEWAY)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error.message, HttpStatus.BAD_GATEWAY})");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Get(/:id)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async findOne(@Res() res, @Param(\'id\') id): Promise<");
    String _name_4 = e.getName();
    _builder.append(_name_4, "\t");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send(await this.service.findOne(id));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.BAD_GATEWAY)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error.message, HttpStatus.BAD_GATEWAY})");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Post()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async createOne(@Res() res, @Body() ");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, "\t");
    _builder.append(": ");
    String _name_5 = e.getName();
    _builder.append(_name_5, "\t");
    _builder.append("): Promise<void> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send(await this.service.createOne(");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3, "\t\t\t ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.BAD_GATEWAY)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error.message, HttpStatus.BAD_GATEWAY})");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Put(/:id)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async updateOne(@Res() res, @Param(\'id\') id, @Body() ");
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, "\t");
    _builder.append(": ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "\t");
    _builder.append("): Promise<void> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _lowerCase_5 = e.getName().toLowerCase();
    _builder.append(_lowerCase_5, "\t\t\t");
    _builder.append(".id = Number(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send(await this.service.updateOne(");
    String _lowerCase_6 = e.getName().toLowerCase();
    _builder.append(_lowerCase_6, "\t\t\t ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.BAD_GATEWAY)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error.message, HttpStatus.BAD_GATEWAY})");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Delete(/:id)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async deleteOne(@Res() res, @Param(\'id\') id){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send(await this.service.deleteOne(id));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(HttpStatus.BAD_GATEWAY)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error.message, HttpStatus.BAD_GATEWAY})");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

package prodest.es.gov.br.dsl.generator;

import com.google.common.base.Objects;
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
import prodest.es.gov.br.dsl.nestdsl.AbstractElement;
import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.Method;
import prodest.es.gov.br.dsl.nestdsl.MethodArg;
import prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.Property;
import prodest.es.gov.br.dsl.nestdsl.Relation;

@SuppressWarnings("all")
public class CoreGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
        String _name = e.getName();
        String _plus = ("src/" + _name);
        String _plus_1 = (_plus + "/");
        String _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_2 = (_plus_1 + _lowerCase);
        String _plus_3 = (_plus_2 + ".entity.ts");
        fsa.generateFile(_plus_3, 
          this.compile(e));
        String _name_1 = e.getName();
        String _plus_4 = ("src/" + _name_1);
        String _plus_5 = (_plus_4 + "/");
        String _lowerCase_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase_1);
        String _plus_7 = (_plus_6 + ".controller.ts");
        fsa.generateFile(_plus_7, 
          this.controllerCompile(e));
        String _name_2 = e.getName();
        String _plus_8 = ("src/" + _name_2);
        String _plus_9 = (_plus_8 + "/");
        String _lowerCase_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_2);
        String _plus_11 = (_plus_10 + ".service.ts");
        fsa.generateFile(_plus_11, 
          this.serviceCompile(e));
        String _name_3 = e.getName();
        String _plus_12 = ("src/" + _name_3);
        String _plus_13 = (_plus_12 + "/");
        String _lowerCase_3 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_14 = (_plus_13 + _lowerCase_3);
        String _plus_15 = (_plus_14 + ".providers.ts");
        fsa.generateFile(_plus_15, 
          this.providersCompile(e));
        String _name_4 = e.getName();
        String _plus_16 = ("src/" + _name_4);
        String _plus_17 = (_plus_16 + "/");
        String _lowerCase_4 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_18 = (_plus_17 + _lowerCase_4);
        String _plus_19 = (_plus_18 + ".module.ts");
        fsa.generateFile(_plus_19, 
          this.moduleCompile(e));
      }
    }
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Entity, Column, PrimaryGeneratedColumn, JoinColumn, JoinTable, OneToOne, OneToMany, ManyToMany, ManyToOne } from \'typeorm\';");
    _builder.newLine();
    _builder.append("import { ApiModelProperty } from \'@nestjs/swagger\';");
    _builder.newLine();
    {
      EList<Property> _properties = e.getProperties();
      for(final Property p : _properties) {
        {
          Relation _relation = p.getRelation();
          boolean _tripleNotEquals = (_relation != null);
          if (_tripleNotEquals) {
            {
              OneArgumentRelation _oneArgument = p.getRelation().getOneArgument();
              boolean _tripleNotEquals_1 = (_oneArgument != null);
              if (_tripleNotEquals_1) {
                _builder.append("import { ");
                String _name = p.getRelation().getOneArgument().getType().getName();
                _builder.append(_name);
                _builder.append(" } from \'../");
                String _name_1 = p.getRelation().getOneArgument().getType().getName();
                _builder.append(_name_1);
                _builder.append("/");
                String _lowerCase = p.getRelation().getOneArgument().getType().getName().toLowerCase();
                _builder.append(_lowerCase);
                _builder.append(".entity\'");
                _builder.newLineIfNotEmpty();
              } else {
                MultipleArgumentRelation _multipleArgument = p.getRelation().getMultipleArgument();
                boolean _tripleNotEquals_2 = (_multipleArgument != null);
                if (_tripleNotEquals_2) {
                  _builder.append("import { ");
                  String _name_2 = p.getRelation().getMultipleArgument().getType().getName();
                  _builder.append(_name_2);
                  _builder.append(" } from \'../");
                  String _name_3 = p.getRelation().getMultipleArgument().getType().getName();
                  _builder.append(_name_3);
                  _builder.append("/");
                  String _lowerCase_1 = p.getRelation().getMultipleArgument().getType().getName().toLowerCase();
                  _builder.append(_lowerCase_1);
                  _builder.append(".entity\'");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("@Entity()");
    _builder.newLine();
    _builder.append("export class ");
    String _name_4 = e.getName();
    _builder.append(_name_4);
    _builder.append(" ");
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals_3 = (_superType != null);
      if (_tripleNotEquals_3) {
        _builder.append("extends ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties_1 = e.getProperties();
      for(final Property p_1 : _properties_1) {
        _builder.newLine();
        _builder.append("\t");
        CharSequence _compile = this.compile(p_1);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@ApiModelProperty()");
    _builder.newLine();
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
    {
      Entity _classType = p.getClassType();
      boolean _tripleNotEquals_3 = (_classType != null);
      if (_tripleNotEquals_3) {
        String _name_2 = p.getName();
        _builder.append(_name_2);
        _builder.append(": ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getClassType());
        _builder.append(_fullyQualifiedName);
        String _array = p.getArray();
        _builder.append(_array);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        String _name_3 = p.getName();
        _builder.append(_name_3);
        _builder.append(": ");
        String _type = p.getType();
        _builder.append(_type);
        String _array_1 = p.getArray();
        _builder.append(_array_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence controllerCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Controller, Get, Post, Put, Delete, Param, Res, HttpStatus, Body } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import { ApiUseTags, ApiOperation, ApiResponse, ApiImplicitParam } from \'@nestjs/swagger\';");
    _builder.newLine();
    _builder.append("import{ ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("Service } from \'./");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".service\';");
    _builder.newLineIfNotEmpty();
    _builder.append("import { ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append(" } from \'./");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append(".entity\';");
    _builder.newLineIfNotEmpty();
    _builder.append("import { BaseController } from \'../BaseModule/base.controller\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@ApiUseTags(\'");
    String _name_2 = e.getName();
    _builder.append(_name_2);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("@Controller(\'");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("export class ");
    String _name_3 = e.getName();
    _builder.append(_name_3);
    _builder.append("Controller extends BaseController<");
    String _name_4 = e.getName();
    _builder.append(_name_4);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("constructor(private readonly service: ");
    String _name_5 = e.getName();
    _builder.append(_name_5, "\t");
    _builder.append("Service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("super(service)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Method> _methods = e.getMethods();
      for(final Method method : _methods) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        String _verb = method.getVerb();
        _builder.append(_verb, "\t");
        _builder.append("(\'");
        String _name_6 = method.getName();
        _builder.append(_name_6, "\t");
        _builder.append("\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("@ApiOperation({");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("title: \'Insert your operation title\',");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("description: \'Insert your operation description\'");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@ApiResponse({");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("status: 200,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("description: \'Insert your response description\',");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("type: ");
        String _name_7 = e.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("isArray: false // or true");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public async ");
        String _name_8 = method.getName();
        _builder.append(_name_8, "\t");
        _builder.append("(@Res() res): Promise<");
        {
          AbstractElement _returnClassType = method.getReturnClassType();
          boolean _tripleNotEquals = (_returnClassType != null);
          if (_tripleNotEquals) {
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(method.getReturnClassType());
            _builder.append(_fullyQualifiedName, "\t");
          } else {
            String _returnType = method.getReturnType();
            _builder.append(_returnType, "\t");
          }
        }
        _builder.append("> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("try{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("res");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append(".status(HttpStatus.OK)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append(".send(await this.service.");
        String _name_9 = method.getName();
        _builder.append(_name_9, "\t\t\t");
        _builder.append("(/*Parameters*/));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("catch(error){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("res");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t ");
        _builder.append(".status(badGateWay)");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t ");
        _builder.append(".send({error, badGateWay});");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence serviceCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Injectable, Inject } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import { Repository } from \'typeorm\';");
    _builder.newLine();
    _builder.append("import { ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" } from \'./");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".entity\';");
    _builder.newLineIfNotEmpty();
    _builder.append("import { BaseService } from \"../BaseModule/base.service\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Injectable()");
    _builder.newLine();
    _builder.append("export class ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Service extends BaseService<");
    String _name_2 = e.getName();
    _builder.append(_name_2);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("constructor(");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Inject(\'");
    String _upperCase = e.getName().toUpperCase();
    _builder.append(_upperCase, "\t\t");
    _builder.append("_REPOSITORY\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("private readonly ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "\t\t");
    _builder.append("Repository: Repository<");
    String _name_3 = e.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super(");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append("Repository);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Method> _methods = e.getMethods();
      for(final Method method : _methods) {
        _builder.append("\t");
        List<String> newArgs = this.generateArgList(method);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("async ");
        String _name_4 = method.getName();
        _builder.append(_name_4, "\t");
        _builder.append("(");
        {
          for(final String arg : newArgs) {
            _builder.append(arg, "\t");
          }
        }
        _builder.append("): Promise<");
        {
          AbstractElement _returnClassType = method.getReturnClassType();
          boolean _tripleNotEquals = (_returnClassType != null);
          if (_tripleNotEquals) {
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(method.getReturnClassType());
            _builder.append(_fullyQualifiedName, "\t");
          } else {
            String _returnType = method.getReturnType();
            _builder.append(_returnType, "\t");
          }
        }
        _builder.append("> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//To do ");
        String _name_5 = method.getName();
        _builder.append(_name_5, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
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
    String _name = arg.getName();
    String response = (_name + ": ");
    AbstractElement _classType = arg.getClassType();
    boolean _tripleNotEquals = (_classType != null);
    if (_tripleNotEquals) {
      String _array = arg.getArray();
      boolean _tripleNotEquals_1 = (_array != null);
      if (_tripleNotEquals_1) {
        String _response = response;
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(arg.getClassType());
        String _array_1 = arg.getArray();
        String _plus = (_fullyQualifiedName + _array_1);
        response = (_response + _plus);
      }
      String _response_1 = response;
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(arg.getClassType());
      response = (_response_1 + _fullyQualifiedName_1);
    } else {
      String _array_2 = arg.getArray();
      boolean _tripleNotEquals_2 = (_array_2 != null);
      if (_tripleNotEquals_2) {
        String _response_2 = response;
        String _type = arg.getType();
        String _array_3 = arg.getArray();
        String _plus_1 = (_type + _array_3);
        response = (_response_2 + _plus_1);
      }
      String _response_3 = response;
      String _type_1 = arg.getType();
      response = (_response_3 + _type_1);
    }
    return response;
  }
  
  public CharSequence providersCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Connection, Repository } from \'typeorm\';");
    _builder.newLine();
    _builder.append("import { ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" } from \'./");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".entity\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("export const ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("Providers = [");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("provide: \'");
    String _upperCase = e.getName().toUpperCase();
    _builder.append(_upperCase, "\t\t");
    _builder.append("_REPOSITORY\',");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("useFactory: (connection: Connection) => connection.getRepository(");
    String _name_1 = e.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("inject: [\'DATABASE_CONNECTION\'],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence moduleCompile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Module } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import { ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("Controller } from \'./");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(".controller\';");
    _builder.newLineIfNotEmpty();
    _builder.append("import { ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Service } from \'./");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append(".service\';");
    _builder.newLineIfNotEmpty();
    _builder.append("import { ");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("Providers } from \'./");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append(".providers\'");
    _builder.newLineIfNotEmpty();
    _builder.append("import { DatabaseModule } from \'../Database/database.module\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Module({");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("imports: [ DatabaseModule ],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("controllers: [");
    String _name_2 = e.getName();
    _builder.append(_name_2, "  ");
    _builder.append("Controller],");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("providers: [");
    String _name_3 = e.getName();
    _builder.append(_name_3, "  ");
    _builder.append("Service, ...");
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, "  ");
    _builder.append("Providers],");
    _builder.newLineIfNotEmpty();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class ");
    String _name_4 = e.getName();
    _builder.append(_name_4);
    _builder.append("Module {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

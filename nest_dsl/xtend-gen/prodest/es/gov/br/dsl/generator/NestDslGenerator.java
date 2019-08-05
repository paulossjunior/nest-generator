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
import prodest.es.gov.br.dsl.nestdsl.Dto;
import prodest.es.gov.br.dsl.nestdsl.DtoProperty;
import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.Method;
import prodest.es.gov.br.dsl.nestdsl.MethodArg;
import prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.Property;
import prodest.es.gov.br.dsl.nestdsl.Relation;

@SuppressWarnings("all")
public class NestDslGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private List<String> modules = new ArrayList<String>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
        String _name = e.getName();
        String _plus = (_name + "/");
        String _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_1 = (_plus + _lowerCase);
        String _plus_2 = (_plus_1 + ".entity.ts");
        fsa.generateFile(_plus_2, 
          this.compile(e));
        String _name_1 = e.getName();
        String _plus_3 = (_name_1 + "/");
        String _lowerCase_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase_1);
        String _plus_5 = (_plus_4 + ".controller.ts");
        fsa.generateFile(_plus_5, 
          this.compileController(e));
        String _name_2 = e.getName();
        String _plus_6 = (_name_2 + "/");
        String _lowerCase_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_7 = (_plus_6 + _lowerCase_2);
        String _plus_8 = (_plus_7 + ".service.ts");
        fsa.generateFile(_plus_8, 
          this.compileService(e));
        String _name_3 = e.getName();
        String _plus_9 = (_name_3 + "/");
        String _lowerCase_3 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_3);
        String _plus_11 = (_plus_10 + ".providers.ts");
        fsa.generateFile(_plus_11, 
          this.compileProviders(e));
        String _name_4 = e.getName();
        String _plus_12 = (_name_4 + "/");
        String _lowerCase_4 = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/").toLowerCase();
        String _plus_13 = (_plus_12 + _lowerCase_4);
        String _plus_14 = (_plus_13 + ".module.ts");
        fsa.generateFile(_plus_14, 
          this.compileModule(e));
        this.modules.add(e.getName());
      }
    }
    Iterable<Dto> _filter_1 = Iterables.<Dto>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Dto.class);
    for (final Dto dto : _filter_1) {
      String _lowerCase = this._iQualifiedNameProvider.getFullyQualifiedName(dto).toString("/").toLowerCase();
      String _plus = ("DTOs/" + _lowerCase);
      String _plus_1 = (_plus + ".dto.ts");
      fsa.generateFile(_plus_1, 
        this.compile(dto));
    }
    fsa.generateFile(
      "Database/database.module.ts", 
      this.dbModuleCompile());
    fsa.generateFile(
      "Database/database.providers.ts", 
      this.dbProvidersCompile());
    fsa.generateFile(
      "main.ts", 
      this.mainCompile());
    fsa.generateFile(
      "app.module.ts", 
      this.appModuleCompile(this.modules));
    fsa.generateFile(
      "Dockerfile", 
      this.dockerfileCompile());
    fsa.generateFile(
      " .gitlab-ci.yml", 
      this.ciCompile());
    fsa.generateFile(
      "sonar-project.properties", 
      this.sonarCompile());
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Entity, Column, PrimaryGeneratedColumn, JoinColumn, JoinTable, OneToOne, OneToMany, ManyToMany, ManyToOne } from \'typeorm\';");
    _builder.newLine();
    _builder.append("import { ApiModelProperty } from \"@nestjs/swagger\";");
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
    _builder.append(".service\'");
    _builder.newLineIfNotEmpty();
    _builder.append("import { ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append(" } from \'./");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append(".entity\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@ApiUseTags(\'Insert your description\')");
    _builder.newLine();
    _builder.append("@Controller(\'");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("export class ");
    String _name_2 = e.getName();
    _builder.append(_name_2);
    _builder.append("Controller{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("constructor(");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private readonly service: ");
    String _name_3 = e.getName();
    _builder.append(_name_3, "\t\t");
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
    _builder.append("@ApiOperation({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("title: \'Insert your operation title\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your operation description\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiResponse({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("status: 200,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your response description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: ");
    String _name_4 = e.getName();
    _builder.append(_name_4, "        ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("isArray: true");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async findAll(@Res() res): Promise<");
    String _name_5 = e.getName();
    _builder.append(_name_5, "\t");
    _builder.append("[]> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return res");
    _builder.newLine();
    _builder.append("\t\t \t\t\t");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t \t\t");
    _builder.append(".send(await this.service.findAll());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".status(badGateWay)");
    _builder.newLine();
    _builder.append("\t \t\t\t");
    _builder.append(".send({error, badGateWay});");
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
    _builder.append("@Get(\'/:id\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@ApiOperation({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("title: \'Insert your operation title\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your operation description\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiResponse({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("status: 200,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your response description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "        ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("isArray: false");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiImplicitParam({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("name: \'id\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your param description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("required: true, //or false");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: \'number\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async findOne(@Res() res, @Param(\'id\') id): Promise<");
    String _name_7 = e.getName();
    _builder.append(_name_7, "\t");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return res");
    _builder.newLine();
    _builder.append("\t\t\t \t");
    _builder.append(".status(HttpStatus.OK)");
    _builder.newLine();
    _builder.append("\t\t\t \t");
    _builder.append(".send(await this.service.findOne(id));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t\t ");
    _builder.append(".status(badGateWay)");
    _builder.newLine();
    _builder.append("\t\t\t\t ");
    _builder.append(".send({error, badGateWay});");
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
    _builder.append("@ApiOperation({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("title: \'Insert your operation title\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your operation description\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiResponse({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("status: 200,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your response description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: ");
    String _name_8 = e.getName();
    _builder.append(_name_8, "        ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("isArray: false // or true");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async createOne(@Res() res, @Body() ");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3, "\t");
    _builder.append(": ");
    String _name_9 = e.getName();
    _builder.append(_name_9, "\t");
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
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, "\t\t\t ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t\t ");
    _builder.append(".status(badGateWay)");
    _builder.newLine();
    _builder.append("\t\t\t\t ");
    _builder.append(".send({error, badGateWay});");
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
    _builder.append("@Put(\'/:id\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@ApiOperation({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("title: \'Insert your operation title\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your operation description\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiResponse({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("status: 200,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your response description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: ");
    String _name_10 = e.getName();
    _builder.append(_name_10, "        ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("isArray: false");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiImplicitParam({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("name: \'id\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your param description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("required: true, //or false");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: \'number\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async updateOne(@Res() res, @Param(\'id\') id, @Body() ");
    String _lowerCase_5 = e.getName().toLowerCase();
    _builder.append(_lowerCase_5, "\t");
    _builder.append(": ");
    String _name_11 = e.getName();
    _builder.append(_name_11, "\t");
    _builder.append("): Promise<void> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _lowerCase_6 = e.getName().toLowerCase();
    _builder.append(_lowerCase_6, "\t\t\t");
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
    String _lowerCase_7 = e.getName().toLowerCase();
    _builder.append(_lowerCase_7, "\t\t\t ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(error){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(badGateWay)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error, badGateWay});");
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
    _builder.append("@Delete(\'/:id\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@ApiOperation({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("title: \'Insert your operation title\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your operation description\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiResponse({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("status: 200,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your response description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: ");
    String _name_12 = e.getName();
    _builder.append(_name_12, "        ");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("isArray: false");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ApiImplicitParam({");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("name: \'id\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("description: \'Insert your param description\',");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("required: true, //or false");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("type: \'number\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public async deleteOne(@Res() res, @Param(\'id\') id): Promise<void> {");
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
    _builder.append("const badGateWay = HttpStatus.BAD_GATEWAY;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("res");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".status(badGateWay)");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append(".send({error, badGateWay});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
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
        _builder.append("(\'/");
        String _name_13 = method.getName();
        _builder.append(_name_13, "\t");
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
        String _name_14 = e.getName();
        _builder.append(_name_14, "\t\t");
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
        String _name_15 = method.getName();
        _builder.append(_name_15, "\t");
        _builder.append("(@Res() res): Promise<");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(method.getReturnType());
        _builder.append(_fullyQualifiedName, "\t");
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
        String _name_16 = method.getName();
        _builder.append(_name_16, "\t\t\t");
        _builder.append("(//Parameters));");
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
  
  public CharSequence compileService(final Entity e) {
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
    _builder.append(".entity\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Injectable()");
    _builder.newLine();
    _builder.append("export class ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("Service {");
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
    String _name_2 = e.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("){}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("async findAll(): Promise<");
    String _name_3 = e.getName();
    _builder.append(_name_3, "\t");
    _builder.append("[]> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return await this.");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append("Repository.find();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("async findOne(id: number): Promise<");
    String _name_4 = e.getName();
    _builder.append(_name_4, "\t");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return await this.");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3, "\t\t");
    _builder.append("Repository.findOne({id: id});");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("async createOne(");
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, "\t");
    _builder.append(": ");
    String _name_5 = e.getName();
    _builder.append(_name_5, "\t");
    _builder.append("): Promise<void> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("await this.");
    String _lowerCase_5 = e.getName().toLowerCase();
    _builder.append(_lowerCase_5, "\t\t");
    _builder.append("Repository.save(");
    String _lowerCase_6 = e.getName().toLowerCase();
    _builder.append(_lowerCase_6, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("async updateOne(");
    String _lowerCase_7 = e.getName().toLowerCase();
    _builder.append(_lowerCase_7, "\t");
    _builder.append(": ");
    String _name_6 = e.getName();
    _builder.append(_name_6, "\t");
    _builder.append("): Promise<void> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("await this.");
    String _lowerCase_8 = e.getName().toLowerCase();
    _builder.append(_lowerCase_8, "\t\t");
    _builder.append("Repository.update(");
    String _lowerCase_9 = e.getName().toLowerCase();
    _builder.append(_lowerCase_9, "\t\t");
    _builder.append(".id, ");
    String _lowerCase_10 = e.getName().toLowerCase();
    _builder.append(_lowerCase_10, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("async deleteOne(id: number): Promise<void> {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("await this.");
    String _lowerCase_11 = e.getName().toLowerCase();
    _builder.append(_lowerCase_11, "\t\t");
    _builder.append("Repository.delete(id)");
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
        _builder.append("async ");
        String _name_7 = method.getName();
        _builder.append(_name_7, "\t");
        _builder.append("(");
        {
          int _size = method.getArgs().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            CharSequence _compile = this.compile(method.getArgs().remove(0));
            _builder.append(_compile, "\t");
            {
              EList<MethodArg> _args = method.getArgs();
              for(final MethodArg arg : _args) {
                _builder.append(", ");
                CharSequence _compile_1 = this.compile(arg);
                _builder.append(_compile_1, "\t");
              }
            }
          }
        }
        _builder.append("): Promise<");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(method.getReturnType());
        _builder.append(_fullyQualifiedName, "\t");
        String _array = method.getArray();
        _builder.append(_array, "\t");
        _builder.append("> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//To do ");
        String _name_8 = method.getName();
        _builder.append(_name_8, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final MethodArg arg) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = arg.getName();
    _builder.append(_name);
    _builder.append(": ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(arg.getType());
    _builder.append(_fullyQualifiedName);
    String _array = arg.getArray();
    _builder.append(_array);
    return _builder;
  }
  
  public CharSequence compileProviders(final Entity e) {
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
  
  public CharSequence compileModule(final Entity e) {
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
  
  public CharSequence dbModuleCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Module } from \'@nestjs/common\';");
    _builder.newLine();
    _builder.append("import { databaseProviders } from \'./database.providers\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Module({");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("providers: [...databaseProviders],");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("exports: [...databaseProviders],");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class DatabaseModule {}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence dbProvidersCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { createConnection } from \'typeorm\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export const databaseProviders = [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("provide: \'DATABASE_CONNECTION\',");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("useFactory: async () => await createConnection({");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("type: \'postgres\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("host: \'localhost\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("port: 5432,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("username: \'postgres\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("password: \'senha\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("database: \'postgres\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("entities: [");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("__dirname + \'/../**/*.entity{.ts,.js}\',");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("synchronize: true,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}),");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("];");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { NestFactory } from \'@nestjs/core\';");
    _builder.newLine();
    _builder.append("import { AppModule } from \'./app.module\';");
    _builder.newLine();
    _builder.append("import { SwaggerModule, DocumentBuilder } from \'@nestjs/swagger\';");
    _builder.newLine();
    _builder.append("const pacote = require( \'../package.json\' );");
    _builder.newLine();
    _builder.append("const fs = require( \'fs\' );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("async function bootstrap() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const app = await NestFactory.create(AppModule);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const options = new DocumentBuilder()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setTitle( pacote.name )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setDescription( pacote.description )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setVersion( pacote.version )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".setSchemes( \'http\', \'https\' )");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("const document = SwaggerModule.createDocument( app, options );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fs.writeFileSync( \'swagger.json\', JSON.stringify( document, null, 2 ) );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("SwaggerModule.setup( `/`, app, document );");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("await app.listen(3000);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("bootstrap();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence appModuleCompile(final List<String> modules) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { Module } from \'@nestjs/common\';");
    _builder.newLine();
    {
      for(final String module : modules) {
        _builder.append("import { ");
        _builder.append(module);
        _builder.append("Module } from \'./");
        _builder.append(module);
        _builder.append("/");
        String _lowerCase = module.toLowerCase();
        _builder.append(_lowerCase);
        _builder.append(".module\';");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@Module({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("imports: [");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final String module_1 : modules) {
        _builder.append("\t\t");
        _builder.append(module_1, "\t");
        _builder.append("Module,");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("controllers: [],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("providers: [],");
    _builder.newLine();
    _builder.append("})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export class AppModule {}");
    _builder.newLine();
    return _builder;
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
    _builder.append("    ");
    _builder.append("constructor(\t\t");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_1 = dto.getProperties();
      for(final DtoProperty p_1 : _properties_1) {
        CharSequence _compileDtoProperty = this.compileDtoProperty(p_1, Boolean.valueOf(true));
        _builder.append(_compileDtoProperty);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("   \t");
    _builder.append(") {");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_2 = dto.getProperties();
      for(final DtoProperty p_2 : _properties_2) {
        CharSequence _compileDtoConstructor = this.compileDtoConstructor(p_2);
        _builder.append(_compileDtoConstructor);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<DtoProperty> _properties_3 = dto.getProperties();
      for(final DtoProperty p_3 : _properties_3) {
        CharSequence _compileDtoProperty_1 = this.compileDtoProperty(p_3, Boolean.valueOf(false));
        _builder.append(_compileDtoProperty_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDtoProperty(final DtoProperty p, final Boolean constructor) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((constructor).booleanValue() == false)) {
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
      if (((constructor).booleanValue() == true)) {
        _builder.append(",");
      } else {
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileDtoConstructor(final DtoProperty p) {
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
  
  public CharSequence dockerfileCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("FROM registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.newLine();
    _builder.append("WORKDIR /app");
    _builder.newLine();
    _builder.append("RUN mkdir /src");
    _builder.newLine();
    _builder.newLine();
    _builder.append("COPY package.json .");
    _builder.newLine();
    _builder.append("COPY tsconfig.json .");
    _builder.newLine();
    _builder.append("RUN npm install");
    _builder.newLine();
    _builder.append("COPY src/ /app/src");
    _builder.newLine();
    _builder.newLine();
    _builder.append("EXPOSE 3000");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CMD [\"npm\",\"run\", \"start\"]");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ciCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("stages:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- test");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- quality");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- build");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- deploy");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("#- stress");
    _builder.newLine();
    _builder.newLine();
    _builder.append("cache:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("key: \'YOUR-KEY\'");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("paths:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- node_modules/");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("test_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: test");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm install #--registry http://verdaccio.10.243.9.12.xip.io");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm run test");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("- npm run test:e2e");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("retry: 2   ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("quality_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/sonar-scanner:3.3.0.1492");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: quality");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("dependencies:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- test_job    ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- npm install #--registry http://verdaccio.10.243.9.12.xip.io");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- npm run test:cov");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("- sonar-scanner");
    _builder.newLine();
    _builder.newLine();
    _builder.append("build_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: build");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: docker:stable");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("services:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker:dind");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("only:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- tags");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker login -u gitlab-ci-token -p $CI_BUILD_TOKEN $CI_REGISTRY");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker build -t $CI_REGISTRY_IMAGE:$CI_BUILD_TAG .");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker push $CI_REGISTRY_IMAGE:$CI_BUILD_TAG");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker tag $CI_REGISTRY_IMAGE:$CI_BUILD_TAG $CI_REGISTRY_IMAGE:latest");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker push $CI_REGISTRY_IMAGE:latest");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("deploy_job:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: deploy");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("image: registry.es.gov.br/espm/infraestrutura/containers/node:10.15.3");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("only:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- tags");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- npm i upgrade-rancher");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- ./node_modules/.bin/upgrade-rancher --IMAGE $CI_REGISTRY_IMAGE:$CI_BUILD_TAG --SERVICE_ID RANCHER_SERVICE_ID");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("dependencies:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- build_job");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("#stress_job:");
    _builder.newLine();
    _builder.append("#  stage: stress");
    _builder.newLine();
    _builder.append("#  image: docker:stable");
    _builder.newLine();
    _builder.append("#  dependencies:");
    _builder.newLine();
    _builder.append("#    - deploy_job");
    _builder.newLine();
    _builder.append("#  only:");
    _builder.newLine();
    _builder.append("#    - tags");
    _builder.newLine();
    _builder.append("#  services:");
    _builder.newLine();
    _builder.append("#    - docker:dind");
    _builder.newLine();
    _builder.append("#  script:");
    _builder.newLine();
    _builder.append("#    - docker run -i --rm -v $(pwd)/stress:/bzt-configs -v $(pwd)/stress/artifacts:/tmp/artifacts blazemeter/taurus quick_test.yml 2>&1");
    _builder.newLine();
    _builder.append("#  artifacts:");
    _builder.newLine();
    _builder.append("#    paths:");
    _builder.newLine();
    _builder.append("#      - $(pwd)/stress/artifacts");
    _builder.newLine();
    _builder.append("#    expire_in: 2 week");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence sonarCompile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sonar.projectKey = YOUR KEY");
    _builder.newLine();
    _builder.append("sonar.projectName = YOUR PROJECT NAME");
    _builder.newLine();
    _builder.append("sonar.projectVersion = 3.0");
    _builder.newLine();
    _builder.append("sonar.sources = src");
    _builder.newLine();
    _builder.append("sonar.language = ts");
    _builder.newLine();
    _builder.append("sonar.sourceEncoding = UTF-8");
    _builder.newLine();
    _builder.append("sonar.typescript.lcov.reportPaths=coverage/lcov.info");
    _builder.newLine();
    _builder.append("sonar.exclusions= **/__mocks__/**");
    _builder.newLine();
    _builder.append("sonar.host.url = http://sonarqube.dcpr.es.gov.br");
    _builder.newLine();
    _builder.append("sonar.login = YOUR SONAR LOGIN HASH");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}

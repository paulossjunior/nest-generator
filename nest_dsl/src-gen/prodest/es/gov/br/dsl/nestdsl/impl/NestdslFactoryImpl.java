/**
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.nestdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import prodest.es.gov.br.dsl.nestdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NestdslFactoryImpl extends EFactoryImpl implements NestdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NestdslFactory init()
  {
    try
    {
      NestdslFactory theNestdslFactory = (NestdslFactory)EPackage.Registry.INSTANCE.getEFactory(NestdslPackage.eNS_URI);
      if (theNestdslFactory != null)
      {
        return theNestdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NestdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NestdslPackage.DOMAINMODEL: return createDomainmodel();
      case NestdslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case NestdslPackage.TYPE: return createType();
      case NestdslPackage.DTO_TYPE: return createDtoType();
      case NestdslPackage.ENTITY: return createEntity();
      case NestdslPackage.DTO: return createDto();
      case NestdslPackage.DATA_TYPE: return createDataType();
      case NestdslPackage.PROPERTY: return createProperty();
      case NestdslPackage.DTO_PROPERTY: return createDtoProperty();
      case NestdslPackage.RELATION: return createRelation();
      case NestdslPackage.ONE_ARGUMENT_RELATION: return createOneArgumentRelation();
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION: return createMultipleArgumentRelation();
      case NestdslPackage.METHOD: return createMethod();
      case NestdslPackage.METHOD_ARG: return createMethodArg();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DtoType createDtoType()
  {
    DtoTypeImpl dtoType = new DtoTypeImpl();
    return dtoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dto createDto()
  {
    DtoImpl dto = new DtoImpl();
    return dto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DtoProperty createDtoProperty()
  {
    DtoPropertyImpl dtoProperty = new DtoPropertyImpl();
    return dtoProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OneArgumentRelation createOneArgumentRelation()
  {
    OneArgumentRelationImpl oneArgumentRelation = new OneArgumentRelationImpl();
    return oneArgumentRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultipleArgumentRelation createMultipleArgumentRelation()
  {
    MultipleArgumentRelationImpl multipleArgumentRelation = new MultipleArgumentRelationImpl();
    return multipleArgumentRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MethodArg createMethodArg()
  {
    MethodArgImpl methodArg = new MethodArgImpl();
    return methodArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestdslPackage getNestdslPackage()
  {
    return (NestdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NestdslPackage getPackage()
  {
    return NestdslPackage.eINSTANCE;
  }

} //NestdslFactoryImpl

/**
 * generated by XText 2.19.0
 */
package prodest.es.gov.br.dsl.nestdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation;
import prodest.es.gov.br.dsl.nestdsl.NestdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Argument Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.impl.MultipleArgumentRelationImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.impl.MultipleArgumentRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.impl.MultipleArgumentRelationImpl#getSecondArgument <em>Second Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleArgumentRelationImpl extends MinimalEObjectImpl.Container implements MultipleArgumentRelation
{
  /**
   * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected static final String ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected String argument = ARGUMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Entity type;

  /**
   * The default value of the '{@link #getSecondArgument() <em>Second Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondArgument()
   * @generated
   * @ordered
   */
  protected static final String SECOND_ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecondArgument() <em>Second Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondArgument()
   * @generated
   * @ordered
   */
  protected String secondArgument = SECOND_ARGUMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultipleArgumentRelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NestdslPackage.Literals.MULTIPLE_ARGUMENT_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArgument(String newArgument)
  {
    String oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NestdslPackage.MULTIPLE_ARGUMENT_RELATION__ARGUMENT, oldArgument, argument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Entity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Entity newType)
  {
    Entity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecondArgument()
  {
    return secondArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondArgument(String newSecondArgument)
  {
    String oldSecondArgument = secondArgument;
    secondArgument = newSecondArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NestdslPackage.MULTIPLE_ARGUMENT_RELATION__SECOND_ARGUMENT, oldSecondArgument, secondArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__ARGUMENT:
        return getArgument();
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__SECOND_ARGUMENT:
        return getSecondArgument();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__ARGUMENT:
        setArgument((String)newValue);
        return;
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE:
        setType((Entity)newValue);
        return;
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__SECOND_ARGUMENT:
        setSecondArgument((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__ARGUMENT:
        setArgument(ARGUMENT_EDEFAULT);
        return;
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE:
        setType((Entity)null);
        return;
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__SECOND_ARGUMENT:
        setSecondArgument(SECOND_ARGUMENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__ARGUMENT:
        return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals(argument);
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__TYPE:
        return type != null;
      case NestdslPackage.MULTIPLE_ARGUMENT_RELATION__SECOND_ARGUMENT:
        return SECOND_ARGUMENT_EDEFAULT == null ? secondArgument != null : !SECOND_ARGUMENT_EDEFAULT.equals(secondArgument);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (argument: ");
    result.append(argument);
    result.append(", secondArgument: ");
    result.append(secondArgument);
    result.append(')');
    return result.toString();
  }

} //MultipleArgumentRelationImpl

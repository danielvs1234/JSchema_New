/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.hasProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ExtendedObjectImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ExtendedObjectImpl#getExtendsID <em>Extends ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ExtendedObjectImpl#getOverRiddenProperties <em>Over Ridden Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ExtendedObjectImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedObjectImpl extends AbstractObjectImpl implements ExtendedObject
{
  /**
   * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectName()
   * @generated
   * @ordered
   */
  protected String objectName = OBJECT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getExtendsID() <em>Extends ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsID()
   * @generated
   * @ordered
   */
  protected static final String EXTENDS_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtendsID() <em>Extends ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsID()
   * @generated
   * @ordered
   */
  protected String extendsID = EXTENDS_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getOverRiddenProperties() <em>Over Ridden Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverRiddenProperties()
   * @generated
   * @ordered
   */
  protected EList<hasProperties> overRiddenProperties;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<hasProperties> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedObjectImpl()
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
    return JSchemaPackage.Literals.EXTENDED_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjectName()
  {
    return objectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjectName(String newObjectName)
  {
    String oldObjectName = objectName;
    objectName = newObjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.EXTENDED_OBJECT__OBJECT_NAME, oldObjectName, objectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExtendsID()
  {
    return extendsID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtendsID(String newExtendsID)
  {
    String oldExtendsID = extendsID;
    extendsID = newExtendsID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.EXTENDED_OBJECT__EXTENDS_ID, oldExtendsID, extendsID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<hasProperties> getOverRiddenProperties()
  {
    if (overRiddenProperties == null)
    {
      overRiddenProperties = new EObjectContainmentEList<hasProperties>(hasProperties.class, this, JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES);
    }
    return overRiddenProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<hasProperties> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<hasProperties>(hasProperties.class, this, JSchemaPackage.EXTENDED_OBJECT__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES:
        return ((InternalEList<?>)getOverRiddenProperties()).basicRemove(otherEnd, msgs);
      case JSchemaPackage.EXTENDED_OBJECT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JSchemaPackage.EXTENDED_OBJECT__OBJECT_NAME:
        return getObjectName();
      case JSchemaPackage.EXTENDED_OBJECT__EXTENDS_ID:
        return getExtendsID();
      case JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES:
        return getOverRiddenProperties();
      case JSchemaPackage.EXTENDED_OBJECT__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JSchemaPackage.EXTENDED_OBJECT__OBJECT_NAME:
        setObjectName((String)newValue);
        return;
      case JSchemaPackage.EXTENDED_OBJECT__EXTENDS_ID:
        setExtendsID((String)newValue);
        return;
      case JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES:
        getOverRiddenProperties().clear();
        getOverRiddenProperties().addAll((Collection<? extends hasProperties>)newValue);
        return;
      case JSchemaPackage.EXTENDED_OBJECT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends hasProperties>)newValue);
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
      case JSchemaPackage.EXTENDED_OBJECT__OBJECT_NAME:
        setObjectName(OBJECT_NAME_EDEFAULT);
        return;
      case JSchemaPackage.EXTENDED_OBJECT__EXTENDS_ID:
        setExtendsID(EXTENDS_ID_EDEFAULT);
        return;
      case JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES:
        getOverRiddenProperties().clear();
        return;
      case JSchemaPackage.EXTENDED_OBJECT__PROPERTIES:
        getProperties().clear();
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
      case JSchemaPackage.EXTENDED_OBJECT__OBJECT_NAME:
        return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
      case JSchemaPackage.EXTENDED_OBJECT__EXTENDS_ID:
        return EXTENDS_ID_EDEFAULT == null ? extendsID != null : !EXTENDS_ID_EDEFAULT.equals(extendsID);
      case JSchemaPackage.EXTENDED_OBJECT__OVER_RIDDEN_PROPERTIES:
        return overRiddenProperties != null && !overRiddenProperties.isEmpty();
      case JSchemaPackage.EXTENDED_OBJECT__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(" (objectName: ");
    result.append(objectName);
    result.append(", extendsID: ");
    result.append(extendsID);
    result.append(')');
    return result.toString();
  }

} //ExtendedObjectImpl

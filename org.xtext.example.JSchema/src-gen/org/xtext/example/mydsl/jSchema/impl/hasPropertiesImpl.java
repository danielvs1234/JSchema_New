/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.Property;
import org.xtext.example.mydsl.jSchema.hasProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>has Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.hasPropertiesImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class hasPropertiesImpl extends MinimalEObjectImpl.Container implements hasProperties
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected Property properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected hasPropertiesImpl()
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
    return JSchemaPackage.Literals.HAS_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(Property newProperties, NotificationChain msgs)
  {
    Property oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.HAS_PROPERTIES__PROPERTIES, oldProperties, newProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperties(Property newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.HAS_PROPERTIES__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.HAS_PROPERTIES__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.HAS_PROPERTIES__PROPERTIES, newProperties, newProperties));
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
      case JSchemaPackage.HAS_PROPERTIES__PROPERTIES:
        return basicSetProperties(null, msgs);
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
      case JSchemaPackage.HAS_PROPERTIES__PROPERTIES:
        return getProperties();
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
      case JSchemaPackage.HAS_PROPERTIES__PROPERTIES:
        setProperties((Property)newValue);
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
      case JSchemaPackage.HAS_PROPERTIES__PROPERTIES:
        setProperties((Property)null);
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
      case JSchemaPackage.HAS_PROPERTIES__PROPERTIES:
        return properties != null;
    }
    return super.eIsSet(featureID);
  }

} //hasPropertiesImpl
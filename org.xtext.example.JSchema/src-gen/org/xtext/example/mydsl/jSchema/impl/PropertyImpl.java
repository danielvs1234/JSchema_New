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
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PropertyImpl#getPropPrim <em>Prop Prim</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PropertyImpl#getPropObj <em>Prop Obj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The cached value of the '{@link #getPropPrim() <em>Prop Prim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropPrim()
   * @generated
   * @ordered
   */
  protected PrimitiveObject propPrim;

  /**
   * The cached value of the '{@link #getPropObj() <em>Prop Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropObj()
   * @generated
   * @ordered
   */
  protected MainObject propObj;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return JSchemaPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveObject getPropPrim()
  {
    return propPrim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropPrim(PrimitiveObject newPropPrim, NotificationChain msgs)
  {
    PrimitiveObject oldPropPrim = propPrim;
    propPrim = newPropPrim;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.PROPERTY__PROP_PRIM, oldPropPrim, newPropPrim);
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
  public void setPropPrim(PrimitiveObject newPropPrim)
  {
    if (newPropPrim != propPrim)
    {
      NotificationChain msgs = null;
      if (propPrim != null)
        msgs = ((InternalEObject)propPrim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PROPERTY__PROP_PRIM, null, msgs);
      if (newPropPrim != null)
        msgs = ((InternalEObject)newPropPrim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PROPERTY__PROP_PRIM, null, msgs);
      msgs = basicSetPropPrim(newPropPrim, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PROPERTY__PROP_PRIM, newPropPrim, newPropPrim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainObject getPropObj()
  {
    return propObj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropObj(MainObject newPropObj, NotificationChain msgs)
  {
    MainObject oldPropObj = propObj;
    propObj = newPropObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.PROPERTY__PROP_OBJ, oldPropObj, newPropObj);
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
  public void setPropObj(MainObject newPropObj)
  {
    if (newPropObj != propObj)
    {
      NotificationChain msgs = null;
      if (propObj != null)
        msgs = ((InternalEObject)propObj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PROPERTY__PROP_OBJ, null, msgs);
      if (newPropObj != null)
        msgs = ((InternalEObject)newPropObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PROPERTY__PROP_OBJ, null, msgs);
      msgs = basicSetPropObj(newPropObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PROPERTY__PROP_OBJ, newPropObj, newPropObj));
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
      case JSchemaPackage.PROPERTY__PROP_PRIM:
        return basicSetPropPrim(null, msgs);
      case JSchemaPackage.PROPERTY__PROP_OBJ:
        return basicSetPropObj(null, msgs);
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
      case JSchemaPackage.PROPERTY__PROP_PRIM:
        return getPropPrim();
      case JSchemaPackage.PROPERTY__PROP_OBJ:
        return getPropObj();
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
      case JSchemaPackage.PROPERTY__PROP_PRIM:
        setPropPrim((PrimitiveObject)newValue);
        return;
      case JSchemaPackage.PROPERTY__PROP_OBJ:
        setPropObj((MainObject)newValue);
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
      case JSchemaPackage.PROPERTY__PROP_PRIM:
        setPropPrim((PrimitiveObject)null);
        return;
      case JSchemaPackage.PROPERTY__PROP_OBJ:
        setPropObj((MainObject)null);
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
      case JSchemaPackage.PROPERTY__PROP_PRIM:
        return propPrim != null;
      case JSchemaPackage.PROPERTY__PROP_OBJ:
        return propObj != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyImpl
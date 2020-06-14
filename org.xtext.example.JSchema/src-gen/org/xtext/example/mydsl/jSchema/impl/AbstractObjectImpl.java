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

import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.AbstractObjectImpl#getMainObject <em>Main Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.AbstractObjectImpl#getPrimitiveObject <em>Primitive Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.AbstractObjectImpl#getExtendedObject <em>Extended Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractObjectImpl extends MinimalEObjectImpl.Container implements AbstractObject
{
  /**
   * The cached value of the '{@link #getMainObject() <em>Main Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainObject()
   * @generated
   * @ordered
   */
  protected MainObject mainObject;

  /**
   * The cached value of the '{@link #getPrimitiveObject() <em>Primitive Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveObject()
   * @generated
   * @ordered
   */
  protected PrimitiveObject primitiveObject;

  /**
   * The cached value of the '{@link #getExtendedObject() <em>Extended Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendedObject()
   * @generated
   * @ordered
   */
  protected ExtendedObject extendedObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractObjectImpl()
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
    return JSchemaPackage.Literals.ABSTRACT_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainObject getMainObject()
  {
    return mainObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainObject(MainObject newMainObject, NotificationChain msgs)
  {
    MainObject oldMainObject = mainObject;
    mainObject = newMainObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT, oldMainObject, newMainObject);
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
  public void setMainObject(MainObject newMainObject)
  {
    if (newMainObject != mainObject)
    {
      NotificationChain msgs = null;
      if (mainObject != null)
        msgs = ((InternalEObject)mainObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT, null, msgs);
      if (newMainObject != null)
        msgs = ((InternalEObject)newMainObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT, null, msgs);
      msgs = basicSetMainObject(newMainObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT, newMainObject, newMainObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveObject getPrimitiveObject()
  {
    return primitiveObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitiveObject(PrimitiveObject newPrimitiveObject, NotificationChain msgs)
  {
    PrimitiveObject oldPrimitiveObject = primitiveObject;
    primitiveObject = newPrimitiveObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT, oldPrimitiveObject, newPrimitiveObject);
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
  public void setPrimitiveObject(PrimitiveObject newPrimitiveObject)
  {
    if (newPrimitiveObject != primitiveObject)
    {
      NotificationChain msgs = null;
      if (primitiveObject != null)
        msgs = ((InternalEObject)primitiveObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT, null, msgs);
      if (newPrimitiveObject != null)
        msgs = ((InternalEObject)newPrimitiveObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT, null, msgs);
      msgs = basicSetPrimitiveObject(newPrimitiveObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT, newPrimitiveObject, newPrimitiveObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtendedObject getExtendedObject()
  {
    return extendedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendedObject(ExtendedObject newExtendedObject, NotificationChain msgs)
  {
    ExtendedObject oldExtendedObject = extendedObject;
    extendedObject = newExtendedObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT, oldExtendedObject, newExtendedObject);
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
  public void setExtendedObject(ExtendedObject newExtendedObject)
  {
    if (newExtendedObject != extendedObject)
    {
      NotificationChain msgs = null;
      if (extendedObject != null)
        msgs = ((InternalEObject)extendedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT, null, msgs);
      if (newExtendedObject != null)
        msgs = ((InternalEObject)newExtendedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT, null, msgs);
      msgs = basicSetExtendedObject(newExtendedObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT, newExtendedObject, newExtendedObject));
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
      case JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT:
        return basicSetMainObject(null, msgs);
      case JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT:
        return basicSetPrimitiveObject(null, msgs);
      case JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT:
        return basicSetExtendedObject(null, msgs);
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
      case JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT:
        return getMainObject();
      case JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT:
        return getPrimitiveObject();
      case JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT:
        return getExtendedObject();
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
      case JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT:
        setMainObject((MainObject)newValue);
        return;
      case JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT:
        setPrimitiveObject((PrimitiveObject)newValue);
        return;
      case JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT:
        setExtendedObject((ExtendedObject)newValue);
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
      case JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT:
        setMainObject((MainObject)null);
        return;
      case JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT:
        setPrimitiveObject((PrimitiveObject)null);
        return;
      case JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT:
        setExtendedObject((ExtendedObject)null);
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
      case JSchemaPackage.ABSTRACT_OBJECT__MAIN_OBJECT:
        return mainObject != null;
      case JSchemaPackage.ABSTRACT_OBJECT__PRIMITIVE_OBJECT:
        return primitiveObject != null;
      case JSchemaPackage.ABSTRACT_OBJECT__EXTENDED_OBJECT:
        return extendedObject != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractObjectImpl

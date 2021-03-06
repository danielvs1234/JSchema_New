/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.jSchema.FormatTypes;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PrimitivePropertiesImpl#getStringLength <em>String Length</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PrimitivePropertiesImpl#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PrimitivePropertiesImpl#getStringFormat <em>String Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitivePropertiesImpl extends MinimalEObjectImpl.Container implements PrimitiveProperties
{
  /**
   * The default value of the '{@link #getStringLength() <em>String Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringLength()
   * @generated
   * @ordered
   */
  protected static final String STRING_LENGTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringLength() <em>String Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringLength()
   * @generated
   * @ordered
   */
  protected String stringLength = STRING_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getPatternString() <em>Pattern String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternString()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPatternString() <em>Pattern String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternString()
   * @generated
   * @ordered
   */
  protected String patternString = PATTERN_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getStringFormat() <em>String Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringFormat()
   * @generated
   * @ordered
   */
  protected static final FormatTypes STRING_FORMAT_EDEFAULT = FormatTypes.DEFAULT;

  /**
   * The cached value of the '{@link #getStringFormat() <em>String Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringFormat()
   * @generated
   * @ordered
   */
  protected FormatTypes stringFormat = STRING_FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitivePropertiesImpl()
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
    return JSchemaPackage.Literals.PRIMITIVE_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStringLength()
  {
    return stringLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringLength(String newStringLength)
  {
    String oldStringLength = stringLength;
    stringLength = newStringLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_LENGTH, oldStringLength, stringLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPatternString()
  {
    return patternString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPatternString(String newPatternString)
  {
    String oldPatternString = patternString;
    patternString = newPatternString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PRIMITIVE_PROPERTIES__PATTERN_STRING, oldPatternString, patternString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormatTypes getStringFormat()
  {
    return stringFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringFormat(FormatTypes newStringFormat)
  {
    FormatTypes oldStringFormat = stringFormat;
    stringFormat = newStringFormat == null ? STRING_FORMAT_EDEFAULT : newStringFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_FORMAT, oldStringFormat, stringFormat));
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
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_LENGTH:
        return getStringLength();
      case JSchemaPackage.PRIMITIVE_PROPERTIES__PATTERN_STRING:
        return getPatternString();
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_FORMAT:
        return getStringFormat();
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
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_LENGTH:
        setStringLength((String)newValue);
        return;
      case JSchemaPackage.PRIMITIVE_PROPERTIES__PATTERN_STRING:
        setPatternString((String)newValue);
        return;
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_FORMAT:
        setStringFormat((FormatTypes)newValue);
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
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_LENGTH:
        setStringLength(STRING_LENGTH_EDEFAULT);
        return;
      case JSchemaPackage.PRIMITIVE_PROPERTIES__PATTERN_STRING:
        setPatternString(PATTERN_STRING_EDEFAULT);
        return;
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_FORMAT:
        setStringFormat(STRING_FORMAT_EDEFAULT);
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
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_LENGTH:
        return STRING_LENGTH_EDEFAULT == null ? stringLength != null : !STRING_LENGTH_EDEFAULT.equals(stringLength);
      case JSchemaPackage.PRIMITIVE_PROPERTIES__PATTERN_STRING:
        return PATTERN_STRING_EDEFAULT == null ? patternString != null : !PATTERN_STRING_EDEFAULT.equals(patternString);
      case JSchemaPackage.PRIMITIVE_PROPERTIES__STRING_FORMAT:
        return stringFormat != STRING_FORMAT_EDEFAULT;
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
    result.append(" (stringLength: ");
    result.append(stringLength);
    result.append(", patternString: ");
    result.append(patternString);
    result.append(", stringFormat: ");
    result.append(stringFormat);
    result.append(')');
    return result.toString();
  }

} //PrimitivePropertiesImpl

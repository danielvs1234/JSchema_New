/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getStringLength <em>String Length</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getStringFormat <em>String Format</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveProperties()
 * @model
 * @generated
 */
public interface PrimitiveProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>String Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Length</em>' attribute.
   * @see #setStringLength(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveProperties_StringLength()
   * @model
   * @generated
   */
  String getStringLength();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getStringLength <em>String Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Length</em>' attribute.
   * @see #getStringLength()
   * @generated
   */
  void setStringLength(String value);

  /**
   * Returns the value of the '<em><b>Pattern String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern String</em>' attribute.
   * @see #setPatternString(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveProperties_PatternString()
   * @model
   * @generated
   */
  String getPatternString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getPatternString <em>Pattern String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern String</em>' attribute.
   * @see #getPatternString()
   * @generated
   */
  void setPatternString(String value);

  /**
   * Returns the value of the '<em><b>String Format</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.jSchema.FormatTypes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Format</em>' attribute.
   * @see org.xtext.example.mydsl.jSchema.FormatTypes
   * @see #setStringFormat(FormatTypes)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveProperties_StringFormat()
   * @model
   * @generated
   */
  FormatTypes getStringFormat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveProperties#getStringFormat <em>String Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Format</em>' attribute.
   * @see org.xtext.example.mydsl.jSchema.FormatTypes
   * @see #getStringFormat()
   * @generated
   */
  void setStringFormat(FormatTypes value);

} // PrimitiveProperties

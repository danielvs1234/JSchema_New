/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveTypes()
 * @model
 * @generated
 */
public interface PrimitiveTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveTypes_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Array)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveTypes_Array()
   * @model containment="true"
   * @generated
   */
  Array getArray();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Array value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(org.xtext.example.mydsl.jSchema.Number)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getPrimitiveTypes_Number()
   * @model containment="true"
   * @generated
   */
  org.xtext.example.mydsl.jSchema.Number getNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.PrimitiveTypes#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(org.xtext.example.mydsl.jSchema.Number value);

} // PrimitiveTypes

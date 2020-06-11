/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getExtendsID <em>Extends ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getOverRiddenProperties <em>Over Ridden Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject()
 * @model
 * @generated
 */
public interface ExtendedObject extends AbstractObject
{
  /**
   * Returns the value of the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Name</em>' attribute.
   * @see #setObjectName(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_ObjectName()
   * @model
   * @generated
   */
  String getObjectName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getObjectName <em>Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Name</em>' attribute.
   * @see #getObjectName()
   * @generated
   */
  void setObjectName(String value);

  /**
   * Returns the value of the '<em><b>Extends ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends ID</em>' attribute.
   * @see #setExtendsID(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_ExtendsID()
   * @model
   * @generated
   */
  String getExtendsID();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getExtendsID <em>Extends ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends ID</em>' attribute.
   * @see #getExtendsID()
   * @generated
   */
  void setExtendsID(String value);

  /**
   * Returns the value of the '<em><b>Over Ridden Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.jSchema.hasProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Over Ridden Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_OverRiddenProperties()
   * @model containment="true"
   * @generated
   */
  EList<hasProperties> getOverRiddenProperties();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.jSchema.hasProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<hasProperties> getProperties();

} // ExtendedObject

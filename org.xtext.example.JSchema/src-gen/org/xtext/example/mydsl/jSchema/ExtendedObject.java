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
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getExObjectName <em>Ex Object Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getExtendsID <em>Extends ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getIncludeObjects <em>Include Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject()
 * @model
 * @generated
 */
public interface ExtendedObject extends AbstractObject
{
  /**
   * Returns the value of the '<em><b>Ex Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex Object Name</em>' attribute.
   * @see #setExObjectName(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_ExObjectName()
   * @model
   * @generated
   */
  String getExObjectName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getExObjectName <em>Ex Object Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex Object Name</em>' attribute.
   * @see #getExObjectName()
   * @generated
   */
  void setExObjectName(String value);

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
   * Returns the value of the '<em><b>Include Objects</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Objects</em>' containment reference.
   * @see #setIncludeObjects(Includes)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_IncludeObjects()
   * @model containment="true"
   * @generated
   */
  Includes getIncludeObjects();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedObject#getIncludeObjects <em>Include Objects</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Objects</em>' containment reference.
   * @see #getIncludeObjects()
   * @generated
   */
  void setIncludeObjects(Includes value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.jSchema.ExtendedProperties}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedObject_Body()
   * @model containment="true"
   * @generated
   */
  EList<ExtendedProperties> getBody();

} // ExtendedObject

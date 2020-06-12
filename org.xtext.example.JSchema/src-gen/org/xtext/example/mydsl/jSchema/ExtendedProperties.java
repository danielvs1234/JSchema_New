/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedProperties#getOverride <em>Override</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.ExtendedProperties#getExtendedProperties <em>Extended Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedProperties()
 * @model
 * @generated
 */
public interface ExtendedProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see #setOverride(String)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedProperties_Override()
   * @model
   * @generated
   */
  String getOverride();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedProperties#getOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see #getOverride()
   * @generated
   */
  void setOverride(String value);

  /**
   * Returns the value of the '<em><b>Extended Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Properties</em>' containment reference.
   * @see #setExtendedProperties(hasProperties)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getExtendedProperties_ExtendedProperties()
   * @model containment="true"
   * @generated
   */
  hasProperties getExtendedProperties();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.ExtendedProperties#getExtendedProperties <em>Extended Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extended Properties</em>' containment reference.
   * @see #getExtendedProperties()
   * @generated
   */
  void setExtendedProperties(hasProperties value);

} // ExtendedProperties

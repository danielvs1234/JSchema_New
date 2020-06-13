/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.Property#getPropPrim <em>Prop Prim</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.Property#getPropObj <em>Prop Obj</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.Property#getPropExtObj <em>Prop Ext Obj</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Prop Prim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Prim</em>' containment reference.
   * @see #setPropPrim(PrimitiveObject)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getProperty_PropPrim()
   * @model containment="true"
   * @generated
   */
  PrimitiveObject getPropPrim();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.Property#getPropPrim <em>Prop Prim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Prim</em>' containment reference.
   * @see #getPropPrim()
   * @generated
   */
  void setPropPrim(PrimitiveObject value);

  /**
   * Returns the value of the '<em><b>Prop Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Obj</em>' containment reference.
   * @see #setPropObj(MainObject)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getProperty_PropObj()
   * @model containment="true"
   * @generated
   */
  MainObject getPropObj();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.Property#getPropObj <em>Prop Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Obj</em>' containment reference.
   * @see #getPropObj()
   * @generated
   */
  void setPropObj(MainObject value);

  /**
   * Returns the value of the '<em><b>Prop Ext Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop Ext Obj</em>' containment reference.
   * @see #setPropExtObj(ExtendedObject)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#getProperty_PropExtObj()
   * @model containment="true"
   * @generated
   */
  ExtendedObject getPropExtObj();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.Property#getPropExtObj <em>Prop Ext Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop Ext Obj</em>' containment reference.
   * @see #getPropExtObj()
   * @generated
   */
  void setPropExtObj(ExtendedObject value);

} // Property

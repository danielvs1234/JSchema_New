/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage
 * @generated
 */
public interface JSchemaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JSchemaFactory eINSTANCE = org.xtext.example.mydsl.jSchema.impl.JSchemaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Abstract Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Object</em>'.
   * @generated
   */
  AbstractObject createAbstractObject();

  /**
   * Returns a new object of class '<em>Main Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Object</em>'.
   * @generated
   */
  MainObject createMainObject();

  /**
   * Returns a new object of class '<em>Primitive Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Object</em>'.
   * @generated
   */
  PrimitiveObject createPrimitiveObject();

  /**
   * Returns a new object of class '<em>Extended Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Object</em>'.
   * @generated
   */
  ExtendedObject createExtendedObject();

  /**
   * Returns a new object of class '<em>Extended Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Properties</em>'.
   * @generated
   */
  ExtendedProperties createExtendedProperties();

  /**
   * Returns a new object of class '<em>Primitive Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Types</em>'.
   * @generated
   */
  PrimitiveTypes createPrimitiveTypes();

  /**
   * Returns a new object of class '<em>Is Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Root</em>'.
   * @generated
   */
  IsRoot createIsRoot();

  /**
   * Returns a new object of class '<em>has Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>has Properties</em>'.
   * @generated
   */
  hasProperties createhasProperties();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Primitive Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Properties</em>'.
   * @generated
   */
  PrimitiveProperties createPrimitiveProperties();

  /**
   * Returns a new object of class '<em>Includes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Includes</em>'.
   * @generated
   */
  Includes createIncludes();

  /**
   * Returns a new object of class '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array</em>'.
   * @generated
   */
  Array createArray();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JSchemaPackage getJSchemaPackage();

} //JSchemaFactory

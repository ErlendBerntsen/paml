/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.paml.pAML.PAMLPackage
 * @generated
 */
public interface PAMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PAMLFactory eINSTANCE = org.xtext.example.paml.pAML.impl.PAMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PAML</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PAML</em>'.
   * @generated
   */
  PAML createPAML();

  /**
   * Returns a new object of class '<em>Meta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta</em>'.
   * @generated
   */
  Meta createMeta();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PAMLPackage getPAMLPackage();

} //PAMLFactory

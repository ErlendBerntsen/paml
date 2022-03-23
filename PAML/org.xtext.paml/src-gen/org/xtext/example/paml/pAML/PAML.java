/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PAML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.paml.pAML.PAML#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.PAML#getPrecode <em>Precode</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.PAML#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.PAML#getPostcode <em>Postcode</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.paml.pAML.PAMLPackage#getPAML()
 * @model
 * @generated
 */
public interface PAML extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Information</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Information</em>' containment reference.
   * @see #setMetaInformation(Meta)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getPAML_MetaInformation()
   * @model containment="true"
   * @generated
   */
  Meta getMetaInformation();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.PAML#getMetaInformation <em>Meta Information</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Information</em>' containment reference.
   * @see #getMetaInformation()
   * @generated
   */
  void setMetaInformation(Meta value);

  /**
   * Returns the value of the '<em><b>Precode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precode</em>' attribute.
   * @see #setPrecode(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getPAML_Precode()
   * @model
   * @generated
   */
  String getPrecode();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.PAML#getPrecode <em>Precode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precode</em>' attribute.
   * @see #getPrecode()
   * @generated
   */
  void setPrecode(String value);

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference.
   * @see #setTasks(Task)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getPAML_Tasks()
   * @model containment="true"
   * @generated
   */
  Task getTasks();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.PAML#getTasks <em>Tasks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tasks</em>' containment reference.
   * @see #getTasks()
   * @generated
   */
  void setTasks(Task value);

  /**
   * Returns the value of the '<em><b>Postcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postcode</em>' attribute.
   * @see #setPostcode(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getPAML_Postcode()
   * @model
   * @generated
   */
  String getPostcode();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.PAML#getPostcode <em>Postcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcode</em>' attribute.
   * @see #getPostcode()
   * @generated
   */
  void setPostcode(String value);

} // PAML

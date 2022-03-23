/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.paml.pAML.Meta#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Meta#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Meta#getListRotation <em>List Rotation</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Meta#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.paml.pAML.PAMLPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getMeta_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Meta#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>List Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.paml.pAML.ListStyle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Style</em>' attribute.
   * @see org.xtext.example.paml.pAML.ListStyle
   * @see #setListStyle(ListStyle)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getMeta_ListStyle()
   * @model
   * @generated
   */
  ListStyle getListStyle();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Meta#getListStyle <em>List Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Style</em>' attribute.
   * @see org.xtext.example.paml.pAML.ListStyle
   * @see #getListStyle()
   * @generated
   */
  void setListStyle(ListStyle value);

  /**
   * Returns the value of the '<em><b>List Rotation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.paml.pAML.ListRotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Rotation</em>' attribute.
   * @see org.xtext.example.paml.pAML.ListRotation
   * @see #setListRotation(ListRotation)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getMeta_ListRotation()
   * @model
   * @generated
   */
  ListRotation getListRotation();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Meta#getListRotation <em>List Rotation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Rotation</em>' attribute.
   * @see org.xtext.example.paml.pAML.ListRotation
   * @see #getListRotation()
   * @generated
   */
  void setListRotation(ListRotation value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getMeta_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Meta#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // Meta
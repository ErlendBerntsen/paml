/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.paml.pAML.Task#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Task#getCode <em>Code</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Task#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.Task#getSubtasks <em>Subtasks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.paml.pAML.PAMLPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getTask_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Task#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getTask_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Task#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' attribute.
   * @see #setTest(String)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getTask_Test()
   * @model
   * @generated
   */
  String getTest();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Task#getTest <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' attribute.
   * @see #getTest()
   * @generated
   */
  void setTest(String value);

  /**
   * Returns the value of the '<em><b>Subtasks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtasks</em>' containment reference.
   * @see #setSubtasks(Task)
   * @see org.xtext.example.paml.pAML.PAMLPackage#getTask_Subtasks()
   * @model containment="true"
   * @generated
   */
  Task getSubtasks();

  /**
   * Sets the value of the '{@link org.xtext.example.paml.pAML.Task#getSubtasks <em>Subtasks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtasks</em>' containment reference.
   * @see #getSubtasks()
   * @generated
   */
  void setSubtasks(Task value);

} // Task

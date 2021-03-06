/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.paml.pAML.PAMLFactory
 * @model kind="package"
 * @generated
 */
public interface PAMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pAML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/paml/PAML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pAML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PAMLPackage eINSTANCE = org.xtext.example.paml.pAML.impl.PAMLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.paml.pAML.impl.PAMLImpl <em>PAML</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.paml.pAML.impl.PAMLImpl
   * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getPAML()
   * @generated
   */
  int PAML = 0;

  /**
   * The feature id for the '<em><b>Meta Information</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAML__META_INFORMATION = 0;

  /**
   * The feature id for the '<em><b>Precode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAML__PRECODE = 1;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAML__TASKS = 2;

  /**
   * The feature id for the '<em><b>Postcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAML__POSTCODE = 3;

  /**
   * The number of structural features of the '<em>PAML</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAML_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.paml.pAML.impl.MetaImpl <em>Meta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.paml.pAML.impl.MetaImpl
   * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getMeta()
   * @generated
   */
  int META = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__NAME = 0;

  /**
   * The feature id for the '<em><b>List Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__LIST_STYLE = 1;

  /**
   * The feature id for the '<em><b>List Rotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__LIST_ROTATION = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__STRING = 3;

  /**
   * The number of structural features of the '<em>Meta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.paml.pAML.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.paml.pAML.impl.TaskImpl
   * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STRING = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__CODE = 1;

  /**
   * The feature id for the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TEST = 2;

  /**
   * The feature id for the '<em><b>Subtasks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__SUBTASKS = 3;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.paml.pAML.ListStyle <em>List Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.paml.pAML.ListStyle
   * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getListStyle()
   * @generated
   */
  int LIST_STYLE = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.paml.pAML.ListRotation <em>List Rotation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.paml.pAML.ListRotation
   * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getListRotation()
   * @generated
   */
  int LIST_ROTATION = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.paml.pAML.PAML <em>PAML</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PAML</em>'.
   * @see org.xtext.example.paml.pAML.PAML
   * @generated
   */
  EClass getPAML();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.paml.pAML.PAML#getMetaInformation <em>Meta Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Information</em>'.
   * @see org.xtext.example.paml.pAML.PAML#getMetaInformation()
   * @see #getPAML()
   * @generated
   */
  EReference getPAML_MetaInformation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.PAML#getPrecode <em>Precode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precode</em>'.
   * @see org.xtext.example.paml.pAML.PAML#getPrecode()
   * @see #getPAML()
   * @generated
   */
  EAttribute getPAML_Precode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.paml.pAML.PAML#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tasks</em>'.
   * @see org.xtext.example.paml.pAML.PAML#getTasks()
   * @see #getPAML()
   * @generated
   */
  EReference getPAML_Tasks();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.PAML#getPostcode <em>Postcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postcode</em>'.
   * @see org.xtext.example.paml.pAML.PAML#getPostcode()
   * @see #getPAML()
   * @generated
   */
  EAttribute getPAML_Postcode();

  /**
   * Returns the meta object for class '{@link org.xtext.example.paml.pAML.Meta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta</em>'.
   * @see org.xtext.example.paml.pAML.Meta
   * @generated
   */
  EClass getMeta();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Meta#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.paml.pAML.Meta#getName()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Meta#getListStyle <em>List Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Style</em>'.
   * @see org.xtext.example.paml.pAML.Meta#getListStyle()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_ListStyle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Meta#getListRotation <em>List Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Rotation</em>'.
   * @see org.xtext.example.paml.pAML.Meta#getListRotation()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_ListRotation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Meta#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.paml.pAML.Meta#getString()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_String();

  /**
   * Returns the meta object for class '{@link org.xtext.example.paml.pAML.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.example.paml.pAML.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Task#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.paml.pAML.Task#getString()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Task#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.example.paml.pAML.Task#getCode()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Code();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.paml.pAML.Task#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test</em>'.
   * @see org.xtext.example.paml.pAML.Task#getTest()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Test();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.paml.pAML.Task#getSubtasks <em>Subtasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtasks</em>'.
   * @see org.xtext.example.paml.pAML.Task#getSubtasks()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Subtasks();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.paml.pAML.ListStyle <em>List Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>List Style</em>'.
   * @see org.xtext.example.paml.pAML.ListStyle
   * @generated
   */
  EEnum getListStyle();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.paml.pAML.ListRotation <em>List Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>List Rotation</em>'.
   * @see org.xtext.example.paml.pAML.ListRotation
   * @generated
   */
  EEnum getListRotation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PAMLFactory getPAMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.paml.pAML.impl.PAMLImpl <em>PAML</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.paml.pAML.impl.PAMLImpl
     * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getPAML()
     * @generated
     */
    EClass PAML = eINSTANCE.getPAML();

    /**
     * The meta object literal for the '<em><b>Meta Information</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAML__META_INFORMATION = eINSTANCE.getPAML_MetaInformation();

    /**
     * The meta object literal for the '<em><b>Precode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAML__PRECODE = eINSTANCE.getPAML_Precode();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAML__TASKS = eINSTANCE.getPAML_Tasks();

    /**
     * The meta object literal for the '<em><b>Postcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAML__POSTCODE = eINSTANCE.getPAML_Postcode();

    /**
     * The meta object literal for the '{@link org.xtext.example.paml.pAML.impl.MetaImpl <em>Meta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.paml.pAML.impl.MetaImpl
     * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getMeta()
     * @generated
     */
    EClass META = eINSTANCE.getMeta();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__NAME = eINSTANCE.getMeta_Name();

    /**
     * The meta object literal for the '<em><b>List Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__LIST_STYLE = eINSTANCE.getMeta_ListStyle();

    /**
     * The meta object literal for the '<em><b>List Rotation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__LIST_ROTATION = eINSTANCE.getMeta_ListRotation();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__STRING = eINSTANCE.getMeta_String();

    /**
     * The meta object literal for the '{@link org.xtext.example.paml.pAML.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.paml.pAML.impl.TaskImpl
     * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__STRING = eINSTANCE.getTask_String();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__CODE = eINSTANCE.getTask_Code();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TEST = eINSTANCE.getTask_Test();

    /**
     * The meta object literal for the '<em><b>Subtasks</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__SUBTASKS = eINSTANCE.getTask_Subtasks();

    /**
     * The meta object literal for the '{@link org.xtext.example.paml.pAML.ListStyle <em>List Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.paml.pAML.ListStyle
     * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getListStyle()
     * @generated
     */
    EEnum LIST_STYLE = eINSTANCE.getListStyle();

    /**
     * The meta object literal for the '{@link org.xtext.example.paml.pAML.ListRotation <em>List Rotation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.paml.pAML.ListRotation
     * @see org.xtext.example.paml.pAML.impl.PAMLPackageImpl#getListRotation()
     * @generated
     */
    EEnum LIST_ROTATION = eINSTANCE.getListRotation();

  }

} //PAMLPackage

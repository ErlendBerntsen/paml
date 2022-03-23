/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.paml.pAML.PAMLPackage;
import org.xtext.example.paml.pAML.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.paml.pAML.impl.TaskImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.impl.TaskImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.impl.TaskImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.paml.pAML.impl.TaskImpl#getSubtasks <em>Subtasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
{
  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected String code = CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected static final String TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected String test = TEST_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubtasks() <em>Subtasks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtasks()
   * @generated
   * @ordered
   */
  protected Task subtasks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PAMLPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PAMLPackage.TASK__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCode(String newCode)
  {
    String oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PAMLPackage.TASK__CODE, oldCode, code));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTest(String newTest)
  {
    String oldTest = test;
    test = newTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PAMLPackage.TASK__TEST, oldTest, test));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Task getSubtasks()
  {
    return subtasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubtasks(Task newSubtasks, NotificationChain msgs)
  {
    Task oldSubtasks = subtasks;
    subtasks = newSubtasks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMLPackage.TASK__SUBTASKS, oldSubtasks, newSubtasks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubtasks(Task newSubtasks)
  {
    if (newSubtasks != subtasks)
    {
      NotificationChain msgs = null;
      if (subtasks != null)
        msgs = ((InternalEObject)subtasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMLPackage.TASK__SUBTASKS, null, msgs);
      if (newSubtasks != null)
        msgs = ((InternalEObject)newSubtasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMLPackage.TASK__SUBTASKS, null, msgs);
      msgs = basicSetSubtasks(newSubtasks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PAMLPackage.TASK__SUBTASKS, newSubtasks, newSubtasks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PAMLPackage.TASK__SUBTASKS:
        return basicSetSubtasks(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PAMLPackage.TASK__STRING:
        return getString();
      case PAMLPackage.TASK__CODE:
        return getCode();
      case PAMLPackage.TASK__TEST:
        return getTest();
      case PAMLPackage.TASK__SUBTASKS:
        return getSubtasks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PAMLPackage.TASK__STRING:
        setString((String)newValue);
        return;
      case PAMLPackage.TASK__CODE:
        setCode((String)newValue);
        return;
      case PAMLPackage.TASK__TEST:
        setTest((String)newValue);
        return;
      case PAMLPackage.TASK__SUBTASKS:
        setSubtasks((Task)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PAMLPackage.TASK__STRING:
        setString(STRING_EDEFAULT);
        return;
      case PAMLPackage.TASK__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case PAMLPackage.TASK__TEST:
        setTest(TEST_EDEFAULT);
        return;
      case PAMLPackage.TASK__SUBTASKS:
        setSubtasks((Task)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PAMLPackage.TASK__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case PAMLPackage.TASK__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
      case PAMLPackage.TASK__TEST:
        return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
      case PAMLPackage.TASK__SUBTASKS:
        return subtasks != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (string: ");
    result.append(string);
    result.append(", code: ");
    result.append(code);
    result.append(", test: ");
    result.append(test);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
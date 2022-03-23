/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.paml.pAML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>List Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.paml.pAML.PAMLPackage#getListStyle()
 * @model
 * @generated
 */
public enum ListStyle implements Enumerator
{
  /**
   * The '<em><b>NUMBERS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBERS_VALUE
   * @generated
   * @ordered
   */
  NUMBERS(0, "NUMBERS", "numbers"),

  /**
   * The '<em><b>LETTERS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LETTERS_VALUE
   * @generated
   * @ordered
   */
  LETTERS(1, "LETTERS", "letters"),

  /**
   * The '<em><b>ROMAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROMAN_VALUE
   * @generated
   * @ordered
   */
  ROMAN(2, "ROMAN", "roman");

  /**
   * The '<em><b>NUMBERS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBERS
   * @model literal="numbers"
   * @generated
   * @ordered
   */
  public static final int NUMBERS_VALUE = 0;

  /**
   * The '<em><b>LETTERS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LETTERS
   * @model literal="letters"
   * @generated
   * @ordered
   */
  public static final int LETTERS_VALUE = 1;

  /**
   * The '<em><b>ROMAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROMAN
   * @model literal="roman"
   * @generated
   * @ordered
   */
  public static final int ROMAN_VALUE = 2;

  /**
   * An array of all the '<em><b>List Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ListStyle[] VALUES_ARRAY =
    new ListStyle[]
    {
      NUMBERS,
      LETTERS,
      ROMAN,
    };

  /**
   * A public read-only list of all the '<em><b>List Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ListStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>List Style</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ListStyle get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ListStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>List Style</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ListStyle getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ListStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>List Style</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ListStyle get(int value)
  {
    switch (value)
    {
      case NUMBERS_VALUE: return NUMBERS;
      case LETTERS_VALUE: return LETTERS;
      case ROMAN_VALUE: return ROMAN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ListStyle(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ListStyle
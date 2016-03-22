/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Plane#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Plane#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Plane#getMotorisation <em>Motorisation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlane_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Plane#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Passengers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Passengers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Passengers</em>' attribute.
   * @see #setPassengers(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlane_Passengers()
   * @model
   * @generated
   */
  int getPassengers();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Plane#getPassengers <em>Passengers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Passengers</em>' attribute.
   * @see #getPassengers()
   * @generated
   */
  void setPassengers(int value);

  /**
   * Returns the value of the '<em><b>Motorisation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Engines}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Motorisation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Motorisation</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Engines
   * @see #setMotorisation(Engines)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlane_Motorisation()
   * @model
   * @generated
   */
  Engines getMotorisation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Plane#getMotorisation <em>Motorisation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Motorisation</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Engines
   * @see #getMotorisation()
   * @generated
   */
  void setMotorisation(Engines value);

} // Plane
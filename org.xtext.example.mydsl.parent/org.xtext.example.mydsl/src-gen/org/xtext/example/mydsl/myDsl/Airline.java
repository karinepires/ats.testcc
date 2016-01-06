/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getCompany <em>Company</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getDeparture <em>Departure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getArrival <em>Arrival</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Airline#isRegular <em>Regular</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline()
 * @model
 * @generated
 */
public interface Airline extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Plane</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plane</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plane</em>' reference.
   * @see #setPlane(Plane)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Plane()
   * @model
   * @generated
   */
  Plane getPlane();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getPlane <em>Plane</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plane</em>' reference.
   * @see #getPlane()
   * @generated
   */
  void setPlane(Plane value);

  /**
   * Returns the value of the '<em><b>Company</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Company</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Company</em>' attribute.
   * @see #setCompany(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Company()
   * @model
   * @generated
   */
  String getCompany();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getCompany <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Company</em>' attribute.
   * @see #getCompany()
   * @generated
   */
  void setCompany(String value);

  /**
   * Returns the value of the '<em><b>Departure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Departure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Departure</em>' reference.
   * @see #setDeparture(CodeOACI)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Departure()
   * @model
   * @generated
   */
  CodeOACI getDeparture();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getDeparture <em>Departure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Departure</em>' reference.
   * @see #getDeparture()
   * @generated
   */
  void setDeparture(CodeOACI value);

  /**
   * Returns the value of the '<em><b>Arrival</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival</em>' reference.
   * @see #setArrival(CodeOACI)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Arrival()
   * @model
   * @generated
   */
  CodeOACI getArrival();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getArrival <em>Arrival</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival</em>' reference.
   * @see #getArrival()
   * @generated
   */
  void setArrival(CodeOACI value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Duration()
   * @model
   * @generated
   */
  String getDuration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(String value);

  /**
   * Returns the value of the '<em><b>Regular</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regular</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regular</em>' attribute.
   * @see #setRegular(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAirline_Regular()
   * @model
   * @generated
   */
  boolean isRegular();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Airline#isRegular <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regular</em>' attribute.
   * @see #isRegular()
   * @generated
   */
  void setRegular(boolean value);

} // Airline

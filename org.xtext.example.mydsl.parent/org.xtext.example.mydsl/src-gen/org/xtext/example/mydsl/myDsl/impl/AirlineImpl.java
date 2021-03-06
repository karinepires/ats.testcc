/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Airline;
import org.xtext.example.mydsl.myDsl.CodeOACI;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Plane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getDeparture <em>Departure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getArrival <em>Arrival</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AirlineImpl#isRegular <em>Regular</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirlineImpl extends MinimalEObjectImpl.Container implements Airline
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlane() <em>Plane</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlane()
   * @generated
   * @ordered
   */
  protected Plane plane;

  /**
   * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompany()
   * @generated
   * @ordered
   */
  protected static final String COMPANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompany()
   * @generated
   * @ordered
   */
  protected String company = COMPANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeparture() <em>Departure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeparture()
   * @generated
   * @ordered
   */
  protected CodeOACI departure;

  /**
   * The cached value of the '{@link #getArrival() <em>Arrival</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrival()
   * @generated
   * @ordered
   */
  protected CodeOACI arrival;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final String DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected String duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #isRegular() <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegular()
   * @generated
   * @ordered
   */
  protected static final boolean REGULAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRegular() <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegular()
   * @generated
   * @ordered
   */
  protected boolean regular = REGULAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AirlineImpl()
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
    return MyDslPackage.Literals.AIRLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plane getPlane()
  {
    if (plane != null && plane.eIsProxy())
    {
      InternalEObject oldPlane = (InternalEObject)plane;
      plane = (Plane)eResolveProxy(oldPlane);
      if (plane != oldPlane)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.AIRLINE__PLANE, oldPlane, plane));
      }
    }
    return plane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plane basicGetPlane()
  {
    return plane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlane(Plane newPlane)
  {
    Plane oldPlane = plane;
    plane = newPlane;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__PLANE, oldPlane, plane));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompany()
  {
    return company;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompany(String newCompany)
  {
    String oldCompany = company;
    company = newCompany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__COMPANY, oldCompany, company));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI getDeparture()
  {
    if (departure != null && departure.eIsProxy())
    {
      InternalEObject oldDeparture = (InternalEObject)departure;
      departure = (CodeOACI)eResolveProxy(oldDeparture);
      if (departure != oldDeparture)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.AIRLINE__DEPARTURE, oldDeparture, departure));
      }
    }
    return departure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI basicGetDeparture()
  {
    return departure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeparture(CodeOACI newDeparture)
  {
    CodeOACI oldDeparture = departure;
    departure = newDeparture;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__DEPARTURE, oldDeparture, departure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI getArrival()
  {
    if (arrival != null && arrival.eIsProxy())
    {
      InternalEObject oldArrival = (InternalEObject)arrival;
      arrival = (CodeOACI)eResolveProxy(oldArrival);
      if (arrival != oldArrival)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.AIRLINE__ARRIVAL, oldArrival, arrival));
      }
    }
    return arrival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI basicGetArrival()
  {
    return arrival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrival(CodeOACI newArrival)
  {
    CodeOACI oldArrival = arrival;
    arrival = newArrival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__ARRIVAL, oldArrival, arrival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(String newDuration)
  {
    String oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRegular()
  {
    return regular;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegular(boolean newRegular)
  {
    boolean oldRegular = regular;
    regular = newRegular;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AIRLINE__REGULAR, oldRegular, regular));
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
      case MyDslPackage.AIRLINE__NAME:
        return getName();
      case MyDslPackage.AIRLINE__PLANE:
        if (resolve) return getPlane();
        return basicGetPlane();
      case MyDslPackage.AIRLINE__COMPANY:
        return getCompany();
      case MyDslPackage.AIRLINE__DEPARTURE:
        if (resolve) return getDeparture();
        return basicGetDeparture();
      case MyDslPackage.AIRLINE__ARRIVAL:
        if (resolve) return getArrival();
        return basicGetArrival();
      case MyDslPackage.AIRLINE__DURATION:
        return getDuration();
      case MyDslPackage.AIRLINE__REGULAR:
        return isRegular();
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
      case MyDslPackage.AIRLINE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.AIRLINE__PLANE:
        setPlane((Plane)newValue);
        return;
      case MyDslPackage.AIRLINE__COMPANY:
        setCompany((String)newValue);
        return;
      case MyDslPackage.AIRLINE__DEPARTURE:
        setDeparture((CodeOACI)newValue);
        return;
      case MyDslPackage.AIRLINE__ARRIVAL:
        setArrival((CodeOACI)newValue);
        return;
      case MyDslPackage.AIRLINE__DURATION:
        setDuration((String)newValue);
        return;
      case MyDslPackage.AIRLINE__REGULAR:
        setRegular((Boolean)newValue);
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
      case MyDslPackage.AIRLINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.AIRLINE__PLANE:
        setPlane((Plane)null);
        return;
      case MyDslPackage.AIRLINE__COMPANY:
        setCompany(COMPANY_EDEFAULT);
        return;
      case MyDslPackage.AIRLINE__DEPARTURE:
        setDeparture((CodeOACI)null);
        return;
      case MyDslPackage.AIRLINE__ARRIVAL:
        setArrival((CodeOACI)null);
        return;
      case MyDslPackage.AIRLINE__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case MyDslPackage.AIRLINE__REGULAR:
        setRegular(REGULAR_EDEFAULT);
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
      case MyDslPackage.AIRLINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.AIRLINE__PLANE:
        return plane != null;
      case MyDslPackage.AIRLINE__COMPANY:
        return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
      case MyDslPackage.AIRLINE__DEPARTURE:
        return departure != null;
      case MyDslPackage.AIRLINE__ARRIVAL:
        return arrival != null;
      case MyDslPackage.AIRLINE__DURATION:
        return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
      case MyDslPackage.AIRLINE__REGULAR:
        return regular != REGULAR_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", company: ");
    result.append(company);
    result.append(", duration: ");
    result.append(duration);
    result.append(", regular: ");
    result.append(regular);
    result.append(')');
    return result.toString();
  }

} //AirlineImpl

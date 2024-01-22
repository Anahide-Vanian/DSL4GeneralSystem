/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeStatePhrase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative State Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeStatePhraseImpl#getEpsp <em>Epsp</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeStatePhraseImpl#getEsp <em>Esp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeStatePhraseImpl extends MinimalEObjectImpl.Container implements ImperativeStatePhrase
{
  /**
   * The cached value of the '{@link #getEpsp() <em>Epsp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpsp()
   * @generated
   * @ordered
   */
  protected ImperativeEntityPropertyStatePhrase epsp;

  /**
   * The cached value of the '{@link #getEsp() <em>Esp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEsp()
   * @generated
   * @ordered
   */
  protected ImperativeEntityStatePhrase esp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperativeStatePhraseImpl()
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
    return BddDslPackage.Literals.IMPERATIVE_STATE_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeEntityPropertyStatePhrase getEpsp()
  {
    return epsp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEpsp(ImperativeEntityPropertyStatePhrase newEpsp, NotificationChain msgs)
  {
    ImperativeEntityPropertyStatePhrase oldEpsp = epsp;
    epsp = newEpsp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP, oldEpsp, newEpsp);
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
  public void setEpsp(ImperativeEntityPropertyStatePhrase newEpsp)
  {
    if (newEpsp != epsp)
    {
      NotificationChain msgs = null;
      if (epsp != null)
        msgs = ((InternalEObject)epsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP, null, msgs);
      if (newEpsp != null)
        msgs = ((InternalEObject)newEpsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP, null, msgs);
      msgs = basicSetEpsp(newEpsp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP, newEpsp, newEpsp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeEntityStatePhrase getEsp()
  {
    return esp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEsp(ImperativeEntityStatePhrase newEsp, NotificationChain msgs)
  {
    ImperativeEntityStatePhrase oldEsp = esp;
    esp = newEsp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP, oldEsp, newEsp);
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
  public void setEsp(ImperativeEntityStatePhrase newEsp)
  {
    if (newEsp != esp)
    {
      NotificationChain msgs = null;
      if (esp != null)
        msgs = ((InternalEObject)esp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP, null, msgs);
      if (newEsp != null)
        msgs = ((InternalEObject)newEsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP, null, msgs);
      msgs = basicSetEsp(newEsp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP, newEsp, newEsp));
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
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP:
        return basicSetEpsp(null, msgs);
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP:
        return basicSetEsp(null, msgs);
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
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP:
        return getEpsp();
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP:
        return getEsp();
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
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP:
        setEpsp((ImperativeEntityPropertyStatePhrase)newValue);
        return;
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP:
        setEsp((ImperativeEntityStatePhrase)newValue);
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
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP:
        setEpsp((ImperativeEntityPropertyStatePhrase)null);
        return;
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP:
        setEsp((ImperativeEntityStatePhrase)null);
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
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__EPSP:
        return epsp != null;
      case BddDslPackage.IMPERATIVE_STATE_PHRASE__ESP:
        return esp != null;
    }
    return super.eIsSet(featureID);
  }

} //ImperativeStatePhraseImpl
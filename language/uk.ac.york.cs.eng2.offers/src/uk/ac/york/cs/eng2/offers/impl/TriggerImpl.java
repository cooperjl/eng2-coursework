/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.eng2.offers.Offer;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Trigger;
import uk.ac.york.cs.eng2.offers.TriggerOn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl#getTriggerOn <em>Trigger On</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The default value of the '{@link #getTriggerOn() <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerOn TRIGGER_ON_EDEFAULT = TriggerOn.ALWAYS;

	/**
	 * The cached value of the '{@link #getTriggerOn() <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected TriggerOn triggerOn = TRIGGER_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected Offer offer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerOn getTriggerOn() {
		return triggerOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerOn(TriggerOn newTriggerOn) {
		TriggerOn oldTriggerOn = triggerOn;
		triggerOn = newTriggerOn == null ? TRIGGER_ON_EDEFAULT : newTriggerOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TRIGGER__TRIGGER_ON, oldTriggerOn, triggerOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer getOffer() {
		if (offer != null && offer.eIsProxy()) {
			InternalEObject oldOffer = (InternalEObject)offer;
			offer = (Offer)eResolveProxy(oldOffer);
			if (offer != oldOffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.TRIGGER__OFFER, oldOffer, offer));
			}
		}
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer basicGetOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffer(Offer newOffer) {
		Offer oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TRIGGER__OFFER, oldOffer, offer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.TRIGGER__TRIGGER_ON:
				return getTriggerOn();
			case OffersPackage.TRIGGER__OFFER:
				if (resolve) return getOffer();
				return basicGetOffer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.TRIGGER__TRIGGER_ON:
				setTriggerOn((TriggerOn)newValue);
				return;
			case OffersPackage.TRIGGER__OFFER:
				setOffer((Offer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OffersPackage.TRIGGER__TRIGGER_ON:
				setTriggerOn(TRIGGER_ON_EDEFAULT);
				return;
			case OffersPackage.TRIGGER__OFFER:
				setOffer((Offer)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OffersPackage.TRIGGER__TRIGGER_ON:
				return triggerOn != TRIGGER_ON_EDEFAULT;
			case OffersPackage.TRIGGER__OFFER:
				return offer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (triggerOn: ");
		result.append(triggerOn);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl

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
import uk.ac.york.cs.eng2.offers.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerType TRIGGER_TYPE_EDEFAULT = TriggerType.IF_MATCH;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TriggerType triggerType = TRIGGER_TYPE_EDEFAULT;

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
	public TriggerType getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerType(TriggerType newTriggerType) {
		TriggerType oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TRIGGER__TRIGGER_TYPE, oldTriggerType, triggerType));
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
			case OffersPackage.TRIGGER__TRIGGER_TYPE:
				return getTriggerType();
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
			case OffersPackage.TRIGGER__TRIGGER_TYPE:
				setTriggerType((TriggerType)newValue);
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
			case OffersPackage.TRIGGER__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
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
			case OffersPackage.TRIGGER__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
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
		result.append(" (triggerType: ");
		result.append(triggerType);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl

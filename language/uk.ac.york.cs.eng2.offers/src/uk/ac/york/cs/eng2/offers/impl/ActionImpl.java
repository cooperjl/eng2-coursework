/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.eng2.offers.Action;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl#getPercentageDiscount <em>Percentage Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl#getPriceDiscount <em>Price Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl#getSetPrice <em>Set Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getPercentageDiscount() <em>Percentage Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentageDiscount() <em>Percentage Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageDiscount()
	 * @generated
	 * @ordered
	 */
	protected float percentageDiscount = PERCENTAGE_DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceDiscount() <em>Price Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPriceDiscount() <em>Price Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceDiscount()
	 * @generated
	 * @ordered
	 */
	protected float priceDiscount = PRICE_DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetPrice() <em>Set Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float SET_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSetPrice() <em>Set Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPrice()
	 * @generated
	 * @ordered
	 */
	protected float setPrice = SET_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPercentageDiscount() {
		return percentageDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageDiscount(float newPercentageDiscount) {
		float oldPercentageDiscount = percentageDiscount;
		percentageDiscount = newPercentageDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ACTION__PERCENTAGE_DISCOUNT, oldPercentageDiscount, percentageDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPriceDiscount() {
		return priceDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceDiscount(float newPriceDiscount) {
		float oldPriceDiscount = priceDiscount;
		priceDiscount = newPriceDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ACTION__PRICE_DISCOUNT, oldPriceDiscount, priceDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSetPrice() {
		return setPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetPrice(float newSetPrice) {
		float oldSetPrice = setPrice;
		setPrice = newSetPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ACTION__SET_PRICE, oldSetPrice, setPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.ACTION__NAME:
				return getName();
			case OffersPackage.ACTION__PERCENTAGE_DISCOUNT:
				return getPercentageDiscount();
			case OffersPackage.ACTION__PRICE_DISCOUNT:
				return getPriceDiscount();
			case OffersPackage.ACTION__SET_PRICE:
				return getSetPrice();
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
			case OffersPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.ACTION__PERCENTAGE_DISCOUNT:
				setPercentageDiscount((Float)newValue);
				return;
			case OffersPackage.ACTION__PRICE_DISCOUNT:
				setPriceDiscount((Float)newValue);
				return;
			case OffersPackage.ACTION__SET_PRICE:
				setSetPrice((Float)newValue);
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
			case OffersPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.ACTION__PERCENTAGE_DISCOUNT:
				setPercentageDiscount(PERCENTAGE_DISCOUNT_EDEFAULT);
				return;
			case OffersPackage.ACTION__PRICE_DISCOUNT:
				setPriceDiscount(PRICE_DISCOUNT_EDEFAULT);
				return;
			case OffersPackage.ACTION__SET_PRICE:
				setSetPrice(SET_PRICE_EDEFAULT);
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
			case OffersPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.ACTION__PERCENTAGE_DISCOUNT:
				return percentageDiscount != PERCENTAGE_DISCOUNT_EDEFAULT;
			case OffersPackage.ACTION__PRICE_DISCOUNT:
				return priceDiscount != PRICE_DISCOUNT_EDEFAULT;
			case OffersPackage.ACTION__SET_PRICE:
				return setPrice != SET_PRICE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", percentageDiscount: ");
		result.append(percentageDiscount);
		result.append(", priceDiscount: ");
		result.append(priceDiscount);
		result.append(", setPrice: ");
		result.append(setPrice);
		result.append(')');
		return result.toString();
	}

} //ActionImpl

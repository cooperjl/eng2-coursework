/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Tag;
import uk.ac.york.cs.eng2.offers.TaggedDiscount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl#getQuantityDiscount <em>Quantity Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaggedDiscountImpl extends ActionImpl implements TaggedDiscount {
	/**
	 * The default value of the '{@link #getQuantityDiscount() <em>Quantity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_DISCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantityDiscount() <em>Quantity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDiscount()
	 * @generated
	 * @ordered
	 */
	protected int quantityDiscount = QUANTITY_DISCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedDiscountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.TAGGED_DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantityDiscount() {
		return quantityDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityDiscount(int newQuantityDiscount) {
		int oldQuantityDiscount = quantityDiscount;
		quantityDiscount = newQuantityDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TAGGED_DISCOUNT__QUANTITY_DISCOUNT, oldQuantityDiscount, quantityDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, OffersPackage.TAGGED_DISCOUNT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.TAGGED_DISCOUNT__QUANTITY_DISCOUNT:
				return getQuantityDiscount();
			case OffersPackage.TAGGED_DISCOUNT__TAGS:
				return getTags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.TAGGED_DISCOUNT__QUANTITY_DISCOUNT:
				setQuantityDiscount((Integer)newValue);
				return;
			case OffersPackage.TAGGED_DISCOUNT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case OffersPackage.TAGGED_DISCOUNT__QUANTITY_DISCOUNT:
				setQuantityDiscount(QUANTITY_DISCOUNT_EDEFAULT);
				return;
			case OffersPackage.TAGGED_DISCOUNT__TAGS:
				getTags().clear();
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
			case OffersPackage.TAGGED_DISCOUNT__QUANTITY_DISCOUNT:
				return quantityDiscount != QUANTITY_DISCOUNT_EDEFAULT;
			case OffersPackage.TAGGED_DISCOUNT__TAGS:
				return tags != null && !tags.isEmpty();
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
		result.append(" (quantityDiscount: ");
		result.append(quantityDiscount);
		result.append(')');
		return result.toString();
	}

} //TaggedDiscountImpl

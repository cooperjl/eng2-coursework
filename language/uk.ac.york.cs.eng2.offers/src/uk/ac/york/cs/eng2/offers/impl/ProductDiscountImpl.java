/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.ProductDiscount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl#getQuantityDiscount <em>Quantity Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductDiscountImpl extends ActionImpl implements ProductDiscount {
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
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDiscountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.PRODUCT_DISCOUNT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.PRODUCT_DISCOUNT__QUANTITY_DISCOUNT, oldQuantityDiscount, quantityDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.PRODUCT_DISCOUNT__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.PRODUCT_DISCOUNT__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.PRODUCT_DISCOUNT__QUANTITY_DISCOUNT:
				return getQuantityDiscount();
			case OffersPackage.PRODUCT_DISCOUNT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
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
			case OffersPackage.PRODUCT_DISCOUNT__QUANTITY_DISCOUNT:
				setQuantityDiscount((Integer)newValue);
				return;
			case OffersPackage.PRODUCT_DISCOUNT__PRODUCT:
				setProduct((Product)newValue);
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
			case OffersPackage.PRODUCT_DISCOUNT__QUANTITY_DISCOUNT:
				setQuantityDiscount(QUANTITY_DISCOUNT_EDEFAULT);
				return;
			case OffersPackage.PRODUCT_DISCOUNT__PRODUCT:
				setProduct((Product)null);
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
			case OffersPackage.PRODUCT_DISCOUNT__QUANTITY_DISCOUNT:
				return quantityDiscount != QUANTITY_DISCOUNT_EDEFAULT;
			case OffersPackage.PRODUCT_DISCOUNT__PRODUCT:
				return product != null;
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

} //ProductDiscountImpl

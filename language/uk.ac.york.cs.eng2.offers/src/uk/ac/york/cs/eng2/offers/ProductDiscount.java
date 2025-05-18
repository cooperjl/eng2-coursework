/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getQuantityDiscount <em>Quantity Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductDiscount()
 * @model
 * @generated
 */
public interface ProductDiscount extends Action {
	/**
	 * Returns the value of the '<em><b>Quantity Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Discount</em>' attribute.
	 * @see #setQuantityDiscount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductDiscount_QuantityDiscount()
	 * @model
	 * @generated
	 */
	int getQuantityDiscount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getQuantityDiscount <em>Quantity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Discount</em>' attribute.
	 * @see #getQuantityDiscount()
	 * @generated
	 */
	void setQuantityDiscount(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductDiscount_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // ProductDiscount

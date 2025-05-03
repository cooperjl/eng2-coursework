/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductCondition#getProduct <em>Product</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductCondition#getComparison <em>Comparison</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductCondition#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCondition()
 * @model
 * @generated
 */
public interface ProductCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCondition_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductCondition#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #setComparison(Comparison)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCondition_Comparison()
	 * @model
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductCondition#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCondition_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductCondition#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // ProductCondition

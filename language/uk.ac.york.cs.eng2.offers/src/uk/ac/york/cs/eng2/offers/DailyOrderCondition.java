/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daily Order Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getProduct <em>Product</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getComparison <em>Comparison</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getDailyOrderCondition()
 * @model
 * @generated
 */
public interface DailyOrderCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getDailyOrderCondition_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getProduct <em>Product</em>}' reference.
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
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getDailyOrderCondition_Comparison()
	 * @model
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getDailyOrderCondition_Threshold()
	 * @model
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

} // DailyOrderCondition

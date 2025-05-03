/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PriceCondition#getPrice <em>Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PriceCondition#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPriceCondition()
 * @model
 * @generated
 */
public interface PriceCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPriceCondition_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PriceCondition#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #setComparison(Comparison)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPriceCondition_Comparison()
	 * @model
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PriceCondition#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(Comparison value);

} // PriceCondition

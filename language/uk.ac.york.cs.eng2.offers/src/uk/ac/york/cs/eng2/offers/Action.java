/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Action#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Action#getPercentageDiscount <em>Percentage Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Action#getPriceDiscount <em>Price Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Action#getSetPrice <em>Set Price</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Percentage Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Discount</em>' attribute.
	 * @see #setPercentageDiscount(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAction_PercentageDiscount()
	 * @model
	 * @generated
	 */
	float getPercentageDiscount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Action#getPercentageDiscount <em>Percentage Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Discount</em>' attribute.
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	void setPercentageDiscount(float value);

	/**
	 * Returns the value of the '<em><b>Price Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Discount</em>' attribute.
	 * @see #setPriceDiscount(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAction_PriceDiscount()
	 * @model
	 * @generated
	 */
	float getPriceDiscount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Action#getPriceDiscount <em>Price Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Discount</em>' attribute.
	 * @see #getPriceDiscount()
	 * @generated
	 */
	void setPriceDiscount(float value);

	/**
	 * Returns the value of the '<em><b>Set Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Price</em>' attribute.
	 * @see #setSetPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getAction_SetPrice()
	 * @model
	 * @generated
	 */
	float getSetPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Action#getSetPrice <em>Set Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Price</em>' attribute.
	 * @see #getSetPrice()
	 * @generated
	 */
	void setSetPrice(float value);

} // Action

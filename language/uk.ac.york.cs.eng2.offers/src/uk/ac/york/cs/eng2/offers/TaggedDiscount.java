/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TaggedDiscount#getQuantityDiscount <em>Quantity Discount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TaggedDiscount#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedDiscount()
 * @model
 * @generated
 */
public interface TaggedDiscount extends Action {
	/**
	 * Returns the value of the '<em><b>Quantity Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Discount</em>' attribute.
	 * @see #setQuantityDiscount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedDiscount_QuantityDiscount()
	 * @model
	 * @generated
	 */
	int getQuantityDiscount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TaggedDiscount#getQuantityDiscount <em>Quantity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Discount</em>' attribute.
	 * @see #getQuantityDiscount()
	 * @generated
	 */
	void setQuantityDiscount(int value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedDiscount_Tags()
	 * @model required="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // TaggedDiscount

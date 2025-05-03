/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getComparison <em>Comparison</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedCondition()
 * @model
 * @generated
 */
public interface TaggedCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedCondition_Tags()
	 * @model required="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.Comparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see #setComparison(Comparison)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedCondition_Comparison()
	 * @model
	 * @generated
	 */
	Comparison getComparison();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getComparison <em>Comparison</em>}' attribute.
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
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTaggedCondition_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // TaggedCondition

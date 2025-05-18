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

} // TaggedCondition

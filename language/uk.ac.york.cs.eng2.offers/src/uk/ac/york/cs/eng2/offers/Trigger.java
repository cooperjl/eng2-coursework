/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Trigger#getTriggerOn <em>Trigger On</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Trigger#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger On</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.TriggerOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger On</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerOn
	 * @see #setTriggerOn(TriggerOn)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger_TriggerOn()
	 * @model
	 * @generated
	 */
	TriggerOn getTriggerOn();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Trigger#getTriggerOn <em>Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger On</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerOn
	 * @see #getTriggerOn()
	 * @generated
	 */
	void setTriggerOn(TriggerOn value);

	/**
	 * Returns the value of the '<em><b>Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer</em>' reference.
	 * @see #setOffer(Offer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTrigger_Offer()
	 * @model
	 * @generated
	 */
	Offer getOffer();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Trigger#getOffer <em>Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer</em>' reference.
	 * @see #getOffer()
	 * @generated
	 */
	void setOffer(Offer value);

} // Trigger

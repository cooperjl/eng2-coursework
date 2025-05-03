/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Tagged Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Condition</em>'.
	 * @generated
	 */
	TaggedCondition createTaggedCondition();

	/**
	 * Returns a new object of class '<em>Product Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Condition</em>'.
	 * @generated
	 */
	ProductCondition createProductCondition();

	/**
	 * Returns a new object of class '<em>Daily Order Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daily Order Condition</em>'.
	 * @generated
	 */
	DailyOrderCondition createDailyOrderCondition();

	/**
	 * Returns a new object of class '<em>Price Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Condition</em>'.
	 * @generated
	 */
	PriceCondition createPriceCondition();

	/**
	 * Returns a new object of class '<em>Date Range Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Range Condition</em>'.
	 * @generated
	 */
	DateRangeCondition createDateRangeCondition();

	/**
	 * Returns a new object of class '<em>Tagged Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Discount</em>'.
	 * @generated
	 */
	TaggedDiscount createTaggedDiscount();

	/**
	 * Returns a new object of class '<em>Product Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Discount</em>'.
	 * @generated
	 */
	ProductDiscount createProductDiscount();

	/**
	 * Returns a new object of class '<em>Order Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Discount</em>'.
	 * @generated
	 */
	OrderDiscount createOrderDiscount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory

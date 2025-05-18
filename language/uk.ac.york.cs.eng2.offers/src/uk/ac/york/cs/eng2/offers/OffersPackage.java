/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersFactory
 * @model kind="package"
 * @generated
 */
public interface OffersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/eng2/202425/offers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersPackage eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OFFERS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRODUCTS = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__TRIGGERS = 3;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TriggerImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Trigger On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGER_ON = 0;

	/**
	 * The feature id for the '<em><b>Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OFFER = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TaggedConditionImpl <em>Tagged Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TaggedConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTaggedCondition()
	 * @generated
	 */
	int TAGGED_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_CONDITION__TAGS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tagged Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductConditionImpl <em>Product Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductCondition()
	 * @generated
	 */
	int PRODUCT_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.DailyOrderConditionImpl <em>Daily Order Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.DailyOrderConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDailyOrderCondition()
	 * @generated
	 */
	int DAILY_ORDER_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION__COMPARISON = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION__THRESHOLD = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Daily Order Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Daily Order Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAILY_ORDER_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.PriceConditionImpl <em>Price Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.PriceConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPriceCondition()
	 * @generated
	 */
	int PRICE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CONDITION__PRICE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CONDITION__COMPARISON = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Price Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Price Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.DateRangeConditionImpl <em>Date Range Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.DateRangeConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDateRangeCondition()
	 * @generated
	 */
	int DATE_RANGE_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RANGE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RANGE_CONDITION__START_DATE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RANGE_CONDITION__END_DATE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Range Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RANGE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Range Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_RANGE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Percentage Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PERCENTAGE_DISCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Price Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRICE_DISCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Set Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SET_PRICE = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl <em>Tagged Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTaggedDiscount()
	 * @generated
	 */
	int TAGGED_DISCOUNT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__PERCENTAGE_DISCOUNT = ACTION__PERCENTAGE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Price Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__PRICE_DISCOUNT = ACTION__PRICE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Set Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__SET_PRICE = ACTION__SET_PRICE;

	/**
	 * The feature id for the '<em><b>Quantity Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__QUANTITY_DISCOUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT__TAGS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tagged Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DISCOUNT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl <em>Product Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductDiscount()
	 * @generated
	 */
	int PRODUCT_DISCOUNT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__PERCENTAGE_DISCOUNT = ACTION__PERCENTAGE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Price Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__PRICE_DISCOUNT = ACTION__PRICE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Set Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__SET_PRICE = ACTION__SET_PRICE;

	/**
	 * The feature id for the '<em><b>Quantity Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__QUANTITY_DISCOUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT__PRODUCT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISCOUNT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderDiscountImpl <em>Order Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OrderDiscountImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderDiscount()
	 * @generated
	 */
	int ORDER_DISCOUNT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Percentage Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT__PERCENTAGE_DISCOUNT = ACTION__PERCENTAGE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Price Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT__PRICE_DISCOUNT = ACTION__PRICE_DISCOUNT;

	/**
	 * The feature id for the '<em><b>Set Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT__SET_PRICE = ACTION__SET_PRICE;

	/**
	 * The number of structural features of the '<em>Order Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DISCOUNT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.TriggerOn <em>Trigger On</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.TriggerOn
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerOn()
	 * @generated
	 */
	int TRIGGER_ON = 16;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.Comparison <em>Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 17;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getProducts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getCategories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getTags()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getOffers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Offers();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Category#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getProducts()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Products();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer#getName()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Offer#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer#getConditions()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Offer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer#getActions()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Offer#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Offer#getTriggers()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_Triggers();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Trigger#getTriggerOn <em>Trigger On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger On</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger#getTriggerOn()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_TriggerOn();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Trigger#getOffer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offer</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Trigger#getOffer()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Offer();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TaggedCondition <em>Tagged Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TaggedCondition
	 * @generated
	 */
	EClass getTaggedCondition();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.TaggedCondition#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TaggedCondition#getTags()
	 * @see #getTaggedCondition()
	 * @generated
	 */
	EReference getTaggedCondition_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductCondition <em>Product Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductCondition
	 * @generated
	 */
	EClass getProductCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ProductCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductCondition#getProduct()
	 * @see #getProductCondition()
	 * @generated
	 */
	EReference getProductCondition_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition <em>Daily Order Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daily Order Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DailyOrderCondition
	 * @generated
	 */
	EClass getDailyOrderCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DailyOrderCondition#getProduct()
	 * @see #getDailyOrderCondition()
	 * @generated
	 */
	EReference getDailyOrderCondition_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DailyOrderCondition#getComparison()
	 * @see #getDailyOrderCondition()
	 * @generated
	 */
	EAttribute getDailyOrderCondition_Comparison();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.DailyOrderCondition#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DailyOrderCondition#getThreshold()
	 * @see #getDailyOrderCondition()
	 * @generated
	 */
	EAttribute getDailyOrderCondition_Threshold();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.PriceCondition <em>Price Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PriceCondition
	 * @generated
	 */
	EClass getPriceCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.PriceCondition#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PriceCondition#getPrice()
	 * @see #getPriceCondition()
	 * @generated
	 */
	EAttribute getPriceCondition_Price();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.PriceCondition#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PriceCondition#getComparison()
	 * @see #getPriceCondition()
	 * @generated
	 */
	EAttribute getPriceCondition_Comparison();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.DateRangeCondition <em>Date Range Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Range Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DateRangeCondition
	 * @generated
	 */
	EClass getDateRangeCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.DateRangeCondition#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DateRangeCondition#getStartDate()
	 * @see #getDateRangeCondition()
	 * @generated
	 */
	EAttribute getDateRangeCondition_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.DateRangeCondition#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.DateRangeCondition#getEndDate()
	 * @see #getDateRangeCondition()
	 * @generated
	 */
	EAttribute getDateRangeCondition_EndDate();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getPercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getPercentageDiscount()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_PercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getPriceDiscount <em>Price Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getPriceDiscount()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_PriceDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getSetPrice <em>Set Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getSetPrice()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_SetPrice();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TaggedDiscount <em>Tagged Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TaggedDiscount
	 * @generated
	 */
	EClass getTaggedDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TaggedDiscount#getQuantityDiscount <em>Quantity Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TaggedDiscount#getQuantityDiscount()
	 * @see #getTaggedDiscount()
	 * @generated
	 */
	EAttribute getTaggedDiscount_QuantityDiscount();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.TaggedDiscount#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TaggedDiscount#getTags()
	 * @see #getTaggedDiscount()
	 * @generated
	 */
	EReference getTaggedDiscount_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductDiscount <em>Product Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductDiscount
	 * @generated
	 */
	EClass getProductDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getQuantityDiscount <em>Quantity Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductDiscount#getQuantityDiscount()
	 * @see #getProductDiscount()
	 * @generated
	 */
	EAttribute getProductDiscount_QuantityDiscount();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ProductDiscount#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductDiscount#getProduct()
	 * @see #getProductDiscount()
	 * @generated
	 */
	EReference getProductDiscount_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OrderDiscount <em>Order Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderDiscount
	 * @generated
	 */
	EClass getOrderDiscount();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.TriggerOn <em>Trigger On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger On</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerOn
	 * @generated
	 */
	EEnum getTriggerOn();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Comparison
	 * @generated
	 */
	EEnum getComparison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OffersFactory getOffersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PRODUCTS = eINSTANCE.getModel_Products();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CATEGORIES = eINSTANCE.getModel_Categories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TAGS = eINSTANCE.getModel_Tags();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OFFERS = eINSTANCE.getModel_Offers();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PRODUCTS = eINSTANCE.getCategory_Products();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__NAME = eINSTANCE.getOffer_Name();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__CONDITIONS = eINSTANCE.getOffer_Conditions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__ACTIONS = eINSTANCE.getOffer_Actions();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__TRIGGERS = eINSTANCE.getOffer_Triggers();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TriggerImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TRIGGER_ON = eINSTANCE.getTrigger_TriggerOn();

		/**
		 * The meta object literal for the '<em><b>Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__OFFER = eINSTANCE.getTrigger_Offer();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TaggedConditionImpl <em>Tagged Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TaggedConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTaggedCondition()
		 * @generated
		 */
		EClass TAGGED_CONDITION = eINSTANCE.getTaggedCondition();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_CONDITION__TAGS = eINSTANCE.getTaggedCondition_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductConditionImpl <em>Product Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductCondition()
		 * @generated
		 */
		EClass PRODUCT_CONDITION = eINSTANCE.getProductCondition();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONDITION__PRODUCT = eINSTANCE.getProductCondition_Product();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.DailyOrderConditionImpl <em>Daily Order Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.DailyOrderConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDailyOrderCondition()
		 * @generated
		 */
		EClass DAILY_ORDER_CONDITION = eINSTANCE.getDailyOrderCondition();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAILY_ORDER_CONDITION__PRODUCT = eINSTANCE.getDailyOrderCondition_Product();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAILY_ORDER_CONDITION__COMPARISON = eINSTANCE.getDailyOrderCondition_Comparison();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAILY_ORDER_CONDITION__THRESHOLD = eINSTANCE.getDailyOrderCondition_Threshold();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.PriceConditionImpl <em>Price Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.PriceConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPriceCondition()
		 * @generated
		 */
		EClass PRICE_CONDITION = eINSTANCE.getPriceCondition();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_CONDITION__PRICE = eINSTANCE.getPriceCondition_Price();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_CONDITION__COMPARISON = eINSTANCE.getPriceCondition_Comparison();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.DateRangeConditionImpl <em>Date Range Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.DateRangeConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDateRangeCondition()
		 * @generated
		 */
		EClass DATE_RANGE_CONDITION = eINSTANCE.getDateRangeCondition();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_RANGE_CONDITION__START_DATE = eINSTANCE.getDateRangeCondition_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_RANGE_CONDITION__END_DATE = eINSTANCE.getDateRangeCondition_EndDate();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Percentage Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PERCENTAGE_DISCOUNT = eINSTANCE.getAction_PercentageDiscount();

		/**
		 * The meta object literal for the '<em><b>Price Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PRICE_DISCOUNT = eINSTANCE.getAction_PriceDiscount();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SET_PRICE = eINSTANCE.getAction_SetPrice();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl <em>Tagged Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TaggedDiscountImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTaggedDiscount()
		 * @generated
		 */
		EClass TAGGED_DISCOUNT = eINSTANCE.getTaggedDiscount();

		/**
		 * The meta object literal for the '<em><b>Quantity Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_DISCOUNT__QUANTITY_DISCOUNT = eINSTANCE.getTaggedDiscount_QuantityDiscount();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_DISCOUNT__TAGS = eINSTANCE.getTaggedDiscount_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl <em>Product Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductDiscountImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductDiscount()
		 * @generated
		 */
		EClass PRODUCT_DISCOUNT = eINSTANCE.getProductDiscount();

		/**
		 * The meta object literal for the '<em><b>Quantity Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DISCOUNT__QUANTITY_DISCOUNT = eINSTANCE.getProductDiscount_QuantityDiscount();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DISCOUNT__PRODUCT = eINSTANCE.getProductDiscount_Product();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderDiscountImpl <em>Order Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OrderDiscountImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderDiscount()
		 * @generated
		 */
		EClass ORDER_DISCOUNT = eINSTANCE.getOrderDiscount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.TriggerOn <em>Trigger On</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.TriggerOn
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerOn()
		 * @generated
		 */
		EEnum TRIGGER_ON = eINSTANCE.getTriggerOn();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.Comparison <em>Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.Comparison
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getComparison()
		 * @generated
		 */
		EEnum COMPARISON = eINSTANCE.getComparison();

	}

} //OffersPackage

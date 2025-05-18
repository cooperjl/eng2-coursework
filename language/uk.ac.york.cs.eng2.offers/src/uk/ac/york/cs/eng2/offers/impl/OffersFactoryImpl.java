/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersFactoryImpl extends EFactoryImpl implements OffersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OffersFactory init() {
		try {
			OffersFactory theOffersFactory = (OffersFactory)EPackage.Registry.INSTANCE.getEFactory(OffersPackage.eNS_URI);
			if (theOffersFactory != null) {
				return theOffersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OffersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OffersPackage.MODEL: return createModel();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.TAG: return createTag();
			case OffersPackage.OFFER: return createOffer();
			case OffersPackage.TRIGGER: return createTrigger();
			case OffersPackage.TAGGED_CONDITION: return createTaggedCondition();
			case OffersPackage.PRODUCT_CONDITION: return createProductCondition();
			case OffersPackage.DAILY_ORDER_CONDITION: return createDailyOrderCondition();
			case OffersPackage.PRICE_CONDITION: return createPriceCondition();
			case OffersPackage.DATE_RANGE_CONDITION: return createDateRangeCondition();
			case OffersPackage.TAGGED_DISCOUNT: return createTaggedDiscount();
			case OffersPackage.PRODUCT_DISCOUNT: return createProductDiscount();
			case OffersPackage.ORDER_DISCOUNT: return createOrderDiscount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_ON:
				return createTriggerOnFromString(eDataType, initialValue);
			case OffersPackage.COMPARISON:
				return createComparisonFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_ON:
				return convertTriggerOnToString(eDataType, instanceValue);
			case OffersPackage.COMPARISON:
				return convertComparisonToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedCondition createTaggedCondition() {
		TaggedConditionImpl taggedCondition = new TaggedConditionImpl();
		return taggedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCondition createProductCondition() {
		ProductConditionImpl productCondition = new ProductConditionImpl();
		return productCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DailyOrderCondition createDailyOrderCondition() {
		DailyOrderConditionImpl dailyOrderCondition = new DailyOrderConditionImpl();
		return dailyOrderCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriceCondition createPriceCondition() {
		PriceConditionImpl priceCondition = new PriceConditionImpl();
		return priceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateRangeCondition createDateRangeCondition() {
		DateRangeConditionImpl dateRangeCondition = new DateRangeConditionImpl();
		return dateRangeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedDiscount createTaggedDiscount() {
		TaggedDiscountImpl taggedDiscount = new TaggedDiscountImpl();
		return taggedDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductDiscount createProductDiscount() {
		ProductDiscountImpl productDiscount = new ProductDiscountImpl();
		return productDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderDiscount createOrderDiscount() {
		OrderDiscountImpl orderDiscount = new OrderDiscountImpl();
		return orderDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerOn createTriggerOnFromString(EDataType eDataType, String initialValue) {
		TriggerOn result = TriggerOn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerOnToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparisonFromString(EDataType eDataType, String initialValue) {
		Comparison result = Comparison.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersPackage getOffersPackage() {
		return (OffersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OffersPackage getPackage() {
		return OffersPackage.eINSTANCE;
	}

} //OffersFactoryImpl

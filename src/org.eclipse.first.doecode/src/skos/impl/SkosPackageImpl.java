/**
 */
package skos.impl;

import adms.AdmsPackage;

import adms.impl.AdmsPackageImpl;

import doecode.DoecodePackage;

import doecode.impl.DoecodePackageImpl;

import foaf.FoafPackage;

import foaf.impl.FoafPackageImpl;

import org.OrgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.impl.OrgPackageImpl;

import skos.Concept;
import skos.SkosFactory;
import skos.SkosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkosPackageImpl extends EPackageImpl implements SkosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see skos.SkosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkosPackageImpl() {
		super(eNS_URI, SkosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SkosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkosPackage init() {
		if (isInited) return (SkosPackage)EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);

		// Obtain or create and register package
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SkosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SkosPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DoecodePackageImpl theDoecodePackage = (DoecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) instanceof DoecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) : DoecodePackage.eINSTANCE);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) instanceof AdmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) : AdmsPackage.eINSTANCE);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) instanceof FoafPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) : FoafPackage.eINSTANCE);
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) : OrgPackage.eINSTANCE);

		// Create package meta-data objects
		theSkosPackage.createPackageContents();
		theDoecodePackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theOrgPackage.createPackageContents();

		// Initialize created meta-data
		theSkosPackage.initializePackageContents();
		theDoecodePackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theOrgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkosPackage.eNS_URI, theSkosPackage);
		return theSkosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_PrefLabel() {
		return (EAttribute)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_AltLabel() {
		return (EAttribute)conceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkosFactory getSkosFactory() {
		return (SkosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conceptEClass = createEClass(CONCEPT);
		createEAttribute(conceptEClass, CONCEPT__PREF_LABEL);
		createEAttribute(conceptEClass, CONCEPT__ALT_LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcept_PrefLabel(), ecorePackage.getEString(), "prefLabel", null, 1, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcept_AltLabel(), ecorePackage.getEString(), "altLabel", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SkosPackageImpl

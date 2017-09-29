/**
 */
package foaf.impl;

import adms.AdmsPackage;

import adms.impl.AdmsPackageImpl;

import doecode.DoecodePackage;

import doecode.impl.DoecodePackageImpl;

import foaf.Document;
import foaf.FoafFactory;
import foaf.FoafPackage;
import foaf.Person;

import org.OrgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.impl.OrgPackageImpl;

import skos.SkosPackage;

import skos.impl.SkosPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoafPackageImpl extends EPackageImpl implements FoafPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

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
	 * @see foaf.FoafPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FoafPackageImpl() {
		super(eNS_URI, FoafFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FoafPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FoafPackage init() {
		if (isInited) return (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);

		// Obtain or create and register package
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FoafPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FoafPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DoecodePackageImpl theDoecodePackage = (DoecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) instanceof DoecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) : DoecodePackage.eINSTANCE);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) instanceof AdmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) : AdmsPackage.eINSTANCE);
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) : OrgPackage.eINSTANCE);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) instanceof SkosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) : SkosPackage.eINSTANCE);

		// Create package meta-data objects
		theFoafPackage.createPackageContents();
		theDoecodePackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theOrgPackage.createPackageContents();
		theSkosPackage.createPackageContents();

		// Initialize created meta-data
		theFoafPackage.initializePackageContents();
		theDoecodePackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theOrgPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFoafPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FoafPackage.eNS_URI, theFoafPackage);
		return theFoafPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FamilyName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Mbox_sha1sum() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoafFactory getFoafFactory() {
		return (FoafFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__FAMILY_NAME);
		createEAttribute(personEClass, PERSON__MBOX_SHA1SUM);

		documentEClass = createEClass(DOCUMENT);
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
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FamilyName(), ecorePackage.getEString(), "familyName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Mbox_sha1sum(), ecorePackage.getEString(), "mbox_sha1sum", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FoafPackageImpl

/**
 */
package adms.impl;

import adms.AdmsFactory;
import adms.AdmsPackage;
import adms.Identifier;

import doecode.DoecodePackage;

import doecode.impl.DoecodePackageImpl;

import foaf.FoafPackage;

import foaf.impl.FoafPackageImpl;

import org.OrgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
public class AdmsPackageImpl extends EPackageImpl implements AdmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

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
	 * @see adms.AdmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdmsPackageImpl() {
		super(eNS_URI, AdmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdmsPackage init() {
		if (isInited) return (AdmsPackage)EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);

		// Obtain or create and register package
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdmsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DoecodePackageImpl theDoecodePackage = (DoecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) instanceof DoecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) : DoecodePackage.eINSTANCE);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) instanceof FoafPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) : FoafPackage.eINSTANCE);
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) : OrgPackage.eINSTANCE);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) instanceof SkosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) : SkosPackage.eINSTANCE);

		// Create package meta-data objects
		theAdmsPackage.createPackageContents();
		theDoecodePackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theOrgPackage.createPackageContents();
		theSkosPackage.createPackageContents();

		// Initialize created meta-data
		theAdmsPackage.initializePackageContents();
		theDoecodePackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theOrgPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdmsPackage.eNS_URI, theAdmsPackage);
		return theAdmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Notation() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_SchemeAgency() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Identifier() {
		return (EReference)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmsFactory getAdmsFactory() {
		return (AdmsFactory)getEFactoryInstance();
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
		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__NOTATION);
		createEAttribute(identifierEClass, IDENTIFIER__SCHEME_AGENCY);

		assetEClass = createEClass(ASSET);
		createEReference(assetEClass, ASSET__IDENTIFIER);
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
		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Notation(), ecorePackage.getEString(), "notation", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_SchemeAgency(), ecorePackage.getEString(), "schemeAgency", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Object.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsset_Identifier(), this.getIdentifier(), null, "identifier", null, 1, -1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getIdentifier_Notation(), 
		   source, 
		   new String[] {
			 "namespace", "skos",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (getIdentifier_SchemeAgency(), 
		   source, 
		   new String[] {
			 "namespace", "skos",
			 "kind", "attribute"
		   });	
		addAnnotation
		  (assetEClass, 
		   source, 
		   new String[] {
			 "kind", "empty"
		   });
	}

} //AdmsPackageImpl

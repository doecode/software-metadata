/**
 */
package doecode.impl;

import adms.AdmsPackage;

import adms.impl.AdmsPackageImpl;

import doecode.Document;
import doecode.DoecodeFactory;
import doecode.DoecodePackage;
import doecode.Identifier;
import doecode.Person;
import doecode.Record;
import doecode.Role;
import doecode.Software;
import doecode.org;

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
public class DoecodePackageImpl extends EPackageImpl implements DoecodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareEClass = null;

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
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

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
	 * @see doecode.DoecodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DoecodePackageImpl() {
		super(eNS_URI, DoecodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DoecodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DoecodePackage init() {
		if (isInited) return (DoecodePackage)EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI);

		// Obtain or create and register package
		DoecodePackageImpl theDoecodePackage = (DoecodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DoecodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DoecodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) instanceof AdmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) : AdmsPackage.eINSTANCE);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) instanceof FoafPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) : FoafPackage.eINSTANCE);
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) : OrgPackage.eINSTANCE);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) instanceof SkosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) : SkosPackage.eINSTANCE);

		// Create package meta-data objects
		theDoecodePackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theOrgPackage.createPackageContents();
		theSkosPackage.createPackageContents();

		// Initialize created meta-data
		theDoecodePackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theOrgPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDoecodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DoecodePackage.eNS_URI, theDoecodePackage);
		return theDoecodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftware() {
		return softwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Title() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Creator() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Issued() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Identifier() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Description() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Rights() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_CodeRepository() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_IsReferencedBy() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(7);
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
	public EReference getIdentifier_Identifier() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(0);
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
	public EReference getPerson_Creator() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_IsMemberOf() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDocument_Title() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Date() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_References() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getorg() {
		return orgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Org() {
		return (EReference)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Software() {
		return (EReference)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoecodeFactory getDoecodeFactory() {
		return (DoecodeFactory)getEFactoryInstance();
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
		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__TITLE);
		createEReference(softwareEClass, SOFTWARE__CREATOR);
		createEAttribute(softwareEClass, SOFTWARE__ISSUED);
		createEReference(softwareEClass, SOFTWARE__IDENTIFIER);
		createEAttribute(softwareEClass, SOFTWARE__DESCRIPTION);
		createEAttribute(softwareEClass, SOFTWARE__RIGHTS);
		createEAttribute(softwareEClass, SOFTWARE__CODE_REPOSITORY);
		createEReference(softwareEClass, SOFTWARE__IS_REFERENCED_BY);

		identifierEClass = createEClass(IDENTIFIER);
		createEReference(identifierEClass, IDENTIFIER__IDENTIFIER);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__CREATOR);
		createEReference(personEClass, PERSON__IS_MEMBER_OF);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEAttribute(documentEClass, DOCUMENT__DATE);
		createEReference(documentEClass, DOCUMENT__REFERENCES);

		roleEClass = createEClass(ROLE);

		orgEClass = createEClass(ORG);

		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__ORG);
		createEReference(recordEClass, RECORD__SOFTWARE);
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

		// Obtain other dependent packages
		AdmsPackage theAdmsPackage = (AdmsPackage)EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI);
		FoafPackage theFoafPackage = (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
		OrgPackage theOrgPackage = (OrgPackage)EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_Title(), ecorePackage.getEString(), "title", "", 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Creator(), this.getPerson(), null, "creator", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Issued(), ecorePackage.getEDate(), "issued", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Identifier(), this.getIdentifier(), null, "identifier", null, 1, -1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Description(), ecorePackage.getEString(), "description", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Rights(), ecorePackage.getEBoolean(), "rights", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_CodeRepository(), ecorePackage.getEString(), "codeRepository", null, 1, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_IsReferencedBy(), this.getDocument(), this.getDocument_References(), "isReferencedBy", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifier_Identifier(), theAdmsPackage.getIdentifier(), null, "identifier", null, 1, -1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Creator(), theFoafPackage.getDocument(), null, "creator", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_IsMemberOf(), theOrgPackage.getOrganization(), null, "isMemberOf", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Title(), ecorePackage.getEString(), "title", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_References(), this.getSoftware(), this.getSoftware_IsReferencedBy(), "references", null, 1, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orgEClass, org.class, "org", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_Org(), theOrgPackage.getOrganization(), null, "org", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecord_Software(), this.getSoftware(), null, "software", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DoecodePackageImpl

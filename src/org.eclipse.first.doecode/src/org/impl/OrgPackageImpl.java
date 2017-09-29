/**
 */
package org.impl;

import adms.AdmsPackage;

import adms.impl.AdmsPackageImpl;

import doecode.DoecodePackage;

import doecode.impl.DoecodePackageImpl;

import foaf.FoafPackage;

import foaf.impl.FoafPackageImpl;

import org.OrgFactory;
import org.OrgPackage;
import org.Organization;
import org.Role;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import skos.SkosPackage;

import skos.impl.SkosPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrgPackageImpl extends EPackageImpl implements OrgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

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
	 * @see org.OrgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrgPackageImpl() {
		super(eNS_URI, OrgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrgPackage init() {
		if (isInited) return (OrgPackage)EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI);

		// Obtain or create and register package
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrgPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DoecodePackageImpl theDoecodePackage = (DoecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) instanceof DoecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DoecodePackage.eNS_URI) : DoecodePackage.eINSTANCE);
		AdmsPackageImpl theAdmsPackage = (AdmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) instanceof AdmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdmsPackage.eNS_URI) : AdmsPackage.eINSTANCE);
		FoafPackageImpl theFoafPackage = (FoafPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) instanceof FoafPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI) : FoafPackage.eINSTANCE);
		SkosPackageImpl theSkosPackage = (SkosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) instanceof SkosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI) : SkosPackage.eINSTANCE);

		// Create package meta-data objects
		theOrgPackage.createPackageContents();
		theDoecodePackage.createPackageContents();
		theAdmsPackage.createPackageContents();
		theFoafPackage.createPackageContents();
		theSkosPackage.createPackageContents();

		// Initialize created meta-data
		theOrgPackage.initializePackageContents();
		theDoecodePackage.initializePackageContents();
		theAdmsPackage.initializePackageContents();
		theFoafPackage.initializePackageContents();
		theSkosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrgPackage.eNS_URI, theOrgPackage);
		return theOrgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_HasMember() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Labels() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
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
	public OrgFactory getOrgFactory() {
		return (OrgFactory)getEFactoryInstance();
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
		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__HAS_MEMBER);
		createEReference(organizationEClass, ORGANIZATION__LABELS);

		roleEClass = createEClass(ROLE);
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
		FoafPackage theFoafPackage = (FoafPackage)EPackage.Registry.INSTANCE.getEPackage(FoafPackage.eNS_URI);
		SkosPackage theSkosPackage = (SkosPackage)EPackage.Registry.INSTANCE.getEPackage(SkosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_HasMember(), theFoafPackage.getPerson(), null, "hasMember", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Labels(), theSkosPackage.getConcept(), null, "labels", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OrgPackageImpl

/**
 */
package doecode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see doecode.DoecodeFactory
 * @model kind="package"
 * @generated
 */
public interface DoecodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "doecode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/doecode/doecode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "github.com.doecode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DoecodePackage eINSTANCE = doecode.impl.DoecodePackageImpl.init();

	/**
	 * The meta object id for the '{@link doecode.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.SoftwareImpl
	 * @see doecode.impl.DoecodePackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__CREATOR = 1;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ISSUED = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__RIGHTS = 5;

	/**
	 * The feature id for the '<em><b>Code Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__CODE_REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Is Referenced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__IS_REFERENCED_BY = 7;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.IdentifierImpl
	 * @see doecode.impl.DoecodePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.PersonImpl
	 * @see doecode.impl.DoecodePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Is Member Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_MEMBER_OF = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.DocumentImpl
	 * @see doecode.impl.DoecodePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REFERENCES = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.RoleImpl
	 * @see doecode.impl.DoecodePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.orgImpl <em>org</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.orgImpl
	 * @see doecode.impl.DoecodePackageImpl#getorg()
	 * @generated
	 */
	int ORG = 5;

	/**
	 * The number of structural features of the '<em>org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link doecode.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see doecode.impl.RecordImpl
	 * @see doecode.impl.DoecodePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 6;

	/**
	 * The feature id for the '<em><b>Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ORG = 0;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SOFTWARE = 1;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link doecode.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see doecode.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Software#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see doecode.Software#getTitle()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Title();

	/**
	 * Returns the meta object for the containment reference '{@link doecode.Software#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see doecode.Software#getCreator()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Creator();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Software#getIssued <em>Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued</em>'.
	 * @see doecode.Software#getIssued()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Issued();

	/**
	 * Returns the meta object for the containment reference list '{@link doecode.Software#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see doecode.Software#getIdentifier()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Software#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see doecode.Software#getDescription()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Description();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Software#isRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rights</em>'.
	 * @see doecode.Software#isRights()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Rights();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Software#getCodeRepository <em>Code Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Repository</em>'.
	 * @see doecode.Software#getCodeRepository()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_CodeRepository();

	/**
	 * Returns the meta object for the reference '{@link doecode.Software#getIsReferencedBy <em>Is Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Referenced By</em>'.
	 * @see doecode.Software#getIsReferencedBy()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_IsReferencedBy();

	/**
	 * Returns the meta object for class '{@link doecode.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see doecode.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference list '{@link doecode.Identifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifier</em>'.
	 * @see doecode.Identifier#getIdentifier()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link doecode.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see doecode.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference '{@link doecode.Person#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see doecode.Person#getCreator()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Creator();

	/**
	 * Returns the meta object for the reference '{@link doecode.Person#getIsMemberOf <em>Is Member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Member Of</em>'.
	 * @see doecode.Person#getIsMemberOf()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IsMemberOf();

	/**
	 * Returns the meta object for class '{@link doecode.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see doecode.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see doecode.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link doecode.Document#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see doecode.Document#getDate()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Date();

	/**
	 * Returns the meta object for the reference list '{@link doecode.Document#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see doecode.Document#getReferences()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_References();

	/**
	 * Returns the meta object for class '{@link doecode.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see doecode.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link doecode.org <em>org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>org</em>'.
	 * @see doecode.org
	 * @generated
	 */
	EClass getorg();

	/**
	 * Returns the meta object for class '{@link doecode.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see doecode.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the reference '{@link doecode.Record#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Org</em>'.
	 * @see doecode.Record#getOrg()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Org();

	/**
	 * Returns the meta object for the reference '{@link doecode.Record#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see doecode.Record#getSoftware()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Software();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DoecodeFactory getDoecodeFactory();

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
		 * The meta object literal for the '{@link doecode.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.SoftwareImpl
		 * @see doecode.impl.DoecodePackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__TITLE = eINSTANCE.getSoftware_Title();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__CREATOR = eINSTANCE.getSoftware_Creator();

		/**
		 * The meta object literal for the '<em><b>Issued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__ISSUED = eINSTANCE.getSoftware_Issued();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__IDENTIFIER = eINSTANCE.getSoftware_Identifier();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__DESCRIPTION = eINSTANCE.getSoftware_Description();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__RIGHTS = eINSTANCE.getSoftware_Rights();

		/**
		 * The meta object literal for the '<em><b>Code Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__CODE_REPOSITORY = eINSTANCE.getSoftware_CodeRepository();

		/**
		 * The meta object literal for the '<em><b>Is Referenced By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__IS_REFERENCED_BY = eINSTANCE.getSoftware_IsReferencedBy();

		/**
		 * The meta object literal for the '{@link doecode.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.IdentifierImpl
		 * @see doecode.impl.DoecodePackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__IDENTIFIER = eINSTANCE.getIdentifier_Identifier();

		/**
		 * The meta object literal for the '{@link doecode.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.PersonImpl
		 * @see doecode.impl.DoecodePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CREATOR = eINSTANCE.getPerson_Creator();

		/**
		 * The meta object literal for the '<em><b>Is Member Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IS_MEMBER_OF = eINSTANCE.getPerson_IsMemberOf();

		/**
		 * The meta object literal for the '{@link doecode.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.DocumentImpl
		 * @see doecode.impl.DoecodePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DATE = eINSTANCE.getDocument_Date();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__REFERENCES = eINSTANCE.getDocument_References();

		/**
		 * The meta object literal for the '{@link doecode.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.RoleImpl
		 * @see doecode.impl.DoecodePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link doecode.impl.orgImpl <em>org</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.orgImpl
		 * @see doecode.impl.DoecodePackageImpl#getorg()
		 * @generated
		 */
		EClass ORG = eINSTANCE.getorg();

		/**
		 * The meta object literal for the '{@link doecode.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see doecode.impl.RecordImpl
		 * @see doecode.impl.DoecodePackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Org</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__ORG = eINSTANCE.getRecord_Org();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__SOFTWARE = eINSTANCE.getRecord_Software();

	}

} //DoecodePackage

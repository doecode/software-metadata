/**
 */
package doecode;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link doecode.Software#getTitle <em>Title</em>}</li>
 *   <li>{@link doecode.Software#getCreator <em>Creator</em>}</li>
 *   <li>{@link doecode.Software#getIssued <em>Issued</em>}</li>
 *   <li>{@link doecode.Software#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link doecode.Software#getDescription <em>Description</em>}</li>
 *   <li>{@link doecode.Software#isRights <em>Rights</em>}</li>
 *   <li>{@link doecode.Software#getCodeRepository <em>Code Repository</em>}</li>
 *   <li>{@link doecode.Software#getIsReferencedBy <em>Is Referenced By</em>}</li>
 * </ul>
 *
 * @see doecode.DoecodePackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see doecode.DoecodePackage#getSoftware_Title()
	 * @model default="" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link doecode.Software#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Person)
	 * @see doecode.DoecodePackage#getSoftware_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getCreator();

	/**
	 * Sets the value of the '{@link doecode.Software#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Person value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' attribute.
	 * @see #setIssued(Date)
	 * @see doecode.DoecodePackage#getSoftware_Issued()
	 * @model required="true"
	 * @generated
	 */
	Date getIssued();

	/**
	 * Sets the value of the '{@link doecode.Software#getIssued <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' attribute.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Date value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link doecode.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see doecode.DoecodePackage#getSoftware_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see doecode.DoecodePackage#getSoftware_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link doecode.Software#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute.
	 * @see #setRights(boolean)
	 * @see doecode.DoecodePackage#getSoftware_Rights()
	 * @model required="true"
	 * @generated
	 */
	boolean isRights();

	/**
	 * Sets the value of the '{@link doecode.Software#isRights <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' attribute.
	 * @see #isRights()
	 * @generated
	 */
	void setRights(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Repository</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Repository</em>' attribute.
	 * @see #setCodeRepository(String)
	 * @see doecode.DoecodePackage#getSoftware_CodeRepository()
	 * @model required="true"
	 * @generated
	 */
	String getCodeRepository();

	/**
	 * Sets the value of the '{@link doecode.Software#getCodeRepository <em>Code Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Repository</em>' attribute.
	 * @see #getCodeRepository()
	 * @generated
	 */
	void setCodeRepository(String value);

	/**
	 * Returns the value of the '<em><b>Is Referenced By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link doecode.Document#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Referenced By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Referenced By</em>' reference.
	 * @see #setIsReferencedBy(Document)
	 * @see doecode.DoecodePackage#getSoftware_IsReferencedBy()
	 * @see doecode.Document#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	Document getIsReferencedBy();

	/**
	 * Sets the value of the '{@link doecode.Software#getIsReferencedBy <em>Is Referenced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Referenced By</em>' reference.
	 * @see #getIsReferencedBy()
	 * @generated
	 */
	void setIsReferencedBy(Document value);

} // Software

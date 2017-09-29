/**
 */
package foaf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link foaf.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link foaf.Person#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link foaf.Person#getMbox_sha1sum <em>Mbox sha1sum</em>}</li>
 * </ul>
 *
 * @see foaf.FoafPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see foaf.FoafPackage#getPerson_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link foaf.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see foaf.FoafPackage#getPerson_FamilyName()
	 * @model required="true"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link foaf.Person#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Returns the value of the '<em><b>Mbox sha1sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbox sha1sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbox sha1sum</em>' attribute.
	 * @see #setMbox_sha1sum(String)
	 * @see foaf.FoafPackage#getPerson_Mbox_sha1sum()
	 * @model required="true"
	 * @generated
	 */
	String getMbox_sha1sum();

	/**
	 * Sets the value of the '{@link foaf.Person#getMbox_sha1sum <em>Mbox sha1sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbox sha1sum</em>' attribute.
	 * @see #getMbox_sha1sum()
	 * @generated
	 */
	void setMbox_sha1sum(String value);

} // Person

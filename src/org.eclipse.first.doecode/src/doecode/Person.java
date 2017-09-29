/**
 */
package doecode;

import foaf.Document;

import org.Organization;

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
 *   <li>{@link doecode.Person#getCreator <em>Creator</em>}</li>
 *   <li>{@link doecode.Person#getIsMemberOf <em>Is Member Of</em>}</li>
 * </ul>
 *
 * @see doecode.DoecodePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Document)
	 * @see doecode.DoecodePackage#getPerson_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Document getCreator();

	/**
	 * Sets the value of the '{@link doecode.Person#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Document value);

	/**
	 * Returns the value of the '<em><b>Is Member Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Member Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Member Of</em>' reference.
	 * @see #setIsMemberOf(Organization)
	 * @see doecode.DoecodePackage#getPerson_IsMemberOf()
	 * @model required="true"
	 * @generated
	 */
	Organization getIsMemberOf();

	/**
	 * Sets the value of the '{@link doecode.Person#getIsMemberOf <em>Is Member Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Member Of</em>' reference.
	 * @see #getIsMemberOf()
	 * @generated
	 */
	void setIsMemberOf(Organization value);

} // Person

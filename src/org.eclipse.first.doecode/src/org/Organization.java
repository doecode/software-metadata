/**
 */
package org;

import foaf.Person;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import skos.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.Organization#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link org.Organization#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.OrgPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Member</b></em>' reference list.
	 * The list contents are of type {@link foaf.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Member</em>' reference list.
	 * @see org.OrgPackage#getOrganization_HasMember()
	 * @model
	 * @generated
	 */
	EList<Person> getHasMember();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference.
	 * @see #setLabels(Concept)
	 * @see org.OrgPackage#getOrganization_Labels()
	 * @model
	 * @generated
	 */
	Concept getLabels();

	/**
	 * Sets the value of the '{@link org.Organization#getLabels <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' reference.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Concept value);

} // Organization

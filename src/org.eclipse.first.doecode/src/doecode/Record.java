/**
 */
package doecode;

import org.Organization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link doecode.Record#getOrg <em>Org</em>}</li>
 *   <li>{@link doecode.Record#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @see doecode.DoecodePackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends EObject {
	/**
	 * Returns the value of the '<em><b>Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Org</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' reference.
	 * @see #setOrg(Organization)
	 * @see doecode.DoecodePackage#getRecord_Org()
	 * @model
	 * @generated
	 */
	Organization getOrg();

	/**
	 * Sets the value of the '{@link doecode.Record#getOrg <em>Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Org</em>' reference.
	 * @see #getOrg()
	 * @generated
	 */
	void setOrg(Organization value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(Software)
	 * @see doecode.DoecodePackage#getRecord_Software()
	 * @model
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link doecode.Record#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

} // Record

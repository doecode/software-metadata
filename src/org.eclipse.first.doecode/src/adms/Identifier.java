/**
 */
package adms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adms.Identifier#getNotation <em>Notation</em>}</li>
 *   <li>{@link adms.Identifier#getSchemeAgency <em>Scheme Agency</em>}</li>
 * </ul>
 *
 * @see adms.AdmsPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see #setNotation(String)
	 * @see adms.AdmsPackage#getIdentifier_Notation()
	 * @model required="true"
	 *        extendedMetaData="namespace='skos' kind='attribute'"
	 * @generated
	 */
	String getNotation();

	/**
	 * Sets the value of the '{@link adms.Identifier#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(String value);

	/**
	 * Returns the value of the '<em><b>Scheme Agency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme Agency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme Agency</em>' attribute.
	 * @see #setSchemeAgency(String)
	 * @see adms.AdmsPackage#getIdentifier_SchemeAgency()
	 * @model required="true"
	 *        extendedMetaData="namespace='skos' kind='attribute'"
	 * @generated
	 */
	String getSchemeAgency();

	/**
	 * Sets the value of the '{@link adms.Identifier#getSchemeAgency <em>Scheme Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Agency</em>' attribute.
	 * @see #getSchemeAgency()
	 * @generated
	 */
	void setSchemeAgency(String value);

} // Identifier

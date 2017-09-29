/**
 */
package doecode;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link doecode.Identifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see doecode.DoecodePackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link adms.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see doecode.DoecodePackage#getIdentifier_Identifier()
	 * @model required="true"
	 * @generated
	 */
	EList<adms.Identifier> getIdentifier();

} // Identifier

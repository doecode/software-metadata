/**
 */
package skos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link skos.Concept#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link skos.Concept#getAltLabel <em>Alt Label</em>}</li>
 * </ul>
 *
 * @see skos.SkosPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends EObject {
	/**
	 * Returns the value of the '<em><b>Pref Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pref Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Label</em>' attribute.
	 * @see #setPrefLabel(String)
	 * @see skos.SkosPackage#getConcept_PrefLabel()
	 * @model required="true"
	 * @generated
	 */
	String getPrefLabel();

	/**
	 * Sets the value of the '{@link skos.Concept#getPrefLabel <em>Pref Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref Label</em>' attribute.
	 * @see #getPrefLabel()
	 * @generated
	 */
	void setPrefLabel(String value);

	/**
	 * Returns the value of the '<em><b>Alt Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Label</em>' attribute list.
	 * @see skos.SkosPackage#getConcept_AltLabel()
	 * @model
	 * @generated
	 */
	EList<String> getAltLabel();

} // Concept

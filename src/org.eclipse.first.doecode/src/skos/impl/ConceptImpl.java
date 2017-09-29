/**
 */
package skos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import skos.Concept;
import skos.SkosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link skos.impl.ConceptImpl#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link skos.impl.ConceptImpl#getAltLabel <em>Alt Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptImpl extends MinimalEObjectImpl.Container implements Concept {
	/**
	 * The default value of the '{@link #getPrefLabel() <em>Pref Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PREF_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefLabel() <em>Pref Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefLabel()
	 * @generated
	 * @ordered
	 */
	protected String prefLabel = PREF_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAltLabel() <em>Alt Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> altLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkosPackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefLabel() {
		return prefLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefLabel(String newPrefLabel) {
		String oldPrefLabel = prefLabel;
		prefLabel = newPrefLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT__PREF_LABEL, oldPrefLabel, prefLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAltLabel() {
		if (altLabel == null) {
			altLabel = new EDataTypeUniqueEList<String>(String.class, this, SkosPackage.CONCEPT__ALT_LABEL);
		}
		return altLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SkosPackage.CONCEPT__PREF_LABEL:
				return getPrefLabel();
			case SkosPackage.CONCEPT__ALT_LABEL:
				return getAltLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SkosPackage.CONCEPT__PREF_LABEL:
				setPrefLabel((String)newValue);
				return;
			case SkosPackage.CONCEPT__ALT_LABEL:
				getAltLabel().clear();
				getAltLabel().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SkosPackage.CONCEPT__PREF_LABEL:
				setPrefLabel(PREF_LABEL_EDEFAULT);
				return;
			case SkosPackage.CONCEPT__ALT_LABEL:
				getAltLabel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SkosPackage.CONCEPT__PREF_LABEL:
				return PREF_LABEL_EDEFAULT == null ? prefLabel != null : !PREF_LABEL_EDEFAULT.equals(prefLabel);
			case SkosPackage.CONCEPT__ALT_LABEL:
				return altLabel != null && !altLabel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (prefLabel: ");
		result.append(prefLabel);
		result.append(", altLabel: ");
		result.append(altLabel);
		result.append(')');
		return result.toString();
	}

} //ConceptImpl

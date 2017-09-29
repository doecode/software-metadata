/**
 */
package adms.impl;

import adms.AdmsPackage;
import adms.Identifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adms.impl.IdentifierImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link adms.impl.IdentifierImpl#getSchemeAgency <em>Scheme Agency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierImpl extends MinimalEObjectImpl.Container implements Identifier {
	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected String notation = NOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemeAgency() <em>Scheme Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemeAgency()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_AGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemeAgency() <em>Scheme Agency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemeAgency()
	 * @generated
	 * @ordered
	 */
	protected String schemeAgency = SCHEME_AGENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmsPackage.Literals.IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(String newNotation) {
		String oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmsPackage.IDENTIFIER__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemeAgency() {
		return schemeAgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemeAgency(String newSchemeAgency) {
		String oldSchemeAgency = schemeAgency;
		schemeAgency = newSchemeAgency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmsPackage.IDENTIFIER__SCHEME_AGENCY, oldSchemeAgency, schemeAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdmsPackage.IDENTIFIER__NOTATION:
				return getNotation();
			case AdmsPackage.IDENTIFIER__SCHEME_AGENCY:
				return getSchemeAgency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdmsPackage.IDENTIFIER__NOTATION:
				setNotation((String)newValue);
				return;
			case AdmsPackage.IDENTIFIER__SCHEME_AGENCY:
				setSchemeAgency((String)newValue);
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
			case AdmsPackage.IDENTIFIER__NOTATION:
				setNotation(NOTATION_EDEFAULT);
				return;
			case AdmsPackage.IDENTIFIER__SCHEME_AGENCY:
				setSchemeAgency(SCHEME_AGENCY_EDEFAULT);
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
			case AdmsPackage.IDENTIFIER__NOTATION:
				return NOTATION_EDEFAULT == null ? notation != null : !NOTATION_EDEFAULT.equals(notation);
			case AdmsPackage.IDENTIFIER__SCHEME_AGENCY:
				return SCHEME_AGENCY_EDEFAULT == null ? schemeAgency != null : !SCHEME_AGENCY_EDEFAULT.equals(schemeAgency);
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
		result.append(" (notation: ");
		result.append(notation);
		result.append(", schemeAgency: ");
		result.append(schemeAgency);
		result.append(')');
		return result.toString();
	}

} //IdentifierImpl

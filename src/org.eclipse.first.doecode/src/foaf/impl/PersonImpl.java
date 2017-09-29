/**
 */
package foaf.impl;

import foaf.FoafPackage;
import foaf.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link foaf.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link foaf.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link foaf.impl.PersonImpl#getMbox_sha1sum <em>Mbox sha1sum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMbox_sha1sum() <em>Mbox sha1sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbox_sha1sum()
	 * @generated
	 * @ordered
	 */
	protected static final String MBOX_SHA1SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMbox_sha1sum() <em>Mbox sha1sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbox_sha1sum()
	 * @generated
	 * @ordered
	 */
	protected String mbox_sha1sum = MBOX_SHA1SUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoafPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.PERSON__FAMILY_NAME, oldFamilyName, familyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMbox_sha1sum() {
		return mbox_sha1sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMbox_sha1sum(String newMbox_sha1sum) {
		String oldMbox_sha1sum = mbox_sha1sum;
		mbox_sha1sum = newMbox_sha1sum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoafPackage.PERSON__MBOX_SHA1SUM, oldMbox_sha1sum, mbox_sha1sum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FoafPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case FoafPackage.PERSON__FAMILY_NAME:
				return getFamilyName();
			case FoafPackage.PERSON__MBOX_SHA1SUM:
				return getMbox_sha1sum();
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
			case FoafPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case FoafPackage.PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case FoafPackage.PERSON__MBOX_SHA1SUM:
				setMbox_sha1sum((String)newValue);
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
			case FoafPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case FoafPackage.PERSON__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
			case FoafPackage.PERSON__MBOX_SHA1SUM:
				setMbox_sha1sum(MBOX_SHA1SUM_EDEFAULT);
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
			case FoafPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case FoafPackage.PERSON__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
			case FoafPackage.PERSON__MBOX_SHA1SUM:
				return MBOX_SHA1SUM_EDEFAULT == null ? mbox_sha1sum != null : !MBOX_SHA1SUM_EDEFAULT.equals(mbox_sha1sum);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", familyName: ");
		result.append(familyName);
		result.append(", mbox_sha1sum: ");
		result.append(mbox_sha1sum);
		result.append(')');
		return result.toString();
	}

} //PersonImpl

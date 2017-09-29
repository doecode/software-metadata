/**
 */
package doecode.impl;

import doecode.DoecodePackage;
import doecode.Record;
import doecode.Software;

import org.Organization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link doecode.impl.RecordImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link doecode.impl.RecordImpl#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordImpl extends MinimalEObjectImpl.Container implements Record {
	/**
	 * The cached value of the '{@link #getOrg() <em>Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrg()
	 * @generated
	 * @ordered
	 */
	protected Organization org;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected Software software;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DoecodePackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrg() {
		if (org != null && org.eIsProxy()) {
			InternalEObject oldOrg = (InternalEObject)org;
			org = (Organization)eResolveProxy(oldOrg);
			if (org != oldOrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DoecodePackage.RECORD__ORG, oldOrg, org));
			}
		}
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrg() {
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrg(Organization newOrg) {
		Organization oldOrg = org;
		org = newOrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.RECORD__ORG, oldOrg, org));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSoftware() {
		if (software != null && software.eIsProxy()) {
			InternalEObject oldSoftware = (InternalEObject)software;
			software = (Software)eResolveProxy(oldSoftware);
			if (software != oldSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DoecodePackage.RECORD__SOFTWARE, oldSoftware, software));
			}
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software basicGetSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(Software newSoftware) {
		Software oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.RECORD__SOFTWARE, oldSoftware, software));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DoecodePackage.RECORD__ORG:
				if (resolve) return getOrg();
				return basicGetOrg();
			case DoecodePackage.RECORD__SOFTWARE:
				if (resolve) return getSoftware();
				return basicGetSoftware();
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
			case DoecodePackage.RECORD__ORG:
				setOrg((Organization)newValue);
				return;
			case DoecodePackage.RECORD__SOFTWARE:
				setSoftware((Software)newValue);
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
			case DoecodePackage.RECORD__ORG:
				setOrg((Organization)null);
				return;
			case DoecodePackage.RECORD__SOFTWARE:
				setSoftware((Software)null);
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
			case DoecodePackage.RECORD__ORG:
				return org != null;
			case DoecodePackage.RECORD__SOFTWARE:
				return software != null;
		}
		return super.eIsSet(featureID);
	}

} //RecordImpl

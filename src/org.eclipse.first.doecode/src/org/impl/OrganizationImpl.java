/**
 */
package org.impl;

import foaf.Person;

import java.util.Collection;

import org.OrgPackage;
import org.Organization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import skos.Concept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.impl.OrganizationImpl#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link org.impl.OrganizationImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends MinimalEObjectImpl.Container implements Organization {
	/**
	 * The cached value of the '{@link #getHasMember() <em>Has Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> hasMember;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected Concept labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getHasMember() {
		if (hasMember == null) {
			hasMember = new EObjectResolvingEList<Person>(Person.class, this, OrgPackage.ORGANIZATION__HAS_MEMBER);
		}
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getLabels() {
		if (labels != null && labels.eIsProxy()) {
			InternalEObject oldLabels = (InternalEObject)labels;
			labels = (Concept)eResolveProxy(oldLabels);
			if (labels != oldLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgPackage.ORGANIZATION__LABELS, oldLabels, labels));
			}
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabels(Concept newLabels) {
		Concept oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.ORGANIZATION__LABELS, oldLabels, labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgPackage.ORGANIZATION__HAS_MEMBER:
				return getHasMember();
			case OrgPackage.ORGANIZATION__LABELS:
				if (resolve) return getLabels();
				return basicGetLabels();
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
			case OrgPackage.ORGANIZATION__HAS_MEMBER:
				getHasMember().clear();
				getHasMember().addAll((Collection<? extends Person>)newValue);
				return;
			case OrgPackage.ORGANIZATION__LABELS:
				setLabels((Concept)newValue);
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
			case OrgPackage.ORGANIZATION__HAS_MEMBER:
				getHasMember().clear();
				return;
			case OrgPackage.ORGANIZATION__LABELS:
				setLabels((Concept)null);
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
			case OrgPackage.ORGANIZATION__HAS_MEMBER:
				return hasMember != null && !hasMember.isEmpty();
			case OrgPackage.ORGANIZATION__LABELS:
				return labels != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl

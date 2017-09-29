/**
 */
package doecode.impl;

import doecode.DoecodePackage;
import doecode.Person;

import foaf.Document;

import org.Organization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link doecode.impl.PersonImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link doecode.impl.PersonImpl#getIsMemberOf <em>Is Member Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Document creator;

	/**
	 * The cached value of the '{@link #getIsMemberOf() <em>Is Member Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMemberOf()
	 * @generated
	 * @ordered
	 */
	protected Organization isMemberOf;

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
		return DoecodePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Document newCreator, NotificationChain msgs) {
		Document oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DoecodePackage.PERSON__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Document newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DoecodePackage.PERSON__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DoecodePackage.PERSON__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.PERSON__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getIsMemberOf() {
		if (isMemberOf != null && isMemberOf.eIsProxy()) {
			InternalEObject oldIsMemberOf = (InternalEObject)isMemberOf;
			isMemberOf = (Organization)eResolveProxy(oldIsMemberOf);
			if (isMemberOf != oldIsMemberOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DoecodePackage.PERSON__IS_MEMBER_OF, oldIsMemberOf, isMemberOf));
			}
		}
		return isMemberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetIsMemberOf() {
		return isMemberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMemberOf(Organization newIsMemberOf) {
		Organization oldIsMemberOf = isMemberOf;
		isMemberOf = newIsMemberOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.PERSON__IS_MEMBER_OF, oldIsMemberOf, isMemberOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DoecodePackage.PERSON__CREATOR:
				return basicSetCreator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DoecodePackage.PERSON__CREATOR:
				return getCreator();
			case DoecodePackage.PERSON__IS_MEMBER_OF:
				if (resolve) return getIsMemberOf();
				return basicGetIsMemberOf();
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
			case DoecodePackage.PERSON__CREATOR:
				setCreator((Document)newValue);
				return;
			case DoecodePackage.PERSON__IS_MEMBER_OF:
				setIsMemberOf((Organization)newValue);
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
			case DoecodePackage.PERSON__CREATOR:
				setCreator((Document)null);
				return;
			case DoecodePackage.PERSON__IS_MEMBER_OF:
				setIsMemberOf((Organization)null);
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
			case DoecodePackage.PERSON__CREATOR:
				return creator != null;
			case DoecodePackage.PERSON__IS_MEMBER_OF:
				return isMemberOf != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl

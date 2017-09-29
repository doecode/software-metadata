/**
 */
package doecode.impl;

import doecode.Document;
import doecode.DoecodePackage;
import doecode.Identifier;
import doecode.Person;
import doecode.Software;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link doecode.impl.SoftwareImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#isRights <em>Rights</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getCodeRepository <em>Code Repository</em>}</li>
 *   <li>{@link doecode.impl.SoftwareImpl#getIsReferencedBy <em>Is Referenced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareImpl extends MinimalEObjectImpl.Container implements Software {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Person creator;

	/**
	 * The default value of the '{@link #getIssued() <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Date issued = ISSUED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRights()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRights()
	 * @generated
	 * @ordered
	 */
	protected boolean rights = RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeRepository() <em>Code Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeRepository() <em>Code Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRepository()
	 * @generated
	 * @ordered
	 */
	protected String codeRepository = CODE_REPOSITORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsReferencedBy() <em>Is Referenced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected Document isReferencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DoecodePackage.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Person newCreator, NotificationChain msgs) {
		Person oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Person newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DoecodePackage.SOFTWARE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DoecodePackage.SOFTWARE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Date newIssued) {
		Date oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, DoecodePackage.SOFTWARE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRights(boolean newRights) {
		boolean oldRights = rights;
		rights = newRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__RIGHTS, oldRights, rights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeRepository() {
		return codeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeRepository(String newCodeRepository) {
		String oldCodeRepository = codeRepository;
		codeRepository = newCodeRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__CODE_REPOSITORY, oldCodeRepository, codeRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getIsReferencedBy() {
		if (isReferencedBy != null && isReferencedBy.eIsProxy()) {
			InternalEObject oldIsReferencedBy = (InternalEObject)isReferencedBy;
			isReferencedBy = (Document)eResolveProxy(oldIsReferencedBy);
			if (isReferencedBy != oldIsReferencedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DoecodePackage.SOFTWARE__IS_REFERENCED_BY, oldIsReferencedBy, isReferencedBy));
			}
		}
		return isReferencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetIsReferencedBy() {
		return isReferencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsReferencedBy(Document newIsReferencedBy, NotificationChain msgs) {
		Document oldIsReferencedBy = isReferencedBy;
		isReferencedBy = newIsReferencedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__IS_REFERENCED_BY, oldIsReferencedBy, newIsReferencedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReferencedBy(Document newIsReferencedBy) {
		if (newIsReferencedBy != isReferencedBy) {
			NotificationChain msgs = null;
			if (isReferencedBy != null)
				msgs = ((InternalEObject)isReferencedBy).eInverseRemove(this, DoecodePackage.DOCUMENT__REFERENCES, Document.class, msgs);
			if (newIsReferencedBy != null)
				msgs = ((InternalEObject)newIsReferencedBy).eInverseAdd(this, DoecodePackage.DOCUMENT__REFERENCES, Document.class, msgs);
			msgs = basicSetIsReferencedBy(newIsReferencedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DoecodePackage.SOFTWARE__IS_REFERENCED_BY, newIsReferencedBy, newIsReferencedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				if (isReferencedBy != null)
					msgs = ((InternalEObject)isReferencedBy).eInverseRemove(this, DoecodePackage.DOCUMENT__REFERENCES, Document.class, msgs);
				return basicSetIsReferencedBy((Document)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DoecodePackage.SOFTWARE__CREATOR:
				return basicSetCreator(null, msgs);
			case DoecodePackage.SOFTWARE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				return basicSetIsReferencedBy(null, msgs);
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
			case DoecodePackage.SOFTWARE__TITLE:
				return getTitle();
			case DoecodePackage.SOFTWARE__CREATOR:
				return getCreator();
			case DoecodePackage.SOFTWARE__ISSUED:
				return getIssued();
			case DoecodePackage.SOFTWARE__IDENTIFIER:
				return getIdentifier();
			case DoecodePackage.SOFTWARE__DESCRIPTION:
				return getDescription();
			case DoecodePackage.SOFTWARE__RIGHTS:
				return isRights();
			case DoecodePackage.SOFTWARE__CODE_REPOSITORY:
				return getCodeRepository();
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				if (resolve) return getIsReferencedBy();
				return basicGetIsReferencedBy();
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
			case DoecodePackage.SOFTWARE__TITLE:
				setTitle((String)newValue);
				return;
			case DoecodePackage.SOFTWARE__CREATOR:
				setCreator((Person)newValue);
				return;
			case DoecodePackage.SOFTWARE__ISSUED:
				setIssued((Date)newValue);
				return;
			case DoecodePackage.SOFTWARE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case DoecodePackage.SOFTWARE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DoecodePackage.SOFTWARE__RIGHTS:
				setRights((Boolean)newValue);
				return;
			case DoecodePackage.SOFTWARE__CODE_REPOSITORY:
				setCodeRepository((String)newValue);
				return;
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				setIsReferencedBy((Document)newValue);
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
			case DoecodePackage.SOFTWARE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DoecodePackage.SOFTWARE__CREATOR:
				setCreator((Person)null);
				return;
			case DoecodePackage.SOFTWARE__ISSUED:
				setIssued(ISSUED_EDEFAULT);
				return;
			case DoecodePackage.SOFTWARE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case DoecodePackage.SOFTWARE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DoecodePackage.SOFTWARE__RIGHTS:
				setRights(RIGHTS_EDEFAULT);
				return;
			case DoecodePackage.SOFTWARE__CODE_REPOSITORY:
				setCodeRepository(CODE_REPOSITORY_EDEFAULT);
				return;
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				setIsReferencedBy((Document)null);
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
			case DoecodePackage.SOFTWARE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DoecodePackage.SOFTWARE__CREATOR:
				return creator != null;
			case DoecodePackage.SOFTWARE__ISSUED:
				return ISSUED_EDEFAULT == null ? issued != null : !ISSUED_EDEFAULT.equals(issued);
			case DoecodePackage.SOFTWARE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case DoecodePackage.SOFTWARE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DoecodePackage.SOFTWARE__RIGHTS:
				return rights != RIGHTS_EDEFAULT;
			case DoecodePackage.SOFTWARE__CODE_REPOSITORY:
				return CODE_REPOSITORY_EDEFAULT == null ? codeRepository != null : !CODE_REPOSITORY_EDEFAULT.equals(codeRepository);
			case DoecodePackage.SOFTWARE__IS_REFERENCED_BY:
				return isReferencedBy != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", issued: ");
		result.append(issued);
		result.append(", description: ");
		result.append(description);
		result.append(", rights: ");
		result.append(rights);
		result.append(", codeRepository: ");
		result.append(codeRepository);
		result.append(')');
		return result.toString();
	}

} //SoftwareImpl

/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL.impl;

import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Focus;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Move;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Scope;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Time;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getToTime <em>To Time</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getContentLabel <em>Content Label</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getContent <em>Content</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation
{
  /**
   * The cached value of the '{@link #getFromTime() <em>From Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromTime()
   * @generated
   * @ordered
   */
  protected Time fromTime;

  /**
   * The cached value of the '{@link #getToTime() <em>To Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToTime()
   * @generated
   * @ordered
   */
  protected Time toTime;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected static final String SENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected String sender = SENDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Move type;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected Scope scope;

  /**
   * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected Focus focus;

  /**
   * The default value of the '{@link #getContentLabel() <em>Content Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentLabel()
   * @generated
   * @ordered
   */
  protected static final String CONTENT_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContentLabel() <em>Content Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentLabel()
   * @generated
   * @ordered
   */
  protected String contentLabel = CONTENT_LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected static final String CONTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected String content = CONTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Annotation target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VideoAnnotationsDSLPackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time getFromTime()
  {
    return fromTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromTime(Time newFromTime, NotificationChain msgs)
  {
    Time oldFromTime = fromTime;
    fromTime = newFromTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME, oldFromTime, newFromTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromTime(Time newFromTime)
  {
    if (newFromTime != fromTime)
    {
      NotificationChain msgs = null;
      if (fromTime != null)
        msgs = ((InternalEObject)fromTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME, null, msgs);
      if (newFromTime != null)
        msgs = ((InternalEObject)newFromTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME, null, msgs);
      msgs = basicSetFromTime(newFromTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME, newFromTime, newFromTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time getToTime()
  {
    return toTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToTime(Time newToTime, NotificationChain msgs)
  {
    Time oldToTime = toTime;
    toTime = newToTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME, oldToTime, newToTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToTime(Time newToTime)
  {
    if (newToTime != toTime)
    {
      NotificationChain msgs = null;
      if (toTime != null)
        msgs = ((InternalEObject)toTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME, null, msgs);
      if (newToTime != null)
        msgs = ((InternalEObject)newToTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME, null, msgs);
      msgs = basicSetToTime(newToTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME, newToTime, newToTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(String newSender)
  {
    String oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Move getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Move newType, NotificationChain msgs)
  {
    Move oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Move newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs)
  {
    Scope oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__SCOPE, oldScope, newScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(Scope newScope)
  {
    if (newScope != scope)
    {
      NotificationChain msgs = null;
      if (scope != null)
        msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__SCOPE, null, msgs);
      if (newScope != null)
        msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__SCOPE, null, msgs);
      msgs = basicSetScope(newScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__SCOPE, newScope, newScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Focus getFocus()
  {
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFocus(Focus newFocus, NotificationChain msgs)
  {
    Focus oldFocus = focus;
    focus = newFocus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__FOCUS, oldFocus, newFocus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFocus(Focus newFocus)
  {
    if (newFocus != focus)
    {
      NotificationChain msgs = null;
      if (focus != null)
        msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__FOCUS, null, msgs);
      if (newFocus != null)
        msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoAnnotationsDSLPackage.ANNOTATION__FOCUS, null, msgs);
      msgs = basicSetFocus(newFocus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__FOCUS, newFocus, newFocus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContentLabel()
  {
    return contentLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentLabel(String newContentLabel)
  {
    String oldContentLabel = contentLabel;
    contentLabel = newContentLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__CONTENT_LABEL, oldContentLabel, contentLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(String newContent)
  {
    String oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Annotation)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoAnnotationsDSLPackage.ANNOTATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Annotation newTarget)
  {
    Annotation oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.ANNOTATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME:
        return basicSetFromTime(null, msgs);
      case VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME:
        return basicSetToTime(null, msgs);
      case VideoAnnotationsDSLPackage.ANNOTATION__TYPE:
        return basicSetType(null, msgs);
      case VideoAnnotationsDSLPackage.ANNOTATION__SCOPE:
        return basicSetScope(null, msgs);
      case VideoAnnotationsDSLPackage.ANNOTATION__FOCUS:
        return basicSetFocus(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME:
        return getFromTime();
      case VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME:
        return getToTime();
      case VideoAnnotationsDSLPackage.ANNOTATION__NAME:
        return getName();
      case VideoAnnotationsDSLPackage.ANNOTATION__SENDER:
        return getSender();
      case VideoAnnotationsDSLPackage.ANNOTATION__TYPE:
        return getType();
      case VideoAnnotationsDSLPackage.ANNOTATION__SCOPE:
        return getScope();
      case VideoAnnotationsDSLPackage.ANNOTATION__FOCUS:
        return getFocus();
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT_LABEL:
        return getContentLabel();
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT:
        return getContent();
      case VideoAnnotationsDSLPackage.ANNOTATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME:
        setFromTime((Time)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME:
        setToTime((Time)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__SENDER:
        setSender((String)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TYPE:
        setType((Move)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__SCOPE:
        setScope((Scope)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__FOCUS:
        setFocus((Focus)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT_LABEL:
        setContentLabel((String)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT:
        setContent((String)newValue);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TARGET:
        setTarget((Annotation)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME:
        setFromTime((Time)null);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME:
        setToTime((Time)null);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TYPE:
        setType((Move)null);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__SCOPE:
        setScope((Scope)null);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__FOCUS:
        setFocus((Focus)null);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT_LABEL:
        setContentLabel(CONTENT_LABEL_EDEFAULT);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT:
        setContent(CONTENT_EDEFAULT);
        return;
      case VideoAnnotationsDSLPackage.ANNOTATION__TARGET:
        setTarget((Annotation)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.ANNOTATION__FROM_TIME:
        return fromTime != null;
      case VideoAnnotationsDSLPackage.ANNOTATION__TO_TIME:
        return toTime != null;
      case VideoAnnotationsDSLPackage.ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VideoAnnotationsDSLPackage.ANNOTATION__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case VideoAnnotationsDSLPackage.ANNOTATION__TYPE:
        return type != null;
      case VideoAnnotationsDSLPackage.ANNOTATION__SCOPE:
        return scope != null;
      case VideoAnnotationsDSLPackage.ANNOTATION__FOCUS:
        return focus != null;
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT_LABEL:
        return CONTENT_LABEL_EDEFAULT == null ? contentLabel != null : !CONTENT_LABEL_EDEFAULT.equals(contentLabel);
      case VideoAnnotationsDSLPackage.ANNOTATION__CONTENT:
        return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
      case VideoAnnotationsDSLPackage.ANNOTATION__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", sender: ");
    result.append(sender);
    result.append(", contentLabel: ");
    result.append(contentLabel);
    result.append(", content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //AnnotationImpl

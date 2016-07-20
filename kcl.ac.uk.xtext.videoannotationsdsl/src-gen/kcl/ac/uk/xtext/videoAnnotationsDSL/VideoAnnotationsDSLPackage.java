/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLFactory
 * @model kind="package"
 * @generated
 */
public interface VideoAnnotationsDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videoAnnotationsDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.kcl/uk/xtext/VideoAnnotationsDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videoAnnotationsDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoAnnotationsDSLPackage eINSTANCE = kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotatedVideoImpl <em>Annotated Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotatedVideoImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getAnnotatedVideo()
   * @generated
   */
  int ANNOTATED_VIDEO = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_VIDEO__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotated Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_VIDEO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>From Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__FROM_TIME = 0;

  /**
   * The feature id for the '<em><b>To Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TO_TIME = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ID = 2;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__SENDER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPE = 4;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__SCOPE = 5;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__FOCUS = 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__CONTENT = 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TARGET = 8;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.MoveImpl <em>Move</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.MoveImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getMove()
   * @generated
   */
  int MOVE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Move</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.ScopeImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 3;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__SCOPE = 0;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.FocusImpl <em>Focus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.FocusImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getFocus()
   * @generated
   */
  int FOCUS = 4;

  /**
   * The feature id for the '<em><b>Focus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOCUS__FOCUS = 0;

  /**
   * The number of structural features of the '<em>Focus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOCUS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.TimeImpl
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getTime()
   * @generated
   */
  int TIME = 5;

  /**
   * The feature id for the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__SEC = 0;

  /**
   * The number of structural features of the '<em>Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo <em>Annotated Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Video</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo
   * @generated
   */
  EClass getAnnotatedVideo();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo#getAnnotations()
   * @see #getAnnotatedVideo()
   * @generated
   */
  EReference getAnnotatedVideo_Annotations();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFromTime <em>From Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Time</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFromTime()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_FromTime();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getToTime <em>To Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Time</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getToTime()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_ToTime();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getId()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Id();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getSender()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Sender();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getType()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Type();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getScope()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Scope();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFocus()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Focus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getContent()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Content();

  /**
   * Returns the meta object for the reference '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getTarget()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Target();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Move
   * @generated
   */
  EClass getMove();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Move#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Move#getType()
   * @see #getMove()
   * @generated
   */
  EAttribute getMove_Type();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Scope#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Scope#getScope()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Scope();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Focus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Focus
   * @generated
   */
  EClass getFocus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Focus#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Focus#getFocus()
   * @see #getFocus()
   * @generated
   */
  EAttribute getFocus_Focus();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Time#getSec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec</em>'.
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.Time#getSec()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Sec();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideoAnnotationsDSLFactory getVideoAnnotationsDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotatedVideoImpl <em>Annotated Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotatedVideoImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getAnnotatedVideo()
     * @generated
     */
    EClass ANNOTATED_VIDEO = eINSTANCE.getAnnotatedVideo();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_VIDEO__ANNOTATIONS = eINSTANCE.getAnnotatedVideo_Annotations();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.AnnotationImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>From Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__FROM_TIME = eINSTANCE.getAnnotation_FromTime();

    /**
     * The meta object literal for the '<em><b>To Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__TO_TIME = eINSTANCE.getAnnotation_ToTime();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__ID = eINSTANCE.getAnnotation_Id();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__SENDER = eINSTANCE.getAnnotation_Sender();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__SCOPE = eINSTANCE.getAnnotation_Scope();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__FOCUS = eINSTANCE.getAnnotation_Focus();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__CONTENT = eINSTANCE.getAnnotation_Content();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__TARGET = eINSTANCE.getAnnotation_Target();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.MoveImpl <em>Move</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.MoveImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getMove()
     * @generated
     */
    EClass MOVE = eINSTANCE.getMove();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE__TYPE = eINSTANCE.getMove_Type();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.ScopeImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__SCOPE = eINSTANCE.getScope_Scope();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.FocusImpl <em>Focus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.FocusImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getFocus()
     * @generated
     */
    EClass FOCUS = eINSTANCE.getFocus();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOCUS__FOCUS = eINSTANCE.getFocus_Focus();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.TimeImpl
     * @see kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLPackageImpl#getTime()
     * @generated
     */
    EClass TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__SEC = eINSTANCE.getTime_Sec();

  }

} //VideoAnnotationsDSLPackage

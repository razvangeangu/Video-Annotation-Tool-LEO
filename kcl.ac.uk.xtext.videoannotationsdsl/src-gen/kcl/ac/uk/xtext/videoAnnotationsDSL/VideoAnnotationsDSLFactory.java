/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage
 * @generated
 */
public interface VideoAnnotationsDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoAnnotationsDSLFactory eINSTANCE = kcl.ac.uk.xtext.videoAnnotationsDSL.impl.VideoAnnotationsDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Annotated Video</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotated Video</em>'.
   * @generated
   */
  AnnotatedVideo createAnnotatedVideo();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move</em>'.
   * @generated
   */
  Move createMove();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>Focus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Focus</em>'.
   * @generated
   */
  Focus createFocus();

  /**
   * Returns a new object of class '<em>Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time</em>'.
   * @generated
   */
  Time createTime();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideoAnnotationsDSLPackage getVideoAnnotationsDSLPackage();

} //VideoAnnotationsDSLFactory

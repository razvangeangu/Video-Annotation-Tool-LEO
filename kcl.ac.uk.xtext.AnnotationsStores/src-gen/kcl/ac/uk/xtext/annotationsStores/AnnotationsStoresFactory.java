/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.annotationsStores;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresPackage
 * @generated
 */
public interface AnnotationsStoresFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnnotationsStoresFactory eINSTANCE = kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Annotation Stores</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Stores</em>'.
   * @generated
   */
  AnnotationStores createAnnotationStores();

  /**
   * Returns a new object of class '<em>Proposal Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proposal Store</em>'.
   * @generated
   */
  ProposalStore createProposalStore();

  /**
   * Returns a new object of class '<em>Question Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question Store</em>'.
   * @generated
   */
  QuestionStore createQuestionStore();

  /**
   * Returns a new object of class '<em>Challenge Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Challenge Store</em>'.
   * @generated
   */
  ChallengeStore createChallengeStore();

  /**
   * Returns a new object of class '<em>Commitment Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commitment Store</em>'.
   * @generated
   */
  CommitmentStore createCommitmentStore();

  /**
   * Returns a new object of class '<em>Argument Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Store</em>'.
   * @generated
   */
  ArgumentStore createArgumentStore();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AnnotationsStoresPackage getAnnotationsStoresPackage();

} //AnnotationsStoresFactory

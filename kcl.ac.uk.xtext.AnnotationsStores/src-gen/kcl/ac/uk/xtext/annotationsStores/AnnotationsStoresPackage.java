/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.annotationsStores;

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
 * @see kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsStoresPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "annotationsStores";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.kcl/uk/xtext/AnnotationsStores";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "annotationsStores";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnnotationsStoresPackage eINSTANCE = kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl.init();

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.AnnotationStoresImpl <em>Annotation Stores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationStoresImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getAnnotationStores()
   * @generated
   */
  int ANNOTATION_STORES = 0;

  /**
   * The feature id for the '<em><b>Proposal Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES__PROPOSAL_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Question Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES__QUESTION_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Challenge Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES__CHALLENGE_ELEMENTS = 2;

  /**
   * The feature id for the '<em><b>Commitment Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES__COMMITMENT_ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Argument Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES__ARGUMENT_ELEMENTS = 4;

  /**
   * The number of structural features of the '<em>Annotation Stores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_STORES_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ProposalStoreImpl <em>Proposal Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.ProposalStoreImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getProposalStore()
   * @generated
   */
  int PROPOSAL_STORE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSAL_STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSAL_STORE__SCOPE = 1;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSAL_STORE__FOCUS = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSAL_STORE__CONTENT = 3;

  /**
   * The number of structural features of the '<em>Proposal Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSAL_STORE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.QuestionStoreImpl <em>Question Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.QuestionStoreImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getQuestionStore()
   * @generated
   */
  int QUESTION_STORE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE__SENDER = 1;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE__SCOPE = 2;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE__FOCUS = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE__CONTENT = 4;

  /**
   * The number of structural features of the '<em>Question Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_STORE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ChallengeStoreImpl <em>Challenge Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.ChallengeStoreImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getChallengeStore()
   * @generated
   */
  int CHALLENGE_STORE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHALLENGE_STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHALLENGE_STORE__SENDER = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHALLENGE_STORE__TARGET = 2;

  /**
   * The number of structural features of the '<em>Challenge Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHALLENGE_STORE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.CommitmentStoreImpl <em>Commitment Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.CommitmentStoreImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getCommitmentStore()
   * @generated
   */
  int COMMITMENT_STORE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_STORE__SCOPE = 1;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_STORE__FOCUS = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_STORE__CONTENT = 3;

  /**
   * The number of structural features of the '<em>Commitment Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMITMENT_STORE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ArgumentStoreImpl <em>Argument Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.ArgumentStoreImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getArgumentStore()
   * @generated
   */
  int ARGUMENT_STORE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE__NAME = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE__SCOPE = 1;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE__FOCUS = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE__CONTENT = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE__TARGET = 4;

  /**
   * The number of structural features of the '<em>Argument Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STORE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.ScopeImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 6;

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
   * The meta object id for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.FocusImpl <em>Focus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kcl.ac.uk.xtext.annotationsStores.impl.FocusImpl
   * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getFocus()
   * @generated
   */
  int FOCUS = 7;

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
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores <em>Annotation Stores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Stores</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores
   * @generated
   */
  EClass getAnnotationStores();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getProposalElements <em>Proposal Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proposal Elements</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getProposalElements()
   * @see #getAnnotationStores()
   * @generated
   */
  EReference getAnnotationStores_ProposalElements();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getQuestionElements <em>Question Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Question Elements</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getQuestionElements()
   * @see #getAnnotationStores()
   * @generated
   */
  EReference getAnnotationStores_QuestionElements();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getChallengeElements <em>Challenge Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Challenge Elements</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getChallengeElements()
   * @see #getAnnotationStores()
   * @generated
   */
  EReference getAnnotationStores_ChallengeElements();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getCommitmentElements <em>Commitment Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commitment Elements</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getCommitmentElements()
   * @see #getAnnotationStores()
   * @generated
   */
  EReference getAnnotationStores_CommitmentElements();

  /**
   * Returns the meta object for the containment reference list '{@link kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getArgumentElements <em>Argument Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument Elements</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.AnnotationStores#getArgumentElements()
   * @see #getAnnotationStores()
   * @generated
   */
  EReference getAnnotationStores_ArgumentElements();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.ProposalStore <em>Proposal Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposal Store</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ProposalStore
   * @generated
   */
  EClass getProposalStore();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ProposalStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ProposalStore#getName()
   * @see #getProposalStore()
   * @generated
   */
  EAttribute getProposalStore_Name();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.ProposalStore#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ProposalStore#getScope()
   * @see #getProposalStore()
   * @generated
   */
  EReference getProposalStore_Scope();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.ProposalStore#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ProposalStore#getFocus()
   * @see #getProposalStore()
   * @generated
   */
  EReference getProposalStore_Focus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ProposalStore#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ProposalStore#getContent()
   * @see #getProposalStore()
   * @generated
   */
  EAttribute getProposalStore_Content();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore <em>Question Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question Store</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore
   * @generated
   */
  EClass getQuestionStore();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore#getName()
   * @see #getQuestionStore()
   * @generated
   */
  EAttribute getQuestionStore_Name();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore#getSender()
   * @see #getQuestionStore()
   * @generated
   */
  EAttribute getQuestionStore_Sender();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore#getScope()
   * @see #getQuestionStore()
   * @generated
   */
  EReference getQuestionStore_Scope();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore#getFocus()
   * @see #getQuestionStore()
   * @generated
   */
  EReference getQuestionStore_Focus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.QuestionStore#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.QuestionStore#getContent()
   * @see #getQuestionStore()
   * @generated
   */
  EAttribute getQuestionStore_Content();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.ChallengeStore <em>Challenge Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Challenge Store</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ChallengeStore
   * @generated
   */
  EClass getChallengeStore();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getName()
   * @see #getChallengeStore()
   * @generated
   */
  EAttribute getChallengeStore_Name();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getSender()
   * @see #getChallengeStore()
   * @generated
   */
  EAttribute getChallengeStore_Sender();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ChallengeStore#getTarget()
   * @see #getChallengeStore()
   * @generated
   */
  EAttribute getChallengeStore_Target();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.CommitmentStore <em>Commitment Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commitment Store</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.CommitmentStore
   * @generated
   */
  EClass getCommitmentStore();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getName()
   * @see #getCommitmentStore()
   * @generated
   */
  EAttribute getCommitmentStore_Name();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getScope()
   * @see #getCommitmentStore()
   * @generated
   */
  EReference getCommitmentStore_Scope();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getFocus()
   * @see #getCommitmentStore()
   * @generated
   */
  EReference getCommitmentStore_Focus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.CommitmentStore#getContent()
   * @see #getCommitmentStore()
   * @generated
   */
  EAttribute getCommitmentStore_Content();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore <em>Argument Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Store</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore
   * @generated
   */
  EClass getArgumentStore();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getName()
   * @see #getArgumentStore()
   * @generated
   */
  EAttribute getArgumentStore_Name();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getScope()
   * @see #getArgumentStore()
   * @generated
   */
  EReference getArgumentStore_Scope();

  /**
   * Returns the meta object for the containment reference '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getFocus()
   * @see #getArgumentStore()
   * @generated
   */
  EReference getArgumentStore_Focus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getContent()
   * @see #getArgumentStore()
   * @generated
   */
  EAttribute getArgumentStore_Content();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.ArgumentStore#getTarget()
   * @see #getArgumentStore()
   * @generated
   */
  EAttribute getArgumentStore_Target();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.Scope#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.Scope#getScope()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Scope();

  /**
   * Returns the meta object for class '{@link kcl.ac.uk.xtext.annotationsStores.Focus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.Focus
   * @generated
   */
  EClass getFocus();

  /**
   * Returns the meta object for the attribute '{@link kcl.ac.uk.xtext.annotationsStores.Focus#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Focus</em>'.
   * @see kcl.ac.uk.xtext.annotationsStores.Focus#getFocus()
   * @see #getFocus()
   * @generated
   */
  EAttribute getFocus_Focus();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AnnotationsStoresFactory getAnnotationsStoresFactory();

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
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.AnnotationStoresImpl <em>Annotation Stores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationStoresImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getAnnotationStores()
     * @generated
     */
    EClass ANNOTATION_STORES = eINSTANCE.getAnnotationStores();

    /**
     * The meta object literal for the '<em><b>Proposal Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_STORES__PROPOSAL_ELEMENTS = eINSTANCE.getAnnotationStores_ProposalElements();

    /**
     * The meta object literal for the '<em><b>Question Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_STORES__QUESTION_ELEMENTS = eINSTANCE.getAnnotationStores_QuestionElements();

    /**
     * The meta object literal for the '<em><b>Challenge Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_STORES__CHALLENGE_ELEMENTS = eINSTANCE.getAnnotationStores_ChallengeElements();

    /**
     * The meta object literal for the '<em><b>Commitment Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_STORES__COMMITMENT_ELEMENTS = eINSTANCE.getAnnotationStores_CommitmentElements();

    /**
     * The meta object literal for the '<em><b>Argument Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_STORES__ARGUMENT_ELEMENTS = eINSTANCE.getAnnotationStores_ArgumentElements();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ProposalStoreImpl <em>Proposal Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.ProposalStoreImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getProposalStore()
     * @generated
     */
    EClass PROPOSAL_STORE = eINSTANCE.getProposalStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSAL_STORE__NAME = eINSTANCE.getProposalStore_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSAL_STORE__SCOPE = eINSTANCE.getProposalStore_Scope();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSAL_STORE__FOCUS = eINSTANCE.getProposalStore_Focus();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSAL_STORE__CONTENT = eINSTANCE.getProposalStore_Content();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.QuestionStoreImpl <em>Question Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.QuestionStoreImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getQuestionStore()
     * @generated
     */
    EClass QUESTION_STORE = eINSTANCE.getQuestionStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_STORE__NAME = eINSTANCE.getQuestionStore_Name();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_STORE__SENDER = eINSTANCE.getQuestionStore_Sender();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION_STORE__SCOPE = eINSTANCE.getQuestionStore_Scope();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION_STORE__FOCUS = eINSTANCE.getQuestionStore_Focus();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_STORE__CONTENT = eINSTANCE.getQuestionStore_Content();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ChallengeStoreImpl <em>Challenge Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.ChallengeStoreImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getChallengeStore()
     * @generated
     */
    EClass CHALLENGE_STORE = eINSTANCE.getChallengeStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHALLENGE_STORE__NAME = eINSTANCE.getChallengeStore_Name();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHALLENGE_STORE__SENDER = eINSTANCE.getChallengeStore_Sender();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHALLENGE_STORE__TARGET = eINSTANCE.getChallengeStore_Target();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.CommitmentStoreImpl <em>Commitment Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.CommitmentStoreImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getCommitmentStore()
     * @generated
     */
    EClass COMMITMENT_STORE = eINSTANCE.getCommitmentStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITMENT_STORE__NAME = eINSTANCE.getCommitmentStore_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITMENT_STORE__SCOPE = eINSTANCE.getCommitmentStore_Scope();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMITMENT_STORE__FOCUS = eINSTANCE.getCommitmentStore_Focus();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMITMENT_STORE__CONTENT = eINSTANCE.getCommitmentStore_Content();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ArgumentStoreImpl <em>Argument Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.ArgumentStoreImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getArgumentStore()
     * @generated
     */
    EClass ARGUMENT_STORE = eINSTANCE.getArgumentStore();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_STORE__NAME = eINSTANCE.getArgumentStore_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_STORE__SCOPE = eINSTANCE.getArgumentStore_Scope();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_STORE__FOCUS = eINSTANCE.getArgumentStore_Focus();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_STORE__CONTENT = eINSTANCE.getArgumentStore_Content();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_STORE__TARGET = eINSTANCE.getArgumentStore_Target();

    /**
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.ScopeImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getScope()
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
     * The meta object literal for the '{@link kcl.ac.uk.xtext.annotationsStores.impl.FocusImpl <em>Focus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kcl.ac.uk.xtext.annotationsStores.impl.FocusImpl
     * @see kcl.ac.uk.xtext.annotationsStores.impl.AnnotationsStoresPackageImpl#getFocus()
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

  }

} //AnnotationsStoresPackage

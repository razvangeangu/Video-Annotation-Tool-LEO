/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.annotationsStores.impl;

import kcl.ac.uk.xtext.annotationsStores.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsStoresFactoryImpl extends EFactoryImpl implements AnnotationsStoresFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnnotationsStoresFactory init()
  {
    try
    {
      AnnotationsStoresFactory theAnnotationsStoresFactory = (AnnotationsStoresFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotationsStoresPackage.eNS_URI);
      if (theAnnotationsStoresFactory != null)
      {
        return theAnnotationsStoresFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnnotationsStoresFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsStoresFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AnnotationsStoresPackage.ANNOTATION_STORES: return createAnnotationStores();
      case AnnotationsStoresPackage.PROPOSAL_STORE: return createProposalStore();
      case AnnotationsStoresPackage.QUESTION_STORE: return createQuestionStore();
      case AnnotationsStoresPackage.CHALLENGE_STORE: return createChallengeStore();
      case AnnotationsStoresPackage.COMMITMENT_STORE: return createCommitmentStore();
      case AnnotationsStoresPackage.ARGUMENT_STORE: return createArgumentStore();
      case AnnotationsStoresPackage.SCOPE: return createScope();
      case AnnotationsStoresPackage.FOCUS: return createFocus();
      case AnnotationsStoresPackage.EFFECT: return createEffect();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationStores createAnnotationStores()
  {
    AnnotationStoresImpl annotationStores = new AnnotationStoresImpl();
    return annotationStores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProposalStore createProposalStore()
  {
    ProposalStoreImpl proposalStore = new ProposalStoreImpl();
    return proposalStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionStore createQuestionStore()
  {
    QuestionStoreImpl questionStore = new QuestionStoreImpl();
    return questionStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChallengeStore createChallengeStore()
  {
    ChallengeStoreImpl challengeStore = new ChallengeStoreImpl();
    return challengeStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommitmentStore createCommitmentStore()
  {
    CommitmentStoreImpl commitmentStore = new CommitmentStoreImpl();
    return commitmentStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentStore createArgumentStore()
  {
    ArgumentStoreImpl argumentStore = new ArgumentStoreImpl();
    return argumentStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Focus createFocus()
  {
    FocusImpl focus = new FocusImpl();
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsStoresPackage getAnnotationsStoresPackage()
  {
    return (AnnotationsStoresPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnnotationsStoresPackage getPackage()
  {
    return AnnotationsStoresPackage.eINSTANCE;
  }

} //AnnotationsStoresFactoryImpl

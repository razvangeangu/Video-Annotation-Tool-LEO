package kcl.ac.uk.xtext.interpreter;

import kcl.ac.uk.xtext.annotationsStores.AnnotationStores;
import kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresFactory;
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore;
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore;
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore;
import kcl.ac.uk.xtext.annotationsStores.ProposalStore;
import kcl.ac.uk.xtext.annotationsStores.QuestionStore;
import kcl.ac.uk.xtext.interpreter.ASParser;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Focus;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Move;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Scope;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class Interpreter {
  /**
   * Takes an annotated video and produces a set of stores
   * representing the state of the dialogue participants and
   * the argument framework constructed by the end of the dialogue.
   * 
   * Stores etc. are represented as an instance of a separate meta-model defined in a separate Xtext project.
   */
  public void interpret(final AnnotatedVideo video) {
    AnnotationStores annotationStores = AnnotationsStoresFactory.eINSTANCE.createAnnotationStores();
    ASParser parser = new ASParser();
    EList<Annotation> _annotations = video.getAnnotations();
    for (final Annotation a : _annotations) {
      {
        Move _type = a.getType();
        String _type_1 = _type.getType();
        boolean _equals = _type_1.equals("propose");
        if (_equals) {
          EList<ProposalStore> _proposalElements = annotationStores.getProposalElements();
          EList<ProposalStore> _proposalElements_1 = annotationStores.getProposalElements();
          int _size = _proposalElements_1.size();
          String _plus = ("proposalElement(p" + Integer.valueOf(_size));
          String _plus_1 = (_plus + ",");
          Scope _scope = a.getScope();
          String _scope_1 = _scope.getScope();
          String _plus_2 = (_plus_1 + _scope_1);
          String _plus_3 = (_plus_2 + ",");
          Focus _focus = a.getFocus();
          String _focus_1 = _focus.getFocus();
          String _plus_4 = (_plus_3 + _focus_1);
          String _plus_5 = (_plus_4 + ",\"");
          String _contentLabel = a.getContentLabel();
          String _plus_6 = (_plus_5 + _contentLabel);
          String _plus_7 = (_plus_6 + "\")");
          AnnotationStores _parse = parser.parse(_plus_7);
          EList<ProposalStore> _proposalElements_2 = _parse.getProposalElements();
          ProposalStore _get = _proposalElements_2.get(0);
          _proposalElements.add(((ProposalStore) _get));
        }
        Move _type_2 = a.getType();
        String _type_3 = _type_2.getType();
        boolean _equals_1 = _type_3.equals("question");
        if (_equals_1) {
          EList<QuestionStore> _questionElements = annotationStores.getQuestionElements();
          EList<QuestionStore> _questionElements_1 = annotationStores.getQuestionElements();
          int _size_1 = _questionElements_1.size();
          String _plus_8 = ("questionElement(q" + Integer.valueOf(_size_1));
          String _plus_9 = (_plus_8 + ",");
          String _sender = a.getSender();
          String _plus_10 = (_plus_9 + _sender);
          String _plus_11 = (_plus_10 + ",");
          Scope _scope_2 = a.getScope();
          String _scope_3 = _scope_2.getScope();
          String _plus_12 = (_plus_11 + _scope_3);
          String _plus_13 = (_plus_12 + ",");
          Focus _focus_2 = a.getFocus();
          String _focus_3 = _focus_2.getFocus();
          String _plus_14 = (_plus_13 + _focus_3);
          String _plus_15 = (_plus_14 + ",\"");
          String _contentLabel_1 = a.getContentLabel();
          String _plus_16 = (_plus_15 + _contentLabel_1);
          String _plus_17 = (_plus_16 + "\"");
          String _plus_18 = (_plus_17 + ")");
          AnnotationStores _parse_1 = parser.parse(_plus_18);
          EList<QuestionStore> _questionElements_2 = _parse_1.getQuestionElements();
          QuestionStore _get_1 = _questionElements_2.get(0);
          _questionElements.add(((QuestionStore) _get_1));
        }
        Move _type_4 = a.getType();
        String _type_5 = _type_4.getType();
        boolean _equals_2 = _type_5.equals("challenge");
        if (_equals_2) {
          EList<ChallengeStore> _challengeElements = annotationStores.getChallengeElements();
          EList<ChallengeStore> _challengeElements_1 = annotationStores.getChallengeElements();
          int _size_2 = _challengeElements_1.size();
          String _plus_19 = ("challengeElement(ch" + Integer.valueOf(_size_2));
          String _plus_20 = (_plus_19 + ",");
          String _sender_1 = a.getSender();
          String _plus_21 = (_plus_20 + _sender_1);
          String _plus_22 = (_plus_21 + ",");
          Annotation _target = a.getTarget();
          String _name = _target.getName();
          String _plus_23 = (_plus_22 + _name);
          String _plus_24 = (_plus_23 + ")");
          AnnotationStores _parse_2 = parser.parse(_plus_24);
          EList<ChallengeStore> _challengeElements_2 = _parse_2.getChallengeElements();
          ChallengeStore _get_2 = _challengeElements_2.get(0);
          _challengeElements.add(((ChallengeStore) _get_2));
        }
        Move _type_6 = a.getType();
        String _type_7 = _type_6.getType();
        boolean _equals_3 = _type_7.equals("accept");
        if (_equals_3) {
          EList<CommitmentStore> _commitmentElements = annotationStores.getCommitmentElements();
          EList<CommitmentStore> _commitmentElements_1 = annotationStores.getCommitmentElements();
          int _size_3 = _commitmentElements_1.size();
          String _plus_25 = ("commitmentElement(co" + Integer.valueOf(_size_3));
          String _plus_26 = (_plus_25 + ",");
          Scope _scope_4 = a.getScope();
          String _scope_5 = _scope_4.getScope();
          String _plus_27 = (_plus_26 + _scope_5);
          String _plus_28 = (_plus_27 + ",");
          Focus _focus_4 = a.getFocus();
          String _focus_5 = _focus_4.getFocus();
          String _plus_29 = (_plus_28 + _focus_5);
          String _plus_30 = (_plus_29 + ",\"");
          String _contentLabel_2 = a.getContentLabel();
          String _plus_31 = (_plus_30 + _contentLabel_2);
          String _plus_32 = (_plus_31 + "\"");
          String _plus_33 = (_plus_32 + ")");
          AnnotationStores _parse_3 = parser.parse(_plus_33);
          EList<CommitmentStore> _commitmentElements_2 = _parse_3.getCommitmentElements();
          CommitmentStore _get_3 = _commitmentElements_2.get(0);
          _commitmentElements.add(((CommitmentStore) _get_3));
        }
        Move _type_8 = a.getType();
        String _type_9 = _type_8.getType();
        boolean _equals_4 = _type_9.equals("justify");
        if (_equals_4) {
          EList<ArgumentStore> _argumentElements = annotationStores.getArgumentElements();
          EList<ArgumentStore> _argumentElements_1 = annotationStores.getArgumentElements();
          int _size_4 = _argumentElements_1.size();
          String _plus_34 = ("argumentElement(a" + Integer.valueOf(_size_4));
          String _plus_35 = (_plus_34 + ",");
          Scope _scope_6 = a.getScope();
          String _scope_7 = _scope_6.getScope();
          String _plus_36 = (_plus_35 + _scope_7);
          String _plus_37 = (_plus_36 + ",");
          Focus _focus_6 = a.getFocus();
          String _focus_7 = _focus_6.getFocus();
          String _plus_38 = (_plus_37 + _focus_7);
          String _plus_39 = (_plus_38 + ",\"");
          String _contentLabel_3 = a.getContentLabel();
          String _plus_40 = (_plus_39 + _contentLabel_3);
          String _plus_41 = (_plus_40 + "\"");
          String _plus_42 = (_plus_41 + ")");
          AnnotationStores _parse_4 = parser.parse(_plus_42);
          EList<ArgumentStore> _argumentElements_2 = _parse_4.getArgumentElements();
          ArgumentStore _get_4 = _argumentElements_2.get(0);
          _argumentElements.add(((ArgumentStore) _get_4));
        }
        Move _type_10 = a.getType();
        String _type_11 = _type_10.getType();
        boolean _equals_5 = _type_11.equals("counter");
        if (_equals_5) {
          EList<ArgumentStore> _argumentElements_3 = annotationStores.getArgumentElements();
          EList<ArgumentStore> _argumentElements_4 = annotationStores.getArgumentElements();
          int _size_5 = _argumentElements_4.size();
          String _plus_43 = ("argumentElement(a" + Integer.valueOf(_size_5));
          String _plus_44 = (_plus_43 + ",");
          Scope _scope_8 = a.getScope();
          String _scope_9 = _scope_8.getScope();
          String _plus_45 = (_plus_44 + _scope_9);
          String _plus_46 = (_plus_45 + ",");
          Focus _focus_8 = a.getFocus();
          String _focus_9 = _focus_8.getFocus();
          String _plus_47 = (_plus_46 + _focus_9);
          String _plus_48 = (_plus_47 + ",\"");
          String _contentLabel_4 = a.getContentLabel();
          String _plus_49 = (_plus_48 + _contentLabel_4);
          String _plus_50 = (_plus_49 + "\"");
          String _plus_51 = (_plus_50 + ")");
          AnnotationStores _parse_5 = parser.parse(_plus_51);
          EList<ArgumentStore> _argumentElements_5 = _parse_5.getArgumentElements();
          ArgumentStore _get_5 = _argumentElements_5.get(0);
          _argumentElements_3.add(((ArgumentStore) _get_5));
        }
        Move _type_12 = a.getType();
        String _type_13 = _type_12.getType();
        boolean _equals_6 = _type_13.equals("withdraw");
        if (_equals_6) {
        }
      }
    }
  }
}

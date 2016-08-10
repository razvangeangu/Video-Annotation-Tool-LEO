package kcl.ac.uk.xtext.interpreter;

import java.util.ArrayList;
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
import kcl.ac.uk.xtext.videoAnnotationsDSL.Time;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Interpreter {
  /**
   * Takes an annotated video and produces a set of stores
   * representing the state of the dialogue participants and
   * the argument framework constructed by the end of the dialogue.
   * 
   * Stores etc. are represented as an instance of a separate meta-model defined in a separate Xtext project.
   */
  public AnnotationStores interpret(final AnnotatedVideo video, final Annotation lastAnnotation) {
    AnnotationStores annotationStores = AnnotationsStoresFactory.eINSTANCE.createAnnotationStores();
    ASParser parser = new ASParser();
    EList<Annotation> _annotations = video.getAnnotations();
    ArrayList<Annotation> filteredAnnotations = this.filterUntil(_annotations, lastAnnotation);
    for (final Annotation a : filteredAnnotations) {
      {
        Move _type = a.getType();
        String _type_1 = _type.getType();
        boolean _equals = _type_1.equals("propose");
        if (_equals) {
          EList<ProposalStore> _proposalElements = annotationStores.getProposalElements();
          String _name = a.getName();
          String _plus = ("proposalElement(" + _name);
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
          EList<ProposalStore> _proposalElements_1 = _parse.getProposalElements();
          ProposalStore _get = _proposalElements_1.get(0);
          _proposalElements.add(((ProposalStore) _get));
          EList<QuestionStore> _questionElements = annotationStores.getQuestionElements();
          for (final QuestionStore q : _questionElements) {
            String _name_1 = q.getName();
            Annotation _target = a.getTarget();
            String _name_2 = _target.getName();
            boolean _equals_1 = _name_1.equals(_name_2);
            if (_equals_1) {
              EList<QuestionStore> _questionElements_1 = annotationStores.getQuestionElements();
              _questionElements_1.remove(q);
            }
          }
        }
        Move _type_2 = a.getType();
        String _type_3 = _type_2.getType();
        boolean _equals_2 = _type_3.equals("question");
        if (_equals_2) {
          EList<QuestionStore> _questionElements_2 = annotationStores.getQuestionElements();
          String _name_3 = a.getName();
          String _plus_8 = ("questionElement(" + _name_3);
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
          EList<QuestionStore> _questionElements_3 = _parse_1.getQuestionElements();
          QuestionStore _get_1 = _questionElements_3.get(0);
          _questionElements_2.add(((QuestionStore) _get_1));
        }
        Move _type_4 = a.getType();
        String _type_5 = _type_4.getType();
        boolean _equals_3 = _type_5.equals("challenge");
        if (_equals_3) {
          EList<ChallengeStore> _challengeElements = annotationStores.getChallengeElements();
          String _name_4 = a.getName();
          String _plus_19 = ("challengeElement(" + _name_4);
          String _plus_20 = (_plus_19 + ",");
          String _sender_1 = a.getSender();
          String _plus_21 = (_plus_20 + _sender_1);
          String _plus_22 = (_plus_21 + ",");
          Annotation _target_1 = a.getTarget();
          String _name_5 = _target_1.getName();
          String _plus_23 = (_plus_22 + _name_5);
          String _plus_24 = (_plus_23 + ")");
          AnnotationStores _parse_2 = parser.parse(_plus_24);
          EList<ChallengeStore> _challengeElements_1 = _parse_2.getChallengeElements();
          ChallengeStore _get_2 = _challengeElements_1.get(0);
          _challengeElements.add(((ChallengeStore) _get_2));
        }
        Move _type_6 = a.getType();
        String _type_7 = _type_6.getType();
        boolean _equals_4 = _type_7.equals("accept");
        if (_equals_4) {
          Annotation _target_2 = a.getTarget();
          Move _type_8 = _target_2.getType();
          String _type_9 = _type_8.getType();
          boolean _equals_5 = _type_9.equals("commit");
          if (_equals_5) {
            EList<CommitmentStore> _commitmentElements = annotationStores.getCommitmentElements();
            String _name_6 = a.getName();
            String _plus_25 = ("commitmentElement(" + _name_6);
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
            EList<CommitmentStore> _commitmentElements_1 = _parse_3.getCommitmentElements();
            CommitmentStore _get_3 = _commitmentElements_1.get(0);
            _commitmentElements.add(((CommitmentStore) _get_3));
          }
          Annotation _target_3 = a.getTarget();
          Move _type_10 = _target_3.getType();
          String _type_11 = _type_10.getType();
          boolean _equals_6 = _type_11.equals("reject");
          if (_equals_6) {
            EList<ProposalStore> _proposalElements_2 = annotationStores.getProposalElements();
            for (final ProposalStore p : _proposalElements_2) {
              String _name_7 = p.getName();
              Annotation _target_4 = a.getTarget();
              String _name_8 = _target_4.getName();
              boolean _equals_7 = _name_7.equals(_name_8);
              if (_equals_7) {
                EList<ProposalStore> _proposalElements_3 = annotationStores.getProposalElements();
                _proposalElements_3.remove(p);
              }
            }
          }
          Annotation _target_5 = a.getTarget();
          Move _type_12 = _target_5.getType();
          String _type_13 = _type_12.getType();
          boolean _equals_8 = _type_13.equals("uncommit");
          if (_equals_8) {
            EList<CommitmentStore> _commitmentElements_2 = annotationStores.getCommitmentElements();
            for (final CommitmentStore c : _commitmentElements_2) {
              String _name_9 = c.getName();
              Annotation _target_6 = a.getTarget();
              String _name_10 = _target_6.getName();
              boolean _equals_9 = _name_9.equals(_name_10);
              if (_equals_9) {
                EList<CommitmentStore> _commitmentElements_3 = annotationStores.getCommitmentElements();
                _commitmentElements_3.remove(c);
              }
            }
          }
        }
        Move _type_14 = a.getType();
        String _type_15 = _type_14.getType();
        boolean _equals_10 = _type_15.equals("justify");
        if (_equals_10) {
          EList<ArgumentStore> _argumentElements = annotationStores.getArgumentElements();
          String _name_11 = a.getName();
          String _plus_34 = ("argumentElement(" + _name_11);
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
          EList<ArgumentStore> _argumentElements_1 = _parse_4.getArgumentElements();
          ArgumentStore _get_4 = _argumentElements_1.get(0);
          _argumentElements.add(((ArgumentStore) _get_4));
        }
        Move _type_16 = a.getType();
        String _type_17 = _type_16.getType();
        boolean _equals_11 = _type_17.equals("counter");
        if (_equals_11) {
          EList<ArgumentStore> _argumentElements_2 = annotationStores.getArgumentElements();
          String _name_12 = a.getName();
          String _plus_43 = ("argumentElement(" + _name_12);
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
          EList<ArgumentStore> _argumentElements_3 = _parse_5.getArgumentElements();
          ArgumentStore _get_5 = _argumentElements_3.get(0);
          _argumentElements_2.add(((ArgumentStore) _get_5));
        }
        Move _type_18 = a.getType();
        String _type_19 = _type_18.getType();
        boolean _equals_12 = _type_19.equals("withdraw");
        if (_equals_12) {
          EList<QuestionStore> _questionElements_4 = annotationStores.getQuestionElements();
          for (final QuestionStore q_1 : _questionElements_4) {
            String _name_13 = q_1.getName();
            Annotation _target_7 = a.getTarget();
            String _name_14 = _target_7.getName();
            boolean _equals_13 = _name_13.equals(_name_14);
            if (_equals_13) {
              EList<QuestionStore> _questionElements_5 = annotationStores.getQuestionElements();
              _questionElements_5.remove(q_1);
            }
          }
          EList<ChallengeStore> _challengeElements_2 = annotationStores.getChallengeElements();
          for (final ChallengeStore ch : _challengeElements_2) {
            String _name_15 = ch.getName();
            Annotation _target_8 = a.getTarget();
            String _name_16 = _target_8.getName();
            boolean _equals_14 = _name_15.equals(_name_16);
            if (_equals_14) {
              EList<QuestionStore> _questionElements_6 = annotationStores.getQuestionElements();
              _questionElements_6.remove(ch);
            }
          }
        }
      }
    }
    return annotationStores;
  }
  
  public ArrayList<Annotation> filterUntil(final EList<Annotation> annotations, final Annotation lastAnnotation) {
    ArrayList<Annotation> filteredAnnotations = CollectionLiterals.<Annotation>newArrayList();
    for (final Annotation a : annotations) {
      Time _toTime = a.getToTime();
      int _sec = _toTime.getSec();
      Time _toTime_1 = lastAnnotation.getToTime();
      int _sec_1 = _toTime_1.getSec();
      boolean _lessEqualsThan = (_sec <= _sec_1);
      if (_lessEqualsThan) {
        filteredAnnotations.add(a);
      }
    }
    return filteredAnnotations;
  }
}

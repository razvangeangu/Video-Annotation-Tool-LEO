package kcl.ac.uk.xtext.generator;

import kcl.ac.uk.xtext.annotationsStores.AnnotationStores;
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore;
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore;
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore;
import kcl.ac.uk.xtext.annotationsStores.Focus;
import kcl.ac.uk.xtext.annotationsStores.ProposalStore;
import kcl.ac.uk.xtext.annotationsStores.QuestionStore;
import kcl.ac.uk.xtext.annotationsStores.Scope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StoresRenderer {
  public String render(final AnnotationStores store, final String typeOf) {
    String _switchResult = null;
    switch (typeOf) {
      case "proposalStore":
        EList<ProposalStore> _proposalElements = store.getProposalElements();
        final Function1<ProposalStore, CharSequence> _function = (ProposalStore element) -> {
          return this.renderProposalElement(element);
        };
        _switchResult = IterableExtensions.<ProposalStore>join(_proposalElements, "\n", _function);
        break;
      case "questionStore":
        EList<QuestionStore> _questionElements = store.getQuestionElements();
        final Function1<QuestionStore, CharSequence> _function_1 = (QuestionStore element) -> {
          return this.renderQuestionElement(element);
        };
        _switchResult = IterableExtensions.<QuestionStore>join(_questionElements, "\n", _function_1);
        break;
      case "challengeStore":
        EList<ChallengeStore> _challengeElements = store.getChallengeElements();
        final Function1<ChallengeStore, CharSequence> _function_2 = (ChallengeStore element) -> {
          return this.renderChallengeElement(element);
        };
        _switchResult = IterableExtensions.<ChallengeStore>join(_challengeElements, "\n", _function_2);
        break;
      case "commitmentStore":
        EList<CommitmentStore> _commitmentElements = store.getCommitmentElements();
        final Function1<CommitmentStore, CharSequence> _function_3 = (CommitmentStore element) -> {
          return this.renderCommitmentElement(element);
        };
        _switchResult = IterableExtensions.<CommitmentStore>join(_commitmentElements, "\n", _function_3);
        break;
      case "argumentStore":
        EList<ArgumentStore> _argumentElements = store.getArgumentElements();
        final Function1<ArgumentStore, CharSequence> _function_4 = (ArgumentStore element) -> {
          return this.renderArgumentElement(element);
        };
        _switchResult = IterableExtensions.<ArgumentStore>join(_argumentElements, "\n", _function_4);
        break;
    }
    return _switchResult;
  }
  
  public CharSequence renderProposalElement(final ProposalStore element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("proposalElement (");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    Scope _scope = element.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = element.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    _builder.append(", ");
    String _content = element.getContent();
    _builder.append(_content, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderQuestionElement(final QuestionStore element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("questionElement (");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    String _sender = element.getSender();
    _builder.append(_sender, "");
    _builder.append(", ");
    Scope _scope = element.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = element.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    _builder.append(", ");
    String _content = element.getContent();
    _builder.append(_content, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderChallengeElement(final ChallengeStore element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("challengeElement (");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    String _sender = element.getSender();
    _builder.append(_sender, "");
    _builder.append(", ");
    ProposalStore _target = element.getTarget();
    String _name_1 = _target.getName();
    _builder.append(_name_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderCommitmentElement(final CommitmentStore element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("commitmentElement (");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    Scope _scope = element.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = element.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    _builder.append(", ");
    String _content = element.getContent();
    _builder.append(_content, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderArgumentElement(final ArgumentStore element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("argumentElement (");
    String _name = element.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    Scope _scope = element.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = element.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    _builder.append(", ");
    String _content = element.getContent();
    _builder.append(_content, "");
    _builder.append(", ");
    ArgumentStore _target = element.getTarget();
    String _name_1 = _target.getName();
    _builder.append(_name_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

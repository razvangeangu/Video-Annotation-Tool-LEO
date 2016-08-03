package kcl.ac.uk.xtext.generator;

import com.google.common.base.Objects;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Focus;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Move;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Scope;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Time;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Pretty-print a given Annotation/AnnotatedVideo so that it can be shown in editors etc.
 * 
 * Needs to be kept in sync with the grammar
 */
@SuppressWarnings("all")
public class AnnotationRenderer {
  public String render(final AnnotatedVideo video) {
    EList<Annotation> _annotations = video.getAnnotations();
    final Function1<Annotation, CharSequence> _function = (Annotation ann) -> {
      return this.render(ann);
    };
    return IterableExtensions.<Annotation>join(_annotations, "\n", _function);
  }
  
  public CharSequence render(final Annotation annotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from ");
    Time _fromTime = annotation.getFromTime();
    int _sec = _fromTime.getSec();
    _builder.append(_sec, "");
    _builder.append(" to ");
    Time _toTime = annotation.getToTime();
    int _sec_1 = _toTime.getSec();
    _builder.append(_sec_1, "");
    _builder.append(" ");
    CharSequence _renderWithoutTimes = this.renderWithoutTimes(annotation);
    _builder.append(_renderWithoutTimes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderWithoutTimes(final Annotation annotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("annotate (");
    String _name = annotation.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    String _sender = annotation.getSender();
    _builder.append(_sender, "");
    _builder.append(", ");
    Move _type = annotation.getType();
    String _type_1 = _type.getType();
    _builder.append(_type_1, "");
    _builder.append(", ");
    Scope _scope = annotation.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = annotation.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    CharSequence _xifexpression = null;
    String _contentLabel = annotation.getContentLabel();
    boolean _notEquals = (!Objects.equal(_contentLabel, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(", \"");
      String _contentLabel_1 = annotation.getContentLabel();
      _builder_1.append(_contentLabel_1, "");
      _builder_1.append("\"");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    _builder.append(", \"");
    String _content = annotation.getContent();
    _builder.append(_content, "");
    _builder.append("\"");
    CharSequence _xifexpression_1 = null;
    Annotation _target = annotation.getTarget();
    boolean _notEquals_1 = (!Objects.equal(_target, null));
    if (_notEquals_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(", ");
      Annotation _target_1 = annotation.getTarget();
      String _name_1 = _target_1.getName();
      _builder_2.append(_name_1, "");
      _xifexpression_1 = _builder_2;
    }
    _builder.append(_xifexpression_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence renderWithoutTimeAndWithoutKeyword(final Annotation annotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = annotation.getName();
    _builder.append(_name, "");
    _builder.append(", ");
    String _sender = annotation.getSender();
    _builder.append(_sender, "");
    _builder.append(", ");
    Move _type = annotation.getType();
    String _type_1 = _type.getType();
    _builder.append(_type_1, "");
    _builder.append(", ");
    Scope _scope = annotation.getScope();
    String _scope_1 = _scope.getScope();
    _builder.append(_scope_1, "");
    _builder.append(", ");
    Focus _focus = annotation.getFocus();
    String _focus_1 = _focus.getFocus();
    _builder.append(_focus_1, "");
    CharSequence _xifexpression = null;
    String _contentLabel = annotation.getContentLabel();
    boolean _notEquals = (!Objects.equal(_contentLabel, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(", \"");
      String _contentLabel_1 = annotation.getContentLabel();
      _builder_1.append(_contentLabel_1, "");
      _builder_1.append("\"");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    _builder.append(", \"");
    String _content = annotation.getContent();
    _builder.append(_content, "");
    _builder.append("\"");
    CharSequence _xifexpression_1 = null;
    Annotation _target = annotation.getTarget();
    boolean _notEquals_1 = (!Objects.equal(_target, null));
    if (_notEquals_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(", ");
      Annotation _target_1 = annotation.getTarget();
      String _name_1 = _target_1.getName();
      _builder_2.append(_name_1, "");
      _xifexpression_1 = _builder_2;
    }
    _builder.append(_xifexpression_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

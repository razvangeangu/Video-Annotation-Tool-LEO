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
    _builder.append(_fromTime, "");
    _builder.append(" to ");
    Time _toTime = annotation.getToTime();
    _builder.append(_toTime, "");
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
    _builder.append(_type, "");
    _builder.append(", ");
    Scope _scope = annotation.getScope();
    _builder.append(_scope, "");
    _builder.append(", ");
    Focus _focus = annotation.getFocus();
    _builder.append(_focus, "");
    _builder.append(", \"");
    String _content = annotation.getContent();
    _builder.append(_content, "");
    _builder.append("\"");
    CharSequence _xifexpression = null;
    Annotation _target = annotation.getTarget();
    boolean _notEquals = (!Objects.equal(_target, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(", ");
      Annotation _target_1 = annotation.getTarget();
      String _name_1 = _target_1.getName();
      _builder_1.append(_name_1, "");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

package kcl.ac.uk.xtext.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.function.Consumer;
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Focus;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Move;
import kcl.ac.uk.xtext.videoAnnotationsDSL.Scope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class AnnotationCompletion {
  public ArrayList<String> getIDs(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      String _name = ann.getName();
      list.add(_name);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getSenders(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      String _sender = ann.getSender();
      list.add(_sender);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getMoves(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      Move _type = ann.getType();
      String _type_1 = _type.getType();
      list.add(_type_1);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getScopes(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      Scope _scope = ann.getScope();
      String _scope_1 = _scope.getScope();
      list.add(_scope_1);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getFocus(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      Focus _focus = ann.getFocus();
      String _focus_1 = _focus.getFocus();
      list.add(_focus_1);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getContent(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      String _content = ann.getContent();
      list.add(_content);
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getContentLabel(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      String _contentLabel = ann.getContentLabel();
      boolean _notEquals = (!Objects.equal(_contentLabel, null));
      if (_notEquals) {
        String _contentLabel_1 = ann.getContentLabel();
        String _plus = ("\"" + _contentLabel_1);
        String _plus_1 = (_plus + "\"");
        list.add(_plus_1);
      }
    };
    _annotations.forEach(_function);
    return list;
  }
  
  public ArrayList<String> getTarget(final AnnotatedVideo video) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<Annotation> _annotations = video.getAnnotations();
    final Consumer<Annotation> _function = (Annotation ann) -> {
      Annotation _target = ann.getTarget();
      boolean _notEquals = (!Objects.equal(_target, null));
      if (_notEquals) {
        Annotation _target_1 = ann.getTarget();
        String _name = _target_1.getName();
        list.add(_name);
      }
    };
    _annotations.forEach(_function);
    return list;
  }
}

package kcl.ac.uk.xtext.generator

import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation

/**
 * Pretty-print a given Annotation/AnnotatedVideo so that it can be shown in editors etc.
 * 
 * Needs to be kept in sync with the grammar
 */
class AnnotationRenderer {
	def render(AnnotatedVideo video) {
		video.annotations.join('\n', [ann | ann.render])
	}
	
	def render(Annotation annotation) '''
		from «annotation.fromTime.sec» to «annotation.toTime.sec» «annotation.renderWithoutTimes»
	'''
	
	def renderWithoutTimes (Annotation annotation) '''
		annotate («annotation.name», «annotation.sender», «annotation.type.type», «annotation.scope.scope», «annotation.focus.focus»«if (annotation.contentLabel != null) {''', "«annotation.contentLabel»"'''}», "«annotation.content»"«if (annotation.target != null) {''', «annotation.target.name»'''}»)«if (annotation.comment != null) {''' #"«annotation.comment»"#'''}»
	'''
	
	def renderWithoutTimeAndWithoutKeyword(Annotation annotation) '''
		«annotation.name», «annotation.sender», «annotation.type.type», «annotation.scope.scope», «annotation.focus.focus»«if (annotation.contentLabel != null) {''', "«annotation.contentLabel»"'''}», "«annotation.content»"«if (annotation.target != null) {''', «annotation.target.name»'''}»
	'''
	
	def renderWithoutComment (Annotation annotation) '''from «annotation.fromTime.sec» to «annotation.toTime.sec» annotate («annotation.name», «annotation.sender», «annotation.type.type», «annotation.scope.scope», «annotation.focus.focus»«if (annotation.contentLabel != null) {''', "«annotation.contentLabel»"'''}», "«annotation.content»"«if (annotation.target != null) {''', «annotation.target.name»'''}»)'''
}
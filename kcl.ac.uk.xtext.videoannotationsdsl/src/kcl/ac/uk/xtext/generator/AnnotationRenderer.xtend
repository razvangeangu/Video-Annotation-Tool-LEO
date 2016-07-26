package kcl.ac.uk.xtext.generator

import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLFactory

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
	  from «annotation.fromTime» to «annotation.toTime» «annotation.renderWithoutTimes»
	'''
	
	def renderWithoutTimes (Annotation annotation) '''
		annotate («annotation.name», «annotation.sender», «annotation.type», «annotation.scope», «annotation.focus», "«annotation.content»"«if (annotation.target != null) {''', «annotation.target.name»'''}»)
	'''
}
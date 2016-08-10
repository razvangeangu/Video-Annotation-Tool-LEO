package kcl.ac.uk.xtext.interpreter

import kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresFactory
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore
import kcl.ac.uk.xtext.annotationsStores.ProposalStore
import kcl.ac.uk.xtext.annotationsStores.QuestionStore
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo
import kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation
import org.eclipse.emf.common.util.EList

class Interpreter {
	/**
	 * Takes an annotated video and produces a set of stores 
	 * representing the state of the dialogue participants and 
	 * the argument framework constructed by the end of the dialogue.
	 * 
	 * Stores etc. are represented as an instance of a separate meta-model defined in a separate Xtext project. 
	 */
	def interpret(AnnotatedVideo video, Annotation lastAnnotation) {
		
		var annotationStores = AnnotationsStoresFactory.eINSTANCE.createAnnotationStores
		var parser = new ASParser
		var filteredAnnotations = filterUntil(video.annotations, lastAnnotation)
		
		for (a : filteredAnnotations) {
			if (a.type.type.equals("propose")) {
				annotationStores.proposalElements.add(parser.parse("proposalElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\""+ a.contentLabel +"\")").proposalElements.get(0) as ProposalStore)
			}
			
			if (a.type.type.equals("question")) {
				annotationStores.questionElements.add(parser.parse("questionElement(" + a.name + "," + a.sender + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").questionElements.get(0) as QuestionStore)
			}
			
			if (a.type.type.equals("challenge")) {
				annotationStores.challengeElements.add(parser.parse("challengeElement(" + a.name + "," + a.sender + "," + a.target.name + ")").challengeElements.get(0) as ChallengeStore)
			}
			
			if (a.type.type.equals("accept")) {
				annotationStores.commitmentElements.add(parser.parse("commitmentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").commitmentElements.get(0) as CommitmentStore)
			}
			
			if (a.type.type.equals("justify")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("counter")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("withdraw")) {
				
			}
		}
		
		return annotationStores
	}
	
	def filterUntil(EList<Annotation> annotations, Annotation lastAnnotation) {
		var filteredAnnotations = newArrayList
		
		for (a : annotations) {
			if (a.toTime.sec <= lastAnnotation.toTime.sec) {
				filteredAnnotations.add(a)
			}
		}
		
		return filteredAnnotations
	}
}
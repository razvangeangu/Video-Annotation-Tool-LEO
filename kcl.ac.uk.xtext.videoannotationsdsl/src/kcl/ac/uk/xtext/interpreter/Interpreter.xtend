package kcl.ac.uk.xtext.interpreter

import kcl.ac.uk.xtext.annotationsStores.AnnotationsStoresFactory
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore
import kcl.ac.uk.xtext.annotationsStores.ProposalStore
import kcl.ac.uk.xtext.annotationsStores.QuestionStore
import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo

class Interpreter {
	/**
	 * Takes an annotated video and produces a set of stores 
	 * representing the state of the dialogue participants and 
	 * the argument framework constructed by the end of the dialogue.
	 * 
	 * Stores etc. are represented as an instance of a separate meta-model defined in a separate Xtext project. 
	 */
	def interpret(AnnotatedVideo video) {
		
		var annotationStores = AnnotationsStoresFactory.eINSTANCE.createAnnotationStores
		var parser = new ASParser
		
		for (a : video.annotations) {
			if (a.type.type.equals("propose")) {
				annotationStores.proposalElements.add(parser.parse("proposalElement(p" + annotationStores.proposalElements.size + "," + a.scope.scope + "," + a.focus.focus + ",\""+ a.content +"\")").proposalElements.get(0) as ProposalStore)
			}
			
			if (a.type.type.equals("question")) {
				annotationStores.questionElements.add(parser.parse("questionElement(q"+ annotationStores.questionElements.size + "," + a.sender + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.content + "\"" + ")").questionElements.get(0) as QuestionStore)
			}
			
			if (a.type.type.equals("challenge")) {
				annotationStores.challengeElements.add(parser.parse("challengeElement(ch" + annotationStores.challengeElements.size + "," + a.sender + "," + a.target.name + ")").challengeElements.get(0) as ChallengeStore)
			}
			
			if (a.type.type.equals("accept")) {
				annotationStores.commitmentElements.add(parser.parse("commitmentElement(co" + annotationStores.commitmentElements.size + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.content + "\"" + ")").commitmentElements.get(0) as CommitmentStore)
			}
			
			if (a.type.type.equals("justify")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(a" + annotationStores.argumentElements.size + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.content + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("counter")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(a" + annotationStores.argumentElements.size + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.content + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("withdraw")) {
				
			}
		}
	}
}
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
				
				var questionIterator = annotationStores.questionElements.iterator;
				while (questionIterator.hasNext) {
				    var q = questionIterator.next;
					
					if (a.target != null) {
						if (q.name.equals(a.target.name)) {
							//questionIterator.remove;
							q.effect = AnnotationsStoresFactory.eINSTANCE.createEffect
							q.effect.affectedBy = a.target.name	
						}
					}
				}
			}
			
			if (a.type.type.equals("question")) {
				annotationStores.questionElements.add(parser.parse("questionElement(" + a.name + "," + a.sender + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").questionElements.get(0) as QuestionStore)
			}
			
			if (a.type.type.equals("challenge")) {
				annotationStores.challengeElements.add(parser.parse("challengeElement(" + a.name + "," + a.sender + "," + a.target.name + ")").challengeElements.get(0) as ChallengeStore)
			}
			
			if (a.type.type.equals("accept")) {
				if (a.target.type.type.equals("commit")) {
					annotationStores.commitmentElements.add(parser.parse("commitmentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").commitmentElements.get(0) as CommitmentStore)
				}
				
				if (a.target.type.type.equals("reject")) {
					var proposalIterator = annotationStores.proposalElements.iterator;

					while (proposalIterator.hasNext) {
					    var p = proposalIterator.next;
					
					    if (a.target != null && p.name.equals(a.target.name))
//					        proposalIterator.remove;
							p.effect = AnnotationsStoresFactory.eINSTANCE.createEffect
					        p.effect.affectedBy = a.target.name
					}
				}
				
				if (a.target.type.type.equals("uncommit")) {
					var commitmentIterator = annotationStores.commitmentElements.iterator;

					while (commitmentIterator.hasNext) {
					    var c = commitmentIterator.next;
					
					    if (a.target != null && c.name.equals(a.target.name))
//					        commitmentIterator.remove;
							c.effect = AnnotationsStoresFactory.eINSTANCE.createEffect
					        c.effect.affectedBy = a.target.name
					}
				}
			}
			
			if (a.type.type.equals("justify")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("counter")) {
				annotationStores.argumentElements.add(parser.parse("argumentElement(" + a.name + "," + a.scope.scope + "," + a.focus.focus + ",\"" + a.contentLabel + "\"" + ")").argumentElements.get(0) as ArgumentStore)
			}
			
			if (a.type.type.equals("withdraw")) {
				var commitmentIterator = annotationStores.commitmentElements.iterator;
				while (commitmentIterator.hasNext) {
				    var q = commitmentIterator.next;
				
				    if (a.target != null && q.name.equals(a.target.name))
//				        commitmentIterator.remove;
						q.effect = AnnotationsStoresFactory.eINSTANCE.createEffect
				        q.effect.affectedBy = a.target.name
				}
				
				var challengeIterator = annotationStores.challengeElements.iterator;
				while (challengeIterator.hasNext) {
				    var ch = challengeIterator.next;
				
				    if (a.target != null && ch.name.equals(a.target.name))
//				        challengeIterator.remove;
						ch.effect = AnnotationsStoresFactory.eINSTANCE.createEffect
				        ch.effect.affectedBy = a.target.name
				}
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
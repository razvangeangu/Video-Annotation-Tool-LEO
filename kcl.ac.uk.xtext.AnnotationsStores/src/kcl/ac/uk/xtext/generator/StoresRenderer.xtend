package kcl.ac.uk.xtext.generator

import kcl.ac.uk.xtext.annotationsStores.AnnotationStores
import kcl.ac.uk.xtext.annotationsStores.ArgumentStore
import kcl.ac.uk.xtext.annotationsStores.ChallengeStore
import kcl.ac.uk.xtext.annotationsStores.CommitmentStore
import kcl.ac.uk.xtext.annotationsStores.ProposalStore
import kcl.ac.uk.xtext.annotationsStores.QuestionStore

class StoresRenderer {

	def render(AnnotationStores store, String typeOf) {
		switch (typeOf) {
			case "proposalStore": {
				store.proposalElements.join('\n', [element | element.renderProposalElement])
			}
			case "questionStore": {
				store.questionElements.join('\n', [element | element.renderQuestionElement])
			}
			case "challengeStore": {
				store.challengeElements.join('\n', [element | element.renderChallengeElement])
			}
			case "commitmentStore": {
				store.commitmentElements.join('\n', [element | element.renderCommitmentElement])
			}
			case "argumentStore": {
				store.argumentElements.join('\n', [element | element.renderArgumentElement])
			}
		}
		
	}
	
	def renderProposalElement(ProposalStore element) '''
		proposalElement («element.name», «element.scope.scope», «element.focus.focus», «element.content»)
	'''
	
	def renderQuestionElement(QuestionStore element) '''
		questionElement («element.name», «element.sender», «element.scope.scope», «element.focus.focus», «element.content»)
	'''
	
	def renderChallengeElement(ChallengeStore element) '''
		challengeElement («element.name», «element.sender», «element.target.name»)
	'''
	
	def renderCommitmentElement(CommitmentStore element) '''
		commitmentElement («element.name», «element.scope.scope», «element.focus.focus», «element.content»)
	'''
	
	def renderArgumentElement(ArgumentStore element) '''
		argumentElement («element.name», «element.scope.scope», «element.focus.focus», «element.content», «element.target.name»)
	'''
}
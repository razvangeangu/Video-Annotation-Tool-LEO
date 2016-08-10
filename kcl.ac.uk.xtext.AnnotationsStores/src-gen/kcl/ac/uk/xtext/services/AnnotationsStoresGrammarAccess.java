/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AnnotationsStoresGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AnnotationStoresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.AnnotationStores");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProposalElementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProposalElementsProposalStoreParserRuleCall_0_0 = (RuleCall)cProposalElementsAssignment_0.eContents().get(0);
		private final Assignment cQuestionElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQuestionElementsQuestionStoreParserRuleCall_1_0 = (RuleCall)cQuestionElementsAssignment_1.eContents().get(0);
		private final Assignment cChallengeElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChallengeElementsChallengeStoreParserRuleCall_2_0 = (RuleCall)cChallengeElementsAssignment_2.eContents().get(0);
		private final Assignment cCommitmentElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCommitmentElementsCommitmentStoreParserRuleCall_3_0 = (RuleCall)cCommitmentElementsAssignment_3.eContents().get(0);
		private final Assignment cArgumentElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cArgumentElementsArgumentStoreParserRuleCall_4_0 = (RuleCall)cArgumentElementsAssignment_4.eContents().get(0);
		
		//AnnotationStores:
		//	proposalElements+=ProposalStore*
		//	questionElements+=QuestionStore*
		//	challengeElements+=ChallengeStore*
		//	commitmentElements+=CommitmentStore*
		//	argumentElements+=ArgumentStore*;
		@Override public ParserRule getRule() { return rule; }
		
		//proposalElements+=ProposalStore* questionElements+=QuestionStore* challengeElements+=ChallengeStore*
		//commitmentElements+=CommitmentStore* argumentElements+=ArgumentStore*
		public Group getGroup() { return cGroup; }
		
		//proposalElements+=ProposalStore*
		public Assignment getProposalElementsAssignment_0() { return cProposalElementsAssignment_0; }
		
		//ProposalStore
		public RuleCall getProposalElementsProposalStoreParserRuleCall_0_0() { return cProposalElementsProposalStoreParserRuleCall_0_0; }
		
		//questionElements+=QuestionStore*
		public Assignment getQuestionElementsAssignment_1() { return cQuestionElementsAssignment_1; }
		
		//QuestionStore
		public RuleCall getQuestionElementsQuestionStoreParserRuleCall_1_0() { return cQuestionElementsQuestionStoreParserRuleCall_1_0; }
		
		//challengeElements+=ChallengeStore*
		public Assignment getChallengeElementsAssignment_2() { return cChallengeElementsAssignment_2; }
		
		//ChallengeStore
		public RuleCall getChallengeElementsChallengeStoreParserRuleCall_2_0() { return cChallengeElementsChallengeStoreParserRuleCall_2_0; }
		
		//commitmentElements+=CommitmentStore*
		public Assignment getCommitmentElementsAssignment_3() { return cCommitmentElementsAssignment_3; }
		
		//CommitmentStore
		public RuleCall getCommitmentElementsCommitmentStoreParserRuleCall_3_0() { return cCommitmentElementsCommitmentStoreParserRuleCall_3_0; }
		
		//argumentElements+=ArgumentStore*
		public Assignment getArgumentElementsAssignment_4() { return cArgumentElementsAssignment_4; }
		
		//ArgumentStore
		public RuleCall getArgumentElementsArgumentStoreParserRuleCall_4_0() { return cArgumentElementsArgumentStoreParserRuleCall_4_0; }
	}
	public class ProposalStoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.ProposalStore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProposalElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cScopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cScopeScopeParserRuleCall_4_0 = (RuleCall)cScopeAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFocusAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFocusFocusParserRuleCall_6_0 = (RuleCall)cFocusAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cContentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cContentSTRINGTerminalRuleCall_8_0 = (RuleCall)cContentAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ProposalStore:
		//	'proposalElement' '('
		//	name=ID ','
		//	scope=Scope ','
		//	focus=Focus ','
		//	content=STRING
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'proposalElement' '(' name=ID ',' scope=Scope ',' focus=Focus ',' content=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'proposalElement'
		public Keyword getProposalElementKeyword_0() { return cProposalElementKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//scope=Scope
		public Assignment getScopeAssignment_4() { return cScopeAssignment_4; }
		
		//Scope
		public RuleCall getScopeScopeParserRuleCall_4_0() { return cScopeScopeParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//focus=Focus
		public Assignment getFocusAssignment_6() { return cFocusAssignment_6; }
		
		//Focus
		public RuleCall getFocusFocusParserRuleCall_6_0() { return cFocusFocusParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//content=STRING
		public Assignment getContentAssignment_8() { return cContentAssignment_8; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_8_0() { return cContentSTRINGTerminalRuleCall_8_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}
	public class QuestionStoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.QuestionStore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSenderAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSenderSenderParserRuleCall_4_0 = (RuleCall)cSenderAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cScopeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cScopeScopeParserRuleCall_6_0 = (RuleCall)cScopeAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFocusAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFocusFocusParserRuleCall_8_0 = (RuleCall)cFocusAssignment_8.eContents().get(0);
		private final Keyword cCommaKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cContentAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cContentSTRINGTerminalRuleCall_10_0 = (RuleCall)cContentAssignment_10.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//QuestionStore:
		//	'questionElement' '('
		//	name=ID ','
		//	sender=Sender ','
		//	scope=Scope ','
		//	focus=Focus ','
		//	content=STRING
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'questionElement' '(' name=ID ',' sender=Sender ',' scope=Scope ',' focus=Focus ',' content=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'questionElement'
		public Keyword getQuestionElementKeyword_0() { return cQuestionElementKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//sender=Sender
		public Assignment getSenderAssignment_4() { return cSenderAssignment_4; }
		
		//Sender
		public RuleCall getSenderSenderParserRuleCall_4_0() { return cSenderSenderParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//scope=Scope
		public Assignment getScopeAssignment_6() { return cScopeAssignment_6; }
		
		//Scope
		public RuleCall getScopeScopeParserRuleCall_6_0() { return cScopeScopeParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//focus=Focus
		public Assignment getFocusAssignment_8() { return cFocusAssignment_8; }
		
		//Focus
		public RuleCall getFocusFocusParserRuleCall_8_0() { return cFocusFocusParserRuleCall_8_0; }
		
		//','
		public Keyword getCommaKeyword_9() { return cCommaKeyword_9; }
		
		//content=STRING
		public Assignment getContentAssignment_10() { return cContentAssignment_10; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_10_0() { return cContentSTRINGTerminalRuleCall_10_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_11() { return cRightParenthesisKeyword_11; }
	}
	public class ChallengeStoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.ChallengeStore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChallengeElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSenderAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSenderSenderParserRuleCall_4_0 = (RuleCall)cSenderAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTargetAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTargetIDTerminalRuleCall_5_1_0 = (RuleCall)cTargetAssignment_5_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ChallengeStore:
		//	'challengeElement' '('
		//	name=ID ','
		//	sender=Sender (','
		//	target=ID)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'challengeElement' '(' name=ID ',' sender=Sender (',' target=ID)? ')'
		public Group getGroup() { return cGroup; }
		
		//'challengeElement'
		public Keyword getChallengeElementKeyword_0() { return cChallengeElementKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//sender=Sender
		public Assignment getSenderAssignment_4() { return cSenderAssignment_4; }
		
		//Sender
		public RuleCall getSenderSenderParserRuleCall_4_0() { return cSenderSenderParserRuleCall_4_0; }
		
		//(',' target=ID)?
		public Group getGroup_5() { return cGroup_5; }
		
		//','
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//target=ID
		public Assignment getTargetAssignment_5_1() { return cTargetAssignment_5_1; }
		
		//ID
		public RuleCall getTargetIDTerminalRuleCall_5_1_0() { return cTargetIDTerminalRuleCall_5_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class CommitmentStoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.CommitmentStore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommitmentElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cScopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cScopeScopeParserRuleCall_4_0 = (RuleCall)cScopeAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFocusAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFocusFocusParserRuleCall_6_0 = (RuleCall)cFocusAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cContentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cContentSTRINGTerminalRuleCall_8_0 = (RuleCall)cContentAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//CommitmentStore:
		//	'commitmentElement' '('
		//	name=ID ','
		//	scope=Scope ','
		//	focus=Focus ','
		//	content=STRING
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'commitmentElement' '(' name=ID ',' scope=Scope ',' focus=Focus ',' content=STRING ')'
		public Group getGroup() { return cGroup; }
		
		//'commitmentElement'
		public Keyword getCommitmentElementKeyword_0() { return cCommitmentElementKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//scope=Scope
		public Assignment getScopeAssignment_4() { return cScopeAssignment_4; }
		
		//Scope
		public RuleCall getScopeScopeParserRuleCall_4_0() { return cScopeScopeParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//focus=Focus
		public Assignment getFocusAssignment_6() { return cFocusAssignment_6; }
		
		//Focus
		public RuleCall getFocusFocusParserRuleCall_6_0() { return cFocusFocusParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//content=STRING
		public Assignment getContentAssignment_8() { return cContentAssignment_8; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_8_0() { return cContentSTRINGTerminalRuleCall_8_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}
	public class ArgumentStoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.ArgumentStore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArgumentElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cScopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cScopeScopeParserRuleCall_4_0 = (RuleCall)cScopeAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFocusAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFocusFocusParserRuleCall_6_0 = (RuleCall)cFocusAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cContentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cContentSTRINGTerminalRuleCall_8_0 = (RuleCall)cContentAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cCommaKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cTargetAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cTargetIDTerminalRuleCall_9_1_0 = (RuleCall)cTargetAssignment_9_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//ArgumentStore:
		//	'argumentElement' '('
		//	name=ID ','
		//	scope=Scope ','
		//	focus=Focus ','
		//	content=STRING (','
		//	target=ID)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'argumentElement' '(' name=ID ',' scope=Scope ',' focus=Focus ',' content=STRING (',' target=ID)? ')'
		public Group getGroup() { return cGroup; }
		
		//'argumentElement'
		public Keyword getArgumentElementKeyword_0() { return cArgumentElementKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//scope=Scope
		public Assignment getScopeAssignment_4() { return cScopeAssignment_4; }
		
		//Scope
		public RuleCall getScopeScopeParserRuleCall_4_0() { return cScopeScopeParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//focus=Focus
		public Assignment getFocusAssignment_6() { return cFocusAssignment_6; }
		
		//Focus
		public RuleCall getFocusFocusParserRuleCall_6_0() { return cFocusFocusParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//content=STRING
		public Assignment getContentAssignment_8() { return cContentAssignment_8; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_8_0() { return cContentSTRINGTerminalRuleCall_8_0; }
		
		//(',' target=ID)?
		public Group getGroup_9() { return cGroup_9; }
		
		//','
		public Keyword getCommaKeyword_9_0() { return cCommaKeyword_9_0; }
		
		//target=ID
		public Assignment getTargetAssignment_9_1() { return cTargetAssignment_9_1; }
		
		//ID
		public RuleCall getTargetIDTerminalRuleCall_9_1_0() { return cTargetIDTerminalRuleCall_9_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
	}
	public class ScopeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.Scope");
		private final Assignment cScopeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cScopeAlternatives_0 = (Alternatives)cScopeAssignment.eContents().get(0);
		private final Keyword cScopeFeatureKeyword_0_0 = (Keyword)cScopeAlternatives_0.eContents().get(0);
		private final Keyword cScopeRatingKeyword_0_1 = (Keyword)cScopeAlternatives_0.eContents().get(1);
		private final Keyword cScopeCriteriaKeyword_0_2 = (Keyword)cScopeAlternatives_0.eContents().get(2);
		private final Keyword cScopeTopicKeyword_0_3 = (Keyword)cScopeAlternatives_0.eContents().get(3);
		
		//Scope:
		//	scope=('feature' | 'rating' | 'criteria' | 'topic');
		@Override public ParserRule getRule() { return rule; }
		
		//scope=('feature' | 'rating' | 'criteria' | 'topic')
		public Assignment getScopeAssignment() { return cScopeAssignment; }
		
		//('feature' | 'rating' | 'criteria' | 'topic')
		public Alternatives getScopeAlternatives_0() { return cScopeAlternatives_0; }
		
		//'feature'
		public Keyword getScopeFeatureKeyword_0_0() { return cScopeFeatureKeyword_0_0; }
		
		//'rating'
		public Keyword getScopeRatingKeyword_0_1() { return cScopeRatingKeyword_0_1; }
		
		//'criteria'
		public Keyword getScopeCriteriaKeyword_0_2() { return cScopeCriteriaKeyword_0_2; }
		
		//'topic'
		public Keyword getScopeTopicKeyword_0_3() { return cScopeTopicKeyword_0_3; }
	}
	public class FocusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.Focus");
		private final Assignment cFocusAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cFocusAlternatives_0 = (Alternatives)cFocusAssignment.eContents().get(0);
		private final Keyword cFocusRKeyword_0_0 = (Keyword)cFocusAlternatives_0.eContents().get(0);
		private final Keyword cFocusSKeyword_0_1 = (Keyword)cFocusAlternatives_0.eContents().get(1);
		private final Keyword cFocusGKeyword_0_2 = (Keyword)cFocusAlternatives_0.eContents().get(2);
		private final Keyword cFocusVKeyword_0_3 = (Keyword)cFocusAlternatives_0.eContents().get(3);
		private final Keyword cFocusAKeyword_0_4 = (Keyword)cFocusAlternatives_0.eContents().get(4);
		
		//Focus:
		//	focus=('R' | 'S' | 'G' | 'V' | 'A');
		@Override public ParserRule getRule() { return rule; }
		
		//focus=('R' | 'S' | 'G' | 'V' | 'A')
		public Assignment getFocusAssignment() { return cFocusAssignment; }
		
		//('R' | 'S' | 'G' | 'V' | 'A')
		public Alternatives getFocusAlternatives_0() { return cFocusAlternatives_0; }
		
		//'R'
		public Keyword getFocusRKeyword_0_0() { return cFocusRKeyword_0_0; }
		
		//'S'
		public Keyword getFocusSKeyword_0_1() { return cFocusSKeyword_0_1; }
		
		//'G'
		public Keyword getFocusGKeyword_0_2() { return cFocusGKeyword_0_2; }
		
		//'V'
		public Keyword getFocusVKeyword_0_3() { return cFocusVKeyword_0_3; }
		
		//'A'
		public Keyword getFocusAKeyword_0_4() { return cFocusAKeyword_0_4; }
	}
	public class SenderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.AnnotationsStores.Sender");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Sender:
		//	INT+;
		@Override public ParserRule getRule() { return rule; }
		
		//INT+
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	
	
	private final AnnotationStoresElements pAnnotationStores;
	private final ProposalStoreElements pProposalStore;
	private final QuestionStoreElements pQuestionStore;
	private final ChallengeStoreElements pChallengeStore;
	private final CommitmentStoreElements pCommitmentStore;
	private final ArgumentStoreElements pArgumentStore;
	private final ScopeElements pScope;
	private final FocusElements pFocus;
	private final SenderElements pSender;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AnnotationsStoresGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAnnotationStores = new AnnotationStoresElements();
		this.pProposalStore = new ProposalStoreElements();
		this.pQuestionStore = new QuestionStoreElements();
		this.pChallengeStore = new ChallengeStoreElements();
		this.pCommitmentStore = new CommitmentStoreElements();
		this.pArgumentStore = new ArgumentStoreElements();
		this.pScope = new ScopeElements();
		this.pFocus = new FocusElements();
		this.pSender = new SenderElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("kcl.ac.uk.xtext.AnnotationsStores".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AnnotationStores:
	//	proposalElements+=ProposalStore*
	//	questionElements+=QuestionStore*
	//	challengeElements+=ChallengeStore*
	//	commitmentElements+=CommitmentStore*
	//	argumentElements+=ArgumentStore*;
	public AnnotationStoresElements getAnnotationStoresAccess() {
		return pAnnotationStores;
	}
	
	public ParserRule getAnnotationStoresRule() {
		return getAnnotationStoresAccess().getRule();
	}
	
	//ProposalStore:
	//	'proposalElement' '('
	//	name=ID ','
	//	scope=Scope ','
	//	focus=Focus ','
	//	content=STRING
	//	')';
	public ProposalStoreElements getProposalStoreAccess() {
		return pProposalStore;
	}
	
	public ParserRule getProposalStoreRule() {
		return getProposalStoreAccess().getRule();
	}
	
	//QuestionStore:
	//	'questionElement' '('
	//	name=ID ','
	//	sender=Sender ','
	//	scope=Scope ','
	//	focus=Focus ','
	//	content=STRING
	//	')';
	public QuestionStoreElements getQuestionStoreAccess() {
		return pQuestionStore;
	}
	
	public ParserRule getQuestionStoreRule() {
		return getQuestionStoreAccess().getRule();
	}
	
	//ChallengeStore:
	//	'challengeElement' '('
	//	name=ID ','
	//	sender=Sender (','
	//	target=ID)?
	//	')';
	public ChallengeStoreElements getChallengeStoreAccess() {
		return pChallengeStore;
	}
	
	public ParserRule getChallengeStoreRule() {
		return getChallengeStoreAccess().getRule();
	}
	
	//CommitmentStore:
	//	'commitmentElement' '('
	//	name=ID ','
	//	scope=Scope ','
	//	focus=Focus ','
	//	content=STRING
	//	')';
	public CommitmentStoreElements getCommitmentStoreAccess() {
		return pCommitmentStore;
	}
	
	public ParserRule getCommitmentStoreRule() {
		return getCommitmentStoreAccess().getRule();
	}
	
	//ArgumentStore:
	//	'argumentElement' '('
	//	name=ID ','
	//	scope=Scope ','
	//	focus=Focus ','
	//	content=STRING (','
	//	target=ID)?
	//	')';
	public ArgumentStoreElements getArgumentStoreAccess() {
		return pArgumentStore;
	}
	
	public ParserRule getArgumentStoreRule() {
		return getArgumentStoreAccess().getRule();
	}
	
	//Scope:
	//	scope=('feature' | 'rating' | 'criteria' | 'topic');
	public ScopeElements getScopeAccess() {
		return pScope;
	}
	
	public ParserRule getScopeRule() {
		return getScopeAccess().getRule();
	}
	
	//Focus:
	//	focus=('R' | 'S' | 'G' | 'V' | 'A');
	public FocusElements getFocusAccess() {
		return pFocus;
	}
	
	public ParserRule getFocusRule() {
		return getFocusAccess().getRule();
	}
	
	//Sender:
	//	INT+;
	public SenderElements getSenderAccess() {
		return pSender;
	}
	
	public ParserRule getSenderRule() {
		return getSenderAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

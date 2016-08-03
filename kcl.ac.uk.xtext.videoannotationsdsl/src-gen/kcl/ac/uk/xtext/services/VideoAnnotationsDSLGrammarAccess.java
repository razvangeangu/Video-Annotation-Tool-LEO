/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class VideoAnnotationsDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AnnotatedVideoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.AnnotatedVideo");
		private final Assignment cAnnotationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0 = (RuleCall)cAnnotationsAssignment.eContents().get(0);
		
		//AnnotatedVideo:
		//	annotations+=Annotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment() { return cAnnotationsAssignment; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0() { return cAnnotationsAnnotationParserRuleCall_0; }
	}
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFromTimeTimeParserRuleCall_1_0 = (RuleCall)cFromTimeAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cToTimeTimeParserRuleCall_3_0 = (RuleCall)cToTimeAssignment_3.eContents().get(0);
		private final Keyword cAnnotateKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cNameAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cNameIDTerminalRuleCall_6_0 = (RuleCall)cNameAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cSenderAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cSenderSenderParserRuleCall_8_0 = (RuleCall)cSenderAssignment_8.eContents().get(0);
		private final Keyword cCommaKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTypeAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTypeMoveParserRuleCall_10_0 = (RuleCall)cTypeAssignment_10.eContents().get(0);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cScopeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cScopeScopeParserRuleCall_12_0 = (RuleCall)cScopeAssignment_12.eContents().get(0);
		private final Keyword cCommaKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cFocusAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cFocusFocusParserRuleCall_14_0 = (RuleCall)cFocusAssignment_14.eContents().get(0);
		private final Keyword cCommaKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Assignment cContentLabelAssignment_16_0 = (Assignment)cGroup_16.eContents().get(0);
		private final RuleCall cContentLabelSTRINGTerminalRuleCall_16_0_0 = (RuleCall)cContentLabelAssignment_16_0.eContents().get(0);
		private final Keyword cCommaKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cContentAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cContentSTRINGTerminalRuleCall_17_0 = (RuleCall)cContentAssignment_17.eContents().get(0);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cCommaKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Assignment cTargetAssignment_18_1 = (Assignment)cGroup_18.eContents().get(1);
		private final CrossReference cTargetAnnotationCrossReference_18_1_0 = (CrossReference)cTargetAssignment_18_1.eContents().get(0);
		private final RuleCall cTargetAnnotationIDTerminalRuleCall_18_1_0_1 = (RuleCall)cTargetAnnotationCrossReference_18_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//Annotation:
		//	'from' fromTime=Time 'to' toTime=Time
		//	'annotate' '('
		//	name=ID ','
		//	sender=Sender ','
		//	type=Move ','
		//	scope=Scope ','
		//	focus=Focus ',' (contentLabel=STRING ',')?
		//	content=STRING (','
		//	target=[Annotation])?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//'from' fromTime=Time 'to' toTime=Time 'annotate' '(' name=ID ',' sender=Sender ',' type=Move ',' scope=Scope ','
		//focus=Focus ',' (contentLabel=STRING ',')? content=STRING (',' target=[Annotation])? ')'
		public Group getGroup() { return cGroup; }
		
		//'from'
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }
		
		//fromTime=Time
		public Assignment getFromTimeAssignment_1() { return cFromTimeAssignment_1; }
		
		//Time
		public RuleCall getFromTimeTimeParserRuleCall_1_0() { return cFromTimeTimeParserRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//toTime=Time
		public Assignment getToTimeAssignment_3() { return cToTimeAssignment_3; }
		
		//Time
		public RuleCall getToTimeTimeParserRuleCall_3_0() { return cToTimeTimeParserRuleCall_3_0; }
		
		//'annotate'
		public Keyword getAnnotateKeyword_4() { return cAnnotateKeyword_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }
		
		//name=ID
		public Assignment getNameAssignment_6() { return cNameAssignment_6; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_6_0() { return cNameIDTerminalRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//sender=Sender
		public Assignment getSenderAssignment_8() { return cSenderAssignment_8; }
		
		//Sender
		public RuleCall getSenderSenderParserRuleCall_8_0() { return cSenderSenderParserRuleCall_8_0; }
		
		//','
		public Keyword getCommaKeyword_9() { return cCommaKeyword_9; }
		
		//type=Move
		public Assignment getTypeAssignment_10() { return cTypeAssignment_10; }
		
		//Move
		public RuleCall getTypeMoveParserRuleCall_10_0() { return cTypeMoveParserRuleCall_10_0; }
		
		//','
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }
		
		//scope=Scope
		public Assignment getScopeAssignment_12() { return cScopeAssignment_12; }
		
		//Scope
		public RuleCall getScopeScopeParserRuleCall_12_0() { return cScopeScopeParserRuleCall_12_0; }
		
		//','
		public Keyword getCommaKeyword_13() { return cCommaKeyword_13; }
		
		//focus=Focus
		public Assignment getFocusAssignment_14() { return cFocusAssignment_14; }
		
		//Focus
		public RuleCall getFocusFocusParserRuleCall_14_0() { return cFocusFocusParserRuleCall_14_0; }
		
		//','
		public Keyword getCommaKeyword_15() { return cCommaKeyword_15; }
		
		//(contentLabel=STRING ',')?
		public Group getGroup_16() { return cGroup_16; }
		
		//contentLabel=STRING
		public Assignment getContentLabelAssignment_16_0() { return cContentLabelAssignment_16_0; }
		
		//STRING
		public RuleCall getContentLabelSTRINGTerminalRuleCall_16_0_0() { return cContentLabelSTRINGTerminalRuleCall_16_0_0; }
		
		//','
		public Keyword getCommaKeyword_16_1() { return cCommaKeyword_16_1; }
		
		//content=STRING
		public Assignment getContentAssignment_17() { return cContentAssignment_17; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_17_0() { return cContentSTRINGTerminalRuleCall_17_0; }
		
		//(',' target=[Annotation])?
		public Group getGroup_18() { return cGroup_18; }
		
		//','
		public Keyword getCommaKeyword_18_0() { return cCommaKeyword_18_0; }
		
		//target=[Annotation]
		public Assignment getTargetAssignment_18_1() { return cTargetAssignment_18_1; }
		
		//[Annotation]
		public CrossReference getTargetAnnotationCrossReference_18_1_0() { return cTargetAnnotationCrossReference_18_1_0; }
		
		//ID
		public RuleCall getTargetAnnotationIDTerminalRuleCall_18_1_0_1() { return cTargetAnnotationIDTerminalRuleCall_18_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_19() { return cRightParenthesisKeyword_19; }
	}
	public class SenderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Sender");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Sender:
		//	INT+;
		@Override public ParserRule getRule() { return rule; }
		
		//INT+
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class MoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Move");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final Keyword cTypeProposeKeyword_0_0 = (Keyword)cTypeAlternatives_0.eContents().get(0);
		private final Keyword cTypeQuestionKeyword_0_1 = (Keyword)cTypeAlternatives_0.eContents().get(1);
		private final Keyword cTypeChallengeKeyword_0_2 = (Keyword)cTypeAlternatives_0.eContents().get(2);
		private final Keyword cTypeJustifyKeyword_0_3 = (Keyword)cTypeAlternatives_0.eContents().get(3);
		private final Keyword cTypeWithdrawKeyword_0_4 = (Keyword)cTypeAlternatives_0.eContents().get(4);
		private final Keyword cTypeAcceptKeyword_0_5 = (Keyword)cTypeAlternatives_0.eContents().get(5);
		private final Keyword cTypeRejectKeyword_0_6 = (Keyword)cTypeAlternatives_0.eContents().get(6);
		private final Keyword cTypeCommitKeyword_0_7 = (Keyword)cTypeAlternatives_0.eContents().get(7);
		private final Keyword cTypeUncommitKeyword_0_8 = (Keyword)cTypeAlternatives_0.eContents().get(8);
		private final Keyword cTypeCounterKeyword_0_9 = (Keyword)cTypeAlternatives_0.eContents().get(9);
		
		//Move:
		//	type=('propose' | 'question' | 'challenge' | 'justify' | 'withdraw' | 'accept' | 'reject' | 'commit' | 'uncommit' |
		//	'counter');
		@Override public ParserRule getRule() { return rule; }
		
		//type=('propose' | 'question' | 'challenge' | 'justify' | 'withdraw' | 'accept' | 'reject' | 'commit' | 'uncommit' |
		//'counter')
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//('propose' | 'question' | 'challenge' | 'justify' | 'withdraw' | 'accept' | 'reject' | 'commit' | 'uncommit' |
		//'counter')
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//'propose'
		public Keyword getTypeProposeKeyword_0_0() { return cTypeProposeKeyword_0_0; }
		
		//'question'
		public Keyword getTypeQuestionKeyword_0_1() { return cTypeQuestionKeyword_0_1; }
		
		//'challenge'
		public Keyword getTypeChallengeKeyword_0_2() { return cTypeChallengeKeyword_0_2; }
		
		//'justify'
		public Keyword getTypeJustifyKeyword_0_3() { return cTypeJustifyKeyword_0_3; }
		
		//'withdraw'
		public Keyword getTypeWithdrawKeyword_0_4() { return cTypeWithdrawKeyword_0_4; }
		
		//'accept'
		public Keyword getTypeAcceptKeyword_0_5() { return cTypeAcceptKeyword_0_5; }
		
		//'reject'
		public Keyword getTypeRejectKeyword_0_6() { return cTypeRejectKeyword_0_6; }
		
		//'commit'
		public Keyword getTypeCommitKeyword_0_7() { return cTypeCommitKeyword_0_7; }
		
		//'uncommit'
		public Keyword getTypeUncommitKeyword_0_8() { return cTypeUncommitKeyword_0_8; }
		
		//'counter'
		public Keyword getTypeCounterKeyword_0_9() { return cTypeCounterKeyword_0_9; }
	}
	public class ScopeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Scope");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Focus");
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
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "kcl.ac.uk.xtext.VideoAnnotationsDSL.Time");
		private final Assignment cSecAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSecINTTerminalRuleCall_0 = (RuleCall)cSecAssignment.eContents().get(0);
		
		//Time:
		//	sec=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//sec=INT
		public Assignment getSecAssignment() { return cSecAssignment; }
		
		//INT
		public RuleCall getSecINTTerminalRuleCall_0() { return cSecINTTerminalRuleCall_0; }
	}
	
	
	private final AnnotatedVideoElements pAnnotatedVideo;
	private final AnnotationElements pAnnotation;
	private final SenderElements pSender;
	private final MoveElements pMove;
	private final ScopeElements pScope;
	private final FocusElements pFocus;
	private final TimeElements pTime;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VideoAnnotationsDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAnnotatedVideo = new AnnotatedVideoElements();
		this.pAnnotation = new AnnotationElements();
		this.pSender = new SenderElements();
		this.pMove = new MoveElements();
		this.pScope = new ScopeElements();
		this.pFocus = new FocusElements();
		this.pTime = new TimeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("kcl.ac.uk.xtext.VideoAnnotationsDSL".equals(grammar.getName())) {
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

	
	//AnnotatedVideo:
	//	annotations+=Annotation*;
	public AnnotatedVideoElements getAnnotatedVideoAccess() {
		return pAnnotatedVideo;
	}
	
	public ParserRule getAnnotatedVideoRule() {
		return getAnnotatedVideoAccess().getRule();
	}
	
	//Annotation:
	//	'from' fromTime=Time 'to' toTime=Time
	//	'annotate' '('
	//	name=ID ','
	//	sender=Sender ','
	//	type=Move ','
	//	scope=Scope ','
	//	focus=Focus ',' (contentLabel=STRING ',')?
	//	content=STRING (','
	//	target=[Annotation])?
	//	')';
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}
	
	//Sender:
	//	INT+;
	public SenderElements getSenderAccess() {
		return pSender;
	}
	
	public ParserRule getSenderRule() {
		return getSenderAccess().getRule();
	}
	
	//Move:
	//	type=('propose' | 'question' | 'challenge' | 'justify' | 'withdraw' | 'accept' | 'reject' | 'commit' | 'uncommit' |
	//	'counter');
	public MoveElements getMoveAccess() {
		return pMove;
	}
	
	public ParserRule getMoveRule() {
		return getMoveAccess().getRule();
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
	
	//Time:
	//	sec=INT;
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
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

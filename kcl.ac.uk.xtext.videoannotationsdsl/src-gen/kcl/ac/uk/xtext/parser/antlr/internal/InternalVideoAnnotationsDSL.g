/*
 * generated by Xtext 2.10.0
 */
grammar InternalVideoAnnotationsDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package kcl.ac.uk.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package kcl.ac.uk.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;

}

@parser::members {

 	private VideoAnnotationsDSLGrammarAccess grammarAccess;

    public InternalVideoAnnotationsDSLParser(TokenStream input, VideoAnnotationsDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AnnotatedVideo";
   	}

   	@Override
   	protected VideoAnnotationsDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAnnotatedVideo
entryRuleAnnotatedVideo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotatedVideoRule()); }
	iv_ruleAnnotatedVideo=ruleAnnotatedVideo
	{ $current=$iv_ruleAnnotatedVideo.current; }
	EOF;

// Rule AnnotatedVideo
ruleAnnotatedVideo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0());
			}
			lv_annotations_0_0=ruleAnnotation
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAnnotatedVideoRule());
				}
				add(
					$current,
					"annotations",
					lv_annotations_0_0,
					"kcl.ac.uk.xtext.VideoAnnotationsDSL.Annotation");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='from'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getFromKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0());
				}
				lv_fromTime_1_0=ruleTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"fromTime",
						lv_fromTime_1_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getToKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0());
				}
				lv_toTime_3_0=ruleTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"toTime",
						lv_toTime_3_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='annotate'
		{
			newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getAnnotateKeyword_4());
		}
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				lv_name_6_0=RULE_ID
				{
					newLeafNode(lv_name_6_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_7=','
		{
			newLeafNode(otherlv_7, grammarAccess.getAnnotationAccess().getCommaKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0());
				}
				lv_sender_8_0=ruleSender
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"sender",
						lv_sender_8_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Sender");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=','
		{
			newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getCommaKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0());
				}
				lv_type_10_0=ruleMove
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"type",
						lv_type_10_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Move");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11=','
		{
			newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getCommaKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0());
				}
				lv_scope_12_0=ruleScope
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"scope",
						lv_scope_12_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Scope");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=','
		{
			newLeafNode(otherlv_13, grammarAccess.getAnnotationAccess().getCommaKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0());
				}
				lv_focus_14_0=ruleFocus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationRule());
					}
					set(
						$current,
						"focus",
						lv_focus_14_0,
						"kcl.ac.uk.xtext.VideoAnnotationsDSL.Focus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=','
		{
			newLeafNode(otherlv_15, grammarAccess.getAnnotationAccess().getCommaKeyword_15());
		}
		(
			(
				(
					lv_contentLabel_16_0=RULE_STRING
					{
						newLeafNode(lv_contentLabel_16_0, grammarAccess.getAnnotationAccess().getContentLabelSTRINGTerminalRuleCall_16_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"contentLabel",
							lv_contentLabel_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=','
			{
				newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getCommaKeyword_16_1());
			}
		)?
		(
			(
				lv_content_18_0=RULE_STRING
				{
					newLeafNode(lv_content_18_0, grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_17_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"content",
						lv_content_18_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_19=','
			{
				newLeafNode(otherlv_19, grammarAccess.getAnnotationAccess().getCommaKeyword_18_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnnotationRule());
						}
					}
					otherlv_20=RULE_ID
					{
						newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_1_0());
					}
				)
			)
		)?
		otherlv_21=')'
		{
			newLeafNode(otherlv_21, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19());
		}
		(
			otherlv_22='#'
			{
				newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_0());
			}
			(
				(
					lv_comment_23_0=RULE_STRING
					{
						newLeafNode(lv_comment_23_0, grammarAccess.getAnnotationAccess().getCommentSTRINGTerminalRuleCall_20_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"comment",
							lv_comment_23_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_24='#'
			{
				newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_2());
			}
		)?
	)
;

// Entry rule entryRuleSender
entryRuleSender returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSenderRule()); }
	iv_ruleSender=ruleSender
	{ $current=$iv_ruleSender.current.getText(); }
	EOF;

// Rule Sender
ruleSender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getSenderAccess().getINTTerminalRuleCall());
		}
	)+
;

// Entry rule entryRuleMove
entryRuleMove returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveRule()); }
	iv_ruleMove=ruleMove
	{ $current=$iv_ruleMove.current; }
	EOF;

// Rule Move
ruleMove returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_1='propose'
				{
					newLeafNode(lv_type_0_1, grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_1, null);
				}
				    |
				lv_type_0_2='question'
				{
					newLeafNode(lv_type_0_2, grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_2, null);
				}
				    |
				lv_type_0_3='challenge'
				{
					newLeafNode(lv_type_0_3, grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_3, null);
				}
				    |
				lv_type_0_4='justify'
				{
					newLeafNode(lv_type_0_4, grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_4, null);
				}
				    |
				lv_type_0_5='withdraw'
				{
					newLeafNode(lv_type_0_5, grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_5, null);
				}
				    |
				lv_type_0_6='accept'
				{
					newLeafNode(lv_type_0_6, grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_6, null);
				}
				    |
				lv_type_0_7='reject'
				{
					newLeafNode(lv_type_0_7, grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_7, null);
				}
				    |
				lv_type_0_8='commit'
				{
					newLeafNode(lv_type_0_8, grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_8, null);
				}
				    |
				lv_type_0_9='counter'
				{
					newLeafNode(lv_type_0_9, grammarAccess.getMoveAccess().getTypeCounterKeyword_0_8());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_9, null);
				}
				    |
				lv_type_0_10='uncommit'
				{
					newLeafNode(lv_type_0_10, grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_9());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_10, null);
				}
			)
		)
	)
;

// Entry rule entryRuleScope
entryRuleScope returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScopeRule()); }
	iv_ruleScope=ruleScope
	{ $current=$iv_ruleScope.current; }
	EOF;

// Rule Scope
ruleScope returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_scope_0_1='feature'
				{
					newLeafNode(lv_scope_0_1, grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed($current, "scope", lv_scope_0_1, null);
				}
				    |
				lv_scope_0_2='rating'
				{
					newLeafNode(lv_scope_0_2, grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed($current, "scope", lv_scope_0_2, null);
				}
				    |
				lv_scope_0_3='criteria'
				{
					newLeafNode(lv_scope_0_3, grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed($current, "scope", lv_scope_0_3, null);
				}
				    |
				lv_scope_0_4='topic'
				{
					newLeafNode(lv_scope_0_4, grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed($current, "scope", lv_scope_0_4, null);
				}
			)
		)
	)
;

// Entry rule entryRuleFocus
entryRuleFocus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFocusRule()); }
	iv_ruleFocus=ruleFocus
	{ $current=$iv_ruleFocus.current; }
	EOF;

// Rule Focus
ruleFocus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_focus_0_1='R'
				{
					newLeafNode(lv_focus_0_1, grammarAccess.getFocusAccess().getFocusRKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFocusRule());
					}
					setWithLastConsumed($current, "focus", lv_focus_0_1, null);
				}
				    |
				lv_focus_0_2='S'
				{
					newLeafNode(lv_focus_0_2, grammarAccess.getFocusAccess().getFocusSKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFocusRule());
					}
					setWithLastConsumed($current, "focus", lv_focus_0_2, null);
				}
				    |
				lv_focus_0_3='G'
				{
					newLeafNode(lv_focus_0_3, grammarAccess.getFocusAccess().getFocusGKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFocusRule());
					}
					setWithLastConsumed($current, "focus", lv_focus_0_3, null);
				}
				    |
				lv_focus_0_4='V'
				{
					newLeafNode(lv_focus_0_4, grammarAccess.getFocusAccess().getFocusVKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFocusRule());
					}
					setWithLastConsumed($current, "focus", lv_focus_0_4, null);
				}
				    |
				lv_focus_0_5='A'
				{
					newLeafNode(lv_focus_0_5, grammarAccess.getFocusAccess().getFocusAKeyword_0_4());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFocusRule());
					}
					setWithLastConsumed($current, "focus", lv_focus_0_5, null);
				}
			)
		)
	)
;

// Entry rule entryRuleTime
entryRuleTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruleTime=ruleTime
	{ $current=$iv_ruleTime.current; }
	EOF;

// Rule Time
ruleTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_sec_0_0=RULE_INT
			{
				newLeafNode(lv_sec_0_0, grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTimeRule());
				}
				setWithLastConsumed(
					$current,
					"sec",
					lv_sec_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

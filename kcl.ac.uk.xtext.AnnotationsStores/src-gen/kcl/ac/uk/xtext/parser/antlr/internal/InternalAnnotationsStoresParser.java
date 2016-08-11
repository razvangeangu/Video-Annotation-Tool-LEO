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
import kcl.ac.uk.xtext.services.AnnotationsStoresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsStoresParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proposalElement'", "'('", "','", "')'", "'questionElement'", "'challengeElement'", "'commitmentElement'", "'argumentElement'", "'feature'", "'rating'", "'criteria'", "'topic'", "'R'", "'S'", "'G'", "'V'", "'A'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAnnotationsStoresParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsStoresParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsStoresParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnnotationsStores.g"; }



     	private AnnotationsStoresGrammarAccess grammarAccess;

        public InternalAnnotationsStoresParser(TokenStream input, AnnotationsStoresGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AnnotationStores";
       	}

       	@Override
       	protected AnnotationsStoresGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAnnotationStores"
    // InternalAnnotationsStores.g:64:1: entryRuleAnnotationStores returns [EObject current=null] : iv_ruleAnnotationStores= ruleAnnotationStores EOF ;
    public final EObject entryRuleAnnotationStores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationStores = null;


        try {
            // InternalAnnotationsStores.g:64:57: (iv_ruleAnnotationStores= ruleAnnotationStores EOF )
            // InternalAnnotationsStores.g:65:2: iv_ruleAnnotationStores= ruleAnnotationStores EOF
            {
             newCompositeNode(grammarAccess.getAnnotationStoresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationStores=ruleAnnotationStores();

            state._fsp--;

             current =iv_ruleAnnotationStores; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationStores"


    // $ANTLR start "ruleAnnotationStores"
    // InternalAnnotationsStores.g:71:1: ruleAnnotationStores returns [EObject current=null] : ( ( (lv_proposalElements_0_0= ruleProposalStore ) )* ( (lv_questionElements_1_0= ruleQuestionStore ) )* ( (lv_challengeElements_2_0= ruleChallengeStore ) )* ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )* ( (lv_argumentElements_4_0= ruleArgumentStore ) )* ) ;
    public final EObject ruleAnnotationStores() throws RecognitionException {
        EObject current = null;

        EObject lv_proposalElements_0_0 = null;

        EObject lv_questionElements_1_0 = null;

        EObject lv_challengeElements_2_0 = null;

        EObject lv_commitmentElements_3_0 = null;

        EObject lv_argumentElements_4_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:77:2: ( ( ( (lv_proposalElements_0_0= ruleProposalStore ) )* ( (lv_questionElements_1_0= ruleQuestionStore ) )* ( (lv_challengeElements_2_0= ruleChallengeStore ) )* ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )* ( (lv_argumentElements_4_0= ruleArgumentStore ) )* ) )
            // InternalAnnotationsStores.g:78:2: ( ( (lv_proposalElements_0_0= ruleProposalStore ) )* ( (lv_questionElements_1_0= ruleQuestionStore ) )* ( (lv_challengeElements_2_0= ruleChallengeStore ) )* ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )* ( (lv_argumentElements_4_0= ruleArgumentStore ) )* )
            {
            // InternalAnnotationsStores.g:78:2: ( ( (lv_proposalElements_0_0= ruleProposalStore ) )* ( (lv_questionElements_1_0= ruleQuestionStore ) )* ( (lv_challengeElements_2_0= ruleChallengeStore ) )* ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )* ( (lv_argumentElements_4_0= ruleArgumentStore ) )* )
            // InternalAnnotationsStores.g:79:3: ( (lv_proposalElements_0_0= ruleProposalStore ) )* ( (lv_questionElements_1_0= ruleQuestionStore ) )* ( (lv_challengeElements_2_0= ruleChallengeStore ) )* ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )* ( (lv_argumentElements_4_0= ruleArgumentStore ) )*
            {
            // InternalAnnotationsStores.g:79:3: ( (lv_proposalElements_0_0= ruleProposalStore ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnnotationsStores.g:80:4: (lv_proposalElements_0_0= ruleProposalStore )
            	    {
            	    // InternalAnnotationsStores.g:80:4: (lv_proposalElements_0_0= ruleProposalStore )
            	    // InternalAnnotationsStores.g:81:5: lv_proposalElements_0_0= ruleProposalStore
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationStoresAccess().getProposalElementsProposalStoreParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_proposalElements_0_0=ruleProposalStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationStoresRule());
            	    					}
            	    					add(
            	    						current,
            	    						"proposalElements",
            	    						lv_proposalElements_0_0,
            	    						"kcl.ac.uk.xtext.AnnotationsStores.ProposalStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAnnotationsStores.g:98:3: ( (lv_questionElements_1_0= ruleQuestionStore ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnnotationsStores.g:99:4: (lv_questionElements_1_0= ruleQuestionStore )
            	    {
            	    // InternalAnnotationsStores.g:99:4: (lv_questionElements_1_0= ruleQuestionStore )
            	    // InternalAnnotationsStores.g:100:5: lv_questionElements_1_0= ruleQuestionStore
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationStoresAccess().getQuestionElementsQuestionStoreParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_questionElements_1_0=ruleQuestionStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationStoresRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questionElements",
            	    						lv_questionElements_1_0,
            	    						"kcl.ac.uk.xtext.AnnotationsStores.QuestionStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAnnotationsStores.g:117:3: ( (lv_challengeElements_2_0= ruleChallengeStore ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnnotationsStores.g:118:4: (lv_challengeElements_2_0= ruleChallengeStore )
            	    {
            	    // InternalAnnotationsStores.g:118:4: (lv_challengeElements_2_0= ruleChallengeStore )
            	    // InternalAnnotationsStores.g:119:5: lv_challengeElements_2_0= ruleChallengeStore
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationStoresAccess().getChallengeElementsChallengeStoreParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_challengeElements_2_0=ruleChallengeStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationStoresRule());
            	    					}
            	    					add(
            	    						current,
            	    						"challengeElements",
            	    						lv_challengeElements_2_0,
            	    						"kcl.ac.uk.xtext.AnnotationsStores.ChallengeStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAnnotationsStores.g:136:3: ( (lv_commitmentElements_3_0= ruleCommitmentStore ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotationsStores.g:137:4: (lv_commitmentElements_3_0= ruleCommitmentStore )
            	    {
            	    // InternalAnnotationsStores.g:137:4: (lv_commitmentElements_3_0= ruleCommitmentStore )
            	    // InternalAnnotationsStores.g:138:5: lv_commitmentElements_3_0= ruleCommitmentStore
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsCommitmentStoreParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_commitmentElements_3_0=ruleCommitmentStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationStoresRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commitmentElements",
            	    						lv_commitmentElements_3_0,
            	    						"kcl.ac.uk.xtext.AnnotationsStores.CommitmentStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAnnotationsStores.g:155:3: ( (lv_argumentElements_4_0= ruleArgumentStore ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotationsStores.g:156:4: (lv_argumentElements_4_0= ruleArgumentStore )
            	    {
            	    // InternalAnnotationsStores.g:156:4: (lv_argumentElements_4_0= ruleArgumentStore )
            	    // InternalAnnotationsStores.g:157:5: lv_argumentElements_4_0= ruleArgumentStore
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationStoresAccess().getArgumentElementsArgumentStoreParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_argumentElements_4_0=ruleArgumentStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationStoresRule());
            	    					}
            	    					add(
            	    						current,
            	    						"argumentElements",
            	    						lv_argumentElements_4_0,
            	    						"kcl.ac.uk.xtext.AnnotationsStores.ArgumentStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationStores"


    // $ANTLR start "entryRuleProposalStore"
    // InternalAnnotationsStores.g:178:1: entryRuleProposalStore returns [EObject current=null] : iv_ruleProposalStore= ruleProposalStore EOF ;
    public final EObject entryRuleProposalStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposalStore = null;


        try {
            // InternalAnnotationsStores.g:178:54: (iv_ruleProposalStore= ruleProposalStore EOF )
            // InternalAnnotationsStores.g:179:2: iv_ruleProposalStore= ruleProposalStore EOF
            {
             newCompositeNode(grammarAccess.getProposalStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposalStore=ruleProposalStore();

            state._fsp--;

             current =iv_ruleProposalStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProposalStore"


    // $ANTLR start "ruleProposalStore"
    // InternalAnnotationsStores.g:185:1: ruleProposalStore returns [EObject current=null] : (otherlv_0= 'proposalElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? ) ;
    public final EObject ruleProposalStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_content_8_0=null;
        Token otherlv_9=null;
        EObject lv_scope_4_0 = null;

        EObject lv_focus_6_0 = null;

        EObject lv_effect_10_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:191:2: ( (otherlv_0= 'proposalElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? ) )
            // InternalAnnotationsStores.g:192:2: (otherlv_0= 'proposalElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? )
            {
            // InternalAnnotationsStores.g:192:2: (otherlv_0= 'proposalElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? )
            // InternalAnnotationsStores.g:193:3: otherlv_0= 'proposalElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProposalStoreAccess().getProposalElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProposalStoreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnnotationsStores.g:201:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnnotationsStores.g:202:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:202:4: (lv_name_2_0= RULE_ID )
            // InternalAnnotationsStores.g:203:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProposalStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposalStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getProposalStoreAccess().getCommaKeyword_3());
            		
            // InternalAnnotationsStores.g:223:3: ( (lv_scope_4_0= ruleScope ) )
            // InternalAnnotationsStores.g:224:4: (lv_scope_4_0= ruleScope )
            {
            // InternalAnnotationsStores.g:224:4: (lv_scope_4_0= ruleScope )
            // InternalAnnotationsStores.g:225:5: lv_scope_4_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getProposalStoreAccess().getScopeScopeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_scope_4_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposalStoreRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_4_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getProposalStoreAccess().getCommaKeyword_5());
            		
            // InternalAnnotationsStores.g:246:3: ( (lv_focus_6_0= ruleFocus ) )
            // InternalAnnotationsStores.g:247:4: (lv_focus_6_0= ruleFocus )
            {
            // InternalAnnotationsStores.g:247:4: (lv_focus_6_0= ruleFocus )
            // InternalAnnotationsStores.g:248:5: lv_focus_6_0= ruleFocus
            {

            					newCompositeNode(grammarAccess.getProposalStoreAccess().getFocusFocusParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_focus_6_0=ruleFocus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposalStoreRule());
            					}
            					set(
            						current,
            						"focus",
            						lv_focus_6_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Focus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getProposalStoreAccess().getCommaKeyword_7());
            		
            // InternalAnnotationsStores.g:269:3: ( (lv_content_8_0= RULE_STRING ) )
            // InternalAnnotationsStores.g:270:4: (lv_content_8_0= RULE_STRING )
            {
            // InternalAnnotationsStores.g:270:4: (lv_content_8_0= RULE_STRING )
            // InternalAnnotationsStores.g:271:5: lv_content_8_0= RULE_STRING
            {
            lv_content_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_content_8_0, grammarAccess.getProposalStoreAccess().getContentSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposalStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getProposalStoreAccess().getRightParenthesisKeyword_9());
            		
            // InternalAnnotationsStores.g:291:3: ( (lv_effect_10_0= ruleEffect ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAnnotationsStores.g:292:4: (lv_effect_10_0= ruleEffect )
                    {
                    // InternalAnnotationsStores.g:292:4: (lv_effect_10_0= ruleEffect )
                    // InternalAnnotationsStores.g:293:5: lv_effect_10_0= ruleEffect
                    {

                    					newCompositeNode(grammarAccess.getProposalStoreAccess().getEffectEffectParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_10_0=ruleEffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProposalStoreRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_10_0,
                    						"kcl.ac.uk.xtext.AnnotationsStores.Effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProposalStore"


    // $ANTLR start "entryRuleQuestionStore"
    // InternalAnnotationsStores.g:314:1: entryRuleQuestionStore returns [EObject current=null] : iv_ruleQuestionStore= ruleQuestionStore EOF ;
    public final EObject entryRuleQuestionStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionStore = null;


        try {
            // InternalAnnotationsStores.g:314:54: (iv_ruleQuestionStore= ruleQuestionStore EOF )
            // InternalAnnotationsStores.g:315:2: iv_ruleQuestionStore= ruleQuestionStore EOF
            {
             newCompositeNode(grammarAccess.getQuestionStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionStore=ruleQuestionStore();

            state._fsp--;

             current =iv_ruleQuestionStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionStore"


    // $ANTLR start "ruleQuestionStore"
    // InternalAnnotationsStores.g:321:1: ruleQuestionStore returns [EObject current=null] : (otherlv_0= 'questionElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) otherlv_5= ',' ( (lv_scope_6_0= ruleScope ) ) otherlv_7= ',' ( (lv_focus_8_0= ruleFocus ) ) otherlv_9= ',' ( (lv_content_10_0= RULE_STRING ) ) otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? ) ;
    public final EObject ruleQuestionStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_content_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_sender_4_0 = null;

        EObject lv_scope_6_0 = null;

        EObject lv_focus_8_0 = null;

        EObject lv_effect_12_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:327:2: ( (otherlv_0= 'questionElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) otherlv_5= ',' ( (lv_scope_6_0= ruleScope ) ) otherlv_7= ',' ( (lv_focus_8_0= ruleFocus ) ) otherlv_9= ',' ( (lv_content_10_0= RULE_STRING ) ) otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? ) )
            // InternalAnnotationsStores.g:328:2: (otherlv_0= 'questionElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) otherlv_5= ',' ( (lv_scope_6_0= ruleScope ) ) otherlv_7= ',' ( (lv_focus_8_0= ruleFocus ) ) otherlv_9= ',' ( (lv_content_10_0= RULE_STRING ) ) otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? )
            {
            // InternalAnnotationsStores.g:328:2: (otherlv_0= 'questionElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) otherlv_5= ',' ( (lv_scope_6_0= ruleScope ) ) otherlv_7= ',' ( (lv_focus_8_0= ruleFocus ) ) otherlv_9= ',' ( (lv_content_10_0= RULE_STRING ) ) otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? )
            // InternalAnnotationsStores.g:329:3: otherlv_0= 'questionElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) otherlv_5= ',' ( (lv_scope_6_0= ruleScope ) ) otherlv_7= ',' ( (lv_focus_8_0= ruleFocus ) ) otherlv_9= ',' ( (lv_content_10_0= RULE_STRING ) ) otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionStoreAccess().getQuestionElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionStoreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnnotationsStores.g:337:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnnotationsStores.g:338:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:338:4: (lv_name_2_0= RULE_ID )
            // InternalAnnotationsStores.g:339:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQuestionStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionStoreAccess().getCommaKeyword_3());
            		
            // InternalAnnotationsStores.g:359:3: ( (lv_sender_4_0= ruleSender ) )
            // InternalAnnotationsStores.g:360:4: (lv_sender_4_0= ruleSender )
            {
            // InternalAnnotationsStores.g:360:4: (lv_sender_4_0= ruleSender )
            // InternalAnnotationsStores.g:361:5: lv_sender_4_0= ruleSender
            {

            					newCompositeNode(grammarAccess.getQuestionStoreAccess().getSenderSenderParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_sender_4_0=ruleSender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionStoreRule());
            					}
            					set(
            						current,
            						"sender",
            						lv_sender_4_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Sender");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestionStoreAccess().getCommaKeyword_5());
            		
            // InternalAnnotationsStores.g:382:3: ( (lv_scope_6_0= ruleScope ) )
            // InternalAnnotationsStores.g:383:4: (lv_scope_6_0= ruleScope )
            {
            // InternalAnnotationsStores.g:383:4: (lv_scope_6_0= ruleScope )
            // InternalAnnotationsStores.g:384:5: lv_scope_6_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getQuestionStoreAccess().getScopeScopeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_scope_6_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionStoreRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_6_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionStoreAccess().getCommaKeyword_7());
            		
            // InternalAnnotationsStores.g:405:3: ( (lv_focus_8_0= ruleFocus ) )
            // InternalAnnotationsStores.g:406:4: (lv_focus_8_0= ruleFocus )
            {
            // InternalAnnotationsStores.g:406:4: (lv_focus_8_0= ruleFocus )
            // InternalAnnotationsStores.g:407:5: lv_focus_8_0= ruleFocus
            {

            					newCompositeNode(grammarAccess.getQuestionStoreAccess().getFocusFocusParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_focus_8_0=ruleFocus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionStoreRule());
            					}
            					set(
            						current,
            						"focus",
            						lv_focus_8_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Focus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getQuestionStoreAccess().getCommaKeyword_9());
            		
            // InternalAnnotationsStores.g:428:3: ( (lv_content_10_0= RULE_STRING ) )
            // InternalAnnotationsStores.g:429:4: (lv_content_10_0= RULE_STRING )
            {
            // InternalAnnotationsStores.g:429:4: (lv_content_10_0= RULE_STRING )
            // InternalAnnotationsStores.g:430:5: lv_content_10_0= RULE_STRING
            {
            lv_content_10_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_content_10_0, grammarAccess.getQuestionStoreAccess().getContentSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getQuestionStoreAccess().getRightParenthesisKeyword_11());
            		
            // InternalAnnotationsStores.g:450:3: ( (lv_effect_12_0= ruleEffect ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnnotationsStores.g:451:4: (lv_effect_12_0= ruleEffect )
                    {
                    // InternalAnnotationsStores.g:451:4: (lv_effect_12_0= ruleEffect )
                    // InternalAnnotationsStores.g:452:5: lv_effect_12_0= ruleEffect
                    {

                    					newCompositeNode(grammarAccess.getQuestionStoreAccess().getEffectEffectParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_12_0=ruleEffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionStoreRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_12_0,
                    						"kcl.ac.uk.xtext.AnnotationsStores.Effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionStore"


    // $ANTLR start "entryRuleChallengeStore"
    // InternalAnnotationsStores.g:473:1: entryRuleChallengeStore returns [EObject current=null] : iv_ruleChallengeStore= ruleChallengeStore EOF ;
    public final EObject entryRuleChallengeStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChallengeStore = null;


        try {
            // InternalAnnotationsStores.g:473:55: (iv_ruleChallengeStore= ruleChallengeStore EOF )
            // InternalAnnotationsStores.g:474:2: iv_ruleChallengeStore= ruleChallengeStore EOF
            {
             newCompositeNode(grammarAccess.getChallengeStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChallengeStore=ruleChallengeStore();

            state._fsp--;

             current =iv_ruleChallengeStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChallengeStore"


    // $ANTLR start "ruleChallengeStore"
    // InternalAnnotationsStores.g:480:1: ruleChallengeStore returns [EObject current=null] : (otherlv_0= 'challengeElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )? otherlv_7= ')' ( (lv_effect_8_0= ruleEffect ) )? ) ;
    public final EObject ruleChallengeStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_target_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_sender_4_0 = null;

        EObject lv_effect_8_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:486:2: ( (otherlv_0= 'challengeElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )? otherlv_7= ')' ( (lv_effect_8_0= ruleEffect ) )? ) )
            // InternalAnnotationsStores.g:487:2: (otherlv_0= 'challengeElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )? otherlv_7= ')' ( (lv_effect_8_0= ruleEffect ) )? )
            {
            // InternalAnnotationsStores.g:487:2: (otherlv_0= 'challengeElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )? otherlv_7= ')' ( (lv_effect_8_0= ruleEffect ) )? )
            // InternalAnnotationsStores.g:488:3: otherlv_0= 'challengeElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_sender_4_0= ruleSender ) ) (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )? otherlv_7= ')' ( (lv_effect_8_0= ruleEffect ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getChallengeStoreAccess().getChallengeElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChallengeStoreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnnotationsStores.g:496:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnnotationsStores.g:497:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:497:4: (lv_name_2_0= RULE_ID )
            // InternalAnnotationsStores.g:498:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getChallengeStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChallengeStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getChallengeStoreAccess().getCommaKeyword_3());
            		
            // InternalAnnotationsStores.g:518:3: ( (lv_sender_4_0= ruleSender ) )
            // InternalAnnotationsStores.g:519:4: (lv_sender_4_0= ruleSender )
            {
            // InternalAnnotationsStores.g:519:4: (lv_sender_4_0= ruleSender )
            // InternalAnnotationsStores.g:520:5: lv_sender_4_0= ruleSender
            {

            					newCompositeNode(grammarAccess.getChallengeStoreAccess().getSenderSenderParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_sender_4_0=ruleSender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChallengeStoreRule());
            					}
            					set(
            						current,
            						"sender",
            						lv_sender_4_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Sender");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnnotationsStores.g:537:3: (otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAnnotationsStores.g:538:4: otherlv_5= ',' ( (lv_target_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getChallengeStoreAccess().getCommaKeyword_5_0());
                    			
                    // InternalAnnotationsStores.g:542:4: ( (lv_target_6_0= RULE_ID ) )
                    // InternalAnnotationsStores.g:543:5: (lv_target_6_0= RULE_ID )
                    {
                    // InternalAnnotationsStores.g:543:5: (lv_target_6_0= RULE_ID )
                    // InternalAnnotationsStores.g:544:6: lv_target_6_0= RULE_ID
                    {
                    lv_target_6_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_target_6_0, grammarAccess.getChallengeStoreAccess().getTargetIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChallengeStoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getChallengeStoreAccess().getRightParenthesisKeyword_6());
            		
            // InternalAnnotationsStores.g:565:3: ( (lv_effect_8_0= ruleEffect ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnnotationsStores.g:566:4: (lv_effect_8_0= ruleEffect )
                    {
                    // InternalAnnotationsStores.g:566:4: (lv_effect_8_0= ruleEffect )
                    // InternalAnnotationsStores.g:567:5: lv_effect_8_0= ruleEffect
                    {

                    					newCompositeNode(grammarAccess.getChallengeStoreAccess().getEffectEffectParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_8_0=ruleEffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChallengeStoreRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_8_0,
                    						"kcl.ac.uk.xtext.AnnotationsStores.Effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChallengeStore"


    // $ANTLR start "entryRuleCommitmentStore"
    // InternalAnnotationsStores.g:588:1: entryRuleCommitmentStore returns [EObject current=null] : iv_ruleCommitmentStore= ruleCommitmentStore EOF ;
    public final EObject entryRuleCommitmentStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommitmentStore = null;


        try {
            // InternalAnnotationsStores.g:588:56: (iv_ruleCommitmentStore= ruleCommitmentStore EOF )
            // InternalAnnotationsStores.g:589:2: iv_ruleCommitmentStore= ruleCommitmentStore EOF
            {
             newCompositeNode(grammarAccess.getCommitmentStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommitmentStore=ruleCommitmentStore();

            state._fsp--;

             current =iv_ruleCommitmentStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommitmentStore"


    // $ANTLR start "ruleCommitmentStore"
    // InternalAnnotationsStores.g:595:1: ruleCommitmentStore returns [EObject current=null] : (otherlv_0= 'commitmentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? ) ;
    public final EObject ruleCommitmentStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_content_8_0=null;
        Token otherlv_9=null;
        EObject lv_scope_4_0 = null;

        EObject lv_focus_6_0 = null;

        EObject lv_effect_10_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:601:2: ( (otherlv_0= 'commitmentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? ) )
            // InternalAnnotationsStores.g:602:2: (otherlv_0= 'commitmentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? )
            {
            // InternalAnnotationsStores.g:602:2: (otherlv_0= 'commitmentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )? )
            // InternalAnnotationsStores.g:603:3: otherlv_0= 'commitmentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= ')' ( (lv_effect_10_0= ruleEffect ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCommitmentStoreAccess().getCommitmentElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCommitmentStoreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnnotationsStores.g:611:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnnotationsStores.g:612:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:612:4: (lv_name_2_0= RULE_ID )
            // InternalAnnotationsStores.g:613:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommitmentStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommitmentStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getCommitmentStoreAccess().getCommaKeyword_3());
            		
            // InternalAnnotationsStores.g:633:3: ( (lv_scope_4_0= ruleScope ) )
            // InternalAnnotationsStores.g:634:4: (lv_scope_4_0= ruleScope )
            {
            // InternalAnnotationsStores.g:634:4: (lv_scope_4_0= ruleScope )
            // InternalAnnotationsStores.g:635:5: lv_scope_4_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getCommitmentStoreAccess().getScopeScopeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_scope_4_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommitmentStoreRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_4_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCommitmentStoreAccess().getCommaKeyword_5());
            		
            // InternalAnnotationsStores.g:656:3: ( (lv_focus_6_0= ruleFocus ) )
            // InternalAnnotationsStores.g:657:4: (lv_focus_6_0= ruleFocus )
            {
            // InternalAnnotationsStores.g:657:4: (lv_focus_6_0= ruleFocus )
            // InternalAnnotationsStores.g:658:5: lv_focus_6_0= ruleFocus
            {

            					newCompositeNode(grammarAccess.getCommitmentStoreAccess().getFocusFocusParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_focus_6_0=ruleFocus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommitmentStoreRule());
            					}
            					set(
            						current,
            						"focus",
            						lv_focus_6_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Focus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getCommitmentStoreAccess().getCommaKeyword_7());
            		
            // InternalAnnotationsStores.g:679:3: ( (lv_content_8_0= RULE_STRING ) )
            // InternalAnnotationsStores.g:680:4: (lv_content_8_0= RULE_STRING )
            {
            // InternalAnnotationsStores.g:680:4: (lv_content_8_0= RULE_STRING )
            // InternalAnnotationsStores.g:681:5: lv_content_8_0= RULE_STRING
            {
            lv_content_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_content_8_0, grammarAccess.getCommitmentStoreAccess().getContentSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommitmentStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getCommitmentStoreAccess().getRightParenthesisKeyword_9());
            		
            // InternalAnnotationsStores.g:701:3: ( (lv_effect_10_0= ruleEffect ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnnotationsStores.g:702:4: (lv_effect_10_0= ruleEffect )
                    {
                    // InternalAnnotationsStores.g:702:4: (lv_effect_10_0= ruleEffect )
                    // InternalAnnotationsStores.g:703:5: lv_effect_10_0= ruleEffect
                    {

                    					newCompositeNode(grammarAccess.getCommitmentStoreAccess().getEffectEffectParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_10_0=ruleEffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommitmentStoreRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_10_0,
                    						"kcl.ac.uk.xtext.AnnotationsStores.Effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommitmentStore"


    // $ANTLR start "entryRuleArgumentStore"
    // InternalAnnotationsStores.g:724:1: entryRuleArgumentStore returns [EObject current=null] : iv_ruleArgumentStore= ruleArgumentStore EOF ;
    public final EObject entryRuleArgumentStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentStore = null;


        try {
            // InternalAnnotationsStores.g:724:54: (iv_ruleArgumentStore= ruleArgumentStore EOF )
            // InternalAnnotationsStores.g:725:2: iv_ruleArgumentStore= ruleArgumentStore EOF
            {
             newCompositeNode(grammarAccess.getArgumentStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentStore=ruleArgumentStore();

            state._fsp--;

             current =iv_ruleArgumentStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentStore"


    // $ANTLR start "ruleArgumentStore"
    // InternalAnnotationsStores.g:731:1: ruleArgumentStore returns [EObject current=null] : (otherlv_0= 'argumentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )? otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? ) ;
    public final EObject ruleArgumentStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_content_8_0=null;
        Token otherlv_9=null;
        Token lv_target_10_0=null;
        Token otherlv_11=null;
        EObject lv_scope_4_0 = null;

        EObject lv_focus_6_0 = null;

        EObject lv_effect_12_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsStores.g:737:2: ( (otherlv_0= 'argumentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )? otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? ) )
            // InternalAnnotationsStores.g:738:2: (otherlv_0= 'argumentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )? otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? )
            {
            // InternalAnnotationsStores.g:738:2: (otherlv_0= 'argumentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )? otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )? )
            // InternalAnnotationsStores.g:739:3: otherlv_0= 'argumentElement' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_scope_4_0= ruleScope ) ) otherlv_5= ',' ( (lv_focus_6_0= ruleFocus ) ) otherlv_7= ',' ( (lv_content_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )? otherlv_11= ')' ( (lv_effect_12_0= ruleEffect ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentStoreAccess().getArgumentElementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentStoreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAnnotationsStores.g:747:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnnotationsStores.g:748:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:748:4: (lv_name_2_0= RULE_ID )
            // InternalAnnotationsStores.g:749:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getArgumentStoreAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getArgumentStoreAccess().getCommaKeyword_3());
            		
            // InternalAnnotationsStores.g:769:3: ( (lv_scope_4_0= ruleScope ) )
            // InternalAnnotationsStores.g:770:4: (lv_scope_4_0= ruleScope )
            {
            // InternalAnnotationsStores.g:770:4: (lv_scope_4_0= ruleScope )
            // InternalAnnotationsStores.g:771:5: lv_scope_4_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getArgumentStoreAccess().getScopeScopeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_scope_4_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentStoreRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_4_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getArgumentStoreAccess().getCommaKeyword_5());
            		
            // InternalAnnotationsStores.g:792:3: ( (lv_focus_6_0= ruleFocus ) )
            // InternalAnnotationsStores.g:793:4: (lv_focus_6_0= ruleFocus )
            {
            // InternalAnnotationsStores.g:793:4: (lv_focus_6_0= ruleFocus )
            // InternalAnnotationsStores.g:794:5: lv_focus_6_0= ruleFocus
            {

            					newCompositeNode(grammarAccess.getArgumentStoreAccess().getFocusFocusParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_focus_6_0=ruleFocus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentStoreRule());
            					}
            					set(
            						current,
            						"focus",
            						lv_focus_6_0,
            						"kcl.ac.uk.xtext.AnnotationsStores.Focus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getArgumentStoreAccess().getCommaKeyword_7());
            		
            // InternalAnnotationsStores.g:815:3: ( (lv_content_8_0= RULE_STRING ) )
            // InternalAnnotationsStores.g:816:4: (lv_content_8_0= RULE_STRING )
            {
            // InternalAnnotationsStores.g:816:4: (lv_content_8_0= RULE_STRING )
            // InternalAnnotationsStores.g:817:5: lv_content_8_0= RULE_STRING
            {
            lv_content_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_content_8_0, grammarAccess.getArgumentStoreAccess().getContentSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAnnotationsStores.g:833:3: (otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAnnotationsStores.g:834:4: otherlv_9= ',' ( (lv_target_10_0= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getArgumentStoreAccess().getCommaKeyword_9_0());
                    			
                    // InternalAnnotationsStores.g:838:4: ( (lv_target_10_0= RULE_ID ) )
                    // InternalAnnotationsStores.g:839:5: (lv_target_10_0= RULE_ID )
                    {
                    // InternalAnnotationsStores.g:839:5: (lv_target_10_0= RULE_ID )
                    // InternalAnnotationsStores.g:840:6: lv_target_10_0= RULE_ID
                    {
                    lv_target_10_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_target_10_0, grammarAccess.getArgumentStoreAccess().getTargetIDTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArgumentStoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getArgumentStoreAccess().getRightParenthesisKeyword_10());
            		
            // InternalAnnotationsStores.g:861:3: ( (lv_effect_12_0= ruleEffect ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnnotationsStores.g:862:4: (lv_effect_12_0= ruleEffect )
                    {
                    // InternalAnnotationsStores.g:862:4: (lv_effect_12_0= ruleEffect )
                    // InternalAnnotationsStores.g:863:5: lv_effect_12_0= ruleEffect
                    {

                    					newCompositeNode(grammarAccess.getArgumentStoreAccess().getEffectEffectParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_effect_12_0=ruleEffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArgumentStoreRule());
                    					}
                    					set(
                    						current,
                    						"effect",
                    						lv_effect_12_0,
                    						"kcl.ac.uk.xtext.AnnotationsStores.Effect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentStore"


    // $ANTLR start "entryRuleScope"
    // InternalAnnotationsStores.g:884:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalAnnotationsStores.g:884:46: (iv_ruleScope= ruleScope EOF )
            // InternalAnnotationsStores.g:885:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAnnotationsStores.g:891:1: ruleScope returns [EObject current=null] : ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_scope_0_1=null;
        Token lv_scope_0_2=null;
        Token lv_scope_0_3=null;
        Token lv_scope_0_4=null;


        	enterRule();

        try {
            // InternalAnnotationsStores.g:897:2: ( ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) ) )
            // InternalAnnotationsStores.g:898:2: ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) )
            {
            // InternalAnnotationsStores.g:898:2: ( ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) ) )
            // InternalAnnotationsStores.g:899:3: ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) )
            {
            // InternalAnnotationsStores.g:899:3: ( (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' ) )
            // InternalAnnotationsStores.g:900:4: (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' )
            {
            // InternalAnnotationsStores.g:900:4: (lv_scope_0_1= 'feature' | lv_scope_0_2= 'rating' | lv_scope_0_3= 'criteria' | lv_scope_0_4= 'topic' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAnnotationsStores.g:901:5: lv_scope_0_1= 'feature'
                    {
                    lv_scope_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_1, grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:912:5: lv_scope_0_2= 'rating'
                    {
                    lv_scope_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_2, grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:923:5: lv_scope_0_3= 'criteria'
                    {
                    lv_scope_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_3, grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:934:5: lv_scope_0_4= 'topic'
                    {
                    lv_scope_0_4=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_scope_0_4, grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(current, "scope", lv_scope_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleFocus"
    // InternalAnnotationsStores.g:950:1: entryRuleFocus returns [EObject current=null] : iv_ruleFocus= ruleFocus EOF ;
    public final EObject entryRuleFocus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocus = null;


        try {
            // InternalAnnotationsStores.g:950:46: (iv_ruleFocus= ruleFocus EOF )
            // InternalAnnotationsStores.g:951:2: iv_ruleFocus= ruleFocus EOF
            {
             newCompositeNode(grammarAccess.getFocusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFocus=ruleFocus();

            state._fsp--;

             current =iv_ruleFocus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFocus"


    // $ANTLR start "ruleFocus"
    // InternalAnnotationsStores.g:957:1: ruleFocus returns [EObject current=null] : ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) ) ;
    public final EObject ruleFocus() throws RecognitionException {
        EObject current = null;

        Token lv_focus_0_1=null;
        Token lv_focus_0_2=null;
        Token lv_focus_0_3=null;
        Token lv_focus_0_4=null;
        Token lv_focus_0_5=null;


        	enterRule();

        try {
            // InternalAnnotationsStores.g:963:2: ( ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) ) )
            // InternalAnnotationsStores.g:964:2: ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) )
            {
            // InternalAnnotationsStores.g:964:2: ( ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) ) )
            // InternalAnnotationsStores.g:965:3: ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) )
            {
            // InternalAnnotationsStores.g:965:3: ( (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' ) )
            // InternalAnnotationsStores.g:966:4: (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' )
            {
            // InternalAnnotationsStores.g:966:4: (lv_focus_0_1= 'R' | lv_focus_0_2= 'S' | lv_focus_0_3= 'G' | lv_focus_0_4= 'V' | lv_focus_0_5= 'A' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAnnotationsStores.g:967:5: lv_focus_0_1= 'R'
                    {
                    lv_focus_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_1, grammarAccess.getFocusAccess().getFocusRKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:978:5: lv_focus_0_2= 'S'
                    {
                    lv_focus_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_2, grammarAccess.getFocusAccess().getFocusSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:989:5: lv_focus_0_3= 'G'
                    {
                    lv_focus_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_3, grammarAccess.getFocusAccess().getFocusGKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:1000:5: lv_focus_0_4= 'V'
                    {
                    lv_focus_0_4=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_4, grammarAccess.getFocusAccess().getFocusVKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalAnnotationsStores.g:1011:5: lv_focus_0_5= 'A'
                    {
                    lv_focus_0_5=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_focus_0_5, grammarAccess.getFocusAccess().getFocusAKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFocusRule());
                    					}
                    					setWithLastConsumed(current, "focus", lv_focus_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFocus"


    // $ANTLR start "entryRuleSender"
    // InternalAnnotationsStores.g:1027:1: entryRuleSender returns [String current=null] : iv_ruleSender= ruleSender EOF ;
    public final String entryRuleSender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSender = null;


        try {
            // InternalAnnotationsStores.g:1027:46: (iv_ruleSender= ruleSender EOF )
            // InternalAnnotationsStores.g:1028:2: iv_ruleSender= ruleSender EOF
            {
             newCompositeNode(grammarAccess.getSenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSender=ruleSender();

            state._fsp--;

             current =iv_ruleSender.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSender"


    // $ANTLR start "ruleSender"
    // InternalAnnotationsStores.g:1034:1: ruleSender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleSender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAnnotationsStores.g:1040:2: ( (this_INT_0= RULE_INT )+ )
            // InternalAnnotationsStores.g:1041:2: (this_INT_0= RULE_INT )+
            {
            // InternalAnnotationsStores.g:1041:2: (this_INT_0= RULE_INT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAnnotationsStores.g:1042:3: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    			current.merge(this_INT_0);
            	    		

            	    			newLeafNode(this_INT_0, grammarAccess.getSenderAccess().getINTTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSender"


    // $ANTLR start "entryRuleEffect"
    // InternalAnnotationsStores.g:1053:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalAnnotationsStores.g:1053:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalAnnotationsStores.g:1054:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalAnnotationsStores.g:1060:1: ruleEffect returns [EObject current=null] : ( (lv_affectedBy_0_0= RULE_ID ) ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token lv_affectedBy_0_0=null;


        	enterRule();

        try {
            // InternalAnnotationsStores.g:1066:2: ( ( (lv_affectedBy_0_0= RULE_ID ) ) )
            // InternalAnnotationsStores.g:1067:2: ( (lv_affectedBy_0_0= RULE_ID ) )
            {
            // InternalAnnotationsStores.g:1067:2: ( (lv_affectedBy_0_0= RULE_ID ) )
            // InternalAnnotationsStores.g:1068:3: (lv_affectedBy_0_0= RULE_ID )
            {
            // InternalAnnotationsStores.g:1068:3: (lv_affectedBy_0_0= RULE_ID )
            // InternalAnnotationsStores.g:1069:4: lv_affectedBy_0_0= RULE_ID
            {
            lv_affectedBy_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_affectedBy_0_0, grammarAccess.getEffectAccess().getAffectedByIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEffectRule());
            				}
            				setWithLastConsumed(
            					current,
            					"affectedBy",
            					lv_affectedBy_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});

}
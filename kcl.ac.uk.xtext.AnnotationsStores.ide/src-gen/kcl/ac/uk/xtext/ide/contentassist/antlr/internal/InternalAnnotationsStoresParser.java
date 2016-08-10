package kcl.ac.uk.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import kcl.ac.uk.xtext.services.AnnotationsStoresGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsStoresParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature'", "'rating'", "'criteria'", "'topic'", "'R'", "'S'", "'G'", "'V'", "'A'", "'proposalElement'", "'('", "','", "')'", "'questionElement'", "'challengeElement'", "'commitmentElement'", "'argumentElement'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(AnnotationsStoresGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAnnotationStores"
    // InternalAnnotationsStores.g:53:1: entryRuleAnnotationStores : ruleAnnotationStores EOF ;
    public final void entryRuleAnnotationStores() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:54:1: ( ruleAnnotationStores EOF )
            // InternalAnnotationsStores.g:55:1: ruleAnnotationStores EOF
            {
             before(grammarAccess.getAnnotationStoresRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationStores();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotationStores"


    // $ANTLR start "ruleAnnotationStores"
    // InternalAnnotationsStores.g:62:1: ruleAnnotationStores : ( ( rule__AnnotationStores__Group__0 ) ) ;
    public final void ruleAnnotationStores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:66:2: ( ( ( rule__AnnotationStores__Group__0 ) ) )
            // InternalAnnotationsStores.g:67:2: ( ( rule__AnnotationStores__Group__0 ) )
            {
            // InternalAnnotationsStores.g:67:2: ( ( rule__AnnotationStores__Group__0 ) )
            // InternalAnnotationsStores.g:68:3: ( rule__AnnotationStores__Group__0 )
            {
             before(grammarAccess.getAnnotationStoresAccess().getGroup()); 
            // InternalAnnotationsStores.g:69:3: ( rule__AnnotationStores__Group__0 )
            // InternalAnnotationsStores.g:69:4: rule__AnnotationStores__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationStoresAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationStores"


    // $ANTLR start "entryRuleProposalStore"
    // InternalAnnotationsStores.g:78:1: entryRuleProposalStore : ruleProposalStore EOF ;
    public final void entryRuleProposalStore() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:79:1: ( ruleProposalStore EOF )
            // InternalAnnotationsStores.g:80:1: ruleProposalStore EOF
            {
             before(grammarAccess.getProposalStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleProposalStore();

            state._fsp--;

             after(grammarAccess.getProposalStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProposalStore"


    // $ANTLR start "ruleProposalStore"
    // InternalAnnotationsStores.g:87:1: ruleProposalStore : ( ( rule__ProposalStore__Group__0 ) ) ;
    public final void ruleProposalStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:91:2: ( ( ( rule__ProposalStore__Group__0 ) ) )
            // InternalAnnotationsStores.g:92:2: ( ( rule__ProposalStore__Group__0 ) )
            {
            // InternalAnnotationsStores.g:92:2: ( ( rule__ProposalStore__Group__0 ) )
            // InternalAnnotationsStores.g:93:3: ( rule__ProposalStore__Group__0 )
            {
             before(grammarAccess.getProposalStoreAccess().getGroup()); 
            // InternalAnnotationsStores.g:94:3: ( rule__ProposalStore__Group__0 )
            // InternalAnnotationsStores.g:94:4: rule__ProposalStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProposalStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProposalStore"


    // $ANTLR start "entryRuleQuestionStore"
    // InternalAnnotationsStores.g:103:1: entryRuleQuestionStore : ruleQuestionStore EOF ;
    public final void entryRuleQuestionStore() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:104:1: ( ruleQuestionStore EOF )
            // InternalAnnotationsStores.g:105:1: ruleQuestionStore EOF
            {
             before(grammarAccess.getQuestionStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionStore();

            state._fsp--;

             after(grammarAccess.getQuestionStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionStore"


    // $ANTLR start "ruleQuestionStore"
    // InternalAnnotationsStores.g:112:1: ruleQuestionStore : ( ( rule__QuestionStore__Group__0 ) ) ;
    public final void ruleQuestionStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:116:2: ( ( ( rule__QuestionStore__Group__0 ) ) )
            // InternalAnnotationsStores.g:117:2: ( ( rule__QuestionStore__Group__0 ) )
            {
            // InternalAnnotationsStores.g:117:2: ( ( rule__QuestionStore__Group__0 ) )
            // InternalAnnotationsStores.g:118:3: ( rule__QuestionStore__Group__0 )
            {
             before(grammarAccess.getQuestionStoreAccess().getGroup()); 
            // InternalAnnotationsStores.g:119:3: ( rule__QuestionStore__Group__0 )
            // InternalAnnotationsStores.g:119:4: rule__QuestionStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionStore"


    // $ANTLR start "entryRuleChallengeStore"
    // InternalAnnotationsStores.g:128:1: entryRuleChallengeStore : ruleChallengeStore EOF ;
    public final void entryRuleChallengeStore() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:129:1: ( ruleChallengeStore EOF )
            // InternalAnnotationsStores.g:130:1: ruleChallengeStore EOF
            {
             before(grammarAccess.getChallengeStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleChallengeStore();

            state._fsp--;

             after(grammarAccess.getChallengeStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChallengeStore"


    // $ANTLR start "ruleChallengeStore"
    // InternalAnnotationsStores.g:137:1: ruleChallengeStore : ( ( rule__ChallengeStore__Group__0 ) ) ;
    public final void ruleChallengeStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:141:2: ( ( ( rule__ChallengeStore__Group__0 ) ) )
            // InternalAnnotationsStores.g:142:2: ( ( rule__ChallengeStore__Group__0 ) )
            {
            // InternalAnnotationsStores.g:142:2: ( ( rule__ChallengeStore__Group__0 ) )
            // InternalAnnotationsStores.g:143:3: ( rule__ChallengeStore__Group__0 )
            {
             before(grammarAccess.getChallengeStoreAccess().getGroup()); 
            // InternalAnnotationsStores.g:144:3: ( rule__ChallengeStore__Group__0 )
            // InternalAnnotationsStores.g:144:4: rule__ChallengeStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChallengeStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChallengeStore"


    // $ANTLR start "entryRuleCommitmentStore"
    // InternalAnnotationsStores.g:153:1: entryRuleCommitmentStore : ruleCommitmentStore EOF ;
    public final void entryRuleCommitmentStore() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:154:1: ( ruleCommitmentStore EOF )
            // InternalAnnotationsStores.g:155:1: ruleCommitmentStore EOF
            {
             before(grammarAccess.getCommitmentStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleCommitmentStore();

            state._fsp--;

             after(grammarAccess.getCommitmentStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommitmentStore"


    // $ANTLR start "ruleCommitmentStore"
    // InternalAnnotationsStores.g:162:1: ruleCommitmentStore : ( ( rule__CommitmentStore__Group__0 ) ) ;
    public final void ruleCommitmentStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:166:2: ( ( ( rule__CommitmentStore__Group__0 ) ) )
            // InternalAnnotationsStores.g:167:2: ( ( rule__CommitmentStore__Group__0 ) )
            {
            // InternalAnnotationsStores.g:167:2: ( ( rule__CommitmentStore__Group__0 ) )
            // InternalAnnotationsStores.g:168:3: ( rule__CommitmentStore__Group__0 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getGroup()); 
            // InternalAnnotationsStores.g:169:3: ( rule__CommitmentStore__Group__0 )
            // InternalAnnotationsStores.g:169:4: rule__CommitmentStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommitmentStore"


    // $ANTLR start "entryRuleArgumentStore"
    // InternalAnnotationsStores.g:178:1: entryRuleArgumentStore : ruleArgumentStore EOF ;
    public final void entryRuleArgumentStore() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:179:1: ( ruleArgumentStore EOF )
            // InternalAnnotationsStores.g:180:1: ruleArgumentStore EOF
            {
             before(grammarAccess.getArgumentStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleArgumentStore();

            state._fsp--;

             after(grammarAccess.getArgumentStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgumentStore"


    // $ANTLR start "ruleArgumentStore"
    // InternalAnnotationsStores.g:187:1: ruleArgumentStore : ( ( rule__ArgumentStore__Group__0 ) ) ;
    public final void ruleArgumentStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:191:2: ( ( ( rule__ArgumentStore__Group__0 ) ) )
            // InternalAnnotationsStores.g:192:2: ( ( rule__ArgumentStore__Group__0 ) )
            {
            // InternalAnnotationsStores.g:192:2: ( ( rule__ArgumentStore__Group__0 ) )
            // InternalAnnotationsStores.g:193:3: ( rule__ArgumentStore__Group__0 )
            {
             before(grammarAccess.getArgumentStoreAccess().getGroup()); 
            // InternalAnnotationsStores.g:194:3: ( rule__ArgumentStore__Group__0 )
            // InternalAnnotationsStores.g:194:4: rule__ArgumentStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentStore"


    // $ANTLR start "entryRuleScope"
    // InternalAnnotationsStores.g:203:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:204:1: ( ruleScope EOF )
            // InternalAnnotationsStores.g:205:1: ruleScope EOF
            {
             before(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getScopeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAnnotationsStores.g:212:1: ruleScope : ( ( rule__Scope__ScopeAssignment ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:216:2: ( ( ( rule__Scope__ScopeAssignment ) ) )
            // InternalAnnotationsStores.g:217:2: ( ( rule__Scope__ScopeAssignment ) )
            {
            // InternalAnnotationsStores.g:217:2: ( ( rule__Scope__ScopeAssignment ) )
            // InternalAnnotationsStores.g:218:3: ( rule__Scope__ScopeAssignment )
            {
             before(grammarAccess.getScopeAccess().getScopeAssignment()); 
            // InternalAnnotationsStores.g:219:3: ( rule__Scope__ScopeAssignment )
            // InternalAnnotationsStores.g:219:4: rule__Scope__ScopeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Scope__ScopeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getScopeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleFocus"
    // InternalAnnotationsStores.g:228:1: entryRuleFocus : ruleFocus EOF ;
    public final void entryRuleFocus() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:229:1: ( ruleFocus EOF )
            // InternalAnnotationsStores.g:230:1: ruleFocus EOF
            {
             before(grammarAccess.getFocusRule()); 
            pushFollow(FOLLOW_1);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getFocusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFocus"


    // $ANTLR start "ruleFocus"
    // InternalAnnotationsStores.g:237:1: ruleFocus : ( ( rule__Focus__FocusAssignment ) ) ;
    public final void ruleFocus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:241:2: ( ( ( rule__Focus__FocusAssignment ) ) )
            // InternalAnnotationsStores.g:242:2: ( ( rule__Focus__FocusAssignment ) )
            {
            // InternalAnnotationsStores.g:242:2: ( ( rule__Focus__FocusAssignment ) )
            // InternalAnnotationsStores.g:243:3: ( rule__Focus__FocusAssignment )
            {
             before(grammarAccess.getFocusAccess().getFocusAssignment()); 
            // InternalAnnotationsStores.g:244:3: ( rule__Focus__FocusAssignment )
            // InternalAnnotationsStores.g:244:4: rule__Focus__FocusAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Focus__FocusAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFocusAccess().getFocusAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFocus"


    // $ANTLR start "entryRuleSender"
    // InternalAnnotationsStores.g:253:1: entryRuleSender : ruleSender EOF ;
    public final void entryRuleSender() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:254:1: ( ruleSender EOF )
            // InternalAnnotationsStores.g:255:1: ruleSender EOF
            {
             before(grammarAccess.getSenderRule()); 
            pushFollow(FOLLOW_1);
            ruleSender();

            state._fsp--;

             after(grammarAccess.getSenderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSender"


    // $ANTLR start "ruleSender"
    // InternalAnnotationsStores.g:262:1: ruleSender : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void ruleSender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:266:2: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalAnnotationsStores.g:267:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalAnnotationsStores.g:267:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalAnnotationsStores.g:268:3: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalAnnotationsStores.g:268:3: ( ( RULE_INT ) )
            // InternalAnnotationsStores.g:269:4: ( RULE_INT )
            {
             before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 
            // InternalAnnotationsStores.g:270:4: ( RULE_INT )
            // InternalAnnotationsStores.g:270:5: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_3); 

            }

             after(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 

            }

            // InternalAnnotationsStores.g:273:3: ( ( RULE_INT )* )
            // InternalAnnotationsStores.g:274:4: ( RULE_INT )*
            {
             before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 
            // InternalAnnotationsStores.g:275:4: ( RULE_INT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnnotationsStores.g:275:5: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSender"


    // $ANTLR start "rule__Scope__ScopeAlternatives_0"
    // InternalAnnotationsStores.g:284:1: rule__Scope__ScopeAlternatives_0 : ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) );
    public final void rule__Scope__ScopeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:288:1: ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnnotationsStores.g:289:2: ( 'feature' )
                    {
                    // InternalAnnotationsStores.g:289:2: ( 'feature' )
                    // InternalAnnotationsStores.g:290:3: 'feature'
                    {
                     before(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:295:2: ( 'rating' )
                    {
                    // InternalAnnotationsStores.g:295:2: ( 'rating' )
                    // InternalAnnotationsStores.g:296:3: 'rating'
                    {
                     before(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:301:2: ( 'criteria' )
                    {
                    // InternalAnnotationsStores.g:301:2: ( 'criteria' )
                    // InternalAnnotationsStores.g:302:3: 'criteria'
                    {
                     before(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:307:2: ( 'topic' )
                    {
                    // InternalAnnotationsStores.g:307:2: ( 'topic' )
                    // InternalAnnotationsStores.g:308:3: 'topic'
                    {
                     before(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__ScopeAlternatives_0"


    // $ANTLR start "rule__Focus__FocusAlternatives_0"
    // InternalAnnotationsStores.g:317:1: rule__Focus__FocusAlternatives_0 : ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) );
    public final void rule__Focus__FocusAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:321:1: ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnnotationsStores.g:322:2: ( 'R' )
                    {
                    // InternalAnnotationsStores.g:322:2: ( 'R' )
                    // InternalAnnotationsStores.g:323:3: 'R'
                    {
                     before(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:328:2: ( 'S' )
                    {
                    // InternalAnnotationsStores.g:328:2: ( 'S' )
                    // InternalAnnotationsStores.g:329:3: 'S'
                    {
                     before(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:334:2: ( 'G' )
                    {
                    // InternalAnnotationsStores.g:334:2: ( 'G' )
                    // InternalAnnotationsStores.g:335:3: 'G'
                    {
                     before(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:340:2: ( 'V' )
                    {
                    // InternalAnnotationsStores.g:340:2: ( 'V' )
                    // InternalAnnotationsStores.g:341:3: 'V'
                    {
                     before(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnnotationsStores.g:346:2: ( 'A' )
                    {
                    // InternalAnnotationsStores.g:346:2: ( 'A' )
                    // InternalAnnotationsStores.g:347:3: 'A'
                    {
                     before(grammarAccess.getFocusAccess().getFocusAKeyword_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusAKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Focus__FocusAlternatives_0"


    // $ANTLR start "rule__AnnotationStores__Group__0"
    // InternalAnnotationsStores.g:356:1: rule__AnnotationStores__Group__0 : rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1 ;
    public final void rule__AnnotationStores__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:360:1: ( rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1 )
            // InternalAnnotationsStores.g:361:2: rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AnnotationStores__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__0"


    // $ANTLR start "rule__AnnotationStores__Group__0__Impl"
    // InternalAnnotationsStores.g:368:1: rule__AnnotationStores__Group__0__Impl : ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* ) ;
    public final void rule__AnnotationStores__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:372:1: ( ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* ) )
            // InternalAnnotationsStores.g:373:1: ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* )
            {
            // InternalAnnotationsStores.g:373:1: ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* )
            // InternalAnnotationsStores.g:374:2: ( rule__AnnotationStores__ProposalElementsAssignment_0 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getProposalElementsAssignment_0()); 
            // InternalAnnotationsStores.g:375:2: ( rule__AnnotationStores__ProposalElementsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotationsStores.g:375:3: rule__AnnotationStores__ProposalElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AnnotationStores__ProposalElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAnnotationStoresAccess().getProposalElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__0__Impl"


    // $ANTLR start "rule__AnnotationStores__Group__1"
    // InternalAnnotationsStores.g:383:1: rule__AnnotationStores__Group__1 : rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2 ;
    public final void rule__AnnotationStores__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:387:1: ( rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2 )
            // InternalAnnotationsStores.g:388:2: rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AnnotationStores__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__1"


    // $ANTLR start "rule__AnnotationStores__Group__1__Impl"
    // InternalAnnotationsStores.g:395:1: rule__AnnotationStores__Group__1__Impl : ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* ) ;
    public final void rule__AnnotationStores__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:399:1: ( ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* ) )
            // InternalAnnotationsStores.g:400:1: ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* )
            {
            // InternalAnnotationsStores.g:400:1: ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* )
            // InternalAnnotationsStores.g:401:2: ( rule__AnnotationStores__QuestionElementsAssignment_1 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getQuestionElementsAssignment_1()); 
            // InternalAnnotationsStores.g:402:2: ( rule__AnnotationStores__QuestionElementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotationsStores.g:402:3: rule__AnnotationStores__QuestionElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AnnotationStores__QuestionElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAnnotationStoresAccess().getQuestionElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__1__Impl"


    // $ANTLR start "rule__AnnotationStores__Group__2"
    // InternalAnnotationsStores.g:410:1: rule__AnnotationStores__Group__2 : rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3 ;
    public final void rule__AnnotationStores__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:414:1: ( rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3 )
            // InternalAnnotationsStores.g:415:2: rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AnnotationStores__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__2"


    // $ANTLR start "rule__AnnotationStores__Group__2__Impl"
    // InternalAnnotationsStores.g:422:1: rule__AnnotationStores__Group__2__Impl : ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* ) ;
    public final void rule__AnnotationStores__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:426:1: ( ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* ) )
            // InternalAnnotationsStores.g:427:1: ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* )
            {
            // InternalAnnotationsStores.g:427:1: ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* )
            // InternalAnnotationsStores.g:428:2: ( rule__AnnotationStores__ChallengeElementsAssignment_2 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getChallengeElementsAssignment_2()); 
            // InternalAnnotationsStores.g:429:2: ( rule__AnnotationStores__ChallengeElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnnotationsStores.g:429:3: rule__AnnotationStores__ChallengeElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AnnotationStores__ChallengeElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAnnotationStoresAccess().getChallengeElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__2__Impl"


    // $ANTLR start "rule__AnnotationStores__Group__3"
    // InternalAnnotationsStores.g:437:1: rule__AnnotationStores__Group__3 : rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4 ;
    public final void rule__AnnotationStores__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:441:1: ( rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4 )
            // InternalAnnotationsStores.g:442:2: rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AnnotationStores__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__3"


    // $ANTLR start "rule__AnnotationStores__Group__3__Impl"
    // InternalAnnotationsStores.g:449:1: rule__AnnotationStores__Group__3__Impl : ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* ) ;
    public final void rule__AnnotationStores__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:453:1: ( ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* ) )
            // InternalAnnotationsStores.g:454:1: ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* )
            {
            // InternalAnnotationsStores.g:454:1: ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* )
            // InternalAnnotationsStores.g:455:2: ( rule__AnnotationStores__CommitmentElementsAssignment_3 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsAssignment_3()); 
            // InternalAnnotationsStores.g:456:2: ( rule__AnnotationStores__CommitmentElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnnotationsStores.g:456:3: rule__AnnotationStores__CommitmentElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AnnotationStores__CommitmentElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__3__Impl"


    // $ANTLR start "rule__AnnotationStores__Group__4"
    // InternalAnnotationsStores.g:464:1: rule__AnnotationStores__Group__4 : rule__AnnotationStores__Group__4__Impl ;
    public final void rule__AnnotationStores__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:468:1: ( rule__AnnotationStores__Group__4__Impl )
            // InternalAnnotationsStores.g:469:2: rule__AnnotationStores__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationStores__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__4"


    // $ANTLR start "rule__AnnotationStores__Group__4__Impl"
    // InternalAnnotationsStores.g:475:1: rule__AnnotationStores__Group__4__Impl : ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* ) ;
    public final void rule__AnnotationStores__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:479:1: ( ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* ) )
            // InternalAnnotationsStores.g:480:1: ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* )
            {
            // InternalAnnotationsStores.g:480:1: ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* )
            // InternalAnnotationsStores.g:481:2: ( rule__AnnotationStores__ArgumentElementsAssignment_4 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getArgumentElementsAssignment_4()); 
            // InternalAnnotationsStores.g:482:2: ( rule__AnnotationStores__ArgumentElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnnotationsStores.g:482:3: rule__AnnotationStores__ArgumentElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AnnotationStores__ArgumentElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAnnotationStoresAccess().getArgumentElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__Group__4__Impl"


    // $ANTLR start "rule__ProposalStore__Group__0"
    // InternalAnnotationsStores.g:491:1: rule__ProposalStore__Group__0 : rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1 ;
    public final void rule__ProposalStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:495:1: ( rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1 )
            // InternalAnnotationsStores.g:496:2: rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ProposalStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__0"


    // $ANTLR start "rule__ProposalStore__Group__0__Impl"
    // InternalAnnotationsStores.g:503:1: rule__ProposalStore__Group__0__Impl : ( 'proposalElement' ) ;
    public final void rule__ProposalStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:507:1: ( ( 'proposalElement' ) )
            // InternalAnnotationsStores.g:508:1: ( 'proposalElement' )
            {
            // InternalAnnotationsStores.g:508:1: ( 'proposalElement' )
            // InternalAnnotationsStores.g:509:2: 'proposalElement'
            {
             before(grammarAccess.getProposalStoreAccess().getProposalElementKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getProposalElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__0__Impl"


    // $ANTLR start "rule__ProposalStore__Group__1"
    // InternalAnnotationsStores.g:518:1: rule__ProposalStore__Group__1 : rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2 ;
    public final void rule__ProposalStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:522:1: ( rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2 )
            // InternalAnnotationsStores.g:523:2: rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ProposalStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__1"


    // $ANTLR start "rule__ProposalStore__Group__1__Impl"
    // InternalAnnotationsStores.g:530:1: rule__ProposalStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ProposalStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:534:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:535:1: ( '(' )
            {
            // InternalAnnotationsStores.g:535:1: ( '(' )
            // InternalAnnotationsStores.g:536:2: '('
            {
             before(grammarAccess.getProposalStoreAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__1__Impl"


    // $ANTLR start "rule__ProposalStore__Group__2"
    // InternalAnnotationsStores.g:545:1: rule__ProposalStore__Group__2 : rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3 ;
    public final void rule__ProposalStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:549:1: ( rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3 )
            // InternalAnnotationsStores.g:550:2: rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ProposalStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__2"


    // $ANTLR start "rule__ProposalStore__Group__2__Impl"
    // InternalAnnotationsStores.g:557:1: rule__ProposalStore__Group__2__Impl : ( ( rule__ProposalStore__NameAssignment_2 ) ) ;
    public final void rule__ProposalStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:561:1: ( ( ( rule__ProposalStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:562:1: ( ( rule__ProposalStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:562:1: ( ( rule__ProposalStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:563:2: ( rule__ProposalStore__NameAssignment_2 )
            {
             before(grammarAccess.getProposalStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:564:2: ( rule__ProposalStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:564:3: rule__ProposalStore__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProposalStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__2__Impl"


    // $ANTLR start "rule__ProposalStore__Group__3"
    // InternalAnnotationsStores.g:572:1: rule__ProposalStore__Group__3 : rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4 ;
    public final void rule__ProposalStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:576:1: ( rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4 )
            // InternalAnnotationsStores.g:577:2: rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ProposalStore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__3"


    // $ANTLR start "rule__ProposalStore__Group__3__Impl"
    // InternalAnnotationsStores.g:584:1: rule__ProposalStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:588:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:589:1: ( ',' )
            {
            // InternalAnnotationsStores.g:589:1: ( ',' )
            // InternalAnnotationsStores.g:590:2: ','
            {
             before(grammarAccess.getProposalStoreAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__3__Impl"


    // $ANTLR start "rule__ProposalStore__Group__4"
    // InternalAnnotationsStores.g:599:1: rule__ProposalStore__Group__4 : rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5 ;
    public final void rule__ProposalStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:603:1: ( rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5 )
            // InternalAnnotationsStores.g:604:2: rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ProposalStore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__4"


    // $ANTLR start "rule__ProposalStore__Group__4__Impl"
    // InternalAnnotationsStores.g:611:1: rule__ProposalStore__Group__4__Impl : ( ( rule__ProposalStore__ScopeAssignment_4 ) ) ;
    public final void rule__ProposalStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:615:1: ( ( ( rule__ProposalStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:616:1: ( ( rule__ProposalStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:616:1: ( ( rule__ProposalStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:617:2: ( rule__ProposalStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getProposalStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:618:2: ( rule__ProposalStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:618:3: rule__ProposalStore__ScopeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__ScopeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProposalStoreAccess().getScopeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__4__Impl"


    // $ANTLR start "rule__ProposalStore__Group__5"
    // InternalAnnotationsStores.g:626:1: rule__ProposalStore__Group__5 : rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6 ;
    public final void rule__ProposalStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:630:1: ( rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6 )
            // InternalAnnotationsStores.g:631:2: rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ProposalStore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__5"


    // $ANTLR start "rule__ProposalStore__Group__5__Impl"
    // InternalAnnotationsStores.g:638:1: rule__ProposalStore__Group__5__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:642:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:643:1: ( ',' )
            {
            // InternalAnnotationsStores.g:643:1: ( ',' )
            // InternalAnnotationsStores.g:644:2: ','
            {
             before(grammarAccess.getProposalStoreAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__5__Impl"


    // $ANTLR start "rule__ProposalStore__Group__6"
    // InternalAnnotationsStores.g:653:1: rule__ProposalStore__Group__6 : rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7 ;
    public final void rule__ProposalStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:657:1: ( rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7 )
            // InternalAnnotationsStores.g:658:2: rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ProposalStore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__6"


    // $ANTLR start "rule__ProposalStore__Group__6__Impl"
    // InternalAnnotationsStores.g:665:1: rule__ProposalStore__Group__6__Impl : ( ( rule__ProposalStore__FocusAssignment_6 ) ) ;
    public final void rule__ProposalStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:669:1: ( ( ( rule__ProposalStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:670:1: ( ( rule__ProposalStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:670:1: ( ( rule__ProposalStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:671:2: ( rule__ProposalStore__FocusAssignment_6 )
            {
             before(grammarAccess.getProposalStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:672:2: ( rule__ProposalStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:672:3: rule__ProposalStore__FocusAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__FocusAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProposalStoreAccess().getFocusAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__6__Impl"


    // $ANTLR start "rule__ProposalStore__Group__7"
    // InternalAnnotationsStores.g:680:1: rule__ProposalStore__Group__7 : rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8 ;
    public final void rule__ProposalStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:684:1: ( rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8 )
            // InternalAnnotationsStores.g:685:2: rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__ProposalStore__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__7"


    // $ANTLR start "rule__ProposalStore__Group__7__Impl"
    // InternalAnnotationsStores.g:692:1: rule__ProposalStore__Group__7__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:696:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:697:1: ( ',' )
            {
            // InternalAnnotationsStores.g:697:1: ( ',' )
            // InternalAnnotationsStores.g:698:2: ','
            {
             before(grammarAccess.getProposalStoreAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__7__Impl"


    // $ANTLR start "rule__ProposalStore__Group__8"
    // InternalAnnotationsStores.g:707:1: rule__ProposalStore__Group__8 : rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9 ;
    public final void rule__ProposalStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:711:1: ( rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9 )
            // InternalAnnotationsStores.g:712:2: rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__ProposalStore__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__8"


    // $ANTLR start "rule__ProposalStore__Group__8__Impl"
    // InternalAnnotationsStores.g:719:1: rule__ProposalStore__Group__8__Impl : ( ( rule__ProposalStore__ContentAssignment_8 ) ) ;
    public final void rule__ProposalStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:723:1: ( ( ( rule__ProposalStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:724:1: ( ( rule__ProposalStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:724:1: ( ( rule__ProposalStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:725:2: ( rule__ProposalStore__ContentAssignment_8 )
            {
             before(grammarAccess.getProposalStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:726:2: ( rule__ProposalStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:726:3: rule__ProposalStore__ContentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__ContentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProposalStoreAccess().getContentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__8__Impl"


    // $ANTLR start "rule__ProposalStore__Group__9"
    // InternalAnnotationsStores.g:734:1: rule__ProposalStore__Group__9 : rule__ProposalStore__Group__9__Impl ;
    public final void rule__ProposalStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:738:1: ( rule__ProposalStore__Group__9__Impl )
            // InternalAnnotationsStores.g:739:2: rule__ProposalStore__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__9"


    // $ANTLR start "rule__ProposalStore__Group__9__Impl"
    // InternalAnnotationsStores.g:745:1: rule__ProposalStore__Group__9__Impl : ( ')' ) ;
    public final void rule__ProposalStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:749:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:750:1: ( ')' )
            {
            // InternalAnnotationsStores.g:750:1: ( ')' )
            // InternalAnnotationsStores.g:751:2: ')'
            {
             before(grammarAccess.getProposalStoreAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__Group__9__Impl"


    // $ANTLR start "rule__QuestionStore__Group__0"
    // InternalAnnotationsStores.g:761:1: rule__QuestionStore__Group__0 : rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1 ;
    public final void rule__QuestionStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:765:1: ( rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1 )
            // InternalAnnotationsStores.g:766:2: rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QuestionStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__0"


    // $ANTLR start "rule__QuestionStore__Group__0__Impl"
    // InternalAnnotationsStores.g:773:1: rule__QuestionStore__Group__0__Impl : ( 'questionElement' ) ;
    public final void rule__QuestionStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:777:1: ( ( 'questionElement' ) )
            // InternalAnnotationsStores.g:778:1: ( 'questionElement' )
            {
            // InternalAnnotationsStores.g:778:1: ( 'questionElement' )
            // InternalAnnotationsStores.g:779:2: 'questionElement'
            {
             before(grammarAccess.getQuestionStoreAccess().getQuestionElementKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getQuestionElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__0__Impl"


    // $ANTLR start "rule__QuestionStore__Group__1"
    // InternalAnnotationsStores.g:788:1: rule__QuestionStore__Group__1 : rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2 ;
    public final void rule__QuestionStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:792:1: ( rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2 )
            // InternalAnnotationsStores.g:793:2: rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__QuestionStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__1"


    // $ANTLR start "rule__QuestionStore__Group__1__Impl"
    // InternalAnnotationsStores.g:800:1: rule__QuestionStore__Group__1__Impl : ( '(' ) ;
    public final void rule__QuestionStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:804:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:805:1: ( '(' )
            {
            // InternalAnnotationsStores.g:805:1: ( '(' )
            // InternalAnnotationsStores.g:806:2: '('
            {
             before(grammarAccess.getQuestionStoreAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__1__Impl"


    // $ANTLR start "rule__QuestionStore__Group__2"
    // InternalAnnotationsStores.g:815:1: rule__QuestionStore__Group__2 : rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3 ;
    public final void rule__QuestionStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:819:1: ( rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3 )
            // InternalAnnotationsStores.g:820:2: rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__QuestionStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__2"


    // $ANTLR start "rule__QuestionStore__Group__2__Impl"
    // InternalAnnotationsStores.g:827:1: rule__QuestionStore__Group__2__Impl : ( ( rule__QuestionStore__NameAssignment_2 ) ) ;
    public final void rule__QuestionStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:831:1: ( ( ( rule__QuestionStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:832:1: ( ( rule__QuestionStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:832:1: ( ( rule__QuestionStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:833:2: ( rule__QuestionStore__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:834:2: ( rule__QuestionStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:834:3: rule__QuestionStore__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__2__Impl"


    // $ANTLR start "rule__QuestionStore__Group__3"
    // InternalAnnotationsStores.g:842:1: rule__QuestionStore__Group__3 : rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4 ;
    public final void rule__QuestionStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:846:1: ( rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4 )
            // InternalAnnotationsStores.g:847:2: rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__QuestionStore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__3"


    // $ANTLR start "rule__QuestionStore__Group__3__Impl"
    // InternalAnnotationsStores.g:854:1: rule__QuestionStore__Group__3__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:858:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:859:1: ( ',' )
            {
            // InternalAnnotationsStores.g:859:1: ( ',' )
            // InternalAnnotationsStores.g:860:2: ','
            {
             before(grammarAccess.getQuestionStoreAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__3__Impl"


    // $ANTLR start "rule__QuestionStore__Group__4"
    // InternalAnnotationsStores.g:869:1: rule__QuestionStore__Group__4 : rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5 ;
    public final void rule__QuestionStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:873:1: ( rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5 )
            // InternalAnnotationsStores.g:874:2: rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__QuestionStore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__4"


    // $ANTLR start "rule__QuestionStore__Group__4__Impl"
    // InternalAnnotationsStores.g:881:1: rule__QuestionStore__Group__4__Impl : ( ( rule__QuestionStore__SenderAssignment_4 ) ) ;
    public final void rule__QuestionStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:885:1: ( ( ( rule__QuestionStore__SenderAssignment_4 ) ) )
            // InternalAnnotationsStores.g:886:1: ( ( rule__QuestionStore__SenderAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:886:1: ( ( rule__QuestionStore__SenderAssignment_4 ) )
            // InternalAnnotationsStores.g:887:2: ( rule__QuestionStore__SenderAssignment_4 )
            {
             before(grammarAccess.getQuestionStoreAccess().getSenderAssignment_4()); 
            // InternalAnnotationsStores.g:888:2: ( rule__QuestionStore__SenderAssignment_4 )
            // InternalAnnotationsStores.g:888:3: rule__QuestionStore__SenderAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__SenderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getSenderAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__4__Impl"


    // $ANTLR start "rule__QuestionStore__Group__5"
    // InternalAnnotationsStores.g:896:1: rule__QuestionStore__Group__5 : rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6 ;
    public final void rule__QuestionStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:900:1: ( rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6 )
            // InternalAnnotationsStores.g:901:2: rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__QuestionStore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__5"


    // $ANTLR start "rule__QuestionStore__Group__5__Impl"
    // InternalAnnotationsStores.g:908:1: rule__QuestionStore__Group__5__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:912:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:913:1: ( ',' )
            {
            // InternalAnnotationsStores.g:913:1: ( ',' )
            // InternalAnnotationsStores.g:914:2: ','
            {
             before(grammarAccess.getQuestionStoreAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__5__Impl"


    // $ANTLR start "rule__QuestionStore__Group__6"
    // InternalAnnotationsStores.g:923:1: rule__QuestionStore__Group__6 : rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7 ;
    public final void rule__QuestionStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:927:1: ( rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7 )
            // InternalAnnotationsStores.g:928:2: rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__QuestionStore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__6"


    // $ANTLR start "rule__QuestionStore__Group__6__Impl"
    // InternalAnnotationsStores.g:935:1: rule__QuestionStore__Group__6__Impl : ( ( rule__QuestionStore__ScopeAssignment_6 ) ) ;
    public final void rule__QuestionStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:939:1: ( ( ( rule__QuestionStore__ScopeAssignment_6 ) ) )
            // InternalAnnotationsStores.g:940:1: ( ( rule__QuestionStore__ScopeAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:940:1: ( ( rule__QuestionStore__ScopeAssignment_6 ) )
            // InternalAnnotationsStores.g:941:2: ( rule__QuestionStore__ScopeAssignment_6 )
            {
             before(grammarAccess.getQuestionStoreAccess().getScopeAssignment_6()); 
            // InternalAnnotationsStores.g:942:2: ( rule__QuestionStore__ScopeAssignment_6 )
            // InternalAnnotationsStores.g:942:3: rule__QuestionStore__ScopeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__ScopeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getScopeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__6__Impl"


    // $ANTLR start "rule__QuestionStore__Group__7"
    // InternalAnnotationsStores.g:950:1: rule__QuestionStore__Group__7 : rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8 ;
    public final void rule__QuestionStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:954:1: ( rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8 )
            // InternalAnnotationsStores.g:955:2: rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__QuestionStore__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__7"


    // $ANTLR start "rule__QuestionStore__Group__7__Impl"
    // InternalAnnotationsStores.g:962:1: rule__QuestionStore__Group__7__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:966:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:967:1: ( ',' )
            {
            // InternalAnnotationsStores.g:967:1: ( ',' )
            // InternalAnnotationsStores.g:968:2: ','
            {
             before(grammarAccess.getQuestionStoreAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__7__Impl"


    // $ANTLR start "rule__QuestionStore__Group__8"
    // InternalAnnotationsStores.g:977:1: rule__QuestionStore__Group__8 : rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9 ;
    public final void rule__QuestionStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:981:1: ( rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9 )
            // InternalAnnotationsStores.g:982:2: rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__QuestionStore__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__8"


    // $ANTLR start "rule__QuestionStore__Group__8__Impl"
    // InternalAnnotationsStores.g:989:1: rule__QuestionStore__Group__8__Impl : ( ( rule__QuestionStore__FocusAssignment_8 ) ) ;
    public final void rule__QuestionStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:993:1: ( ( ( rule__QuestionStore__FocusAssignment_8 ) ) )
            // InternalAnnotationsStores.g:994:1: ( ( rule__QuestionStore__FocusAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:994:1: ( ( rule__QuestionStore__FocusAssignment_8 ) )
            // InternalAnnotationsStores.g:995:2: ( rule__QuestionStore__FocusAssignment_8 )
            {
             before(grammarAccess.getQuestionStoreAccess().getFocusAssignment_8()); 
            // InternalAnnotationsStores.g:996:2: ( rule__QuestionStore__FocusAssignment_8 )
            // InternalAnnotationsStores.g:996:3: rule__QuestionStore__FocusAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__FocusAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getFocusAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__8__Impl"


    // $ANTLR start "rule__QuestionStore__Group__9"
    // InternalAnnotationsStores.g:1004:1: rule__QuestionStore__Group__9 : rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10 ;
    public final void rule__QuestionStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1008:1: ( rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10 )
            // InternalAnnotationsStores.g:1009:2: rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__QuestionStore__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__9"


    // $ANTLR start "rule__QuestionStore__Group__9__Impl"
    // InternalAnnotationsStores.g:1016:1: rule__QuestionStore__Group__9__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1020:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1021:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1021:1: ( ',' )
            // InternalAnnotationsStores.g:1022:2: ','
            {
             before(grammarAccess.getQuestionStoreAccess().getCommaKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__9__Impl"


    // $ANTLR start "rule__QuestionStore__Group__10"
    // InternalAnnotationsStores.g:1031:1: rule__QuestionStore__Group__10 : rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11 ;
    public final void rule__QuestionStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1035:1: ( rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11 )
            // InternalAnnotationsStores.g:1036:2: rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__QuestionStore__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__10"


    // $ANTLR start "rule__QuestionStore__Group__10__Impl"
    // InternalAnnotationsStores.g:1043:1: rule__QuestionStore__Group__10__Impl : ( ( rule__QuestionStore__ContentAssignment_10 ) ) ;
    public final void rule__QuestionStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1047:1: ( ( ( rule__QuestionStore__ContentAssignment_10 ) ) )
            // InternalAnnotationsStores.g:1048:1: ( ( rule__QuestionStore__ContentAssignment_10 ) )
            {
            // InternalAnnotationsStores.g:1048:1: ( ( rule__QuestionStore__ContentAssignment_10 ) )
            // InternalAnnotationsStores.g:1049:2: ( rule__QuestionStore__ContentAssignment_10 )
            {
             before(grammarAccess.getQuestionStoreAccess().getContentAssignment_10()); 
            // InternalAnnotationsStores.g:1050:2: ( rule__QuestionStore__ContentAssignment_10 )
            // InternalAnnotationsStores.g:1050:3: rule__QuestionStore__ContentAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__ContentAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getQuestionStoreAccess().getContentAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__10__Impl"


    // $ANTLR start "rule__QuestionStore__Group__11"
    // InternalAnnotationsStores.g:1058:1: rule__QuestionStore__Group__11 : rule__QuestionStore__Group__11__Impl ;
    public final void rule__QuestionStore__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1062:1: ( rule__QuestionStore__Group__11__Impl )
            // InternalAnnotationsStores.g:1063:2: rule__QuestionStore__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__11"


    // $ANTLR start "rule__QuestionStore__Group__11__Impl"
    // InternalAnnotationsStores.g:1069:1: rule__QuestionStore__Group__11__Impl : ( ')' ) ;
    public final void rule__QuestionStore__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1073:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1074:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1074:1: ( ')' )
            // InternalAnnotationsStores.g:1075:2: ')'
            {
             before(grammarAccess.getQuestionStoreAccess().getRightParenthesisKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__Group__11__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__0"
    // InternalAnnotationsStores.g:1085:1: rule__ChallengeStore__Group__0 : rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1 ;
    public final void rule__ChallengeStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1089:1: ( rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1 )
            // InternalAnnotationsStores.g:1090:2: rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ChallengeStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__0"


    // $ANTLR start "rule__ChallengeStore__Group__0__Impl"
    // InternalAnnotationsStores.g:1097:1: rule__ChallengeStore__Group__0__Impl : ( 'challengeElement' ) ;
    public final void rule__ChallengeStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1101:1: ( ( 'challengeElement' ) )
            // InternalAnnotationsStores.g:1102:1: ( 'challengeElement' )
            {
            // InternalAnnotationsStores.g:1102:1: ( 'challengeElement' )
            // InternalAnnotationsStores.g:1103:2: 'challengeElement'
            {
             before(grammarAccess.getChallengeStoreAccess().getChallengeElementKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getChallengeElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__0__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__1"
    // InternalAnnotationsStores.g:1112:1: rule__ChallengeStore__Group__1 : rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2 ;
    public final void rule__ChallengeStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1116:1: ( rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2 )
            // InternalAnnotationsStores.g:1117:2: rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ChallengeStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__1"


    // $ANTLR start "rule__ChallengeStore__Group__1__Impl"
    // InternalAnnotationsStores.g:1124:1: rule__ChallengeStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ChallengeStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1128:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1129:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1129:1: ( '(' )
            // InternalAnnotationsStores.g:1130:2: '('
            {
             before(grammarAccess.getChallengeStoreAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__1__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__2"
    // InternalAnnotationsStores.g:1139:1: rule__ChallengeStore__Group__2 : rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3 ;
    public final void rule__ChallengeStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1143:1: ( rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3 )
            // InternalAnnotationsStores.g:1144:2: rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ChallengeStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__2"


    // $ANTLR start "rule__ChallengeStore__Group__2__Impl"
    // InternalAnnotationsStores.g:1151:1: rule__ChallengeStore__Group__2__Impl : ( ( rule__ChallengeStore__NameAssignment_2 ) ) ;
    public final void rule__ChallengeStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1155:1: ( ( ( rule__ChallengeStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1156:1: ( ( rule__ChallengeStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1156:1: ( ( rule__ChallengeStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1157:2: ( rule__ChallengeStore__NameAssignment_2 )
            {
             before(grammarAccess.getChallengeStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1158:2: ( rule__ChallengeStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1158:3: rule__ChallengeStore__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChallengeStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__2__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__3"
    // InternalAnnotationsStores.g:1166:1: rule__ChallengeStore__Group__3 : rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4 ;
    public final void rule__ChallengeStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1170:1: ( rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4 )
            // InternalAnnotationsStores.g:1171:2: rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ChallengeStore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__3"


    // $ANTLR start "rule__ChallengeStore__Group__3__Impl"
    // InternalAnnotationsStores.g:1178:1: rule__ChallengeStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ChallengeStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1182:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1183:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1183:1: ( ',' )
            // InternalAnnotationsStores.g:1184:2: ','
            {
             before(grammarAccess.getChallengeStoreAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__3__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__4"
    // InternalAnnotationsStores.g:1193:1: rule__ChallengeStore__Group__4 : rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5 ;
    public final void rule__ChallengeStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1197:1: ( rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5 )
            // InternalAnnotationsStores.g:1198:2: rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ChallengeStore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__4"


    // $ANTLR start "rule__ChallengeStore__Group__4__Impl"
    // InternalAnnotationsStores.g:1205:1: rule__ChallengeStore__Group__4__Impl : ( ( rule__ChallengeStore__SenderAssignment_4 ) ) ;
    public final void rule__ChallengeStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1209:1: ( ( ( rule__ChallengeStore__SenderAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1210:1: ( ( rule__ChallengeStore__SenderAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1210:1: ( ( rule__ChallengeStore__SenderAssignment_4 ) )
            // InternalAnnotationsStores.g:1211:2: ( rule__ChallengeStore__SenderAssignment_4 )
            {
             before(grammarAccess.getChallengeStoreAccess().getSenderAssignment_4()); 
            // InternalAnnotationsStores.g:1212:2: ( rule__ChallengeStore__SenderAssignment_4 )
            // InternalAnnotationsStores.g:1212:3: rule__ChallengeStore__SenderAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__SenderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChallengeStoreAccess().getSenderAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__4__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__5"
    // InternalAnnotationsStores.g:1220:1: rule__ChallengeStore__Group__5 : rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6 ;
    public final void rule__ChallengeStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1224:1: ( rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6 )
            // InternalAnnotationsStores.g:1225:2: rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ChallengeStore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__5"


    // $ANTLR start "rule__ChallengeStore__Group__5__Impl"
    // InternalAnnotationsStores.g:1232:1: rule__ChallengeStore__Group__5__Impl : ( ( rule__ChallengeStore__Group_5__0 )? ) ;
    public final void rule__ChallengeStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1236:1: ( ( ( rule__ChallengeStore__Group_5__0 )? ) )
            // InternalAnnotationsStores.g:1237:1: ( ( rule__ChallengeStore__Group_5__0 )? )
            {
            // InternalAnnotationsStores.g:1237:1: ( ( rule__ChallengeStore__Group_5__0 )? )
            // InternalAnnotationsStores.g:1238:2: ( rule__ChallengeStore__Group_5__0 )?
            {
             before(grammarAccess.getChallengeStoreAccess().getGroup_5()); 
            // InternalAnnotationsStores.g:1239:2: ( rule__ChallengeStore__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnnotationsStores.g:1239:3: rule__ChallengeStore__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChallengeStore__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChallengeStoreAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__5__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__6"
    // InternalAnnotationsStores.g:1247:1: rule__ChallengeStore__Group__6 : rule__ChallengeStore__Group__6__Impl ;
    public final void rule__ChallengeStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1251:1: ( rule__ChallengeStore__Group__6__Impl )
            // InternalAnnotationsStores.g:1252:2: rule__ChallengeStore__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__6"


    // $ANTLR start "rule__ChallengeStore__Group__6__Impl"
    // InternalAnnotationsStores.g:1258:1: rule__ChallengeStore__Group__6__Impl : ( ')' ) ;
    public final void rule__ChallengeStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1262:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1263:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1263:1: ( ')' )
            // InternalAnnotationsStores.g:1264:2: ')'
            {
             before(grammarAccess.getChallengeStoreAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group__6__Impl"


    // $ANTLR start "rule__ChallengeStore__Group_5__0"
    // InternalAnnotationsStores.g:1274:1: rule__ChallengeStore__Group_5__0 : rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1 ;
    public final void rule__ChallengeStore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1278:1: ( rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1 )
            // InternalAnnotationsStores.g:1279:2: rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__ChallengeStore__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group_5__0"


    // $ANTLR start "rule__ChallengeStore__Group_5__0__Impl"
    // InternalAnnotationsStores.g:1286:1: rule__ChallengeStore__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ChallengeStore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1290:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1291:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1291:1: ( ',' )
            // InternalAnnotationsStores.g:1292:2: ','
            {
             before(grammarAccess.getChallengeStoreAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group_5__0__Impl"


    // $ANTLR start "rule__ChallengeStore__Group_5__1"
    // InternalAnnotationsStores.g:1301:1: rule__ChallengeStore__Group_5__1 : rule__ChallengeStore__Group_5__1__Impl ;
    public final void rule__ChallengeStore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1305:1: ( rule__ChallengeStore__Group_5__1__Impl )
            // InternalAnnotationsStores.g:1306:2: rule__ChallengeStore__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group_5__1"


    // $ANTLR start "rule__ChallengeStore__Group_5__1__Impl"
    // InternalAnnotationsStores.g:1312:1: rule__ChallengeStore__Group_5__1__Impl : ( ( rule__ChallengeStore__TargetAssignment_5_1 ) ) ;
    public final void rule__ChallengeStore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1316:1: ( ( ( rule__ChallengeStore__TargetAssignment_5_1 ) ) )
            // InternalAnnotationsStores.g:1317:1: ( ( rule__ChallengeStore__TargetAssignment_5_1 ) )
            {
            // InternalAnnotationsStores.g:1317:1: ( ( rule__ChallengeStore__TargetAssignment_5_1 ) )
            // InternalAnnotationsStores.g:1318:2: ( rule__ChallengeStore__TargetAssignment_5_1 )
            {
             before(grammarAccess.getChallengeStoreAccess().getTargetAssignment_5_1()); 
            // InternalAnnotationsStores.g:1319:2: ( rule__ChallengeStore__TargetAssignment_5_1 )
            // InternalAnnotationsStores.g:1319:3: rule__ChallengeStore__TargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getChallengeStoreAccess().getTargetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__Group_5__1__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__0"
    // InternalAnnotationsStores.g:1328:1: rule__CommitmentStore__Group__0 : rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1 ;
    public final void rule__CommitmentStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1332:1: ( rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1 )
            // InternalAnnotationsStores.g:1333:2: rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CommitmentStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__0"


    // $ANTLR start "rule__CommitmentStore__Group__0__Impl"
    // InternalAnnotationsStores.g:1340:1: rule__CommitmentStore__Group__0__Impl : ( 'commitmentElement' ) ;
    public final void rule__CommitmentStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1344:1: ( ( 'commitmentElement' ) )
            // InternalAnnotationsStores.g:1345:1: ( 'commitmentElement' )
            {
            // InternalAnnotationsStores.g:1345:1: ( 'commitmentElement' )
            // InternalAnnotationsStores.g:1346:2: 'commitmentElement'
            {
             before(grammarAccess.getCommitmentStoreAccess().getCommitmentElementKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getCommitmentElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__0__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__1"
    // InternalAnnotationsStores.g:1355:1: rule__CommitmentStore__Group__1 : rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2 ;
    public final void rule__CommitmentStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1359:1: ( rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2 )
            // InternalAnnotationsStores.g:1360:2: rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CommitmentStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__1"


    // $ANTLR start "rule__CommitmentStore__Group__1__Impl"
    // InternalAnnotationsStores.g:1367:1: rule__CommitmentStore__Group__1__Impl : ( '(' ) ;
    public final void rule__CommitmentStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1371:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1372:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1372:1: ( '(' )
            // InternalAnnotationsStores.g:1373:2: '('
            {
             before(grammarAccess.getCommitmentStoreAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__1__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__2"
    // InternalAnnotationsStores.g:1382:1: rule__CommitmentStore__Group__2 : rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3 ;
    public final void rule__CommitmentStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1386:1: ( rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3 )
            // InternalAnnotationsStores.g:1387:2: rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CommitmentStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__2"


    // $ANTLR start "rule__CommitmentStore__Group__2__Impl"
    // InternalAnnotationsStores.g:1394:1: rule__CommitmentStore__Group__2__Impl : ( ( rule__CommitmentStore__NameAssignment_2 ) ) ;
    public final void rule__CommitmentStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1398:1: ( ( ( rule__CommitmentStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1399:1: ( ( rule__CommitmentStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1399:1: ( ( rule__CommitmentStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1400:2: ( rule__CommitmentStore__NameAssignment_2 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1401:2: ( rule__CommitmentStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1401:3: rule__CommitmentStore__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__2__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__3"
    // InternalAnnotationsStores.g:1409:1: rule__CommitmentStore__Group__3 : rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4 ;
    public final void rule__CommitmentStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1413:1: ( rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4 )
            // InternalAnnotationsStores.g:1414:2: rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CommitmentStore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__3"


    // $ANTLR start "rule__CommitmentStore__Group__3__Impl"
    // InternalAnnotationsStores.g:1421:1: rule__CommitmentStore__Group__3__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1425:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1426:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1426:1: ( ',' )
            // InternalAnnotationsStores.g:1427:2: ','
            {
             before(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__3__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__4"
    // InternalAnnotationsStores.g:1436:1: rule__CommitmentStore__Group__4 : rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5 ;
    public final void rule__CommitmentStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1440:1: ( rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5 )
            // InternalAnnotationsStores.g:1441:2: rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CommitmentStore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__4"


    // $ANTLR start "rule__CommitmentStore__Group__4__Impl"
    // InternalAnnotationsStores.g:1448:1: rule__CommitmentStore__Group__4__Impl : ( ( rule__CommitmentStore__ScopeAssignment_4 ) ) ;
    public final void rule__CommitmentStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1452:1: ( ( ( rule__CommitmentStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1453:1: ( ( rule__CommitmentStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1453:1: ( ( rule__CommitmentStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:1454:2: ( rule__CommitmentStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:1455:2: ( rule__CommitmentStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:1455:3: rule__CommitmentStore__ScopeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__ScopeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentStoreAccess().getScopeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__4__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__5"
    // InternalAnnotationsStores.g:1463:1: rule__CommitmentStore__Group__5 : rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6 ;
    public final void rule__CommitmentStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1467:1: ( rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6 )
            // InternalAnnotationsStores.g:1468:2: rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CommitmentStore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__5"


    // $ANTLR start "rule__CommitmentStore__Group__5__Impl"
    // InternalAnnotationsStores.g:1475:1: rule__CommitmentStore__Group__5__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1479:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1480:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1480:1: ( ',' )
            // InternalAnnotationsStores.g:1481:2: ','
            {
             before(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__5__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__6"
    // InternalAnnotationsStores.g:1490:1: rule__CommitmentStore__Group__6 : rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7 ;
    public final void rule__CommitmentStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1494:1: ( rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7 )
            // InternalAnnotationsStores.g:1495:2: rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__CommitmentStore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__6"


    // $ANTLR start "rule__CommitmentStore__Group__6__Impl"
    // InternalAnnotationsStores.g:1502:1: rule__CommitmentStore__Group__6__Impl : ( ( rule__CommitmentStore__FocusAssignment_6 ) ) ;
    public final void rule__CommitmentStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1506:1: ( ( ( rule__CommitmentStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:1507:1: ( ( rule__CommitmentStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:1507:1: ( ( rule__CommitmentStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:1508:2: ( rule__CommitmentStore__FocusAssignment_6 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:1509:2: ( rule__CommitmentStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:1509:3: rule__CommitmentStore__FocusAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__FocusAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentStoreAccess().getFocusAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__6__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__7"
    // InternalAnnotationsStores.g:1517:1: rule__CommitmentStore__Group__7 : rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8 ;
    public final void rule__CommitmentStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1521:1: ( rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8 )
            // InternalAnnotationsStores.g:1522:2: rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__CommitmentStore__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__7"


    // $ANTLR start "rule__CommitmentStore__Group__7__Impl"
    // InternalAnnotationsStores.g:1529:1: rule__CommitmentStore__Group__7__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1533:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1534:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1534:1: ( ',' )
            // InternalAnnotationsStores.g:1535:2: ','
            {
             before(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__7__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__8"
    // InternalAnnotationsStores.g:1544:1: rule__CommitmentStore__Group__8 : rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9 ;
    public final void rule__CommitmentStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1548:1: ( rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9 )
            // InternalAnnotationsStores.g:1549:2: rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__CommitmentStore__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__8"


    // $ANTLR start "rule__CommitmentStore__Group__8__Impl"
    // InternalAnnotationsStores.g:1556:1: rule__CommitmentStore__Group__8__Impl : ( ( rule__CommitmentStore__ContentAssignment_8 ) ) ;
    public final void rule__CommitmentStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1560:1: ( ( ( rule__CommitmentStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:1561:1: ( ( rule__CommitmentStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:1561:1: ( ( rule__CommitmentStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:1562:2: ( rule__CommitmentStore__ContentAssignment_8 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:1563:2: ( rule__CommitmentStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:1563:3: rule__CommitmentStore__ContentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__ContentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCommitmentStoreAccess().getContentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__8__Impl"


    // $ANTLR start "rule__CommitmentStore__Group__9"
    // InternalAnnotationsStores.g:1571:1: rule__CommitmentStore__Group__9 : rule__CommitmentStore__Group__9__Impl ;
    public final void rule__CommitmentStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1575:1: ( rule__CommitmentStore__Group__9__Impl )
            // InternalAnnotationsStores.g:1576:2: rule__CommitmentStore__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__9"


    // $ANTLR start "rule__CommitmentStore__Group__9__Impl"
    // InternalAnnotationsStores.g:1582:1: rule__CommitmentStore__Group__9__Impl : ( ')' ) ;
    public final void rule__CommitmentStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1586:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1587:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1587:1: ( ')' )
            // InternalAnnotationsStores.g:1588:2: ')'
            {
             before(grammarAccess.getCommitmentStoreAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__Group__9__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__0"
    // InternalAnnotationsStores.g:1598:1: rule__ArgumentStore__Group__0 : rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1 ;
    public final void rule__ArgumentStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1602:1: ( rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1 )
            // InternalAnnotationsStores.g:1603:2: rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ArgumentStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__0"


    // $ANTLR start "rule__ArgumentStore__Group__0__Impl"
    // InternalAnnotationsStores.g:1610:1: rule__ArgumentStore__Group__0__Impl : ( 'argumentElement' ) ;
    public final void rule__ArgumentStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1614:1: ( ( 'argumentElement' ) )
            // InternalAnnotationsStores.g:1615:1: ( 'argumentElement' )
            {
            // InternalAnnotationsStores.g:1615:1: ( 'argumentElement' )
            // InternalAnnotationsStores.g:1616:2: 'argumentElement'
            {
             before(grammarAccess.getArgumentStoreAccess().getArgumentElementKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getArgumentElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__0__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__1"
    // InternalAnnotationsStores.g:1625:1: rule__ArgumentStore__Group__1 : rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2 ;
    public final void rule__ArgumentStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1629:1: ( rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2 )
            // InternalAnnotationsStores.g:1630:2: rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ArgumentStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__1"


    // $ANTLR start "rule__ArgumentStore__Group__1__Impl"
    // InternalAnnotationsStores.g:1637:1: rule__ArgumentStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ArgumentStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1641:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1642:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1642:1: ( '(' )
            // InternalAnnotationsStores.g:1643:2: '('
            {
             before(grammarAccess.getArgumentStoreAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__1__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__2"
    // InternalAnnotationsStores.g:1652:1: rule__ArgumentStore__Group__2 : rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3 ;
    public final void rule__ArgumentStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1656:1: ( rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3 )
            // InternalAnnotationsStores.g:1657:2: rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ArgumentStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__2"


    // $ANTLR start "rule__ArgumentStore__Group__2__Impl"
    // InternalAnnotationsStores.g:1664:1: rule__ArgumentStore__Group__2__Impl : ( ( rule__ArgumentStore__NameAssignment_2 ) ) ;
    public final void rule__ArgumentStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1668:1: ( ( ( rule__ArgumentStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1669:1: ( ( rule__ArgumentStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1669:1: ( ( rule__ArgumentStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1670:2: ( rule__ArgumentStore__NameAssignment_2 )
            {
             before(grammarAccess.getArgumentStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1671:2: ( rule__ArgumentStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1671:3: rule__ArgumentStore__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__2__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__3"
    // InternalAnnotationsStores.g:1679:1: rule__ArgumentStore__Group__3 : rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4 ;
    public final void rule__ArgumentStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1683:1: ( rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4 )
            // InternalAnnotationsStores.g:1684:2: rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ArgumentStore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__3"


    // $ANTLR start "rule__ArgumentStore__Group__3__Impl"
    // InternalAnnotationsStores.g:1691:1: rule__ArgumentStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1695:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1696:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1696:1: ( ',' )
            // InternalAnnotationsStores.g:1697:2: ','
            {
             before(grammarAccess.getArgumentStoreAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__3__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__4"
    // InternalAnnotationsStores.g:1706:1: rule__ArgumentStore__Group__4 : rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5 ;
    public final void rule__ArgumentStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1710:1: ( rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5 )
            // InternalAnnotationsStores.g:1711:2: rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ArgumentStore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__4"


    // $ANTLR start "rule__ArgumentStore__Group__4__Impl"
    // InternalAnnotationsStores.g:1718:1: rule__ArgumentStore__Group__4__Impl : ( ( rule__ArgumentStore__ScopeAssignment_4 ) ) ;
    public final void rule__ArgumentStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1722:1: ( ( ( rule__ArgumentStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1723:1: ( ( rule__ArgumentStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1723:1: ( ( rule__ArgumentStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:1724:2: ( rule__ArgumentStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getArgumentStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:1725:2: ( rule__ArgumentStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:1725:3: rule__ArgumentStore__ScopeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__ScopeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getScopeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__4__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__5"
    // InternalAnnotationsStores.g:1733:1: rule__ArgumentStore__Group__5 : rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6 ;
    public final void rule__ArgumentStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1737:1: ( rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6 )
            // InternalAnnotationsStores.g:1738:2: rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ArgumentStore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__5"


    // $ANTLR start "rule__ArgumentStore__Group__5__Impl"
    // InternalAnnotationsStores.g:1745:1: rule__ArgumentStore__Group__5__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1749:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1750:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1750:1: ( ',' )
            // InternalAnnotationsStores.g:1751:2: ','
            {
             before(grammarAccess.getArgumentStoreAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__5__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__6"
    // InternalAnnotationsStores.g:1760:1: rule__ArgumentStore__Group__6 : rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7 ;
    public final void rule__ArgumentStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1764:1: ( rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7 )
            // InternalAnnotationsStores.g:1765:2: rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ArgumentStore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__6"


    // $ANTLR start "rule__ArgumentStore__Group__6__Impl"
    // InternalAnnotationsStores.g:1772:1: rule__ArgumentStore__Group__6__Impl : ( ( rule__ArgumentStore__FocusAssignment_6 ) ) ;
    public final void rule__ArgumentStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1776:1: ( ( ( rule__ArgumentStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:1777:1: ( ( rule__ArgumentStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:1777:1: ( ( rule__ArgumentStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:1778:2: ( rule__ArgumentStore__FocusAssignment_6 )
            {
             before(grammarAccess.getArgumentStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:1779:2: ( rule__ArgumentStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:1779:3: rule__ArgumentStore__FocusAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__FocusAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getFocusAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__6__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__7"
    // InternalAnnotationsStores.g:1787:1: rule__ArgumentStore__Group__7 : rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8 ;
    public final void rule__ArgumentStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1791:1: ( rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8 )
            // InternalAnnotationsStores.g:1792:2: rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__ArgumentStore__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__7"


    // $ANTLR start "rule__ArgumentStore__Group__7__Impl"
    // InternalAnnotationsStores.g:1799:1: rule__ArgumentStore__Group__7__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1803:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1804:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1804:1: ( ',' )
            // InternalAnnotationsStores.g:1805:2: ','
            {
             before(grammarAccess.getArgumentStoreAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__7__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__8"
    // InternalAnnotationsStores.g:1814:1: rule__ArgumentStore__Group__8 : rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9 ;
    public final void rule__ArgumentStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1818:1: ( rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9 )
            // InternalAnnotationsStores.g:1819:2: rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__ArgumentStore__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__8"


    // $ANTLR start "rule__ArgumentStore__Group__8__Impl"
    // InternalAnnotationsStores.g:1826:1: rule__ArgumentStore__Group__8__Impl : ( ( rule__ArgumentStore__ContentAssignment_8 ) ) ;
    public final void rule__ArgumentStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1830:1: ( ( ( rule__ArgumentStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:1831:1: ( ( rule__ArgumentStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:1831:1: ( ( rule__ArgumentStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:1832:2: ( rule__ArgumentStore__ContentAssignment_8 )
            {
             before(grammarAccess.getArgumentStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:1833:2: ( rule__ArgumentStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:1833:3: rule__ArgumentStore__ContentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__ContentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getContentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__8__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__9"
    // InternalAnnotationsStores.g:1841:1: rule__ArgumentStore__Group__9 : rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10 ;
    public final void rule__ArgumentStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1845:1: ( rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10 )
            // InternalAnnotationsStores.g:1846:2: rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__ArgumentStore__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__9"


    // $ANTLR start "rule__ArgumentStore__Group__9__Impl"
    // InternalAnnotationsStores.g:1853:1: rule__ArgumentStore__Group__9__Impl : ( ( rule__ArgumentStore__Group_9__0 )? ) ;
    public final void rule__ArgumentStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1857:1: ( ( ( rule__ArgumentStore__Group_9__0 )? ) )
            // InternalAnnotationsStores.g:1858:1: ( ( rule__ArgumentStore__Group_9__0 )? )
            {
            // InternalAnnotationsStores.g:1858:1: ( ( rule__ArgumentStore__Group_9__0 )? )
            // InternalAnnotationsStores.g:1859:2: ( rule__ArgumentStore__Group_9__0 )?
            {
             before(grammarAccess.getArgumentStoreAccess().getGroup_9()); 
            // InternalAnnotationsStores.g:1860:2: ( rule__ArgumentStore__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnnotationsStores.g:1860:3: rule__ArgumentStore__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgumentStore__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentStoreAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__9__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__10"
    // InternalAnnotationsStores.g:1868:1: rule__ArgumentStore__Group__10 : rule__ArgumentStore__Group__10__Impl ;
    public final void rule__ArgumentStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1872:1: ( rule__ArgumentStore__Group__10__Impl )
            // InternalAnnotationsStores.g:1873:2: rule__ArgumentStore__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__10"


    // $ANTLR start "rule__ArgumentStore__Group__10__Impl"
    // InternalAnnotationsStores.g:1879:1: rule__ArgumentStore__Group__10__Impl : ( ')' ) ;
    public final void rule__ArgumentStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1883:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1884:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1884:1: ( ')' )
            // InternalAnnotationsStores.g:1885:2: ')'
            {
             before(grammarAccess.getArgumentStoreAccess().getRightParenthesisKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group__10__Impl"


    // $ANTLR start "rule__ArgumentStore__Group_9__0"
    // InternalAnnotationsStores.g:1895:1: rule__ArgumentStore__Group_9__0 : rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1 ;
    public final void rule__ArgumentStore__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1899:1: ( rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1 )
            // InternalAnnotationsStores.g:1900:2: rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__ArgumentStore__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group_9__0"


    // $ANTLR start "rule__ArgumentStore__Group_9__0__Impl"
    // InternalAnnotationsStores.g:1907:1: rule__ArgumentStore__Group_9__0__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1911:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1912:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1912:1: ( ',' )
            // InternalAnnotationsStores.g:1913:2: ','
            {
             before(grammarAccess.getArgumentStoreAccess().getCommaKeyword_9_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group_9__0__Impl"


    // $ANTLR start "rule__ArgumentStore__Group_9__1"
    // InternalAnnotationsStores.g:1922:1: rule__ArgumentStore__Group_9__1 : rule__ArgumentStore__Group_9__1__Impl ;
    public final void rule__ArgumentStore__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1926:1: ( rule__ArgumentStore__Group_9__1__Impl )
            // InternalAnnotationsStores.g:1927:2: rule__ArgumentStore__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group_9__1"


    // $ANTLR start "rule__ArgumentStore__Group_9__1__Impl"
    // InternalAnnotationsStores.g:1933:1: rule__ArgumentStore__Group_9__1__Impl : ( ( rule__ArgumentStore__TargetAssignment_9_1 ) ) ;
    public final void rule__ArgumentStore__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1937:1: ( ( ( rule__ArgumentStore__TargetAssignment_9_1 ) ) )
            // InternalAnnotationsStores.g:1938:1: ( ( rule__ArgumentStore__TargetAssignment_9_1 ) )
            {
            // InternalAnnotationsStores.g:1938:1: ( ( rule__ArgumentStore__TargetAssignment_9_1 ) )
            // InternalAnnotationsStores.g:1939:2: ( rule__ArgumentStore__TargetAssignment_9_1 )
            {
             before(grammarAccess.getArgumentStoreAccess().getTargetAssignment_9_1()); 
            // InternalAnnotationsStores.g:1940:2: ( rule__ArgumentStore__TargetAssignment_9_1 )
            // InternalAnnotationsStores.g:1940:3: rule__ArgumentStore__TargetAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__TargetAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentStoreAccess().getTargetAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__Group_9__1__Impl"


    // $ANTLR start "rule__AnnotationStores__ProposalElementsAssignment_0"
    // InternalAnnotationsStores.g:1949:1: rule__AnnotationStores__ProposalElementsAssignment_0 : ( ruleProposalStore ) ;
    public final void rule__AnnotationStores__ProposalElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1953:1: ( ( ruleProposalStore ) )
            // InternalAnnotationsStores.g:1954:2: ( ruleProposalStore )
            {
            // InternalAnnotationsStores.g:1954:2: ( ruleProposalStore )
            // InternalAnnotationsStores.g:1955:3: ruleProposalStore
            {
             before(grammarAccess.getAnnotationStoresAccess().getProposalElementsProposalStoreParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProposalStore();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresAccess().getProposalElementsProposalStoreParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__ProposalElementsAssignment_0"


    // $ANTLR start "rule__AnnotationStores__QuestionElementsAssignment_1"
    // InternalAnnotationsStores.g:1964:1: rule__AnnotationStores__QuestionElementsAssignment_1 : ( ruleQuestionStore ) ;
    public final void rule__AnnotationStores__QuestionElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1968:1: ( ( ruleQuestionStore ) )
            // InternalAnnotationsStores.g:1969:2: ( ruleQuestionStore )
            {
            // InternalAnnotationsStores.g:1969:2: ( ruleQuestionStore )
            // InternalAnnotationsStores.g:1970:3: ruleQuestionStore
            {
             before(grammarAccess.getAnnotationStoresAccess().getQuestionElementsQuestionStoreParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionStore();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresAccess().getQuestionElementsQuestionStoreParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__QuestionElementsAssignment_1"


    // $ANTLR start "rule__AnnotationStores__ChallengeElementsAssignment_2"
    // InternalAnnotationsStores.g:1979:1: rule__AnnotationStores__ChallengeElementsAssignment_2 : ( ruleChallengeStore ) ;
    public final void rule__AnnotationStores__ChallengeElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1983:1: ( ( ruleChallengeStore ) )
            // InternalAnnotationsStores.g:1984:2: ( ruleChallengeStore )
            {
            // InternalAnnotationsStores.g:1984:2: ( ruleChallengeStore )
            // InternalAnnotationsStores.g:1985:3: ruleChallengeStore
            {
             before(grammarAccess.getAnnotationStoresAccess().getChallengeElementsChallengeStoreParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChallengeStore();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresAccess().getChallengeElementsChallengeStoreParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__ChallengeElementsAssignment_2"


    // $ANTLR start "rule__AnnotationStores__CommitmentElementsAssignment_3"
    // InternalAnnotationsStores.g:1994:1: rule__AnnotationStores__CommitmentElementsAssignment_3 : ( ruleCommitmentStore ) ;
    public final void rule__AnnotationStores__CommitmentElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1998:1: ( ( ruleCommitmentStore ) )
            // InternalAnnotationsStores.g:1999:2: ( ruleCommitmentStore )
            {
            // InternalAnnotationsStores.g:1999:2: ( ruleCommitmentStore )
            // InternalAnnotationsStores.g:2000:3: ruleCommitmentStore
            {
             before(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsCommitmentStoreParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommitmentStore();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsCommitmentStoreParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__CommitmentElementsAssignment_3"


    // $ANTLR start "rule__AnnotationStores__ArgumentElementsAssignment_4"
    // InternalAnnotationsStores.g:2009:1: rule__AnnotationStores__ArgumentElementsAssignment_4 : ( ruleArgumentStore ) ;
    public final void rule__AnnotationStores__ArgumentElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2013:1: ( ( ruleArgumentStore ) )
            // InternalAnnotationsStores.g:2014:2: ( ruleArgumentStore )
            {
            // InternalAnnotationsStores.g:2014:2: ( ruleArgumentStore )
            // InternalAnnotationsStores.g:2015:3: ruleArgumentStore
            {
             before(grammarAccess.getAnnotationStoresAccess().getArgumentElementsArgumentStoreParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArgumentStore();

            state._fsp--;

             after(grammarAccess.getAnnotationStoresAccess().getArgumentElementsArgumentStoreParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationStores__ArgumentElementsAssignment_4"


    // $ANTLR start "rule__ProposalStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2024:1: rule__ProposalStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProposalStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2028:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2029:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2029:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2030:3: RULE_ID
            {
             before(grammarAccess.getProposalStoreAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__NameAssignment_2"


    // $ANTLR start "rule__ProposalStore__ScopeAssignment_4"
    // InternalAnnotationsStores.g:2039:1: rule__ProposalStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__ProposalStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2043:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2044:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2044:2: ( ruleScope )
            // InternalAnnotationsStores.g:2045:3: ruleScope
            {
             before(grammarAccess.getProposalStoreAccess().getScopeScopeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getProposalStoreAccess().getScopeScopeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__ScopeAssignment_4"


    // $ANTLR start "rule__ProposalStore__FocusAssignment_6"
    // InternalAnnotationsStores.g:2054:1: rule__ProposalStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__ProposalStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2058:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2059:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2059:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2060:3: ruleFocus
            {
             before(grammarAccess.getProposalStoreAccess().getFocusFocusParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getProposalStoreAccess().getFocusFocusParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__FocusAssignment_6"


    // $ANTLR start "rule__ProposalStore__ContentAssignment_8"
    // InternalAnnotationsStores.g:2069:1: rule__ProposalStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ProposalStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2073:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2074:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2074:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2075:3: RULE_STRING
            {
             before(grammarAccess.getProposalStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProposalStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProposalStore__ContentAssignment_8"


    // $ANTLR start "rule__QuestionStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2084:1: rule__QuestionStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QuestionStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2088:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2089:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2089:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2090:3: RULE_ID
            {
             before(grammarAccess.getQuestionStoreAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__NameAssignment_2"


    // $ANTLR start "rule__QuestionStore__SenderAssignment_4"
    // InternalAnnotationsStores.g:2099:1: rule__QuestionStore__SenderAssignment_4 : ( ruleSender ) ;
    public final void rule__QuestionStore__SenderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2103:1: ( ( ruleSender ) )
            // InternalAnnotationsStores.g:2104:2: ( ruleSender )
            {
            // InternalAnnotationsStores.g:2104:2: ( ruleSender )
            // InternalAnnotationsStores.g:2105:3: ruleSender
            {
             before(grammarAccess.getQuestionStoreAccess().getSenderSenderParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSender();

            state._fsp--;

             after(grammarAccess.getQuestionStoreAccess().getSenderSenderParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__SenderAssignment_4"


    // $ANTLR start "rule__QuestionStore__ScopeAssignment_6"
    // InternalAnnotationsStores.g:2114:1: rule__QuestionStore__ScopeAssignment_6 : ( ruleScope ) ;
    public final void rule__QuestionStore__ScopeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2118:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2119:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2119:2: ( ruleScope )
            // InternalAnnotationsStores.g:2120:3: ruleScope
            {
             before(grammarAccess.getQuestionStoreAccess().getScopeScopeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getQuestionStoreAccess().getScopeScopeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__ScopeAssignment_6"


    // $ANTLR start "rule__QuestionStore__FocusAssignment_8"
    // InternalAnnotationsStores.g:2129:1: rule__QuestionStore__FocusAssignment_8 : ( ruleFocus ) ;
    public final void rule__QuestionStore__FocusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2133:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2134:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2134:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2135:3: ruleFocus
            {
             before(grammarAccess.getQuestionStoreAccess().getFocusFocusParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getQuestionStoreAccess().getFocusFocusParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__FocusAssignment_8"


    // $ANTLR start "rule__QuestionStore__ContentAssignment_10"
    // InternalAnnotationsStores.g:2144:1: rule__QuestionStore__ContentAssignment_10 : ( RULE_STRING ) ;
    public final void rule__QuestionStore__ContentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2148:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2149:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2149:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2150:3: RULE_STRING
            {
             before(grammarAccess.getQuestionStoreAccess().getContentSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionStoreAccess().getContentSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionStore__ContentAssignment_10"


    // $ANTLR start "rule__ChallengeStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2159:1: rule__ChallengeStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChallengeStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2163:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2164:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2164:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2165:3: RULE_ID
            {
             before(grammarAccess.getChallengeStoreAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__NameAssignment_2"


    // $ANTLR start "rule__ChallengeStore__SenderAssignment_4"
    // InternalAnnotationsStores.g:2174:1: rule__ChallengeStore__SenderAssignment_4 : ( ruleSender ) ;
    public final void rule__ChallengeStore__SenderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2178:1: ( ( ruleSender ) )
            // InternalAnnotationsStores.g:2179:2: ( ruleSender )
            {
            // InternalAnnotationsStores.g:2179:2: ( ruleSender )
            // InternalAnnotationsStores.g:2180:3: ruleSender
            {
             before(grammarAccess.getChallengeStoreAccess().getSenderSenderParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSender();

            state._fsp--;

             after(grammarAccess.getChallengeStoreAccess().getSenderSenderParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__SenderAssignment_4"


    // $ANTLR start "rule__ChallengeStore__TargetAssignment_5_1"
    // InternalAnnotationsStores.g:2189:1: rule__ChallengeStore__TargetAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ChallengeStore__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2193:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2194:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2194:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2195:3: RULE_ID
            {
             before(grammarAccess.getChallengeStoreAccess().getTargetIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChallengeStoreAccess().getTargetIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChallengeStore__TargetAssignment_5_1"


    // $ANTLR start "rule__CommitmentStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2204:1: rule__CommitmentStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommitmentStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2208:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2209:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2209:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2210:3: RULE_ID
            {
             before(grammarAccess.getCommitmentStoreAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__NameAssignment_2"


    // $ANTLR start "rule__CommitmentStore__ScopeAssignment_4"
    // InternalAnnotationsStores.g:2219:1: rule__CommitmentStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__CommitmentStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2223:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2224:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2224:2: ( ruleScope )
            // InternalAnnotationsStores.g:2225:3: ruleScope
            {
             before(grammarAccess.getCommitmentStoreAccess().getScopeScopeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getCommitmentStoreAccess().getScopeScopeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__ScopeAssignment_4"


    // $ANTLR start "rule__CommitmentStore__FocusAssignment_6"
    // InternalAnnotationsStores.g:2234:1: rule__CommitmentStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__CommitmentStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2238:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2239:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2239:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2240:3: ruleFocus
            {
             before(grammarAccess.getCommitmentStoreAccess().getFocusFocusParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getCommitmentStoreAccess().getFocusFocusParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__FocusAssignment_6"


    // $ANTLR start "rule__CommitmentStore__ContentAssignment_8"
    // InternalAnnotationsStores.g:2249:1: rule__CommitmentStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CommitmentStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2253:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2254:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2254:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2255:3: RULE_STRING
            {
             before(grammarAccess.getCommitmentStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommitmentStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommitmentStore__ContentAssignment_8"


    // $ANTLR start "rule__ArgumentStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2264:1: rule__ArgumentStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ArgumentStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2268:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2269:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2269:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2270:3: RULE_ID
            {
             before(grammarAccess.getArgumentStoreAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__NameAssignment_2"


    // $ANTLR start "rule__ArgumentStore__ScopeAssignment_4"
    // InternalAnnotationsStores.g:2279:1: rule__ArgumentStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__ArgumentStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2283:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2284:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2284:2: ( ruleScope )
            // InternalAnnotationsStores.g:2285:3: ruleScope
            {
             before(grammarAccess.getArgumentStoreAccess().getScopeScopeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getArgumentStoreAccess().getScopeScopeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__ScopeAssignment_4"


    // $ANTLR start "rule__ArgumentStore__FocusAssignment_6"
    // InternalAnnotationsStores.g:2294:1: rule__ArgumentStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__ArgumentStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2298:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2299:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2299:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2300:3: ruleFocus
            {
             before(grammarAccess.getArgumentStoreAccess().getFocusFocusParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getArgumentStoreAccess().getFocusFocusParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__FocusAssignment_6"


    // $ANTLR start "rule__ArgumentStore__ContentAssignment_8"
    // InternalAnnotationsStores.g:2309:1: rule__ArgumentStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ArgumentStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2313:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2314:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2314:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2315:3: RULE_STRING
            {
             before(grammarAccess.getArgumentStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getContentSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__ContentAssignment_8"


    // $ANTLR start "rule__ArgumentStore__TargetAssignment_9_1"
    // InternalAnnotationsStores.g:2324:1: rule__ArgumentStore__TargetAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__ArgumentStore__TargetAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2328:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2329:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2329:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2330:3: RULE_ID
            {
             before(grammarAccess.getArgumentStoreAccess().getTargetIDTerminalRuleCall_9_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentStoreAccess().getTargetIDTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentStore__TargetAssignment_9_1"


    // $ANTLR start "rule__Scope__ScopeAssignment"
    // InternalAnnotationsStores.g:2339:1: rule__Scope__ScopeAssignment : ( ( rule__Scope__ScopeAlternatives_0 ) ) ;
    public final void rule__Scope__ScopeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2343:1: ( ( ( rule__Scope__ScopeAlternatives_0 ) ) )
            // InternalAnnotationsStores.g:2344:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            {
            // InternalAnnotationsStores.g:2344:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            // InternalAnnotationsStores.g:2345:3: ( rule__Scope__ScopeAlternatives_0 )
            {
             before(grammarAccess.getScopeAccess().getScopeAlternatives_0()); 
            // InternalAnnotationsStores.g:2346:3: ( rule__Scope__ScopeAlternatives_0 )
            // InternalAnnotationsStores.g:2346:4: rule__Scope__ScopeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Scope__ScopeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getScopeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__ScopeAssignment"


    // $ANTLR start "rule__Focus__FocusAssignment"
    // InternalAnnotationsStores.g:2354:1: rule__Focus__FocusAssignment : ( ( rule__Focus__FocusAlternatives_0 ) ) ;
    public final void rule__Focus__FocusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2358:1: ( ( ( rule__Focus__FocusAlternatives_0 ) ) )
            // InternalAnnotationsStores.g:2359:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            {
            // InternalAnnotationsStores.g:2359:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            // InternalAnnotationsStores.g:2360:3: ( rule__Focus__FocusAlternatives_0 )
            {
             before(grammarAccess.getFocusAccess().getFocusAlternatives_0()); 
            // InternalAnnotationsStores.g:2361:3: ( rule__Focus__FocusAlternatives_0 )
            // InternalAnnotationsStores.g:2361:4: rule__Focus__FocusAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Focus__FocusAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFocusAccess().getFocusAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Focus__FocusAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});

}
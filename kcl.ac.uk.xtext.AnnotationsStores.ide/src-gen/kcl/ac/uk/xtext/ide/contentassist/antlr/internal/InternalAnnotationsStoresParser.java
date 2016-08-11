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


    // $ANTLR start "entryRuleEffect"
    // InternalAnnotationsStores.g:285:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalAnnotationsStores.g:286:1: ( ruleEffect EOF )
            // InternalAnnotationsStores.g:287:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalAnnotationsStores.g:294:1: ruleEffect : ( ( rule__Effect__AffectedByAssignment ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:298:2: ( ( ( rule__Effect__AffectedByAssignment ) ) )
            // InternalAnnotationsStores.g:299:2: ( ( rule__Effect__AffectedByAssignment ) )
            {
            // InternalAnnotationsStores.g:299:2: ( ( rule__Effect__AffectedByAssignment ) )
            // InternalAnnotationsStores.g:300:3: ( rule__Effect__AffectedByAssignment )
            {
             before(grammarAccess.getEffectAccess().getAffectedByAssignment()); 
            // InternalAnnotationsStores.g:301:3: ( rule__Effect__AffectedByAssignment )
            // InternalAnnotationsStores.g:301:4: rule__Effect__AffectedByAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Effect__AffectedByAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getAffectedByAssignment()); 

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "rule__Scope__ScopeAlternatives_0"
    // InternalAnnotationsStores.g:309:1: rule__Scope__ScopeAlternatives_0 : ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) );
    public final void rule__Scope__ScopeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:313:1: ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) )
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
                    // InternalAnnotationsStores.g:314:2: ( 'feature' )
                    {
                    // InternalAnnotationsStores.g:314:2: ( 'feature' )
                    // InternalAnnotationsStores.g:315:3: 'feature'
                    {
                     before(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:320:2: ( 'rating' )
                    {
                    // InternalAnnotationsStores.g:320:2: ( 'rating' )
                    // InternalAnnotationsStores.g:321:3: 'rating'
                    {
                     before(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:326:2: ( 'criteria' )
                    {
                    // InternalAnnotationsStores.g:326:2: ( 'criteria' )
                    // InternalAnnotationsStores.g:327:3: 'criteria'
                    {
                     before(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:332:2: ( 'topic' )
                    {
                    // InternalAnnotationsStores.g:332:2: ( 'topic' )
                    // InternalAnnotationsStores.g:333:3: 'topic'
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
    // InternalAnnotationsStores.g:342:1: rule__Focus__FocusAlternatives_0 : ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) );
    public final void rule__Focus__FocusAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:346:1: ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) )
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
                    // InternalAnnotationsStores.g:347:2: ( 'R' )
                    {
                    // InternalAnnotationsStores.g:347:2: ( 'R' )
                    // InternalAnnotationsStores.g:348:3: 'R'
                    {
                     before(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotationsStores.g:353:2: ( 'S' )
                    {
                    // InternalAnnotationsStores.g:353:2: ( 'S' )
                    // InternalAnnotationsStores.g:354:3: 'S'
                    {
                     before(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotationsStores.g:359:2: ( 'G' )
                    {
                    // InternalAnnotationsStores.g:359:2: ( 'G' )
                    // InternalAnnotationsStores.g:360:3: 'G'
                    {
                     before(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotationsStores.g:365:2: ( 'V' )
                    {
                    // InternalAnnotationsStores.g:365:2: ( 'V' )
                    // InternalAnnotationsStores.g:366:3: 'V'
                    {
                     before(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnnotationsStores.g:371:2: ( 'A' )
                    {
                    // InternalAnnotationsStores.g:371:2: ( 'A' )
                    // InternalAnnotationsStores.g:372:3: 'A'
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
    // InternalAnnotationsStores.g:381:1: rule__AnnotationStores__Group__0 : rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1 ;
    public final void rule__AnnotationStores__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:385:1: ( rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1 )
            // InternalAnnotationsStores.g:386:2: rule__AnnotationStores__Group__0__Impl rule__AnnotationStores__Group__1
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
    // InternalAnnotationsStores.g:393:1: rule__AnnotationStores__Group__0__Impl : ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* ) ;
    public final void rule__AnnotationStores__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:397:1: ( ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* ) )
            // InternalAnnotationsStores.g:398:1: ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* )
            {
            // InternalAnnotationsStores.g:398:1: ( ( rule__AnnotationStores__ProposalElementsAssignment_0 )* )
            // InternalAnnotationsStores.g:399:2: ( rule__AnnotationStores__ProposalElementsAssignment_0 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getProposalElementsAssignment_0()); 
            // InternalAnnotationsStores.g:400:2: ( rule__AnnotationStores__ProposalElementsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotationsStores.g:400:3: rule__AnnotationStores__ProposalElementsAssignment_0
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
    // InternalAnnotationsStores.g:408:1: rule__AnnotationStores__Group__1 : rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2 ;
    public final void rule__AnnotationStores__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:412:1: ( rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2 )
            // InternalAnnotationsStores.g:413:2: rule__AnnotationStores__Group__1__Impl rule__AnnotationStores__Group__2
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
    // InternalAnnotationsStores.g:420:1: rule__AnnotationStores__Group__1__Impl : ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* ) ;
    public final void rule__AnnotationStores__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:424:1: ( ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* ) )
            // InternalAnnotationsStores.g:425:1: ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* )
            {
            // InternalAnnotationsStores.g:425:1: ( ( rule__AnnotationStores__QuestionElementsAssignment_1 )* )
            // InternalAnnotationsStores.g:426:2: ( rule__AnnotationStores__QuestionElementsAssignment_1 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getQuestionElementsAssignment_1()); 
            // InternalAnnotationsStores.g:427:2: ( rule__AnnotationStores__QuestionElementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotationsStores.g:427:3: rule__AnnotationStores__QuestionElementsAssignment_1
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
    // InternalAnnotationsStores.g:435:1: rule__AnnotationStores__Group__2 : rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3 ;
    public final void rule__AnnotationStores__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:439:1: ( rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3 )
            // InternalAnnotationsStores.g:440:2: rule__AnnotationStores__Group__2__Impl rule__AnnotationStores__Group__3
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
    // InternalAnnotationsStores.g:447:1: rule__AnnotationStores__Group__2__Impl : ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* ) ;
    public final void rule__AnnotationStores__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:451:1: ( ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* ) )
            // InternalAnnotationsStores.g:452:1: ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* )
            {
            // InternalAnnotationsStores.g:452:1: ( ( rule__AnnotationStores__ChallengeElementsAssignment_2 )* )
            // InternalAnnotationsStores.g:453:2: ( rule__AnnotationStores__ChallengeElementsAssignment_2 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getChallengeElementsAssignment_2()); 
            // InternalAnnotationsStores.g:454:2: ( rule__AnnotationStores__ChallengeElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnnotationsStores.g:454:3: rule__AnnotationStores__ChallengeElementsAssignment_2
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
    // InternalAnnotationsStores.g:462:1: rule__AnnotationStores__Group__3 : rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4 ;
    public final void rule__AnnotationStores__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:466:1: ( rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4 )
            // InternalAnnotationsStores.g:467:2: rule__AnnotationStores__Group__3__Impl rule__AnnotationStores__Group__4
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
    // InternalAnnotationsStores.g:474:1: rule__AnnotationStores__Group__3__Impl : ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* ) ;
    public final void rule__AnnotationStores__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:478:1: ( ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* ) )
            // InternalAnnotationsStores.g:479:1: ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* )
            {
            // InternalAnnotationsStores.g:479:1: ( ( rule__AnnotationStores__CommitmentElementsAssignment_3 )* )
            // InternalAnnotationsStores.g:480:2: ( rule__AnnotationStores__CommitmentElementsAssignment_3 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsAssignment_3()); 
            // InternalAnnotationsStores.g:481:2: ( rule__AnnotationStores__CommitmentElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnnotationsStores.g:481:3: rule__AnnotationStores__CommitmentElementsAssignment_3
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
    // InternalAnnotationsStores.g:489:1: rule__AnnotationStores__Group__4 : rule__AnnotationStores__Group__4__Impl ;
    public final void rule__AnnotationStores__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:493:1: ( rule__AnnotationStores__Group__4__Impl )
            // InternalAnnotationsStores.g:494:2: rule__AnnotationStores__Group__4__Impl
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
    // InternalAnnotationsStores.g:500:1: rule__AnnotationStores__Group__4__Impl : ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* ) ;
    public final void rule__AnnotationStores__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:504:1: ( ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* ) )
            // InternalAnnotationsStores.g:505:1: ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* )
            {
            // InternalAnnotationsStores.g:505:1: ( ( rule__AnnotationStores__ArgumentElementsAssignment_4 )* )
            // InternalAnnotationsStores.g:506:2: ( rule__AnnotationStores__ArgumentElementsAssignment_4 )*
            {
             before(grammarAccess.getAnnotationStoresAccess().getArgumentElementsAssignment_4()); 
            // InternalAnnotationsStores.g:507:2: ( rule__AnnotationStores__ArgumentElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnnotationsStores.g:507:3: rule__AnnotationStores__ArgumentElementsAssignment_4
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
    // InternalAnnotationsStores.g:516:1: rule__ProposalStore__Group__0 : rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1 ;
    public final void rule__ProposalStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:520:1: ( rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1 )
            // InternalAnnotationsStores.g:521:2: rule__ProposalStore__Group__0__Impl rule__ProposalStore__Group__1
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
    // InternalAnnotationsStores.g:528:1: rule__ProposalStore__Group__0__Impl : ( 'proposalElement' ) ;
    public final void rule__ProposalStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:532:1: ( ( 'proposalElement' ) )
            // InternalAnnotationsStores.g:533:1: ( 'proposalElement' )
            {
            // InternalAnnotationsStores.g:533:1: ( 'proposalElement' )
            // InternalAnnotationsStores.g:534:2: 'proposalElement'
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
    // InternalAnnotationsStores.g:543:1: rule__ProposalStore__Group__1 : rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2 ;
    public final void rule__ProposalStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:547:1: ( rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2 )
            // InternalAnnotationsStores.g:548:2: rule__ProposalStore__Group__1__Impl rule__ProposalStore__Group__2
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
    // InternalAnnotationsStores.g:555:1: rule__ProposalStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ProposalStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:559:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:560:1: ( '(' )
            {
            // InternalAnnotationsStores.g:560:1: ( '(' )
            // InternalAnnotationsStores.g:561:2: '('
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
    // InternalAnnotationsStores.g:570:1: rule__ProposalStore__Group__2 : rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3 ;
    public final void rule__ProposalStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:574:1: ( rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3 )
            // InternalAnnotationsStores.g:575:2: rule__ProposalStore__Group__2__Impl rule__ProposalStore__Group__3
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
    // InternalAnnotationsStores.g:582:1: rule__ProposalStore__Group__2__Impl : ( ( rule__ProposalStore__NameAssignment_2 ) ) ;
    public final void rule__ProposalStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:586:1: ( ( ( rule__ProposalStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:587:1: ( ( rule__ProposalStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:587:1: ( ( rule__ProposalStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:588:2: ( rule__ProposalStore__NameAssignment_2 )
            {
             before(grammarAccess.getProposalStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:589:2: ( rule__ProposalStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:589:3: rule__ProposalStore__NameAssignment_2
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
    // InternalAnnotationsStores.g:597:1: rule__ProposalStore__Group__3 : rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4 ;
    public final void rule__ProposalStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:601:1: ( rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4 )
            // InternalAnnotationsStores.g:602:2: rule__ProposalStore__Group__3__Impl rule__ProposalStore__Group__4
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
    // InternalAnnotationsStores.g:609:1: rule__ProposalStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:613:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:614:1: ( ',' )
            {
            // InternalAnnotationsStores.g:614:1: ( ',' )
            // InternalAnnotationsStores.g:615:2: ','
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
    // InternalAnnotationsStores.g:624:1: rule__ProposalStore__Group__4 : rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5 ;
    public final void rule__ProposalStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:628:1: ( rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5 )
            // InternalAnnotationsStores.g:629:2: rule__ProposalStore__Group__4__Impl rule__ProposalStore__Group__5
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
    // InternalAnnotationsStores.g:636:1: rule__ProposalStore__Group__4__Impl : ( ( rule__ProposalStore__ScopeAssignment_4 ) ) ;
    public final void rule__ProposalStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:640:1: ( ( ( rule__ProposalStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:641:1: ( ( rule__ProposalStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:641:1: ( ( rule__ProposalStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:642:2: ( rule__ProposalStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getProposalStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:643:2: ( rule__ProposalStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:643:3: rule__ProposalStore__ScopeAssignment_4
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
    // InternalAnnotationsStores.g:651:1: rule__ProposalStore__Group__5 : rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6 ;
    public final void rule__ProposalStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:655:1: ( rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6 )
            // InternalAnnotationsStores.g:656:2: rule__ProposalStore__Group__5__Impl rule__ProposalStore__Group__6
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
    // InternalAnnotationsStores.g:663:1: rule__ProposalStore__Group__5__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:667:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:668:1: ( ',' )
            {
            // InternalAnnotationsStores.g:668:1: ( ',' )
            // InternalAnnotationsStores.g:669:2: ','
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
    // InternalAnnotationsStores.g:678:1: rule__ProposalStore__Group__6 : rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7 ;
    public final void rule__ProposalStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:682:1: ( rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7 )
            // InternalAnnotationsStores.g:683:2: rule__ProposalStore__Group__6__Impl rule__ProposalStore__Group__7
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
    // InternalAnnotationsStores.g:690:1: rule__ProposalStore__Group__6__Impl : ( ( rule__ProposalStore__FocusAssignment_6 ) ) ;
    public final void rule__ProposalStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:694:1: ( ( ( rule__ProposalStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:695:1: ( ( rule__ProposalStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:695:1: ( ( rule__ProposalStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:696:2: ( rule__ProposalStore__FocusAssignment_6 )
            {
             before(grammarAccess.getProposalStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:697:2: ( rule__ProposalStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:697:3: rule__ProposalStore__FocusAssignment_6
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
    // InternalAnnotationsStores.g:705:1: rule__ProposalStore__Group__7 : rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8 ;
    public final void rule__ProposalStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:709:1: ( rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8 )
            // InternalAnnotationsStores.g:710:2: rule__ProposalStore__Group__7__Impl rule__ProposalStore__Group__8
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
    // InternalAnnotationsStores.g:717:1: rule__ProposalStore__Group__7__Impl : ( ',' ) ;
    public final void rule__ProposalStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:721:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:722:1: ( ',' )
            {
            // InternalAnnotationsStores.g:722:1: ( ',' )
            // InternalAnnotationsStores.g:723:2: ','
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
    // InternalAnnotationsStores.g:732:1: rule__ProposalStore__Group__8 : rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9 ;
    public final void rule__ProposalStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:736:1: ( rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9 )
            // InternalAnnotationsStores.g:737:2: rule__ProposalStore__Group__8__Impl rule__ProposalStore__Group__9
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
    // InternalAnnotationsStores.g:744:1: rule__ProposalStore__Group__8__Impl : ( ( rule__ProposalStore__ContentAssignment_8 ) ) ;
    public final void rule__ProposalStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:748:1: ( ( ( rule__ProposalStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:749:1: ( ( rule__ProposalStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:749:1: ( ( rule__ProposalStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:750:2: ( rule__ProposalStore__ContentAssignment_8 )
            {
             before(grammarAccess.getProposalStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:751:2: ( rule__ProposalStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:751:3: rule__ProposalStore__ContentAssignment_8
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
    // InternalAnnotationsStores.g:759:1: rule__ProposalStore__Group__9 : rule__ProposalStore__Group__9__Impl rule__ProposalStore__Group__10 ;
    public final void rule__ProposalStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:763:1: ( rule__ProposalStore__Group__9__Impl rule__ProposalStore__Group__10 )
            // InternalAnnotationsStores.g:764:2: rule__ProposalStore__Group__9__Impl rule__ProposalStore__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ProposalStore__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__10();

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
    // InternalAnnotationsStores.g:771:1: rule__ProposalStore__Group__9__Impl : ( ')' ) ;
    public final void rule__ProposalStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:775:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:776:1: ( ')' )
            {
            // InternalAnnotationsStores.g:776:1: ( ')' )
            // InternalAnnotationsStores.g:777:2: ')'
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


    // $ANTLR start "rule__ProposalStore__Group__10"
    // InternalAnnotationsStores.g:786:1: rule__ProposalStore__Group__10 : rule__ProposalStore__Group__10__Impl ;
    public final void rule__ProposalStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:790:1: ( rule__ProposalStore__Group__10__Impl )
            // InternalAnnotationsStores.g:791:2: rule__ProposalStore__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProposalStore__Group__10__Impl();

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
    // $ANTLR end "rule__ProposalStore__Group__10"


    // $ANTLR start "rule__ProposalStore__Group__10__Impl"
    // InternalAnnotationsStores.g:797:1: rule__ProposalStore__Group__10__Impl : ( ( rule__ProposalStore__EffectAssignment_10 )? ) ;
    public final void rule__ProposalStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:801:1: ( ( ( rule__ProposalStore__EffectAssignment_10 )? ) )
            // InternalAnnotationsStores.g:802:1: ( ( rule__ProposalStore__EffectAssignment_10 )? )
            {
            // InternalAnnotationsStores.g:802:1: ( ( rule__ProposalStore__EffectAssignment_10 )? )
            // InternalAnnotationsStores.g:803:2: ( rule__ProposalStore__EffectAssignment_10 )?
            {
             before(grammarAccess.getProposalStoreAccess().getEffectAssignment_10()); 
            // InternalAnnotationsStores.g:804:2: ( rule__ProposalStore__EffectAssignment_10 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnnotationsStores.g:804:3: rule__ProposalStore__EffectAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProposalStore__EffectAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProposalStoreAccess().getEffectAssignment_10()); 

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
    // $ANTLR end "rule__ProposalStore__Group__10__Impl"


    // $ANTLR start "rule__QuestionStore__Group__0"
    // InternalAnnotationsStores.g:813:1: rule__QuestionStore__Group__0 : rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1 ;
    public final void rule__QuestionStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:817:1: ( rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1 )
            // InternalAnnotationsStores.g:818:2: rule__QuestionStore__Group__0__Impl rule__QuestionStore__Group__1
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
    // InternalAnnotationsStores.g:825:1: rule__QuestionStore__Group__0__Impl : ( 'questionElement' ) ;
    public final void rule__QuestionStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:829:1: ( ( 'questionElement' ) )
            // InternalAnnotationsStores.g:830:1: ( 'questionElement' )
            {
            // InternalAnnotationsStores.g:830:1: ( 'questionElement' )
            // InternalAnnotationsStores.g:831:2: 'questionElement'
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
    // InternalAnnotationsStores.g:840:1: rule__QuestionStore__Group__1 : rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2 ;
    public final void rule__QuestionStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:844:1: ( rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2 )
            // InternalAnnotationsStores.g:845:2: rule__QuestionStore__Group__1__Impl rule__QuestionStore__Group__2
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
    // InternalAnnotationsStores.g:852:1: rule__QuestionStore__Group__1__Impl : ( '(' ) ;
    public final void rule__QuestionStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:856:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:857:1: ( '(' )
            {
            // InternalAnnotationsStores.g:857:1: ( '(' )
            // InternalAnnotationsStores.g:858:2: '('
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
    // InternalAnnotationsStores.g:867:1: rule__QuestionStore__Group__2 : rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3 ;
    public final void rule__QuestionStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:871:1: ( rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3 )
            // InternalAnnotationsStores.g:872:2: rule__QuestionStore__Group__2__Impl rule__QuestionStore__Group__3
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
    // InternalAnnotationsStores.g:879:1: rule__QuestionStore__Group__2__Impl : ( ( rule__QuestionStore__NameAssignment_2 ) ) ;
    public final void rule__QuestionStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:883:1: ( ( ( rule__QuestionStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:884:1: ( ( rule__QuestionStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:884:1: ( ( rule__QuestionStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:885:2: ( rule__QuestionStore__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:886:2: ( rule__QuestionStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:886:3: rule__QuestionStore__NameAssignment_2
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
    // InternalAnnotationsStores.g:894:1: rule__QuestionStore__Group__3 : rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4 ;
    public final void rule__QuestionStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:898:1: ( rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4 )
            // InternalAnnotationsStores.g:899:2: rule__QuestionStore__Group__3__Impl rule__QuestionStore__Group__4
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
    // InternalAnnotationsStores.g:906:1: rule__QuestionStore__Group__3__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:910:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:911:1: ( ',' )
            {
            // InternalAnnotationsStores.g:911:1: ( ',' )
            // InternalAnnotationsStores.g:912:2: ','
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
    // InternalAnnotationsStores.g:921:1: rule__QuestionStore__Group__4 : rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5 ;
    public final void rule__QuestionStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:925:1: ( rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5 )
            // InternalAnnotationsStores.g:926:2: rule__QuestionStore__Group__4__Impl rule__QuestionStore__Group__5
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
    // InternalAnnotationsStores.g:933:1: rule__QuestionStore__Group__4__Impl : ( ( rule__QuestionStore__SenderAssignment_4 ) ) ;
    public final void rule__QuestionStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:937:1: ( ( ( rule__QuestionStore__SenderAssignment_4 ) ) )
            // InternalAnnotationsStores.g:938:1: ( ( rule__QuestionStore__SenderAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:938:1: ( ( rule__QuestionStore__SenderAssignment_4 ) )
            // InternalAnnotationsStores.g:939:2: ( rule__QuestionStore__SenderAssignment_4 )
            {
             before(grammarAccess.getQuestionStoreAccess().getSenderAssignment_4()); 
            // InternalAnnotationsStores.g:940:2: ( rule__QuestionStore__SenderAssignment_4 )
            // InternalAnnotationsStores.g:940:3: rule__QuestionStore__SenderAssignment_4
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
    // InternalAnnotationsStores.g:948:1: rule__QuestionStore__Group__5 : rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6 ;
    public final void rule__QuestionStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:952:1: ( rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6 )
            // InternalAnnotationsStores.g:953:2: rule__QuestionStore__Group__5__Impl rule__QuestionStore__Group__6
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
    // InternalAnnotationsStores.g:960:1: rule__QuestionStore__Group__5__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:964:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:965:1: ( ',' )
            {
            // InternalAnnotationsStores.g:965:1: ( ',' )
            // InternalAnnotationsStores.g:966:2: ','
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
    // InternalAnnotationsStores.g:975:1: rule__QuestionStore__Group__6 : rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7 ;
    public final void rule__QuestionStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:979:1: ( rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7 )
            // InternalAnnotationsStores.g:980:2: rule__QuestionStore__Group__6__Impl rule__QuestionStore__Group__7
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
    // InternalAnnotationsStores.g:987:1: rule__QuestionStore__Group__6__Impl : ( ( rule__QuestionStore__ScopeAssignment_6 ) ) ;
    public final void rule__QuestionStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:991:1: ( ( ( rule__QuestionStore__ScopeAssignment_6 ) ) )
            // InternalAnnotationsStores.g:992:1: ( ( rule__QuestionStore__ScopeAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:992:1: ( ( rule__QuestionStore__ScopeAssignment_6 ) )
            // InternalAnnotationsStores.g:993:2: ( rule__QuestionStore__ScopeAssignment_6 )
            {
             before(grammarAccess.getQuestionStoreAccess().getScopeAssignment_6()); 
            // InternalAnnotationsStores.g:994:2: ( rule__QuestionStore__ScopeAssignment_6 )
            // InternalAnnotationsStores.g:994:3: rule__QuestionStore__ScopeAssignment_6
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
    // InternalAnnotationsStores.g:1002:1: rule__QuestionStore__Group__7 : rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8 ;
    public final void rule__QuestionStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1006:1: ( rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8 )
            // InternalAnnotationsStores.g:1007:2: rule__QuestionStore__Group__7__Impl rule__QuestionStore__Group__8
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
    // InternalAnnotationsStores.g:1014:1: rule__QuestionStore__Group__7__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1018:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1019:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1019:1: ( ',' )
            // InternalAnnotationsStores.g:1020:2: ','
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
    // InternalAnnotationsStores.g:1029:1: rule__QuestionStore__Group__8 : rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9 ;
    public final void rule__QuestionStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1033:1: ( rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9 )
            // InternalAnnotationsStores.g:1034:2: rule__QuestionStore__Group__8__Impl rule__QuestionStore__Group__9
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
    // InternalAnnotationsStores.g:1041:1: rule__QuestionStore__Group__8__Impl : ( ( rule__QuestionStore__FocusAssignment_8 ) ) ;
    public final void rule__QuestionStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1045:1: ( ( ( rule__QuestionStore__FocusAssignment_8 ) ) )
            // InternalAnnotationsStores.g:1046:1: ( ( rule__QuestionStore__FocusAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:1046:1: ( ( rule__QuestionStore__FocusAssignment_8 ) )
            // InternalAnnotationsStores.g:1047:2: ( rule__QuestionStore__FocusAssignment_8 )
            {
             before(grammarAccess.getQuestionStoreAccess().getFocusAssignment_8()); 
            // InternalAnnotationsStores.g:1048:2: ( rule__QuestionStore__FocusAssignment_8 )
            // InternalAnnotationsStores.g:1048:3: rule__QuestionStore__FocusAssignment_8
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
    // InternalAnnotationsStores.g:1056:1: rule__QuestionStore__Group__9 : rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10 ;
    public final void rule__QuestionStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1060:1: ( rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10 )
            // InternalAnnotationsStores.g:1061:2: rule__QuestionStore__Group__9__Impl rule__QuestionStore__Group__10
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
    // InternalAnnotationsStores.g:1068:1: rule__QuestionStore__Group__9__Impl : ( ',' ) ;
    public final void rule__QuestionStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1072:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1073:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1073:1: ( ',' )
            // InternalAnnotationsStores.g:1074:2: ','
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
    // InternalAnnotationsStores.g:1083:1: rule__QuestionStore__Group__10 : rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11 ;
    public final void rule__QuestionStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1087:1: ( rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11 )
            // InternalAnnotationsStores.g:1088:2: rule__QuestionStore__Group__10__Impl rule__QuestionStore__Group__11
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
    // InternalAnnotationsStores.g:1095:1: rule__QuestionStore__Group__10__Impl : ( ( rule__QuestionStore__ContentAssignment_10 ) ) ;
    public final void rule__QuestionStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1099:1: ( ( ( rule__QuestionStore__ContentAssignment_10 ) ) )
            // InternalAnnotationsStores.g:1100:1: ( ( rule__QuestionStore__ContentAssignment_10 ) )
            {
            // InternalAnnotationsStores.g:1100:1: ( ( rule__QuestionStore__ContentAssignment_10 ) )
            // InternalAnnotationsStores.g:1101:2: ( rule__QuestionStore__ContentAssignment_10 )
            {
             before(grammarAccess.getQuestionStoreAccess().getContentAssignment_10()); 
            // InternalAnnotationsStores.g:1102:2: ( rule__QuestionStore__ContentAssignment_10 )
            // InternalAnnotationsStores.g:1102:3: rule__QuestionStore__ContentAssignment_10
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
    // InternalAnnotationsStores.g:1110:1: rule__QuestionStore__Group__11 : rule__QuestionStore__Group__11__Impl rule__QuestionStore__Group__12 ;
    public final void rule__QuestionStore__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1114:1: ( rule__QuestionStore__Group__11__Impl rule__QuestionStore__Group__12 )
            // InternalAnnotationsStores.g:1115:2: rule__QuestionStore__Group__11__Impl rule__QuestionStore__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__QuestionStore__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__12();

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
    // InternalAnnotationsStores.g:1122:1: rule__QuestionStore__Group__11__Impl : ( ')' ) ;
    public final void rule__QuestionStore__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1126:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1127:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1127:1: ( ')' )
            // InternalAnnotationsStores.g:1128:2: ')'
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


    // $ANTLR start "rule__QuestionStore__Group__12"
    // InternalAnnotationsStores.g:1137:1: rule__QuestionStore__Group__12 : rule__QuestionStore__Group__12__Impl ;
    public final void rule__QuestionStore__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1141:1: ( rule__QuestionStore__Group__12__Impl )
            // InternalAnnotationsStores.g:1142:2: rule__QuestionStore__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionStore__Group__12__Impl();

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
    // $ANTLR end "rule__QuestionStore__Group__12"


    // $ANTLR start "rule__QuestionStore__Group__12__Impl"
    // InternalAnnotationsStores.g:1148:1: rule__QuestionStore__Group__12__Impl : ( ( rule__QuestionStore__EffectAssignment_12 )? ) ;
    public final void rule__QuestionStore__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1152:1: ( ( ( rule__QuestionStore__EffectAssignment_12 )? ) )
            // InternalAnnotationsStores.g:1153:1: ( ( rule__QuestionStore__EffectAssignment_12 )? )
            {
            // InternalAnnotationsStores.g:1153:1: ( ( rule__QuestionStore__EffectAssignment_12 )? )
            // InternalAnnotationsStores.g:1154:2: ( rule__QuestionStore__EffectAssignment_12 )?
            {
             before(grammarAccess.getQuestionStoreAccess().getEffectAssignment_12()); 
            // InternalAnnotationsStores.g:1155:2: ( rule__QuestionStore__EffectAssignment_12 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnnotationsStores.g:1155:3: rule__QuestionStore__EffectAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionStore__EffectAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionStoreAccess().getEffectAssignment_12()); 

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
    // $ANTLR end "rule__QuestionStore__Group__12__Impl"


    // $ANTLR start "rule__ChallengeStore__Group__0"
    // InternalAnnotationsStores.g:1164:1: rule__ChallengeStore__Group__0 : rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1 ;
    public final void rule__ChallengeStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1168:1: ( rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1 )
            // InternalAnnotationsStores.g:1169:2: rule__ChallengeStore__Group__0__Impl rule__ChallengeStore__Group__1
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
    // InternalAnnotationsStores.g:1176:1: rule__ChallengeStore__Group__0__Impl : ( 'challengeElement' ) ;
    public final void rule__ChallengeStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1180:1: ( ( 'challengeElement' ) )
            // InternalAnnotationsStores.g:1181:1: ( 'challengeElement' )
            {
            // InternalAnnotationsStores.g:1181:1: ( 'challengeElement' )
            // InternalAnnotationsStores.g:1182:2: 'challengeElement'
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
    // InternalAnnotationsStores.g:1191:1: rule__ChallengeStore__Group__1 : rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2 ;
    public final void rule__ChallengeStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1195:1: ( rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2 )
            // InternalAnnotationsStores.g:1196:2: rule__ChallengeStore__Group__1__Impl rule__ChallengeStore__Group__2
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
    // InternalAnnotationsStores.g:1203:1: rule__ChallengeStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ChallengeStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1207:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1208:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1208:1: ( '(' )
            // InternalAnnotationsStores.g:1209:2: '('
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
    // InternalAnnotationsStores.g:1218:1: rule__ChallengeStore__Group__2 : rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3 ;
    public final void rule__ChallengeStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1222:1: ( rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3 )
            // InternalAnnotationsStores.g:1223:2: rule__ChallengeStore__Group__2__Impl rule__ChallengeStore__Group__3
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
    // InternalAnnotationsStores.g:1230:1: rule__ChallengeStore__Group__2__Impl : ( ( rule__ChallengeStore__NameAssignment_2 ) ) ;
    public final void rule__ChallengeStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1234:1: ( ( ( rule__ChallengeStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1235:1: ( ( rule__ChallengeStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1235:1: ( ( rule__ChallengeStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1236:2: ( rule__ChallengeStore__NameAssignment_2 )
            {
             before(grammarAccess.getChallengeStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1237:2: ( rule__ChallengeStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1237:3: rule__ChallengeStore__NameAssignment_2
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
    // InternalAnnotationsStores.g:1245:1: rule__ChallengeStore__Group__3 : rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4 ;
    public final void rule__ChallengeStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1249:1: ( rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4 )
            // InternalAnnotationsStores.g:1250:2: rule__ChallengeStore__Group__3__Impl rule__ChallengeStore__Group__4
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
    // InternalAnnotationsStores.g:1257:1: rule__ChallengeStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ChallengeStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1261:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1262:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1262:1: ( ',' )
            // InternalAnnotationsStores.g:1263:2: ','
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
    // InternalAnnotationsStores.g:1272:1: rule__ChallengeStore__Group__4 : rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5 ;
    public final void rule__ChallengeStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1276:1: ( rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5 )
            // InternalAnnotationsStores.g:1277:2: rule__ChallengeStore__Group__4__Impl rule__ChallengeStore__Group__5
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
    // InternalAnnotationsStores.g:1284:1: rule__ChallengeStore__Group__4__Impl : ( ( rule__ChallengeStore__SenderAssignment_4 ) ) ;
    public final void rule__ChallengeStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1288:1: ( ( ( rule__ChallengeStore__SenderAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1289:1: ( ( rule__ChallengeStore__SenderAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1289:1: ( ( rule__ChallengeStore__SenderAssignment_4 ) )
            // InternalAnnotationsStores.g:1290:2: ( rule__ChallengeStore__SenderAssignment_4 )
            {
             before(grammarAccess.getChallengeStoreAccess().getSenderAssignment_4()); 
            // InternalAnnotationsStores.g:1291:2: ( rule__ChallengeStore__SenderAssignment_4 )
            // InternalAnnotationsStores.g:1291:3: rule__ChallengeStore__SenderAssignment_4
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
    // InternalAnnotationsStores.g:1299:1: rule__ChallengeStore__Group__5 : rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6 ;
    public final void rule__ChallengeStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1303:1: ( rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6 )
            // InternalAnnotationsStores.g:1304:2: rule__ChallengeStore__Group__5__Impl rule__ChallengeStore__Group__6
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
    // InternalAnnotationsStores.g:1311:1: rule__ChallengeStore__Group__5__Impl : ( ( rule__ChallengeStore__Group_5__0 )? ) ;
    public final void rule__ChallengeStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1315:1: ( ( ( rule__ChallengeStore__Group_5__0 )? ) )
            // InternalAnnotationsStores.g:1316:1: ( ( rule__ChallengeStore__Group_5__0 )? )
            {
            // InternalAnnotationsStores.g:1316:1: ( ( rule__ChallengeStore__Group_5__0 )? )
            // InternalAnnotationsStores.g:1317:2: ( rule__ChallengeStore__Group_5__0 )?
            {
             before(grammarAccess.getChallengeStoreAccess().getGroup_5()); 
            // InternalAnnotationsStores.g:1318:2: ( rule__ChallengeStore__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAnnotationsStores.g:1318:3: rule__ChallengeStore__Group_5__0
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
    // InternalAnnotationsStores.g:1326:1: rule__ChallengeStore__Group__6 : rule__ChallengeStore__Group__6__Impl rule__ChallengeStore__Group__7 ;
    public final void rule__ChallengeStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1330:1: ( rule__ChallengeStore__Group__6__Impl rule__ChallengeStore__Group__7 )
            // InternalAnnotationsStores.g:1331:2: rule__ChallengeStore__Group__6__Impl rule__ChallengeStore__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ChallengeStore__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__7();

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
    // InternalAnnotationsStores.g:1338:1: rule__ChallengeStore__Group__6__Impl : ( ')' ) ;
    public final void rule__ChallengeStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1342:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1343:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1343:1: ( ')' )
            // InternalAnnotationsStores.g:1344:2: ')'
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


    // $ANTLR start "rule__ChallengeStore__Group__7"
    // InternalAnnotationsStores.g:1353:1: rule__ChallengeStore__Group__7 : rule__ChallengeStore__Group__7__Impl ;
    public final void rule__ChallengeStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1357:1: ( rule__ChallengeStore__Group__7__Impl )
            // InternalAnnotationsStores.g:1358:2: rule__ChallengeStore__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChallengeStore__Group__7__Impl();

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
    // $ANTLR end "rule__ChallengeStore__Group__7"


    // $ANTLR start "rule__ChallengeStore__Group__7__Impl"
    // InternalAnnotationsStores.g:1364:1: rule__ChallengeStore__Group__7__Impl : ( ( rule__ChallengeStore__EffectAssignment_7 )? ) ;
    public final void rule__ChallengeStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1368:1: ( ( ( rule__ChallengeStore__EffectAssignment_7 )? ) )
            // InternalAnnotationsStores.g:1369:1: ( ( rule__ChallengeStore__EffectAssignment_7 )? )
            {
            // InternalAnnotationsStores.g:1369:1: ( ( rule__ChallengeStore__EffectAssignment_7 )? )
            // InternalAnnotationsStores.g:1370:2: ( rule__ChallengeStore__EffectAssignment_7 )?
            {
             before(grammarAccess.getChallengeStoreAccess().getEffectAssignment_7()); 
            // InternalAnnotationsStores.g:1371:2: ( rule__ChallengeStore__EffectAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnnotationsStores.g:1371:3: rule__ChallengeStore__EffectAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChallengeStore__EffectAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChallengeStoreAccess().getEffectAssignment_7()); 

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
    // $ANTLR end "rule__ChallengeStore__Group__7__Impl"


    // $ANTLR start "rule__ChallengeStore__Group_5__0"
    // InternalAnnotationsStores.g:1380:1: rule__ChallengeStore__Group_5__0 : rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1 ;
    public final void rule__ChallengeStore__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1384:1: ( rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1 )
            // InternalAnnotationsStores.g:1385:2: rule__ChallengeStore__Group_5__0__Impl rule__ChallengeStore__Group_5__1
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
    // InternalAnnotationsStores.g:1392:1: rule__ChallengeStore__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ChallengeStore__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1396:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1397:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1397:1: ( ',' )
            // InternalAnnotationsStores.g:1398:2: ','
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
    // InternalAnnotationsStores.g:1407:1: rule__ChallengeStore__Group_5__1 : rule__ChallengeStore__Group_5__1__Impl ;
    public final void rule__ChallengeStore__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1411:1: ( rule__ChallengeStore__Group_5__1__Impl )
            // InternalAnnotationsStores.g:1412:2: rule__ChallengeStore__Group_5__1__Impl
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
    // InternalAnnotationsStores.g:1418:1: rule__ChallengeStore__Group_5__1__Impl : ( ( rule__ChallengeStore__TargetAssignment_5_1 ) ) ;
    public final void rule__ChallengeStore__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1422:1: ( ( ( rule__ChallengeStore__TargetAssignment_5_1 ) ) )
            // InternalAnnotationsStores.g:1423:1: ( ( rule__ChallengeStore__TargetAssignment_5_1 ) )
            {
            // InternalAnnotationsStores.g:1423:1: ( ( rule__ChallengeStore__TargetAssignment_5_1 ) )
            // InternalAnnotationsStores.g:1424:2: ( rule__ChallengeStore__TargetAssignment_5_1 )
            {
             before(grammarAccess.getChallengeStoreAccess().getTargetAssignment_5_1()); 
            // InternalAnnotationsStores.g:1425:2: ( rule__ChallengeStore__TargetAssignment_5_1 )
            // InternalAnnotationsStores.g:1425:3: rule__ChallengeStore__TargetAssignment_5_1
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
    // InternalAnnotationsStores.g:1434:1: rule__CommitmentStore__Group__0 : rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1 ;
    public final void rule__CommitmentStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1438:1: ( rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1 )
            // InternalAnnotationsStores.g:1439:2: rule__CommitmentStore__Group__0__Impl rule__CommitmentStore__Group__1
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
    // InternalAnnotationsStores.g:1446:1: rule__CommitmentStore__Group__0__Impl : ( 'commitmentElement' ) ;
    public final void rule__CommitmentStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1450:1: ( ( 'commitmentElement' ) )
            // InternalAnnotationsStores.g:1451:1: ( 'commitmentElement' )
            {
            // InternalAnnotationsStores.g:1451:1: ( 'commitmentElement' )
            // InternalAnnotationsStores.g:1452:2: 'commitmentElement'
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
    // InternalAnnotationsStores.g:1461:1: rule__CommitmentStore__Group__1 : rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2 ;
    public final void rule__CommitmentStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1465:1: ( rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2 )
            // InternalAnnotationsStores.g:1466:2: rule__CommitmentStore__Group__1__Impl rule__CommitmentStore__Group__2
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
    // InternalAnnotationsStores.g:1473:1: rule__CommitmentStore__Group__1__Impl : ( '(' ) ;
    public final void rule__CommitmentStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1477:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1478:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1478:1: ( '(' )
            // InternalAnnotationsStores.g:1479:2: '('
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
    // InternalAnnotationsStores.g:1488:1: rule__CommitmentStore__Group__2 : rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3 ;
    public final void rule__CommitmentStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1492:1: ( rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3 )
            // InternalAnnotationsStores.g:1493:2: rule__CommitmentStore__Group__2__Impl rule__CommitmentStore__Group__3
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
    // InternalAnnotationsStores.g:1500:1: rule__CommitmentStore__Group__2__Impl : ( ( rule__CommitmentStore__NameAssignment_2 ) ) ;
    public final void rule__CommitmentStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1504:1: ( ( ( rule__CommitmentStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1505:1: ( ( rule__CommitmentStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1505:1: ( ( rule__CommitmentStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1506:2: ( rule__CommitmentStore__NameAssignment_2 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1507:2: ( rule__CommitmentStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1507:3: rule__CommitmentStore__NameAssignment_2
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
    // InternalAnnotationsStores.g:1515:1: rule__CommitmentStore__Group__3 : rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4 ;
    public final void rule__CommitmentStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1519:1: ( rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4 )
            // InternalAnnotationsStores.g:1520:2: rule__CommitmentStore__Group__3__Impl rule__CommitmentStore__Group__4
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
    // InternalAnnotationsStores.g:1527:1: rule__CommitmentStore__Group__3__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1531:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1532:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1532:1: ( ',' )
            // InternalAnnotationsStores.g:1533:2: ','
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
    // InternalAnnotationsStores.g:1542:1: rule__CommitmentStore__Group__4 : rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5 ;
    public final void rule__CommitmentStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1546:1: ( rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5 )
            // InternalAnnotationsStores.g:1547:2: rule__CommitmentStore__Group__4__Impl rule__CommitmentStore__Group__5
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
    // InternalAnnotationsStores.g:1554:1: rule__CommitmentStore__Group__4__Impl : ( ( rule__CommitmentStore__ScopeAssignment_4 ) ) ;
    public final void rule__CommitmentStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1558:1: ( ( ( rule__CommitmentStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1559:1: ( ( rule__CommitmentStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1559:1: ( ( rule__CommitmentStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:1560:2: ( rule__CommitmentStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:1561:2: ( rule__CommitmentStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:1561:3: rule__CommitmentStore__ScopeAssignment_4
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
    // InternalAnnotationsStores.g:1569:1: rule__CommitmentStore__Group__5 : rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6 ;
    public final void rule__CommitmentStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1573:1: ( rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6 )
            // InternalAnnotationsStores.g:1574:2: rule__CommitmentStore__Group__5__Impl rule__CommitmentStore__Group__6
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
    // InternalAnnotationsStores.g:1581:1: rule__CommitmentStore__Group__5__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1585:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1586:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1586:1: ( ',' )
            // InternalAnnotationsStores.g:1587:2: ','
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
    // InternalAnnotationsStores.g:1596:1: rule__CommitmentStore__Group__6 : rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7 ;
    public final void rule__CommitmentStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1600:1: ( rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7 )
            // InternalAnnotationsStores.g:1601:2: rule__CommitmentStore__Group__6__Impl rule__CommitmentStore__Group__7
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
    // InternalAnnotationsStores.g:1608:1: rule__CommitmentStore__Group__6__Impl : ( ( rule__CommitmentStore__FocusAssignment_6 ) ) ;
    public final void rule__CommitmentStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1612:1: ( ( ( rule__CommitmentStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:1613:1: ( ( rule__CommitmentStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:1613:1: ( ( rule__CommitmentStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:1614:2: ( rule__CommitmentStore__FocusAssignment_6 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:1615:2: ( rule__CommitmentStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:1615:3: rule__CommitmentStore__FocusAssignment_6
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
    // InternalAnnotationsStores.g:1623:1: rule__CommitmentStore__Group__7 : rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8 ;
    public final void rule__CommitmentStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1627:1: ( rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8 )
            // InternalAnnotationsStores.g:1628:2: rule__CommitmentStore__Group__7__Impl rule__CommitmentStore__Group__8
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
    // InternalAnnotationsStores.g:1635:1: rule__CommitmentStore__Group__7__Impl : ( ',' ) ;
    public final void rule__CommitmentStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1639:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1640:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1640:1: ( ',' )
            // InternalAnnotationsStores.g:1641:2: ','
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
    // InternalAnnotationsStores.g:1650:1: rule__CommitmentStore__Group__8 : rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9 ;
    public final void rule__CommitmentStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1654:1: ( rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9 )
            // InternalAnnotationsStores.g:1655:2: rule__CommitmentStore__Group__8__Impl rule__CommitmentStore__Group__9
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
    // InternalAnnotationsStores.g:1662:1: rule__CommitmentStore__Group__8__Impl : ( ( rule__CommitmentStore__ContentAssignment_8 ) ) ;
    public final void rule__CommitmentStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1666:1: ( ( ( rule__CommitmentStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:1667:1: ( ( rule__CommitmentStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:1667:1: ( ( rule__CommitmentStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:1668:2: ( rule__CommitmentStore__ContentAssignment_8 )
            {
             before(grammarAccess.getCommitmentStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:1669:2: ( rule__CommitmentStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:1669:3: rule__CommitmentStore__ContentAssignment_8
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
    // InternalAnnotationsStores.g:1677:1: rule__CommitmentStore__Group__9 : rule__CommitmentStore__Group__9__Impl rule__CommitmentStore__Group__10 ;
    public final void rule__CommitmentStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1681:1: ( rule__CommitmentStore__Group__9__Impl rule__CommitmentStore__Group__10 )
            // InternalAnnotationsStores.g:1682:2: rule__CommitmentStore__Group__9__Impl rule__CommitmentStore__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__CommitmentStore__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__10();

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
    // InternalAnnotationsStores.g:1689:1: rule__CommitmentStore__Group__9__Impl : ( ')' ) ;
    public final void rule__CommitmentStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1693:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:1694:1: ( ')' )
            {
            // InternalAnnotationsStores.g:1694:1: ( ')' )
            // InternalAnnotationsStores.g:1695:2: ')'
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


    // $ANTLR start "rule__CommitmentStore__Group__10"
    // InternalAnnotationsStores.g:1704:1: rule__CommitmentStore__Group__10 : rule__CommitmentStore__Group__10__Impl ;
    public final void rule__CommitmentStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1708:1: ( rule__CommitmentStore__Group__10__Impl )
            // InternalAnnotationsStores.g:1709:2: rule__CommitmentStore__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommitmentStore__Group__10__Impl();

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
    // $ANTLR end "rule__CommitmentStore__Group__10"


    // $ANTLR start "rule__CommitmentStore__Group__10__Impl"
    // InternalAnnotationsStores.g:1715:1: rule__CommitmentStore__Group__10__Impl : ( ( rule__CommitmentStore__EffectAssignment_10 )? ) ;
    public final void rule__CommitmentStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1719:1: ( ( ( rule__CommitmentStore__EffectAssignment_10 )? ) )
            // InternalAnnotationsStores.g:1720:1: ( ( rule__CommitmentStore__EffectAssignment_10 )? )
            {
            // InternalAnnotationsStores.g:1720:1: ( ( rule__CommitmentStore__EffectAssignment_10 )? )
            // InternalAnnotationsStores.g:1721:2: ( rule__CommitmentStore__EffectAssignment_10 )?
            {
             before(grammarAccess.getCommitmentStoreAccess().getEffectAssignment_10()); 
            // InternalAnnotationsStores.g:1722:2: ( rule__CommitmentStore__EffectAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAnnotationsStores.g:1722:3: rule__CommitmentStore__EffectAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommitmentStore__EffectAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommitmentStoreAccess().getEffectAssignment_10()); 

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
    // $ANTLR end "rule__CommitmentStore__Group__10__Impl"


    // $ANTLR start "rule__ArgumentStore__Group__0"
    // InternalAnnotationsStores.g:1731:1: rule__ArgumentStore__Group__0 : rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1 ;
    public final void rule__ArgumentStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1735:1: ( rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1 )
            // InternalAnnotationsStores.g:1736:2: rule__ArgumentStore__Group__0__Impl rule__ArgumentStore__Group__1
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
    // InternalAnnotationsStores.g:1743:1: rule__ArgumentStore__Group__0__Impl : ( 'argumentElement' ) ;
    public final void rule__ArgumentStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1747:1: ( ( 'argumentElement' ) )
            // InternalAnnotationsStores.g:1748:1: ( 'argumentElement' )
            {
            // InternalAnnotationsStores.g:1748:1: ( 'argumentElement' )
            // InternalAnnotationsStores.g:1749:2: 'argumentElement'
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
    // InternalAnnotationsStores.g:1758:1: rule__ArgumentStore__Group__1 : rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2 ;
    public final void rule__ArgumentStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1762:1: ( rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2 )
            // InternalAnnotationsStores.g:1763:2: rule__ArgumentStore__Group__1__Impl rule__ArgumentStore__Group__2
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
    // InternalAnnotationsStores.g:1770:1: rule__ArgumentStore__Group__1__Impl : ( '(' ) ;
    public final void rule__ArgumentStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1774:1: ( ( '(' ) )
            // InternalAnnotationsStores.g:1775:1: ( '(' )
            {
            // InternalAnnotationsStores.g:1775:1: ( '(' )
            // InternalAnnotationsStores.g:1776:2: '('
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
    // InternalAnnotationsStores.g:1785:1: rule__ArgumentStore__Group__2 : rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3 ;
    public final void rule__ArgumentStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1789:1: ( rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3 )
            // InternalAnnotationsStores.g:1790:2: rule__ArgumentStore__Group__2__Impl rule__ArgumentStore__Group__3
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
    // InternalAnnotationsStores.g:1797:1: rule__ArgumentStore__Group__2__Impl : ( ( rule__ArgumentStore__NameAssignment_2 ) ) ;
    public final void rule__ArgumentStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1801:1: ( ( ( rule__ArgumentStore__NameAssignment_2 ) ) )
            // InternalAnnotationsStores.g:1802:1: ( ( rule__ArgumentStore__NameAssignment_2 ) )
            {
            // InternalAnnotationsStores.g:1802:1: ( ( rule__ArgumentStore__NameAssignment_2 ) )
            // InternalAnnotationsStores.g:1803:2: ( rule__ArgumentStore__NameAssignment_2 )
            {
             before(grammarAccess.getArgumentStoreAccess().getNameAssignment_2()); 
            // InternalAnnotationsStores.g:1804:2: ( rule__ArgumentStore__NameAssignment_2 )
            // InternalAnnotationsStores.g:1804:3: rule__ArgumentStore__NameAssignment_2
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
    // InternalAnnotationsStores.g:1812:1: rule__ArgumentStore__Group__3 : rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4 ;
    public final void rule__ArgumentStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1816:1: ( rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4 )
            // InternalAnnotationsStores.g:1817:2: rule__ArgumentStore__Group__3__Impl rule__ArgumentStore__Group__4
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
    // InternalAnnotationsStores.g:1824:1: rule__ArgumentStore__Group__3__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1828:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1829:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1829:1: ( ',' )
            // InternalAnnotationsStores.g:1830:2: ','
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
    // InternalAnnotationsStores.g:1839:1: rule__ArgumentStore__Group__4 : rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5 ;
    public final void rule__ArgumentStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1843:1: ( rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5 )
            // InternalAnnotationsStores.g:1844:2: rule__ArgumentStore__Group__4__Impl rule__ArgumentStore__Group__5
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
    // InternalAnnotationsStores.g:1851:1: rule__ArgumentStore__Group__4__Impl : ( ( rule__ArgumentStore__ScopeAssignment_4 ) ) ;
    public final void rule__ArgumentStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1855:1: ( ( ( rule__ArgumentStore__ScopeAssignment_4 ) ) )
            // InternalAnnotationsStores.g:1856:1: ( ( rule__ArgumentStore__ScopeAssignment_4 ) )
            {
            // InternalAnnotationsStores.g:1856:1: ( ( rule__ArgumentStore__ScopeAssignment_4 ) )
            // InternalAnnotationsStores.g:1857:2: ( rule__ArgumentStore__ScopeAssignment_4 )
            {
             before(grammarAccess.getArgumentStoreAccess().getScopeAssignment_4()); 
            // InternalAnnotationsStores.g:1858:2: ( rule__ArgumentStore__ScopeAssignment_4 )
            // InternalAnnotationsStores.g:1858:3: rule__ArgumentStore__ScopeAssignment_4
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
    // InternalAnnotationsStores.g:1866:1: rule__ArgumentStore__Group__5 : rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6 ;
    public final void rule__ArgumentStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1870:1: ( rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6 )
            // InternalAnnotationsStores.g:1871:2: rule__ArgumentStore__Group__5__Impl rule__ArgumentStore__Group__6
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
    // InternalAnnotationsStores.g:1878:1: rule__ArgumentStore__Group__5__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1882:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1883:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1883:1: ( ',' )
            // InternalAnnotationsStores.g:1884:2: ','
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
    // InternalAnnotationsStores.g:1893:1: rule__ArgumentStore__Group__6 : rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7 ;
    public final void rule__ArgumentStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1897:1: ( rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7 )
            // InternalAnnotationsStores.g:1898:2: rule__ArgumentStore__Group__6__Impl rule__ArgumentStore__Group__7
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
    // InternalAnnotationsStores.g:1905:1: rule__ArgumentStore__Group__6__Impl : ( ( rule__ArgumentStore__FocusAssignment_6 ) ) ;
    public final void rule__ArgumentStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1909:1: ( ( ( rule__ArgumentStore__FocusAssignment_6 ) ) )
            // InternalAnnotationsStores.g:1910:1: ( ( rule__ArgumentStore__FocusAssignment_6 ) )
            {
            // InternalAnnotationsStores.g:1910:1: ( ( rule__ArgumentStore__FocusAssignment_6 ) )
            // InternalAnnotationsStores.g:1911:2: ( rule__ArgumentStore__FocusAssignment_6 )
            {
             before(grammarAccess.getArgumentStoreAccess().getFocusAssignment_6()); 
            // InternalAnnotationsStores.g:1912:2: ( rule__ArgumentStore__FocusAssignment_6 )
            // InternalAnnotationsStores.g:1912:3: rule__ArgumentStore__FocusAssignment_6
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
    // InternalAnnotationsStores.g:1920:1: rule__ArgumentStore__Group__7 : rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8 ;
    public final void rule__ArgumentStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1924:1: ( rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8 )
            // InternalAnnotationsStores.g:1925:2: rule__ArgumentStore__Group__7__Impl rule__ArgumentStore__Group__8
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
    // InternalAnnotationsStores.g:1932:1: rule__ArgumentStore__Group__7__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1936:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:1937:1: ( ',' )
            {
            // InternalAnnotationsStores.g:1937:1: ( ',' )
            // InternalAnnotationsStores.g:1938:2: ','
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
    // InternalAnnotationsStores.g:1947:1: rule__ArgumentStore__Group__8 : rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9 ;
    public final void rule__ArgumentStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1951:1: ( rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9 )
            // InternalAnnotationsStores.g:1952:2: rule__ArgumentStore__Group__8__Impl rule__ArgumentStore__Group__9
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
    // InternalAnnotationsStores.g:1959:1: rule__ArgumentStore__Group__8__Impl : ( ( rule__ArgumentStore__ContentAssignment_8 ) ) ;
    public final void rule__ArgumentStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1963:1: ( ( ( rule__ArgumentStore__ContentAssignment_8 ) ) )
            // InternalAnnotationsStores.g:1964:1: ( ( rule__ArgumentStore__ContentAssignment_8 ) )
            {
            // InternalAnnotationsStores.g:1964:1: ( ( rule__ArgumentStore__ContentAssignment_8 ) )
            // InternalAnnotationsStores.g:1965:2: ( rule__ArgumentStore__ContentAssignment_8 )
            {
             before(grammarAccess.getArgumentStoreAccess().getContentAssignment_8()); 
            // InternalAnnotationsStores.g:1966:2: ( rule__ArgumentStore__ContentAssignment_8 )
            // InternalAnnotationsStores.g:1966:3: rule__ArgumentStore__ContentAssignment_8
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
    // InternalAnnotationsStores.g:1974:1: rule__ArgumentStore__Group__9 : rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10 ;
    public final void rule__ArgumentStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1978:1: ( rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10 )
            // InternalAnnotationsStores.g:1979:2: rule__ArgumentStore__Group__9__Impl rule__ArgumentStore__Group__10
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
    // InternalAnnotationsStores.g:1986:1: rule__ArgumentStore__Group__9__Impl : ( ( rule__ArgumentStore__Group_9__0 )? ) ;
    public final void rule__ArgumentStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:1990:1: ( ( ( rule__ArgumentStore__Group_9__0 )? ) )
            // InternalAnnotationsStores.g:1991:1: ( ( rule__ArgumentStore__Group_9__0 )? )
            {
            // InternalAnnotationsStores.g:1991:1: ( ( rule__ArgumentStore__Group_9__0 )? )
            // InternalAnnotationsStores.g:1992:2: ( rule__ArgumentStore__Group_9__0 )?
            {
             before(grammarAccess.getArgumentStoreAccess().getGroup_9()); 
            // InternalAnnotationsStores.g:1993:2: ( rule__ArgumentStore__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnnotationsStores.g:1993:3: rule__ArgumentStore__Group_9__0
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
    // InternalAnnotationsStores.g:2001:1: rule__ArgumentStore__Group__10 : rule__ArgumentStore__Group__10__Impl rule__ArgumentStore__Group__11 ;
    public final void rule__ArgumentStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2005:1: ( rule__ArgumentStore__Group__10__Impl rule__ArgumentStore__Group__11 )
            // InternalAnnotationsStores.g:2006:2: rule__ArgumentStore__Group__10__Impl rule__ArgumentStore__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__ArgumentStore__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__11();

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
    // InternalAnnotationsStores.g:2013:1: rule__ArgumentStore__Group__10__Impl : ( ')' ) ;
    public final void rule__ArgumentStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2017:1: ( ( ')' ) )
            // InternalAnnotationsStores.g:2018:1: ( ')' )
            {
            // InternalAnnotationsStores.g:2018:1: ( ')' )
            // InternalAnnotationsStores.g:2019:2: ')'
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


    // $ANTLR start "rule__ArgumentStore__Group__11"
    // InternalAnnotationsStores.g:2028:1: rule__ArgumentStore__Group__11 : rule__ArgumentStore__Group__11__Impl ;
    public final void rule__ArgumentStore__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2032:1: ( rule__ArgumentStore__Group__11__Impl )
            // InternalAnnotationsStores.g:2033:2: rule__ArgumentStore__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentStore__Group__11__Impl();

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
    // $ANTLR end "rule__ArgumentStore__Group__11"


    // $ANTLR start "rule__ArgumentStore__Group__11__Impl"
    // InternalAnnotationsStores.g:2039:1: rule__ArgumentStore__Group__11__Impl : ( ( rule__ArgumentStore__EffectAssignment_11 )? ) ;
    public final void rule__ArgumentStore__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2043:1: ( ( ( rule__ArgumentStore__EffectAssignment_11 )? ) )
            // InternalAnnotationsStores.g:2044:1: ( ( rule__ArgumentStore__EffectAssignment_11 )? )
            {
            // InternalAnnotationsStores.g:2044:1: ( ( rule__ArgumentStore__EffectAssignment_11 )? )
            // InternalAnnotationsStores.g:2045:2: ( rule__ArgumentStore__EffectAssignment_11 )?
            {
             before(grammarAccess.getArgumentStoreAccess().getEffectAssignment_11()); 
            // InternalAnnotationsStores.g:2046:2: ( rule__ArgumentStore__EffectAssignment_11 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnnotationsStores.g:2046:3: rule__ArgumentStore__EffectAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgumentStore__EffectAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentStoreAccess().getEffectAssignment_11()); 

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
    // $ANTLR end "rule__ArgumentStore__Group__11__Impl"


    // $ANTLR start "rule__ArgumentStore__Group_9__0"
    // InternalAnnotationsStores.g:2055:1: rule__ArgumentStore__Group_9__0 : rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1 ;
    public final void rule__ArgumentStore__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2059:1: ( rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1 )
            // InternalAnnotationsStores.g:2060:2: rule__ArgumentStore__Group_9__0__Impl rule__ArgumentStore__Group_9__1
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
    // InternalAnnotationsStores.g:2067:1: rule__ArgumentStore__Group_9__0__Impl : ( ',' ) ;
    public final void rule__ArgumentStore__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2071:1: ( ( ',' ) )
            // InternalAnnotationsStores.g:2072:1: ( ',' )
            {
            // InternalAnnotationsStores.g:2072:1: ( ',' )
            // InternalAnnotationsStores.g:2073:2: ','
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
    // InternalAnnotationsStores.g:2082:1: rule__ArgumentStore__Group_9__1 : rule__ArgumentStore__Group_9__1__Impl ;
    public final void rule__ArgumentStore__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2086:1: ( rule__ArgumentStore__Group_9__1__Impl )
            // InternalAnnotationsStores.g:2087:2: rule__ArgumentStore__Group_9__1__Impl
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
    // InternalAnnotationsStores.g:2093:1: rule__ArgumentStore__Group_9__1__Impl : ( ( rule__ArgumentStore__TargetAssignment_9_1 ) ) ;
    public final void rule__ArgumentStore__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2097:1: ( ( ( rule__ArgumentStore__TargetAssignment_9_1 ) ) )
            // InternalAnnotationsStores.g:2098:1: ( ( rule__ArgumentStore__TargetAssignment_9_1 ) )
            {
            // InternalAnnotationsStores.g:2098:1: ( ( rule__ArgumentStore__TargetAssignment_9_1 ) )
            // InternalAnnotationsStores.g:2099:2: ( rule__ArgumentStore__TargetAssignment_9_1 )
            {
             before(grammarAccess.getArgumentStoreAccess().getTargetAssignment_9_1()); 
            // InternalAnnotationsStores.g:2100:2: ( rule__ArgumentStore__TargetAssignment_9_1 )
            // InternalAnnotationsStores.g:2100:3: rule__ArgumentStore__TargetAssignment_9_1
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
    // InternalAnnotationsStores.g:2109:1: rule__AnnotationStores__ProposalElementsAssignment_0 : ( ruleProposalStore ) ;
    public final void rule__AnnotationStores__ProposalElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2113:1: ( ( ruleProposalStore ) )
            // InternalAnnotationsStores.g:2114:2: ( ruleProposalStore )
            {
            // InternalAnnotationsStores.g:2114:2: ( ruleProposalStore )
            // InternalAnnotationsStores.g:2115:3: ruleProposalStore
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
    // InternalAnnotationsStores.g:2124:1: rule__AnnotationStores__QuestionElementsAssignment_1 : ( ruleQuestionStore ) ;
    public final void rule__AnnotationStores__QuestionElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2128:1: ( ( ruleQuestionStore ) )
            // InternalAnnotationsStores.g:2129:2: ( ruleQuestionStore )
            {
            // InternalAnnotationsStores.g:2129:2: ( ruleQuestionStore )
            // InternalAnnotationsStores.g:2130:3: ruleQuestionStore
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
    // InternalAnnotationsStores.g:2139:1: rule__AnnotationStores__ChallengeElementsAssignment_2 : ( ruleChallengeStore ) ;
    public final void rule__AnnotationStores__ChallengeElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2143:1: ( ( ruleChallengeStore ) )
            // InternalAnnotationsStores.g:2144:2: ( ruleChallengeStore )
            {
            // InternalAnnotationsStores.g:2144:2: ( ruleChallengeStore )
            // InternalAnnotationsStores.g:2145:3: ruleChallengeStore
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
    // InternalAnnotationsStores.g:2154:1: rule__AnnotationStores__CommitmentElementsAssignment_3 : ( ruleCommitmentStore ) ;
    public final void rule__AnnotationStores__CommitmentElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2158:1: ( ( ruleCommitmentStore ) )
            // InternalAnnotationsStores.g:2159:2: ( ruleCommitmentStore )
            {
            // InternalAnnotationsStores.g:2159:2: ( ruleCommitmentStore )
            // InternalAnnotationsStores.g:2160:3: ruleCommitmentStore
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
    // InternalAnnotationsStores.g:2169:1: rule__AnnotationStores__ArgumentElementsAssignment_4 : ( ruleArgumentStore ) ;
    public final void rule__AnnotationStores__ArgumentElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2173:1: ( ( ruleArgumentStore ) )
            // InternalAnnotationsStores.g:2174:2: ( ruleArgumentStore )
            {
            // InternalAnnotationsStores.g:2174:2: ( ruleArgumentStore )
            // InternalAnnotationsStores.g:2175:3: ruleArgumentStore
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
    // InternalAnnotationsStores.g:2184:1: rule__ProposalStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProposalStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2188:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2189:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2189:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2190:3: RULE_ID
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
    // InternalAnnotationsStores.g:2199:1: rule__ProposalStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__ProposalStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2203:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2204:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2204:2: ( ruleScope )
            // InternalAnnotationsStores.g:2205:3: ruleScope
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
    // InternalAnnotationsStores.g:2214:1: rule__ProposalStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__ProposalStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2218:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2219:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2219:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2220:3: ruleFocus
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
    // InternalAnnotationsStores.g:2229:1: rule__ProposalStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ProposalStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2233:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2234:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2234:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2235:3: RULE_STRING
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


    // $ANTLR start "rule__ProposalStore__EffectAssignment_10"
    // InternalAnnotationsStores.g:2244:1: rule__ProposalStore__EffectAssignment_10 : ( ruleEffect ) ;
    public final void rule__ProposalStore__EffectAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2248:1: ( ( ruleEffect ) )
            // InternalAnnotationsStores.g:2249:2: ( ruleEffect )
            {
            // InternalAnnotationsStores.g:2249:2: ( ruleEffect )
            // InternalAnnotationsStores.g:2250:3: ruleEffect
            {
             before(grammarAccess.getProposalStoreAccess().getEffectEffectParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getProposalStoreAccess().getEffectEffectParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ProposalStore__EffectAssignment_10"


    // $ANTLR start "rule__QuestionStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2259:1: rule__QuestionStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QuestionStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2263:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2264:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2264:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2265:3: RULE_ID
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
    // InternalAnnotationsStores.g:2274:1: rule__QuestionStore__SenderAssignment_4 : ( ruleSender ) ;
    public final void rule__QuestionStore__SenderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2278:1: ( ( ruleSender ) )
            // InternalAnnotationsStores.g:2279:2: ( ruleSender )
            {
            // InternalAnnotationsStores.g:2279:2: ( ruleSender )
            // InternalAnnotationsStores.g:2280:3: ruleSender
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
    // InternalAnnotationsStores.g:2289:1: rule__QuestionStore__ScopeAssignment_6 : ( ruleScope ) ;
    public final void rule__QuestionStore__ScopeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2293:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2294:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2294:2: ( ruleScope )
            // InternalAnnotationsStores.g:2295:3: ruleScope
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
    // InternalAnnotationsStores.g:2304:1: rule__QuestionStore__FocusAssignment_8 : ( ruleFocus ) ;
    public final void rule__QuestionStore__FocusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2308:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2309:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2309:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2310:3: ruleFocus
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
    // InternalAnnotationsStores.g:2319:1: rule__QuestionStore__ContentAssignment_10 : ( RULE_STRING ) ;
    public final void rule__QuestionStore__ContentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2323:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2324:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2324:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2325:3: RULE_STRING
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


    // $ANTLR start "rule__QuestionStore__EffectAssignment_12"
    // InternalAnnotationsStores.g:2334:1: rule__QuestionStore__EffectAssignment_12 : ( ruleEffect ) ;
    public final void rule__QuestionStore__EffectAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2338:1: ( ( ruleEffect ) )
            // InternalAnnotationsStores.g:2339:2: ( ruleEffect )
            {
            // InternalAnnotationsStores.g:2339:2: ( ruleEffect )
            // InternalAnnotationsStores.g:2340:3: ruleEffect
            {
             before(grammarAccess.getQuestionStoreAccess().getEffectEffectParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getQuestionStoreAccess().getEffectEffectParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__QuestionStore__EffectAssignment_12"


    // $ANTLR start "rule__ChallengeStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2349:1: rule__ChallengeStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChallengeStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2353:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2354:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2354:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2355:3: RULE_ID
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
    // InternalAnnotationsStores.g:2364:1: rule__ChallengeStore__SenderAssignment_4 : ( ruleSender ) ;
    public final void rule__ChallengeStore__SenderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2368:1: ( ( ruleSender ) )
            // InternalAnnotationsStores.g:2369:2: ( ruleSender )
            {
            // InternalAnnotationsStores.g:2369:2: ( ruleSender )
            // InternalAnnotationsStores.g:2370:3: ruleSender
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
    // InternalAnnotationsStores.g:2379:1: rule__ChallengeStore__TargetAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ChallengeStore__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2383:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2384:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2384:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2385:3: RULE_ID
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


    // $ANTLR start "rule__ChallengeStore__EffectAssignment_7"
    // InternalAnnotationsStores.g:2394:1: rule__ChallengeStore__EffectAssignment_7 : ( ruleEffect ) ;
    public final void rule__ChallengeStore__EffectAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2398:1: ( ( ruleEffect ) )
            // InternalAnnotationsStores.g:2399:2: ( ruleEffect )
            {
            // InternalAnnotationsStores.g:2399:2: ( ruleEffect )
            // InternalAnnotationsStores.g:2400:3: ruleEffect
            {
             before(grammarAccess.getChallengeStoreAccess().getEffectEffectParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getChallengeStoreAccess().getEffectEffectParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ChallengeStore__EffectAssignment_7"


    // $ANTLR start "rule__CommitmentStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2409:1: rule__CommitmentStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommitmentStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2413:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2414:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2414:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2415:3: RULE_ID
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
    // InternalAnnotationsStores.g:2424:1: rule__CommitmentStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__CommitmentStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2428:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2429:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2429:2: ( ruleScope )
            // InternalAnnotationsStores.g:2430:3: ruleScope
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
    // InternalAnnotationsStores.g:2439:1: rule__CommitmentStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__CommitmentStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2443:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2444:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2444:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2445:3: ruleFocus
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
    // InternalAnnotationsStores.g:2454:1: rule__CommitmentStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__CommitmentStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2458:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2459:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2459:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2460:3: RULE_STRING
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


    // $ANTLR start "rule__CommitmentStore__EffectAssignment_10"
    // InternalAnnotationsStores.g:2469:1: rule__CommitmentStore__EffectAssignment_10 : ( ruleEffect ) ;
    public final void rule__CommitmentStore__EffectAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2473:1: ( ( ruleEffect ) )
            // InternalAnnotationsStores.g:2474:2: ( ruleEffect )
            {
            // InternalAnnotationsStores.g:2474:2: ( ruleEffect )
            // InternalAnnotationsStores.g:2475:3: ruleEffect
            {
             before(grammarAccess.getCommitmentStoreAccess().getEffectEffectParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getCommitmentStoreAccess().getEffectEffectParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__CommitmentStore__EffectAssignment_10"


    // $ANTLR start "rule__ArgumentStore__NameAssignment_2"
    // InternalAnnotationsStores.g:2484:1: rule__ArgumentStore__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ArgumentStore__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2488:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2489:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2489:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2490:3: RULE_ID
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
    // InternalAnnotationsStores.g:2499:1: rule__ArgumentStore__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__ArgumentStore__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2503:1: ( ( ruleScope ) )
            // InternalAnnotationsStores.g:2504:2: ( ruleScope )
            {
            // InternalAnnotationsStores.g:2504:2: ( ruleScope )
            // InternalAnnotationsStores.g:2505:3: ruleScope
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
    // InternalAnnotationsStores.g:2514:1: rule__ArgumentStore__FocusAssignment_6 : ( ruleFocus ) ;
    public final void rule__ArgumentStore__FocusAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2518:1: ( ( ruleFocus ) )
            // InternalAnnotationsStores.g:2519:2: ( ruleFocus )
            {
            // InternalAnnotationsStores.g:2519:2: ( ruleFocus )
            // InternalAnnotationsStores.g:2520:3: ruleFocus
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
    // InternalAnnotationsStores.g:2529:1: rule__ArgumentStore__ContentAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ArgumentStore__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2533:1: ( ( RULE_STRING ) )
            // InternalAnnotationsStores.g:2534:2: ( RULE_STRING )
            {
            // InternalAnnotationsStores.g:2534:2: ( RULE_STRING )
            // InternalAnnotationsStores.g:2535:3: RULE_STRING
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
    // InternalAnnotationsStores.g:2544:1: rule__ArgumentStore__TargetAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__ArgumentStore__TargetAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2548:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2549:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2549:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2550:3: RULE_ID
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


    // $ANTLR start "rule__ArgumentStore__EffectAssignment_11"
    // InternalAnnotationsStores.g:2559:1: rule__ArgumentStore__EffectAssignment_11 : ( ruleEffect ) ;
    public final void rule__ArgumentStore__EffectAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2563:1: ( ( ruleEffect ) )
            // InternalAnnotationsStores.g:2564:2: ( ruleEffect )
            {
            // InternalAnnotationsStores.g:2564:2: ( ruleEffect )
            // InternalAnnotationsStores.g:2565:3: ruleEffect
            {
             before(grammarAccess.getArgumentStoreAccess().getEffectEffectParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getArgumentStoreAccess().getEffectEffectParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__ArgumentStore__EffectAssignment_11"


    // $ANTLR start "rule__Scope__ScopeAssignment"
    // InternalAnnotationsStores.g:2574:1: rule__Scope__ScopeAssignment : ( ( rule__Scope__ScopeAlternatives_0 ) ) ;
    public final void rule__Scope__ScopeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2578:1: ( ( ( rule__Scope__ScopeAlternatives_0 ) ) )
            // InternalAnnotationsStores.g:2579:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            {
            // InternalAnnotationsStores.g:2579:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            // InternalAnnotationsStores.g:2580:3: ( rule__Scope__ScopeAlternatives_0 )
            {
             before(grammarAccess.getScopeAccess().getScopeAlternatives_0()); 
            // InternalAnnotationsStores.g:2581:3: ( rule__Scope__ScopeAlternatives_0 )
            // InternalAnnotationsStores.g:2581:4: rule__Scope__ScopeAlternatives_0
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
    // InternalAnnotationsStores.g:2589:1: rule__Focus__FocusAssignment : ( ( rule__Focus__FocusAlternatives_0 ) ) ;
    public final void rule__Focus__FocusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2593:1: ( ( ( rule__Focus__FocusAlternatives_0 ) ) )
            // InternalAnnotationsStores.g:2594:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            {
            // InternalAnnotationsStores.g:2594:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            // InternalAnnotationsStores.g:2595:3: ( rule__Focus__FocusAlternatives_0 )
            {
             before(grammarAccess.getFocusAccess().getFocusAlternatives_0()); 
            // InternalAnnotationsStores.g:2596:3: ( rule__Focus__FocusAlternatives_0 )
            // InternalAnnotationsStores.g:2596:4: rule__Focus__FocusAlternatives_0
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


    // $ANTLR start "rule__Effect__AffectedByAssignment"
    // InternalAnnotationsStores.g:2604:1: rule__Effect__AffectedByAssignment : ( RULE_ID ) ;
    public final void rule__Effect__AffectedByAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsStores.g:2608:1: ( ( RULE_ID ) )
            // InternalAnnotationsStores.g:2609:2: ( RULE_ID )
            {
            // InternalAnnotationsStores.g:2609:2: ( RULE_ID )
            // InternalAnnotationsStores.g:2610:3: RULE_ID
            {
             before(grammarAccess.getEffectAccess().getAffectedByIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getAffectedByIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Effect__AffectedByAssignment"

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
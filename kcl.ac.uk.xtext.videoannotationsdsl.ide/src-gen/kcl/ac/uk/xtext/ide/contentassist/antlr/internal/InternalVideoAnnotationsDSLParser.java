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
import kcl.ac.uk.xtext.services.VideoAnnotationsDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoAnnotationsDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'propose'", "'question'", "'challenge'", "'justify'", "'withdraw'", "'accept'", "'reject'", "'commit'", "'counter'", "'uncommit'", "'feature'", "'rating'", "'criteria'", "'topic'", "'R'", "'S'", "'G'", "'V'", "'A'", "'from'", "'to'", "'annotate'", "'('", "','", "')'", "'#'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoAnnotationsDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoAnnotationsDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoAnnotationsDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoAnnotationsDSL.g"; }


    	private VideoAnnotationsDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(VideoAnnotationsDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAnnotatedVideo"
    // InternalVideoAnnotationsDSL.g:53:1: entryRuleAnnotatedVideo : ruleAnnotatedVideo EOF ;
    public final void entryRuleAnnotatedVideo() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:54:1: ( ruleAnnotatedVideo EOF )
            // InternalVideoAnnotationsDSL.g:55:1: ruleAnnotatedVideo EOF
            {
             before(grammarAccess.getAnnotatedVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotatedVideo();

            state._fsp--;

             after(grammarAccess.getAnnotatedVideoRule()); 
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
    // $ANTLR end "entryRuleAnnotatedVideo"


    // $ANTLR start "ruleAnnotatedVideo"
    // InternalVideoAnnotationsDSL.g:62:1: ruleAnnotatedVideo : ( ( rule__AnnotatedVideo__AnnotationsAssignment )* ) ;
    public final void ruleAnnotatedVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:66:2: ( ( ( rule__AnnotatedVideo__AnnotationsAssignment )* ) )
            // InternalVideoAnnotationsDSL.g:67:2: ( ( rule__AnnotatedVideo__AnnotationsAssignment )* )
            {
            // InternalVideoAnnotationsDSL.g:67:2: ( ( rule__AnnotatedVideo__AnnotationsAssignment )* )
            // InternalVideoAnnotationsDSL.g:68:3: ( rule__AnnotatedVideo__AnnotationsAssignment )*
            {
             before(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAssignment()); 
            // InternalVideoAnnotationsDSL.g:69:3: ( rule__AnnotatedVideo__AnnotationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVideoAnnotationsDSL.g:69:4: rule__AnnotatedVideo__AnnotationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AnnotatedVideo__AnnotationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAssignment()); 

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
    // $ANTLR end "ruleAnnotatedVideo"


    // $ANTLR start "entryRuleAnnotation"
    // InternalVideoAnnotationsDSL.g:78:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:79:1: ( ruleAnnotation EOF )
            // InternalVideoAnnotationsDSL.g:80:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalVideoAnnotationsDSL.g:87:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:91:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalVideoAnnotationsDSL.g:92:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalVideoAnnotationsDSL.g:92:2: ( ( rule__Annotation__Group__0 ) )
            // InternalVideoAnnotationsDSL.g:93:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalVideoAnnotationsDSL.g:94:3: ( rule__Annotation__Group__0 )
            // InternalVideoAnnotationsDSL.g:94:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleSender"
    // InternalVideoAnnotationsDSL.g:103:1: entryRuleSender : ruleSender EOF ;
    public final void entryRuleSender() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:104:1: ( ruleSender EOF )
            // InternalVideoAnnotationsDSL.g:105:1: ruleSender EOF
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
    // InternalVideoAnnotationsDSL.g:112:1: ruleSender : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void ruleSender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:116:2: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalVideoAnnotationsDSL.g:117:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalVideoAnnotationsDSL.g:117:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalVideoAnnotationsDSL.g:118:3: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalVideoAnnotationsDSL.g:118:3: ( ( RULE_INT ) )
            // InternalVideoAnnotationsDSL.g:119:4: ( RULE_INT )
            {
             before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 
            // InternalVideoAnnotationsDSL.g:120:4: ( RULE_INT )
            // InternalVideoAnnotationsDSL.g:120:5: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_4); 

            }

             after(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 

            }

            // InternalVideoAnnotationsDSL.g:123:3: ( ( RULE_INT )* )
            // InternalVideoAnnotationsDSL.g:124:4: ( RULE_INT )*
            {
             before(grammarAccess.getSenderAccess().getINTTerminalRuleCall()); 
            // InternalVideoAnnotationsDSL.g:125:4: ( RULE_INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoAnnotationsDSL.g:125:5: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleMove"
    // InternalVideoAnnotationsDSL.g:135:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:136:1: ( ruleMove EOF )
            // InternalVideoAnnotationsDSL.g:137:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalVideoAnnotationsDSL.g:144:1: ruleMove : ( ( rule__Move__TypeAssignment ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:148:2: ( ( ( rule__Move__TypeAssignment ) ) )
            // InternalVideoAnnotationsDSL.g:149:2: ( ( rule__Move__TypeAssignment ) )
            {
            // InternalVideoAnnotationsDSL.g:149:2: ( ( rule__Move__TypeAssignment ) )
            // InternalVideoAnnotationsDSL.g:150:3: ( rule__Move__TypeAssignment )
            {
             before(grammarAccess.getMoveAccess().getTypeAssignment()); 
            // InternalVideoAnnotationsDSL.g:151:3: ( rule__Move__TypeAssignment )
            // InternalVideoAnnotationsDSL.g:151:4: rule__Move__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Move__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleScope"
    // InternalVideoAnnotationsDSL.g:160:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:161:1: ( ruleScope EOF )
            // InternalVideoAnnotationsDSL.g:162:1: ruleScope EOF
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
    // InternalVideoAnnotationsDSL.g:169:1: ruleScope : ( ( rule__Scope__ScopeAssignment ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:173:2: ( ( ( rule__Scope__ScopeAssignment ) ) )
            // InternalVideoAnnotationsDSL.g:174:2: ( ( rule__Scope__ScopeAssignment ) )
            {
            // InternalVideoAnnotationsDSL.g:174:2: ( ( rule__Scope__ScopeAssignment ) )
            // InternalVideoAnnotationsDSL.g:175:3: ( rule__Scope__ScopeAssignment )
            {
             before(grammarAccess.getScopeAccess().getScopeAssignment()); 
            // InternalVideoAnnotationsDSL.g:176:3: ( rule__Scope__ScopeAssignment )
            // InternalVideoAnnotationsDSL.g:176:4: rule__Scope__ScopeAssignment
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
    // InternalVideoAnnotationsDSL.g:185:1: entryRuleFocus : ruleFocus EOF ;
    public final void entryRuleFocus() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:186:1: ( ruleFocus EOF )
            // InternalVideoAnnotationsDSL.g:187:1: ruleFocus EOF
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
    // InternalVideoAnnotationsDSL.g:194:1: ruleFocus : ( ( rule__Focus__FocusAssignment ) ) ;
    public final void ruleFocus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:198:2: ( ( ( rule__Focus__FocusAssignment ) ) )
            // InternalVideoAnnotationsDSL.g:199:2: ( ( rule__Focus__FocusAssignment ) )
            {
            // InternalVideoAnnotationsDSL.g:199:2: ( ( rule__Focus__FocusAssignment ) )
            // InternalVideoAnnotationsDSL.g:200:3: ( rule__Focus__FocusAssignment )
            {
             before(grammarAccess.getFocusAccess().getFocusAssignment()); 
            // InternalVideoAnnotationsDSL.g:201:3: ( rule__Focus__FocusAssignment )
            // InternalVideoAnnotationsDSL.g:201:4: rule__Focus__FocusAssignment
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


    // $ANTLR start "entryRuleTime"
    // InternalVideoAnnotationsDSL.g:210:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalVideoAnnotationsDSL.g:211:1: ( ruleTime EOF )
            // InternalVideoAnnotationsDSL.g:212:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalVideoAnnotationsDSL.g:219:1: ruleTime : ( ( rule__Time__SecAssignment ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:223:2: ( ( ( rule__Time__SecAssignment ) ) )
            // InternalVideoAnnotationsDSL.g:224:2: ( ( rule__Time__SecAssignment ) )
            {
            // InternalVideoAnnotationsDSL.g:224:2: ( ( rule__Time__SecAssignment ) )
            // InternalVideoAnnotationsDSL.g:225:3: ( rule__Time__SecAssignment )
            {
             before(grammarAccess.getTimeAccess().getSecAssignment()); 
            // InternalVideoAnnotationsDSL.g:226:3: ( rule__Time__SecAssignment )
            // InternalVideoAnnotationsDSL.g:226:4: rule__Time__SecAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Time__SecAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getSecAssignment()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "rule__Move__TypeAlternatives_0"
    // InternalVideoAnnotationsDSL.g:234:1: rule__Move__TypeAlternatives_0 : ( ( 'propose' ) | ( 'question' ) | ( 'challenge' ) | ( 'justify' ) | ( 'withdraw' ) | ( 'accept' ) | ( 'reject' ) | ( 'commit' ) | ( 'counter' ) | ( 'uncommit' ) );
    public final void rule__Move__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:238:1: ( ( 'propose' ) | ( 'question' ) | ( 'challenge' ) | ( 'justify' ) | ( 'withdraw' ) | ( 'accept' ) | ( 'reject' ) | ( 'commit' ) | ( 'counter' ) | ( 'uncommit' ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:239:2: ( 'propose' )
                    {
                    // InternalVideoAnnotationsDSL.g:239:2: ( 'propose' )
                    // InternalVideoAnnotationsDSL.g:240:3: 'propose'
                    {
                     before(grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeProposeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:245:2: ( 'question' )
                    {
                    // InternalVideoAnnotationsDSL.g:245:2: ( 'question' )
                    // InternalVideoAnnotationsDSL.g:246:3: 'question'
                    {
                     before(grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeQuestionKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:251:2: ( 'challenge' )
                    {
                    // InternalVideoAnnotationsDSL.g:251:2: ( 'challenge' )
                    // InternalVideoAnnotationsDSL.g:252:3: 'challenge'
                    {
                     before(grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeChallengeKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:257:2: ( 'justify' )
                    {
                    // InternalVideoAnnotationsDSL.g:257:2: ( 'justify' )
                    // InternalVideoAnnotationsDSL.g:258:3: 'justify'
                    {
                     before(grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeJustifyKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVideoAnnotationsDSL.g:263:2: ( 'withdraw' )
                    {
                    // InternalVideoAnnotationsDSL.g:263:2: ( 'withdraw' )
                    // InternalVideoAnnotationsDSL.g:264:3: 'withdraw'
                    {
                     before(grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeWithdrawKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVideoAnnotationsDSL.g:269:2: ( 'accept' )
                    {
                    // InternalVideoAnnotationsDSL.g:269:2: ( 'accept' )
                    // InternalVideoAnnotationsDSL.g:270:3: 'accept'
                    {
                     before(grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeAcceptKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVideoAnnotationsDSL.g:275:2: ( 'reject' )
                    {
                    // InternalVideoAnnotationsDSL.g:275:2: ( 'reject' )
                    // InternalVideoAnnotationsDSL.g:276:3: 'reject'
                    {
                     before(grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeRejectKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVideoAnnotationsDSL.g:281:2: ( 'commit' )
                    {
                    // InternalVideoAnnotationsDSL.g:281:2: ( 'commit' )
                    // InternalVideoAnnotationsDSL.g:282:3: 'commit'
                    {
                     before(grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeCommitKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVideoAnnotationsDSL.g:287:2: ( 'counter' )
                    {
                    // InternalVideoAnnotationsDSL.g:287:2: ( 'counter' )
                    // InternalVideoAnnotationsDSL.g:288:3: 'counter'
                    {
                     before(grammarAccess.getMoveAccess().getTypeCounterKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeCounterKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVideoAnnotationsDSL.g:293:2: ( 'uncommit' )
                    {
                    // InternalVideoAnnotationsDSL.g:293:2: ( 'uncommit' )
                    // InternalVideoAnnotationsDSL.g:294:3: 'uncommit'
                    {
                     before(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_9()); 

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
    // $ANTLR end "rule__Move__TypeAlternatives_0"


    // $ANTLR start "rule__Scope__ScopeAlternatives_0"
    // InternalVideoAnnotationsDSL.g:303:1: rule__Scope__ScopeAlternatives_0 : ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) );
    public final void rule__Scope__ScopeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:307:1: ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:308:2: ( 'feature' )
                    {
                    // InternalVideoAnnotationsDSL.g:308:2: ( 'feature' )
                    // InternalVideoAnnotationsDSL.g:309:3: 'feature'
                    {
                     before(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:314:2: ( 'rating' )
                    {
                    // InternalVideoAnnotationsDSL.g:314:2: ( 'rating' )
                    // InternalVideoAnnotationsDSL.g:315:3: 'rating'
                    {
                     before(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:320:2: ( 'criteria' )
                    {
                    // InternalVideoAnnotationsDSL.g:320:2: ( 'criteria' )
                    // InternalVideoAnnotationsDSL.g:321:3: 'criteria'
                    {
                     before(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:326:2: ( 'topic' )
                    {
                    // InternalVideoAnnotationsDSL.g:326:2: ( 'topic' )
                    // InternalVideoAnnotationsDSL.g:327:3: 'topic'
                    {
                     before(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:336:1: rule__Focus__FocusAlternatives_0 : ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) );
    public final void rule__Focus__FocusAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:340:1: ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'A' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:341:2: ( 'R' )
                    {
                    // InternalVideoAnnotationsDSL.g:341:2: ( 'R' )
                    // InternalVideoAnnotationsDSL.g:342:3: 'R'
                    {
                     before(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:347:2: ( 'S' )
                    {
                    // InternalVideoAnnotationsDSL.g:347:2: ( 'S' )
                    // InternalVideoAnnotationsDSL.g:348:3: 'S'
                    {
                     before(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:353:2: ( 'G' )
                    {
                    // InternalVideoAnnotationsDSL.g:353:2: ( 'G' )
                    // InternalVideoAnnotationsDSL.g:354:3: 'G'
                    {
                     before(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:359:2: ( 'V' )
                    {
                    // InternalVideoAnnotationsDSL.g:359:2: ( 'V' )
                    // InternalVideoAnnotationsDSL.g:360:3: 'V'
                    {
                     before(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVideoAnnotationsDSL.g:365:2: ( 'A' )
                    {
                    // InternalVideoAnnotationsDSL.g:365:2: ( 'A' )
                    // InternalVideoAnnotationsDSL.g:366:3: 'A'
                    {
                     before(grammarAccess.getFocusAccess().getFocusAKeyword_0_4()); 
                    match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalVideoAnnotationsDSL.g:375:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:379:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalVideoAnnotationsDSL.g:380:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalVideoAnnotationsDSL.g:387:1: rule__Annotation__Group__0__Impl : ( 'from' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:391:1: ( ( 'from' ) )
            // InternalVideoAnnotationsDSL.g:392:1: ( 'from' )
            {
            // InternalVideoAnnotationsDSL.g:392:1: ( 'from' )
            // InternalVideoAnnotationsDSL.g:393:2: 'from'
            {
             before(grammarAccess.getAnnotationAccess().getFromKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalVideoAnnotationsDSL.g:402:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:406:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalVideoAnnotationsDSL.g:407:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalVideoAnnotationsDSL.g:414:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__FromTimeAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:418:1: ( ( ( rule__Annotation__FromTimeAssignment_1 ) ) )
            // InternalVideoAnnotationsDSL.g:419:1: ( ( rule__Annotation__FromTimeAssignment_1 ) )
            {
            // InternalVideoAnnotationsDSL.g:419:1: ( ( rule__Annotation__FromTimeAssignment_1 ) )
            // InternalVideoAnnotationsDSL.g:420:2: ( rule__Annotation__FromTimeAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getFromTimeAssignment_1()); 
            // InternalVideoAnnotationsDSL.g:421:2: ( rule__Annotation__FromTimeAssignment_1 )
            // InternalVideoAnnotationsDSL.g:421:3: rule__Annotation__FromTimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__FromTimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getFromTimeAssignment_1()); 

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalVideoAnnotationsDSL.g:429:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:433:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalVideoAnnotationsDSL.g:434:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalVideoAnnotationsDSL.g:441:1: rule__Annotation__Group__2__Impl : ( 'to' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:445:1: ( ( 'to' ) )
            // InternalVideoAnnotationsDSL.g:446:1: ( 'to' )
            {
            // InternalVideoAnnotationsDSL.g:446:1: ( 'to' )
            // InternalVideoAnnotationsDSL.g:447:2: 'to'
            {
             before(grammarAccess.getAnnotationAccess().getToKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalVideoAnnotationsDSL.g:456:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:460:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // InternalVideoAnnotationsDSL.g:461:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__4();

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
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalVideoAnnotationsDSL.g:468:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__ToTimeAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:472:1: ( ( ( rule__Annotation__ToTimeAssignment_3 ) ) )
            // InternalVideoAnnotationsDSL.g:473:1: ( ( rule__Annotation__ToTimeAssignment_3 ) )
            {
            // InternalVideoAnnotationsDSL.g:473:1: ( ( rule__Annotation__ToTimeAssignment_3 ) )
            // InternalVideoAnnotationsDSL.g:474:2: ( rule__Annotation__ToTimeAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getToTimeAssignment_3()); 
            // InternalVideoAnnotationsDSL.g:475:2: ( rule__Annotation__ToTimeAssignment_3 )
            // InternalVideoAnnotationsDSL.g:475:3: rule__Annotation__ToTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ToTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getToTimeAssignment_3()); 

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
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // InternalVideoAnnotationsDSL.g:483:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:487:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // InternalVideoAnnotationsDSL.g:488:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Annotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__5();

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
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // InternalVideoAnnotationsDSL.g:495:1: rule__Annotation__Group__4__Impl : ( 'annotate' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:499:1: ( ( 'annotate' ) )
            // InternalVideoAnnotationsDSL.g:500:1: ( 'annotate' )
            {
            // InternalVideoAnnotationsDSL.g:500:1: ( 'annotate' )
            // InternalVideoAnnotationsDSL.g:501:2: 'annotate'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotateKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotateKeyword_4()); 

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
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__5"
    // InternalVideoAnnotationsDSL.g:510:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl rule__Annotation__Group__6 ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:514:1: ( rule__Annotation__Group__5__Impl rule__Annotation__Group__6 )
            // InternalVideoAnnotationsDSL.g:515:2: rule__Annotation__Group__5__Impl rule__Annotation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Annotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__6();

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
    // $ANTLR end "rule__Annotation__Group__5"


    // $ANTLR start "rule__Annotation__Group__5__Impl"
    // InternalVideoAnnotationsDSL.g:522:1: rule__Annotation__Group__5__Impl : ( '(' ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:526:1: ( ( '(' ) )
            // InternalVideoAnnotationsDSL.g:527:1: ( '(' )
            {
            // InternalVideoAnnotationsDSL.g:527:1: ( '(' )
            // InternalVideoAnnotationsDSL.g:528:2: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Annotation__Group__5__Impl"


    // $ANTLR start "rule__Annotation__Group__6"
    // InternalVideoAnnotationsDSL.g:537:1: rule__Annotation__Group__6 : rule__Annotation__Group__6__Impl rule__Annotation__Group__7 ;
    public final void rule__Annotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:541:1: ( rule__Annotation__Group__6__Impl rule__Annotation__Group__7 )
            // InternalVideoAnnotationsDSL.g:542:2: rule__Annotation__Group__6__Impl rule__Annotation__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__7();

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
    // $ANTLR end "rule__Annotation__Group__6"


    // $ANTLR start "rule__Annotation__Group__6__Impl"
    // InternalVideoAnnotationsDSL.g:549:1: rule__Annotation__Group__6__Impl : ( ( rule__Annotation__NameAssignment_6 ) ) ;
    public final void rule__Annotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:553:1: ( ( ( rule__Annotation__NameAssignment_6 ) ) )
            // InternalVideoAnnotationsDSL.g:554:1: ( ( rule__Annotation__NameAssignment_6 ) )
            {
            // InternalVideoAnnotationsDSL.g:554:1: ( ( rule__Annotation__NameAssignment_6 ) )
            // InternalVideoAnnotationsDSL.g:555:2: ( rule__Annotation__NameAssignment_6 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_6()); 
            // InternalVideoAnnotationsDSL.g:556:2: ( rule__Annotation__NameAssignment_6 )
            // InternalVideoAnnotationsDSL.g:556:3: rule__Annotation__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__Annotation__Group__6__Impl"


    // $ANTLR start "rule__Annotation__Group__7"
    // InternalVideoAnnotationsDSL.g:564:1: rule__Annotation__Group__7 : rule__Annotation__Group__7__Impl rule__Annotation__Group__8 ;
    public final void rule__Annotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:568:1: ( rule__Annotation__Group__7__Impl rule__Annotation__Group__8 )
            // InternalVideoAnnotationsDSL.g:569:2: rule__Annotation__Group__7__Impl rule__Annotation__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__8();

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
    // $ANTLR end "rule__Annotation__Group__7"


    // $ANTLR start "rule__Annotation__Group__7__Impl"
    // InternalVideoAnnotationsDSL.g:576:1: rule__Annotation__Group__7__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:580:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:581:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:581:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:582:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Annotation__Group__7__Impl"


    // $ANTLR start "rule__Annotation__Group__8"
    // InternalVideoAnnotationsDSL.g:591:1: rule__Annotation__Group__8 : rule__Annotation__Group__8__Impl rule__Annotation__Group__9 ;
    public final void rule__Annotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:595:1: ( rule__Annotation__Group__8__Impl rule__Annotation__Group__9 )
            // InternalVideoAnnotationsDSL.g:596:2: rule__Annotation__Group__8__Impl rule__Annotation__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__9();

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
    // $ANTLR end "rule__Annotation__Group__8"


    // $ANTLR start "rule__Annotation__Group__8__Impl"
    // InternalVideoAnnotationsDSL.g:603:1: rule__Annotation__Group__8__Impl : ( ( rule__Annotation__SenderAssignment_8 ) ) ;
    public final void rule__Annotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:607:1: ( ( ( rule__Annotation__SenderAssignment_8 ) ) )
            // InternalVideoAnnotationsDSL.g:608:1: ( ( rule__Annotation__SenderAssignment_8 ) )
            {
            // InternalVideoAnnotationsDSL.g:608:1: ( ( rule__Annotation__SenderAssignment_8 ) )
            // InternalVideoAnnotationsDSL.g:609:2: ( rule__Annotation__SenderAssignment_8 )
            {
             before(grammarAccess.getAnnotationAccess().getSenderAssignment_8()); 
            // InternalVideoAnnotationsDSL.g:610:2: ( rule__Annotation__SenderAssignment_8 )
            // InternalVideoAnnotationsDSL.g:610:3: rule__Annotation__SenderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__SenderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getSenderAssignment_8()); 

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
    // $ANTLR end "rule__Annotation__Group__8__Impl"


    // $ANTLR start "rule__Annotation__Group__9"
    // InternalVideoAnnotationsDSL.g:618:1: rule__Annotation__Group__9 : rule__Annotation__Group__9__Impl rule__Annotation__Group__10 ;
    public final void rule__Annotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:622:1: ( rule__Annotation__Group__9__Impl rule__Annotation__Group__10 )
            // InternalVideoAnnotationsDSL.g:623:2: rule__Annotation__Group__9__Impl rule__Annotation__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Annotation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__10();

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
    // $ANTLR end "rule__Annotation__Group__9"


    // $ANTLR start "rule__Annotation__Group__9__Impl"
    // InternalVideoAnnotationsDSL.g:630:1: rule__Annotation__Group__9__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:634:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:635:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:635:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:636:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__Annotation__Group__9__Impl"


    // $ANTLR start "rule__Annotation__Group__10"
    // InternalVideoAnnotationsDSL.g:645:1: rule__Annotation__Group__10 : rule__Annotation__Group__10__Impl rule__Annotation__Group__11 ;
    public final void rule__Annotation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:649:1: ( rule__Annotation__Group__10__Impl rule__Annotation__Group__11 )
            // InternalVideoAnnotationsDSL.g:650:2: rule__Annotation__Group__10__Impl rule__Annotation__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__11();

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
    // $ANTLR end "rule__Annotation__Group__10"


    // $ANTLR start "rule__Annotation__Group__10__Impl"
    // InternalVideoAnnotationsDSL.g:657:1: rule__Annotation__Group__10__Impl : ( ( rule__Annotation__TypeAssignment_10 ) ) ;
    public final void rule__Annotation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:661:1: ( ( ( rule__Annotation__TypeAssignment_10 ) ) )
            // InternalVideoAnnotationsDSL.g:662:1: ( ( rule__Annotation__TypeAssignment_10 ) )
            {
            // InternalVideoAnnotationsDSL.g:662:1: ( ( rule__Annotation__TypeAssignment_10 ) )
            // InternalVideoAnnotationsDSL.g:663:2: ( rule__Annotation__TypeAssignment_10 )
            {
             before(grammarAccess.getAnnotationAccess().getTypeAssignment_10()); 
            // InternalVideoAnnotationsDSL.g:664:2: ( rule__Annotation__TypeAssignment_10 )
            // InternalVideoAnnotationsDSL.g:664:3: rule__Annotation__TypeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TypeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getTypeAssignment_10()); 

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
    // $ANTLR end "rule__Annotation__Group__10__Impl"


    // $ANTLR start "rule__Annotation__Group__11"
    // InternalVideoAnnotationsDSL.g:672:1: rule__Annotation__Group__11 : rule__Annotation__Group__11__Impl rule__Annotation__Group__12 ;
    public final void rule__Annotation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:676:1: ( rule__Annotation__Group__11__Impl rule__Annotation__Group__12 )
            // InternalVideoAnnotationsDSL.g:677:2: rule__Annotation__Group__11__Impl rule__Annotation__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Annotation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__12();

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
    // $ANTLR end "rule__Annotation__Group__11"


    // $ANTLR start "rule__Annotation__Group__11__Impl"
    // InternalVideoAnnotationsDSL.g:684:1: rule__Annotation__Group__11__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:688:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:689:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:689:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:690:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__Annotation__Group__11__Impl"


    // $ANTLR start "rule__Annotation__Group__12"
    // InternalVideoAnnotationsDSL.g:699:1: rule__Annotation__Group__12 : rule__Annotation__Group__12__Impl rule__Annotation__Group__13 ;
    public final void rule__Annotation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:703:1: ( rule__Annotation__Group__12__Impl rule__Annotation__Group__13 )
            // InternalVideoAnnotationsDSL.g:704:2: rule__Annotation__Group__12__Impl rule__Annotation__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__13();

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
    // $ANTLR end "rule__Annotation__Group__12"


    // $ANTLR start "rule__Annotation__Group__12__Impl"
    // InternalVideoAnnotationsDSL.g:711:1: rule__Annotation__Group__12__Impl : ( ( rule__Annotation__ScopeAssignment_12 ) ) ;
    public final void rule__Annotation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:715:1: ( ( ( rule__Annotation__ScopeAssignment_12 ) ) )
            // InternalVideoAnnotationsDSL.g:716:1: ( ( rule__Annotation__ScopeAssignment_12 ) )
            {
            // InternalVideoAnnotationsDSL.g:716:1: ( ( rule__Annotation__ScopeAssignment_12 ) )
            // InternalVideoAnnotationsDSL.g:717:2: ( rule__Annotation__ScopeAssignment_12 )
            {
             before(grammarAccess.getAnnotationAccess().getScopeAssignment_12()); 
            // InternalVideoAnnotationsDSL.g:718:2: ( rule__Annotation__ScopeAssignment_12 )
            // InternalVideoAnnotationsDSL.g:718:3: rule__Annotation__ScopeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ScopeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getScopeAssignment_12()); 

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
    // $ANTLR end "rule__Annotation__Group__12__Impl"


    // $ANTLR start "rule__Annotation__Group__13"
    // InternalVideoAnnotationsDSL.g:726:1: rule__Annotation__Group__13 : rule__Annotation__Group__13__Impl rule__Annotation__Group__14 ;
    public final void rule__Annotation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:730:1: ( rule__Annotation__Group__13__Impl rule__Annotation__Group__14 )
            // InternalVideoAnnotationsDSL.g:731:2: rule__Annotation__Group__13__Impl rule__Annotation__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Annotation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__14();

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
    // $ANTLR end "rule__Annotation__Group__13"


    // $ANTLR start "rule__Annotation__Group__13__Impl"
    // InternalVideoAnnotationsDSL.g:738:1: rule__Annotation__Group__13__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:742:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:743:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:743:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:744:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_13()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_13()); 

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
    // $ANTLR end "rule__Annotation__Group__13__Impl"


    // $ANTLR start "rule__Annotation__Group__14"
    // InternalVideoAnnotationsDSL.g:753:1: rule__Annotation__Group__14 : rule__Annotation__Group__14__Impl rule__Annotation__Group__15 ;
    public final void rule__Annotation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:757:1: ( rule__Annotation__Group__14__Impl rule__Annotation__Group__15 )
            // InternalVideoAnnotationsDSL.g:758:2: rule__Annotation__Group__14__Impl rule__Annotation__Group__15
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__15();

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
    // $ANTLR end "rule__Annotation__Group__14"


    // $ANTLR start "rule__Annotation__Group__14__Impl"
    // InternalVideoAnnotationsDSL.g:765:1: rule__Annotation__Group__14__Impl : ( ( rule__Annotation__FocusAssignment_14 ) ) ;
    public final void rule__Annotation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:769:1: ( ( ( rule__Annotation__FocusAssignment_14 ) ) )
            // InternalVideoAnnotationsDSL.g:770:1: ( ( rule__Annotation__FocusAssignment_14 ) )
            {
            // InternalVideoAnnotationsDSL.g:770:1: ( ( rule__Annotation__FocusAssignment_14 ) )
            // InternalVideoAnnotationsDSL.g:771:2: ( rule__Annotation__FocusAssignment_14 )
            {
             before(grammarAccess.getAnnotationAccess().getFocusAssignment_14()); 
            // InternalVideoAnnotationsDSL.g:772:2: ( rule__Annotation__FocusAssignment_14 )
            // InternalVideoAnnotationsDSL.g:772:3: rule__Annotation__FocusAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__FocusAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getFocusAssignment_14()); 

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
    // $ANTLR end "rule__Annotation__Group__14__Impl"


    // $ANTLR start "rule__Annotation__Group__15"
    // InternalVideoAnnotationsDSL.g:780:1: rule__Annotation__Group__15 : rule__Annotation__Group__15__Impl rule__Annotation__Group__16 ;
    public final void rule__Annotation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:784:1: ( rule__Annotation__Group__15__Impl rule__Annotation__Group__16 )
            // InternalVideoAnnotationsDSL.g:785:2: rule__Annotation__Group__15__Impl rule__Annotation__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Annotation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__16();

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
    // $ANTLR end "rule__Annotation__Group__15"


    // $ANTLR start "rule__Annotation__Group__15__Impl"
    // InternalVideoAnnotationsDSL.g:792:1: rule__Annotation__Group__15__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:796:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:797:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:797:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:798:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_15()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_15()); 

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
    // $ANTLR end "rule__Annotation__Group__15__Impl"


    // $ANTLR start "rule__Annotation__Group__16"
    // InternalVideoAnnotationsDSL.g:807:1: rule__Annotation__Group__16 : rule__Annotation__Group__16__Impl rule__Annotation__Group__17 ;
    public final void rule__Annotation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:811:1: ( rule__Annotation__Group__16__Impl rule__Annotation__Group__17 )
            // InternalVideoAnnotationsDSL.g:812:2: rule__Annotation__Group__16__Impl rule__Annotation__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Annotation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__17();

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
    // $ANTLR end "rule__Annotation__Group__16"


    // $ANTLR start "rule__Annotation__Group__16__Impl"
    // InternalVideoAnnotationsDSL.g:819:1: rule__Annotation__Group__16__Impl : ( ( rule__Annotation__Group_16__0 )? ) ;
    public final void rule__Annotation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:823:1: ( ( ( rule__Annotation__Group_16__0 )? ) )
            // InternalVideoAnnotationsDSL.g:824:1: ( ( rule__Annotation__Group_16__0 )? )
            {
            // InternalVideoAnnotationsDSL.g:824:1: ( ( rule__Annotation__Group_16__0 )? )
            // InternalVideoAnnotationsDSL.g:825:2: ( rule__Annotation__Group_16__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_16()); 
            // InternalVideoAnnotationsDSL.g:826:2: ( rule__Annotation__Group_16__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==34) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_STRING) ) {
                        alt6=1;
                    }
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:826:3: rule__Annotation__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Annotation__Group__16__Impl"


    // $ANTLR start "rule__Annotation__Group__17"
    // InternalVideoAnnotationsDSL.g:834:1: rule__Annotation__Group__17 : rule__Annotation__Group__17__Impl rule__Annotation__Group__18 ;
    public final void rule__Annotation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:838:1: ( rule__Annotation__Group__17__Impl rule__Annotation__Group__18 )
            // InternalVideoAnnotationsDSL.g:839:2: rule__Annotation__Group__17__Impl rule__Annotation__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Annotation__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__18();

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
    // $ANTLR end "rule__Annotation__Group__17"


    // $ANTLR start "rule__Annotation__Group__17__Impl"
    // InternalVideoAnnotationsDSL.g:846:1: rule__Annotation__Group__17__Impl : ( ( rule__Annotation__ContentAssignment_17 ) ) ;
    public final void rule__Annotation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:850:1: ( ( ( rule__Annotation__ContentAssignment_17 ) ) )
            // InternalVideoAnnotationsDSL.g:851:1: ( ( rule__Annotation__ContentAssignment_17 ) )
            {
            // InternalVideoAnnotationsDSL.g:851:1: ( ( rule__Annotation__ContentAssignment_17 ) )
            // InternalVideoAnnotationsDSL.g:852:2: ( rule__Annotation__ContentAssignment_17 )
            {
             before(grammarAccess.getAnnotationAccess().getContentAssignment_17()); 
            // InternalVideoAnnotationsDSL.g:853:2: ( rule__Annotation__ContentAssignment_17 )
            // InternalVideoAnnotationsDSL.g:853:3: rule__Annotation__ContentAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ContentAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getContentAssignment_17()); 

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
    // $ANTLR end "rule__Annotation__Group__17__Impl"


    // $ANTLR start "rule__Annotation__Group__18"
    // InternalVideoAnnotationsDSL.g:861:1: rule__Annotation__Group__18 : rule__Annotation__Group__18__Impl rule__Annotation__Group__19 ;
    public final void rule__Annotation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:865:1: ( rule__Annotation__Group__18__Impl rule__Annotation__Group__19 )
            // InternalVideoAnnotationsDSL.g:866:2: rule__Annotation__Group__18__Impl rule__Annotation__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Annotation__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__19();

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
    // $ANTLR end "rule__Annotation__Group__18"


    // $ANTLR start "rule__Annotation__Group__18__Impl"
    // InternalVideoAnnotationsDSL.g:873:1: rule__Annotation__Group__18__Impl : ( ( rule__Annotation__Group_18__0 )? ) ;
    public final void rule__Annotation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:877:1: ( ( ( rule__Annotation__Group_18__0 )? ) )
            // InternalVideoAnnotationsDSL.g:878:1: ( ( rule__Annotation__Group_18__0 )? )
            {
            // InternalVideoAnnotationsDSL.g:878:1: ( ( rule__Annotation__Group_18__0 )? )
            // InternalVideoAnnotationsDSL.g:879:2: ( rule__Annotation__Group_18__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_18()); 
            // InternalVideoAnnotationsDSL.g:880:2: ( rule__Annotation__Group_18__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:880:3: rule__Annotation__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_18()); 

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
    // $ANTLR end "rule__Annotation__Group__18__Impl"


    // $ANTLR start "rule__Annotation__Group__19"
    // InternalVideoAnnotationsDSL.g:888:1: rule__Annotation__Group__19 : rule__Annotation__Group__19__Impl rule__Annotation__Group__20 ;
    public final void rule__Annotation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:892:1: ( rule__Annotation__Group__19__Impl rule__Annotation__Group__20 )
            // InternalVideoAnnotationsDSL.g:893:2: rule__Annotation__Group__19__Impl rule__Annotation__Group__20
            {
            pushFollow(FOLLOW_16);
            rule__Annotation__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__20();

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
    // $ANTLR end "rule__Annotation__Group__19"


    // $ANTLR start "rule__Annotation__Group__19__Impl"
    // InternalVideoAnnotationsDSL.g:900:1: rule__Annotation__Group__19__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:904:1: ( ( ')' ) )
            // InternalVideoAnnotationsDSL.g:905:1: ( ')' )
            {
            // InternalVideoAnnotationsDSL.g:905:1: ( ')' )
            // InternalVideoAnnotationsDSL.g:906:2: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_19()); 

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
    // $ANTLR end "rule__Annotation__Group__19__Impl"


    // $ANTLR start "rule__Annotation__Group__20"
    // InternalVideoAnnotationsDSL.g:915:1: rule__Annotation__Group__20 : rule__Annotation__Group__20__Impl ;
    public final void rule__Annotation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:919:1: ( rule__Annotation__Group__20__Impl )
            // InternalVideoAnnotationsDSL.g:920:2: rule__Annotation__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__20__Impl();

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
    // $ANTLR end "rule__Annotation__Group__20"


    // $ANTLR start "rule__Annotation__Group__20__Impl"
    // InternalVideoAnnotationsDSL.g:926:1: rule__Annotation__Group__20__Impl : ( ( rule__Annotation__Group_20__0 )? ) ;
    public final void rule__Annotation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:930:1: ( ( ( rule__Annotation__Group_20__0 )? ) )
            // InternalVideoAnnotationsDSL.g:931:1: ( ( rule__Annotation__Group_20__0 )? )
            {
            // InternalVideoAnnotationsDSL.g:931:1: ( ( rule__Annotation__Group_20__0 )? )
            // InternalVideoAnnotationsDSL.g:932:2: ( rule__Annotation__Group_20__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_20()); 
            // InternalVideoAnnotationsDSL.g:933:2: ( rule__Annotation__Group_20__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:933:3: rule__Annotation__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_20()); 

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
    // $ANTLR end "rule__Annotation__Group__20__Impl"


    // $ANTLR start "rule__Annotation__Group_16__0"
    // InternalVideoAnnotationsDSL.g:942:1: rule__Annotation__Group_16__0 : rule__Annotation__Group_16__0__Impl rule__Annotation__Group_16__1 ;
    public final void rule__Annotation__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:946:1: ( rule__Annotation__Group_16__0__Impl rule__Annotation__Group_16__1 )
            // InternalVideoAnnotationsDSL.g:947:2: rule__Annotation__Group_16__0__Impl rule__Annotation__Group_16__1
            {
            pushFollow(FOLLOW_10);
            rule__Annotation__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group_16__1();

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
    // $ANTLR end "rule__Annotation__Group_16__0"


    // $ANTLR start "rule__Annotation__Group_16__0__Impl"
    // InternalVideoAnnotationsDSL.g:954:1: rule__Annotation__Group_16__0__Impl : ( ( rule__Annotation__ContentLabelAssignment_16_0 ) ) ;
    public final void rule__Annotation__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:958:1: ( ( ( rule__Annotation__ContentLabelAssignment_16_0 ) ) )
            // InternalVideoAnnotationsDSL.g:959:1: ( ( rule__Annotation__ContentLabelAssignment_16_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:959:1: ( ( rule__Annotation__ContentLabelAssignment_16_0 ) )
            // InternalVideoAnnotationsDSL.g:960:2: ( rule__Annotation__ContentLabelAssignment_16_0 )
            {
             before(grammarAccess.getAnnotationAccess().getContentLabelAssignment_16_0()); 
            // InternalVideoAnnotationsDSL.g:961:2: ( rule__Annotation__ContentLabelAssignment_16_0 )
            // InternalVideoAnnotationsDSL.g:961:3: rule__Annotation__ContentLabelAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ContentLabelAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getContentLabelAssignment_16_0()); 

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
    // $ANTLR end "rule__Annotation__Group_16__0__Impl"


    // $ANTLR start "rule__Annotation__Group_16__1"
    // InternalVideoAnnotationsDSL.g:969:1: rule__Annotation__Group_16__1 : rule__Annotation__Group_16__1__Impl ;
    public final void rule__Annotation__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:973:1: ( rule__Annotation__Group_16__1__Impl )
            // InternalVideoAnnotationsDSL.g:974:2: rule__Annotation__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_16__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_16__1"


    // $ANTLR start "rule__Annotation__Group_16__1__Impl"
    // InternalVideoAnnotationsDSL.g:980:1: rule__Annotation__Group_16__1__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:984:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:985:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:985:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:986:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_16_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_16_1()); 

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
    // $ANTLR end "rule__Annotation__Group_16__1__Impl"


    // $ANTLR start "rule__Annotation__Group_18__0"
    // InternalVideoAnnotationsDSL.g:996:1: rule__Annotation__Group_18__0 : rule__Annotation__Group_18__0__Impl rule__Annotation__Group_18__1 ;
    public final void rule__Annotation__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1000:1: ( rule__Annotation__Group_18__0__Impl rule__Annotation__Group_18__1 )
            // InternalVideoAnnotationsDSL.g:1001:2: rule__Annotation__Group_18__0__Impl rule__Annotation__Group_18__1
            {
            pushFollow(FOLLOW_9);
            rule__Annotation__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group_18__1();

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
    // $ANTLR end "rule__Annotation__Group_18__0"


    // $ANTLR start "rule__Annotation__Group_18__0__Impl"
    // InternalVideoAnnotationsDSL.g:1008:1: rule__Annotation__Group_18__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1012:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:1013:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:1013:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:1014:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_18_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_18_0()); 

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
    // $ANTLR end "rule__Annotation__Group_18__0__Impl"


    // $ANTLR start "rule__Annotation__Group_18__1"
    // InternalVideoAnnotationsDSL.g:1023:1: rule__Annotation__Group_18__1 : rule__Annotation__Group_18__1__Impl ;
    public final void rule__Annotation__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1027:1: ( rule__Annotation__Group_18__1__Impl )
            // InternalVideoAnnotationsDSL.g:1028:2: rule__Annotation__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_18__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_18__1"


    // $ANTLR start "rule__Annotation__Group_18__1__Impl"
    // InternalVideoAnnotationsDSL.g:1034:1: rule__Annotation__Group_18__1__Impl : ( ( rule__Annotation__TargetAssignment_18_1 ) ) ;
    public final void rule__Annotation__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1038:1: ( ( ( rule__Annotation__TargetAssignment_18_1 ) ) )
            // InternalVideoAnnotationsDSL.g:1039:1: ( ( rule__Annotation__TargetAssignment_18_1 ) )
            {
            // InternalVideoAnnotationsDSL.g:1039:1: ( ( rule__Annotation__TargetAssignment_18_1 ) )
            // InternalVideoAnnotationsDSL.g:1040:2: ( rule__Annotation__TargetAssignment_18_1 )
            {
             before(grammarAccess.getAnnotationAccess().getTargetAssignment_18_1()); 
            // InternalVideoAnnotationsDSL.g:1041:2: ( rule__Annotation__TargetAssignment_18_1 )
            // InternalVideoAnnotationsDSL.g:1041:3: rule__Annotation__TargetAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TargetAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getTargetAssignment_18_1()); 

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
    // $ANTLR end "rule__Annotation__Group_18__1__Impl"


    // $ANTLR start "rule__Annotation__Group_20__0"
    // InternalVideoAnnotationsDSL.g:1050:1: rule__Annotation__Group_20__0 : rule__Annotation__Group_20__0__Impl rule__Annotation__Group_20__1 ;
    public final void rule__Annotation__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1054:1: ( rule__Annotation__Group_20__0__Impl rule__Annotation__Group_20__1 )
            // InternalVideoAnnotationsDSL.g:1055:2: rule__Annotation__Group_20__0__Impl rule__Annotation__Group_20__1
            {
            pushFollow(FOLLOW_14);
            rule__Annotation__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group_20__1();

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
    // $ANTLR end "rule__Annotation__Group_20__0"


    // $ANTLR start "rule__Annotation__Group_20__0__Impl"
    // InternalVideoAnnotationsDSL.g:1062:1: rule__Annotation__Group_20__0__Impl : ( '#' ) ;
    public final void rule__Annotation__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1066:1: ( ( '#' ) )
            // InternalVideoAnnotationsDSL.g:1067:1: ( '#' )
            {
            // InternalVideoAnnotationsDSL.g:1067:1: ( '#' )
            // InternalVideoAnnotationsDSL.g:1068:2: '#'
            {
             before(grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_0()); 

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
    // $ANTLR end "rule__Annotation__Group_20__0__Impl"


    // $ANTLR start "rule__Annotation__Group_20__1"
    // InternalVideoAnnotationsDSL.g:1077:1: rule__Annotation__Group_20__1 : rule__Annotation__Group_20__1__Impl rule__Annotation__Group_20__2 ;
    public final void rule__Annotation__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1081:1: ( rule__Annotation__Group_20__1__Impl rule__Annotation__Group_20__2 )
            // InternalVideoAnnotationsDSL.g:1082:2: rule__Annotation__Group_20__1__Impl rule__Annotation__Group_20__2
            {
            pushFollow(FOLLOW_16);
            rule__Annotation__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group_20__2();

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
    // $ANTLR end "rule__Annotation__Group_20__1"


    // $ANTLR start "rule__Annotation__Group_20__1__Impl"
    // InternalVideoAnnotationsDSL.g:1089:1: rule__Annotation__Group_20__1__Impl : ( ( rule__Annotation__CommentAssignment_20_1 ) ) ;
    public final void rule__Annotation__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1093:1: ( ( ( rule__Annotation__CommentAssignment_20_1 ) ) )
            // InternalVideoAnnotationsDSL.g:1094:1: ( ( rule__Annotation__CommentAssignment_20_1 ) )
            {
            // InternalVideoAnnotationsDSL.g:1094:1: ( ( rule__Annotation__CommentAssignment_20_1 ) )
            // InternalVideoAnnotationsDSL.g:1095:2: ( rule__Annotation__CommentAssignment_20_1 )
            {
             before(grammarAccess.getAnnotationAccess().getCommentAssignment_20_1()); 
            // InternalVideoAnnotationsDSL.g:1096:2: ( rule__Annotation__CommentAssignment_20_1 )
            // InternalVideoAnnotationsDSL.g:1096:3: rule__Annotation__CommentAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__CommentAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getCommentAssignment_20_1()); 

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
    // $ANTLR end "rule__Annotation__Group_20__1__Impl"


    // $ANTLR start "rule__Annotation__Group_20__2"
    // InternalVideoAnnotationsDSL.g:1104:1: rule__Annotation__Group_20__2 : rule__Annotation__Group_20__2__Impl ;
    public final void rule__Annotation__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1108:1: ( rule__Annotation__Group_20__2__Impl )
            // InternalVideoAnnotationsDSL.g:1109:2: rule__Annotation__Group_20__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_20__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group_20__2"


    // $ANTLR start "rule__Annotation__Group_20__2__Impl"
    // InternalVideoAnnotationsDSL.g:1115:1: rule__Annotation__Group_20__2__Impl : ( '#' ) ;
    public final void rule__Annotation__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1119:1: ( ( '#' ) )
            // InternalVideoAnnotationsDSL.g:1120:1: ( '#' )
            {
            // InternalVideoAnnotationsDSL.g:1120:1: ( '#' )
            // InternalVideoAnnotationsDSL.g:1121:2: '#'
            {
             before(grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNumberSignKeyword_20_2()); 

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
    // $ANTLR end "rule__Annotation__Group_20__2__Impl"


    // $ANTLR start "rule__AnnotatedVideo__AnnotationsAssignment"
    // InternalVideoAnnotationsDSL.g:1131:1: rule__AnnotatedVideo__AnnotationsAssignment : ( ruleAnnotation ) ;
    public final void rule__AnnotatedVideo__AnnotationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1135:1: ( ( ruleAnnotation ) )
            // InternalVideoAnnotationsDSL.g:1136:2: ( ruleAnnotation )
            {
            // InternalVideoAnnotationsDSL.g:1136:2: ( ruleAnnotation )
            // InternalVideoAnnotationsDSL.g:1137:3: ruleAnnotation
            {
             before(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotatedVideoAccess().getAnnotationsAnnotationParserRuleCall_0()); 

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
    // $ANTLR end "rule__AnnotatedVideo__AnnotationsAssignment"


    // $ANTLR start "rule__Annotation__FromTimeAssignment_1"
    // InternalVideoAnnotationsDSL.g:1146:1: rule__Annotation__FromTimeAssignment_1 : ( ruleTime ) ;
    public final void rule__Annotation__FromTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1150:1: ( ( ruleTime ) )
            // InternalVideoAnnotationsDSL.g:1151:2: ( ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:1151:2: ( ruleTime )
            // InternalVideoAnnotationsDSL.g:1152:3: ruleTime
            {
             before(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getFromTimeTimeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Annotation__FromTimeAssignment_1"


    // $ANTLR start "rule__Annotation__ToTimeAssignment_3"
    // InternalVideoAnnotationsDSL.g:1161:1: rule__Annotation__ToTimeAssignment_3 : ( ruleTime ) ;
    public final void rule__Annotation__ToTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1165:1: ( ( ruleTime ) )
            // InternalVideoAnnotationsDSL.g:1166:2: ( ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:1166:2: ( ruleTime )
            // InternalVideoAnnotationsDSL.g:1167:3: ruleTime
            {
             before(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getToTimeTimeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Annotation__ToTimeAssignment_3"


    // $ANTLR start "rule__Annotation__NameAssignment_6"
    // InternalVideoAnnotationsDSL.g:1176:1: rule__Annotation__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1180:1: ( ( RULE_ID ) )
            // InternalVideoAnnotationsDSL.g:1181:2: ( RULE_ID )
            {
            // InternalVideoAnnotationsDSL.g:1181:2: ( RULE_ID )
            // InternalVideoAnnotationsDSL.g:1182:3: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Annotation__NameAssignment_6"


    // $ANTLR start "rule__Annotation__SenderAssignment_8"
    // InternalVideoAnnotationsDSL.g:1191:1: rule__Annotation__SenderAssignment_8 : ( ruleSender ) ;
    public final void rule__Annotation__SenderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1195:1: ( ( ruleSender ) )
            // InternalVideoAnnotationsDSL.g:1196:2: ( ruleSender )
            {
            // InternalVideoAnnotationsDSL.g:1196:2: ( ruleSender )
            // InternalVideoAnnotationsDSL.g:1197:3: ruleSender
            {
             before(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSender();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getSenderSenderParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Annotation__SenderAssignment_8"


    // $ANTLR start "rule__Annotation__TypeAssignment_10"
    // InternalVideoAnnotationsDSL.g:1206:1: rule__Annotation__TypeAssignment_10 : ( ruleMove ) ;
    public final void rule__Annotation__TypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1210:1: ( ( ruleMove ) )
            // InternalVideoAnnotationsDSL.g:1211:2: ( ruleMove )
            {
            // InternalVideoAnnotationsDSL.g:1211:2: ( ruleMove )
            // InternalVideoAnnotationsDSL.g:1212:3: ruleMove
            {
             before(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getTypeMoveParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Annotation__TypeAssignment_10"


    // $ANTLR start "rule__Annotation__ScopeAssignment_12"
    // InternalVideoAnnotationsDSL.g:1221:1: rule__Annotation__ScopeAssignment_12 : ( ruleScope ) ;
    public final void rule__Annotation__ScopeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1225:1: ( ( ruleScope ) )
            // InternalVideoAnnotationsDSL.g:1226:2: ( ruleScope )
            {
            // InternalVideoAnnotationsDSL.g:1226:2: ( ruleScope )
            // InternalVideoAnnotationsDSL.g:1227:3: ruleScope
            {
             before(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getScopeScopeParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Annotation__ScopeAssignment_12"


    // $ANTLR start "rule__Annotation__FocusAssignment_14"
    // InternalVideoAnnotationsDSL.g:1236:1: rule__Annotation__FocusAssignment_14 : ( ruleFocus ) ;
    public final void rule__Annotation__FocusAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1240:1: ( ( ruleFocus ) )
            // InternalVideoAnnotationsDSL.g:1241:2: ( ruleFocus )
            {
            // InternalVideoAnnotationsDSL.g:1241:2: ( ruleFocus )
            // InternalVideoAnnotationsDSL.g:1242:3: ruleFocus
            {
             before(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleFocus();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getFocusFocusParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Annotation__FocusAssignment_14"


    // $ANTLR start "rule__Annotation__ContentLabelAssignment_16_0"
    // InternalVideoAnnotationsDSL.g:1251:1: rule__Annotation__ContentLabelAssignment_16_0 : ( RULE_STRING ) ;
    public final void rule__Annotation__ContentLabelAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1255:1: ( ( RULE_STRING ) )
            // InternalVideoAnnotationsDSL.g:1256:2: ( RULE_STRING )
            {
            // InternalVideoAnnotationsDSL.g:1256:2: ( RULE_STRING )
            // InternalVideoAnnotationsDSL.g:1257:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getContentLabelSTRINGTerminalRuleCall_16_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getContentLabelSTRINGTerminalRuleCall_16_0_0()); 

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
    // $ANTLR end "rule__Annotation__ContentLabelAssignment_16_0"


    // $ANTLR start "rule__Annotation__ContentAssignment_17"
    // InternalVideoAnnotationsDSL.g:1266:1: rule__Annotation__ContentAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Annotation__ContentAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1270:1: ( ( RULE_STRING ) )
            // InternalVideoAnnotationsDSL.g:1271:2: ( RULE_STRING )
            {
            // InternalVideoAnnotationsDSL.g:1271:2: ( RULE_STRING )
            // InternalVideoAnnotationsDSL.g:1272:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Annotation__ContentAssignment_17"


    // $ANTLR start "rule__Annotation__TargetAssignment_18_1"
    // InternalVideoAnnotationsDSL.g:1281:1: rule__Annotation__TargetAssignment_18_1 : ( ( RULE_ID ) ) ;
    public final void rule__Annotation__TargetAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1285:1: ( ( ( RULE_ID ) ) )
            // InternalVideoAnnotationsDSL.g:1286:2: ( ( RULE_ID ) )
            {
            // InternalVideoAnnotationsDSL.g:1286:2: ( ( RULE_ID ) )
            // InternalVideoAnnotationsDSL.g:1287:3: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_1_0()); 
            // InternalVideoAnnotationsDSL.g:1288:3: ( RULE_ID )
            // InternalVideoAnnotationsDSL.g:1289:4: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_18_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_18_1_0_1()); 

            }

             after(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_18_1_0()); 

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
    // $ANTLR end "rule__Annotation__TargetAssignment_18_1"


    // $ANTLR start "rule__Annotation__CommentAssignment_20_1"
    // InternalVideoAnnotationsDSL.g:1300:1: rule__Annotation__CommentAssignment_20_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__CommentAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1304:1: ( ( RULE_STRING ) )
            // InternalVideoAnnotationsDSL.g:1305:2: ( RULE_STRING )
            {
            // InternalVideoAnnotationsDSL.g:1305:2: ( RULE_STRING )
            // InternalVideoAnnotationsDSL.g:1306:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getCommentSTRINGTerminalRuleCall_20_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommentSTRINGTerminalRuleCall_20_1_0()); 

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
    // $ANTLR end "rule__Annotation__CommentAssignment_20_1"


    // $ANTLR start "rule__Move__TypeAssignment"
    // InternalVideoAnnotationsDSL.g:1315:1: rule__Move__TypeAssignment : ( ( rule__Move__TypeAlternatives_0 ) ) ;
    public final void rule__Move__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1319:1: ( ( ( rule__Move__TypeAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1320:2: ( ( rule__Move__TypeAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1320:2: ( ( rule__Move__TypeAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1321:3: ( rule__Move__TypeAlternatives_0 )
            {
             before(grammarAccess.getMoveAccess().getTypeAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1322:3: ( rule__Move__TypeAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1322:4: rule__Move__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAlternatives_0()); 

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
    // $ANTLR end "rule__Move__TypeAssignment"


    // $ANTLR start "rule__Scope__ScopeAssignment"
    // InternalVideoAnnotationsDSL.g:1330:1: rule__Scope__ScopeAssignment : ( ( rule__Scope__ScopeAlternatives_0 ) ) ;
    public final void rule__Scope__ScopeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1334:1: ( ( ( rule__Scope__ScopeAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1335:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1335:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1336:3: ( rule__Scope__ScopeAlternatives_0 )
            {
             before(grammarAccess.getScopeAccess().getScopeAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1337:3: ( rule__Scope__ScopeAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1337:4: rule__Scope__ScopeAlternatives_0
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
    // InternalVideoAnnotationsDSL.g:1345:1: rule__Focus__FocusAssignment : ( ( rule__Focus__FocusAlternatives_0 ) ) ;
    public final void rule__Focus__FocusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1349:1: ( ( ( rule__Focus__FocusAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1350:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1350:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1351:3: ( rule__Focus__FocusAlternatives_0 )
            {
             before(grammarAccess.getFocusAccess().getFocusAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1352:3: ( rule__Focus__FocusAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1352:4: rule__Focus__FocusAlternatives_0
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


    // $ANTLR start "rule__Time__SecAssignment"
    // InternalVideoAnnotationsDSL.g:1360:1: rule__Time__SecAssignment : ( RULE_INT ) ;
    public final void rule__Time__SecAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1364:1: ( ( RULE_INT ) )
            // InternalVideoAnnotationsDSL.g:1365:2: ( RULE_INT )
            {
            // InternalVideoAnnotationsDSL.g:1365:2: ( RULE_INT )
            // InternalVideoAnnotationsDSL.g:1366:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Time__SecAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});

}
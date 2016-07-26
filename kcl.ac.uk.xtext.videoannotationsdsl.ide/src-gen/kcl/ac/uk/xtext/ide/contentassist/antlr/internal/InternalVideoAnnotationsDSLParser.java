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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'propose'", "'question'", "'challenge'", "'justify'", "'withdraw'", "'accept'", "'reject'", "'commit'", "'uncommit'", "'feature'", "'rating'", "'criteria'", "'topic'", "'R'", "'S'", "'G'", "'V'", "'alpha'", "'from'", "'to'", "'annotate'", "'('", "','", "')'"
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
    public static final int T__14=14;
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

                if ( (LA1_0==29) ) {
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
    // InternalVideoAnnotationsDSL.g:234:1: rule__Move__TypeAlternatives_0 : ( ( 'propose' ) | ( 'question' ) | ( 'challenge' ) | ( 'justify' ) | ( 'withdraw' ) | ( 'accept' ) | ( 'reject' ) | ( 'commit' ) | ( 'uncommit' ) );
    public final void rule__Move__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:238:1: ( ( 'propose' ) | ( 'question' ) | ( 'challenge' ) | ( 'justify' ) | ( 'withdraw' ) | ( 'accept' ) | ( 'reject' ) | ( 'commit' ) | ( 'uncommit' ) )
            int alt3=9;
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
                    // InternalVideoAnnotationsDSL.g:287:2: ( 'uncommit' )
                    {
                    // InternalVideoAnnotationsDSL.g:287:2: ( 'uncommit' )
                    // InternalVideoAnnotationsDSL.g:288:3: 'uncommit'
                    {
                     before(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeUncommitKeyword_0_8()); 

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
    // InternalVideoAnnotationsDSL.g:297:1: rule__Scope__ScopeAlternatives_0 : ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) );
    public final void rule__Scope__ScopeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:301:1: ( ( 'feature' ) | ( 'rating' ) | ( 'criteria' ) | ( 'topic' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
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
                    // InternalVideoAnnotationsDSL.g:302:2: ( 'feature' )
                    {
                    // InternalVideoAnnotationsDSL.g:302:2: ( 'feature' )
                    // InternalVideoAnnotationsDSL.g:303:3: 'feature'
                    {
                     before(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeFeatureKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:308:2: ( 'rating' )
                    {
                    // InternalVideoAnnotationsDSL.g:308:2: ( 'rating' )
                    // InternalVideoAnnotationsDSL.g:309:3: 'rating'
                    {
                     before(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeRatingKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:314:2: ( 'criteria' )
                    {
                    // InternalVideoAnnotationsDSL.g:314:2: ( 'criteria' )
                    // InternalVideoAnnotationsDSL.g:315:3: 'criteria'
                    {
                     before(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getScopeAccess().getScopeCriteriaKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:320:2: ( 'topic' )
                    {
                    // InternalVideoAnnotationsDSL.g:320:2: ( 'topic' )
                    // InternalVideoAnnotationsDSL.g:321:3: 'topic'
                    {
                     before(grammarAccess.getScopeAccess().getScopeTopicKeyword_0_3()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:330:1: rule__Focus__FocusAlternatives_0 : ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'alpha' ) );
    public final void rule__Focus__FocusAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:334:1: ( ( 'R' ) | ( 'S' ) | ( 'G' ) | ( 'V' ) | ( 'alpha' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
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
                    // InternalVideoAnnotationsDSL.g:335:2: ( 'R' )
                    {
                    // InternalVideoAnnotationsDSL.g:335:2: ( 'R' )
                    // InternalVideoAnnotationsDSL.g:336:3: 'R'
                    {
                     before(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusRKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoAnnotationsDSL.g:341:2: ( 'S' )
                    {
                    // InternalVideoAnnotationsDSL.g:341:2: ( 'S' )
                    // InternalVideoAnnotationsDSL.g:342:3: 'S'
                    {
                     before(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoAnnotationsDSL.g:347:2: ( 'G' )
                    {
                    // InternalVideoAnnotationsDSL.g:347:2: ( 'G' )
                    // InternalVideoAnnotationsDSL.g:348:3: 'G'
                    {
                     before(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusGKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoAnnotationsDSL.g:353:2: ( 'V' )
                    {
                    // InternalVideoAnnotationsDSL.g:353:2: ( 'V' )
                    // InternalVideoAnnotationsDSL.g:354:3: 'V'
                    {
                     before(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusVKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVideoAnnotationsDSL.g:359:2: ( 'alpha' )
                    {
                    // InternalVideoAnnotationsDSL.g:359:2: ( 'alpha' )
                    // InternalVideoAnnotationsDSL.g:360:3: 'alpha'
                    {
                     before(grammarAccess.getFocusAccess().getFocusAlphaKeyword_0_4()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getFocusAccess().getFocusAlphaKeyword_0_4()); 

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
    // InternalVideoAnnotationsDSL.g:369:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:373:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalVideoAnnotationsDSL.g:374:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalVideoAnnotationsDSL.g:381:1: rule__Annotation__Group__0__Impl : ( 'from' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:385:1: ( ( 'from' ) )
            // InternalVideoAnnotationsDSL.g:386:1: ( 'from' )
            {
            // InternalVideoAnnotationsDSL.g:386:1: ( 'from' )
            // InternalVideoAnnotationsDSL.g:387:2: 'from'
            {
             before(grammarAccess.getAnnotationAccess().getFromKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:396:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:400:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalVideoAnnotationsDSL.g:401:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
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
    // InternalVideoAnnotationsDSL.g:408:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__FromTimeAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:412:1: ( ( ( rule__Annotation__FromTimeAssignment_1 ) ) )
            // InternalVideoAnnotationsDSL.g:413:1: ( ( rule__Annotation__FromTimeAssignment_1 ) )
            {
            // InternalVideoAnnotationsDSL.g:413:1: ( ( rule__Annotation__FromTimeAssignment_1 ) )
            // InternalVideoAnnotationsDSL.g:414:2: ( rule__Annotation__FromTimeAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getFromTimeAssignment_1()); 
            // InternalVideoAnnotationsDSL.g:415:2: ( rule__Annotation__FromTimeAssignment_1 )
            // InternalVideoAnnotationsDSL.g:415:3: rule__Annotation__FromTimeAssignment_1
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
    // InternalVideoAnnotationsDSL.g:423:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:427:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalVideoAnnotationsDSL.g:428:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
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
    // InternalVideoAnnotationsDSL.g:435:1: rule__Annotation__Group__2__Impl : ( 'to' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:439:1: ( ( 'to' ) )
            // InternalVideoAnnotationsDSL.g:440:1: ( 'to' )
            {
            // InternalVideoAnnotationsDSL.g:440:1: ( 'to' )
            // InternalVideoAnnotationsDSL.g:441:2: 'to'
            {
             before(grammarAccess.getAnnotationAccess().getToKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:450:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:454:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // InternalVideoAnnotationsDSL.g:455:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
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
    // InternalVideoAnnotationsDSL.g:462:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__ToTimeAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:466:1: ( ( ( rule__Annotation__ToTimeAssignment_3 ) ) )
            // InternalVideoAnnotationsDSL.g:467:1: ( ( rule__Annotation__ToTimeAssignment_3 ) )
            {
            // InternalVideoAnnotationsDSL.g:467:1: ( ( rule__Annotation__ToTimeAssignment_3 ) )
            // InternalVideoAnnotationsDSL.g:468:2: ( rule__Annotation__ToTimeAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getToTimeAssignment_3()); 
            // InternalVideoAnnotationsDSL.g:469:2: ( rule__Annotation__ToTimeAssignment_3 )
            // InternalVideoAnnotationsDSL.g:469:3: rule__Annotation__ToTimeAssignment_3
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
    // InternalVideoAnnotationsDSL.g:477:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:481:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // InternalVideoAnnotationsDSL.g:482:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
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
    // InternalVideoAnnotationsDSL.g:489:1: rule__Annotation__Group__4__Impl : ( 'annotate' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:493:1: ( ( 'annotate' ) )
            // InternalVideoAnnotationsDSL.g:494:1: ( 'annotate' )
            {
            // InternalVideoAnnotationsDSL.g:494:1: ( 'annotate' )
            // InternalVideoAnnotationsDSL.g:495:2: 'annotate'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotateKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:504:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl rule__Annotation__Group__6 ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:508:1: ( rule__Annotation__Group__5__Impl rule__Annotation__Group__6 )
            // InternalVideoAnnotationsDSL.g:509:2: rule__Annotation__Group__5__Impl rule__Annotation__Group__6
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
    // InternalVideoAnnotationsDSL.g:516:1: rule__Annotation__Group__5__Impl : ( '(' ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:520:1: ( ( '(' ) )
            // InternalVideoAnnotationsDSL.g:521:1: ( '(' )
            {
            // InternalVideoAnnotationsDSL.g:521:1: ( '(' )
            // InternalVideoAnnotationsDSL.g:522:2: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:531:1: rule__Annotation__Group__6 : rule__Annotation__Group__6__Impl rule__Annotation__Group__7 ;
    public final void rule__Annotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:535:1: ( rule__Annotation__Group__6__Impl rule__Annotation__Group__7 )
            // InternalVideoAnnotationsDSL.g:536:2: rule__Annotation__Group__6__Impl rule__Annotation__Group__7
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
    // InternalVideoAnnotationsDSL.g:543:1: rule__Annotation__Group__6__Impl : ( ( rule__Annotation__NameAssignment_6 ) ) ;
    public final void rule__Annotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:547:1: ( ( ( rule__Annotation__NameAssignment_6 ) ) )
            // InternalVideoAnnotationsDSL.g:548:1: ( ( rule__Annotation__NameAssignment_6 ) )
            {
            // InternalVideoAnnotationsDSL.g:548:1: ( ( rule__Annotation__NameAssignment_6 ) )
            // InternalVideoAnnotationsDSL.g:549:2: ( rule__Annotation__NameAssignment_6 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_6()); 
            // InternalVideoAnnotationsDSL.g:550:2: ( rule__Annotation__NameAssignment_6 )
            // InternalVideoAnnotationsDSL.g:550:3: rule__Annotation__NameAssignment_6
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
    // InternalVideoAnnotationsDSL.g:558:1: rule__Annotation__Group__7 : rule__Annotation__Group__7__Impl rule__Annotation__Group__8 ;
    public final void rule__Annotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:562:1: ( rule__Annotation__Group__7__Impl rule__Annotation__Group__8 )
            // InternalVideoAnnotationsDSL.g:563:2: rule__Annotation__Group__7__Impl rule__Annotation__Group__8
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
    // InternalVideoAnnotationsDSL.g:570:1: rule__Annotation__Group__7__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:574:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:575:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:575:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:576:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:585:1: rule__Annotation__Group__8 : rule__Annotation__Group__8__Impl rule__Annotation__Group__9 ;
    public final void rule__Annotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:589:1: ( rule__Annotation__Group__8__Impl rule__Annotation__Group__9 )
            // InternalVideoAnnotationsDSL.g:590:2: rule__Annotation__Group__8__Impl rule__Annotation__Group__9
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
    // InternalVideoAnnotationsDSL.g:597:1: rule__Annotation__Group__8__Impl : ( ( rule__Annotation__SenderAssignment_8 ) ) ;
    public final void rule__Annotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:601:1: ( ( ( rule__Annotation__SenderAssignment_8 ) ) )
            // InternalVideoAnnotationsDSL.g:602:1: ( ( rule__Annotation__SenderAssignment_8 ) )
            {
            // InternalVideoAnnotationsDSL.g:602:1: ( ( rule__Annotation__SenderAssignment_8 ) )
            // InternalVideoAnnotationsDSL.g:603:2: ( rule__Annotation__SenderAssignment_8 )
            {
             before(grammarAccess.getAnnotationAccess().getSenderAssignment_8()); 
            // InternalVideoAnnotationsDSL.g:604:2: ( rule__Annotation__SenderAssignment_8 )
            // InternalVideoAnnotationsDSL.g:604:3: rule__Annotation__SenderAssignment_8
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
    // InternalVideoAnnotationsDSL.g:612:1: rule__Annotation__Group__9 : rule__Annotation__Group__9__Impl rule__Annotation__Group__10 ;
    public final void rule__Annotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:616:1: ( rule__Annotation__Group__9__Impl rule__Annotation__Group__10 )
            // InternalVideoAnnotationsDSL.g:617:2: rule__Annotation__Group__9__Impl rule__Annotation__Group__10
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
    // InternalVideoAnnotationsDSL.g:624:1: rule__Annotation__Group__9__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:628:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:629:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:629:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:630:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_9()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:639:1: rule__Annotation__Group__10 : rule__Annotation__Group__10__Impl rule__Annotation__Group__11 ;
    public final void rule__Annotation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:643:1: ( rule__Annotation__Group__10__Impl rule__Annotation__Group__11 )
            // InternalVideoAnnotationsDSL.g:644:2: rule__Annotation__Group__10__Impl rule__Annotation__Group__11
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
    // InternalVideoAnnotationsDSL.g:651:1: rule__Annotation__Group__10__Impl : ( ( rule__Annotation__TypeAssignment_10 ) ) ;
    public final void rule__Annotation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:655:1: ( ( ( rule__Annotation__TypeAssignment_10 ) ) )
            // InternalVideoAnnotationsDSL.g:656:1: ( ( rule__Annotation__TypeAssignment_10 ) )
            {
            // InternalVideoAnnotationsDSL.g:656:1: ( ( rule__Annotation__TypeAssignment_10 ) )
            // InternalVideoAnnotationsDSL.g:657:2: ( rule__Annotation__TypeAssignment_10 )
            {
             before(grammarAccess.getAnnotationAccess().getTypeAssignment_10()); 
            // InternalVideoAnnotationsDSL.g:658:2: ( rule__Annotation__TypeAssignment_10 )
            // InternalVideoAnnotationsDSL.g:658:3: rule__Annotation__TypeAssignment_10
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
    // InternalVideoAnnotationsDSL.g:666:1: rule__Annotation__Group__11 : rule__Annotation__Group__11__Impl rule__Annotation__Group__12 ;
    public final void rule__Annotation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:670:1: ( rule__Annotation__Group__11__Impl rule__Annotation__Group__12 )
            // InternalVideoAnnotationsDSL.g:671:2: rule__Annotation__Group__11__Impl rule__Annotation__Group__12
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
    // InternalVideoAnnotationsDSL.g:678:1: rule__Annotation__Group__11__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:682:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:683:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:683:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:684:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_11()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:693:1: rule__Annotation__Group__12 : rule__Annotation__Group__12__Impl rule__Annotation__Group__13 ;
    public final void rule__Annotation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:697:1: ( rule__Annotation__Group__12__Impl rule__Annotation__Group__13 )
            // InternalVideoAnnotationsDSL.g:698:2: rule__Annotation__Group__12__Impl rule__Annotation__Group__13
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
    // InternalVideoAnnotationsDSL.g:705:1: rule__Annotation__Group__12__Impl : ( ( rule__Annotation__ScopeAssignment_12 ) ) ;
    public final void rule__Annotation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:709:1: ( ( ( rule__Annotation__ScopeAssignment_12 ) ) )
            // InternalVideoAnnotationsDSL.g:710:1: ( ( rule__Annotation__ScopeAssignment_12 ) )
            {
            // InternalVideoAnnotationsDSL.g:710:1: ( ( rule__Annotation__ScopeAssignment_12 ) )
            // InternalVideoAnnotationsDSL.g:711:2: ( rule__Annotation__ScopeAssignment_12 )
            {
             before(grammarAccess.getAnnotationAccess().getScopeAssignment_12()); 
            // InternalVideoAnnotationsDSL.g:712:2: ( rule__Annotation__ScopeAssignment_12 )
            // InternalVideoAnnotationsDSL.g:712:3: rule__Annotation__ScopeAssignment_12
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
    // InternalVideoAnnotationsDSL.g:720:1: rule__Annotation__Group__13 : rule__Annotation__Group__13__Impl rule__Annotation__Group__14 ;
    public final void rule__Annotation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:724:1: ( rule__Annotation__Group__13__Impl rule__Annotation__Group__14 )
            // InternalVideoAnnotationsDSL.g:725:2: rule__Annotation__Group__13__Impl rule__Annotation__Group__14
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
    // InternalVideoAnnotationsDSL.g:732:1: rule__Annotation__Group__13__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:736:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:737:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:737:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:738:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_13()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:747:1: rule__Annotation__Group__14 : rule__Annotation__Group__14__Impl rule__Annotation__Group__15 ;
    public final void rule__Annotation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:751:1: ( rule__Annotation__Group__14__Impl rule__Annotation__Group__15 )
            // InternalVideoAnnotationsDSL.g:752:2: rule__Annotation__Group__14__Impl rule__Annotation__Group__15
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
    // InternalVideoAnnotationsDSL.g:759:1: rule__Annotation__Group__14__Impl : ( ( rule__Annotation__FocusAssignment_14 ) ) ;
    public final void rule__Annotation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:763:1: ( ( ( rule__Annotation__FocusAssignment_14 ) ) )
            // InternalVideoAnnotationsDSL.g:764:1: ( ( rule__Annotation__FocusAssignment_14 ) )
            {
            // InternalVideoAnnotationsDSL.g:764:1: ( ( rule__Annotation__FocusAssignment_14 ) )
            // InternalVideoAnnotationsDSL.g:765:2: ( rule__Annotation__FocusAssignment_14 )
            {
             before(grammarAccess.getAnnotationAccess().getFocusAssignment_14()); 
            // InternalVideoAnnotationsDSL.g:766:2: ( rule__Annotation__FocusAssignment_14 )
            // InternalVideoAnnotationsDSL.g:766:3: rule__Annotation__FocusAssignment_14
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
    // InternalVideoAnnotationsDSL.g:774:1: rule__Annotation__Group__15 : rule__Annotation__Group__15__Impl rule__Annotation__Group__16 ;
    public final void rule__Annotation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:778:1: ( rule__Annotation__Group__15__Impl rule__Annotation__Group__16 )
            // InternalVideoAnnotationsDSL.g:779:2: rule__Annotation__Group__15__Impl rule__Annotation__Group__16
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
    // InternalVideoAnnotationsDSL.g:786:1: rule__Annotation__Group__15__Impl : ( ',' ) ;
    public final void rule__Annotation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:790:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:791:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:791:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:792:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_15()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoAnnotationsDSL.g:801:1: rule__Annotation__Group__16 : rule__Annotation__Group__16__Impl rule__Annotation__Group__17 ;
    public final void rule__Annotation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:805:1: ( rule__Annotation__Group__16__Impl rule__Annotation__Group__17 )
            // InternalVideoAnnotationsDSL.g:806:2: rule__Annotation__Group__16__Impl rule__Annotation__Group__17
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoAnnotationsDSL.g:813:1: rule__Annotation__Group__16__Impl : ( ( rule__Annotation__ContentAssignment_16 ) ) ;
    public final void rule__Annotation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:817:1: ( ( ( rule__Annotation__ContentAssignment_16 ) ) )
            // InternalVideoAnnotationsDSL.g:818:1: ( ( rule__Annotation__ContentAssignment_16 ) )
            {
            // InternalVideoAnnotationsDSL.g:818:1: ( ( rule__Annotation__ContentAssignment_16 ) )
            // InternalVideoAnnotationsDSL.g:819:2: ( rule__Annotation__ContentAssignment_16 )
            {
             before(grammarAccess.getAnnotationAccess().getContentAssignment_16()); 
            // InternalVideoAnnotationsDSL.g:820:2: ( rule__Annotation__ContentAssignment_16 )
            // InternalVideoAnnotationsDSL.g:820:3: rule__Annotation__ContentAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ContentAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getContentAssignment_16()); 

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
    // InternalVideoAnnotationsDSL.g:828:1: rule__Annotation__Group__17 : rule__Annotation__Group__17__Impl rule__Annotation__Group__18 ;
    public final void rule__Annotation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:832:1: ( rule__Annotation__Group__17__Impl rule__Annotation__Group__18 )
            // InternalVideoAnnotationsDSL.g:833:2: rule__Annotation__Group__17__Impl rule__Annotation__Group__18
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
    // InternalVideoAnnotationsDSL.g:840:1: rule__Annotation__Group__17__Impl : ( ( rule__Annotation__Group_17__0 )? ) ;
    public final void rule__Annotation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:844:1: ( ( ( rule__Annotation__Group_17__0 )? ) )
            // InternalVideoAnnotationsDSL.g:845:1: ( ( rule__Annotation__Group_17__0 )? )
            {
            // InternalVideoAnnotationsDSL.g:845:1: ( ( rule__Annotation__Group_17__0 )? )
            // InternalVideoAnnotationsDSL.g:846:2: ( rule__Annotation__Group_17__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_17()); 
            // InternalVideoAnnotationsDSL.g:847:2: ( rule__Annotation__Group_17__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoAnnotationsDSL.g:847:3: rule__Annotation__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_17()); 

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
    // InternalVideoAnnotationsDSL.g:855:1: rule__Annotation__Group__18 : rule__Annotation__Group__18__Impl ;
    public final void rule__Annotation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:859:1: ( rule__Annotation__Group__18__Impl )
            // InternalVideoAnnotationsDSL.g:860:2: rule__Annotation__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__18__Impl();

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
    // InternalVideoAnnotationsDSL.g:866:1: rule__Annotation__Group__18__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:870:1: ( ( ')' ) )
            // InternalVideoAnnotationsDSL.g:871:1: ( ')' )
            {
            // InternalVideoAnnotationsDSL.g:871:1: ( ')' )
            // InternalVideoAnnotationsDSL.g:872:2: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_18()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_18()); 

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


    // $ANTLR start "rule__Annotation__Group_17__0"
    // InternalVideoAnnotationsDSL.g:882:1: rule__Annotation__Group_17__0 : rule__Annotation__Group_17__0__Impl rule__Annotation__Group_17__1 ;
    public final void rule__Annotation__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:886:1: ( rule__Annotation__Group_17__0__Impl rule__Annotation__Group_17__1 )
            // InternalVideoAnnotationsDSL.g:887:2: rule__Annotation__Group_17__0__Impl rule__Annotation__Group_17__1
            {
            pushFollow(FOLLOW_9);
            rule__Annotation__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group_17__1();

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
    // $ANTLR end "rule__Annotation__Group_17__0"


    // $ANTLR start "rule__Annotation__Group_17__0__Impl"
    // InternalVideoAnnotationsDSL.g:894:1: rule__Annotation__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:898:1: ( ( ',' ) )
            // InternalVideoAnnotationsDSL.g:899:1: ( ',' )
            {
            // InternalVideoAnnotationsDSL.g:899:1: ( ',' )
            // InternalVideoAnnotationsDSL.g:900:2: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_17_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_17_0()); 

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
    // $ANTLR end "rule__Annotation__Group_17__0__Impl"


    // $ANTLR start "rule__Annotation__Group_17__1"
    // InternalVideoAnnotationsDSL.g:909:1: rule__Annotation__Group_17__1 : rule__Annotation__Group_17__1__Impl ;
    public final void rule__Annotation__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:913:1: ( rule__Annotation__Group_17__1__Impl )
            // InternalVideoAnnotationsDSL.g:914:2: rule__Annotation__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_17__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_17__1"


    // $ANTLR start "rule__Annotation__Group_17__1__Impl"
    // InternalVideoAnnotationsDSL.g:920:1: rule__Annotation__Group_17__1__Impl : ( ( rule__Annotation__TargetAssignment_17_1 ) ) ;
    public final void rule__Annotation__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:924:1: ( ( ( rule__Annotation__TargetAssignment_17_1 ) ) )
            // InternalVideoAnnotationsDSL.g:925:1: ( ( rule__Annotation__TargetAssignment_17_1 ) )
            {
            // InternalVideoAnnotationsDSL.g:925:1: ( ( rule__Annotation__TargetAssignment_17_1 ) )
            // InternalVideoAnnotationsDSL.g:926:2: ( rule__Annotation__TargetAssignment_17_1 )
            {
             before(grammarAccess.getAnnotationAccess().getTargetAssignment_17_1()); 
            // InternalVideoAnnotationsDSL.g:927:2: ( rule__Annotation__TargetAssignment_17_1 )
            // InternalVideoAnnotationsDSL.g:927:3: rule__Annotation__TargetAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TargetAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getTargetAssignment_17_1()); 

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
    // $ANTLR end "rule__Annotation__Group_17__1__Impl"


    // $ANTLR start "rule__AnnotatedVideo__AnnotationsAssignment"
    // InternalVideoAnnotationsDSL.g:936:1: rule__AnnotatedVideo__AnnotationsAssignment : ( ruleAnnotation ) ;
    public final void rule__AnnotatedVideo__AnnotationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:940:1: ( ( ruleAnnotation ) )
            // InternalVideoAnnotationsDSL.g:941:2: ( ruleAnnotation )
            {
            // InternalVideoAnnotationsDSL.g:941:2: ( ruleAnnotation )
            // InternalVideoAnnotationsDSL.g:942:3: ruleAnnotation
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
    // InternalVideoAnnotationsDSL.g:951:1: rule__Annotation__FromTimeAssignment_1 : ( ruleTime ) ;
    public final void rule__Annotation__FromTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:955:1: ( ( ruleTime ) )
            // InternalVideoAnnotationsDSL.g:956:2: ( ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:956:2: ( ruleTime )
            // InternalVideoAnnotationsDSL.g:957:3: ruleTime
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
    // InternalVideoAnnotationsDSL.g:966:1: rule__Annotation__ToTimeAssignment_3 : ( ruleTime ) ;
    public final void rule__Annotation__ToTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:970:1: ( ( ruleTime ) )
            // InternalVideoAnnotationsDSL.g:971:2: ( ruleTime )
            {
            // InternalVideoAnnotationsDSL.g:971:2: ( ruleTime )
            // InternalVideoAnnotationsDSL.g:972:3: ruleTime
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
    // InternalVideoAnnotationsDSL.g:981:1: rule__Annotation__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:985:1: ( ( RULE_ID ) )
            // InternalVideoAnnotationsDSL.g:986:2: ( RULE_ID )
            {
            // InternalVideoAnnotationsDSL.g:986:2: ( RULE_ID )
            // InternalVideoAnnotationsDSL.g:987:3: RULE_ID
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
    // InternalVideoAnnotationsDSL.g:996:1: rule__Annotation__SenderAssignment_8 : ( ruleSender ) ;
    public final void rule__Annotation__SenderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1000:1: ( ( ruleSender ) )
            // InternalVideoAnnotationsDSL.g:1001:2: ( ruleSender )
            {
            // InternalVideoAnnotationsDSL.g:1001:2: ( ruleSender )
            // InternalVideoAnnotationsDSL.g:1002:3: ruleSender
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
    // InternalVideoAnnotationsDSL.g:1011:1: rule__Annotation__TypeAssignment_10 : ( ruleMove ) ;
    public final void rule__Annotation__TypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1015:1: ( ( ruleMove ) )
            // InternalVideoAnnotationsDSL.g:1016:2: ( ruleMove )
            {
            // InternalVideoAnnotationsDSL.g:1016:2: ( ruleMove )
            // InternalVideoAnnotationsDSL.g:1017:3: ruleMove
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
    // InternalVideoAnnotationsDSL.g:1026:1: rule__Annotation__ScopeAssignment_12 : ( ruleScope ) ;
    public final void rule__Annotation__ScopeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1030:1: ( ( ruleScope ) )
            // InternalVideoAnnotationsDSL.g:1031:2: ( ruleScope )
            {
            // InternalVideoAnnotationsDSL.g:1031:2: ( ruleScope )
            // InternalVideoAnnotationsDSL.g:1032:3: ruleScope
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
    // InternalVideoAnnotationsDSL.g:1041:1: rule__Annotation__FocusAssignment_14 : ( ruleFocus ) ;
    public final void rule__Annotation__FocusAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1045:1: ( ( ruleFocus ) )
            // InternalVideoAnnotationsDSL.g:1046:2: ( ruleFocus )
            {
            // InternalVideoAnnotationsDSL.g:1046:2: ( ruleFocus )
            // InternalVideoAnnotationsDSL.g:1047:3: ruleFocus
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


    // $ANTLR start "rule__Annotation__ContentAssignment_16"
    // InternalVideoAnnotationsDSL.g:1056:1: rule__Annotation__ContentAssignment_16 : ( RULE_STRING ) ;
    public final void rule__Annotation__ContentAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1060:1: ( ( RULE_STRING ) )
            // InternalVideoAnnotationsDSL.g:1061:2: ( RULE_STRING )
            {
            // InternalVideoAnnotationsDSL.g:1061:2: ( RULE_STRING )
            // InternalVideoAnnotationsDSL.g:1062:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_16_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getContentSTRINGTerminalRuleCall_16_0()); 

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
    // $ANTLR end "rule__Annotation__ContentAssignment_16"


    // $ANTLR start "rule__Annotation__TargetAssignment_17_1"
    // InternalVideoAnnotationsDSL.g:1071:1: rule__Annotation__TargetAssignment_17_1 : ( ( RULE_ID ) ) ;
    public final void rule__Annotation__TargetAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1075:1: ( ( ( RULE_ID ) ) )
            // InternalVideoAnnotationsDSL.g:1076:2: ( ( RULE_ID ) )
            {
            // InternalVideoAnnotationsDSL.g:1076:2: ( ( RULE_ID ) )
            // InternalVideoAnnotationsDSL.g:1077:3: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_17_1_0()); 
            // InternalVideoAnnotationsDSL.g:1078:3: ( RULE_ID )
            // InternalVideoAnnotationsDSL.g:1079:4: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_17_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getTargetAnnotationIDTerminalRuleCall_17_1_0_1()); 

            }

             after(grammarAccess.getAnnotationAccess().getTargetAnnotationCrossReference_17_1_0()); 

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
    // $ANTLR end "rule__Annotation__TargetAssignment_17_1"


    // $ANTLR start "rule__Move__TypeAssignment"
    // InternalVideoAnnotationsDSL.g:1090:1: rule__Move__TypeAssignment : ( ( rule__Move__TypeAlternatives_0 ) ) ;
    public final void rule__Move__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1094:1: ( ( ( rule__Move__TypeAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1095:2: ( ( rule__Move__TypeAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1095:2: ( ( rule__Move__TypeAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1096:3: ( rule__Move__TypeAlternatives_0 )
            {
             before(grammarAccess.getMoveAccess().getTypeAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1097:3: ( rule__Move__TypeAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1097:4: rule__Move__TypeAlternatives_0
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
    // InternalVideoAnnotationsDSL.g:1105:1: rule__Scope__ScopeAssignment : ( ( rule__Scope__ScopeAlternatives_0 ) ) ;
    public final void rule__Scope__ScopeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1109:1: ( ( ( rule__Scope__ScopeAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1110:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1110:2: ( ( rule__Scope__ScopeAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1111:3: ( rule__Scope__ScopeAlternatives_0 )
            {
             before(grammarAccess.getScopeAccess().getScopeAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1112:3: ( rule__Scope__ScopeAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1112:4: rule__Scope__ScopeAlternatives_0
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
    // InternalVideoAnnotationsDSL.g:1120:1: rule__Focus__FocusAssignment : ( ( rule__Focus__FocusAlternatives_0 ) ) ;
    public final void rule__Focus__FocusAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1124:1: ( ( ( rule__Focus__FocusAlternatives_0 ) ) )
            // InternalVideoAnnotationsDSL.g:1125:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            {
            // InternalVideoAnnotationsDSL.g:1125:2: ( ( rule__Focus__FocusAlternatives_0 ) )
            // InternalVideoAnnotationsDSL.g:1126:3: ( rule__Focus__FocusAlternatives_0 )
            {
             before(grammarAccess.getFocusAccess().getFocusAlternatives_0()); 
            // InternalVideoAnnotationsDSL.g:1127:3: ( rule__Focus__FocusAlternatives_0 )
            // InternalVideoAnnotationsDSL.g:1127:4: rule__Focus__FocusAlternatives_0
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
    // InternalVideoAnnotationsDSL.g:1135:1: rule__Time__SecAssignment : ( RULE_INT ) ;
    public final void rule__Time__SecAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoAnnotationsDSL.g:1139:1: ( ( RULE_INT ) )
            // InternalVideoAnnotationsDSL.g:1140:2: ( RULE_INT )
            {
            // InternalVideoAnnotationsDSL.g:1140:2: ( RULE_INT )
            // InternalVideoAnnotationsDSL.g:1141:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});

}
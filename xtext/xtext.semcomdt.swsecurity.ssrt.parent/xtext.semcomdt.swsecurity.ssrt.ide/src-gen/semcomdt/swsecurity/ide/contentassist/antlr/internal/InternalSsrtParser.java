package semcomdt.swsecurity.ide.contentassist.antlr.internal;

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
import semcomdt.swsecurity.services.SsrtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSsrtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Conceptual'", "'Design'", "'Realization'", "'SecurityPattern'", "'SecurityTactic'", "'SolutionTree'", "'contributesTo'", "'{'", "'}'", "'refines'", "'Element'", "'('", "')'", "'Relation'", "'.'"
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


        public InternalSsrtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSsrtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSsrtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSsrt.g"; }


    	private SsrtGrammarAccess grammarAccess;

    	public void setGrammarAccess(SsrtGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSsrt.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSsrt.g:54:1: ( ruleModel EOF )
            // InternalSsrt.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSsrt.g:62:1: ruleModel : ( ( rule__Model__SolutiontreesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:66:2: ( ( ( rule__Model__SolutiontreesAssignment )* ) )
            // InternalSsrt.g:67:2: ( ( rule__Model__SolutiontreesAssignment )* )
            {
            // InternalSsrt.g:67:2: ( ( rule__Model__SolutiontreesAssignment )* )
            // InternalSsrt.g:68:3: ( rule__Model__SolutiontreesAssignment )*
            {
             before(grammarAccess.getModelAccess().getSolutiontreesAssignment()); 
            // InternalSsrt.g:69:3: ( rule__Model__SolutiontreesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSsrt.g:69:4: rule__Model__SolutiontreesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__SolutiontreesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSolutiontreesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSolutionTree"
    // InternalSsrt.g:78:1: entryRuleSolutionTree : ruleSolutionTree EOF ;
    public final void entryRuleSolutionTree() throws RecognitionException {
        try {
            // InternalSsrt.g:79:1: ( ruleSolutionTree EOF )
            // InternalSsrt.g:80:1: ruleSolutionTree EOF
            {
             before(grammarAccess.getSolutionTreeRule()); 
            pushFollow(FOLLOW_1);
            ruleSolutionTree();

            state._fsp--;

             after(grammarAccess.getSolutionTreeRule()); 
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
    // $ANTLR end "entryRuleSolutionTree"


    // $ANTLR start "ruleSolutionTree"
    // InternalSsrt.g:87:1: ruleSolutionTree : ( ( rule__SolutionTree__Group__0 ) ) ;
    public final void ruleSolutionTree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:91:2: ( ( ( rule__SolutionTree__Group__0 ) ) )
            // InternalSsrt.g:92:2: ( ( rule__SolutionTree__Group__0 ) )
            {
            // InternalSsrt.g:92:2: ( ( rule__SolutionTree__Group__0 ) )
            // InternalSsrt.g:93:3: ( rule__SolutionTree__Group__0 )
            {
             before(grammarAccess.getSolutionTreeAccess().getGroup()); 
            // InternalSsrt.g:94:3: ( rule__SolutionTree__Group__0 )
            // InternalSsrt.g:94:4: rule__SolutionTree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionTreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolutionTree"


    // $ANTLR start "entryRuleSolution"
    // InternalSsrt.g:103:1: entryRuleSolution : ruleSolution EOF ;
    public final void entryRuleSolution() throws RecognitionException {
        try {
            // InternalSsrt.g:104:1: ( ruleSolution EOF )
            // InternalSsrt.g:105:1: ruleSolution EOF
            {
             before(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionRule()); 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalSsrt.g:112:1: ruleSolution : ( ( rule__Solution__Group__0 ) ) ;
    public final void ruleSolution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:116:2: ( ( ( rule__Solution__Group__0 ) ) )
            // InternalSsrt.g:117:2: ( ( rule__Solution__Group__0 ) )
            {
            // InternalSsrt.g:117:2: ( ( rule__Solution__Group__0 ) )
            // InternalSsrt.g:118:3: ( rule__Solution__Group__0 )
            {
             before(grammarAccess.getSolutionAccess().getGroup()); 
            // InternalSsrt.g:119:3: ( rule__Solution__Group__0 )
            // InternalSsrt.g:119:4: rule__Solution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleElement"
    // InternalSsrt.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSsrt.g:129:1: ( ruleElement EOF )
            // InternalSsrt.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSsrt.g:137:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:141:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalSsrt.g:142:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalSsrt.g:142:2: ( ( rule__Element__Group__0 ) )
            // InternalSsrt.g:143:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalSsrt.g:144:3: ( rule__Element__Group__0 )
            // InternalSsrt.g:144:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleRelation"
    // InternalSsrt.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalSsrt.g:154:1: ( ruleRelation EOF )
            // InternalSsrt.g:155:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSsrt.g:162:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:166:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalSsrt.g:167:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalSsrt.g:167:2: ( ( rule__Relation__Group__0 ) )
            // InternalSsrt.g:168:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalSsrt.g:169:3: ( rule__Relation__Group__0 )
            // InternalSsrt.g:169:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSsrt.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSsrt.g:179:1: ( ruleQualifiedName EOF )
            // InternalSsrt.g:180:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSsrt.g:187:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:191:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSsrt.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSsrt.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSsrt.g:193:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSsrt.g:194:3: ( rule__QualifiedName__Group__0 )
            // InternalSsrt.g:194:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLevel"
    // InternalSsrt.g:203:1: ruleLevel : ( ( rule__Level__Alternatives ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:207:1: ( ( ( rule__Level__Alternatives ) ) )
            // InternalSsrt.g:208:2: ( ( rule__Level__Alternatives ) )
            {
            // InternalSsrt.g:208:2: ( ( rule__Level__Alternatives ) )
            // InternalSsrt.g:209:3: ( rule__Level__Alternatives )
            {
             before(grammarAccess.getLevelAccess().getAlternatives()); 
            // InternalSsrt.g:210:3: ( rule__Level__Alternatives )
            // InternalSsrt.g:210:4: rule__Level__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Level__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevel"


    // $ANTLR start "ruleSolutionType"
    // InternalSsrt.g:219:1: ruleSolutionType : ( ( rule__SolutionType__Alternatives ) ) ;
    public final void ruleSolutionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:223:1: ( ( ( rule__SolutionType__Alternatives ) ) )
            // InternalSsrt.g:224:2: ( ( rule__SolutionType__Alternatives ) )
            {
            // InternalSsrt.g:224:2: ( ( rule__SolutionType__Alternatives ) )
            // InternalSsrt.g:225:3: ( rule__SolutionType__Alternatives )
            {
             before(grammarAccess.getSolutionTypeAccess().getAlternatives()); 
            // InternalSsrt.g:226:3: ( rule__SolutionType__Alternatives )
            // InternalSsrt.g:226:4: rule__SolutionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SolutionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSolutionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolutionType"


    // $ANTLR start "rule__Level__Alternatives"
    // InternalSsrt.g:234:1: rule__Level__Alternatives : ( ( ( 'Conceptual' ) ) | ( ( 'Design' ) ) | ( ( 'Realization' ) ) );
    public final void rule__Level__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:238:1: ( ( ( 'Conceptual' ) ) | ( ( 'Design' ) ) | ( ( 'Realization' ) ) )
            int alt2=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSsrt.g:239:2: ( ( 'Conceptual' ) )
                    {
                    // InternalSsrt.g:239:2: ( ( 'Conceptual' ) )
                    // InternalSsrt.g:240:3: ( 'Conceptual' )
                    {
                     before(grammarAccess.getLevelAccess().getConceptualEnumLiteralDeclaration_0()); 
                    // InternalSsrt.g:241:3: ( 'Conceptual' )
                    // InternalSsrt.g:241:4: 'Conceptual'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getConceptualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:245:2: ( ( 'Design' ) )
                    {
                    // InternalSsrt.g:245:2: ( ( 'Design' ) )
                    // InternalSsrt.g:246:3: ( 'Design' )
                    {
                     before(grammarAccess.getLevelAccess().getDesignEnumLiteralDeclaration_1()); 
                    // InternalSsrt.g:247:3: ( 'Design' )
                    // InternalSsrt.g:247:4: 'Design'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getDesignEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSsrt.g:251:2: ( ( 'Realization' ) )
                    {
                    // InternalSsrt.g:251:2: ( ( 'Realization' ) )
                    // InternalSsrt.g:252:3: ( 'Realization' )
                    {
                     before(grammarAccess.getLevelAccess().getRealizationEnumLiteralDeclaration_2()); 
                    // InternalSsrt.g:253:3: ( 'Realization' )
                    // InternalSsrt.g:253:4: 'Realization'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getRealizationEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Level__Alternatives"


    // $ANTLR start "rule__SolutionType__Alternatives"
    // InternalSsrt.g:261:1: rule__SolutionType__Alternatives : ( ( ( 'SecurityPattern' ) ) | ( ( 'SecurityTactic' ) ) );
    public final void rule__SolutionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:265:1: ( ( ( 'SecurityPattern' ) ) | ( ( 'SecurityTactic' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSsrt.g:266:2: ( ( 'SecurityPattern' ) )
                    {
                    // InternalSsrt.g:266:2: ( ( 'SecurityPattern' ) )
                    // InternalSsrt.g:267:3: ( 'SecurityPattern' )
                    {
                     before(grammarAccess.getSolutionTypeAccess().getSecurityPatternEnumLiteralDeclaration_0()); 
                    // InternalSsrt.g:268:3: ( 'SecurityPattern' )
                    // InternalSsrt.g:268:4: 'SecurityPattern'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolutionTypeAccess().getSecurityPatternEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:272:2: ( ( 'SecurityTactic' ) )
                    {
                    // InternalSsrt.g:272:2: ( ( 'SecurityTactic' ) )
                    // InternalSsrt.g:273:3: ( 'SecurityTactic' )
                    {
                     before(grammarAccess.getSolutionTypeAccess().getTacticEnumLiteralDeclaration_1()); 
                    // InternalSsrt.g:274:3: ( 'SecurityTactic' )
                    // InternalSsrt.g:274:4: 'SecurityTactic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolutionTypeAccess().getTacticEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SolutionType__Alternatives"


    // $ANTLR start "rule__SolutionTree__Group__0"
    // InternalSsrt.g:282:1: rule__SolutionTree__Group__0 : rule__SolutionTree__Group__0__Impl rule__SolutionTree__Group__1 ;
    public final void rule__SolutionTree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:286:1: ( rule__SolutionTree__Group__0__Impl rule__SolutionTree__Group__1 )
            // InternalSsrt.g:287:2: rule__SolutionTree__Group__0__Impl rule__SolutionTree__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SolutionTree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__1();

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
    // $ANTLR end "rule__SolutionTree__Group__0"


    // $ANTLR start "rule__SolutionTree__Group__0__Impl"
    // InternalSsrt.g:294:1: rule__SolutionTree__Group__0__Impl : ( 'SolutionTree' ) ;
    public final void rule__SolutionTree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:298:1: ( ( 'SolutionTree' ) )
            // InternalSsrt.g:299:1: ( 'SolutionTree' )
            {
            // InternalSsrt.g:299:1: ( 'SolutionTree' )
            // InternalSsrt.g:300:2: 'SolutionTree'
            {
             before(grammarAccess.getSolutionTreeAccess().getSolutionTreeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSolutionTreeAccess().getSolutionTreeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__0__Impl"


    // $ANTLR start "rule__SolutionTree__Group__1"
    // InternalSsrt.g:309:1: rule__SolutionTree__Group__1 : rule__SolutionTree__Group__1__Impl rule__SolutionTree__Group__2 ;
    public final void rule__SolutionTree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:313:1: ( rule__SolutionTree__Group__1__Impl rule__SolutionTree__Group__2 )
            // InternalSsrt.g:314:2: rule__SolutionTree__Group__1__Impl rule__SolutionTree__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SolutionTree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__2();

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
    // $ANTLR end "rule__SolutionTree__Group__1"


    // $ANTLR start "rule__SolutionTree__Group__1__Impl"
    // InternalSsrt.g:321:1: rule__SolutionTree__Group__1__Impl : ( ( rule__SolutionTree__NameAssignment_1 ) ) ;
    public final void rule__SolutionTree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:325:1: ( ( ( rule__SolutionTree__NameAssignment_1 ) ) )
            // InternalSsrt.g:326:1: ( ( rule__SolutionTree__NameAssignment_1 ) )
            {
            // InternalSsrt.g:326:1: ( ( rule__SolutionTree__NameAssignment_1 ) )
            // InternalSsrt.g:327:2: ( rule__SolutionTree__NameAssignment_1 )
            {
             before(grammarAccess.getSolutionTreeAccess().getNameAssignment_1()); 
            // InternalSsrt.g:328:2: ( rule__SolutionTree__NameAssignment_1 )
            // InternalSsrt.g:328:3: rule__SolutionTree__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SolutionTree__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionTreeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__1__Impl"


    // $ANTLR start "rule__SolutionTree__Group__2"
    // InternalSsrt.g:336:1: rule__SolutionTree__Group__2 : rule__SolutionTree__Group__2__Impl rule__SolutionTree__Group__3 ;
    public final void rule__SolutionTree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:340:1: ( rule__SolutionTree__Group__2__Impl rule__SolutionTree__Group__3 )
            // InternalSsrt.g:341:2: rule__SolutionTree__Group__2__Impl rule__SolutionTree__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SolutionTree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__3();

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
    // $ANTLR end "rule__SolutionTree__Group__2"


    // $ANTLR start "rule__SolutionTree__Group__2__Impl"
    // InternalSsrt.g:348:1: rule__SolutionTree__Group__2__Impl : ( 'contributesTo' ) ;
    public final void rule__SolutionTree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:352:1: ( ( 'contributesTo' ) )
            // InternalSsrt.g:353:1: ( 'contributesTo' )
            {
            // InternalSsrt.g:353:1: ( 'contributesTo' )
            // InternalSsrt.g:354:2: 'contributesTo'
            {
             before(grammarAccess.getSolutionTreeAccess().getContributesToKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSolutionTreeAccess().getContributesToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__2__Impl"


    // $ANTLR start "rule__SolutionTree__Group__3"
    // InternalSsrt.g:363:1: rule__SolutionTree__Group__3 : rule__SolutionTree__Group__3__Impl rule__SolutionTree__Group__4 ;
    public final void rule__SolutionTree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:367:1: ( rule__SolutionTree__Group__3__Impl rule__SolutionTree__Group__4 )
            // InternalSsrt.g:368:2: rule__SolutionTree__Group__3__Impl rule__SolutionTree__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SolutionTree__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__4();

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
    // $ANTLR end "rule__SolutionTree__Group__3"


    // $ANTLR start "rule__SolutionTree__Group__3__Impl"
    // InternalSsrt.g:375:1: rule__SolutionTree__Group__3__Impl : ( ( rule__SolutionTree__ContributesToAssignment_3 ) ) ;
    public final void rule__SolutionTree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:379:1: ( ( ( rule__SolutionTree__ContributesToAssignment_3 ) ) )
            // InternalSsrt.g:380:1: ( ( rule__SolutionTree__ContributesToAssignment_3 ) )
            {
            // InternalSsrt.g:380:1: ( ( rule__SolutionTree__ContributesToAssignment_3 ) )
            // InternalSsrt.g:381:2: ( rule__SolutionTree__ContributesToAssignment_3 )
            {
             before(grammarAccess.getSolutionTreeAccess().getContributesToAssignment_3()); 
            // InternalSsrt.g:382:2: ( rule__SolutionTree__ContributesToAssignment_3 )
            // InternalSsrt.g:382:3: rule__SolutionTree__ContributesToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SolutionTree__ContributesToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSolutionTreeAccess().getContributesToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__3__Impl"


    // $ANTLR start "rule__SolutionTree__Group__4"
    // InternalSsrt.g:390:1: rule__SolutionTree__Group__4 : rule__SolutionTree__Group__4__Impl rule__SolutionTree__Group__5 ;
    public final void rule__SolutionTree__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:394:1: ( rule__SolutionTree__Group__4__Impl rule__SolutionTree__Group__5 )
            // InternalSsrt.g:395:2: rule__SolutionTree__Group__4__Impl rule__SolutionTree__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SolutionTree__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__5();

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
    // $ANTLR end "rule__SolutionTree__Group__4"


    // $ANTLR start "rule__SolutionTree__Group__4__Impl"
    // InternalSsrt.g:402:1: rule__SolutionTree__Group__4__Impl : ( '{' ) ;
    public final void rule__SolutionTree__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:406:1: ( ( '{' ) )
            // InternalSsrt.g:407:1: ( '{' )
            {
            // InternalSsrt.g:407:1: ( '{' )
            // InternalSsrt.g:408:2: '{'
            {
             before(grammarAccess.getSolutionTreeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSolutionTreeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__4__Impl"


    // $ANTLR start "rule__SolutionTree__Group__5"
    // InternalSsrt.g:417:1: rule__SolutionTree__Group__5 : rule__SolutionTree__Group__5__Impl rule__SolutionTree__Group__6 ;
    public final void rule__SolutionTree__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:421:1: ( rule__SolutionTree__Group__5__Impl rule__SolutionTree__Group__6 )
            // InternalSsrt.g:422:2: rule__SolutionTree__Group__5__Impl rule__SolutionTree__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__SolutionTree__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__6();

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
    // $ANTLR end "rule__SolutionTree__Group__5"


    // $ANTLR start "rule__SolutionTree__Group__5__Impl"
    // InternalSsrt.g:429:1: rule__SolutionTree__Group__5__Impl : ( ( rule__SolutionTree__ProvidesAssignment_5 )* ) ;
    public final void rule__SolutionTree__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:433:1: ( ( ( rule__SolutionTree__ProvidesAssignment_5 )* ) )
            // InternalSsrt.g:434:1: ( ( rule__SolutionTree__ProvidesAssignment_5 )* )
            {
            // InternalSsrt.g:434:1: ( ( rule__SolutionTree__ProvidesAssignment_5 )* )
            // InternalSsrt.g:435:2: ( rule__SolutionTree__ProvidesAssignment_5 )*
            {
             before(grammarAccess.getSolutionTreeAccess().getProvidesAssignment_5()); 
            // InternalSsrt.g:436:2: ( rule__SolutionTree__ProvidesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSsrt.g:436:3: rule__SolutionTree__ProvidesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SolutionTree__ProvidesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSolutionTreeAccess().getProvidesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__5__Impl"


    // $ANTLR start "rule__SolutionTree__Group__6"
    // InternalSsrt.g:444:1: rule__SolutionTree__Group__6 : rule__SolutionTree__Group__6__Impl ;
    public final void rule__SolutionTree__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:448:1: ( rule__SolutionTree__Group__6__Impl )
            // InternalSsrt.g:449:2: rule__SolutionTree__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SolutionTree__Group__6__Impl();

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
    // $ANTLR end "rule__SolutionTree__Group__6"


    // $ANTLR start "rule__SolutionTree__Group__6__Impl"
    // InternalSsrt.g:455:1: rule__SolutionTree__Group__6__Impl : ( '}' ) ;
    public final void rule__SolutionTree__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:459:1: ( ( '}' ) )
            // InternalSsrt.g:460:1: ( '}' )
            {
            // InternalSsrt.g:460:1: ( '}' )
            // InternalSsrt.g:461:2: '}'
            {
             before(grammarAccess.getSolutionTreeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSolutionTreeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__Group__6__Impl"


    // $ANTLR start "rule__Solution__Group__0"
    // InternalSsrt.g:471:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:475:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalSsrt.g:476:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Solution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__1();

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
    // $ANTLR end "rule__Solution__Group__0"


    // $ANTLR start "rule__Solution__Group__0__Impl"
    // InternalSsrt.g:483:1: rule__Solution__Group__0__Impl : ( ( rule__Solution__KindAssignment_0 ) ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:487:1: ( ( ( rule__Solution__KindAssignment_0 ) ) )
            // InternalSsrt.g:488:1: ( ( rule__Solution__KindAssignment_0 ) )
            {
            // InternalSsrt.g:488:1: ( ( rule__Solution__KindAssignment_0 ) )
            // InternalSsrt.g:489:2: ( rule__Solution__KindAssignment_0 )
            {
             before(grammarAccess.getSolutionAccess().getKindAssignment_0()); 
            // InternalSsrt.g:490:2: ( rule__Solution__KindAssignment_0 )
            // InternalSsrt.g:490:3: rule__Solution__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Solution__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__0__Impl"


    // $ANTLR start "rule__Solution__Group__1"
    // InternalSsrt.g:498:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:502:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalSsrt.g:503:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__2();

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
    // $ANTLR end "rule__Solution__Group__1"


    // $ANTLR start "rule__Solution__Group__1__Impl"
    // InternalSsrt.g:510:1: rule__Solution__Group__1__Impl : ( ( rule__Solution__LevelAssignment_1 ) ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:514:1: ( ( ( rule__Solution__LevelAssignment_1 ) ) )
            // InternalSsrt.g:515:1: ( ( rule__Solution__LevelAssignment_1 ) )
            {
            // InternalSsrt.g:515:1: ( ( rule__Solution__LevelAssignment_1 ) )
            // InternalSsrt.g:516:2: ( rule__Solution__LevelAssignment_1 )
            {
             before(grammarAccess.getSolutionAccess().getLevelAssignment_1()); 
            // InternalSsrt.g:517:2: ( rule__Solution__LevelAssignment_1 )
            // InternalSsrt.g:517:3: rule__Solution__LevelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Solution__LevelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getLevelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__1__Impl"


    // $ANTLR start "rule__Solution__Group__2"
    // InternalSsrt.g:525:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:529:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalSsrt.g:530:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Solution__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__3();

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
    // $ANTLR end "rule__Solution__Group__2"


    // $ANTLR start "rule__Solution__Group__2__Impl"
    // InternalSsrt.g:537:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:541:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalSsrt.g:542:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalSsrt.g:542:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalSsrt.g:543:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalSsrt.g:544:2: ( rule__Solution__NameAssignment_2 )
            // InternalSsrt.g:544:3: rule__Solution__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Solution__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__2__Impl"


    // $ANTLR start "rule__Solution__Group__3"
    // InternalSsrt.g:552:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:556:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalSsrt.g:557:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Solution__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__4();

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
    // $ANTLR end "rule__Solution__Group__3"


    // $ANTLR start "rule__Solution__Group__3__Impl"
    // InternalSsrt.g:564:1: rule__Solution__Group__3__Impl : ( ( rule__Solution__Group_3__0 )? ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:568:1: ( ( ( rule__Solution__Group_3__0 )? ) )
            // InternalSsrt.g:569:1: ( ( rule__Solution__Group_3__0 )? )
            {
            // InternalSsrt.g:569:1: ( ( rule__Solution__Group_3__0 )? )
            // InternalSsrt.g:570:2: ( rule__Solution__Group_3__0 )?
            {
             before(grammarAccess.getSolutionAccess().getGroup_3()); 
            // InternalSsrt.g:571:2: ( rule__Solution__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSsrt.g:571:3: rule__Solution__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__3__Impl"


    // $ANTLR start "rule__Solution__Group__4"
    // InternalSsrt.g:579:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:583:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalSsrt.g:584:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Solution__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__5();

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
    // $ANTLR end "rule__Solution__Group__4"


    // $ANTLR start "rule__Solution__Group__4__Impl"
    // InternalSsrt.g:591:1: rule__Solution__Group__4__Impl : ( '{' ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:595:1: ( ( '{' ) )
            // InternalSsrt.g:596:1: ( '{' )
            {
            // InternalSsrt.g:596:1: ( '{' )
            // InternalSsrt.g:597:2: '{'
            {
             before(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__4__Impl"


    // $ANTLR start "rule__Solution__Group__5"
    // InternalSsrt.g:606:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl rule__Solution__Group__6 ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:610:1: ( rule__Solution__Group__5__Impl rule__Solution__Group__6 )
            // InternalSsrt.g:611:2: rule__Solution__Group__5__Impl rule__Solution__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Solution__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__6();

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
    // $ANTLR end "rule__Solution__Group__5"


    // $ANTLR start "rule__Solution__Group__5__Impl"
    // InternalSsrt.g:618:1: rule__Solution__Group__5__Impl : ( ( rule__Solution__SolutionelementsAssignment_5 )* ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:622:1: ( ( ( rule__Solution__SolutionelementsAssignment_5 )* ) )
            // InternalSsrt.g:623:1: ( ( rule__Solution__SolutionelementsAssignment_5 )* )
            {
            // InternalSsrt.g:623:1: ( ( rule__Solution__SolutionelementsAssignment_5 )* )
            // InternalSsrt.g:624:2: ( rule__Solution__SolutionelementsAssignment_5 )*
            {
             before(grammarAccess.getSolutionAccess().getSolutionelementsAssignment_5()); 
            // InternalSsrt.g:625:2: ( rule__Solution__SolutionelementsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSsrt.g:625:3: rule__Solution__SolutionelementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Solution__SolutionelementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getSolutionelementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__5__Impl"


    // $ANTLR start "rule__Solution__Group__6"
    // InternalSsrt.g:633:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:637:1: ( rule__Solution__Group__6__Impl )
            // InternalSsrt.g:638:2: rule__Solution__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__6__Impl();

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
    // $ANTLR end "rule__Solution__Group__6"


    // $ANTLR start "rule__Solution__Group__6__Impl"
    // InternalSsrt.g:644:1: rule__Solution__Group__6__Impl : ( '}' ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:648:1: ( ( '}' ) )
            // InternalSsrt.g:649:1: ( '}' )
            {
            // InternalSsrt.g:649:1: ( '}' )
            // InternalSsrt.g:650:2: '}'
            {
             before(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__6__Impl"


    // $ANTLR start "rule__Solution__Group_3__0"
    // InternalSsrt.g:660:1: rule__Solution__Group_3__0 : rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1 ;
    public final void rule__Solution__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:664:1: ( rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1 )
            // InternalSsrt.g:665:2: rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group_3__1();

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
    // $ANTLR end "rule__Solution__Group_3__0"


    // $ANTLR start "rule__Solution__Group_3__0__Impl"
    // InternalSsrt.g:672:1: rule__Solution__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__Solution__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:676:1: ( ( 'refines' ) )
            // InternalSsrt.g:677:1: ( 'refines' )
            {
            // InternalSsrt.g:677:1: ( 'refines' )
            // InternalSsrt.g:678:2: 'refines'
            {
             before(grammarAccess.getSolutionAccess().getRefinesKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getRefinesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_3__0__Impl"


    // $ANTLR start "rule__Solution__Group_3__1"
    // InternalSsrt.g:687:1: rule__Solution__Group_3__1 : rule__Solution__Group_3__1__Impl ;
    public final void rule__Solution__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:691:1: ( rule__Solution__Group_3__1__Impl )
            // InternalSsrt.g:692:2: rule__Solution__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group_3__1__Impl();

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
    // $ANTLR end "rule__Solution__Group_3__1"


    // $ANTLR start "rule__Solution__Group_3__1__Impl"
    // InternalSsrt.g:698:1: rule__Solution__Group_3__1__Impl : ( ( ( rule__Solution__RefinesAssignment_3_1 ) ) ( ( rule__Solution__RefinesAssignment_3_1 )* ) ) ;
    public final void rule__Solution__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:702:1: ( ( ( ( rule__Solution__RefinesAssignment_3_1 ) ) ( ( rule__Solution__RefinesAssignment_3_1 )* ) ) )
            // InternalSsrt.g:703:1: ( ( ( rule__Solution__RefinesAssignment_3_1 ) ) ( ( rule__Solution__RefinesAssignment_3_1 )* ) )
            {
            // InternalSsrt.g:703:1: ( ( ( rule__Solution__RefinesAssignment_3_1 ) ) ( ( rule__Solution__RefinesAssignment_3_1 )* ) )
            // InternalSsrt.g:704:2: ( ( rule__Solution__RefinesAssignment_3_1 ) ) ( ( rule__Solution__RefinesAssignment_3_1 )* )
            {
            // InternalSsrt.g:704:2: ( ( rule__Solution__RefinesAssignment_3_1 ) )
            // InternalSsrt.g:705:3: ( rule__Solution__RefinesAssignment_3_1 )
            {
             before(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 
            // InternalSsrt.g:706:3: ( rule__Solution__RefinesAssignment_3_1 )
            // InternalSsrt.g:706:4: rule__Solution__RefinesAssignment_3_1
            {
            pushFollow(FOLLOW_13);
            rule__Solution__RefinesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 

            }

            // InternalSsrt.g:709:2: ( ( rule__Solution__RefinesAssignment_3_1 )* )
            // InternalSsrt.g:710:3: ( rule__Solution__RefinesAssignment_3_1 )*
            {
             before(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 
            // InternalSsrt.g:711:3: ( rule__Solution__RefinesAssignment_3_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSsrt.g:711:4: rule__Solution__RefinesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Solution__RefinesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 

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
    // $ANTLR end "rule__Solution__Group_3__1__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalSsrt.g:721:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:725:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalSsrt.g:726:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalSsrt.g:733:1: rule__Element__Group__0__Impl : ( 'Element' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:737:1: ( ( 'Element' ) )
            // InternalSsrt.g:738:1: ( 'Element' )
            {
            // InternalSsrt.g:738:1: ( 'Element' )
            // InternalSsrt.g:739:2: 'Element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalSsrt.g:748:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:752:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalSsrt.g:753:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__2();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalSsrt.g:760:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:764:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalSsrt.g:765:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalSsrt.g:765:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalSsrt.g:766:2: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // InternalSsrt.g:767:2: ( rule__Element__NameAssignment_1 )
            // InternalSsrt.g:767:3: rule__Element__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalSsrt.g:775:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:779:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalSsrt.g:780:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__3();

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
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalSsrt.g:787:1: rule__Element__Group__2__Impl : ( ( rule__Element__Group_2__0 )? ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:791:1: ( ( ( rule__Element__Group_2__0 )? ) )
            // InternalSsrt.g:792:1: ( ( rule__Element__Group_2__0 )? )
            {
            // InternalSsrt.g:792:1: ( ( rule__Element__Group_2__0 )? )
            // InternalSsrt.g:793:2: ( rule__Element__Group_2__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_2()); 
            // InternalSsrt.g:794:2: ( rule__Element__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSsrt.g:794:3: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalSsrt.g:802:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:806:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalSsrt.g:807:2: rule__Element__Group__3__Impl rule__Element__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__4();

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
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalSsrt.g:814:1: rule__Element__Group__3__Impl : ( '(' ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:818:1: ( ( '(' ) )
            // InternalSsrt.g:819:1: ( '(' )
            {
            // InternalSsrt.g:819:1: ( '(' )
            // InternalSsrt.g:820:2: '('
            {
             before(grammarAccess.getElementAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__4"
    // InternalSsrt.g:829:1: rule__Element__Group__4 : rule__Element__Group__4__Impl rule__Element__Group__5 ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:833:1: ( rule__Element__Group__4__Impl rule__Element__Group__5 )
            // InternalSsrt.g:834:2: rule__Element__Group__4__Impl rule__Element__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Element__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__5();

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
    // $ANTLR end "rule__Element__Group__4"


    // $ANTLR start "rule__Element__Group__4__Impl"
    // InternalSsrt.g:841:1: rule__Element__Group__4__Impl : ( ( rule__Element__DefinitionAssignment_4 ) ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:845:1: ( ( ( rule__Element__DefinitionAssignment_4 ) ) )
            // InternalSsrt.g:846:1: ( ( rule__Element__DefinitionAssignment_4 ) )
            {
            // InternalSsrt.g:846:1: ( ( rule__Element__DefinitionAssignment_4 ) )
            // InternalSsrt.g:847:2: ( rule__Element__DefinitionAssignment_4 )
            {
             before(grammarAccess.getElementAccess().getDefinitionAssignment_4()); 
            // InternalSsrt.g:848:2: ( rule__Element__DefinitionAssignment_4 )
            // InternalSsrt.g:848:3: rule__Element__DefinitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Element__DefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getDefinitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4__Impl"


    // $ANTLR start "rule__Element__Group__5"
    // InternalSsrt.g:856:1: rule__Element__Group__5 : rule__Element__Group__5__Impl rule__Element__Group__6 ;
    public final void rule__Element__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:860:1: ( rule__Element__Group__5__Impl rule__Element__Group__6 )
            // InternalSsrt.g:861:2: rule__Element__Group__5__Impl rule__Element__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Element__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__6();

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
    // $ANTLR end "rule__Element__Group__5"


    // $ANTLR start "rule__Element__Group__5__Impl"
    // InternalSsrt.g:868:1: rule__Element__Group__5__Impl : ( ')' ) ;
    public final void rule__Element__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:872:1: ( ( ')' ) )
            // InternalSsrt.g:873:1: ( ')' )
            {
            // InternalSsrt.g:873:1: ( ')' )
            // InternalSsrt.g:874:2: ')'
            {
             before(grammarAccess.getElementAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__5__Impl"


    // $ANTLR start "rule__Element__Group__6"
    // InternalSsrt.g:883:1: rule__Element__Group__6 : rule__Element__Group__6__Impl ;
    public final void rule__Element__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:887:1: ( rule__Element__Group__6__Impl )
            // InternalSsrt.g:888:2: rule__Element__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__6__Impl();

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
    // $ANTLR end "rule__Element__Group__6"


    // $ANTLR start "rule__Element__Group__6__Impl"
    // InternalSsrt.g:894:1: rule__Element__Group__6__Impl : ( ( rule__Element__SourceAssignment_6 )* ) ;
    public final void rule__Element__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:898:1: ( ( ( rule__Element__SourceAssignment_6 )* ) )
            // InternalSsrt.g:899:1: ( ( rule__Element__SourceAssignment_6 )* )
            {
            // InternalSsrt.g:899:1: ( ( rule__Element__SourceAssignment_6 )* )
            // InternalSsrt.g:900:2: ( rule__Element__SourceAssignment_6 )*
            {
             before(grammarAccess.getElementAccess().getSourceAssignment_6()); 
            // InternalSsrt.g:901:2: ( rule__Element__SourceAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSsrt.g:901:3: rule__Element__SourceAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Element__SourceAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getElementAccess().getSourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__6__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // InternalSsrt.g:910:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:914:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalSsrt.g:915:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1();

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
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // InternalSsrt.g:922:1: rule__Element__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:926:1: ( ( 'refines' ) )
            // InternalSsrt.g:927:1: ( 'refines' )
            {
            // InternalSsrt.g:927:1: ( 'refines' )
            // InternalSsrt.g:928:2: 'refines'
            {
             before(grammarAccess.getElementAccess().getRefinesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRefinesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // InternalSsrt.g:937:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:941:1: ( rule__Element__Group_2__1__Impl )
            // InternalSsrt.g:942:2: rule__Element__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // InternalSsrt.g:948:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__RefinesAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:952:1: ( ( ( rule__Element__RefinesAssignment_2_1 ) ) )
            // InternalSsrt.g:953:1: ( ( rule__Element__RefinesAssignment_2_1 ) )
            {
            // InternalSsrt.g:953:1: ( ( rule__Element__RefinesAssignment_2_1 ) )
            // InternalSsrt.g:954:2: ( rule__Element__RefinesAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getRefinesAssignment_2_1()); 
            // InternalSsrt.g:955:2: ( rule__Element__RefinesAssignment_2_1 )
            // InternalSsrt.g:955:3: rule__Element__RefinesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__RefinesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getRefinesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSsrt.g:964:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:968:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSsrt.g:969:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalSsrt.g:976:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:980:1: ( ( 'Relation' ) )
            // InternalSsrt.g:981:1: ( 'Relation' )
            {
            // InternalSsrt.g:981:1: ( 'Relation' )
            // InternalSsrt.g:982:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalSsrt.g:991:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:995:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSsrt.g:996:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalSsrt.g:1003:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1007:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSsrt.g:1008:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSsrt.g:1008:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSsrt.g:1009:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSsrt.g:1010:2: ( rule__Relation__NameAssignment_1 )
            // InternalSsrt.g:1010:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalSsrt.g:1018:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1022:1: ( rule__Relation__Group__2__Impl )
            // InternalSsrt.g:1023:2: rule__Relation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__2__Impl();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalSsrt.g:1029:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TargetAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1033:1: ( ( ( rule__Relation__TargetAssignment_2 ) ) )
            // InternalSsrt.g:1034:1: ( ( rule__Relation__TargetAssignment_2 ) )
            {
            // InternalSsrt.g:1034:1: ( ( rule__Relation__TargetAssignment_2 ) )
            // InternalSsrt.g:1035:2: ( rule__Relation__TargetAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_2()); 
            // InternalSsrt.g:1036:2: ( rule__Relation__TargetAssignment_2 )
            // InternalSsrt.g:1036:3: rule__Relation__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSsrt.g:1045:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1049:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSsrt.g:1050:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSsrt.g:1057:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1061:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1062:1: ( RULE_ID )
            {
            // InternalSsrt.g:1062:1: ( RULE_ID )
            // InternalSsrt.g:1063:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSsrt.g:1072:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1076:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSsrt.g:1077:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSsrt.g:1083:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1087:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSsrt.g:1088:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSsrt.g:1088:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSsrt.g:1089:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSsrt.g:1090:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSsrt.g:1090:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSsrt.g:1099:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1103:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSsrt.g:1104:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSsrt.g:1111:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1115:1: ( ( '.' ) )
            // InternalSsrt.g:1116:1: ( '.' )
            {
            // InternalSsrt.g:1116:1: ( '.' )
            // InternalSsrt.g:1117:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSsrt.g:1126:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1130:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSsrt.g:1131:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSsrt.g:1137:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1141:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1142:1: ( RULE_ID )
            {
            // InternalSsrt.g:1142:1: ( RULE_ID )
            // InternalSsrt.g:1143:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__SolutiontreesAssignment"
    // InternalSsrt.g:1153:1: rule__Model__SolutiontreesAssignment : ( ruleSolutionTree ) ;
    public final void rule__Model__SolutiontreesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1157:1: ( ( ruleSolutionTree ) )
            // InternalSsrt.g:1158:2: ( ruleSolutionTree )
            {
            // InternalSsrt.g:1158:2: ( ruleSolutionTree )
            // InternalSsrt.g:1159:3: ruleSolutionTree
            {
             before(grammarAccess.getModelAccess().getSolutiontreesSolutionTreeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSolutionTree();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSolutiontreesSolutionTreeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SolutiontreesAssignment"


    // $ANTLR start "rule__SolutionTree__NameAssignment_1"
    // InternalSsrt.g:1168:1: rule__SolutionTree__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SolutionTree__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1172:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1173:2: ( RULE_ID )
            {
            // InternalSsrt.g:1173:2: ( RULE_ID )
            // InternalSsrt.g:1174:3: RULE_ID
            {
             before(grammarAccess.getSolutionTreeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSolutionTreeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__NameAssignment_1"


    // $ANTLR start "rule__SolutionTree__ContributesToAssignment_3"
    // InternalSsrt.g:1183:1: rule__SolutionTree__ContributesToAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SolutionTree__ContributesToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1187:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1188:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1188:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1189:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyCrossReference_3_0()); 
            // InternalSsrt.g:1190:3: ( ruleQualifiedName )
            // InternalSsrt.g:1191:4: ruleQualifiedName
            {
             before(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__ContributesToAssignment_3"


    // $ANTLR start "rule__SolutionTree__ProvidesAssignment_5"
    // InternalSsrt.g:1202:1: rule__SolutionTree__ProvidesAssignment_5 : ( ruleSolution ) ;
    public final void rule__SolutionTree__ProvidesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1206:1: ( ( ruleSolution ) )
            // InternalSsrt.g:1207:2: ( ruleSolution )
            {
            // InternalSsrt.g:1207:2: ( ruleSolution )
            // InternalSsrt.g:1208:3: ruleSolution
            {
             before(grammarAccess.getSolutionTreeAccess().getProvidesSolutionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionTreeAccess().getProvidesSolutionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__ProvidesAssignment_5"


    // $ANTLR start "rule__Solution__KindAssignment_0"
    // InternalSsrt.g:1217:1: rule__Solution__KindAssignment_0 : ( ruleSolutionType ) ;
    public final void rule__Solution__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1221:1: ( ( ruleSolutionType ) )
            // InternalSsrt.g:1222:2: ( ruleSolutionType )
            {
            // InternalSsrt.g:1222:2: ( ruleSolutionType )
            // InternalSsrt.g:1223:3: ruleSolutionType
            {
             before(grammarAccess.getSolutionAccess().getKindSolutionTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSolutionType();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getKindSolutionTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__KindAssignment_0"


    // $ANTLR start "rule__Solution__LevelAssignment_1"
    // InternalSsrt.g:1232:1: rule__Solution__LevelAssignment_1 : ( ruleLevel ) ;
    public final void rule__Solution__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1236:1: ( ( ruleLevel ) )
            // InternalSsrt.g:1237:2: ( ruleLevel )
            {
            // InternalSsrt.g:1237:2: ( ruleLevel )
            // InternalSsrt.g:1238:3: ruleLevel
            {
             before(grammarAccess.getSolutionAccess().getLevelLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getLevelLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__LevelAssignment_1"


    // $ANTLR start "rule__Solution__NameAssignment_2"
    // InternalSsrt.g:1247:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1251:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1252:2: ( RULE_ID )
            {
            // InternalSsrt.g:1252:2: ( RULE_ID )
            // InternalSsrt.g:1253:3: RULE_ID
            {
             before(grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__NameAssignment_2"


    // $ANTLR start "rule__Solution__RefinesAssignment_3_1"
    // InternalSsrt.g:1262:1: rule__Solution__RefinesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Solution__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1266:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1267:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1267:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1268:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSolutionAccess().getRefinesSolutionCrossReference_3_1_0()); 
            // InternalSsrt.g:1269:3: ( ruleQualifiedName )
            // InternalSsrt.g:1270:4: ruleQualifiedName
            {
             before(grammarAccess.getSolutionAccess().getRefinesSolutionQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getRefinesSolutionQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSolutionAccess().getRefinesSolutionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__RefinesAssignment_3_1"


    // $ANTLR start "rule__Solution__SolutionelementsAssignment_5"
    // InternalSsrt.g:1281:1: rule__Solution__SolutionelementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Solution__SolutionelementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1285:1: ( ( ruleElement ) )
            // InternalSsrt.g:1286:2: ( ruleElement )
            {
            // InternalSsrt.g:1286:2: ( ruleElement )
            // InternalSsrt.g:1287:3: ruleElement
            {
             before(grammarAccess.getSolutionAccess().getSolutionelementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getSolutionelementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__SolutionelementsAssignment_5"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // InternalSsrt.g:1296:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1300:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1301:2: ( RULE_ID )
            {
            // InternalSsrt.g:1301:2: ( RULE_ID )
            // InternalSsrt.g:1302:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__RefinesAssignment_2_1"
    // InternalSsrt.g:1311:1: rule__Element__RefinesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Element__RefinesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1315:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1316:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1316:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1317:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementAccess().getRefinesElementCrossReference_2_1_0()); 
            // InternalSsrt.g:1318:3: ( ruleQualifiedName )
            // InternalSsrt.g:1319:4: ruleQualifiedName
            {
             before(grammarAccess.getElementAccess().getRefinesElementQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementAccess().getRefinesElementQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getRefinesElementCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__RefinesAssignment_2_1"


    // $ANTLR start "rule__Element__DefinitionAssignment_4"
    // InternalSsrt.g:1330:1: rule__Element__DefinitionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Element__DefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1334:1: ( ( RULE_STRING ) )
            // InternalSsrt.g:1335:2: ( RULE_STRING )
            {
            // InternalSsrt.g:1335:2: ( RULE_STRING )
            // InternalSsrt.g:1336:3: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__DefinitionAssignment_4"


    // $ANTLR start "rule__Element__SourceAssignment_6"
    // InternalSsrt.g:1345:1: rule__Element__SourceAssignment_6 : ( ruleRelation ) ;
    public final void rule__Element__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1349:1: ( ( ruleRelation ) )
            // InternalSsrt.g:1350:2: ( ruleRelation )
            {
            // InternalSsrt.g:1350:2: ( ruleRelation )
            // InternalSsrt.g:1351:3: ruleRelation
            {
             before(grammarAccess.getElementAccess().getSourceRelationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getElementAccess().getSourceRelationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__SourceAssignment_6"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSsrt.g:1360:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1364:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1365:2: ( RULE_ID )
            {
            // InternalSsrt.g:1365:2: ( RULE_ID )
            // InternalSsrt.g:1366:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__TargetAssignment_2"
    // InternalSsrt.g:1375:1: rule__Relation__TargetAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1379:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1380:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1380:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1381:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationAccess().getTargetElementCrossReference_2_0()); 
            // InternalSsrt.g:1382:3: ( ruleQualifiedName )
            // InternalSsrt.g:1383:4: ruleQualifiedName
            {
             before(grammarAccess.getRelationAccess().getTargetElementQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getTargetElementQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTargetElementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TargetAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Conceptual'", "'Design'", "'Realization'", "'SecurityPattern'", "'Tactic'", "'SolutionTree'", "'contributesTo'", "'{'", "'}'", "'refines'", "'Solution Element'", "'('", "')'", "'Relation'", "'->'", "'.'"
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


    // $ANTLR start "entryRuleSolutionElement"
    // InternalSsrt.g:128:1: entryRuleSolutionElement : ruleSolutionElement EOF ;
    public final void entryRuleSolutionElement() throws RecognitionException {
        try {
            // InternalSsrt.g:129:1: ( ruleSolutionElement EOF )
            // InternalSsrt.g:130:1: ruleSolutionElement EOF
            {
             before(grammarAccess.getSolutionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSolutionElement();

            state._fsp--;

             after(grammarAccess.getSolutionElementRule()); 
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
    // $ANTLR end "entryRuleSolutionElement"


    // $ANTLR start "ruleSolutionElement"
    // InternalSsrt.g:137:1: ruleSolutionElement : ( ( rule__SolutionElement__Group__0 ) ) ;
    public final void ruleSolutionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:141:2: ( ( ( rule__SolutionElement__Group__0 ) ) )
            // InternalSsrt.g:142:2: ( ( rule__SolutionElement__Group__0 ) )
            {
            // InternalSsrt.g:142:2: ( ( rule__SolutionElement__Group__0 ) )
            // InternalSsrt.g:143:3: ( rule__SolutionElement__Group__0 )
            {
             before(grammarAccess.getSolutionElementAccess().getGroup()); 
            // InternalSsrt.g:144:3: ( rule__SolutionElement__Group__0 )
            // InternalSsrt.g:144:4: rule__SolutionElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolutionElement"


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


    // $ANTLR start "ruleSSTLevel"
    // InternalSsrt.g:203:1: ruleSSTLevel : ( ( rule__SSTLevel__Alternatives ) ) ;
    public final void ruleSSTLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:207:1: ( ( ( rule__SSTLevel__Alternatives ) ) )
            // InternalSsrt.g:208:2: ( ( rule__SSTLevel__Alternatives ) )
            {
            // InternalSsrt.g:208:2: ( ( rule__SSTLevel__Alternatives ) )
            // InternalSsrt.g:209:3: ( rule__SSTLevel__Alternatives )
            {
             before(grammarAccess.getSSTLevelAccess().getAlternatives()); 
            // InternalSsrt.g:210:3: ( rule__SSTLevel__Alternatives )
            // InternalSsrt.g:210:4: rule__SSTLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SSTLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSSTLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSTLevel"


    // $ANTLR start "ruleSSTSolutionKind"
    // InternalSsrt.g:219:1: ruleSSTSolutionKind : ( ( rule__SSTSolutionKind__Alternatives ) ) ;
    public final void ruleSSTSolutionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:223:1: ( ( ( rule__SSTSolutionKind__Alternatives ) ) )
            // InternalSsrt.g:224:2: ( ( rule__SSTSolutionKind__Alternatives ) )
            {
            // InternalSsrt.g:224:2: ( ( rule__SSTSolutionKind__Alternatives ) )
            // InternalSsrt.g:225:3: ( rule__SSTSolutionKind__Alternatives )
            {
             before(grammarAccess.getSSTSolutionKindAccess().getAlternatives()); 
            // InternalSsrt.g:226:3: ( rule__SSTSolutionKind__Alternatives )
            // InternalSsrt.g:226:4: rule__SSTSolutionKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SSTSolutionKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSSTSolutionKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSTSolutionKind"


    // $ANTLR start "rule__SSTLevel__Alternatives"
    // InternalSsrt.g:234:1: rule__SSTLevel__Alternatives : ( ( ( 'Conceptual' ) ) | ( ( 'Design' ) ) | ( ( 'Realization' ) ) );
    public final void rule__SSTLevel__Alternatives() throws RecognitionException {

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
                     before(grammarAccess.getSSTLevelAccess().getConceptualEnumLiteralDeclaration_0()); 
                    // InternalSsrt.g:241:3: ( 'Conceptual' )
                    // InternalSsrt.g:241:4: 'Conceptual'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSSTLevelAccess().getConceptualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:245:2: ( ( 'Design' ) )
                    {
                    // InternalSsrt.g:245:2: ( ( 'Design' ) )
                    // InternalSsrt.g:246:3: ( 'Design' )
                    {
                     before(grammarAccess.getSSTLevelAccess().getDesignEnumLiteralDeclaration_1()); 
                    // InternalSsrt.g:247:3: ( 'Design' )
                    // InternalSsrt.g:247:4: 'Design'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSSTLevelAccess().getDesignEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSsrt.g:251:2: ( ( 'Realization' ) )
                    {
                    // InternalSsrt.g:251:2: ( ( 'Realization' ) )
                    // InternalSsrt.g:252:3: ( 'Realization' )
                    {
                     before(grammarAccess.getSSTLevelAccess().getRealizationEnumLiteralDeclaration_2()); 
                    // InternalSsrt.g:253:3: ( 'Realization' )
                    // InternalSsrt.g:253:4: 'Realization'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSSTLevelAccess().getRealizationEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SSTLevel__Alternatives"


    // $ANTLR start "rule__SSTSolutionKind__Alternatives"
    // InternalSsrt.g:261:1: rule__SSTSolutionKind__Alternatives : ( ( ( 'SecurityPattern' ) ) | ( ( 'Tactic' ) ) );
    public final void rule__SSTSolutionKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:265:1: ( ( ( 'SecurityPattern' ) ) | ( ( 'Tactic' ) ) )
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
                     before(grammarAccess.getSSTSolutionKindAccess().getSecurityPatternEnumLiteralDeclaration_0()); 
                    // InternalSsrt.g:268:3: ( 'SecurityPattern' )
                    // InternalSsrt.g:268:4: 'SecurityPattern'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSSTSolutionKindAccess().getSecurityPatternEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:272:2: ( ( 'Tactic' ) )
                    {
                    // InternalSsrt.g:272:2: ( ( 'Tactic' ) )
                    // InternalSsrt.g:273:3: ( 'Tactic' )
                    {
                     before(grammarAccess.getSSTSolutionKindAccess().getTacticEnumLiteralDeclaration_1()); 
                    // InternalSsrt.g:274:3: ( 'Tactic' )
                    // InternalSsrt.g:274:4: 'Tactic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSSTSolutionKindAccess().getTacticEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SSTSolutionKind__Alternatives"


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
    // InternalSsrt.g:429:1: rule__SolutionTree__Group__5__Impl : ( ( rule__SolutionTree__SolutionAssignment_5 )* ) ;
    public final void rule__SolutionTree__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:433:1: ( ( ( rule__SolutionTree__SolutionAssignment_5 )* ) )
            // InternalSsrt.g:434:1: ( ( rule__SolutionTree__SolutionAssignment_5 )* )
            {
            // InternalSsrt.g:434:1: ( ( rule__SolutionTree__SolutionAssignment_5 )* )
            // InternalSsrt.g:435:2: ( rule__SolutionTree__SolutionAssignment_5 )*
            {
             before(grammarAccess.getSolutionTreeAccess().getSolutionAssignment_5()); 
            // InternalSsrt.g:436:2: ( rule__SolutionTree__SolutionAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSsrt.g:436:3: rule__SolutionTree__SolutionAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SolutionTree__SolutionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSolutionTreeAccess().getSolutionAssignment_5()); 

            }


            }

        }
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
    // InternalSsrt.g:618:1: rule__Solution__Group__5__Impl : ( ( rule__Solution__ConceptsAssignment_5 )* ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:622:1: ( ( ( rule__Solution__ConceptsAssignment_5 )* ) )
            // InternalSsrt.g:623:1: ( ( rule__Solution__ConceptsAssignment_5 )* )
            {
            // InternalSsrt.g:623:1: ( ( rule__Solution__ConceptsAssignment_5 )* )
            // InternalSsrt.g:624:2: ( rule__Solution__ConceptsAssignment_5 )*
            {
             before(grammarAccess.getSolutionAccess().getConceptsAssignment_5()); 
            // InternalSsrt.g:625:2: ( rule__Solution__ConceptsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSsrt.g:625:3: rule__Solution__ConceptsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Solution__ConceptsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getConceptsAssignment_5()); 

            }


            }

        }
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
    // InternalSsrt.g:633:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl rule__Solution__Group__7 ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:637:1: ( rule__Solution__Group__6__Impl rule__Solution__Group__7 )
            // InternalSsrt.g:638:2: rule__Solution__Group__6__Impl rule__Solution__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Solution__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__7();

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
    // InternalSsrt.g:645:1: rule__Solution__Group__6__Impl : ( ( rule__Solution__RelationsAssignment_6 )* ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:649:1: ( ( ( rule__Solution__RelationsAssignment_6 )* ) )
            // InternalSsrt.g:650:1: ( ( rule__Solution__RelationsAssignment_6 )* )
            {
            // InternalSsrt.g:650:1: ( ( rule__Solution__RelationsAssignment_6 )* )
            // InternalSsrt.g:651:2: ( rule__Solution__RelationsAssignment_6 )*
            {
             before(grammarAccess.getSolutionAccess().getRelationsAssignment_6()); 
            // InternalSsrt.g:652:2: ( rule__Solution__RelationsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSsrt.g:652:3: rule__Solution__RelationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Solution__RelationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getRelationsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Solution__Group__7"
    // InternalSsrt.g:660:1: rule__Solution__Group__7 : rule__Solution__Group__7__Impl ;
    public final void rule__Solution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:664:1: ( rule__Solution__Group__7__Impl )
            // InternalSsrt.g:665:2: rule__Solution__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__7__Impl();

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
    // $ANTLR end "rule__Solution__Group__7"


    // $ANTLR start "rule__Solution__Group__7__Impl"
    // InternalSsrt.g:671:1: rule__Solution__Group__7__Impl : ( '}' ) ;
    public final void rule__Solution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:675:1: ( ( '}' ) )
            // InternalSsrt.g:676:1: ( '}' )
            {
            // InternalSsrt.g:676:1: ( '}' )
            // InternalSsrt.g:677:2: '}'
            {
             before(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__7__Impl"


    // $ANTLR start "rule__Solution__Group_3__0"
    // InternalSsrt.g:687:1: rule__Solution__Group_3__0 : rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1 ;
    public final void rule__Solution__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:691:1: ( rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1 )
            // InternalSsrt.g:692:2: rule__Solution__Group_3__0__Impl rule__Solution__Group_3__1
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
    // InternalSsrt.g:699:1: rule__Solution__Group_3__0__Impl : ( 'refines' ) ;
    public final void rule__Solution__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:703:1: ( ( 'refines' ) )
            // InternalSsrt.g:704:1: ( 'refines' )
            {
            // InternalSsrt.g:704:1: ( 'refines' )
            // InternalSsrt.g:705:2: 'refines'
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
    // InternalSsrt.g:714:1: rule__Solution__Group_3__1 : rule__Solution__Group_3__1__Impl ;
    public final void rule__Solution__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:718:1: ( rule__Solution__Group_3__1__Impl )
            // InternalSsrt.g:719:2: rule__Solution__Group_3__1__Impl
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
    // InternalSsrt.g:725:1: rule__Solution__Group_3__1__Impl : ( ( rule__Solution__RefinesAssignment_3_1 )* ) ;
    public final void rule__Solution__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:729:1: ( ( ( rule__Solution__RefinesAssignment_3_1 )* ) )
            // InternalSsrt.g:730:1: ( ( rule__Solution__RefinesAssignment_3_1 )* )
            {
            // InternalSsrt.g:730:1: ( ( rule__Solution__RefinesAssignment_3_1 )* )
            // InternalSsrt.g:731:2: ( rule__Solution__RefinesAssignment_3_1 )*
            {
             before(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 
            // InternalSsrt.g:732:2: ( rule__Solution__RefinesAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSsrt.g:732:3: rule__Solution__RefinesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Solution__RefinesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSolutionAccess().getRefinesAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SolutionElement__Group__0"
    // InternalSsrt.g:741:1: rule__SolutionElement__Group__0 : rule__SolutionElement__Group__0__Impl rule__SolutionElement__Group__1 ;
    public final void rule__SolutionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:745:1: ( rule__SolutionElement__Group__0__Impl rule__SolutionElement__Group__1 )
            // InternalSsrt.g:746:2: rule__SolutionElement__Group__0__Impl rule__SolutionElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SolutionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__1();

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
    // $ANTLR end "rule__SolutionElement__Group__0"


    // $ANTLR start "rule__SolutionElement__Group__0__Impl"
    // InternalSsrt.g:753:1: rule__SolutionElement__Group__0__Impl : ( 'Solution Element' ) ;
    public final void rule__SolutionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:757:1: ( ( 'Solution Element' ) )
            // InternalSsrt.g:758:1: ( 'Solution Element' )
            {
            // InternalSsrt.g:758:1: ( 'Solution Element' )
            // InternalSsrt.g:759:2: 'Solution Element'
            {
             before(grammarAccess.getSolutionElementAccess().getSolutionElementKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getSolutionElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__0__Impl"


    // $ANTLR start "rule__SolutionElement__Group__1"
    // InternalSsrt.g:768:1: rule__SolutionElement__Group__1 : rule__SolutionElement__Group__1__Impl rule__SolutionElement__Group__2 ;
    public final void rule__SolutionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:772:1: ( rule__SolutionElement__Group__1__Impl rule__SolutionElement__Group__2 )
            // InternalSsrt.g:773:2: rule__SolutionElement__Group__1__Impl rule__SolutionElement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SolutionElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__2();

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
    // $ANTLR end "rule__SolutionElement__Group__1"


    // $ANTLR start "rule__SolutionElement__Group__1__Impl"
    // InternalSsrt.g:780:1: rule__SolutionElement__Group__1__Impl : ( ( rule__SolutionElement__NameAssignment_1 ) ) ;
    public final void rule__SolutionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:784:1: ( ( ( rule__SolutionElement__NameAssignment_1 ) ) )
            // InternalSsrt.g:785:1: ( ( rule__SolutionElement__NameAssignment_1 ) )
            {
            // InternalSsrt.g:785:1: ( ( rule__SolutionElement__NameAssignment_1 ) )
            // InternalSsrt.g:786:2: ( rule__SolutionElement__NameAssignment_1 )
            {
             before(grammarAccess.getSolutionElementAccess().getNameAssignment_1()); 
            // InternalSsrt.g:787:2: ( rule__SolutionElement__NameAssignment_1 )
            // InternalSsrt.g:787:3: rule__SolutionElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__1__Impl"


    // $ANTLR start "rule__SolutionElement__Group__2"
    // InternalSsrt.g:795:1: rule__SolutionElement__Group__2 : rule__SolutionElement__Group__2__Impl rule__SolutionElement__Group__3 ;
    public final void rule__SolutionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:799:1: ( rule__SolutionElement__Group__2__Impl rule__SolutionElement__Group__3 )
            // InternalSsrt.g:800:2: rule__SolutionElement__Group__2__Impl rule__SolutionElement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SolutionElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__3();

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
    // $ANTLR end "rule__SolutionElement__Group__2"


    // $ANTLR start "rule__SolutionElement__Group__2__Impl"
    // InternalSsrt.g:807:1: rule__SolutionElement__Group__2__Impl : ( ( rule__SolutionElement__Group_2__0 )? ) ;
    public final void rule__SolutionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:811:1: ( ( ( rule__SolutionElement__Group_2__0 )? ) )
            // InternalSsrt.g:812:1: ( ( rule__SolutionElement__Group_2__0 )? )
            {
            // InternalSsrt.g:812:1: ( ( rule__SolutionElement__Group_2__0 )? )
            // InternalSsrt.g:813:2: ( rule__SolutionElement__Group_2__0 )?
            {
             before(grammarAccess.getSolutionElementAccess().getGroup_2()); 
            // InternalSsrt.g:814:2: ( rule__SolutionElement__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSsrt.g:814:3: rule__SolutionElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SolutionElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__2__Impl"


    // $ANTLR start "rule__SolutionElement__Group__3"
    // InternalSsrt.g:822:1: rule__SolutionElement__Group__3 : rule__SolutionElement__Group__3__Impl rule__SolutionElement__Group__4 ;
    public final void rule__SolutionElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:826:1: ( rule__SolutionElement__Group__3__Impl rule__SolutionElement__Group__4 )
            // InternalSsrt.g:827:2: rule__SolutionElement__Group__3__Impl rule__SolutionElement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SolutionElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__4();

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
    // $ANTLR end "rule__SolutionElement__Group__3"


    // $ANTLR start "rule__SolutionElement__Group__3__Impl"
    // InternalSsrt.g:834:1: rule__SolutionElement__Group__3__Impl : ( '(' ) ;
    public final void rule__SolutionElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:838:1: ( ( '(' ) )
            // InternalSsrt.g:839:1: ( '(' )
            {
            // InternalSsrt.g:839:1: ( '(' )
            // InternalSsrt.g:840:2: '('
            {
             before(grammarAccess.getSolutionElementAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__3__Impl"


    // $ANTLR start "rule__SolutionElement__Group__4"
    // InternalSsrt.g:849:1: rule__SolutionElement__Group__4 : rule__SolutionElement__Group__4__Impl rule__SolutionElement__Group__5 ;
    public final void rule__SolutionElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:853:1: ( rule__SolutionElement__Group__4__Impl rule__SolutionElement__Group__5 )
            // InternalSsrt.g:854:2: rule__SolutionElement__Group__4__Impl rule__SolutionElement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__SolutionElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__5();

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
    // $ANTLR end "rule__SolutionElement__Group__4"


    // $ANTLR start "rule__SolutionElement__Group__4__Impl"
    // InternalSsrt.g:861:1: rule__SolutionElement__Group__4__Impl : ( ( rule__SolutionElement__DefinitionAssignment_4 ) ) ;
    public final void rule__SolutionElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:865:1: ( ( ( rule__SolutionElement__DefinitionAssignment_4 ) ) )
            // InternalSsrt.g:866:1: ( ( rule__SolutionElement__DefinitionAssignment_4 ) )
            {
            // InternalSsrt.g:866:1: ( ( rule__SolutionElement__DefinitionAssignment_4 ) )
            // InternalSsrt.g:867:2: ( rule__SolutionElement__DefinitionAssignment_4 )
            {
             before(grammarAccess.getSolutionElementAccess().getDefinitionAssignment_4()); 
            // InternalSsrt.g:868:2: ( rule__SolutionElement__DefinitionAssignment_4 )
            // InternalSsrt.g:868:3: rule__SolutionElement__DefinitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__DefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSolutionElementAccess().getDefinitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__4__Impl"


    // $ANTLR start "rule__SolutionElement__Group__5"
    // InternalSsrt.g:876:1: rule__SolutionElement__Group__5 : rule__SolutionElement__Group__5__Impl ;
    public final void rule__SolutionElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:880:1: ( rule__SolutionElement__Group__5__Impl )
            // InternalSsrt.g:881:2: rule__SolutionElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group__5__Impl();

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
    // $ANTLR end "rule__SolutionElement__Group__5"


    // $ANTLR start "rule__SolutionElement__Group__5__Impl"
    // InternalSsrt.g:887:1: rule__SolutionElement__Group__5__Impl : ( ')' ) ;
    public final void rule__SolutionElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:891:1: ( ( ')' ) )
            // InternalSsrt.g:892:1: ( ')' )
            {
            // InternalSsrt.g:892:1: ( ')' )
            // InternalSsrt.g:893:2: ')'
            {
             before(grammarAccess.getSolutionElementAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group__5__Impl"


    // $ANTLR start "rule__SolutionElement__Group_2__0"
    // InternalSsrt.g:903:1: rule__SolutionElement__Group_2__0 : rule__SolutionElement__Group_2__0__Impl rule__SolutionElement__Group_2__1 ;
    public final void rule__SolutionElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:907:1: ( rule__SolutionElement__Group_2__0__Impl rule__SolutionElement__Group_2__1 )
            // InternalSsrt.g:908:2: rule__SolutionElement__Group_2__0__Impl rule__SolutionElement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SolutionElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group_2__1();

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
    // $ANTLR end "rule__SolutionElement__Group_2__0"


    // $ANTLR start "rule__SolutionElement__Group_2__0__Impl"
    // InternalSsrt.g:915:1: rule__SolutionElement__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__SolutionElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:919:1: ( ( 'refines' ) )
            // InternalSsrt.g:920:1: ( 'refines' )
            {
            // InternalSsrt.g:920:1: ( 'refines' )
            // InternalSsrt.g:921:2: 'refines'
            {
             before(grammarAccess.getSolutionElementAccess().getRefinesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getRefinesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group_2__0__Impl"


    // $ANTLR start "rule__SolutionElement__Group_2__1"
    // InternalSsrt.g:930:1: rule__SolutionElement__Group_2__1 : rule__SolutionElement__Group_2__1__Impl ;
    public final void rule__SolutionElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:934:1: ( rule__SolutionElement__Group_2__1__Impl )
            // InternalSsrt.g:935:2: rule__SolutionElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__Group_2__1__Impl();

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
    // $ANTLR end "rule__SolutionElement__Group_2__1"


    // $ANTLR start "rule__SolutionElement__Group_2__1__Impl"
    // InternalSsrt.g:941:1: rule__SolutionElement__Group_2__1__Impl : ( ( rule__SolutionElement__RefinesAssignment_2_1 ) ) ;
    public final void rule__SolutionElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:945:1: ( ( ( rule__SolutionElement__RefinesAssignment_2_1 ) ) )
            // InternalSsrt.g:946:1: ( ( rule__SolutionElement__RefinesAssignment_2_1 ) )
            {
            // InternalSsrt.g:946:1: ( ( rule__SolutionElement__RefinesAssignment_2_1 ) )
            // InternalSsrt.g:947:2: ( rule__SolutionElement__RefinesAssignment_2_1 )
            {
             before(grammarAccess.getSolutionElementAccess().getRefinesAssignment_2_1()); 
            // InternalSsrt.g:948:2: ( rule__SolutionElement__RefinesAssignment_2_1 )
            // InternalSsrt.g:948:3: rule__SolutionElement__RefinesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SolutionElement__RefinesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionElementAccess().getRefinesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__Group_2__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalSsrt.g:957:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:961:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalSsrt.g:962:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalSsrt.g:969:1: rule__Relation__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:973:1: ( ( 'Relation' ) )
            // InternalSsrt.g:974:1: ( 'Relation' )
            {
            // InternalSsrt.g:974:1: ( 'Relation' )
            // InternalSsrt.g:975:2: 'Relation'
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
    // InternalSsrt.g:984:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:988:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalSsrt.g:989:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSsrt.g:996:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1000:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalSsrt.g:1001:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalSsrt.g:1001:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalSsrt.g:1002:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalSsrt.g:1003:2: ( rule__Relation__NameAssignment_1 )
            // InternalSsrt.g:1003:3: rule__Relation__NameAssignment_1
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
    // InternalSsrt.g:1011:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1015:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalSsrt.g:1016:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // InternalSsrt.g:1023:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )? ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1027:1: ( ( ( rule__Relation__Group_2__0 )? ) )
            // InternalSsrt.g:1028:1: ( ( rule__Relation__Group_2__0 )? )
            {
            // InternalSsrt.g:1028:1: ( ( rule__Relation__Group_2__0 )? )
            // InternalSsrt.g:1029:2: ( rule__Relation__Group_2__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalSsrt.g:1030:2: ( rule__Relation__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSsrt.g:1030:3: rule__Relation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Relation__Group__3"
    // InternalSsrt.g:1038:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1042:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalSsrt.g:1043:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalSsrt.g:1050:1: rule__Relation__Group__3__Impl : ( '(' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1054:1: ( ( '(' ) )
            // InternalSsrt.g:1055:1: ( '(' )
            {
            // InternalSsrt.g:1055:1: ( '(' )
            // InternalSsrt.g:1056:2: '('
            {
             before(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalSsrt.g:1065:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1069:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalSsrt.g:1070:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalSsrt.g:1077:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__DefinitionAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1081:1: ( ( ( rule__Relation__DefinitionAssignment_4 ) ) )
            // InternalSsrt.g:1082:1: ( ( rule__Relation__DefinitionAssignment_4 ) )
            {
            // InternalSsrt.g:1082:1: ( ( rule__Relation__DefinitionAssignment_4 ) )
            // InternalSsrt.g:1083:2: ( rule__Relation__DefinitionAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getDefinitionAssignment_4()); 
            // InternalSsrt.g:1084:2: ( rule__Relation__DefinitionAssignment_4 )
            // InternalSsrt.g:1084:3: rule__Relation__DefinitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__DefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getDefinitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalSsrt.g:1092:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1096:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalSsrt.g:1097:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalSsrt.g:1104:1: rule__Relation__Group__5__Impl : ( ')' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1108:1: ( ( ')' ) )
            // InternalSsrt.g:1109:1: ( ')' )
            {
            // InternalSsrt.g:1109:1: ( ')' )
            // InternalSsrt.g:1110:2: ')'
            {
             before(grammarAccess.getRelationAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalSsrt.g:1119:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1123:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalSsrt.g:1124:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

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
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalSsrt.g:1131:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__InAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1135:1: ( ( ( rule__Relation__InAssignment_6 ) ) )
            // InternalSsrt.g:1136:1: ( ( rule__Relation__InAssignment_6 ) )
            {
            // InternalSsrt.g:1136:1: ( ( rule__Relation__InAssignment_6 ) )
            // InternalSsrt.g:1137:2: ( rule__Relation__InAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getInAssignment_6()); 
            // InternalSsrt.g:1138:2: ( rule__Relation__InAssignment_6 )
            // InternalSsrt.g:1138:3: rule__Relation__InAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__InAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getInAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalSsrt.g:1146:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1150:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalSsrt.g:1151:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

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
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalSsrt.g:1158:1: rule__Relation__Group__7__Impl : ( '->' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1162:1: ( ( '->' ) )
            // InternalSsrt.g:1163:1: ( '->' )
            {
            // InternalSsrt.g:1163:1: ( '->' )
            // InternalSsrt.g:1164:2: '->'
            {
             before(grammarAccess.getRelationAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getHyphenMinusGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalSsrt.g:1173:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1177:1: ( rule__Relation__Group__8__Impl )
            // InternalSsrt.g:1178:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__8__Impl();

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
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalSsrt.g:1184:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__OutAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1188:1: ( ( ( rule__Relation__OutAssignment_8 ) ) )
            // InternalSsrt.g:1189:1: ( ( rule__Relation__OutAssignment_8 ) )
            {
            // InternalSsrt.g:1189:1: ( ( rule__Relation__OutAssignment_8 ) )
            // InternalSsrt.g:1190:2: ( rule__Relation__OutAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getOutAssignment_8()); 
            // InternalSsrt.g:1191:2: ( rule__Relation__OutAssignment_8 )
            // InternalSsrt.g:1191:3: rule__Relation__OutAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__OutAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getOutAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group_2__0"
    // InternalSsrt.g:1200:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1204:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalSsrt.g:1205:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__1();

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
    // $ANTLR end "rule__Relation__Group_2__0"


    // $ANTLR start "rule__Relation__Group_2__0__Impl"
    // InternalSsrt.g:1212:1: rule__Relation__Group_2__0__Impl : ( 'refines' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1216:1: ( ( 'refines' ) )
            // InternalSsrt.g:1217:1: ( 'refines' )
            {
            // InternalSsrt.g:1217:1: ( 'refines' )
            // InternalSsrt.g:1218:2: 'refines'
            {
             before(grammarAccess.getRelationAccess().getRefinesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRefinesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__0__Impl"


    // $ANTLR start "rule__Relation__Group_2__1"
    // InternalSsrt.g:1227:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1231:1: ( rule__Relation__Group_2__1__Impl )
            // InternalSsrt.g:1232:2: rule__Relation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__1__Impl();

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
    // $ANTLR end "rule__Relation__Group_2__1"


    // $ANTLR start "rule__Relation__Group_2__1__Impl"
    // InternalSsrt.g:1238:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__RefinesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1242:1: ( ( ( rule__Relation__RefinesAssignment_2_1 ) ) )
            // InternalSsrt.g:1243:1: ( ( rule__Relation__RefinesAssignment_2_1 ) )
            {
            // InternalSsrt.g:1243:1: ( ( rule__Relation__RefinesAssignment_2_1 ) )
            // InternalSsrt.g:1244:2: ( rule__Relation__RefinesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getRefinesAssignment_2_1()); 
            // InternalSsrt.g:1245:2: ( rule__Relation__RefinesAssignment_2_1 )
            // InternalSsrt.g:1245:3: rule__Relation__RefinesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RefinesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRefinesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSsrt.g:1254:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1258:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSsrt.g:1259:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalSsrt.g:1266:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1270:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1271:1: ( RULE_ID )
            {
            // InternalSsrt.g:1271:1: ( RULE_ID )
            // InternalSsrt.g:1272:2: RULE_ID
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
    // InternalSsrt.g:1281:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1285:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSsrt.g:1286:2: rule__QualifiedName__Group__1__Impl
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
    // InternalSsrt.g:1292:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1296:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSsrt.g:1297:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSsrt.g:1297:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSsrt.g:1298:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSsrt.g:1299:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSsrt.g:1299:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSsrt.g:1308:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1312:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSsrt.g:1313:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalSsrt.g:1320:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1324:1: ( ( '.' ) )
            // InternalSsrt.g:1325:1: ( '.' )
            {
            // InternalSsrt.g:1325:1: ( '.' )
            // InternalSsrt.g:1326:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSsrt.g:1335:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1339:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSsrt.g:1340:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalSsrt.g:1346:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1350:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1351:1: ( RULE_ID )
            {
            // InternalSsrt.g:1351:1: ( RULE_ID )
            // InternalSsrt.g:1352:2: RULE_ID
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
    // InternalSsrt.g:1362:1: rule__Model__SolutiontreesAssignment : ( ruleSolutionTree ) ;
    public final void rule__Model__SolutiontreesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1366:1: ( ( ruleSolutionTree ) )
            // InternalSsrt.g:1367:2: ( ruleSolutionTree )
            {
            // InternalSsrt.g:1367:2: ( ruleSolutionTree )
            // InternalSsrt.g:1368:3: ruleSolutionTree
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
    // InternalSsrt.g:1377:1: rule__SolutionTree__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SolutionTree__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1381:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1382:2: ( RULE_ID )
            {
            // InternalSsrt.g:1382:2: ( RULE_ID )
            // InternalSsrt.g:1383:3: RULE_ID
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
    // InternalSsrt.g:1392:1: rule__SolutionTree__ContributesToAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SolutionTree__ContributesToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1396:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1397:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1397:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1398:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyCrossReference_3_0()); 
            // InternalSsrt.g:1399:3: ( ruleQualifiedName )
            // InternalSsrt.g:1400:4: ruleQualifiedName
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


    // $ANTLR start "rule__SolutionTree__SolutionAssignment_5"
    // InternalSsrt.g:1411:1: rule__SolutionTree__SolutionAssignment_5 : ( ruleSolution ) ;
    public final void rule__SolutionTree__SolutionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1415:1: ( ( ruleSolution ) )
            // InternalSsrt.g:1416:2: ( ruleSolution )
            {
            // InternalSsrt.g:1416:2: ( ruleSolution )
            // InternalSsrt.g:1417:3: ruleSolution
            {
             before(grammarAccess.getSolutionTreeAccess().getSolutionSolutionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionTreeAccess().getSolutionSolutionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionTree__SolutionAssignment_5"


    // $ANTLR start "rule__Solution__KindAssignment_0"
    // InternalSsrt.g:1426:1: rule__Solution__KindAssignment_0 : ( ruleSSTSolutionKind ) ;
    public final void rule__Solution__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1430:1: ( ( ruleSSTSolutionKind ) )
            // InternalSsrt.g:1431:2: ( ruleSSTSolutionKind )
            {
            // InternalSsrt.g:1431:2: ( ruleSSTSolutionKind )
            // InternalSsrt.g:1432:3: ruleSSTSolutionKind
            {
             before(grammarAccess.getSolutionAccess().getKindSSTSolutionKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSSTSolutionKind();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getKindSSTSolutionKindEnumRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSsrt.g:1441:1: rule__Solution__LevelAssignment_1 : ( ruleSSTLevel ) ;
    public final void rule__Solution__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1445:1: ( ( ruleSSTLevel ) )
            // InternalSsrt.g:1446:2: ( ruleSSTLevel )
            {
            // InternalSsrt.g:1446:2: ( ruleSSTLevel )
            // InternalSsrt.g:1447:3: ruleSSTLevel
            {
             before(grammarAccess.getSolutionAccess().getLevelSSTLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSSTLevel();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getLevelSSTLevelEnumRuleCall_1_0()); 

            }


            }

        }
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
    // InternalSsrt.g:1456:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1460:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1461:2: ( RULE_ID )
            {
            // InternalSsrt.g:1461:2: ( RULE_ID )
            // InternalSsrt.g:1462:3: RULE_ID
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
    // InternalSsrt.g:1471:1: rule__Solution__RefinesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Solution__RefinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1475:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1476:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1476:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1477:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSolutionAccess().getRefinesSolutionCrossReference_3_1_0()); 
            // InternalSsrt.g:1478:3: ( ruleQualifiedName )
            // InternalSsrt.g:1479:4: ruleQualifiedName
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


    // $ANTLR start "rule__Solution__ConceptsAssignment_5"
    // InternalSsrt.g:1490:1: rule__Solution__ConceptsAssignment_5 : ( ruleSolutionElement ) ;
    public final void rule__Solution__ConceptsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1494:1: ( ( ruleSolutionElement ) )
            // InternalSsrt.g:1495:2: ( ruleSolutionElement )
            {
            // InternalSsrt.g:1495:2: ( ruleSolutionElement )
            // InternalSsrt.g:1496:3: ruleSolutionElement
            {
             before(grammarAccess.getSolutionAccess().getConceptsSolutionElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSolutionElement();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getConceptsSolutionElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__ConceptsAssignment_5"


    // $ANTLR start "rule__Solution__RelationsAssignment_6"
    // InternalSsrt.g:1505:1: rule__Solution__RelationsAssignment_6 : ( ruleRelation ) ;
    public final void rule__Solution__RelationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1509:1: ( ( ruleRelation ) )
            // InternalSsrt.g:1510:2: ( ruleRelation )
            {
            // InternalSsrt.g:1510:2: ( ruleRelation )
            // InternalSsrt.g:1511:3: ruleRelation
            {
             before(grammarAccess.getSolutionAccess().getRelationsRelationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getRelationsRelationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__RelationsAssignment_6"


    // $ANTLR start "rule__SolutionElement__NameAssignment_1"
    // InternalSsrt.g:1520:1: rule__SolutionElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SolutionElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1524:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1525:2: ( RULE_ID )
            {
            // InternalSsrt.g:1525:2: ( RULE_ID )
            // InternalSsrt.g:1526:3: RULE_ID
            {
             before(grammarAccess.getSolutionElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__NameAssignment_1"


    // $ANTLR start "rule__SolutionElement__RefinesAssignment_2_1"
    // InternalSsrt.g:1535:1: rule__SolutionElement__RefinesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SolutionElement__RefinesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1539:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1540:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1540:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1541:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSolutionElementAccess().getRefinesSolutionElementCrossReference_2_1_0()); 
            // InternalSsrt.g:1542:3: ( ruleQualifiedName )
            // InternalSsrt.g:1543:4: ruleQualifiedName
            {
             before(grammarAccess.getSolutionElementAccess().getRefinesSolutionElementQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSolutionElementAccess().getRefinesSolutionElementQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSolutionElementAccess().getRefinesSolutionElementCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__RefinesAssignment_2_1"


    // $ANTLR start "rule__SolutionElement__DefinitionAssignment_4"
    // InternalSsrt.g:1554:1: rule__SolutionElement__DefinitionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SolutionElement__DefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1558:1: ( ( RULE_STRING ) )
            // InternalSsrt.g:1559:2: ( RULE_STRING )
            {
            // InternalSsrt.g:1559:2: ( RULE_STRING )
            // InternalSsrt.g:1560:3: RULE_STRING
            {
             before(grammarAccess.getSolutionElementAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSolutionElementAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolutionElement__DefinitionAssignment_4"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalSsrt.g:1569:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1573:1: ( ( RULE_ID ) )
            // InternalSsrt.g:1574:2: ( RULE_ID )
            {
            // InternalSsrt.g:1574:2: ( RULE_ID )
            // InternalSsrt.g:1575:3: RULE_ID
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


    // $ANTLR start "rule__Relation__RefinesAssignment_2_1"
    // InternalSsrt.g:1584:1: rule__Relation__RefinesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__RefinesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1588:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1589:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1589:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1590:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationAccess().getRefinesRelationCrossReference_2_1_0()); 
            // InternalSsrt.g:1591:3: ( ruleQualifiedName )
            // InternalSsrt.g:1592:4: ruleQualifiedName
            {
             before(grammarAccess.getRelationAccess().getRefinesRelationQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRefinesRelationQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getRefinesRelationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RefinesAssignment_2_1"


    // $ANTLR start "rule__Relation__DefinitionAssignment_4"
    // InternalSsrt.g:1603:1: rule__Relation__DefinitionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Relation__DefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1607:1: ( ( RULE_STRING ) )
            // InternalSsrt.g:1608:2: ( RULE_STRING )
            {
            // InternalSsrt.g:1608:2: ( RULE_STRING )
            // InternalSsrt.g:1609:3: RULE_STRING
            {
             before(grammarAccess.getRelationAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getDefinitionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__DefinitionAssignment_4"


    // $ANTLR start "rule__Relation__InAssignment_6"
    // InternalSsrt.g:1618:1: rule__Relation__InAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__InAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1622:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1623:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1623:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1624:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationAccess().getInSolutionElementCrossReference_6_0()); 
            // InternalSsrt.g:1625:3: ( ruleQualifiedName )
            // InternalSsrt.g:1626:4: ruleQualifiedName
            {
             before(grammarAccess.getRelationAccess().getInSolutionElementQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getInSolutionElementQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getInSolutionElementCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__InAssignment_6"


    // $ANTLR start "rule__Relation__OutAssignment_8"
    // InternalSsrt.g:1637:1: rule__Relation__OutAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__OutAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSsrt.g:1641:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:1642:2: ( ( ruleQualifiedName ) )
            {
            // InternalSsrt.g:1642:2: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:1643:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationAccess().getOutSolutionElementCrossReference_8_0()); 
            // InternalSsrt.g:1644:3: ( ruleQualifiedName )
            // InternalSsrt.g:1645:4: ruleQualifiedName
            {
             before(grammarAccess.getRelationAccess().getOutSolutionElementQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getOutSolutionElementQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getOutSolutionElementCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OutAssignment_8"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}
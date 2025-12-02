package semcomdt.swarchitecture.ide.contentassist.antlr.internal;

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
import semcomdt.swarchitecture.services.CbseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCbseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IN'", "'OUT'", "'connector'", "'port'", "':'", "'realizes'", "'passiveComponent'", "'activeComponent'", "'{'", "'}'", "'function'", "'interactionNature'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCbseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCbseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCbseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCbse.g"; }


    	private CbseGrammarAccess grammarAccess;

    	public void setGrammarAccess(CbseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCbse"
    // InternalCbse.g:53:1: entryRuleCbse : ruleCbse EOF ;
    public final void entryRuleCbse() throws RecognitionException {
        try {
            // InternalCbse.g:54:1: ( ruleCbse EOF )
            // InternalCbse.g:55:1: ruleCbse EOF
            {
             before(grammarAccess.getCbseRule()); 
            pushFollow(FOLLOW_1);
            ruleCbse();

            state._fsp--;

             after(grammarAccess.getCbseRule()); 
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
    // $ANTLR end "entryRuleCbse"


    // $ANTLR start "ruleCbse"
    // InternalCbse.g:62:1: ruleCbse : ( ( rule__Cbse__SystemAssignment )* ) ;
    public final void ruleCbse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:66:2: ( ( ( rule__Cbse__SystemAssignment )* ) )
            // InternalCbse.g:67:2: ( ( rule__Cbse__SystemAssignment )* )
            {
            // InternalCbse.g:67:2: ( ( rule__Cbse__SystemAssignment )* )
            // InternalCbse.g:68:3: ( rule__Cbse__SystemAssignment )*
            {
             before(grammarAccess.getCbseAccess().getSystemAssignment()); 
            // InternalCbse.g:69:3: ( rule__Cbse__SystemAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCbse.g:69:4: rule__Cbse__SystemAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Cbse__SystemAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCbseAccess().getSystemAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCbse"


    // $ANTLR start "entryRuleElement"
    // InternalCbse.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCbse.g:79:1: ( ruleElement EOF )
            // InternalCbse.g:80:1: ruleElement EOF
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
    // InternalCbse.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalCbse.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalCbse.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalCbse.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalCbse.g:94:3: ( rule__Element__Alternatives )
            // InternalCbse.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComponent"
    // InternalCbse.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalCbse.g:104:1: ( ruleComponent EOF )
            // InternalCbse.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCbse.g:112:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:116:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalCbse.g:117:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalCbse.g:117:2: ( ( rule__Component__Alternatives ) )
            // InternalCbse.g:118:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalCbse.g:119:3: ( rule__Component__Alternatives )
            // InternalCbse.g:119:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalCbse.g:128:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCbse.g:129:1: ( ruleConnector EOF )
            // InternalCbse.g:130:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCbse.g:137:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:141:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCbse.g:142:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCbse.g:142:2: ( ( rule__Connector__Group__0 ) )
            // InternalCbse.g:143:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCbse.g:144:3: ( rule__Connector__Group__0 )
            // InternalCbse.g:144:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort"
    // InternalCbse.g:153:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalCbse.g:154:1: ( rulePort EOF )
            // InternalCbse.g:155:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalCbse.g:162:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:166:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalCbse.g:167:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalCbse.g:167:2: ( ( rule__Port__Group__0 ) )
            // InternalCbse.g:168:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalCbse.g:169:3: ( rule__Port__Group__0 )
            // InternalCbse.g:169:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRulePassiveComponent"
    // InternalCbse.g:178:1: entryRulePassiveComponent : rulePassiveComponent EOF ;
    public final void entryRulePassiveComponent() throws RecognitionException {
        try {
            // InternalCbse.g:179:1: ( rulePassiveComponent EOF )
            // InternalCbse.g:180:1: rulePassiveComponent EOF
            {
             before(grammarAccess.getPassiveComponentRule()); 
            pushFollow(FOLLOW_1);
            rulePassiveComponent();

            state._fsp--;

             after(grammarAccess.getPassiveComponentRule()); 
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
    // $ANTLR end "entryRulePassiveComponent"


    // $ANTLR start "rulePassiveComponent"
    // InternalCbse.g:187:1: rulePassiveComponent : ( ( rule__PassiveComponent__Group__0 ) ) ;
    public final void rulePassiveComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:191:2: ( ( ( rule__PassiveComponent__Group__0 ) ) )
            // InternalCbse.g:192:2: ( ( rule__PassiveComponent__Group__0 ) )
            {
            // InternalCbse.g:192:2: ( ( rule__PassiveComponent__Group__0 ) )
            // InternalCbse.g:193:3: ( rule__PassiveComponent__Group__0 )
            {
             before(grammarAccess.getPassiveComponentAccess().getGroup()); 
            // InternalCbse.g:194:3: ( rule__PassiveComponent__Group__0 )
            // InternalCbse.g:194:4: rule__PassiveComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PassiveComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPassiveComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassiveComponent"


    // $ANTLR start "entryRuleActiveComponent"
    // InternalCbse.g:203:1: entryRuleActiveComponent : ruleActiveComponent EOF ;
    public final void entryRuleActiveComponent() throws RecognitionException {
        try {
            // InternalCbse.g:204:1: ( ruleActiveComponent EOF )
            // InternalCbse.g:205:1: ruleActiveComponent EOF
            {
             before(grammarAccess.getActiveComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleActiveComponent();

            state._fsp--;

             after(grammarAccess.getActiveComponentRule()); 
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
    // $ANTLR end "entryRuleActiveComponent"


    // $ANTLR start "ruleActiveComponent"
    // InternalCbse.g:212:1: ruleActiveComponent : ( ( rule__ActiveComponent__Group__0 ) ) ;
    public final void ruleActiveComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:216:2: ( ( ( rule__ActiveComponent__Group__0 ) ) )
            // InternalCbse.g:217:2: ( ( rule__ActiveComponent__Group__0 ) )
            {
            // InternalCbse.g:217:2: ( ( rule__ActiveComponent__Group__0 ) )
            // InternalCbse.g:218:3: ( rule__ActiveComponent__Group__0 )
            {
             before(grammarAccess.getActiveComponentAccess().getGroup()); 
            // InternalCbse.g:219:3: ( rule__ActiveComponent__Group__0 )
            // InternalCbse.g:219:4: rule__ActiveComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActiveComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActiveComponent"


    // $ANTLR start "entryRuleFunction"
    // InternalCbse.g:228:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalCbse.g:229:1: ( ruleFunction EOF )
            // InternalCbse.g:230:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalCbse.g:237:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:241:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalCbse.g:242:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalCbse.g:242:2: ( ( rule__Function__Group__0 ) )
            // InternalCbse.g:243:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalCbse.g:244:3: ( rule__Function__Group__0 )
            // InternalCbse.g:244:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleInteractionNature"
    // InternalCbse.g:253:1: entryRuleInteractionNature : ruleInteractionNature EOF ;
    public final void entryRuleInteractionNature() throws RecognitionException {
        try {
            // InternalCbse.g:254:1: ( ruleInteractionNature EOF )
            // InternalCbse.g:255:1: ruleInteractionNature EOF
            {
             before(grammarAccess.getInteractionNatureRule()); 
            pushFollow(FOLLOW_1);
            ruleInteractionNature();

            state._fsp--;

             after(grammarAccess.getInteractionNatureRule()); 
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
    // $ANTLR end "entryRuleInteractionNature"


    // $ANTLR start "ruleInteractionNature"
    // InternalCbse.g:262:1: ruleInteractionNature : ( ( rule__InteractionNature__Group__0 ) ) ;
    public final void ruleInteractionNature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:266:2: ( ( ( rule__InteractionNature__Group__0 ) ) )
            // InternalCbse.g:267:2: ( ( rule__InteractionNature__Group__0 ) )
            {
            // InternalCbse.g:267:2: ( ( rule__InteractionNature__Group__0 ) )
            // InternalCbse.g:268:3: ( rule__InteractionNature__Group__0 )
            {
             before(grammarAccess.getInteractionNatureAccess().getGroup()); 
            // InternalCbse.g:269:3: ( rule__InteractionNature__Group__0 )
            // InternalCbse.g:269:4: rule__InteractionNature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InteractionNature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionNatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteractionNature"


    // $ANTLR start "rulePortKind"
    // InternalCbse.g:278:1: rulePortKind : ( ( rule__PortKind__Alternatives ) ) ;
    public final void rulePortKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:282:1: ( ( ( rule__PortKind__Alternatives ) ) )
            // InternalCbse.g:283:2: ( ( rule__PortKind__Alternatives ) )
            {
            // InternalCbse.g:283:2: ( ( rule__PortKind__Alternatives ) )
            // InternalCbse.g:284:3: ( rule__PortKind__Alternatives )
            {
             before(grammarAccess.getPortKindAccess().getAlternatives()); 
            // InternalCbse.g:285:3: ( rule__PortKind__Alternatives )
            // InternalCbse.g:285:4: rule__PortKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PortKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortKind"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCbse.g:293:1: rule__Element__Alternatives : ( ( ruleComponent ) | ( ruleConnector ) | ( rulePort ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:297:1: ( ( ruleComponent ) | ( ruleConnector ) | ( rulePort ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalCbse.g:298:2: ( ruleComponent )
                    {
                    // InternalCbse.g:298:2: ( ruleComponent )
                    // InternalCbse.g:299:3: ruleComponent
                    {
                     before(grammarAccess.getElementAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCbse.g:304:2: ( ruleConnector )
                    {
                    // InternalCbse.g:304:2: ( ruleConnector )
                    // InternalCbse.g:305:3: ruleConnector
                    {
                     before(grammarAccess.getElementAccess().getConnectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getConnectorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCbse.g:310:2: ( rulePort )
                    {
                    // InternalCbse.g:310:2: ( rulePort )
                    // InternalCbse.g:311:3: rulePort
                    {
                     before(grammarAccess.getElementAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPortParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalCbse.g:320:1: rule__Component__Alternatives : ( ( rulePassiveComponent ) | ( ruleActiveComponent ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:324:1: ( ( rulePassiveComponent ) | ( ruleActiveComponent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCbse.g:325:2: ( rulePassiveComponent )
                    {
                    // InternalCbse.g:325:2: ( rulePassiveComponent )
                    // InternalCbse.g:326:3: rulePassiveComponent
                    {
                     before(grammarAccess.getComponentAccess().getPassiveComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePassiveComponent();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getPassiveComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCbse.g:331:2: ( ruleActiveComponent )
                    {
                    // InternalCbse.g:331:2: ( ruleActiveComponent )
                    // InternalCbse.g:332:3: ruleActiveComponent
                    {
                     before(grammarAccess.getComponentAccess().getActiveComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActiveComponent();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getActiveComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__PortKind__Alternatives"
    // InternalCbse.g:341:1: rule__PortKind__Alternatives : ( ( ( 'IN' ) ) | ( ( 'OUT' ) ) );
    public final void rule__PortKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:345:1: ( ( ( 'IN' ) ) | ( ( 'OUT' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCbse.g:346:2: ( ( 'IN' ) )
                    {
                    // InternalCbse.g:346:2: ( ( 'IN' ) )
                    // InternalCbse.g:347:3: ( 'IN' )
                    {
                     before(grammarAccess.getPortKindAccess().getINEnumLiteralDeclaration_0()); 
                    // InternalCbse.g:348:3: ( 'IN' )
                    // InternalCbse.g:348:4: 'IN'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getPortKindAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCbse.g:352:2: ( ( 'OUT' ) )
                    {
                    // InternalCbse.g:352:2: ( ( 'OUT' ) )
                    // InternalCbse.g:353:3: ( 'OUT' )
                    {
                     before(grammarAccess.getPortKindAccess().getOUTEnumLiteralDeclaration_1()); 
                    // InternalCbse.g:354:3: ( 'OUT' )
                    // InternalCbse.g:354:4: 'OUT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPortKindAccess().getOUTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__PortKind__Alternatives"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalCbse.g:362:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:366:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCbse.g:367:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

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
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalCbse.g:374:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:378:1: ( ( 'connector' ) )
            // InternalCbse.g:379:1: ( 'connector' )
            {
            // InternalCbse.g:379:1: ( 'connector' )
            // InternalCbse.g:380:2: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalCbse.g:389:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:393:1: ( rule__Connector__Group__1__Impl )
            // InternalCbse.g:394:2: rule__Connector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__1__Impl();

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
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalCbse.g:400:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:404:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCbse.g:405:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCbse.g:405:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCbse.g:406:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCbse.g:407:2: ( rule__Connector__NameAssignment_1 )
            // InternalCbse.g:407:3: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalCbse.g:416:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:420:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalCbse.g:421:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalCbse.g:428:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:432:1: ( ( 'port' ) )
            // InternalCbse.g:433:1: ( 'port' )
            {
            // InternalCbse.g:433:1: ( 'port' )
            // InternalCbse.g:434:2: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalCbse.g:443:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:447:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalCbse.g:448:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalCbse.g:455:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:459:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalCbse.g:460:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalCbse.g:460:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalCbse.g:461:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalCbse.g:462:2: ( rule__Port__NameAssignment_1 )
            // InternalCbse.g:462:3: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalCbse.g:470:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:474:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalCbse.g:475:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalCbse.g:482:1: rule__Port__Group__2__Impl : ( ':' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:486:1: ( ( ':' ) )
            // InternalCbse.g:487:1: ( ':' )
            {
            // InternalCbse.g:487:1: ( ':' )
            // InternalCbse.g:488:2: ':'
            {
             before(grammarAccess.getPortAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalCbse.g:497:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:501:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalCbse.g:502:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalCbse.g:509:1: rule__Port__Group__3__Impl : ( ( rule__Port__KindAssignment_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:513:1: ( ( ( rule__Port__KindAssignment_3 ) ) )
            // InternalCbse.g:514:1: ( ( rule__Port__KindAssignment_3 ) )
            {
            // InternalCbse.g:514:1: ( ( rule__Port__KindAssignment_3 ) )
            // InternalCbse.g:515:2: ( rule__Port__KindAssignment_3 )
            {
             before(grammarAccess.getPortAccess().getKindAssignment_3()); 
            // InternalCbse.g:516:2: ( rule__Port__KindAssignment_3 )
            // InternalCbse.g:516:3: rule__Port__KindAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Port__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalCbse.g:524:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:528:1: ( rule__Port__Group__4__Impl )
            // InternalCbse.g:529:2: rule__Port__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__4__Impl();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalCbse.g:535:1: rule__Port__Group__4__Impl : ( ( rule__Port__Group_4__0 )? ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:539:1: ( ( ( rule__Port__Group_4__0 )? ) )
            // InternalCbse.g:540:1: ( ( rule__Port__Group_4__0 )? )
            {
            // InternalCbse.g:540:1: ( ( rule__Port__Group_4__0 )? )
            // InternalCbse.g:541:2: ( rule__Port__Group_4__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_4()); 
            // InternalCbse.g:542:2: ( rule__Port__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCbse.g:542:3: rule__Port__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Port__Group_4__0"
    // InternalCbse.g:551:1: rule__Port__Group_4__0 : rule__Port__Group_4__0__Impl rule__Port__Group_4__1 ;
    public final void rule__Port__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:555:1: ( rule__Port__Group_4__0__Impl rule__Port__Group_4__1 )
            // InternalCbse.g:556:2: rule__Port__Group_4__0__Impl rule__Port__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Port__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1();

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
    // $ANTLR end "rule__Port__Group_4__0"


    // $ANTLR start "rule__Port__Group_4__0__Impl"
    // InternalCbse.g:563:1: rule__Port__Group_4__0__Impl : ( 'realizes' ) ;
    public final void rule__Port__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:567:1: ( ( 'realizes' ) )
            // InternalCbse.g:568:1: ( 'realizes' )
            {
            // InternalCbse.g:568:1: ( 'realizes' )
            // InternalCbse.g:569:2: 'realizes'
            {
             before(grammarAccess.getPortAccess().getRealizesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getRealizesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_4__0__Impl"


    // $ANTLR start "rule__Port__Group_4__1"
    // InternalCbse.g:578:1: rule__Port__Group_4__1 : rule__Port__Group_4__1__Impl ;
    public final void rule__Port__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:582:1: ( rule__Port__Group_4__1__Impl )
            // InternalCbse.g:583:2: rule__Port__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1__Impl();

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
    // $ANTLR end "rule__Port__Group_4__1"


    // $ANTLR start "rule__Port__Group_4__1__Impl"
    // InternalCbse.g:589:1: rule__Port__Group_4__1__Impl : ( ( rule__Port__InteractionNatureAssignment_4_1 ) ) ;
    public final void rule__Port__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:593:1: ( ( ( rule__Port__InteractionNatureAssignment_4_1 ) ) )
            // InternalCbse.g:594:1: ( ( rule__Port__InteractionNatureAssignment_4_1 ) )
            {
            // InternalCbse.g:594:1: ( ( rule__Port__InteractionNatureAssignment_4_1 ) )
            // InternalCbse.g:595:2: ( rule__Port__InteractionNatureAssignment_4_1 )
            {
             before(grammarAccess.getPortAccess().getInteractionNatureAssignment_4_1()); 
            // InternalCbse.g:596:2: ( rule__Port__InteractionNatureAssignment_4_1 )
            // InternalCbse.g:596:3: rule__Port__InteractionNatureAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__InteractionNatureAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getInteractionNatureAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_4__1__Impl"


    // $ANTLR start "rule__PassiveComponent__Group__0"
    // InternalCbse.g:605:1: rule__PassiveComponent__Group__0 : rule__PassiveComponent__Group__0__Impl rule__PassiveComponent__Group__1 ;
    public final void rule__PassiveComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:609:1: ( rule__PassiveComponent__Group__0__Impl rule__PassiveComponent__Group__1 )
            // InternalCbse.g:610:2: rule__PassiveComponent__Group__0__Impl rule__PassiveComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PassiveComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PassiveComponent__Group__1();

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
    // $ANTLR end "rule__PassiveComponent__Group__0"


    // $ANTLR start "rule__PassiveComponent__Group__0__Impl"
    // InternalCbse.g:617:1: rule__PassiveComponent__Group__0__Impl : ( 'passiveComponent' ) ;
    public final void rule__PassiveComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:621:1: ( ( 'passiveComponent' ) )
            // InternalCbse.g:622:1: ( 'passiveComponent' )
            {
            // InternalCbse.g:622:1: ( 'passiveComponent' )
            // InternalCbse.g:623:2: 'passiveComponent'
            {
             before(grammarAccess.getPassiveComponentAccess().getPassiveComponentKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPassiveComponentAccess().getPassiveComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveComponent__Group__0__Impl"


    // $ANTLR start "rule__PassiveComponent__Group__1"
    // InternalCbse.g:632:1: rule__PassiveComponent__Group__1 : rule__PassiveComponent__Group__1__Impl ;
    public final void rule__PassiveComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:636:1: ( rule__PassiveComponent__Group__1__Impl )
            // InternalCbse.g:637:2: rule__PassiveComponent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PassiveComponent__Group__1__Impl();

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
    // $ANTLR end "rule__PassiveComponent__Group__1"


    // $ANTLR start "rule__PassiveComponent__Group__1__Impl"
    // InternalCbse.g:643:1: rule__PassiveComponent__Group__1__Impl : ( ( rule__PassiveComponent__NameAssignment_1 ) ) ;
    public final void rule__PassiveComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:647:1: ( ( ( rule__PassiveComponent__NameAssignment_1 ) ) )
            // InternalCbse.g:648:1: ( ( rule__PassiveComponent__NameAssignment_1 ) )
            {
            // InternalCbse.g:648:1: ( ( rule__PassiveComponent__NameAssignment_1 ) )
            // InternalCbse.g:649:2: ( rule__PassiveComponent__NameAssignment_1 )
            {
             before(grammarAccess.getPassiveComponentAccess().getNameAssignment_1()); 
            // InternalCbse.g:650:2: ( rule__PassiveComponent__NameAssignment_1 )
            // InternalCbse.g:650:3: rule__PassiveComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PassiveComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPassiveComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveComponent__Group__1__Impl"


    // $ANTLR start "rule__ActiveComponent__Group__0"
    // InternalCbse.g:659:1: rule__ActiveComponent__Group__0 : rule__ActiveComponent__Group__0__Impl rule__ActiveComponent__Group__1 ;
    public final void rule__ActiveComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:663:1: ( rule__ActiveComponent__Group__0__Impl rule__ActiveComponent__Group__1 )
            // InternalCbse.g:664:2: rule__ActiveComponent__Group__0__Impl rule__ActiveComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActiveComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__1();

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
    // $ANTLR end "rule__ActiveComponent__Group__0"


    // $ANTLR start "rule__ActiveComponent__Group__0__Impl"
    // InternalCbse.g:671:1: rule__ActiveComponent__Group__0__Impl : ( 'activeComponent' ) ;
    public final void rule__ActiveComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:675:1: ( ( 'activeComponent' ) )
            // InternalCbse.g:676:1: ( 'activeComponent' )
            {
            // InternalCbse.g:676:1: ( 'activeComponent' )
            // InternalCbse.g:677:2: 'activeComponent'
            {
             before(grammarAccess.getActiveComponentAccess().getActiveComponentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActiveComponentAccess().getActiveComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__Group__0__Impl"


    // $ANTLR start "rule__ActiveComponent__Group__1"
    // InternalCbse.g:686:1: rule__ActiveComponent__Group__1 : rule__ActiveComponent__Group__1__Impl rule__ActiveComponent__Group__2 ;
    public final void rule__ActiveComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:690:1: ( rule__ActiveComponent__Group__1__Impl rule__ActiveComponent__Group__2 )
            // InternalCbse.g:691:2: rule__ActiveComponent__Group__1__Impl rule__ActiveComponent__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ActiveComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__2();

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
    // $ANTLR end "rule__ActiveComponent__Group__1"


    // $ANTLR start "rule__ActiveComponent__Group__1__Impl"
    // InternalCbse.g:698:1: rule__ActiveComponent__Group__1__Impl : ( ( rule__ActiveComponent__NameAssignment_1 ) ) ;
    public final void rule__ActiveComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:702:1: ( ( ( rule__ActiveComponent__NameAssignment_1 ) ) )
            // InternalCbse.g:703:1: ( ( rule__ActiveComponent__NameAssignment_1 ) )
            {
            // InternalCbse.g:703:1: ( ( rule__ActiveComponent__NameAssignment_1 ) )
            // InternalCbse.g:704:2: ( rule__ActiveComponent__NameAssignment_1 )
            {
             before(grammarAccess.getActiveComponentAccess().getNameAssignment_1()); 
            // InternalCbse.g:705:2: ( rule__ActiveComponent__NameAssignment_1 )
            // InternalCbse.g:705:3: rule__ActiveComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActiveComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActiveComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__Group__1__Impl"


    // $ANTLR start "rule__ActiveComponent__Group__2"
    // InternalCbse.g:713:1: rule__ActiveComponent__Group__2 : rule__ActiveComponent__Group__2__Impl rule__ActiveComponent__Group__3 ;
    public final void rule__ActiveComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:717:1: ( rule__ActiveComponent__Group__2__Impl rule__ActiveComponent__Group__3 )
            // InternalCbse.g:718:2: rule__ActiveComponent__Group__2__Impl rule__ActiveComponent__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ActiveComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__3();

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
    // $ANTLR end "rule__ActiveComponent__Group__2"


    // $ANTLR start "rule__ActiveComponent__Group__2__Impl"
    // InternalCbse.g:725:1: rule__ActiveComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__ActiveComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:729:1: ( ( '{' ) )
            // InternalCbse.g:730:1: ( '{' )
            {
            // InternalCbse.g:730:1: ( '{' )
            // InternalCbse.g:731:2: '{'
            {
             before(grammarAccess.getActiveComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActiveComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__Group__2__Impl"


    // $ANTLR start "rule__ActiveComponent__Group__3"
    // InternalCbse.g:740:1: rule__ActiveComponent__Group__3 : rule__ActiveComponent__Group__3__Impl rule__ActiveComponent__Group__4 ;
    public final void rule__ActiveComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:744:1: ( rule__ActiveComponent__Group__3__Impl rule__ActiveComponent__Group__4 )
            // InternalCbse.g:745:2: rule__ActiveComponent__Group__3__Impl rule__ActiveComponent__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ActiveComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__4();

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
    // $ANTLR end "rule__ActiveComponent__Group__3"


    // $ANTLR start "rule__ActiveComponent__Group__3__Impl"
    // InternalCbse.g:752:1: rule__ActiveComponent__Group__3__Impl : ( ( rule__ActiveComponent__FunctionsAssignment_3 )* ) ;
    public final void rule__ActiveComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:756:1: ( ( ( rule__ActiveComponent__FunctionsAssignment_3 )* ) )
            // InternalCbse.g:757:1: ( ( rule__ActiveComponent__FunctionsAssignment_3 )* )
            {
            // InternalCbse.g:757:1: ( ( rule__ActiveComponent__FunctionsAssignment_3 )* )
            // InternalCbse.g:758:2: ( rule__ActiveComponent__FunctionsAssignment_3 )*
            {
             before(grammarAccess.getActiveComponentAccess().getFunctionsAssignment_3()); 
            // InternalCbse.g:759:2: ( rule__ActiveComponent__FunctionsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCbse.g:759:3: rule__ActiveComponent__FunctionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActiveComponent__FunctionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActiveComponentAccess().getFunctionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__Group__3__Impl"


    // $ANTLR start "rule__ActiveComponent__Group__4"
    // InternalCbse.g:767:1: rule__ActiveComponent__Group__4 : rule__ActiveComponent__Group__4__Impl ;
    public final void rule__ActiveComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:771:1: ( rule__ActiveComponent__Group__4__Impl )
            // InternalCbse.g:772:2: rule__ActiveComponent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActiveComponent__Group__4__Impl();

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
    // $ANTLR end "rule__ActiveComponent__Group__4"


    // $ANTLR start "rule__ActiveComponent__Group__4__Impl"
    // InternalCbse.g:778:1: rule__ActiveComponent__Group__4__Impl : ( '}' ) ;
    public final void rule__ActiveComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:782:1: ( ( '}' ) )
            // InternalCbse.g:783:1: ( '}' )
            {
            // InternalCbse.g:783:1: ( '}' )
            // InternalCbse.g:784:2: '}'
            {
             before(grammarAccess.getActiveComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActiveComponentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalCbse.g:794:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:798:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalCbse.g:799:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalCbse.g:806:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:810:1: ( ( 'function' ) )
            // InternalCbse.g:811:1: ( 'function' )
            {
            // InternalCbse.g:811:1: ( 'function' )
            // InternalCbse.g:812:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalCbse.g:821:1: rule__Function__Group__1 : rule__Function__Group__1__Impl ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:825:1: ( rule__Function__Group__1__Impl )
            // InternalCbse.g:826:2: rule__Function__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__1__Impl();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalCbse.g:832:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:836:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalCbse.g:837:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalCbse.g:837:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalCbse.g:838:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalCbse.g:839:2: ( rule__Function__NameAssignment_1 )
            // InternalCbse.g:839:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__InteractionNature__Group__0"
    // InternalCbse.g:848:1: rule__InteractionNature__Group__0 : rule__InteractionNature__Group__0__Impl rule__InteractionNature__Group__1 ;
    public final void rule__InteractionNature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:852:1: ( rule__InteractionNature__Group__0__Impl rule__InteractionNature__Group__1 )
            // InternalCbse.g:853:2: rule__InteractionNature__Group__0__Impl rule__InteractionNature__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InteractionNature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InteractionNature__Group__1();

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
    // $ANTLR end "rule__InteractionNature__Group__0"


    // $ANTLR start "rule__InteractionNature__Group__0__Impl"
    // InternalCbse.g:860:1: rule__InteractionNature__Group__0__Impl : ( 'interactionNature' ) ;
    public final void rule__InteractionNature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:864:1: ( ( 'interactionNature' ) )
            // InternalCbse.g:865:1: ( 'interactionNature' )
            {
            // InternalCbse.g:865:1: ( 'interactionNature' )
            // InternalCbse.g:866:2: 'interactionNature'
            {
             before(grammarAccess.getInteractionNatureAccess().getInteractionNatureKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInteractionNatureAccess().getInteractionNatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionNature__Group__0__Impl"


    // $ANTLR start "rule__InteractionNature__Group__1"
    // InternalCbse.g:875:1: rule__InteractionNature__Group__1 : rule__InteractionNature__Group__1__Impl ;
    public final void rule__InteractionNature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:879:1: ( rule__InteractionNature__Group__1__Impl )
            // InternalCbse.g:880:2: rule__InteractionNature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InteractionNature__Group__1__Impl();

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
    // $ANTLR end "rule__InteractionNature__Group__1"


    // $ANTLR start "rule__InteractionNature__Group__1__Impl"
    // InternalCbse.g:886:1: rule__InteractionNature__Group__1__Impl : ( ( rule__InteractionNature__NameAssignment_1 ) ) ;
    public final void rule__InteractionNature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:890:1: ( ( ( rule__InteractionNature__NameAssignment_1 ) ) )
            // InternalCbse.g:891:1: ( ( rule__InteractionNature__NameAssignment_1 ) )
            {
            // InternalCbse.g:891:1: ( ( rule__InteractionNature__NameAssignment_1 ) )
            // InternalCbse.g:892:2: ( rule__InteractionNature__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionNatureAccess().getNameAssignment_1()); 
            // InternalCbse.g:893:2: ( rule__InteractionNature__NameAssignment_1 )
            // InternalCbse.g:893:3: rule__InteractionNature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InteractionNature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionNatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionNature__Group__1__Impl"


    // $ANTLR start "rule__Cbse__SystemAssignment"
    // InternalCbse.g:902:1: rule__Cbse__SystemAssignment : ( ruleElement ) ;
    public final void rule__Cbse__SystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:906:1: ( ( ruleElement ) )
            // InternalCbse.g:907:2: ( ruleElement )
            {
            // InternalCbse.g:907:2: ( ruleElement )
            // InternalCbse.g:908:3: ruleElement
            {
             before(grammarAccess.getCbseAccess().getSystemElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getCbseAccess().getSystemElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cbse__SystemAssignment"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // InternalCbse.g:917:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:921:1: ( ( RULE_ID ) )
            // InternalCbse.g:922:2: ( RULE_ID )
            {
            // InternalCbse.g:922:2: ( RULE_ID )
            // InternalCbse.g:923:3: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // InternalCbse.g:932:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:936:1: ( ( RULE_ID ) )
            // InternalCbse.g:937:2: ( RULE_ID )
            {
            // InternalCbse.g:937:2: ( RULE_ID )
            // InternalCbse.g:938:3: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__KindAssignment_3"
    // InternalCbse.g:947:1: rule__Port__KindAssignment_3 : ( rulePortKind ) ;
    public final void rule__Port__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:951:1: ( ( rulePortKind ) )
            // InternalCbse.g:952:2: ( rulePortKind )
            {
            // InternalCbse.g:952:2: ( rulePortKind )
            // InternalCbse.g:953:3: rulePortKind
            {
             before(grammarAccess.getPortAccess().getKindPortKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePortKind();

            state._fsp--;

             after(grammarAccess.getPortAccess().getKindPortKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__KindAssignment_3"


    // $ANTLR start "rule__Port__InteractionNatureAssignment_4_1"
    // InternalCbse.g:962:1: rule__Port__InteractionNatureAssignment_4_1 : ( ruleInteractionNature ) ;
    public final void rule__Port__InteractionNatureAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:966:1: ( ( ruleInteractionNature ) )
            // InternalCbse.g:967:2: ( ruleInteractionNature )
            {
            // InternalCbse.g:967:2: ( ruleInteractionNature )
            // InternalCbse.g:968:3: ruleInteractionNature
            {
             before(grammarAccess.getPortAccess().getInteractionNatureInteractionNatureParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteractionNature();

            state._fsp--;

             after(grammarAccess.getPortAccess().getInteractionNatureInteractionNatureParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__InteractionNatureAssignment_4_1"


    // $ANTLR start "rule__PassiveComponent__NameAssignment_1"
    // InternalCbse.g:977:1: rule__PassiveComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PassiveComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:981:1: ( ( RULE_ID ) )
            // InternalCbse.g:982:2: ( RULE_ID )
            {
            // InternalCbse.g:982:2: ( RULE_ID )
            // InternalCbse.g:983:3: RULE_ID
            {
             before(grammarAccess.getPassiveComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPassiveComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PassiveComponent__NameAssignment_1"


    // $ANTLR start "rule__ActiveComponent__NameAssignment_1"
    // InternalCbse.g:992:1: rule__ActiveComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActiveComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:996:1: ( ( RULE_ID ) )
            // InternalCbse.g:997:2: ( RULE_ID )
            {
            // InternalCbse.g:997:2: ( RULE_ID )
            // InternalCbse.g:998:3: RULE_ID
            {
             before(grammarAccess.getActiveComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActiveComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__NameAssignment_1"


    // $ANTLR start "rule__ActiveComponent__FunctionsAssignment_3"
    // InternalCbse.g:1007:1: rule__ActiveComponent__FunctionsAssignment_3 : ( ruleFunction ) ;
    public final void rule__ActiveComponent__FunctionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:1011:1: ( ( ruleFunction ) )
            // InternalCbse.g:1012:2: ( ruleFunction )
            {
            // InternalCbse.g:1012:2: ( ruleFunction )
            // InternalCbse.g:1013:3: ruleFunction
            {
             before(grammarAccess.getActiveComponentAccess().getFunctionsFunctionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getActiveComponentAccess().getFunctionsFunctionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActiveComponent__FunctionsAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalCbse.g:1022:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:1026:1: ( ( RULE_ID ) )
            // InternalCbse.g:1027:2: ( RULE_ID )
            {
            // InternalCbse.g:1027:2: ( RULE_ID )
            // InternalCbse.g:1028:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__InteractionNature__NameAssignment_1"
    // InternalCbse.g:1037:1: rule__InteractionNature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InteractionNature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCbse.g:1041:1: ( ( RULE_ID ) )
            // InternalCbse.g:1042:2: ( RULE_ID )
            {
            // InternalCbse.g:1042:2: ( RULE_ID )
            // InternalCbse.g:1043:3: RULE_ID
            {
             before(grammarAccess.getInteractionNatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionNatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InteractionNature__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000066002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});

}
package semcomdt.swarchitecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import semcomdt.swarchitecture.services.CbseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCbseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connector'", "'port'", "':'", "'realizes'", "'passiveComponent'", "'activeComponent'", "'{'", "'}'", "'function'", "'interactionNature'", "'IN'", "'OUT'"
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

        public InternalCbseParser(TokenStream input, CbseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Cbse";
       	}

       	@Override
       	protected CbseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCbse"
    // InternalCbse.g:65:1: entryRuleCbse returns [EObject current=null] : iv_ruleCbse= ruleCbse EOF ;
    public final EObject entryRuleCbse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCbse = null;


        try {
            // InternalCbse.g:65:45: (iv_ruleCbse= ruleCbse EOF )
            // InternalCbse.g:66:2: iv_ruleCbse= ruleCbse EOF
            {
             newCompositeNode(grammarAccess.getCbseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCbse=ruleCbse();

            state._fsp--;

             current =iv_ruleCbse; 
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
    // $ANTLR end "entryRuleCbse"


    // $ANTLR start "ruleCbse"
    // InternalCbse.g:72:1: ruleCbse returns [EObject current=null] : ( (lv_system_0_0= ruleElement ) )* ;
    public final EObject ruleCbse() throws RecognitionException {
        EObject current = null;

        EObject lv_system_0_0 = null;



        	enterRule();

        try {
            // InternalCbse.g:78:2: ( ( (lv_system_0_0= ruleElement ) )* )
            // InternalCbse.g:79:2: ( (lv_system_0_0= ruleElement ) )*
            {
            // InternalCbse.g:79:2: ( (lv_system_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCbse.g:80:3: (lv_system_0_0= ruleElement )
            	    {
            	    // InternalCbse.g:80:3: (lv_system_0_0= ruleElement )
            	    // InternalCbse.g:81:4: lv_system_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getCbseAccess().getSystemElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_system_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCbseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"system",
            	    					lv_system_0_0,
            	    					"semcomdt.swarchitecture.Cbse.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleCbse"


    // $ANTLR start "entryRuleElement"
    // InternalCbse.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCbse.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalCbse.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCbse.g:108:1: ruleElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_Connector_1= ruleConnector | this_Port_2= rulePort ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_Connector_1 = null;

        EObject this_Port_2 = null;



        	enterRule();

        try {
            // InternalCbse.g:114:2: ( (this_Component_0= ruleComponent | this_Connector_1= ruleConnector | this_Port_2= rulePort ) )
            // InternalCbse.g:115:2: (this_Component_0= ruleComponent | this_Connector_1= ruleConnector | this_Port_2= rulePort )
            {
            // InternalCbse.g:115:2: (this_Component_0= ruleComponent | this_Connector_1= ruleConnector | this_Port_2= rulePort )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
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
                    // InternalCbse.g:116:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbse.g:125:3: this_Connector_1= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getConnectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_1=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCbse.g:134:3: this_Port_2= rulePort
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_2=rulePort();

                    state._fsp--;


                    			current = this_Port_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleComponent"
    // InternalCbse.g:146:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCbse.g:146:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCbse.g:147:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCbse.g:153:1: ruleComponent returns [EObject current=null] : (this_PassiveComponent_0= rulePassiveComponent | this_ActiveComponent_1= ruleActiveComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_PassiveComponent_0 = null;

        EObject this_ActiveComponent_1 = null;



        	enterRule();

        try {
            // InternalCbse.g:159:2: ( (this_PassiveComponent_0= rulePassiveComponent | this_ActiveComponent_1= ruleActiveComponent ) )
            // InternalCbse.g:160:2: (this_PassiveComponent_0= rulePassiveComponent | this_ActiveComponent_1= ruleActiveComponent )
            {
            // InternalCbse.g:160:2: (this_PassiveComponent_0= rulePassiveComponent | this_ActiveComponent_1= ruleActiveComponent )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCbse.g:161:3: this_PassiveComponent_0= rulePassiveComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getPassiveComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PassiveComponent_0=rulePassiveComponent();

                    state._fsp--;


                    			current = this_PassiveComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCbse.g:170:3: this_ActiveComponent_1= ruleActiveComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getActiveComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActiveComponent_1=ruleActiveComponent();

                    state._fsp--;


                    			current = this_ActiveComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalCbse.g:182:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCbse.g:182:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCbse.g:183:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCbse.g:189:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCbse.g:195:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCbse.g:196:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCbse.g:196:2: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCbse.g:197:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            // InternalCbse.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort"
    // InternalCbse.g:223:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalCbse.g:223:45: (iv_rulePort= rulePort EOF )
            // InternalCbse.g:224:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalCbse.g:230:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= rulePortKind ) ) (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_kind_3_0 = null;

        EObject lv_interactionNature_5_0 = null;



        	enterRule();

        try {
            // InternalCbse.g:236:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= rulePortKind ) ) (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )? ) )
            // InternalCbse.g:237:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= rulePortKind ) ) (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )? )
            {
            // InternalCbse.g:237:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= rulePortKind ) ) (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )? )
            // InternalCbse.g:238:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= rulePortKind ) ) (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalCbse.g:242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:243:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getColonKeyword_2());
            		
            // InternalCbse.g:264:3: ( (lv_kind_3_0= rulePortKind ) )
            // InternalCbse.g:265:4: (lv_kind_3_0= rulePortKind )
            {
            // InternalCbse.g:265:4: (lv_kind_3_0= rulePortKind )
            // InternalCbse.g:266:5: lv_kind_3_0= rulePortKind
            {

            					newCompositeNode(grammarAccess.getPortAccess().getKindPortKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_kind_3_0=rulePortKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"semcomdt.swarchitecture.Cbse.PortKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCbse.g:283:3: (otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCbse.g:284:4: otherlv_4= 'realizes' ( (lv_interactionNature_5_0= ruleInteractionNature ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getPortAccess().getRealizesKeyword_4_0());
                    			
                    // InternalCbse.g:288:4: ( (lv_interactionNature_5_0= ruleInteractionNature ) )
                    // InternalCbse.g:289:5: (lv_interactionNature_5_0= ruleInteractionNature )
                    {
                    // InternalCbse.g:289:5: (lv_interactionNature_5_0= ruleInteractionNature )
                    // InternalCbse.g:290:6: lv_interactionNature_5_0= ruleInteractionNature
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getInteractionNatureInteractionNatureParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_interactionNature_5_0=ruleInteractionNature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"interactionNature",
                    							lv_interactionNature_5_0,
                    							"semcomdt.swarchitecture.Cbse.InteractionNature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRulePassiveComponent"
    // InternalCbse.g:312:1: entryRulePassiveComponent returns [EObject current=null] : iv_rulePassiveComponent= rulePassiveComponent EOF ;
    public final EObject entryRulePassiveComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassiveComponent = null;


        try {
            // InternalCbse.g:312:57: (iv_rulePassiveComponent= rulePassiveComponent EOF )
            // InternalCbse.g:313:2: iv_rulePassiveComponent= rulePassiveComponent EOF
            {
             newCompositeNode(grammarAccess.getPassiveComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassiveComponent=rulePassiveComponent();

            state._fsp--;

             current =iv_rulePassiveComponent; 
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
    // $ANTLR end "entryRulePassiveComponent"


    // $ANTLR start "rulePassiveComponent"
    // InternalCbse.g:319:1: rulePassiveComponent returns [EObject current=null] : (otherlv_0= 'passiveComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePassiveComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCbse.g:325:2: ( (otherlv_0= 'passiveComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCbse.g:326:2: (otherlv_0= 'passiveComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCbse.g:326:2: (otherlv_0= 'passiveComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCbse.g:327:3: otherlv_0= 'passiveComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPassiveComponentAccess().getPassiveComponentKeyword_0());
            		
            // InternalCbse.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPassiveComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassiveComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePassiveComponent"


    // $ANTLR start "entryRuleActiveComponent"
    // InternalCbse.g:353:1: entryRuleActiveComponent returns [EObject current=null] : iv_ruleActiveComponent= ruleActiveComponent EOF ;
    public final EObject entryRuleActiveComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveComponent = null;


        try {
            // InternalCbse.g:353:56: (iv_ruleActiveComponent= ruleActiveComponent EOF )
            // InternalCbse.g:354:2: iv_ruleActiveComponent= ruleActiveComponent EOF
            {
             newCompositeNode(grammarAccess.getActiveComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActiveComponent=ruleActiveComponent();

            state._fsp--;

             current =iv_ruleActiveComponent; 
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
    // $ANTLR end "entryRuleActiveComponent"


    // $ANTLR start "ruleActiveComponent"
    // InternalCbse.g:360:1: ruleActiveComponent returns [EObject current=null] : (otherlv_0= 'activeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_functions_3_0= ruleFunction ) )* otherlv_4= '}' ) ;
    public final EObject ruleActiveComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_functions_3_0 = null;



        	enterRule();

        try {
            // InternalCbse.g:366:2: ( (otherlv_0= 'activeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_functions_3_0= ruleFunction ) )* otherlv_4= '}' ) )
            // InternalCbse.g:367:2: (otherlv_0= 'activeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_functions_3_0= ruleFunction ) )* otherlv_4= '}' )
            {
            // InternalCbse.g:367:2: (otherlv_0= 'activeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_functions_3_0= ruleFunction ) )* otherlv_4= '}' )
            // InternalCbse.g:368:3: otherlv_0= 'activeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_functions_3_0= ruleFunction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActiveComponentAccess().getActiveComponentKeyword_0());
            		
            // InternalCbse.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActiveComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActiveComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getActiveComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbse.g:394:3: ( (lv_functions_3_0= ruleFunction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCbse.g:395:4: (lv_functions_3_0= ruleFunction )
            	    {
            	    // InternalCbse.g:395:4: (lv_functions_3_0= ruleFunction )
            	    // InternalCbse.g:396:5: lv_functions_3_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getActiveComponentAccess().getFunctionsFunctionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_functions_3_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActiveComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_3_0,
            	    						"semcomdt.swarchitecture.Cbse.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActiveComponentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleActiveComponent"


    // $ANTLR start "entryRuleFunction"
    // InternalCbse.g:421:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalCbse.g:421:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalCbse.g:422:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalCbse.g:428:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCbse.g:434:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCbse.g:435:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCbse.g:435:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCbse.g:436:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalCbse.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleInteractionNature"
    // InternalCbse.g:462:1: entryRuleInteractionNature returns [EObject current=null] : iv_ruleInteractionNature= ruleInteractionNature EOF ;
    public final EObject entryRuleInteractionNature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionNature = null;


        try {
            // InternalCbse.g:462:58: (iv_ruleInteractionNature= ruleInteractionNature EOF )
            // InternalCbse.g:463:2: iv_ruleInteractionNature= ruleInteractionNature EOF
            {
             newCompositeNode(grammarAccess.getInteractionNatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionNature=ruleInteractionNature();

            state._fsp--;

             current =iv_ruleInteractionNature; 
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
    // $ANTLR end "entryRuleInteractionNature"


    // $ANTLR start "ruleInteractionNature"
    // InternalCbse.g:469:1: ruleInteractionNature returns [EObject current=null] : (otherlv_0= 'interactionNature' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInteractionNature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCbse.g:475:2: ( (otherlv_0= 'interactionNature' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCbse.g:476:2: (otherlv_0= 'interactionNature' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCbse.g:476:2: (otherlv_0= 'interactionNature' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCbse.g:477:3: otherlv_0= 'interactionNature' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionNatureAccess().getInteractionNatureKeyword_0());
            		
            // InternalCbse.g:481:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCbse.g:482:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCbse.g:482:4: (lv_name_1_0= RULE_ID )
            // InternalCbse.g:483:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteractionNatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionNatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInteractionNature"


    // $ANTLR start "rulePortKind"
    // InternalCbse.g:503:1: rulePortKind returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) ) ;
    public final Enumerator rulePortKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCbse.g:509:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) ) )
            // InternalCbse.g:510:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) )
            {
            // InternalCbse.g:510:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCbse.g:511:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalCbse.g:511:3: (enumLiteral_0= 'IN' )
                    // InternalCbse.g:512:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPortKindAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortKindAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCbse.g:519:3: (enumLiteral_1= 'OUT' )
                    {
                    // InternalCbse.g:519:3: (enumLiteral_1= 'OUT' )
                    // InternalCbse.g:520:4: enumLiteral_1= 'OUT'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getPortKindAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPortKindAccess().getOUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePortKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000019802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});

}
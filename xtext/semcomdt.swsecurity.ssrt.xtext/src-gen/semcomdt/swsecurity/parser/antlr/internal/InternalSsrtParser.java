package semcomdt.swsecurity.parser.antlr.internal;

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
import semcomdt.swsecurity.services.SsrtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSsrtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SolutionTree'", "'contributesTo'", "'{'", "'}'", "'refines'", "'SolutionElement'", "'('", "')'", "'Relation'", "'.'", "'Conceptual'", "'Design'", "'Realization'", "'SecurityPattern'", "'SecurityTactic'"
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

        public InternalSsrtParser(TokenStream input, SsrtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SsrtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSsrt.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSsrt.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSsrt.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSsrt.g:72:1: ruleModel returns [EObject current=null] : ( (lv_solutiontrees_0_0= ruleSolutionTree ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_solutiontrees_0_0 = null;



        	enterRule();

        try {
            // InternalSsrt.g:78:2: ( ( (lv_solutiontrees_0_0= ruleSolutionTree ) )* )
            // InternalSsrt.g:79:2: ( (lv_solutiontrees_0_0= ruleSolutionTree ) )*
            {
            // InternalSsrt.g:79:2: ( (lv_solutiontrees_0_0= ruleSolutionTree ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSsrt.g:80:3: (lv_solutiontrees_0_0= ruleSolutionTree )
            	    {
            	    // InternalSsrt.g:80:3: (lv_solutiontrees_0_0= ruleSolutionTree )
            	    // InternalSsrt.g:81:4: lv_solutiontrees_0_0= ruleSolutionTree
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSolutiontreesSolutionTreeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_solutiontrees_0_0=ruleSolutionTree();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"solutiontrees",
            	    					lv_solutiontrees_0_0,
            	    					"semcomdt.swsecurity.Ssrt.SolutionTree");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSolutionTree"
    // InternalSsrt.g:101:1: entryRuleSolutionTree returns [EObject current=null] : iv_ruleSolutionTree= ruleSolutionTree EOF ;
    public final EObject entryRuleSolutionTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolutionTree = null;


        try {
            // InternalSsrt.g:101:53: (iv_ruleSolutionTree= ruleSolutionTree EOF )
            // InternalSsrt.g:102:2: iv_ruleSolutionTree= ruleSolutionTree EOF
            {
             newCompositeNode(grammarAccess.getSolutionTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolutionTree=ruleSolutionTree();

            state._fsp--;

             current =iv_ruleSolutionTree; 
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
    // $ANTLR end "entryRuleSolutionTree"


    // $ANTLR start "ruleSolutionTree"
    // InternalSsrt.g:108:1: ruleSolutionTree returns [EObject current=null] : (otherlv_0= 'SolutionTree' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'contributesTo' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_provides_5_0= ruleSolution ) )* otherlv_6= '}' ) ;
    public final EObject ruleSolutionTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_provides_5_0 = null;



        	enterRule();

        try {
            // InternalSsrt.g:114:2: ( (otherlv_0= 'SolutionTree' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'contributesTo' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_provides_5_0= ruleSolution ) )* otherlv_6= '}' ) )
            // InternalSsrt.g:115:2: (otherlv_0= 'SolutionTree' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'contributesTo' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_provides_5_0= ruleSolution ) )* otherlv_6= '}' )
            {
            // InternalSsrt.g:115:2: (otherlv_0= 'SolutionTree' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'contributesTo' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_provides_5_0= ruleSolution ) )* otherlv_6= '}' )
            // InternalSsrt.g:116:3: otherlv_0= 'SolutionTree' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'contributesTo' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_provides_5_0= ruleSolution ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSolutionTreeAccess().getSolutionTreeKeyword_0());
            		
            // InternalSsrt.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSsrt.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSsrt.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalSsrt.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSolutionTreeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionTreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSolutionTreeAccess().getContributesToKeyword_2());
            		
            // InternalSsrt.g:142:3: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:143:4: ( ruleQualifiedName )
            {
            // InternalSsrt.g:143:4: ( ruleQualifiedName )
            // InternalSsrt.g:144:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionTreeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSolutionTreeAccess().getContributesToSecurityPropertyCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSolutionTreeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSsrt.g:162:3: ( (lv_provides_5_0= ruleSolution ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSsrt.g:163:4: (lv_provides_5_0= ruleSolution )
            	    {
            	    // InternalSsrt.g:163:4: (lv_provides_5_0= ruleSolution )
            	    // InternalSsrt.g:164:5: lv_provides_5_0= ruleSolution
            	    {

            	    					newCompositeNode(grammarAccess.getSolutionTreeAccess().getProvidesSolutionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_provides_5_0=ruleSolution();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSolutionTreeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"provides",
            	    						lv_provides_5_0,
            	    						"semcomdt.swsecurity.Ssrt.Solution");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSolutionTreeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSolutionTree"


    // $ANTLR start "entryRuleSolution"
    // InternalSsrt.g:189:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalSsrt.g:189:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalSsrt.g:190:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalSsrt.g:196:1: ruleSolution returns [EObject current=null] : ( ( (lv_kind_0_0= ruleSolutionType ) ) ( (lv_level_1_0= ruleLevel ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )? otherlv_5= '{' ( (lv_solutionelements_6_0= ruleSolutionElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_kind_0_0 = null;

        Enumerator lv_level_1_0 = null;

        EObject lv_solutionelements_6_0 = null;



        	enterRule();

        try {
            // InternalSsrt.g:202:2: ( ( ( (lv_kind_0_0= ruleSolutionType ) ) ( (lv_level_1_0= ruleLevel ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )? otherlv_5= '{' ( (lv_solutionelements_6_0= ruleSolutionElement ) )* otherlv_7= '}' ) )
            // InternalSsrt.g:203:2: ( ( (lv_kind_0_0= ruleSolutionType ) ) ( (lv_level_1_0= ruleLevel ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )? otherlv_5= '{' ( (lv_solutionelements_6_0= ruleSolutionElement ) )* otherlv_7= '}' )
            {
            // InternalSsrt.g:203:2: ( ( (lv_kind_0_0= ruleSolutionType ) ) ( (lv_level_1_0= ruleLevel ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )? otherlv_5= '{' ( (lv_solutionelements_6_0= ruleSolutionElement ) )* otherlv_7= '}' )
            // InternalSsrt.g:204:3: ( (lv_kind_0_0= ruleSolutionType ) ) ( (lv_level_1_0= ruleLevel ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )? otherlv_5= '{' ( (lv_solutionelements_6_0= ruleSolutionElement ) )* otherlv_7= '}'
            {
            // InternalSsrt.g:204:3: ( (lv_kind_0_0= ruleSolutionType ) )
            // InternalSsrt.g:205:4: (lv_kind_0_0= ruleSolutionType )
            {
            // InternalSsrt.g:205:4: (lv_kind_0_0= ruleSolutionType )
            // InternalSsrt.g:206:5: lv_kind_0_0= ruleSolutionType
            {

            					newCompositeNode(grammarAccess.getSolutionAccess().getKindSolutionTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_kind_0_0=ruleSolutionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolutionRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"semcomdt.swsecurity.Ssrt.SolutionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSsrt.g:223:3: ( (lv_level_1_0= ruleLevel ) )
            // InternalSsrt.g:224:4: (lv_level_1_0= ruleLevel )
            {
            // InternalSsrt.g:224:4: (lv_level_1_0= ruleLevel )
            // InternalSsrt.g:225:5: lv_level_1_0= ruleLevel
            {

            					newCompositeNode(grammarAccess.getSolutionAccess().getLevelLevelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_level_1_0=ruleLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolutionRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_1_0,
            						"semcomdt.swsecurity.Ssrt.Level");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSsrt.g:242:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSsrt.g:243:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSsrt.g:243:4: (lv_name_2_0= RULE_ID )
            // InternalSsrt.g:244:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSsrt.g:260:3: (otherlv_3= 'refines' ( ( ruleQualifiedName ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSsrt.g:261:4: otherlv_3= 'refines' ( ( ruleQualifiedName ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getRefinesKeyword_3_0());
                    			
                    // InternalSsrt.g:265:4: ( ( ruleQualifiedName ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSsrt.g:266:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalSsrt.g:266:5: ( ruleQualifiedName )
                    	    // InternalSsrt.g:267:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getSolutionRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getSolutionAccess().getRefinesSolutionCrossReference_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSsrt.g:286:3: ( (lv_solutionelements_6_0= ruleSolutionElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSsrt.g:287:4: (lv_solutionelements_6_0= ruleSolutionElement )
            	    {
            	    // InternalSsrt.g:287:4: (lv_solutionelements_6_0= ruleSolutionElement )
            	    // InternalSsrt.g:288:5: lv_solutionelements_6_0= ruleSolutionElement
            	    {

            	    					newCompositeNode(grammarAccess.getSolutionAccess().getSolutionelementsSolutionElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_solutionelements_6_0=ruleSolutionElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSolutionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"solutionelements",
            	    						lv_solutionelements_6_0,
            	    						"semcomdt.swsecurity.Ssrt.SolutionElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleSolutionElement"
    // InternalSsrt.g:313:1: entryRuleSolutionElement returns [EObject current=null] : iv_ruleSolutionElement= ruleSolutionElement EOF ;
    public final EObject entryRuleSolutionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolutionElement = null;


        try {
            // InternalSsrt.g:313:56: (iv_ruleSolutionElement= ruleSolutionElement EOF )
            // InternalSsrt.g:314:2: iv_ruleSolutionElement= ruleSolutionElement EOF
            {
             newCompositeNode(grammarAccess.getSolutionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolutionElement=ruleSolutionElement();

            state._fsp--;

             current =iv_ruleSolutionElement; 
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
    // $ANTLR end "entryRuleSolutionElement"


    // $ANTLR start "ruleSolutionElement"
    // InternalSsrt.g:320:1: ruleSolutionElement returns [EObject current=null] : (otherlv_0= 'SolutionElement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '(' ( (lv_definition_5_0= RULE_STRING ) ) otherlv_6= ')' ( (lv_source_7_0= ruleRelation ) )* ) ;
    public final EObject ruleSolutionElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definition_5_0=null;
        Token otherlv_6=null;
        EObject lv_source_7_0 = null;



        	enterRule();

        try {
            // InternalSsrt.g:326:2: ( (otherlv_0= 'SolutionElement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '(' ( (lv_definition_5_0= RULE_STRING ) ) otherlv_6= ')' ( (lv_source_7_0= ruleRelation ) )* ) )
            // InternalSsrt.g:327:2: (otherlv_0= 'SolutionElement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '(' ( (lv_definition_5_0= RULE_STRING ) ) otherlv_6= ')' ( (lv_source_7_0= ruleRelation ) )* )
            {
            // InternalSsrt.g:327:2: (otherlv_0= 'SolutionElement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '(' ( (lv_definition_5_0= RULE_STRING ) ) otherlv_6= ')' ( (lv_source_7_0= ruleRelation ) )* )
            // InternalSsrt.g:328:3: otherlv_0= 'SolutionElement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )? otherlv_4= '(' ( (lv_definition_5_0= RULE_STRING ) ) otherlv_6= ')' ( (lv_source_7_0= ruleRelation ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSolutionElementAccess().getSolutionElementKeyword_0());
            		
            // InternalSsrt.g:332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSsrt.g:333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSsrt.g:333:4: (lv_name_1_0= RULE_ID )
            // InternalSsrt.g:334:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSolutionElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSsrt.g:350:3: (otherlv_2= 'refines' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSsrt.g:351:4: otherlv_2= 'refines' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSolutionElementAccess().getRefinesKeyword_2_0());
                    			
                    // InternalSsrt.g:355:4: ( ( ruleQualifiedName ) )
                    // InternalSsrt.g:356:5: ( ruleQualifiedName )
                    {
                    // InternalSsrt.g:356:5: ( ruleQualifiedName )
                    // InternalSsrt.g:357:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSolutionElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSolutionElementAccess().getRefinesSolutionElementCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSolutionElementAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSsrt.g:376:3: ( (lv_definition_5_0= RULE_STRING ) )
            // InternalSsrt.g:377:4: (lv_definition_5_0= RULE_STRING )
            {
            // InternalSsrt.g:377:4: (lv_definition_5_0= RULE_STRING )
            // InternalSsrt.g:378:5: lv_definition_5_0= RULE_STRING
            {
            lv_definition_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_definition_5_0, grammarAccess.getSolutionElementAccess().getDefinitionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSolutionElementAccess().getRightParenthesisKeyword_5());
            		
            // InternalSsrt.g:398:3: ( (lv_source_7_0= ruleRelation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSsrt.g:399:4: (lv_source_7_0= ruleRelation )
            	    {
            	    // InternalSsrt.g:399:4: (lv_source_7_0= ruleRelation )
            	    // InternalSsrt.g:400:5: lv_source_7_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSolutionElementAccess().getSourceRelationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_source_7_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSolutionElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_7_0,
            	    						"semcomdt.swsecurity.Ssrt.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleSolutionElement"


    // $ANTLR start "entryRuleRelation"
    // InternalSsrt.g:421:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalSsrt.g:421:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalSsrt.g:422:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalSsrt.g:428:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSsrt.g:434:2: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalSsrt.g:435:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalSsrt.g:435:2: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) ) )
            // InternalSsrt.g:436:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalSsrt.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSsrt.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSsrt.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalSsrt.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSsrt.g:458:3: ( ( ruleQualifiedName ) )
            // InternalSsrt.g:459:4: ( ruleQualifiedName )
            {
            // InternalSsrt.g:459:4: ( ruleQualifiedName )
            // InternalSsrt.g:460:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getTargetSolutionElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSsrt.g:478:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSsrt.g:478:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSsrt.g:479:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSsrt.g:485:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSsrt.g:491:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSsrt.g:492:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSsrt.g:492:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSsrt.g:493:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSsrt.g:500:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSsrt.g:501:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLevel"
    // InternalSsrt.g:518:1: ruleLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'Conceptual' ) | (enumLiteral_1= 'Design' ) | (enumLiteral_2= 'Realization' ) ) ;
    public final Enumerator ruleLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSsrt.g:524:2: ( ( (enumLiteral_0= 'Conceptual' ) | (enumLiteral_1= 'Design' ) | (enumLiteral_2= 'Realization' ) ) )
            // InternalSsrt.g:525:2: ( (enumLiteral_0= 'Conceptual' ) | (enumLiteral_1= 'Design' ) | (enumLiteral_2= 'Realization' ) )
            {
            // InternalSsrt.g:525:2: ( (enumLiteral_0= 'Conceptual' ) | (enumLiteral_1= 'Design' ) | (enumLiteral_2= 'Realization' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSsrt.g:526:3: (enumLiteral_0= 'Conceptual' )
                    {
                    // InternalSsrt.g:526:3: (enumLiteral_0= 'Conceptual' )
                    // InternalSsrt.g:527:4: enumLiteral_0= 'Conceptual'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getConceptualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLevelAccess().getConceptualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:534:3: (enumLiteral_1= 'Design' )
                    {
                    // InternalSsrt.g:534:3: (enumLiteral_1= 'Design' )
                    // InternalSsrt.g:535:4: enumLiteral_1= 'Design'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getDesignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLevelAccess().getDesignEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSsrt.g:542:3: (enumLiteral_2= 'Realization' )
                    {
                    // InternalSsrt.g:542:3: (enumLiteral_2= 'Realization' )
                    // InternalSsrt.g:543:4: enumLiteral_2= 'Realization'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getRealizationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLevelAccess().getRealizationEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "ruleSolutionType"
    // InternalSsrt.g:553:1: ruleSolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'SecurityPattern' ) | (enumLiteral_1= 'SecurityTactic' ) ) ;
    public final Enumerator ruleSolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSsrt.g:559:2: ( ( (enumLiteral_0= 'SecurityPattern' ) | (enumLiteral_1= 'SecurityTactic' ) ) )
            // InternalSsrt.g:560:2: ( (enumLiteral_0= 'SecurityPattern' ) | (enumLiteral_1= 'SecurityTactic' ) )
            {
            // InternalSsrt.g:560:2: ( (enumLiteral_0= 'SecurityPattern' ) | (enumLiteral_1= 'SecurityTactic' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSsrt.g:561:3: (enumLiteral_0= 'SecurityPattern' )
                    {
                    // InternalSsrt.g:561:3: (enumLiteral_0= 'SecurityPattern' )
                    // InternalSsrt.g:562:4: enumLiteral_0= 'SecurityPattern'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSolutionTypeAccess().getSecurityPatternEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolutionTypeAccess().getSecurityPatternEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSsrt.g:569:3: (enumLiteral_1= 'SecurityTactic' )
                    {
                    // InternalSsrt.g:569:3: (enumLiteral_1= 'SecurityTactic' )
                    // InternalSsrt.g:570:4: enumLiteral_1= 'SecurityTactic'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getSolutionTypeAccess().getTacticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolutionTypeAccess().getTacticEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSolutionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});

}
package semcomdt.swsecurity.objective.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import semcomdt.swsecurity.objective.services.CiaampsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCiaampsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'propertyCategory'", "'{'", "'}'", "'securityProperty'", "'asset'", "'ensureSP'", "'refersToAE'", "'.'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCiaampsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCiaampsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCiaampsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCiaamps.g"; }



     	private CiaampsGrammarAccess grammarAccess;

        public InternalCiaampsParser(TokenStream input, CiaampsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Assets";
       	}

       	@Override
       	protected CiaampsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAssets"
    // InternalCiaamps.g:64:1: entryRuleAssets returns [EObject current=null] : iv_ruleAssets= ruleAssets EOF ;
    public final EObject entryRuleAssets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssets = null;


        try {
            // InternalCiaamps.g:64:47: (iv_ruleAssets= ruleAssets EOF )
            // InternalCiaamps.g:65:2: iv_ruleAssets= ruleAssets EOF
            {
             newCompositeNode(grammarAccess.getAssetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssets=ruleAssets();

            state._fsp--;

             current =iv_ruleAssets; 
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
    // $ANTLR end "entryRuleAssets"


    // $ANTLR start "ruleAssets"
    // InternalCiaamps.g:71:1: ruleAssets returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_assets_1_0= ruleAssetDetails ) )* ) ;
    public final EObject ruleAssets() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_assets_1_0 = null;



        	enterRule();

        try {
            // InternalCiaamps.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_assets_1_0= ruleAssetDetails ) )* ) )
            // InternalCiaamps.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_assets_1_0= ruleAssetDetails ) )* )
            {
            // InternalCiaamps.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_assets_1_0= ruleAssetDetails ) )* )
            // InternalCiaamps.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_assets_1_0= ruleAssetDetails ) )*
            {
            // InternalCiaamps.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCiaamps.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalCiaamps.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalCiaamps.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getAssetsAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssetsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"semcomdt.swsecurity.objective.Ciaamps.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCiaamps.g:98:3: ( (lv_assets_1_0= ruleAssetDetails ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||(LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCiaamps.g:99:4: (lv_assets_1_0= ruleAssetDetails )
            	    {
            	    // InternalCiaamps.g:99:4: (lv_assets_1_0= ruleAssetDetails )
            	    // InternalCiaamps.g:100:5: lv_assets_1_0= ruleAssetDetails
            	    {

            	    					newCompositeNode(grammarAccess.getAssetsAccess().getAssetsAssetDetailsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_assets_1_0=ruleAssetDetails();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssetsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assets",
            	    						lv_assets_1_0,
            	    						"semcomdt.swsecurity.objective.Ciaamps.AssetDetails");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleAssets"


    // $ANTLR start "entryRuleImport"
    // InternalCiaamps.g:121:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCiaamps.g:121:47: (iv_ruleImport= ruleImport EOF )
            // InternalCiaamps.g:122:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCiaamps.g:128:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalCiaamps.g:134:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalCiaamps.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalCiaamps.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalCiaamps.g:136:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalCiaamps.g:140:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalCiaamps.g:141:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalCiaamps.g:141:4: (lv_importURI_1_0= RULE_STRING )
            // InternalCiaamps.g:142:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAssetDetails"
    // InternalCiaamps.g:162:1: entryRuleAssetDetails returns [EObject current=null] : iv_ruleAssetDetails= ruleAssetDetails EOF ;
    public final EObject entryRuleAssetDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssetDetails = null;


        try {
            // InternalCiaamps.g:162:53: (iv_ruleAssetDetails= ruleAssetDetails EOF )
            // InternalCiaamps.g:163:2: iv_ruleAssetDetails= ruleAssetDetails EOF
            {
             newCompositeNode(grammarAccess.getAssetDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssetDetails=ruleAssetDetails();

            state._fsp--;

             current =iv_ruleAssetDetails; 
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
    // $ANTLR end "entryRuleAssetDetails"


    // $ANTLR start "ruleAssetDetails"
    // InternalCiaamps.g:169:1: ruleAssetDetails returns [EObject current=null] : (this_Asset_0= ruleAsset | this_SecurityProperty_1= ruleSecurityProperty | this_PropertyCategory_2= rulePropertyCategory ) ;
    public final EObject ruleAssetDetails() throws RecognitionException {
        EObject current = null;

        EObject this_Asset_0 = null;

        EObject this_SecurityProperty_1 = null;

        EObject this_PropertyCategory_2 = null;



        	enterRule();

        try {
            // InternalCiaamps.g:175:2: ( (this_Asset_0= ruleAsset | this_SecurityProperty_1= ruleSecurityProperty | this_PropertyCategory_2= rulePropertyCategory ) )
            // InternalCiaamps.g:176:2: (this_Asset_0= ruleAsset | this_SecurityProperty_1= ruleSecurityProperty | this_PropertyCategory_2= rulePropertyCategory )
            {
            // InternalCiaamps.g:176:2: (this_Asset_0= ruleAsset | this_SecurityProperty_1= ruleSecurityProperty | this_PropertyCategory_2= rulePropertyCategory )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCiaamps.g:177:3: this_Asset_0= ruleAsset
                    {

                    			newCompositeNode(grammarAccess.getAssetDetailsAccess().getAssetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Asset_0=ruleAsset();

                    state._fsp--;


                    			current = this_Asset_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCiaamps.g:186:3: this_SecurityProperty_1= ruleSecurityProperty
                    {

                    			newCompositeNode(grammarAccess.getAssetDetailsAccess().getSecurityPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SecurityProperty_1=ruleSecurityProperty();

                    state._fsp--;


                    			current = this_SecurityProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCiaamps.g:195:3: this_PropertyCategory_2= rulePropertyCategory
                    {

                    			newCompositeNode(grammarAccess.getAssetDetailsAccess().getPropertyCategoryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyCategory_2=rulePropertyCategory();

                    state._fsp--;


                    			current = this_PropertyCategory_2;
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
    // $ANTLR end "ruleAssetDetails"


    // $ANTLR start "entryRulePropertyCategory"
    // InternalCiaamps.g:207:1: entryRulePropertyCategory returns [EObject current=null] : iv_rulePropertyCategory= rulePropertyCategory EOF ;
    public final EObject entryRulePropertyCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCategory = null;


        try {
            // InternalCiaamps.g:207:57: (iv_rulePropertyCategory= rulePropertyCategory EOF )
            // InternalCiaamps.g:208:2: iv_rulePropertyCategory= rulePropertyCategory EOF
            {
             newCompositeNode(grammarAccess.getPropertyCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCategory=rulePropertyCategory();

            state._fsp--;

             current =iv_rulePropertyCategory; 
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
    // $ANTLR end "entryRulePropertyCategory"


    // $ANTLR start "rulePropertyCategory"
    // InternalCiaamps.g:214:1: rulePropertyCategory returns [EObject current=null] : (otherlv_0= 'propertyCategory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_secprop_3_0= ruleSecurityProperty ) )* otherlv_4= '}' ) ;
    public final EObject rulePropertyCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_secprop_3_0 = null;



        	enterRule();

        try {
            // InternalCiaamps.g:220:2: ( (otherlv_0= 'propertyCategory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_secprop_3_0= ruleSecurityProperty ) )* otherlv_4= '}' ) )
            // InternalCiaamps.g:221:2: (otherlv_0= 'propertyCategory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_secprop_3_0= ruleSecurityProperty ) )* otherlv_4= '}' )
            {
            // InternalCiaamps.g:221:2: (otherlv_0= 'propertyCategory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_secprop_3_0= ruleSecurityProperty ) )* otherlv_4= '}' )
            // InternalCiaamps.g:222:3: otherlv_0= 'propertyCategory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_secprop_3_0= ruleSecurityProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyCategoryAccess().getPropertyCategoryKeyword_0());
            		
            // InternalCiaamps.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCiaamps.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCiaamps.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalCiaamps.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyCategoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyCategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCiaamps.g:248:3: ( (lv_secprop_3_0= ruleSecurityProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCiaamps.g:249:4: (lv_secprop_3_0= ruleSecurityProperty )
            	    {
            	    // InternalCiaamps.g:249:4: (lv_secprop_3_0= ruleSecurityProperty )
            	    // InternalCiaamps.g:250:5: lv_secprop_3_0= ruleSecurityProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCategoryAccess().getSecpropSecurityPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_secprop_3_0=ruleSecurityProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCategoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secprop",
            	    						lv_secprop_3_0,
            	    						"semcomdt.swsecurity.objective.Ciaamps.SecurityProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyCategoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePropertyCategory"


    // $ANTLR start "entryRuleSecurityProperty"
    // InternalCiaamps.g:275:1: entryRuleSecurityProperty returns [EObject current=null] : iv_ruleSecurityProperty= ruleSecurityProperty EOF ;
    public final EObject entryRuleSecurityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityProperty = null;


        try {
            // InternalCiaamps.g:275:57: (iv_ruleSecurityProperty= ruleSecurityProperty EOF )
            // InternalCiaamps.g:276:2: iv_ruleSecurityProperty= ruleSecurityProperty EOF
            {
             newCompositeNode(grammarAccess.getSecurityPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityProperty=ruleSecurityProperty();

            state._fsp--;

             current =iv_ruleSecurityProperty; 
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
    // $ANTLR end "entryRuleSecurityProperty"


    // $ANTLR start "ruleSecurityProperty"
    // InternalCiaamps.g:282:1: ruleSecurityProperty returns [EObject current=null] : (otherlv_0= 'securityProperty' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSecurityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCiaamps.g:288:2: ( (otherlv_0= 'securityProperty' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCiaamps.g:289:2: (otherlv_0= 'securityProperty' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCiaamps.g:289:2: (otherlv_0= 'securityProperty' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCiaamps.g:290:3: otherlv_0= 'securityProperty' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityPropertyAccess().getSecurityPropertyKeyword_0());
            		
            // InternalCiaamps.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCiaamps.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCiaamps.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalCiaamps.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecurityPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecurityPropertyRule());
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
    // $ANTLR end "ruleSecurityProperty"


    // $ANTLR start "entryRuleAsset"
    // InternalCiaamps.g:316:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalCiaamps.g:316:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalCiaamps.g:317:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalCiaamps.g:323:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ensureSP' ( ( ruleQualifiedName ) ) (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCiaamps.g:329:2: ( (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ensureSP' ( ( ruleQualifiedName ) ) (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) )
            // InternalCiaamps.g:330:2: (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ensureSP' ( ( ruleQualifiedName ) ) (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            {
            // InternalCiaamps.g:330:2: (otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ensureSP' ( ( ruleQualifiedName ) ) (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            // InternalCiaamps.g:331:3: otherlv_0= 'asset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ensureSP' ( ( ruleQualifiedName ) ) (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getAssetKeyword_0());
            		
            // InternalCiaamps.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCiaamps.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCiaamps.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalCiaamps.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getEnsureSPKeyword_3());
            		
            // InternalCiaamps.g:361:3: ( ( ruleQualifiedName ) )
            // InternalCiaamps.g:362:4: ( ruleQualifiedName )
            {
            // InternalCiaamps.g:362:4: ( ruleQualifiedName )
            // InternalCiaamps.g:363:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssetAccess().getEnsureSPSecurityPropertyCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCiaamps.g:377:3: (otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCiaamps.g:378:4: otherlv_5= 'refersToAE' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getRefersToAEKeyword_5_0());
                    			
                    // InternalCiaamps.g:382:4: ( ( ruleQualifiedName ) )
                    // InternalCiaamps.g:383:5: ( ruleQualifiedName )
                    {
                    // InternalCiaamps.g:383:5: ( ruleQualifiedName )
                    // InternalCiaamps.g:384:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssetAccess().getRefersToAEElementCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCiaamps.g:407:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCiaamps.g:407:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCiaamps.g:408:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCiaamps.g:414:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCiaamps.g:420:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCiaamps.g:421:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCiaamps.g:421:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCiaamps.g:422:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCiaamps.g:429:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCiaamps.g:430:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000019802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});

}
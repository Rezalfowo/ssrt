package semcomdt.swsecurity.objective.ide.contentassist.antlr.internal;

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
import semcomdt.swsecurity.objective.services.CiaampsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCiaampsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'propertyCategory'", "'{'", "'}'", "'securityProperty'", "'asset'", "'ensureSP'", "'refersToAE'", "'.'"
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

    	public void setGrammarAccess(CiaampsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAssets"
    // InternalCiaamps.g:53:1: entryRuleAssets : ruleAssets EOF ;
    public final void entryRuleAssets() throws RecognitionException {
        try {
            // InternalCiaamps.g:54:1: ( ruleAssets EOF )
            // InternalCiaamps.g:55:1: ruleAssets EOF
            {
             before(grammarAccess.getAssetsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssets();

            state._fsp--;

             after(grammarAccess.getAssetsRule()); 
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
    // $ANTLR end "entryRuleAssets"


    // $ANTLR start "ruleAssets"
    // InternalCiaamps.g:62:1: ruleAssets : ( ( rule__Assets__Group__0 ) ) ;
    public final void ruleAssets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:66:2: ( ( ( rule__Assets__Group__0 ) ) )
            // InternalCiaamps.g:67:2: ( ( rule__Assets__Group__0 ) )
            {
            // InternalCiaamps.g:67:2: ( ( rule__Assets__Group__0 ) )
            // InternalCiaamps.g:68:3: ( rule__Assets__Group__0 )
            {
             before(grammarAccess.getAssetsAccess().getGroup()); 
            // InternalCiaamps.g:69:3: ( rule__Assets__Group__0 )
            // InternalCiaamps.g:69:4: rule__Assets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssetsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssets"


    // $ANTLR start "entryRuleImport"
    // InternalCiaamps.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalCiaamps.g:79:1: ( ruleImport EOF )
            // InternalCiaamps.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCiaamps.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalCiaamps.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalCiaamps.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalCiaamps.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalCiaamps.g:94:3: ( rule__Import__Group__0 )
            // InternalCiaamps.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAssetDetails"
    // InternalCiaamps.g:103:1: entryRuleAssetDetails : ruleAssetDetails EOF ;
    public final void entryRuleAssetDetails() throws RecognitionException {
        try {
            // InternalCiaamps.g:104:1: ( ruleAssetDetails EOF )
            // InternalCiaamps.g:105:1: ruleAssetDetails EOF
            {
             before(grammarAccess.getAssetDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssetDetails();

            state._fsp--;

             after(grammarAccess.getAssetDetailsRule()); 
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
    // $ANTLR end "entryRuleAssetDetails"


    // $ANTLR start "ruleAssetDetails"
    // InternalCiaamps.g:112:1: ruleAssetDetails : ( ( rule__AssetDetails__Alternatives ) ) ;
    public final void ruleAssetDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:116:2: ( ( ( rule__AssetDetails__Alternatives ) ) )
            // InternalCiaamps.g:117:2: ( ( rule__AssetDetails__Alternatives ) )
            {
            // InternalCiaamps.g:117:2: ( ( rule__AssetDetails__Alternatives ) )
            // InternalCiaamps.g:118:3: ( rule__AssetDetails__Alternatives )
            {
             before(grammarAccess.getAssetDetailsAccess().getAlternatives()); 
            // InternalCiaamps.g:119:3: ( rule__AssetDetails__Alternatives )
            // InternalCiaamps.g:119:4: rule__AssetDetails__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssetDetails__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssetDetailsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssetDetails"


    // $ANTLR start "entryRulePropertyCategory"
    // InternalCiaamps.g:128:1: entryRulePropertyCategory : rulePropertyCategory EOF ;
    public final void entryRulePropertyCategory() throws RecognitionException {
        try {
            // InternalCiaamps.g:129:1: ( rulePropertyCategory EOF )
            // InternalCiaamps.g:130:1: rulePropertyCategory EOF
            {
             before(grammarAccess.getPropertyCategoryRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyCategory();

            state._fsp--;

             after(grammarAccess.getPropertyCategoryRule()); 
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
    // $ANTLR end "entryRulePropertyCategory"


    // $ANTLR start "rulePropertyCategory"
    // InternalCiaamps.g:137:1: rulePropertyCategory : ( ( rule__PropertyCategory__Group__0 ) ) ;
    public final void rulePropertyCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:141:2: ( ( ( rule__PropertyCategory__Group__0 ) ) )
            // InternalCiaamps.g:142:2: ( ( rule__PropertyCategory__Group__0 ) )
            {
            // InternalCiaamps.g:142:2: ( ( rule__PropertyCategory__Group__0 ) )
            // InternalCiaamps.g:143:3: ( rule__PropertyCategory__Group__0 )
            {
             before(grammarAccess.getPropertyCategoryAccess().getGroup()); 
            // InternalCiaamps.g:144:3: ( rule__PropertyCategory__Group__0 )
            // InternalCiaamps.g:144:4: rule__PropertyCategory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyCategory"


    // $ANTLR start "entryRuleSecurityProperty"
    // InternalCiaamps.g:153:1: entryRuleSecurityProperty : ruleSecurityProperty EOF ;
    public final void entryRuleSecurityProperty() throws RecognitionException {
        try {
            // InternalCiaamps.g:154:1: ( ruleSecurityProperty EOF )
            // InternalCiaamps.g:155:1: ruleSecurityProperty EOF
            {
             before(grammarAccess.getSecurityPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurityProperty();

            state._fsp--;

             after(grammarAccess.getSecurityPropertyRule()); 
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
    // $ANTLR end "entryRuleSecurityProperty"


    // $ANTLR start "ruleSecurityProperty"
    // InternalCiaamps.g:162:1: ruleSecurityProperty : ( ( rule__SecurityProperty__Group__0 ) ) ;
    public final void ruleSecurityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:166:2: ( ( ( rule__SecurityProperty__Group__0 ) ) )
            // InternalCiaamps.g:167:2: ( ( rule__SecurityProperty__Group__0 ) )
            {
            // InternalCiaamps.g:167:2: ( ( rule__SecurityProperty__Group__0 ) )
            // InternalCiaamps.g:168:3: ( rule__SecurityProperty__Group__0 )
            {
             before(grammarAccess.getSecurityPropertyAccess().getGroup()); 
            // InternalCiaamps.g:169:3: ( rule__SecurityProperty__Group__0 )
            // InternalCiaamps.g:169:4: rule__SecurityProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecurityProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityProperty"


    // $ANTLR start "entryRuleAsset"
    // InternalCiaamps.g:178:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // InternalCiaamps.g:179:1: ( ruleAsset EOF )
            // InternalCiaamps.g:180:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            ruleAsset();

            state._fsp--;

             after(grammarAccess.getAssetRule()); 
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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalCiaamps.g:187:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:191:2: ( ( ( rule__Asset__Group__0 ) ) )
            // InternalCiaamps.g:192:2: ( ( rule__Asset__Group__0 ) )
            {
            // InternalCiaamps.g:192:2: ( ( rule__Asset__Group__0 ) )
            // InternalCiaamps.g:193:3: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // InternalCiaamps.g:194:3: ( rule__Asset__Group__0 )
            // InternalCiaamps.g:194:4: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCiaamps.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCiaamps.g:204:1: ( ruleQualifiedName EOF )
            // InternalCiaamps.g:205:1: ruleQualifiedName EOF
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
    // InternalCiaamps.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:216:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCiaamps.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCiaamps.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCiaamps.g:218:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalCiaamps.g:219:3: ( rule__QualifiedName__Group__0 )
            // InternalCiaamps.g:219:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__AssetDetails__Alternatives"
    // InternalCiaamps.g:227:1: rule__AssetDetails__Alternatives : ( ( ruleAsset ) | ( ruleSecurityProperty ) | ( rulePropertyCategory ) );
    public final void rule__AssetDetails__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:231:1: ( ( ruleAsset ) | ( ruleSecurityProperty ) | ( rulePropertyCategory ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCiaamps.g:232:2: ( ruleAsset )
                    {
                    // InternalCiaamps.g:232:2: ( ruleAsset )
                    // InternalCiaamps.g:233:3: ruleAsset
                    {
                     before(grammarAccess.getAssetDetailsAccess().getAssetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAsset();

                    state._fsp--;

                     after(grammarAccess.getAssetDetailsAccess().getAssetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCiaamps.g:238:2: ( ruleSecurityProperty )
                    {
                    // InternalCiaamps.g:238:2: ( ruleSecurityProperty )
                    // InternalCiaamps.g:239:3: ruleSecurityProperty
                    {
                     before(grammarAccess.getAssetDetailsAccess().getSecurityPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSecurityProperty();

                    state._fsp--;

                     after(grammarAccess.getAssetDetailsAccess().getSecurityPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCiaamps.g:244:2: ( rulePropertyCategory )
                    {
                    // InternalCiaamps.g:244:2: ( rulePropertyCategory )
                    // InternalCiaamps.g:245:3: rulePropertyCategory
                    {
                     before(grammarAccess.getAssetDetailsAccess().getPropertyCategoryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyCategory();

                    state._fsp--;

                     after(grammarAccess.getAssetDetailsAccess().getPropertyCategoryParserRuleCall_2()); 

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
    // $ANTLR end "rule__AssetDetails__Alternatives"


    // $ANTLR start "rule__Assets__Group__0"
    // InternalCiaamps.g:254:1: rule__Assets__Group__0 : rule__Assets__Group__0__Impl rule__Assets__Group__1 ;
    public final void rule__Assets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:258:1: ( rule__Assets__Group__0__Impl rule__Assets__Group__1 )
            // InternalCiaamps.g:259:2: rule__Assets__Group__0__Impl rule__Assets__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Assets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assets__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__Group__0"


    // $ANTLR start "rule__Assets__Group__0__Impl"
    // InternalCiaamps.g:266:1: rule__Assets__Group__0__Impl : ( ( rule__Assets__ImportsAssignment_0 )* ) ;
    public final void rule__Assets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:270:1: ( ( ( rule__Assets__ImportsAssignment_0 )* ) )
            // InternalCiaamps.g:271:1: ( ( rule__Assets__ImportsAssignment_0 )* )
            {
            // InternalCiaamps.g:271:1: ( ( rule__Assets__ImportsAssignment_0 )* )
            // InternalCiaamps.g:272:2: ( rule__Assets__ImportsAssignment_0 )*
            {
             before(grammarAccess.getAssetsAccess().getImportsAssignment_0()); 
            // InternalCiaamps.g:273:2: ( rule__Assets__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCiaamps.g:273:3: rule__Assets__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Assets__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAssetsAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__Group__0__Impl"


    // $ANTLR start "rule__Assets__Group__1"
    // InternalCiaamps.g:281:1: rule__Assets__Group__1 : rule__Assets__Group__1__Impl ;
    public final void rule__Assets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:285:1: ( rule__Assets__Group__1__Impl )
            // InternalCiaamps.g:286:2: rule__Assets__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assets__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__Group__1"


    // $ANTLR start "rule__Assets__Group__1__Impl"
    // InternalCiaamps.g:292:1: rule__Assets__Group__1__Impl : ( ( rule__Assets__AssetsAssignment_1 )* ) ;
    public final void rule__Assets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:296:1: ( ( ( rule__Assets__AssetsAssignment_1 )* ) )
            // InternalCiaamps.g:297:1: ( ( rule__Assets__AssetsAssignment_1 )* )
            {
            // InternalCiaamps.g:297:1: ( ( rule__Assets__AssetsAssignment_1 )* )
            // InternalCiaamps.g:298:2: ( rule__Assets__AssetsAssignment_1 )*
            {
             before(grammarAccess.getAssetsAccess().getAssetsAssignment_1()); 
            // InternalCiaamps.g:299:2: ( rule__Assets__AssetsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||(LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCiaamps.g:299:3: rule__Assets__AssetsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Assets__AssetsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAssetsAccess().getAssetsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalCiaamps.g:308:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:312:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalCiaamps.g:313:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalCiaamps.g:320:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:324:1: ( ( 'import' ) )
            // InternalCiaamps.g:325:1: ( 'import' )
            {
            // InternalCiaamps.g:325:1: ( 'import' )
            // InternalCiaamps.g:326:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalCiaamps.g:335:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:339:1: ( rule__Import__Group__1__Impl )
            // InternalCiaamps.g:340:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalCiaamps.g:346:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:350:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalCiaamps.g:351:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalCiaamps.g:351:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalCiaamps.g:352:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalCiaamps.g:353:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalCiaamps.g:353:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__PropertyCategory__Group__0"
    // InternalCiaamps.g:362:1: rule__PropertyCategory__Group__0 : rule__PropertyCategory__Group__0__Impl rule__PropertyCategory__Group__1 ;
    public final void rule__PropertyCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:366:1: ( rule__PropertyCategory__Group__0__Impl rule__PropertyCategory__Group__1 )
            // InternalCiaamps.g:367:2: rule__PropertyCategory__Group__0__Impl rule__PropertyCategory__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__0"


    // $ANTLR start "rule__PropertyCategory__Group__0__Impl"
    // InternalCiaamps.g:374:1: rule__PropertyCategory__Group__0__Impl : ( 'propertyCategory' ) ;
    public final void rule__PropertyCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:378:1: ( ( 'propertyCategory' ) )
            // InternalCiaamps.g:379:1: ( 'propertyCategory' )
            {
            // InternalCiaamps.g:379:1: ( 'propertyCategory' )
            // InternalCiaamps.g:380:2: 'propertyCategory'
            {
             before(grammarAccess.getPropertyCategoryAccess().getPropertyCategoryKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPropertyCategoryAccess().getPropertyCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__0__Impl"


    // $ANTLR start "rule__PropertyCategory__Group__1"
    // InternalCiaamps.g:389:1: rule__PropertyCategory__Group__1 : rule__PropertyCategory__Group__1__Impl rule__PropertyCategory__Group__2 ;
    public final void rule__PropertyCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:393:1: ( rule__PropertyCategory__Group__1__Impl rule__PropertyCategory__Group__2 )
            // InternalCiaamps.g:394:2: rule__PropertyCategory__Group__1__Impl rule__PropertyCategory__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PropertyCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__1"


    // $ANTLR start "rule__PropertyCategory__Group__1__Impl"
    // InternalCiaamps.g:401:1: rule__PropertyCategory__Group__1__Impl : ( ( rule__PropertyCategory__NameAssignment_1 ) ) ;
    public final void rule__PropertyCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:405:1: ( ( ( rule__PropertyCategory__NameAssignment_1 ) ) )
            // InternalCiaamps.g:406:1: ( ( rule__PropertyCategory__NameAssignment_1 ) )
            {
            // InternalCiaamps.g:406:1: ( ( rule__PropertyCategory__NameAssignment_1 ) )
            // InternalCiaamps.g:407:2: ( rule__PropertyCategory__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyCategoryAccess().getNameAssignment_1()); 
            // InternalCiaamps.g:408:2: ( rule__PropertyCategory__NameAssignment_1 )
            // InternalCiaamps.g:408:3: rule__PropertyCategory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCategory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__1__Impl"


    // $ANTLR start "rule__PropertyCategory__Group__2"
    // InternalCiaamps.g:416:1: rule__PropertyCategory__Group__2 : rule__PropertyCategory__Group__2__Impl rule__PropertyCategory__Group__3 ;
    public final void rule__PropertyCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:420:1: ( rule__PropertyCategory__Group__2__Impl rule__PropertyCategory__Group__3 )
            // InternalCiaamps.g:421:2: rule__PropertyCategory__Group__2__Impl rule__PropertyCategory__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__2"


    // $ANTLR start "rule__PropertyCategory__Group__2__Impl"
    // InternalCiaamps.g:428:1: rule__PropertyCategory__Group__2__Impl : ( '{' ) ;
    public final void rule__PropertyCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:432:1: ( ( '{' ) )
            // InternalCiaamps.g:433:1: ( '{' )
            {
            // InternalCiaamps.g:433:1: ( '{' )
            // InternalCiaamps.g:434:2: '{'
            {
             before(grammarAccess.getPropertyCategoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPropertyCategoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__2__Impl"


    // $ANTLR start "rule__PropertyCategory__Group__3"
    // InternalCiaamps.g:443:1: rule__PropertyCategory__Group__3 : rule__PropertyCategory__Group__3__Impl rule__PropertyCategory__Group__4 ;
    public final void rule__PropertyCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:447:1: ( rule__PropertyCategory__Group__3__Impl rule__PropertyCategory__Group__4 )
            // InternalCiaamps.g:448:2: rule__PropertyCategory__Group__3__Impl rule__PropertyCategory__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PropertyCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__3"


    // $ANTLR start "rule__PropertyCategory__Group__3__Impl"
    // InternalCiaamps.g:455:1: rule__PropertyCategory__Group__3__Impl : ( ( rule__PropertyCategory__SecpropAssignment_3 )* ) ;
    public final void rule__PropertyCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:459:1: ( ( ( rule__PropertyCategory__SecpropAssignment_3 )* ) )
            // InternalCiaamps.g:460:1: ( ( rule__PropertyCategory__SecpropAssignment_3 )* )
            {
            // InternalCiaamps.g:460:1: ( ( rule__PropertyCategory__SecpropAssignment_3 )* )
            // InternalCiaamps.g:461:2: ( rule__PropertyCategory__SecpropAssignment_3 )*
            {
             before(grammarAccess.getPropertyCategoryAccess().getSecpropAssignment_3()); 
            // InternalCiaamps.g:462:2: ( rule__PropertyCategory__SecpropAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCiaamps.g:462:3: rule__PropertyCategory__SecpropAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PropertyCategory__SecpropAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPropertyCategoryAccess().getSecpropAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__3__Impl"


    // $ANTLR start "rule__PropertyCategory__Group__4"
    // InternalCiaamps.g:470:1: rule__PropertyCategory__Group__4 : rule__PropertyCategory__Group__4__Impl ;
    public final void rule__PropertyCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:474:1: ( rule__PropertyCategory__Group__4__Impl )
            // InternalCiaamps.g:475:2: rule__PropertyCategory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCategory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__4"


    // $ANTLR start "rule__PropertyCategory__Group__4__Impl"
    // InternalCiaamps.g:481:1: rule__PropertyCategory__Group__4__Impl : ( '}' ) ;
    public final void rule__PropertyCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:485:1: ( ( '}' ) )
            // InternalCiaamps.g:486:1: ( '}' )
            {
            // InternalCiaamps.g:486:1: ( '}' )
            // InternalCiaamps.g:487:2: '}'
            {
             before(grammarAccess.getPropertyCategoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyCategoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__Group__4__Impl"


    // $ANTLR start "rule__SecurityProperty__Group__0"
    // InternalCiaamps.g:497:1: rule__SecurityProperty__Group__0 : rule__SecurityProperty__Group__0__Impl rule__SecurityProperty__Group__1 ;
    public final void rule__SecurityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:501:1: ( rule__SecurityProperty__Group__0__Impl rule__SecurityProperty__Group__1 )
            // InternalCiaamps.g:502:2: rule__SecurityProperty__Group__0__Impl rule__SecurityProperty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SecurityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityProperty__Group__0"


    // $ANTLR start "rule__SecurityProperty__Group__0__Impl"
    // InternalCiaamps.g:509:1: rule__SecurityProperty__Group__0__Impl : ( 'securityProperty' ) ;
    public final void rule__SecurityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:513:1: ( ( 'securityProperty' ) )
            // InternalCiaamps.g:514:1: ( 'securityProperty' )
            {
            // InternalCiaamps.g:514:1: ( 'securityProperty' )
            // InternalCiaamps.g:515:2: 'securityProperty'
            {
             before(grammarAccess.getSecurityPropertyAccess().getSecurityPropertyKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSecurityPropertyAccess().getSecurityPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityProperty__Group__0__Impl"


    // $ANTLR start "rule__SecurityProperty__Group__1"
    // InternalCiaamps.g:524:1: rule__SecurityProperty__Group__1 : rule__SecurityProperty__Group__1__Impl ;
    public final void rule__SecurityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:528:1: ( rule__SecurityProperty__Group__1__Impl )
            // InternalCiaamps.g:529:2: rule__SecurityProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityProperty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityProperty__Group__1"


    // $ANTLR start "rule__SecurityProperty__Group__1__Impl"
    // InternalCiaamps.g:535:1: rule__SecurityProperty__Group__1__Impl : ( ( rule__SecurityProperty__NameAssignment_1 ) ) ;
    public final void rule__SecurityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:539:1: ( ( ( rule__SecurityProperty__NameAssignment_1 ) ) )
            // InternalCiaamps.g:540:1: ( ( rule__SecurityProperty__NameAssignment_1 ) )
            {
            // InternalCiaamps.g:540:1: ( ( rule__SecurityProperty__NameAssignment_1 ) )
            // InternalCiaamps.g:541:2: ( rule__SecurityProperty__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityPropertyAccess().getNameAssignment_1()); 
            // InternalCiaamps.g:542:2: ( rule__SecurityProperty__NameAssignment_1 )
            // InternalCiaamps.g:542:3: rule__SecurityProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityProperty__Group__1__Impl"


    // $ANTLR start "rule__Asset__Group__0"
    // InternalCiaamps.g:551:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:555:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // InternalCiaamps.g:556:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Asset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__0"


    // $ANTLR start "rule__Asset__Group__0__Impl"
    // InternalCiaamps.g:563:1: rule__Asset__Group__0__Impl : ( 'asset' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:567:1: ( ( 'asset' ) )
            // InternalCiaamps.g:568:1: ( 'asset' )
            {
            // InternalCiaamps.g:568:1: ( 'asset' )
            // InternalCiaamps.g:569:2: 'asset'
            {
             before(grammarAccess.getAssetAccess().getAssetKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getAssetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__0__Impl"


    // $ANTLR start "rule__Asset__Group__1"
    // InternalCiaamps.g:578:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:582:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // InternalCiaamps.g:583:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Asset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__1"


    // $ANTLR start "rule__Asset__Group__1__Impl"
    // InternalCiaamps.g:590:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:594:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // InternalCiaamps.g:595:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // InternalCiaamps.g:595:1: ( ( rule__Asset__NameAssignment_1 ) )
            // InternalCiaamps.g:596:2: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // InternalCiaamps.g:597:2: ( rule__Asset__NameAssignment_1 )
            // InternalCiaamps.g:597:3: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asset__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__1__Impl"


    // $ANTLR start "rule__Asset__Group__2"
    // InternalCiaamps.g:605:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl rule__Asset__Group__3 ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:609:1: ( rule__Asset__Group__2__Impl rule__Asset__Group__3 )
            // InternalCiaamps.g:610:2: rule__Asset__Group__2__Impl rule__Asset__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Asset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__2"


    // $ANTLR start "rule__Asset__Group__2__Impl"
    // InternalCiaamps.g:617:1: rule__Asset__Group__2__Impl : ( '{' ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:621:1: ( ( '{' ) )
            // InternalCiaamps.g:622:1: ( '{' )
            {
            // InternalCiaamps.g:622:1: ( '{' )
            // InternalCiaamps.g:623:2: '{'
            {
             before(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__2__Impl"


    // $ANTLR start "rule__Asset__Group__3"
    // InternalCiaamps.g:632:1: rule__Asset__Group__3 : rule__Asset__Group__3__Impl rule__Asset__Group__4 ;
    public final void rule__Asset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:636:1: ( rule__Asset__Group__3__Impl rule__Asset__Group__4 )
            // InternalCiaamps.g:637:2: rule__Asset__Group__3__Impl rule__Asset__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Asset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__3"


    // $ANTLR start "rule__Asset__Group__3__Impl"
    // InternalCiaamps.g:644:1: rule__Asset__Group__3__Impl : ( 'ensureSP' ) ;
    public final void rule__Asset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:648:1: ( ( 'ensureSP' ) )
            // InternalCiaamps.g:649:1: ( 'ensureSP' )
            {
            // InternalCiaamps.g:649:1: ( 'ensureSP' )
            // InternalCiaamps.g:650:2: 'ensureSP'
            {
             before(grammarAccess.getAssetAccess().getEnsureSPKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getEnsureSPKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__3__Impl"


    // $ANTLR start "rule__Asset__Group__4"
    // InternalCiaamps.g:659:1: rule__Asset__Group__4 : rule__Asset__Group__4__Impl rule__Asset__Group__5 ;
    public final void rule__Asset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:663:1: ( rule__Asset__Group__4__Impl rule__Asset__Group__5 )
            // InternalCiaamps.g:664:2: rule__Asset__Group__4__Impl rule__Asset__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Asset__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__4"


    // $ANTLR start "rule__Asset__Group__4__Impl"
    // InternalCiaamps.g:671:1: rule__Asset__Group__4__Impl : ( ( rule__Asset__EnsureSPAssignment_4 ) ) ;
    public final void rule__Asset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:675:1: ( ( ( rule__Asset__EnsureSPAssignment_4 ) ) )
            // InternalCiaamps.g:676:1: ( ( rule__Asset__EnsureSPAssignment_4 ) )
            {
            // InternalCiaamps.g:676:1: ( ( rule__Asset__EnsureSPAssignment_4 ) )
            // InternalCiaamps.g:677:2: ( rule__Asset__EnsureSPAssignment_4 )
            {
             before(grammarAccess.getAssetAccess().getEnsureSPAssignment_4()); 
            // InternalCiaamps.g:678:2: ( rule__Asset__EnsureSPAssignment_4 )
            // InternalCiaamps.g:678:3: rule__Asset__EnsureSPAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Asset__EnsureSPAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getEnsureSPAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__4__Impl"


    // $ANTLR start "rule__Asset__Group__5"
    // InternalCiaamps.g:686:1: rule__Asset__Group__5 : rule__Asset__Group__5__Impl rule__Asset__Group__6 ;
    public final void rule__Asset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:690:1: ( rule__Asset__Group__5__Impl rule__Asset__Group__6 )
            // InternalCiaamps.g:691:2: rule__Asset__Group__5__Impl rule__Asset__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Asset__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__5"


    // $ANTLR start "rule__Asset__Group__5__Impl"
    // InternalCiaamps.g:698:1: rule__Asset__Group__5__Impl : ( ( rule__Asset__Group_5__0 )? ) ;
    public final void rule__Asset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:702:1: ( ( ( rule__Asset__Group_5__0 )? ) )
            // InternalCiaamps.g:703:1: ( ( rule__Asset__Group_5__0 )? )
            {
            // InternalCiaamps.g:703:1: ( ( rule__Asset__Group_5__0 )? )
            // InternalCiaamps.g:704:2: ( rule__Asset__Group_5__0 )?
            {
             before(grammarAccess.getAssetAccess().getGroup_5()); 
            // InternalCiaamps.g:705:2: ( rule__Asset__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCiaamps.g:705:3: rule__Asset__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asset__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__5__Impl"


    // $ANTLR start "rule__Asset__Group__6"
    // InternalCiaamps.g:713:1: rule__Asset__Group__6 : rule__Asset__Group__6__Impl ;
    public final void rule__Asset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:717:1: ( rule__Asset__Group__6__Impl )
            // InternalCiaamps.g:718:2: rule__Asset__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asset__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__6"


    // $ANTLR start "rule__Asset__Group__6__Impl"
    // InternalCiaamps.g:724:1: rule__Asset__Group__6__Impl : ( '}' ) ;
    public final void rule__Asset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:728:1: ( ( '}' ) )
            // InternalCiaamps.g:729:1: ( '}' )
            {
            // InternalCiaamps.g:729:1: ( '}' )
            // InternalCiaamps.g:730:2: '}'
            {
             before(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group__6__Impl"


    // $ANTLR start "rule__Asset__Group_5__0"
    // InternalCiaamps.g:740:1: rule__Asset__Group_5__0 : rule__Asset__Group_5__0__Impl rule__Asset__Group_5__1 ;
    public final void rule__Asset__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:744:1: ( rule__Asset__Group_5__0__Impl rule__Asset__Group_5__1 )
            // InternalCiaamps.g:745:2: rule__Asset__Group_5__0__Impl rule__Asset__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Asset__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asset__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_5__0"


    // $ANTLR start "rule__Asset__Group_5__0__Impl"
    // InternalCiaamps.g:752:1: rule__Asset__Group_5__0__Impl : ( 'refersToAE' ) ;
    public final void rule__Asset__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:756:1: ( ( 'refersToAE' ) )
            // InternalCiaamps.g:757:1: ( 'refersToAE' )
            {
            // InternalCiaamps.g:757:1: ( 'refersToAE' )
            // InternalCiaamps.g:758:2: 'refersToAE'
            {
             before(grammarAccess.getAssetAccess().getRefersToAEKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getRefersToAEKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_5__0__Impl"


    // $ANTLR start "rule__Asset__Group_5__1"
    // InternalCiaamps.g:767:1: rule__Asset__Group_5__1 : rule__Asset__Group_5__1__Impl ;
    public final void rule__Asset__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:771:1: ( rule__Asset__Group_5__1__Impl )
            // InternalCiaamps.g:772:2: rule__Asset__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asset__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_5__1"


    // $ANTLR start "rule__Asset__Group_5__1__Impl"
    // InternalCiaamps.g:778:1: rule__Asset__Group_5__1__Impl : ( ( rule__Asset__RefersToAEAssignment_5_1 ) ) ;
    public final void rule__Asset__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:782:1: ( ( ( rule__Asset__RefersToAEAssignment_5_1 ) ) )
            // InternalCiaamps.g:783:1: ( ( rule__Asset__RefersToAEAssignment_5_1 ) )
            {
            // InternalCiaamps.g:783:1: ( ( rule__Asset__RefersToAEAssignment_5_1 ) )
            // InternalCiaamps.g:784:2: ( rule__Asset__RefersToAEAssignment_5_1 )
            {
             before(grammarAccess.getAssetAccess().getRefersToAEAssignment_5_1()); 
            // InternalCiaamps.g:785:2: ( rule__Asset__RefersToAEAssignment_5_1 )
            // InternalCiaamps.g:785:3: rule__Asset__RefersToAEAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Asset__RefersToAEAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssetAccess().getRefersToAEAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__Group_5__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCiaamps.g:794:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:798:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCiaamps.g:799:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCiaamps.g:806:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:810:1: ( ( RULE_ID ) )
            // InternalCiaamps.g:811:1: ( RULE_ID )
            {
            // InternalCiaamps.g:811:1: ( RULE_ID )
            // InternalCiaamps.g:812:2: RULE_ID
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
    // InternalCiaamps.g:821:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:825:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCiaamps.g:826:2: rule__QualifiedName__Group__1__Impl
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
    // InternalCiaamps.g:832:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:836:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCiaamps.g:837:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCiaamps.g:837:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCiaamps.g:838:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalCiaamps.g:839:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCiaamps.g:839:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCiaamps.g:848:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:852:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCiaamps.g:853:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCiaamps.g:860:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:864:1: ( ( '.' ) )
            // InternalCiaamps.g:865:1: ( '.' )
            {
            // InternalCiaamps.g:865:1: ( '.' )
            // InternalCiaamps.g:866:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCiaamps.g:875:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:879:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCiaamps.g:880:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalCiaamps.g:886:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:890:1: ( ( RULE_ID ) )
            // InternalCiaamps.g:891:1: ( RULE_ID )
            {
            // InternalCiaamps.g:891:1: ( RULE_ID )
            // InternalCiaamps.g:892:2: RULE_ID
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


    // $ANTLR start "rule__Assets__ImportsAssignment_0"
    // InternalCiaamps.g:902:1: rule__Assets__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Assets__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:906:1: ( ( ruleImport ) )
            // InternalCiaamps.g:907:2: ( ruleImport )
            {
            // InternalCiaamps.g:907:2: ( ruleImport )
            // InternalCiaamps.g:908:3: ruleImport
            {
             before(grammarAccess.getAssetsAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getAssetsAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__ImportsAssignment_0"


    // $ANTLR start "rule__Assets__AssetsAssignment_1"
    // InternalCiaamps.g:917:1: rule__Assets__AssetsAssignment_1 : ( ruleAssetDetails ) ;
    public final void rule__Assets__AssetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:921:1: ( ( ruleAssetDetails ) )
            // InternalCiaamps.g:922:2: ( ruleAssetDetails )
            {
            // InternalCiaamps.g:922:2: ( ruleAssetDetails )
            // InternalCiaamps.g:923:3: ruleAssetDetails
            {
             before(grammarAccess.getAssetsAccess().getAssetsAssetDetailsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssetDetails();

            state._fsp--;

             after(grammarAccess.getAssetsAccess().getAssetsAssetDetailsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assets__AssetsAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalCiaamps.g:932:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:936:1: ( ( RULE_STRING ) )
            // InternalCiaamps.g:937:2: ( RULE_STRING )
            {
            // InternalCiaamps.g:937:2: ( RULE_STRING )
            // InternalCiaamps.g:938:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__PropertyCategory__NameAssignment_1"
    // InternalCiaamps.g:947:1: rule__PropertyCategory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyCategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:951:1: ( ( RULE_ID ) )
            // InternalCiaamps.g:952:2: ( RULE_ID )
            {
            // InternalCiaamps.g:952:2: ( RULE_ID )
            // InternalCiaamps.g:953:3: RULE_ID
            {
             before(grammarAccess.getPropertyCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__NameAssignment_1"


    // $ANTLR start "rule__PropertyCategory__SecpropAssignment_3"
    // InternalCiaamps.g:962:1: rule__PropertyCategory__SecpropAssignment_3 : ( ruleSecurityProperty ) ;
    public final void rule__PropertyCategory__SecpropAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:966:1: ( ( ruleSecurityProperty ) )
            // InternalCiaamps.g:967:2: ( ruleSecurityProperty )
            {
            // InternalCiaamps.g:967:2: ( ruleSecurityProperty )
            // InternalCiaamps.g:968:3: ruleSecurityProperty
            {
             before(grammarAccess.getPropertyCategoryAccess().getSecpropSecurityPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityProperty();

            state._fsp--;

             after(grammarAccess.getPropertyCategoryAccess().getSecpropSecurityPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCategory__SecpropAssignment_3"


    // $ANTLR start "rule__SecurityProperty__NameAssignment_1"
    // InternalCiaamps.g:977:1: rule__SecurityProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:981:1: ( ( RULE_ID ) )
            // InternalCiaamps.g:982:2: ( RULE_ID )
            {
            // InternalCiaamps.g:982:2: ( RULE_ID )
            // InternalCiaamps.g:983:3: RULE_ID
            {
             before(grammarAccess.getSecurityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSecurityPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityProperty__NameAssignment_1"


    // $ANTLR start "rule__Asset__NameAssignment_1"
    // InternalCiaamps.g:992:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:996:1: ( ( RULE_ID ) )
            // InternalCiaamps.g:997:2: ( RULE_ID )
            {
            // InternalCiaamps.g:997:2: ( RULE_ID )
            // InternalCiaamps.g:998:3: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__NameAssignment_1"


    // $ANTLR start "rule__Asset__EnsureSPAssignment_4"
    // InternalCiaamps.g:1007:1: rule__Asset__EnsureSPAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asset__EnsureSPAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:1011:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCiaamps.g:1012:2: ( ( ruleQualifiedName ) )
            {
            // InternalCiaamps.g:1012:2: ( ( ruleQualifiedName ) )
            // InternalCiaamps.g:1013:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssetAccess().getEnsureSPSecurityPropertyCrossReference_4_0()); 
            // InternalCiaamps.g:1014:3: ( ruleQualifiedName )
            // InternalCiaamps.g:1015:4: ruleQualifiedName
            {
             before(grammarAccess.getAssetAccess().getEnsureSPSecurityPropertyQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssetAccess().getEnsureSPSecurityPropertyQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssetAccess().getEnsureSPSecurityPropertyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__EnsureSPAssignment_4"


    // $ANTLR start "rule__Asset__RefersToAEAssignment_5_1"
    // InternalCiaamps.g:1026:1: rule__Asset__RefersToAEAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Asset__RefersToAEAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCiaamps.g:1030:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCiaamps.g:1031:2: ( ( ruleQualifiedName ) )
            {
            // InternalCiaamps.g:1031:2: ( ( ruleQualifiedName ) )
            // InternalCiaamps.g:1032:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssetAccess().getRefersToAEElementCrossReference_5_1_0()); 
            // InternalCiaamps.g:1033:3: ( ruleQualifiedName )
            // InternalCiaamps.g:1034:4: ruleQualifiedName
            {
             before(grammarAccess.getAssetAccess().getRefersToAEElementQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssetAccess().getRefersToAEElementQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAssetAccess().getRefersToAEElementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asset__RefersToAEAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});

}
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'integer'", "'float'", "'double'", "'null'", "'date-time'", "'time'", "'date'", "'email'", "'idn-email'", "'hostname'", "'ipv4'", "'ipv6'", "'uri'", "'uri-reference'", "'iri'", "'iri-reference'", "'uri-template'", "'json-pointer'", "'relative-json-pointer'", "'regex'", "'.'", "'{'", "'}'", "'includes'", "','", "'with'", "';'", "'extends'", "'String'", "'num'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'", "'override'", "'root'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJSchema.g"; }


    	private JSchemaGrammarAccess grammarAccess;

    	public void setGrammarAccess(JSchemaGrammarAccess grammarAccess) {
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
    // InternalJSchema.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalJSchema.g:54:1: ( ruleModel EOF )
            // InternalJSchema.g:55:1: ruleModel EOF
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
    // InternalJSchema.g:62:1: ruleModel : ( ( rule__Model__AbstractObjectAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:66:2: ( ( ( rule__Model__AbstractObjectAssignment )* ) )
            // InternalJSchema.g:67:2: ( ( rule__Model__AbstractObjectAssignment )* )
            {
            // InternalJSchema.g:67:2: ( ( rule__Model__AbstractObjectAssignment )* )
            // InternalJSchema.g:68:3: ( rule__Model__AbstractObjectAssignment )*
            {
             before(grammarAccess.getModelAccess().getAbstractObjectAssignment()); 
            // InternalJSchema.g:69:3: ( rule__Model__AbstractObjectAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJSchema.g:69:4: rule__Model__AbstractObjectAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AbstractObjectAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAbstractObjectAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNumber"
    // InternalJSchema.g:78:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalJSchema.g:79:1: ( ruleNumber EOF )
            // InternalJSchema.g:80:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSchema.g:87:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:91:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalJSchema.g:92:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalJSchema.g:92:2: ( ( rule__Number__Group__0 ) )
            // InternalJSchema.g:93:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalJSchema.g:94:3: ( rule__Number__Group__0 )
            // InternalJSchema.g:94:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleAbstractObject"
    // InternalJSchema.g:103:1: entryRuleAbstractObject : ruleAbstractObject EOF ;
    public final void entryRuleAbstractObject() throws RecognitionException {
        try {
            // InternalJSchema.g:104:1: ( ruleAbstractObject EOF )
            // InternalJSchema.g:105:1: ruleAbstractObject EOF
            {
             before(grammarAccess.getAbstractObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getAbstractObjectRule()); 
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
    // $ANTLR end "entryRuleAbstractObject"


    // $ANTLR start "ruleAbstractObject"
    // InternalJSchema.g:112:1: ruleAbstractObject : ( ( rule__AbstractObject__Alternatives ) ) ;
    public final void ruleAbstractObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:116:2: ( ( ( rule__AbstractObject__Alternatives ) ) )
            // InternalJSchema.g:117:2: ( ( rule__AbstractObject__Alternatives ) )
            {
            // InternalJSchema.g:117:2: ( ( rule__AbstractObject__Alternatives ) )
            // InternalJSchema.g:118:3: ( rule__AbstractObject__Alternatives )
            {
             before(grammarAccess.getAbstractObjectAccess().getAlternatives()); 
            // InternalJSchema.g:119:3: ( rule__AbstractObject__Alternatives )
            // InternalJSchema.g:119:4: rule__AbstractObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractObject"


    // $ANTLR start "entryRuleMainObject"
    // InternalJSchema.g:128:1: entryRuleMainObject : ruleMainObject EOF ;
    public final void entryRuleMainObject() throws RecognitionException {
        try {
            // InternalJSchema.g:129:1: ( ruleMainObject EOF )
            // InternalJSchema.g:130:1: ruleMainObject EOF
            {
             before(grammarAccess.getMainObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleMainObject();

            state._fsp--;

             after(grammarAccess.getMainObjectRule()); 
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
    // $ANTLR end "entryRuleMainObject"


    // $ANTLR start "ruleMainObject"
    // InternalJSchema.g:137:1: ruleMainObject : ( ( rule__MainObject__Group__0 ) ) ;
    public final void ruleMainObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:141:2: ( ( ( rule__MainObject__Group__0 ) ) )
            // InternalJSchema.g:142:2: ( ( rule__MainObject__Group__0 ) )
            {
            // InternalJSchema.g:142:2: ( ( rule__MainObject__Group__0 ) )
            // InternalJSchema.g:143:3: ( rule__MainObject__Group__0 )
            {
             before(grammarAccess.getMainObjectAccess().getGroup()); 
            // InternalJSchema.g:144:3: ( rule__MainObject__Group__0 )
            // InternalJSchema.g:144:4: rule__MainObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainObject"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:153:1: entryRulePrimitiveObject : rulePrimitiveObject EOF ;
    public final void entryRulePrimitiveObject() throws RecognitionException {
        try {
            // InternalJSchema.g:154:1: ( rulePrimitiveObject EOF )
            // InternalJSchema.g:155:1: rulePrimitiveObject EOF
            {
             before(grammarAccess.getPrimitiveObjectRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveObject();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectRule()); 
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
    // $ANTLR end "entryRulePrimitiveObject"


    // $ANTLR start "rulePrimitiveObject"
    // InternalJSchema.g:162:1: rulePrimitiveObject : ( ( rule__PrimitiveObject__Group__0 ) ) ;
    public final void rulePrimitiveObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:166:2: ( ( ( rule__PrimitiveObject__Group__0 ) ) )
            // InternalJSchema.g:167:2: ( ( rule__PrimitiveObject__Group__0 ) )
            {
            // InternalJSchema.g:167:2: ( ( rule__PrimitiveObject__Group__0 ) )
            // InternalJSchema.g:168:3: ( rule__PrimitiveObject__Group__0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup()); 
            // InternalJSchema.g:169:3: ( rule__PrimitiveObject__Group__0 )
            // InternalJSchema.g:169:4: rule__PrimitiveObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveObject"


    // $ANTLR start "entryRuleExtendedObject"
    // InternalJSchema.g:178:1: entryRuleExtendedObject : ruleExtendedObject EOF ;
    public final void entryRuleExtendedObject() throws RecognitionException {
        try {
            // InternalJSchema.g:179:1: ( ruleExtendedObject EOF )
            // InternalJSchema.g:180:1: ruleExtendedObject EOF
            {
             before(grammarAccess.getExtendedObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleExtendedObject();

            state._fsp--;

             after(grammarAccess.getExtendedObjectRule()); 
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
    // $ANTLR end "entryRuleExtendedObject"


    // $ANTLR start "ruleExtendedObject"
    // InternalJSchema.g:187:1: ruleExtendedObject : ( ( rule__ExtendedObject__Group__0 ) ) ;
    public final void ruleExtendedObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:191:2: ( ( ( rule__ExtendedObject__Group__0 ) ) )
            // InternalJSchema.g:192:2: ( ( rule__ExtendedObject__Group__0 ) )
            {
            // InternalJSchema.g:192:2: ( ( rule__ExtendedObject__Group__0 ) )
            // InternalJSchema.g:193:3: ( rule__ExtendedObject__Group__0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup()); 
            // InternalJSchema.g:194:3: ( rule__ExtendedObject__Group__0 )
            // InternalJSchema.g:194:4: rule__ExtendedObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedObject"


    // $ANTLR start "entryRuleExtendedProperties"
    // InternalJSchema.g:203:1: entryRuleExtendedProperties : ruleExtendedProperties EOF ;
    public final void entryRuleExtendedProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( ruleExtendedProperties EOF )
            // InternalJSchema.g:205:1: ruleExtendedProperties EOF
            {
             before(grammarAccess.getExtendedPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleExtendedProperties();

            state._fsp--;

             after(grammarAccess.getExtendedPropertiesRule()); 
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
    // $ANTLR end "entryRuleExtendedProperties"


    // $ANTLR start "ruleExtendedProperties"
    // InternalJSchema.g:212:1: ruleExtendedProperties : ( ( rule__ExtendedProperties__Group__0 ) ) ;
    public final void ruleExtendedProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__ExtendedProperties__Group__0 ) ) )
            // InternalJSchema.g:217:2: ( ( rule__ExtendedProperties__Group__0 ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__ExtendedProperties__Group__0 ) )
            // InternalJSchema.g:218:3: ( rule__ExtendedProperties__Group__0 )
            {
             before(grammarAccess.getExtendedPropertiesAccess().getGroup()); 
            // InternalJSchema.g:219:3: ( rule__ExtendedProperties__Group__0 )
            // InternalJSchema.g:219:4: rule__ExtendedProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedProperties"


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalJSchema.g:228:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:229:1: ( rulePrimitiveTypes EOF )
            // InternalJSchema.g:230:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
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
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalJSchema.g:237:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:241:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // InternalJSchema.g:242:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // InternalJSchema.g:242:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            // InternalJSchema.g:243:3: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // InternalJSchema.g:244:3: ( rule__PrimitiveTypes__Alternatives )
            // InternalJSchema.g:244:4: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleIsRoot"
    // InternalJSchema.g:253:1: entryRuleIsRoot : ruleIsRoot EOF ;
    public final void entryRuleIsRoot() throws RecognitionException {
        try {
            // InternalJSchema.g:254:1: ( ruleIsRoot EOF )
            // InternalJSchema.g:255:1: ruleIsRoot EOF
            {
             before(grammarAccess.getIsRootRule()); 
            pushFollow(FOLLOW_1);
            ruleIsRoot();

            state._fsp--;

             after(grammarAccess.getIsRootRule()); 
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
    // $ANTLR end "entryRuleIsRoot"


    // $ANTLR start "ruleIsRoot"
    // InternalJSchema.g:262:1: ruleIsRoot : ( ( rule__IsRoot__StringAssignment ) ) ;
    public final void ruleIsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:266:2: ( ( ( rule__IsRoot__StringAssignment ) ) )
            // InternalJSchema.g:267:2: ( ( rule__IsRoot__StringAssignment ) )
            {
            // InternalJSchema.g:267:2: ( ( rule__IsRoot__StringAssignment ) )
            // InternalJSchema.g:268:3: ( rule__IsRoot__StringAssignment )
            {
             before(grammarAccess.getIsRootAccess().getStringAssignment()); 
            // InternalJSchema.g:269:3: ( rule__IsRoot__StringAssignment )
            // InternalJSchema.g:269:4: rule__IsRoot__StringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IsRoot__StringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIsRootAccess().getStringAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsRoot"


    // $ANTLR start "entryRulehasProperties"
    // InternalJSchema.g:278:1: entryRulehasProperties : rulehasProperties EOF ;
    public final void entryRulehasProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:279:1: ( rulehasProperties EOF )
            // InternalJSchema.g:280:1: rulehasProperties EOF
            {
             before(grammarAccess.getHasPropertiesRule()); 
            pushFollow(FOLLOW_1);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getHasPropertiesRule()); 
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
    // $ANTLR end "entryRulehasProperties"


    // $ANTLR start "rulehasProperties"
    // InternalJSchema.g:287:1: rulehasProperties : ( ( rule__HasProperties__PropertiesAssignment ) ) ;
    public final void rulehasProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:291:2: ( ( ( rule__HasProperties__PropertiesAssignment ) ) )
            // InternalJSchema.g:292:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            {
            // InternalJSchema.g:292:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            // InternalJSchema.g:293:3: ( rule__HasProperties__PropertiesAssignment )
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 
            // InternalJSchema.g:294:3: ( rule__HasProperties__PropertiesAssignment )
            // InternalJSchema.g:294:4: rule__HasProperties__PropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__HasProperties__PropertiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulehasProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJSchema.g:304:1: ( ruleProperty EOF )
            // InternalJSchema.g:305:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJSchema.g:312:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:316:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalJSchema.g:317:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalJSchema.g:317:2: ( ( rule__Property__Alternatives ) )
            // InternalJSchema.g:318:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalJSchema.g:319:3: ( rule__Property__Alternatives )
            // InternalJSchema.g:319:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePrimitiveProperties"
    // InternalJSchema.g:328:1: entryRulePrimitiveProperties : rulePrimitiveProperties EOF ;
    public final void entryRulePrimitiveProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:329:1: ( rulePrimitiveProperties EOF )
            // InternalJSchema.g:330:1: rulePrimitiveProperties EOF
            {
             before(grammarAccess.getPrimitivePropertiesRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesRule()); 
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
    // $ANTLR end "entryRulePrimitiveProperties"


    // $ANTLR start "rulePrimitiveProperties"
    // InternalJSchema.g:337:1: rulePrimitiveProperties : ( ( rule__PrimitiveProperties__Alternatives ) ) ;
    public final void rulePrimitiveProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:341:2: ( ( ( rule__PrimitiveProperties__Alternatives ) ) )
            // InternalJSchema.g:342:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            {
            // InternalJSchema.g:342:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            // InternalJSchema.g:343:3: ( rule__PrimitiveProperties__Alternatives )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 
            // InternalJSchema.g:344:3: ( rule__PrimitiveProperties__Alternatives )
            // InternalJSchema.g:344:4: rule__PrimitiveProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveProperties"


    // $ANTLR start "entryRuleStringLength"
    // InternalJSchema.g:353:1: entryRuleStringLength : ruleStringLength EOF ;
    public final void entryRuleStringLength() throws RecognitionException {
        try {
            // InternalJSchema.g:354:1: ( ruleStringLength EOF )
            // InternalJSchema.g:355:1: ruleStringLength EOF
            {
             before(grammarAccess.getStringLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLength();

            state._fsp--;

             after(grammarAccess.getStringLengthRule()); 
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
    // $ANTLR end "entryRuleStringLength"


    // $ANTLR start "ruleStringLength"
    // InternalJSchema.g:362:1: ruleStringLength : ( ( rule__StringLength__Group__0 ) ) ;
    public final void ruleStringLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:366:2: ( ( ( rule__StringLength__Group__0 ) ) )
            // InternalJSchema.g:367:2: ( ( rule__StringLength__Group__0 ) )
            {
            // InternalJSchema.g:367:2: ( ( rule__StringLength__Group__0 ) )
            // InternalJSchema.g:368:3: ( rule__StringLength__Group__0 )
            {
             before(grammarAccess.getStringLengthAccess().getGroup()); 
            // InternalJSchema.g:369:3: ( rule__StringLength__Group__0 )
            // InternalJSchema.g:369:4: rule__StringLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLength__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLengthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLength"


    // $ANTLR start "entryRuleIncludes"
    // InternalJSchema.g:378:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalJSchema.g:379:1: ( ruleIncludes EOF )
            // InternalJSchema.g:380:1: ruleIncludes EOF
            {
             before(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getIncludesRule()); 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalJSchema.g:387:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:391:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalJSchema.g:392:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalJSchema.g:392:2: ( ( rule__Includes__Group__0 ) )
            // InternalJSchema.g:393:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalJSchema.g:394:3: ( rule__Includes__Group__0 )
            // InternalJSchema.g:394:4: rule__Includes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleArray"
    // InternalJSchema.g:403:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSchema.g:404:1: ( ruleArray EOF )
            // InternalJSchema.g:405:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSchema.g:412:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:416:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSchema.g:417:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSchema.g:417:2: ( ( rule__Array__Group__0 ) )
            // InternalJSchema.g:418:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSchema.g:419:3: ( rule__Array__Group__0 )
            // InternalJSchema.g:419:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleArrayType"
    // InternalJSchema.g:428:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalJSchema.g:429:1: ( ruleArrayType EOF )
            // InternalJSchema.g:430:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalJSchema.g:437:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:441:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalJSchema.g:442:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalJSchema.g:442:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalJSchema.g:443:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalJSchema.g:444:3: ( rule__ArrayType__Alternatives )
            // InternalJSchema.g:444:4: rule__ArrayType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:453:1: ruleFormatTypes : ( ( rule__FormatTypes__Alternatives ) ) ;
    public final void ruleFormatTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:457:1: ( ( ( rule__FormatTypes__Alternatives ) ) )
            // InternalJSchema.g:458:2: ( ( rule__FormatTypes__Alternatives ) )
            {
            // InternalJSchema.g:458:2: ( ( rule__FormatTypes__Alternatives ) )
            // InternalJSchema.g:459:3: ( rule__FormatTypes__Alternatives )
            {
             before(grammarAccess.getFormatTypesAccess().getAlternatives()); 
            // InternalJSchema.g:460:3: ( rule__FormatTypes__Alternatives )
            // InternalJSchema.g:460:4: rule__FormatTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormatTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatTypes"


    // $ANTLR start "rule__AbstractObject__Alternatives"
    // InternalJSchema.g:468:1: rule__AbstractObject__Alternatives : ( ( ruleMainObject ) | ( rulePrimitiveObject ) | ( ruleExtendedObject ) );
    public final void rule__AbstractObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:472:1: ( ( ruleMainObject ) | ( rulePrimitiveObject ) | ( ruleExtendedObject ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt2=2;
                    }
                    break;
                case 39:
                    {
                    alt2=3;
                    }
                    break;
                case 33:
                case 35:
                case 49:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA2_0>=40 && LA2_0<=41)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:473:2: ( ruleMainObject )
                    {
                    // InternalJSchema.g:473:2: ( ruleMainObject )
                    // InternalJSchema.g:474:3: ruleMainObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMainObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:479:2: ( rulePrimitiveObject )
                    {
                    // InternalJSchema.g:479:2: ( rulePrimitiveObject )
                    // InternalJSchema.g:480:3: rulePrimitiveObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:485:2: ( ruleExtendedObject )
                    {
                    // InternalJSchema.g:485:2: ( ruleExtendedObject )
                    // InternalJSchema.g:486:3: ruleExtendedObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getExtendedObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtendedObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getExtendedObjectParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractObject__Alternatives"


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // InternalJSchema.g:495:1: rule__PrimitiveTypes__Alternatives : ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:499:1: ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 41:
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
                    // InternalJSchema.g:500:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    {
                    // InternalJSchema.g:500:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    // InternalJSchema.g:501:3: ( rule__PrimitiveTypes__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:502:3: ( rule__PrimitiveTypes__Group_0__0 )
                    // InternalJSchema.g:502:4: rule__PrimitiveTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:506:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    {
                    // InternalJSchema.g:506:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    // InternalJSchema.g:507:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 
                    // InternalJSchema.g:508:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    // InternalJSchema.g:508:4: rule__PrimitiveTypes__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__ArrayAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:512:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    {
                    // InternalJSchema.g:512:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    // InternalJSchema.g:513:3: ( rule__PrimitiveTypes__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:514:3: ( rule__PrimitiveTypes__Group_2__0 )
                    // InternalJSchema.g:514:4: rule__PrimitiveTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimitiveTypes__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalJSchema.g:522:1: rule__Property__Alternatives : ( ( ( rule__Property__PropPrimAssignment_0 ) ) | ( ( rule__Property__PropObjAssignment_1 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:526:1: ( ( ( rule__Property__PropPrimAssignment_0 ) ) | ( ( rule__Property__PropObjAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=40 && LA4_0<=41)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==33||LA4_2==35||LA4_2==49) ) {
                    alt4=2;
                }
                else if ( (LA4_2==46) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:527:2: ( ( rule__Property__PropPrimAssignment_0 ) )
                    {
                    // InternalJSchema.g:527:2: ( ( rule__Property__PropPrimAssignment_0 ) )
                    // InternalJSchema.g:528:3: ( rule__Property__PropPrimAssignment_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getPropPrimAssignment_0()); 
                    // InternalJSchema.g:529:3: ( rule__Property__PropPrimAssignment_0 )
                    // InternalJSchema.g:529:4: rule__Property__PropPrimAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__PropPrimAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getPropPrimAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:533:2: ( ( rule__Property__PropObjAssignment_1 ) )
                    {
                    // InternalJSchema.g:533:2: ( ( rule__Property__PropObjAssignment_1 ) )
                    // InternalJSchema.g:534:3: ( rule__Property__PropObjAssignment_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getPropObjAssignment_1()); 
                    // InternalJSchema.g:535:3: ( rule__Property__PropObjAssignment_1 )
                    // InternalJSchema.g:535:4: rule__Property__PropObjAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__PropObjAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getPropObjAssignment_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__PrimitiveProperties__Alternatives"
    // InternalJSchema.g:543:1: rule__PrimitiveProperties__Alternatives : ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) );
    public final void rule__PrimitiveProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:547:1: ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJSchema.g:548:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    {
                    // InternalJSchema.g:548:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    // InternalJSchema.g:549:3: ( rule__PrimitiveProperties__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 
                    // InternalJSchema.g:550:3: ( rule__PrimitiveProperties__Group_0__0 )
                    // InternalJSchema.g:550:4: rule__PrimitiveProperties__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:554:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    {
                    // InternalJSchema.g:554:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    // InternalJSchema.g:555:3: ( rule__PrimitiveProperties__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 
                    // InternalJSchema.g:556:3: ( rule__PrimitiveProperties__Group_1__0 )
                    // InternalJSchema.g:556:4: rule__PrimitiveProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:560:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    {
                    // InternalJSchema.g:560:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    // InternalJSchema.g:561:3: ( rule__PrimitiveProperties__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 
                    // InternalJSchema.g:562:3: ( rule__PrimitiveProperties__Group_2__0 )
                    // InternalJSchema.g:562:4: rule__PrimitiveProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Alternatives"


    // $ANTLR start "rule__ArrayType__Alternatives"
    // InternalJSchema.g:570:1: rule__ArrayType__Alternatives : ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:574:1: ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:575:2: ( 'string' )
                    {
                    // InternalJSchema.g:575:2: ( 'string' )
                    // InternalJSchema.g:576:3: 'string'
                    {
                     before(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:581:2: ( 'integer' )
                    {
                    // InternalJSchema.g:581:2: ( 'integer' )
                    // InternalJSchema.g:582:3: 'integer'
                    {
                     before(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:587:2: ( 'float' )
                    {
                    // InternalJSchema.g:587:2: ( 'float' )
                    // InternalJSchema.g:588:3: 'float'
                    {
                     before(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:593:2: ( 'double' )
                    {
                    // InternalJSchema.g:593:2: ( 'double' )
                    // InternalJSchema.g:594:3: 'double'
                    {
                     before(grammarAccess.getArrayTypeAccess().getDoubleKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getDoubleKeyword_3()); 

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
    // $ANTLR end "rule__ArrayType__Alternatives"


    // $ANTLR start "rule__FormatTypes__Alternatives"
    // InternalJSchema.g:603:1: rule__FormatTypes__Alternatives : ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) );
    public final void rule__FormatTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:607:1: ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) )
            int alt7=17;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            case 22:
                {
                alt7=8;
                }
                break;
            case 23:
                {
                alt7=9;
                }
                break;
            case 24:
                {
                alt7=10;
                }
                break;
            case 25:
                {
                alt7=11;
                }
                break;
            case 26:
                {
                alt7=12;
                }
                break;
            case 27:
                {
                alt7=13;
                }
                break;
            case 28:
                {
                alt7=14;
                }
                break;
            case 29:
                {
                alt7=15;
                }
                break;
            case 30:
                {
                alt7=16;
                }
                break;
            case 31:
                {
                alt7=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:608:2: ( ( 'null' ) )
                    {
                    // InternalJSchema.g:608:2: ( ( 'null' ) )
                    // InternalJSchema.g:609:3: ( 'null' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // InternalJSchema.g:610:3: ( 'null' )
                    // InternalJSchema.g:610:4: 'null'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:614:2: ( ( 'date-time' ) )
                    {
                    // InternalJSchema.g:614:2: ( ( 'date-time' ) )
                    // InternalJSchema.g:615:3: ( 'date-time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 
                    // InternalJSchema.g:616:3: ( 'date-time' )
                    // InternalJSchema.g:616:4: 'date-time'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:620:2: ( ( 'time' ) )
                    {
                    // InternalJSchema.g:620:2: ( ( 'time' ) )
                    // InternalJSchema.g:621:3: ( 'time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 
                    // InternalJSchema.g:622:3: ( 'time' )
                    // InternalJSchema.g:622:4: 'time'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:626:2: ( ( 'date' ) )
                    {
                    // InternalJSchema.g:626:2: ( ( 'date' ) )
                    // InternalJSchema.g:627:3: ( 'date' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalJSchema.g:628:3: ( 'date' )
                    // InternalJSchema.g:628:4: 'date'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:632:2: ( ( 'email' ) )
                    {
                    // InternalJSchema.g:632:2: ( ( 'email' ) )
                    // InternalJSchema.g:633:3: ( 'email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 
                    // InternalJSchema.g:634:3: ( 'email' )
                    // InternalJSchema.g:634:4: 'email'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:638:2: ( ( 'idn-email' ) )
                    {
                    // InternalJSchema.g:638:2: ( ( 'idn-email' ) )
                    // InternalJSchema.g:639:3: ( 'idn-email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 
                    // InternalJSchema.g:640:3: ( 'idn-email' )
                    // InternalJSchema.g:640:4: 'idn-email'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:644:2: ( ( 'hostname' ) )
                    {
                    // InternalJSchema.g:644:2: ( ( 'hostname' ) )
                    // InternalJSchema.g:645:3: ( 'hostname' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 
                    // InternalJSchema.g:646:3: ( 'hostname' )
                    // InternalJSchema.g:646:4: 'hostname'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:650:2: ( ( 'ipv4' ) )
                    {
                    // InternalJSchema.g:650:2: ( ( 'ipv4' ) )
                    // InternalJSchema.g:651:3: ( 'ipv4' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 
                    // InternalJSchema.g:652:3: ( 'ipv4' )
                    // InternalJSchema.g:652:4: 'ipv4'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:656:2: ( ( 'ipv6' ) )
                    {
                    // InternalJSchema.g:656:2: ( ( 'ipv6' ) )
                    // InternalJSchema.g:657:3: ( 'ipv6' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 
                    // InternalJSchema.g:658:3: ( 'ipv6' )
                    // InternalJSchema.g:658:4: 'ipv6'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:662:2: ( ( 'uri' ) )
                    {
                    // InternalJSchema.g:662:2: ( ( 'uri' ) )
                    // InternalJSchema.g:663:3: ( 'uri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 
                    // InternalJSchema.g:664:3: ( 'uri' )
                    // InternalJSchema.g:664:4: 'uri'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:668:2: ( ( 'uri-reference' ) )
                    {
                    // InternalJSchema.g:668:2: ( ( 'uri-reference' ) )
                    // InternalJSchema.g:669:3: ( 'uri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 
                    // InternalJSchema.g:670:3: ( 'uri-reference' )
                    // InternalJSchema.g:670:4: 'uri-reference'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:674:2: ( ( 'iri' ) )
                    {
                    // InternalJSchema.g:674:2: ( ( 'iri' ) )
                    // InternalJSchema.g:675:3: ( 'iri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 
                    // InternalJSchema.g:676:3: ( 'iri' )
                    // InternalJSchema.g:676:4: 'iri'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:680:2: ( ( 'iri-reference' ) )
                    {
                    // InternalJSchema.g:680:2: ( ( 'iri-reference' ) )
                    // InternalJSchema.g:681:3: ( 'iri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 
                    // InternalJSchema.g:682:3: ( 'iri-reference' )
                    // InternalJSchema.g:682:4: 'iri-reference'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:686:2: ( ( 'uri-template' ) )
                    {
                    // InternalJSchema.g:686:2: ( ( 'uri-template' ) )
                    // InternalJSchema.g:687:3: ( 'uri-template' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 
                    // InternalJSchema.g:688:3: ( 'uri-template' )
                    // InternalJSchema.g:688:4: 'uri-template'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:692:2: ( ( 'json-pointer' ) )
                    {
                    // InternalJSchema.g:692:2: ( ( 'json-pointer' ) )
                    // InternalJSchema.g:693:3: ( 'json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 
                    // InternalJSchema.g:694:3: ( 'json-pointer' )
                    // InternalJSchema.g:694:4: 'json-pointer'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:698:2: ( ( 'relative-json-pointer' ) )
                    {
                    // InternalJSchema.g:698:2: ( ( 'relative-json-pointer' ) )
                    // InternalJSchema.g:699:3: ( 'relative-json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 
                    // InternalJSchema.g:700:3: ( 'relative-json-pointer' )
                    // InternalJSchema.g:700:4: 'relative-json-pointer'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:704:2: ( ( 'regex' ) )
                    {
                    // InternalJSchema.g:704:2: ( ( 'regex' ) )
                    // InternalJSchema.g:705:3: ( 'regex' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16()); 
                    // InternalJSchema.g:706:3: ( 'regex' )
                    // InternalJSchema.g:706:4: 'regex'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16()); 

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
    // $ANTLR end "rule__FormatTypes__Alternatives"


    // $ANTLR start "rule__Number__Group__0"
    // InternalJSchema.g:714:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:718:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSchema.g:719:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalJSchema.g:726:1: rule__Number__Group__0__Impl : ( ( rule__Number__NumberAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:730:1: ( ( ( rule__Number__NumberAssignment_0 ) ) )
            // InternalJSchema.g:731:1: ( ( rule__Number__NumberAssignment_0 ) )
            {
            // InternalJSchema.g:731:1: ( ( rule__Number__NumberAssignment_0 ) )
            // InternalJSchema.g:732:2: ( rule__Number__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment_0()); 
            // InternalJSchema.g:733:2: ( rule__Number__NumberAssignment_0 )
            // InternalJSchema.g:733:3: rule__Number__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalJSchema.g:741:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:745:1: ( rule__Number__Group__1__Impl )
            // InternalJSchema.g:746:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalJSchema.g:752:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:756:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalJSchema.g:757:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalJSchema.g:757:1: ( ( rule__Number__Group_1__0 )? )
            // InternalJSchema.g:758:2: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // InternalJSchema.g:759:2: ( rule__Number__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:759:3: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalJSchema.g:768:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:772:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalJSchema.g:773:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

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
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalJSchema.g:780:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:784:1: ( ( '.' ) )
            // InternalJSchema.g:785:1: ( '.' )
            {
            // InternalJSchema.g:785:1: ( '.' )
            // InternalJSchema.g:786:2: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalJSchema.g:795:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:799:1: ( rule__Number__Group_1__1__Impl )
            // InternalJSchema.g:800:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1__Impl();

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
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalJSchema.g:806:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__DecimalAssignment_1_1 ) ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:810:1: ( ( ( rule__Number__DecimalAssignment_1_1 ) ) )
            // InternalJSchema.g:811:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            {
            // InternalJSchema.g:811:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            // InternalJSchema.g:812:2: ( rule__Number__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 
            // InternalJSchema.g:813:2: ( rule__Number__DecimalAssignment_1_1 )
            // InternalJSchema.g:813:3: rule__Number__DecimalAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__DecimalAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__MainObject__Group__0"
    // InternalJSchema.g:822:1: rule__MainObject__Group__0 : rule__MainObject__Group__0__Impl rule__MainObject__Group__1 ;
    public final void rule__MainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:826:1: ( rule__MainObject__Group__0__Impl rule__MainObject__Group__1 )
            // InternalJSchema.g:827:2: rule__MainObject__Group__0__Impl rule__MainObject__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__1();

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
    // $ANTLR end "rule__MainObject__Group__0"


    // $ANTLR start "rule__MainObject__Group__0__Impl"
    // InternalJSchema.g:834:1: rule__MainObject__Group__0__Impl : ( ( rule__MainObject__ObjectNameAssignment_0 ) ) ;
    public final void rule__MainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:838:1: ( ( ( rule__MainObject__ObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:839:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:839:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            // InternalJSchema.g:840:2: ( rule__MainObject__ObjectNameAssignment_0 )
            {
             before(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0()); 
            // InternalJSchema.g:841:2: ( rule__MainObject__ObjectNameAssignment_0 )
            // InternalJSchema.g:841:3: rule__MainObject__ObjectNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__ObjectNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__0__Impl"


    // $ANTLR start "rule__MainObject__Group__1"
    // InternalJSchema.g:849:1: rule__MainObject__Group__1 : rule__MainObject__Group__1__Impl rule__MainObject__Group__2 ;
    public final void rule__MainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:853:1: ( rule__MainObject__Group__1__Impl rule__MainObject__Group__2 )
            // InternalJSchema.g:854:2: rule__MainObject__Group__1__Impl rule__MainObject__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__2();

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
    // $ANTLR end "rule__MainObject__Group__1"


    // $ANTLR start "rule__MainObject__Group__1__Impl"
    // InternalJSchema.g:861:1: rule__MainObject__Group__1__Impl : ( ( rule__MainObject__RootAssignment_1 )? ) ;
    public final void rule__MainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:865:1: ( ( ( rule__MainObject__RootAssignment_1 )? ) )
            // InternalJSchema.g:866:1: ( ( rule__MainObject__RootAssignment_1 )? )
            {
            // InternalJSchema.g:866:1: ( ( rule__MainObject__RootAssignment_1 )? )
            // InternalJSchema.g:867:2: ( rule__MainObject__RootAssignment_1 )?
            {
             before(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 
            // InternalJSchema.g:868:2: ( rule__MainObject__RootAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==49) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:868:3: rule__MainObject__RootAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__RootAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__1__Impl"


    // $ANTLR start "rule__MainObject__Group__2"
    // InternalJSchema.g:876:1: rule__MainObject__Group__2 : rule__MainObject__Group__2__Impl rule__MainObject__Group__3 ;
    public final void rule__MainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:880:1: ( rule__MainObject__Group__2__Impl rule__MainObject__Group__3 )
            // InternalJSchema.g:881:2: rule__MainObject__Group__2__Impl rule__MainObject__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__3();

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
    // $ANTLR end "rule__MainObject__Group__2"


    // $ANTLR start "rule__MainObject__Group__2__Impl"
    // InternalJSchema.g:888:1: rule__MainObject__Group__2__Impl : ( ( rule__MainObject__Group_2__0 )? ) ;
    public final void rule__MainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:892:1: ( ( ( rule__MainObject__Group_2__0 )? ) )
            // InternalJSchema.g:893:1: ( ( rule__MainObject__Group_2__0 )? )
            {
            // InternalJSchema.g:893:1: ( ( rule__MainObject__Group_2__0 )? )
            // InternalJSchema.g:894:2: ( rule__MainObject__Group_2__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_2()); 
            // InternalJSchema.g:895:2: ( rule__MainObject__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:895:3: rule__MainObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__2__Impl"


    // $ANTLR start "rule__MainObject__Group__3"
    // InternalJSchema.g:903:1: rule__MainObject__Group__3 : rule__MainObject__Group__3__Impl rule__MainObject__Group__4 ;
    public final void rule__MainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:907:1: ( rule__MainObject__Group__3__Impl rule__MainObject__Group__4 )
            // InternalJSchema.g:908:2: rule__MainObject__Group__3__Impl rule__MainObject__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MainObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__4();

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
    // $ANTLR end "rule__MainObject__Group__3"


    // $ANTLR start "rule__MainObject__Group__3__Impl"
    // InternalJSchema.g:915:1: rule__MainObject__Group__3__Impl : ( '{' ) ;
    public final void rule__MainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:919:1: ( ( '{' ) )
            // InternalJSchema.g:920:1: ( '{' )
            {
            // InternalJSchema.g:920:1: ( '{' )
            // InternalJSchema.g:921:2: '{'
            {
             before(grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__3__Impl"


    // $ANTLR start "rule__MainObject__Group__4"
    // InternalJSchema.g:930:1: rule__MainObject__Group__4 : rule__MainObject__Group__4__Impl rule__MainObject__Group__5 ;
    public final void rule__MainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:934:1: ( rule__MainObject__Group__4__Impl rule__MainObject__Group__5 )
            // InternalJSchema.g:935:2: rule__MainObject__Group__4__Impl rule__MainObject__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MainObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__5();

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
    // $ANTLR end "rule__MainObject__Group__4"


    // $ANTLR start "rule__MainObject__Group__4__Impl"
    // InternalJSchema.g:942:1: rule__MainObject__Group__4__Impl : ( ( rule__MainObject__Group_4__0 )? ) ;
    public final void rule__MainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:946:1: ( ( ( rule__MainObject__Group_4__0 )? ) )
            // InternalJSchema.g:947:1: ( ( rule__MainObject__Group_4__0 )? )
            {
            // InternalJSchema.g:947:1: ( ( rule__MainObject__Group_4__0 )? )
            // InternalJSchema.g:948:2: ( rule__MainObject__Group_4__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4()); 
            // InternalJSchema.g:949:2: ( rule__MainObject__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=40 && LA11_0<=41)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:949:3: rule__MainObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__4__Impl"


    // $ANTLR start "rule__MainObject__Group__5"
    // InternalJSchema.g:957:1: rule__MainObject__Group__5 : rule__MainObject__Group__5__Impl ;
    public final void rule__MainObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:961:1: ( rule__MainObject__Group__5__Impl )
            // InternalJSchema.g:962:2: rule__MainObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group__5__Impl();

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
    // $ANTLR end "rule__MainObject__Group__5"


    // $ANTLR start "rule__MainObject__Group__5__Impl"
    // InternalJSchema.g:968:1: rule__MainObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MainObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:972:1: ( ( '}' ) )
            // InternalJSchema.g:973:1: ( '}' )
            {
            // InternalJSchema.g:973:1: ( '}' )
            // InternalJSchema.g:974:2: '}'
            {
             before(grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__5__Impl"


    // $ANTLR start "rule__MainObject__Group_2__0"
    // InternalJSchema.g:984:1: rule__MainObject__Group_2__0 : rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 ;
    public final void rule__MainObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:988:1: ( rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 )
            // InternalJSchema.g:989:2: rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__MainObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_2__1();

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
    // $ANTLR end "rule__MainObject__Group_2__0"


    // $ANTLR start "rule__MainObject__Group_2__0__Impl"
    // InternalJSchema.g:996:1: rule__MainObject__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__MainObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1000:1: ( ( 'includes' ) )
            // InternalJSchema.g:1001:1: ( 'includes' )
            {
            // InternalJSchema.g:1001:1: ( 'includes' )
            // InternalJSchema.g:1002:2: 'includes'
            {
             before(grammarAccess.getMainObjectAccess().getIncludesKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getIncludesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_2__0__Impl"


    // $ANTLR start "rule__MainObject__Group_2__1"
    // InternalJSchema.g:1011:1: rule__MainObject__Group_2__1 : rule__MainObject__Group_2__1__Impl ;
    public final void rule__MainObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1015:1: ( rule__MainObject__Group_2__1__Impl )
            // InternalJSchema.g:1016:2: rule__MainObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_2__1"


    // $ANTLR start "rule__MainObject__Group_2__1__Impl"
    // InternalJSchema.g:1022:1: rule__MainObject__Group_2__1__Impl : ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) ;
    public final void rule__MainObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1026:1: ( ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) )
            // InternalJSchema.g:1027:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            {
            // InternalJSchema.g:1027:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            // InternalJSchema.g:1028:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            {
             before(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1()); 
            // InternalJSchema.g:1029:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            // InternalJSchema.g:1029:3: rule__MainObject__IncludeObjectsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__IncludeObjectsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_2__1__Impl"


    // $ANTLR start "rule__MainObject__Group_4__0"
    // InternalJSchema.g:1038:1: rule__MainObject__Group_4__0 : rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 ;
    public final void rule__MainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1042:1: ( rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 )
            // InternalJSchema.g:1043:2: rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__MainObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4__1();

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
    // $ANTLR end "rule__MainObject__Group_4__0"


    // $ANTLR start "rule__MainObject__Group_4__0__Impl"
    // InternalJSchema.g:1050:1: rule__MainObject__Group_4__0__Impl : ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) ;
    public final void rule__MainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1054:1: ( ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) )
            // InternalJSchema.g:1055:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            {
            // InternalJSchema.g:1055:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            // InternalJSchema.g:1056:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 
            // InternalJSchema.g:1057:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            // InternalJSchema.g:1057:3: rule__MainObject__PropertiesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__PropertiesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4__0__Impl"


    // $ANTLR start "rule__MainObject__Group_4__1"
    // InternalJSchema.g:1065:1: rule__MainObject__Group_4__1 : rule__MainObject__Group_4__1__Impl ;
    public final void rule__MainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1069:1: ( rule__MainObject__Group_4__1__Impl )
            // InternalJSchema.g:1070:2: rule__MainObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_4__1"


    // $ANTLR start "rule__MainObject__Group_4__1__Impl"
    // InternalJSchema.g:1076:1: rule__MainObject__Group_4__1__Impl : ( ( rule__MainObject__Group_4_1__0 )* ) ;
    public final void rule__MainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1080:1: ( ( ( rule__MainObject__Group_4_1__0 )* ) )
            // InternalJSchema.g:1081:1: ( ( rule__MainObject__Group_4_1__0 )* )
            {
            // InternalJSchema.g:1081:1: ( ( rule__MainObject__Group_4_1__0 )* )
            // InternalJSchema.g:1082:2: ( rule__MainObject__Group_4_1__0 )*
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4_1()); 
            // InternalJSchema.g:1083:2: ( rule__MainObject__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJSchema.g:1083:3: rule__MainObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMainObjectAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4__1__Impl"


    // $ANTLR start "rule__MainObject__Group_4_1__0"
    // InternalJSchema.g:1092:1: rule__MainObject__Group_4_1__0 : rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 ;
    public final void rule__MainObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1096:1: ( rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 )
            // InternalJSchema.g:1097:2: rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MainObject__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4_1__1();

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
    // $ANTLR end "rule__MainObject__Group_4_1__0"


    // $ANTLR start "rule__MainObject__Group_4_1__0__Impl"
    // InternalJSchema.g:1104:1: rule__MainObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MainObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1108:1: ( ( ',' ) )
            // InternalJSchema.g:1109:1: ( ',' )
            {
            // InternalJSchema.g:1109:1: ( ',' )
            // InternalJSchema.g:1110:2: ','
            {
             before(grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4_1__0__Impl"


    // $ANTLR start "rule__MainObject__Group_4_1__1"
    // InternalJSchema.g:1119:1: rule__MainObject__Group_4_1__1 : rule__MainObject__Group_4_1__1__Impl ;
    public final void rule__MainObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1123:1: ( rule__MainObject__Group_4_1__1__Impl )
            // InternalJSchema.g:1124:2: rule__MainObject__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_4_1__1"


    // $ANTLR start "rule__MainObject__Group_4_1__1__Impl"
    // InternalJSchema.g:1130:1: rule__MainObject__Group_4_1__1__Impl : ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) ;
    public final void rule__MainObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1134:1: ( ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) )
            // InternalJSchema.g:1135:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            {
            // InternalJSchema.g:1135:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            // InternalJSchema.g:1136:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 
            // InternalJSchema.g:1137:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            // InternalJSchema.g:1137:3: rule__MainObject__PropertiesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__PropertiesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4_1__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__0"
    // InternalJSchema.g:1146:1: rule__PrimitiveObject__Group__0 : rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 ;
    public final void rule__PrimitiveObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1150:1: ( rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 )
            // InternalJSchema.g:1151:2: rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimitiveObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group__0"


    // $ANTLR start "rule__PrimitiveObject__Group__0__Impl"
    // InternalJSchema.g:1158:1: rule__PrimitiveObject__Group__0__Impl : ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1162:1: ( ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) )
            // InternalJSchema.g:1163:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            {
            // InternalJSchema.g:1163:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            // InternalJSchema.g:1164:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 
            // InternalJSchema.g:1165:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            // InternalJSchema.g:1165:3: rule__PrimitiveObject__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__1"
    // InternalJSchema.g:1173:1: rule__PrimitiveObject__Group__1 : rule__PrimitiveObject__Group__1__Impl ;
    public final void rule__PrimitiveObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1177:1: ( rule__PrimitiveObject__Group__1__Impl )
            // InternalJSchema.g:1178:2: rule__PrimitiveObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__1__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group__1"


    // $ANTLR start "rule__PrimitiveObject__Group__1__Impl"
    // InternalJSchema.g:1184:1: rule__PrimitiveObject__Group__1__Impl : ( ( rule__PrimitiveObject__Group_1__0 )? ) ;
    public final void rule__PrimitiveObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1188:1: ( ( ( rule__PrimitiveObject__Group_1__0 )? ) )
            // InternalJSchema.g:1189:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            {
            // InternalJSchema.g:1189:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            // InternalJSchema.g:1190:2: ( rule__PrimitiveObject__Group_1__0 )?
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 
            // InternalJSchema.g:1191:2: ( rule__PrimitiveObject__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:1191:3: rule__PrimitiveObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__0"
    // InternalJSchema.g:1200:1: rule__PrimitiveObject__Group_1__0 : rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 ;
    public final void rule__PrimitiveObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1204:1: ( rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 )
            // InternalJSchema.g:1205:2: rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__PrimitiveObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__0"


    // $ANTLR start "rule__PrimitiveObject__Group_1__0__Impl"
    // InternalJSchema.g:1212:1: rule__PrimitiveObject__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__PrimitiveObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1216:1: ( ( 'with' ) )
            // InternalJSchema.g:1217:1: ( 'with' )
            {
            // InternalJSchema.g:1217:1: ( 'with' )
            // InternalJSchema.g:1218:2: 'with'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__1"
    // InternalJSchema.g:1227:1: rule__PrimitiveObject__Group_1__1 : rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 ;
    public final void rule__PrimitiveObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1231:1: ( rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 )
            // InternalJSchema.g:1232:2: rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__PrimitiveObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__2();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__1"


    // $ANTLR start "rule__PrimitiveObject__Group_1__1__Impl"
    // InternalJSchema.g:1239:1: rule__PrimitiveObject__Group_1__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1243:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) )
            // InternalJSchema.g:1244:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            {
            // InternalJSchema.g:1244:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            // InternalJSchema.g:1245:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 
            // InternalJSchema.g:1246:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            // InternalJSchema.g:1246:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__2"
    // InternalJSchema.g:1254:1: rule__PrimitiveObject__Group_1__2 : rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 ;
    public final void rule__PrimitiveObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1258:1: ( rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 )
            // InternalJSchema.g:1259:2: rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__PrimitiveObject__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__3();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__2"


    // $ANTLR start "rule__PrimitiveObject__Group_1__2__Impl"
    // InternalJSchema.g:1266:1: rule__PrimitiveObject__Group_1__2__Impl : ( ( rule__PrimitiveObject__Group_1_2__0 )* ) ;
    public final void rule__PrimitiveObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1270:1: ( ( ( rule__PrimitiveObject__Group_1_2__0 )* ) )
            // InternalJSchema.g:1271:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            {
            // InternalJSchema.g:1271:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            // InternalJSchema.g:1272:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 
            // InternalJSchema.g:1273:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:1273:3: rule__PrimitiveObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrimitiveObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1__2__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__3"
    // InternalJSchema.g:1281:1: rule__PrimitiveObject__Group_1__3 : rule__PrimitiveObject__Group_1__3__Impl ;
    public final void rule__PrimitiveObject__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1285:1: ( rule__PrimitiveObject__Group_1__3__Impl )
            // InternalJSchema.g:1286:2: rule__PrimitiveObject__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__3__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__3"


    // $ANTLR start "rule__PrimitiveObject__Group_1__3__Impl"
    // InternalJSchema.g:1292:1: rule__PrimitiveObject__Group_1__3__Impl : ( ';' ) ;
    public final void rule__PrimitiveObject__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1296:1: ( ( ';' ) )
            // InternalJSchema.g:1297:1: ( ';' )
            {
            // InternalJSchema.g:1297:1: ( ';' )
            // InternalJSchema.g:1298:2: ';'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1__3__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__0"
    // InternalJSchema.g:1308:1: rule__PrimitiveObject__Group_1_2__0 : rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 ;
    public final void rule__PrimitiveObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1312:1: ( rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 )
            // InternalJSchema.g:1313:2: rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1
            {
            pushFollow(FOLLOW_13);
            rule__PrimitiveObject__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1_2__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__0"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__0__Impl"
    // InternalJSchema.g:1320:1: rule__PrimitiveObject__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1324:1: ( ( ',' ) )
            // InternalJSchema.g:1325:1: ( ',' )
            {
            // InternalJSchema.g:1325:1: ( ',' )
            // InternalJSchema.g:1326:2: ','
            {
             before(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__1"
    // InternalJSchema.g:1335:1: rule__PrimitiveObject__Group_1_2__1 : rule__PrimitiveObject__Group_1_2__1__Impl ;
    public final void rule__PrimitiveObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1339:1: ( rule__PrimitiveObject__Group_1_2__1__Impl )
            // InternalJSchema.g:1340:2: rule__PrimitiveObject__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__1"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__1__Impl"
    // InternalJSchema.g:1346:1: rule__PrimitiveObject__Group_1_2__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1350:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) )
            // InternalJSchema.g:1351:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            {
            // InternalJSchema.g:1351:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            // InternalJSchema.g:1352:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 
            // InternalJSchema.g:1353:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            // InternalJSchema.g:1353:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__0"
    // InternalJSchema.g:1362:1: rule__ExtendedObject__Group__0 : rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1 ;
    public final void rule__ExtendedObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1366:1: ( rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1 )
            // InternalJSchema.g:1367:2: rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ExtendedObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__1();

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
    // $ANTLR end "rule__ExtendedObject__Group__0"


    // $ANTLR start "rule__ExtendedObject__Group__0__Impl"
    // InternalJSchema.g:1374:1: rule__ExtendedObject__Group__0__Impl : ( ( rule__ExtendedObject__ExObjectNameAssignment_0 ) ) ;
    public final void rule__ExtendedObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1378:1: ( ( ( rule__ExtendedObject__ExObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:1379:1: ( ( rule__ExtendedObject__ExObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:1379:1: ( ( rule__ExtendedObject__ExObjectNameAssignment_0 ) )
            // InternalJSchema.g:1380:2: ( rule__ExtendedObject__ExObjectNameAssignment_0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getExObjectNameAssignment_0()); 
            // InternalJSchema.g:1381:2: ( rule__ExtendedObject__ExObjectNameAssignment_0 )
            // InternalJSchema.g:1381:3: rule__ExtendedObject__ExObjectNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__ExObjectNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getExObjectNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__1"
    // InternalJSchema.g:1389:1: rule__ExtendedObject__Group__1 : rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2 ;
    public final void rule__ExtendedObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1393:1: ( rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2 )
            // InternalJSchema.g:1394:2: rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExtendedObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__2();

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
    // $ANTLR end "rule__ExtendedObject__Group__1"


    // $ANTLR start "rule__ExtendedObject__Group__1__Impl"
    // InternalJSchema.g:1401:1: rule__ExtendedObject__Group__1__Impl : ( 'extends' ) ;
    public final void rule__ExtendedObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1405:1: ( ( 'extends' ) )
            // InternalJSchema.g:1406:1: ( 'extends' )
            {
            // InternalJSchema.g:1406:1: ( 'extends' )
            // InternalJSchema.g:1407:2: 'extends'
            {
             before(grammarAccess.getExtendedObjectAccess().getExtendsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getExtendsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__2"
    // InternalJSchema.g:1416:1: rule__ExtendedObject__Group__2 : rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3 ;
    public final void rule__ExtendedObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1420:1: ( rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3 )
            // InternalJSchema.g:1421:2: rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ExtendedObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__3();

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
    // $ANTLR end "rule__ExtendedObject__Group__2"


    // $ANTLR start "rule__ExtendedObject__Group__2__Impl"
    // InternalJSchema.g:1428:1: rule__ExtendedObject__Group__2__Impl : ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) ) ;
    public final void rule__ExtendedObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1432:1: ( ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) ) )
            // InternalJSchema.g:1433:1: ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) )
            {
            // InternalJSchema.g:1433:1: ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) )
            // InternalJSchema.g:1434:2: ( rule__ExtendedObject__ExtendsIDAssignment_2 )
            {
             before(grammarAccess.getExtendedObjectAccess().getExtendsIDAssignment_2()); 
            // InternalJSchema.g:1435:2: ( rule__ExtendedObject__ExtendsIDAssignment_2 )
            // InternalJSchema.g:1435:3: rule__ExtendedObject__ExtendsIDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__ExtendsIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getExtendsIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__2__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__3"
    // InternalJSchema.g:1443:1: rule__ExtendedObject__Group__3 : rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4 ;
    public final void rule__ExtendedObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1447:1: ( rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4 )
            // InternalJSchema.g:1448:2: rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ExtendedObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__4();

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
    // $ANTLR end "rule__ExtendedObject__Group__3"


    // $ANTLR start "rule__ExtendedObject__Group__3__Impl"
    // InternalJSchema.g:1455:1: rule__ExtendedObject__Group__3__Impl : ( ( rule__ExtendedObject__Group_3__0 )? ) ;
    public final void rule__ExtendedObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1459:1: ( ( ( rule__ExtendedObject__Group_3__0 )? ) )
            // InternalJSchema.g:1460:1: ( ( rule__ExtendedObject__Group_3__0 )? )
            {
            // InternalJSchema.g:1460:1: ( ( rule__ExtendedObject__Group_3__0 )? )
            // InternalJSchema.g:1461:2: ( rule__ExtendedObject__Group_3__0 )?
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup_3()); 
            // InternalJSchema.g:1462:2: ( rule__ExtendedObject__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJSchema.g:1462:3: rule__ExtendedObject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__3__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__4"
    // InternalJSchema.g:1470:1: rule__ExtendedObject__Group__4 : rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5 ;
    public final void rule__ExtendedObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1474:1: ( rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5 )
            // InternalJSchema.g:1475:2: rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ExtendedObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__5();

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
    // $ANTLR end "rule__ExtendedObject__Group__4"


    // $ANTLR start "rule__ExtendedObject__Group__4__Impl"
    // InternalJSchema.g:1482:1: rule__ExtendedObject__Group__4__Impl : ( '{' ) ;
    public final void rule__ExtendedObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1486:1: ( ( '{' ) )
            // InternalJSchema.g:1487:1: ( '{' )
            {
            // InternalJSchema.g:1487:1: ( '{' )
            // InternalJSchema.g:1488:2: '{'
            {
             before(grammarAccess.getExtendedObjectAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__4__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__5"
    // InternalJSchema.g:1497:1: rule__ExtendedObject__Group__5 : rule__ExtendedObject__Group__5__Impl rule__ExtendedObject__Group__6 ;
    public final void rule__ExtendedObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1501:1: ( rule__ExtendedObject__Group__5__Impl rule__ExtendedObject__Group__6 )
            // InternalJSchema.g:1502:2: rule__ExtendedObject__Group__5__Impl rule__ExtendedObject__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ExtendedObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__6();

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
    // $ANTLR end "rule__ExtendedObject__Group__5"


    // $ANTLR start "rule__ExtendedObject__Group__5__Impl"
    // InternalJSchema.g:1509:1: rule__ExtendedObject__Group__5__Impl : ( ( rule__ExtendedObject__Group_5__0 )? ) ;
    public final void rule__ExtendedObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1513:1: ( ( ( rule__ExtendedObject__Group_5__0 )? ) )
            // InternalJSchema.g:1514:1: ( ( rule__ExtendedObject__Group_5__0 )? )
            {
            // InternalJSchema.g:1514:1: ( ( rule__ExtendedObject__Group_5__0 )? )
            // InternalJSchema.g:1515:2: ( rule__ExtendedObject__Group_5__0 )?
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup_5()); 
            // InternalJSchema.g:1516:2: ( rule__ExtendedObject__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=40 && LA16_0<=41)||LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJSchema.g:1516:3: rule__ExtendedObject__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__5__Impl"


    // $ANTLR start "rule__ExtendedObject__Group__6"
    // InternalJSchema.g:1524:1: rule__ExtendedObject__Group__6 : rule__ExtendedObject__Group__6__Impl ;
    public final void rule__ExtendedObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1528:1: ( rule__ExtendedObject__Group__6__Impl )
            // InternalJSchema.g:1529:2: rule__ExtendedObject__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__6__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group__6"


    // $ANTLR start "rule__ExtendedObject__Group__6__Impl"
    // InternalJSchema.g:1535:1: rule__ExtendedObject__Group__6__Impl : ( '}' ) ;
    public final void rule__ExtendedObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1539:1: ( ( '}' ) )
            // InternalJSchema.g:1540:1: ( '}' )
            {
            // InternalJSchema.g:1540:1: ( '}' )
            // InternalJSchema.g:1541:2: '}'
            {
             before(grammarAccess.getExtendedObjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group__6__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_3__0"
    // InternalJSchema.g:1551:1: rule__ExtendedObject__Group_3__0 : rule__ExtendedObject__Group_3__0__Impl rule__ExtendedObject__Group_3__1 ;
    public final void rule__ExtendedObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1555:1: ( rule__ExtendedObject__Group_3__0__Impl rule__ExtendedObject__Group_3__1 )
            // InternalJSchema.g:1556:2: rule__ExtendedObject__Group_3__0__Impl rule__ExtendedObject__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ExtendedObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_3__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_3__0"


    // $ANTLR start "rule__ExtendedObject__Group_3__0__Impl"
    // InternalJSchema.g:1563:1: rule__ExtendedObject__Group_3__0__Impl : ( 'includes' ) ;
    public final void rule__ExtendedObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1567:1: ( ( 'includes' ) )
            // InternalJSchema.g:1568:1: ( 'includes' )
            {
            // InternalJSchema.g:1568:1: ( 'includes' )
            // InternalJSchema.g:1569:2: 'includes'
            {
             before(grammarAccess.getExtendedObjectAccess().getIncludesKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getIncludesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_3__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_3__1"
    // InternalJSchema.g:1578:1: rule__ExtendedObject__Group_3__1 : rule__ExtendedObject__Group_3__1__Impl ;
    public final void rule__ExtendedObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1582:1: ( rule__ExtendedObject__Group_3__1__Impl )
            // InternalJSchema.g:1583:2: rule__ExtendedObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_3__1"


    // $ANTLR start "rule__ExtendedObject__Group_3__1__Impl"
    // InternalJSchema.g:1589:1: rule__ExtendedObject__Group_3__1__Impl : ( ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 ) ) ;
    public final void rule__ExtendedObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1593:1: ( ( ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 ) ) )
            // InternalJSchema.g:1594:1: ( ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 ) )
            {
            // InternalJSchema.g:1594:1: ( ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 ) )
            // InternalJSchema.g:1595:2: ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 )
            {
             before(grammarAccess.getExtendedObjectAccess().getIncludeObjectsAssignment_3_1()); 
            // InternalJSchema.g:1596:2: ( rule__ExtendedObject__IncludeObjectsAssignment_3_1 )
            // InternalJSchema.g:1596:3: rule__ExtendedObject__IncludeObjectsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__IncludeObjectsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getIncludeObjectsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_3__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_5__0"
    // InternalJSchema.g:1605:1: rule__ExtendedObject__Group_5__0 : rule__ExtendedObject__Group_5__0__Impl rule__ExtendedObject__Group_5__1 ;
    public final void rule__ExtendedObject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1609:1: ( rule__ExtendedObject__Group_5__0__Impl rule__ExtendedObject__Group_5__1 )
            // InternalJSchema.g:1610:2: rule__ExtendedObject__Group_5__0__Impl rule__ExtendedObject__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ExtendedObject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_5__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_5__0"


    // $ANTLR start "rule__ExtendedObject__Group_5__0__Impl"
    // InternalJSchema.g:1617:1: rule__ExtendedObject__Group_5__0__Impl : ( ( rule__ExtendedObject__BodyAssignment_5_0 ) ) ;
    public final void rule__ExtendedObject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1621:1: ( ( ( rule__ExtendedObject__BodyAssignment_5_0 ) ) )
            // InternalJSchema.g:1622:1: ( ( rule__ExtendedObject__BodyAssignment_5_0 ) )
            {
            // InternalJSchema.g:1622:1: ( ( rule__ExtendedObject__BodyAssignment_5_0 ) )
            // InternalJSchema.g:1623:2: ( rule__ExtendedObject__BodyAssignment_5_0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getBodyAssignment_5_0()); 
            // InternalJSchema.g:1624:2: ( rule__ExtendedObject__BodyAssignment_5_0 )
            // InternalJSchema.g:1624:3: rule__ExtendedObject__BodyAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__BodyAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getBodyAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_5__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_5__1"
    // InternalJSchema.g:1632:1: rule__ExtendedObject__Group_5__1 : rule__ExtendedObject__Group_5__1__Impl ;
    public final void rule__ExtendedObject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1636:1: ( rule__ExtendedObject__Group_5__1__Impl )
            // InternalJSchema.g:1637:2: rule__ExtendedObject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_5__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_5__1"


    // $ANTLR start "rule__ExtendedObject__Group_5__1__Impl"
    // InternalJSchema.g:1643:1: rule__ExtendedObject__Group_5__1__Impl : ( ( rule__ExtendedObject__Group_5_1__0 )* ) ;
    public final void rule__ExtendedObject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1647:1: ( ( ( rule__ExtendedObject__Group_5_1__0 )* ) )
            // InternalJSchema.g:1648:1: ( ( rule__ExtendedObject__Group_5_1__0 )* )
            {
            // InternalJSchema.g:1648:1: ( ( rule__ExtendedObject__Group_5_1__0 )* )
            // InternalJSchema.g:1649:2: ( rule__ExtendedObject__Group_5_1__0 )*
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup_5_1()); 
            // InternalJSchema.g:1650:2: ( rule__ExtendedObject__Group_5_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJSchema.g:1650:3: rule__ExtendedObject__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ExtendedObject__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExtendedObjectAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_5__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_5_1__0"
    // InternalJSchema.g:1659:1: rule__ExtendedObject__Group_5_1__0 : rule__ExtendedObject__Group_5_1__0__Impl rule__ExtendedObject__Group_5_1__1 ;
    public final void rule__ExtendedObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1663:1: ( rule__ExtendedObject__Group_5_1__0__Impl rule__ExtendedObject__Group_5_1__1 )
            // InternalJSchema.g:1664:2: rule__ExtendedObject__Group_5_1__0__Impl rule__ExtendedObject__Group_5_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtendedObject__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_5_1__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_5_1__0"


    // $ANTLR start "rule__ExtendedObject__Group_5_1__0__Impl"
    // InternalJSchema.g:1671:1: rule__ExtendedObject__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ExtendedObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1675:1: ( ( ',' ) )
            // InternalJSchema.g:1676:1: ( ',' )
            {
            // InternalJSchema.g:1676:1: ( ',' )
            // InternalJSchema.g:1677:2: ','
            {
             before(grammarAccess.getExtendedObjectAccess().getCommaKeyword_5_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_5_1__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_5_1__1"
    // InternalJSchema.g:1686:1: rule__ExtendedObject__Group_5_1__1 : rule__ExtendedObject__Group_5_1__1__Impl ;
    public final void rule__ExtendedObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1690:1: ( rule__ExtendedObject__Group_5_1__1__Impl )
            // InternalJSchema.g:1691:2: rule__ExtendedObject__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_5_1__1"


    // $ANTLR start "rule__ExtendedObject__Group_5_1__1__Impl"
    // InternalJSchema.g:1697:1: rule__ExtendedObject__Group_5_1__1__Impl : ( ( rule__ExtendedObject__BodyAssignment_5_1_1 ) ) ;
    public final void rule__ExtendedObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1701:1: ( ( ( rule__ExtendedObject__BodyAssignment_5_1_1 ) ) )
            // InternalJSchema.g:1702:1: ( ( rule__ExtendedObject__BodyAssignment_5_1_1 ) )
            {
            // InternalJSchema.g:1702:1: ( ( rule__ExtendedObject__BodyAssignment_5_1_1 ) )
            // InternalJSchema.g:1703:2: ( rule__ExtendedObject__BodyAssignment_5_1_1 )
            {
             before(grammarAccess.getExtendedObjectAccess().getBodyAssignment_5_1_1()); 
            // InternalJSchema.g:1704:2: ( rule__ExtendedObject__BodyAssignment_5_1_1 )
            // InternalJSchema.g:1704:3: rule__ExtendedObject__BodyAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__BodyAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getBodyAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_5_1__1__Impl"


    // $ANTLR start "rule__ExtendedProperties__Group__0"
    // InternalJSchema.g:1713:1: rule__ExtendedProperties__Group__0 : rule__ExtendedProperties__Group__0__Impl rule__ExtendedProperties__Group__1 ;
    public final void rule__ExtendedProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1717:1: ( rule__ExtendedProperties__Group__0__Impl rule__ExtendedProperties__Group__1 )
            // InternalJSchema.g:1718:2: rule__ExtendedProperties__Group__0__Impl rule__ExtendedProperties__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtendedProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedProperties__Group__1();

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
    // $ANTLR end "rule__ExtendedProperties__Group__0"


    // $ANTLR start "rule__ExtendedProperties__Group__0__Impl"
    // InternalJSchema.g:1725:1: rule__ExtendedProperties__Group__0__Impl : ( ( rule__ExtendedProperties__OverrideAssignment_0 )? ) ;
    public final void rule__ExtendedProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1729:1: ( ( ( rule__ExtendedProperties__OverrideAssignment_0 )? ) )
            // InternalJSchema.g:1730:1: ( ( rule__ExtendedProperties__OverrideAssignment_0 )? )
            {
            // InternalJSchema.g:1730:1: ( ( rule__ExtendedProperties__OverrideAssignment_0 )? )
            // InternalJSchema.g:1731:2: ( rule__ExtendedProperties__OverrideAssignment_0 )?
            {
             before(grammarAccess.getExtendedPropertiesAccess().getOverrideAssignment_0()); 
            // InternalJSchema.g:1732:2: ( rule__ExtendedProperties__OverrideAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJSchema.g:1732:3: rule__ExtendedProperties__OverrideAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedProperties__OverrideAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedPropertiesAccess().getOverrideAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedProperties__Group__0__Impl"


    // $ANTLR start "rule__ExtendedProperties__Group__1"
    // InternalJSchema.g:1740:1: rule__ExtendedProperties__Group__1 : rule__ExtendedProperties__Group__1__Impl ;
    public final void rule__ExtendedProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1744:1: ( rule__ExtendedProperties__Group__1__Impl )
            // InternalJSchema.g:1745:2: rule__ExtendedProperties__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedProperties__Group__1__Impl();

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
    // $ANTLR end "rule__ExtendedProperties__Group__1"


    // $ANTLR start "rule__ExtendedProperties__Group__1__Impl"
    // InternalJSchema.g:1751:1: rule__ExtendedProperties__Group__1__Impl : ( ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 ) ) ;
    public final void rule__ExtendedProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1755:1: ( ( ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 ) ) )
            // InternalJSchema.g:1756:1: ( ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 ) )
            {
            // InternalJSchema.g:1756:1: ( ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 ) )
            // InternalJSchema.g:1757:2: ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 )
            {
             before(grammarAccess.getExtendedPropertiesAccess().getExtendedPropertiesAssignment_1()); 
            // InternalJSchema.g:1758:2: ( rule__ExtendedProperties__ExtendedPropertiesAssignment_1 )
            // InternalJSchema.g:1758:3: rule__ExtendedProperties__ExtendedPropertiesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedProperties__ExtendedPropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedPropertiesAccess().getExtendedPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedProperties__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__0"
    // InternalJSchema.g:1767:1: rule__PrimitiveTypes__Group_0__0 : rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 ;
    public final void rule__PrimitiveTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1771:1: ( rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 )
            // InternalJSchema.g:1772:2: rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__0"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__0__Impl"
    // InternalJSchema.g:1779:1: rule__PrimitiveTypes__Group_0__0__Impl : ( 'String' ) ;
    public final void rule__PrimitiveTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1783:1: ( ( 'String' ) )
            // InternalJSchema.g:1784:1: ( 'String' )
            {
            // InternalJSchema.g:1784:1: ( 'String' )
            // InternalJSchema.g:1785:2: 'String'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__1"
    // InternalJSchema.g:1794:1: rule__PrimitiveTypes__Group_0__1 : rule__PrimitiveTypes__Group_0__1__Impl ;
    public final void rule__PrimitiveTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1798:1: ( rule__PrimitiveTypes__Group_0__1__Impl )
            // InternalJSchema.g:1799:2: rule__PrimitiveTypes__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__1"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__1__Impl"
    // InternalJSchema.g:1805:1: rule__PrimitiveTypes__Group_0__1__Impl : ( ( rule__PrimitiveTypes__StringAssignment_0_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1809:1: ( ( ( rule__PrimitiveTypes__StringAssignment_0_1 ) ) )
            // InternalJSchema.g:1810:1: ( ( rule__PrimitiveTypes__StringAssignment_0_1 ) )
            {
            // InternalJSchema.g:1810:1: ( ( rule__PrimitiveTypes__StringAssignment_0_1 ) )
            // InternalJSchema.g:1811:2: ( rule__PrimitiveTypes__StringAssignment_0_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_1()); 
            // InternalJSchema.g:1812:2: ( rule__PrimitiveTypes__StringAssignment_0_1 )
            // InternalJSchema.g:1812:3: rule__PrimitiveTypes__StringAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__StringAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0"
    // InternalJSchema.g:1821:1: rule__PrimitiveTypes__Group_2__0 : rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 ;
    public final void rule__PrimitiveTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1825:1: ( rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 )
            // InternalJSchema.g:1826:2: rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__0"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0__Impl"
    // InternalJSchema.g:1833:1: rule__PrimitiveTypes__Group_2__0__Impl : ( 'num' ) ;
    public final void rule__PrimitiveTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1837:1: ( ( 'num' ) )
            // InternalJSchema.g:1838:1: ( 'num' )
            {
            // InternalJSchema.g:1838:1: ( 'num' )
            // InternalJSchema.g:1839:2: 'num'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__1"
    // InternalJSchema.g:1848:1: rule__PrimitiveTypes__Group_2__1 : rule__PrimitiveTypes__Group_2__1__Impl ;
    public final void rule__PrimitiveTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1852:1: ( rule__PrimitiveTypes__Group_2__1__Impl )
            // InternalJSchema.g:1853:2: rule__PrimitiveTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__1"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__1__Impl"
    // InternalJSchema.g:1859:1: rule__PrimitiveTypes__Group_2__1__Impl : ( ( rule__PrimitiveTypes__NumberAssignment_2_1 )? ) ;
    public final void rule__PrimitiveTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1863:1: ( ( ( rule__PrimitiveTypes__NumberAssignment_2_1 )? ) )
            // InternalJSchema.g:1864:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_1 )? )
            {
            // InternalJSchema.g:1864:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_1 )? )
            // InternalJSchema.g:1865:2: ( rule__PrimitiveTypes__NumberAssignment_2_1 )?
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_1()); 
            // InternalJSchema.g:1866:2: ( rule__PrimitiveTypes__NumberAssignment_2_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJSchema.g:1866:3: rule__PrimitiveTypes__NumberAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__NumberAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0"
    // InternalJSchema.g:1875:1: rule__PrimitiveProperties__Group_0__0 : rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 ;
    public final void rule__PrimitiveProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1879:1: ( rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 )
            // InternalJSchema.g:1880:2: rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveProperties__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0__Impl"
    // InternalJSchema.g:1887:1: rule__PrimitiveProperties__Group_0__0__Impl : ( 'length' ) ;
    public final void rule__PrimitiveProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1891:1: ( ( 'length' ) )
            // InternalJSchema.g:1892:1: ( 'length' )
            {
            // InternalJSchema.g:1892:1: ( 'length' )
            // InternalJSchema.g:1893:2: 'length'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__1"
    // InternalJSchema.g:1902:1: rule__PrimitiveProperties__Group_0__1 : rule__PrimitiveProperties__Group_0__1__Impl ;
    public final void rule__PrimitiveProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1906:1: ( rule__PrimitiveProperties__Group_0__1__Impl )
            // InternalJSchema.g:1907:2: rule__PrimitiveProperties__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__1__Impl"
    // InternalJSchema.g:1913:1: rule__PrimitiveProperties__Group_0__1__Impl : ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1917:1: ( ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) )
            // InternalJSchema.g:1918:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            {
            // InternalJSchema.g:1918:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            // InternalJSchema.g:1919:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1()); 
            // InternalJSchema.g:1920:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            // InternalJSchema.g:1920:3: rule__PrimitiveProperties__StringLengthAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__StringLengthAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__0"
    // InternalJSchema.g:1929:1: rule__PrimitiveProperties__Group_1__0 : rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 ;
    public final void rule__PrimitiveProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1933:1: ( rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 )
            // InternalJSchema.g:1934:2: rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__0__Impl"
    // InternalJSchema.g:1941:1: rule__PrimitiveProperties__Group_1__0__Impl : ( 'pattern' ) ;
    public final void rule__PrimitiveProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1945:1: ( ( 'pattern' ) )
            // InternalJSchema.g:1946:1: ( 'pattern' )
            {
            // InternalJSchema.g:1946:1: ( 'pattern' )
            // InternalJSchema.g:1947:2: 'pattern'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__1"
    // InternalJSchema.g:1956:1: rule__PrimitiveProperties__Group_1__1 : rule__PrimitiveProperties__Group_1__1__Impl ;
    public final void rule__PrimitiveProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1960:1: ( rule__PrimitiveProperties__Group_1__1__Impl )
            // InternalJSchema.g:1961:2: rule__PrimitiveProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__1__Impl"
    // InternalJSchema.g:1967:1: rule__PrimitiveProperties__Group_1__1__Impl : ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1971:1: ( ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) )
            // InternalJSchema.g:1972:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            {
            // InternalJSchema.g:1972:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            // InternalJSchema.g:1973:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 
            // InternalJSchema.g:1974:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            // InternalJSchema.g:1974:3: rule__PrimitiveProperties__PatternStringAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__PatternStringAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__0"
    // InternalJSchema.g:1983:1: rule__PrimitiveProperties__Group_2__0 : rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 ;
    public final void rule__PrimitiveProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1987:1: ( rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 )
            // InternalJSchema.g:1988:2: rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__0__Impl"
    // InternalJSchema.g:1995:1: rule__PrimitiveProperties__Group_2__0__Impl : ( 'format' ) ;
    public final void rule__PrimitiveProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1999:1: ( ( 'format' ) )
            // InternalJSchema.g:2000:1: ( 'format' )
            {
            // InternalJSchema.g:2000:1: ( 'format' )
            // InternalJSchema.g:2001:2: 'format'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__1"
    // InternalJSchema.g:2010:1: rule__PrimitiveProperties__Group_2__1 : rule__PrimitiveProperties__Group_2__1__Impl ;
    public final void rule__PrimitiveProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2014:1: ( rule__PrimitiveProperties__Group_2__1__Impl )
            // InternalJSchema.g:2015:2: rule__PrimitiveProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__1__Impl"
    // InternalJSchema.g:2021:1: rule__PrimitiveProperties__Group_2__1__Impl : ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2025:1: ( ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) )
            // InternalJSchema.g:2026:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            {
            // InternalJSchema.g:2026:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            // InternalJSchema.g:2027:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 
            // InternalJSchema.g:2028:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            // InternalJSchema.g:2028:3: rule__PrimitiveProperties__StringFormatAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__StringFormatAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__Group_2__1__Impl"


    // $ANTLR start "rule__StringLength__Group__0"
    // InternalJSchema.g:2037:1: rule__StringLength__Group__0 : rule__StringLength__Group__0__Impl rule__StringLength__Group__1 ;
    public final void rule__StringLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2041:1: ( rule__StringLength__Group__0__Impl rule__StringLength__Group__1 )
            // InternalJSchema.g:2042:2: rule__StringLength__Group__0__Impl rule__StringLength__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StringLength__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLength__Group__1();

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
    // $ANTLR end "rule__StringLength__Group__0"


    // $ANTLR start "rule__StringLength__Group__0__Impl"
    // InternalJSchema.g:2049:1: rule__StringLength__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2053:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2054:1: ( RULE_INT )
            {
            // InternalJSchema.g:2054:1: ( RULE_INT )
            // InternalJSchema.g:2055:2: RULE_INT
            {
             before(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLength__Group__0__Impl"


    // $ANTLR start "rule__StringLength__Group__1"
    // InternalJSchema.g:2064:1: rule__StringLength__Group__1 : rule__StringLength__Group__1__Impl rule__StringLength__Group__2 ;
    public final void rule__StringLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2068:1: ( rule__StringLength__Group__1__Impl rule__StringLength__Group__2 )
            // InternalJSchema.g:2069:2: rule__StringLength__Group__1__Impl rule__StringLength__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StringLength__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLength__Group__2();

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
    // $ANTLR end "rule__StringLength__Group__1"


    // $ANTLR start "rule__StringLength__Group__1__Impl"
    // InternalJSchema.g:2076:1: rule__StringLength__Group__1__Impl : ( '-' ) ;
    public final void rule__StringLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2080:1: ( ( '-' ) )
            // InternalJSchema.g:2081:1: ( '-' )
            {
            // InternalJSchema.g:2081:1: ( '-' )
            // InternalJSchema.g:2082:2: '-'
            {
             before(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLength__Group__1__Impl"


    // $ANTLR start "rule__StringLength__Group__2"
    // InternalJSchema.g:2091:1: rule__StringLength__Group__2 : rule__StringLength__Group__2__Impl ;
    public final void rule__StringLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2095:1: ( rule__StringLength__Group__2__Impl )
            // InternalJSchema.g:2096:2: rule__StringLength__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLength__Group__2__Impl();

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
    // $ANTLR end "rule__StringLength__Group__2"


    // $ANTLR start "rule__StringLength__Group__2__Impl"
    // InternalJSchema.g:2102:1: rule__StringLength__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2106:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2107:1: ( RULE_INT )
            {
            // InternalJSchema.g:2107:1: ( RULE_INT )
            // InternalJSchema.g:2108:2: RULE_INT
            {
             before(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLength__Group__2__Impl"


    // $ANTLR start "rule__Includes__Group__0"
    // InternalJSchema.g:2118:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2122:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalJSchema.g:2123:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Includes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__1();

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
    // $ANTLR end "rule__Includes__Group__0"


    // $ANTLR start "rule__Includes__Group__0__Impl"
    // InternalJSchema.g:2130:1: rule__Includes__Group__0__Impl : ( ( rule__Includes__ObjectIDAssignment_0 ) ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2134:1: ( ( ( rule__Includes__ObjectIDAssignment_0 ) ) )
            // InternalJSchema.g:2135:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            {
            // InternalJSchema.g:2135:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            // InternalJSchema.g:2136:2: ( rule__Includes__ObjectIDAssignment_0 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 
            // InternalJSchema.g:2137:2: ( rule__Includes__ObjectIDAssignment_0 )
            // InternalJSchema.g:2137:3: rule__Includes__ObjectIDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__ObjectIDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // InternalJSchema.g:2145:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2149:1: ( rule__Includes__Group__1__Impl )
            // InternalJSchema.g:2150:2: rule__Includes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__1__Impl();

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
    // $ANTLR end "rule__Includes__Group__1"


    // $ANTLR start "rule__Includes__Group__1__Impl"
    // InternalJSchema.g:2156:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__Group_1__0 )* ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2160:1: ( ( ( rule__Includes__Group_1__0 )* ) )
            // InternalJSchema.g:2161:1: ( ( rule__Includes__Group_1__0 )* )
            {
            // InternalJSchema.g:2161:1: ( ( rule__Includes__Group_1__0 )* )
            // InternalJSchema.g:2162:2: ( rule__Includes__Group_1__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_1()); 
            // InternalJSchema.g:2163:2: ( rule__Includes__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJSchema.g:2163:3: rule__Includes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Includes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getIncludesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group_1__0"
    // InternalJSchema.g:2172:1: rule__Includes__Group_1__0 : rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 ;
    public final void rule__Includes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2176:1: ( rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 )
            // InternalJSchema.g:2177:2: rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Includes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__1();

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
    // $ANTLR end "rule__Includes__Group_1__0"


    // $ANTLR start "rule__Includes__Group_1__0__Impl"
    // InternalJSchema.g:2184:1: rule__Includes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2188:1: ( ( ',' ) )
            // InternalJSchema.g:2189:1: ( ',' )
            {
            // InternalJSchema.g:2189:1: ( ',' )
            // InternalJSchema.g:2190:2: ','
            {
             before(grammarAccess.getIncludesAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1__0__Impl"


    // $ANTLR start "rule__Includes__Group_1__1"
    // InternalJSchema.g:2199:1: rule__Includes__Group_1__1 : rule__Includes__Group_1__1__Impl ;
    public final void rule__Includes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2203:1: ( rule__Includes__Group_1__1__Impl )
            // InternalJSchema.g:2204:2: rule__Includes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__1__Impl();

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
    // $ANTLR end "rule__Includes__Group_1__1"


    // $ANTLR start "rule__Includes__Group_1__1__Impl"
    // InternalJSchema.g:2210:1: rule__Includes__Group_1__1__Impl : ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) ;
    public final void rule__Includes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2214:1: ( ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) )
            // InternalJSchema.g:2215:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            {
            // InternalJSchema.g:2215:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            // InternalJSchema.g:2216:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 
            // InternalJSchema.g:2217:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            // InternalJSchema.g:2217:3: rule__Includes__ObjectIDAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Includes__ObjectIDAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalJSchema.g:2226:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2230:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSchema.g:2231:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalJSchema.g:2238:1: rule__Array__Group__0__Impl : ( ( rule__Array__ArrayNameAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2242:1: ( ( ( rule__Array__ArrayNameAssignment_0 ) ) )
            // InternalJSchema.g:2243:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            {
            // InternalJSchema.g:2243:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            // InternalJSchema.g:2244:2: ( rule__Array__ArrayNameAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 
            // InternalJSchema.g:2245:2: ( rule__Array__ArrayNameAssignment_0 )
            // InternalJSchema.g:2245:3: rule__Array__ArrayNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__ArrayNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalJSchema.g:2253:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2257:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSchema.g:2258:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalJSchema.g:2265:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2269:1: ( ( '[' ) )
            // InternalJSchema.g:2270:1: ( '[' )
            {
            // InternalJSchema.g:2270:1: ( '[' )
            // InternalJSchema.g:2271:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalJSchema.g:2280:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2284:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSchema.g:2285:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__3();

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalJSchema.g:2292:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2296:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSchema.g:2297:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSchema.g:2297:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSchema.g:2298:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSchema.g:2299:2: ( rule__Array__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=40 && LA21_0<=41)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJSchema.g:2299:3: rule__Array__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // InternalJSchema.g:2307:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2311:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // InternalJSchema.g:2312:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Array__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__4();

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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // InternalJSchema.g:2319:1: rule__Array__Group__3__Impl : ( ( rule__Array__ArrayTypeAssignment_3 )? ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2323:1: ( ( ( rule__Array__ArrayTypeAssignment_3 )? ) )
            // InternalJSchema.g:2324:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            {
            // InternalJSchema.g:2324:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            // InternalJSchema.g:2325:2: ( rule__Array__ArrayTypeAssignment_3 )?
            {
             before(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 
            // InternalJSchema.g:2326:2: ( rule__Array__ArrayTypeAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=11 && LA22_0<=14)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJSchema.g:2326:3: rule__Array__ArrayTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__ArrayTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group__4"
    // InternalJSchema.g:2334:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2338:1: ( rule__Array__Group__4__Impl )
            // InternalJSchema.g:2339:2: rule__Array__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__4__Impl();

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
    // $ANTLR end "rule__Array__Group__4"


    // $ANTLR start "rule__Array__Group__4__Impl"
    // InternalJSchema.g:2345:1: rule__Array__Group__4__Impl : ( ']' ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2349:1: ( ( ']' ) )
            // InternalJSchema.g:2350:1: ( ']' )
            {
            // InternalJSchema.g:2350:1: ( ']' )
            // InternalJSchema.g:2351:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__4__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // InternalJSchema.g:2361:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2365:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSchema.g:2366:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1();

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
    // $ANTLR end "rule__Array__Group_2__0"


    // $ANTLR start "rule__Array__Group_2__0__Impl"
    // InternalJSchema.g:2373:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__PropertiesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2377:1: ( ( ( rule__Array__PropertiesAssignment_2_0 ) ) )
            // InternalJSchema.g:2378:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            {
            // InternalJSchema.g:2378:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            // InternalJSchema.g:2379:2: ( rule__Array__PropertiesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 
            // InternalJSchema.g:2380:2: ( rule__Array__PropertiesAssignment_2_0 )
            // InternalJSchema.g:2380:3: rule__Array__PropertiesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__PropertiesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__0__Impl"


    // $ANTLR start "rule__Array__Group_2__1"
    // InternalJSchema.g:2388:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2392:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSchema.g:2393:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2__1"


    // $ANTLR start "rule__Array__Group_2__1__Impl"
    // InternalJSchema.g:2399:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2403:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSchema.g:2404:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSchema.g:2404:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSchema.g:2405:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSchema.g:2406:2: ( rule__Array__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJSchema.g:2406:3: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__1__Impl"


    // $ANTLR start "rule__Array__Group_2_1__0"
    // InternalJSchema.g:2415:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2419:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSchema.g:2420:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Array__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1();

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
    // $ANTLR end "rule__Array__Group_2_1__0"


    // $ANTLR start "rule__Array__Group_2_1__0__Impl"
    // InternalJSchema.g:2427:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2431:1: ( ( ',' ) )
            // InternalJSchema.g:2432:1: ( ',' )
            {
            // InternalJSchema.g:2432:1: ( ',' )
            // InternalJSchema.g:2433:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__0__Impl"


    // $ANTLR start "rule__Array__Group_2_1__1"
    // InternalJSchema.g:2442:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2446:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSchema.g:2447:2: rule__Array__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2_1__1"


    // $ANTLR start "rule__Array__Group_2_1__1__Impl"
    // InternalJSchema.g:2453:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2457:1: ( ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) )
            // InternalJSchema.g:2458:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            {
            // InternalJSchema.g:2458:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            // InternalJSchema.g:2459:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 
            // InternalJSchema.g:2460:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            // InternalJSchema.g:2460:3: rule__Array__PropertiesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__PropertiesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__1__Impl"


    // $ANTLR start "rule__Model__AbstractObjectAssignment"
    // InternalJSchema.g:2469:1: rule__Model__AbstractObjectAssignment : ( ruleAbstractObject ) ;
    public final void rule__Model__AbstractObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2473:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2474:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2474:2: ( ruleAbstractObject )
            // InternalJSchema.g:2475:3: ruleAbstractObject
            {
             before(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AbstractObjectAssignment"


    // $ANTLR start "rule__Number__NumberAssignment_0"
    // InternalJSchema.g:2484:1: rule__Number__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__Number__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2488:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2489:2: ( RULE_INT )
            {
            // InternalJSchema.g:2489:2: ( RULE_INT )
            // InternalJSchema.g:2490:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__NumberAssignment_0"


    // $ANTLR start "rule__Number__DecimalAssignment_1_1"
    // InternalJSchema.g:2499:1: rule__Number__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2503:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2504:2: ( RULE_INT )
            {
            // InternalJSchema.g:2504:2: ( RULE_INT )
            // InternalJSchema.g:2505:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__DecimalAssignment_1_1"


    // $ANTLR start "rule__MainObject__ObjectNameAssignment_0"
    // InternalJSchema.g:2514:1: rule__MainObject__ObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MainObject__ObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2518:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2519:2: ( RULE_ID )
            {
            // InternalJSchema.g:2519:2: ( RULE_ID )
            // InternalJSchema.g:2520:3: RULE_ID
            {
             before(grammarAccess.getMainObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__ObjectNameAssignment_0"


    // $ANTLR start "rule__MainObject__RootAssignment_1"
    // InternalJSchema.g:2529:1: rule__MainObject__RootAssignment_1 : ( ruleIsRoot ) ;
    public final void rule__MainObject__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2533:1: ( ( ruleIsRoot ) )
            // InternalJSchema.g:2534:2: ( ruleIsRoot )
            {
            // InternalJSchema.g:2534:2: ( ruleIsRoot )
            // InternalJSchema.g:2535:3: ruleIsRoot
            {
             before(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIsRoot();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__RootAssignment_1"


    // $ANTLR start "rule__MainObject__IncludeObjectsAssignment_2_1"
    // InternalJSchema.g:2544:1: rule__MainObject__IncludeObjectsAssignment_2_1 : ( ruleIncludes ) ;
    public final void rule__MainObject__IncludeObjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2548:1: ( ( ruleIncludes ) )
            // InternalJSchema.g:2549:2: ( ruleIncludes )
            {
            // InternalJSchema.g:2549:2: ( ruleIncludes )
            // InternalJSchema.g:2550:3: ruleIncludes
            {
             before(grammarAccess.getMainObjectAccess().getIncludeObjectsIncludesParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getIncludeObjectsIncludesParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__IncludeObjectsAssignment_2_1"


    // $ANTLR start "rule__MainObject__PropertiesAssignment_4_0"
    // InternalJSchema.g:2559:1: rule__MainObject__PropertiesAssignment_4_0 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2563:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2564:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2564:2: ( rulehasProperties )
            // InternalJSchema.g:2565:3: rulehasProperties
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__PropertiesAssignment_4_0"


    // $ANTLR start "rule__MainObject__PropertiesAssignment_4_1_1"
    // InternalJSchema.g:2574:1: rule__MainObject__PropertiesAssignment_4_1_1 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2578:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2579:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2579:2: ( rulehasProperties )
            // InternalJSchema.g:2580:3: rulehasProperties
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__PropertiesAssignment_4_1_1"


    // $ANTLR start "rule__PrimitiveObject__TypeAssignment_0"
    // InternalJSchema.g:2589:1: rule__PrimitiveObject__TypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__PrimitiveObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2593:1: ( ( rulePrimitiveTypes ) )
            // InternalJSchema.g:2594:2: ( rulePrimitiveTypes )
            {
            // InternalJSchema.g:2594:2: ( rulePrimitiveTypes )
            // InternalJSchema.g:2595:3: rulePrimitiveTypes
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__TypeAssignment_0"


    // $ANTLR start "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1"
    // InternalJSchema.g:2604:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2608:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2609:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2609:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2610:3: rulePrimitiveProperties
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1"


    // $ANTLR start "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1"
    // InternalJSchema.g:2619:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2623:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2624:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2624:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2625:3: rulePrimitiveProperties
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1"


    // $ANTLR start "rule__ExtendedObject__ExObjectNameAssignment_0"
    // InternalJSchema.g:2634:1: rule__ExtendedObject__ExObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExtendedObject__ExObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2638:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2639:2: ( RULE_ID )
            {
            // InternalJSchema.g:2639:2: ( RULE_ID )
            // InternalJSchema.g:2640:3: RULE_ID
            {
             before(grammarAccess.getExtendedObjectAccess().getExObjectNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getExObjectNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__ExObjectNameAssignment_0"


    // $ANTLR start "rule__ExtendedObject__ExtendsIDAssignment_2"
    // InternalJSchema.g:2649:1: rule__ExtendedObject__ExtendsIDAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ExtendedObject__ExtendsIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2653:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2654:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2654:2: ( RULE_STRING )
            // InternalJSchema.g:2655:3: RULE_STRING
            {
             before(grammarAccess.getExtendedObjectAccess().getExtendsIDSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getExtendsIDSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__ExtendsIDAssignment_2"


    // $ANTLR start "rule__ExtendedObject__IncludeObjectsAssignment_3_1"
    // InternalJSchema.g:2664:1: rule__ExtendedObject__IncludeObjectsAssignment_3_1 : ( ruleIncludes ) ;
    public final void rule__ExtendedObject__IncludeObjectsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2668:1: ( ( ruleIncludes ) )
            // InternalJSchema.g:2669:2: ( ruleIncludes )
            {
            // InternalJSchema.g:2669:2: ( ruleIncludes )
            // InternalJSchema.g:2670:3: ruleIncludes
            {
             before(grammarAccess.getExtendedObjectAccess().getIncludeObjectsIncludesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getIncludeObjectsIncludesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__IncludeObjectsAssignment_3_1"


    // $ANTLR start "rule__ExtendedObject__BodyAssignment_5_0"
    // InternalJSchema.g:2679:1: rule__ExtendedObject__BodyAssignment_5_0 : ( ruleExtendedProperties ) ;
    public final void rule__ExtendedObject__BodyAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2683:1: ( ( ruleExtendedProperties ) )
            // InternalJSchema.g:2684:2: ( ruleExtendedProperties )
            {
            // InternalJSchema.g:2684:2: ( ruleExtendedProperties )
            // InternalJSchema.g:2685:3: ruleExtendedProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExtendedProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__BodyAssignment_5_0"


    // $ANTLR start "rule__ExtendedObject__BodyAssignment_5_1_1"
    // InternalJSchema.g:2694:1: rule__ExtendedObject__BodyAssignment_5_1_1 : ( ruleExtendedProperties ) ;
    public final void rule__ExtendedObject__BodyAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2698:1: ( ( ruleExtendedProperties ) )
            // InternalJSchema.g:2699:2: ( ruleExtendedProperties )
            {
            // InternalJSchema.g:2699:2: ( ruleExtendedProperties )
            // InternalJSchema.g:2700:3: ruleExtendedProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtendedProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__BodyAssignment_5_1_1"


    // $ANTLR start "rule__ExtendedProperties__OverrideAssignment_0"
    // InternalJSchema.g:2709:1: rule__ExtendedProperties__OverrideAssignment_0 : ( ( 'override' ) ) ;
    public final void rule__ExtendedProperties__OverrideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2713:1: ( ( ( 'override' ) ) )
            // InternalJSchema.g:2714:2: ( ( 'override' ) )
            {
            // InternalJSchema.g:2714:2: ( ( 'override' ) )
            // InternalJSchema.g:2715:3: ( 'override' )
            {
             before(grammarAccess.getExtendedPropertiesAccess().getOverrideOverrideKeyword_0_0()); 
            // InternalJSchema.g:2716:3: ( 'override' )
            // InternalJSchema.g:2717:4: 'override'
            {
             before(grammarAccess.getExtendedPropertiesAccess().getOverrideOverrideKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExtendedPropertiesAccess().getOverrideOverrideKeyword_0_0()); 

            }

             after(grammarAccess.getExtendedPropertiesAccess().getOverrideOverrideKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedProperties__OverrideAssignment_0"


    // $ANTLR start "rule__ExtendedProperties__ExtendedPropertiesAssignment_1"
    // InternalJSchema.g:2728:1: rule__ExtendedProperties__ExtendedPropertiesAssignment_1 : ( rulehasProperties ) ;
    public final void rule__ExtendedProperties__ExtendedPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2732:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2733:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2733:2: ( rulehasProperties )
            // InternalJSchema.g:2734:3: rulehasProperties
            {
             before(grammarAccess.getExtendedPropertiesAccess().getExtendedPropertiesHasPropertiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getExtendedPropertiesAccess().getExtendedPropertiesHasPropertiesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedProperties__ExtendedPropertiesAssignment_1"


    // $ANTLR start "rule__PrimitiveTypes__StringAssignment_0_1"
    // InternalJSchema.g:2743:1: rule__PrimitiveTypes__StringAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveTypes__StringAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2747:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2748:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2748:2: ( RULE_STRING )
            // InternalJSchema.g:2749:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__StringAssignment_0_1"


    // $ANTLR start "rule__PrimitiveTypes__ArrayAssignment_1"
    // InternalJSchema.g:2758:1: rule__PrimitiveTypes__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__PrimitiveTypes__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2762:1: ( ( ruleArray ) )
            // InternalJSchema.g:2763:2: ( ruleArray )
            {
            // InternalJSchema.g:2763:2: ( ruleArray )
            // InternalJSchema.g:2764:3: ruleArray
            {
             before(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__ArrayAssignment_1"


    // $ANTLR start "rule__PrimitiveTypes__NumberAssignment_2_1"
    // InternalJSchema.g:2773:1: rule__PrimitiveTypes__NumberAssignment_2_1 : ( ruleNumber ) ;
    public final void rule__PrimitiveTypes__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2777:1: ( ( ruleNumber ) )
            // InternalJSchema.g:2778:2: ( ruleNumber )
            {
            // InternalJSchema.g:2778:2: ( ruleNumber )
            // InternalJSchema.g:2779:3: ruleNumber
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NumberAssignment_2_1"


    // $ANTLR start "rule__IsRoot__StringAssignment"
    // InternalJSchema.g:2788:1: rule__IsRoot__StringAssignment : ( ( 'root' ) ) ;
    public final void rule__IsRoot__StringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2792:1: ( ( ( 'root' ) ) )
            // InternalJSchema.g:2793:2: ( ( 'root' ) )
            {
            // InternalJSchema.g:2793:2: ( ( 'root' ) )
            // InternalJSchema.g:2794:3: ( 'root' )
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            // InternalJSchema.g:2795:3: ( 'root' )
            // InternalJSchema.g:2796:4: 'root'
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 

            }

             after(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsRoot__StringAssignment"


    // $ANTLR start "rule__HasProperties__PropertiesAssignment"
    // InternalJSchema.g:2807:1: rule__HasProperties__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__HasProperties__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2811:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2812:2: ( ruleProperty )
            {
            // InternalJSchema.g:2812:2: ( ruleProperty )
            // InternalJSchema.g:2813:3: ruleProperty
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasProperties__PropertiesAssignment"


    // $ANTLR start "rule__Property__PropPrimAssignment_0"
    // InternalJSchema.g:2822:1: rule__Property__PropPrimAssignment_0 : ( rulePrimitiveObject ) ;
    public final void rule__Property__PropPrimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2826:1: ( ( rulePrimitiveObject ) )
            // InternalJSchema.g:2827:2: ( rulePrimitiveObject )
            {
            // InternalJSchema.g:2827:2: ( rulePrimitiveObject )
            // InternalJSchema.g:2828:3: rulePrimitiveObject
            {
             before(grammarAccess.getPropertyAccess().getPropPrimPrimitiveObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveObject();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropPrimPrimitiveObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropPrimAssignment_0"


    // $ANTLR start "rule__Property__PropObjAssignment_1"
    // InternalJSchema.g:2837:1: rule__Property__PropObjAssignment_1 : ( ruleMainObject ) ;
    public final void rule__Property__PropObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2841:1: ( ( ruleMainObject ) )
            // InternalJSchema.g:2842:2: ( ruleMainObject )
            {
            // InternalJSchema.g:2842:2: ( ruleMainObject )
            // InternalJSchema.g:2843:3: ruleMainObject
            {
             before(grammarAccess.getPropertyAccess().getPropObjMainObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainObject();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropObjMainObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropObjAssignment_1"


    // $ANTLR start "rule__PrimitiveProperties__StringLengthAssignment_0_1"
    // InternalJSchema.g:2852:1: rule__PrimitiveProperties__StringLengthAssignment_0_1 : ( ruleStringLength ) ;
    public final void rule__PrimitiveProperties__StringLengthAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2856:1: ( ( ruleStringLength ) )
            // InternalJSchema.g:2857:2: ( ruleStringLength )
            {
            // InternalJSchema.g:2857:2: ( ruleStringLength )
            // InternalJSchema.g:2858:3: ruleStringLength
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLength();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__StringLengthAssignment_0_1"


    // $ANTLR start "rule__PrimitiveProperties__PatternStringAssignment_1_1"
    // InternalJSchema.g:2867:1: rule__PrimitiveProperties__PatternStringAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveProperties__PatternStringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2871:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2872:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2872:2: ( RULE_STRING )
            // InternalJSchema.g:2873:3: RULE_STRING
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__PatternStringAssignment_1_1"


    // $ANTLR start "rule__PrimitiveProperties__StringFormatAssignment_2_1"
    // InternalJSchema.g:2882:1: rule__PrimitiveProperties__StringFormatAssignment_2_1 : ( ruleFormatTypes ) ;
    public final void rule__PrimitiveProperties__StringFormatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2886:1: ( ( ruleFormatTypes ) )
            // InternalJSchema.g:2887:2: ( ruleFormatTypes )
            {
            // InternalJSchema.g:2887:2: ( ruleFormatTypes )
            // InternalJSchema.g:2888:3: ruleFormatTypes
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormatTypes();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__StringFormatAssignment_2_1"


    // $ANTLR start "rule__Includes__ObjectIDAssignment_0"
    // InternalJSchema.g:2897:1: rule__Includes__ObjectIDAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2901:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2902:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2902:2: ( RULE_STRING )
            // InternalJSchema.g:2903:3: RULE_STRING
            {
             before(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__ObjectIDAssignment_0"


    // $ANTLR start "rule__Includes__ObjectIDAssignment_1_1"
    // InternalJSchema.g:2912:1: rule__Includes__ObjectIDAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2916:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2917:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2917:2: ( RULE_STRING )
            // InternalJSchema.g:2918:3: RULE_STRING
            {
             before(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__ObjectIDAssignment_1_1"


    // $ANTLR start "rule__Array__ArrayNameAssignment_0"
    // InternalJSchema.g:2927:1: rule__Array__ArrayNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Array__ArrayNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2931:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2932:2: ( RULE_ID )
            {
            // InternalJSchema.g:2932:2: ( RULE_ID )
            // InternalJSchema.g:2933:3: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ArrayNameAssignment_0"


    // $ANTLR start "rule__Array__PropertiesAssignment_2_0"
    // InternalJSchema.g:2942:1: rule__Array__PropertiesAssignment_2_0 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2946:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2947:2: ( ruleProperty )
            {
            // InternalJSchema.g:2947:2: ( ruleProperty )
            // InternalJSchema.g:2948:3: ruleProperty
            {
             before(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__PropertiesAssignment_2_0"


    // $ANTLR start "rule__Array__PropertiesAssignment_2_1_1"
    // InternalJSchema.g:2957:1: rule__Array__PropertiesAssignment_2_1_1 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2961:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2962:2: ( ruleProperty )
            {
            // InternalJSchema.g:2962:2: ( ruleProperty )
            // InternalJSchema.g:2963:3: ruleProperty
            {
             before(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__PropertiesAssignment_2_1_1"


    // $ANTLR start "rule__Array__ArrayTypeAssignment_3"
    // InternalJSchema.g:2972:1: rule__Array__ArrayTypeAssignment_3 : ( ruleArrayType ) ;
    public final void rule__Array__ArrayTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2976:1: ( ( ruleArrayType ) )
            // InternalJSchema.g:2977:2: ( ruleArrayType )
            {
            // InternalJSchema.g:2977:2: ( ruleArrayType )
            // InternalJSchema.g:2978:3: ruleArrayType
            {
             before(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ArrayTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000A00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000030400000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001030400000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001030000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000FFFF8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000830000007820L});

}
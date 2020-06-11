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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'integer'", "'float'", "'double'", "'null'", "'date-time'", "'time'", "'date'", "'email'", "'idn-email'", "'hostname'", "'ipv4'", "'ipv6'", "'uri'", "'uri-reference'", "'iri'", "'iri-reference'", "'uri-template'", "'json-pointer'", "'relative-json-pointer'", "'regex'", "'.'", "'{'", "'}'", "'includes'", "','", "'with'", "';'", "'extends'", "'override'", "'String'", "'num'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'", "'root'"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=41 && LA1_0<=42)) ) {
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


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalJSchema.g:203:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( rulePrimitiveTypes EOF )
            // InternalJSchema.g:205:1: rulePrimitiveTypes EOF
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
    // InternalJSchema.g:212:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // InternalJSchema.g:217:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            // InternalJSchema.g:218:3: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // InternalJSchema.g:219:3: ( rule__PrimitiveTypes__Alternatives )
            // InternalJSchema.g:219:4: rule__PrimitiveTypes__Alternatives
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
    // InternalJSchema.g:228:1: entryRuleIsRoot : ruleIsRoot EOF ;
    public final void entryRuleIsRoot() throws RecognitionException {
        try {
            // InternalJSchema.g:229:1: ( ruleIsRoot EOF )
            // InternalJSchema.g:230:1: ruleIsRoot EOF
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
    // InternalJSchema.g:237:1: ruleIsRoot : ( ( rule__IsRoot__StringAssignment ) ) ;
    public final void ruleIsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:241:2: ( ( ( rule__IsRoot__StringAssignment ) ) )
            // InternalJSchema.g:242:2: ( ( rule__IsRoot__StringAssignment ) )
            {
            // InternalJSchema.g:242:2: ( ( rule__IsRoot__StringAssignment ) )
            // InternalJSchema.g:243:3: ( rule__IsRoot__StringAssignment )
            {
             before(grammarAccess.getIsRootAccess().getStringAssignment()); 
            // InternalJSchema.g:244:3: ( rule__IsRoot__StringAssignment )
            // InternalJSchema.g:244:4: rule__IsRoot__StringAssignment
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
    // InternalJSchema.g:253:1: entryRulehasProperties : rulehasProperties EOF ;
    public final void entryRulehasProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:254:1: ( rulehasProperties EOF )
            // InternalJSchema.g:255:1: rulehasProperties EOF
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
    // InternalJSchema.g:262:1: rulehasProperties : ( ( rule__HasProperties__PropertiesAssignment ) ) ;
    public final void rulehasProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:266:2: ( ( ( rule__HasProperties__PropertiesAssignment ) ) )
            // InternalJSchema.g:267:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            {
            // InternalJSchema.g:267:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            // InternalJSchema.g:268:3: ( rule__HasProperties__PropertiesAssignment )
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 
            // InternalJSchema.g:269:3: ( rule__HasProperties__PropertiesAssignment )
            // InternalJSchema.g:269:4: rule__HasProperties__PropertiesAssignment
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
    // InternalJSchema.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJSchema.g:279:1: ( ruleProperty EOF )
            // InternalJSchema.g:280:1: ruleProperty EOF
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
    // InternalJSchema.g:287:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:291:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalJSchema.g:292:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalJSchema.g:292:2: ( ( rule__Property__Alternatives ) )
            // InternalJSchema.g:293:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalJSchema.g:294:3: ( rule__Property__Alternatives )
            // InternalJSchema.g:294:4: rule__Property__Alternatives
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
    // InternalJSchema.g:303:1: entryRulePrimitiveProperties : rulePrimitiveProperties EOF ;
    public final void entryRulePrimitiveProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:304:1: ( rulePrimitiveProperties EOF )
            // InternalJSchema.g:305:1: rulePrimitiveProperties EOF
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
    // InternalJSchema.g:312:1: rulePrimitiveProperties : ( ( rule__PrimitiveProperties__Alternatives ) ) ;
    public final void rulePrimitiveProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:316:2: ( ( ( rule__PrimitiveProperties__Alternatives ) ) )
            // InternalJSchema.g:317:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            {
            // InternalJSchema.g:317:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            // InternalJSchema.g:318:3: ( rule__PrimitiveProperties__Alternatives )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 
            // InternalJSchema.g:319:3: ( rule__PrimitiveProperties__Alternatives )
            // InternalJSchema.g:319:4: rule__PrimitiveProperties__Alternatives
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
    // InternalJSchema.g:328:1: entryRuleStringLength : ruleStringLength EOF ;
    public final void entryRuleStringLength() throws RecognitionException {
        try {
            // InternalJSchema.g:329:1: ( ruleStringLength EOF )
            // InternalJSchema.g:330:1: ruleStringLength EOF
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
    // InternalJSchema.g:337:1: ruleStringLength : ( ( rule__StringLength__Group__0 ) ) ;
    public final void ruleStringLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:341:2: ( ( ( rule__StringLength__Group__0 ) ) )
            // InternalJSchema.g:342:2: ( ( rule__StringLength__Group__0 ) )
            {
            // InternalJSchema.g:342:2: ( ( rule__StringLength__Group__0 ) )
            // InternalJSchema.g:343:3: ( rule__StringLength__Group__0 )
            {
             before(grammarAccess.getStringLengthAccess().getGroup()); 
            // InternalJSchema.g:344:3: ( rule__StringLength__Group__0 )
            // InternalJSchema.g:344:4: rule__StringLength__Group__0
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
    // InternalJSchema.g:353:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalJSchema.g:354:1: ( ruleIncludes EOF )
            // InternalJSchema.g:355:1: ruleIncludes EOF
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
    // InternalJSchema.g:362:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:366:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalJSchema.g:367:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalJSchema.g:367:2: ( ( rule__Includes__Group__0 ) )
            // InternalJSchema.g:368:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalJSchema.g:369:3: ( rule__Includes__Group__0 )
            // InternalJSchema.g:369:4: rule__Includes__Group__0
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
    // InternalJSchema.g:378:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSchema.g:379:1: ( ruleArray EOF )
            // InternalJSchema.g:380:1: ruleArray EOF
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
    // InternalJSchema.g:387:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:391:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSchema.g:392:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSchema.g:392:2: ( ( rule__Array__Group__0 ) )
            // InternalJSchema.g:393:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSchema.g:394:3: ( rule__Array__Group__0 )
            // InternalJSchema.g:394:4: rule__Array__Group__0
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
    // InternalJSchema.g:403:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalJSchema.g:404:1: ( ruleArrayType EOF )
            // InternalJSchema.g:405:1: ruleArrayType EOF
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
    // InternalJSchema.g:412:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:416:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalJSchema.g:417:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalJSchema.g:417:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalJSchema.g:418:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalJSchema.g:419:3: ( rule__ArrayType__Alternatives )
            // InternalJSchema.g:419:4: rule__ArrayType__Alternatives
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
    // InternalJSchema.g:428:1: ruleFormatTypes : ( ( rule__FormatTypes__Alternatives ) ) ;
    public final void ruleFormatTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:432:1: ( ( ( rule__FormatTypes__Alternatives ) ) )
            // InternalJSchema.g:433:2: ( ( rule__FormatTypes__Alternatives ) )
            {
            // InternalJSchema.g:433:2: ( ( rule__FormatTypes__Alternatives ) )
            // InternalJSchema.g:434:3: ( rule__FormatTypes__Alternatives )
            {
             before(grammarAccess.getFormatTypesAccess().getAlternatives()); 
            // InternalJSchema.g:435:3: ( rule__FormatTypes__Alternatives )
            // InternalJSchema.g:435:4: rule__FormatTypes__Alternatives
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
    // InternalJSchema.g:443:1: rule__AbstractObject__Alternatives : ( ( ruleMainObject ) | ( rulePrimitiveObject ) | ( ruleExtendedObject ) );
    public final void rule__AbstractObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:447:1: ( ( ruleMainObject ) | ( rulePrimitiveObject ) | ( ruleExtendedObject ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 47:
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
            else if ( ((LA2_0>=41 && LA2_0<=42)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:448:2: ( ruleMainObject )
                    {
                    // InternalJSchema.g:448:2: ( ruleMainObject )
                    // InternalJSchema.g:449:3: ruleMainObject
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
                    // InternalJSchema.g:454:2: ( rulePrimitiveObject )
                    {
                    // InternalJSchema.g:454:2: ( rulePrimitiveObject )
                    // InternalJSchema.g:455:3: rulePrimitiveObject
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
                    // InternalJSchema.g:460:2: ( ruleExtendedObject )
                    {
                    // InternalJSchema.g:460:2: ( ruleExtendedObject )
                    // InternalJSchema.g:461:3: ruleExtendedObject
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


    // $ANTLR start "rule__ExtendedObject__Alternatives_4_0"
    // InternalJSchema.g:470:1: rule__ExtendedObject__Alternatives_4_0 : ( ( ( rule__ExtendedObject__Group_4_0_0__0 ) ) | ( ( rule__ExtendedObject__PropertiesAssignment_4_0_1 ) ) );
    public final void rule__ExtendedObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:474:1: ( ( ( rule__ExtendedObject__Group_4_0_0__0 ) ) | ( ( rule__ExtendedObject__PropertiesAssignment_4_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=41 && LA3_0<=42)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:475:2: ( ( rule__ExtendedObject__Group_4_0_0__0 ) )
                    {
                    // InternalJSchema.g:475:2: ( ( rule__ExtendedObject__Group_4_0_0__0 ) )
                    // InternalJSchema.g:476:3: ( rule__ExtendedObject__Group_4_0_0__0 )
                    {
                     before(grammarAccess.getExtendedObjectAccess().getGroup_4_0_0()); 
                    // InternalJSchema.g:477:3: ( rule__ExtendedObject__Group_4_0_0__0 )
                    // InternalJSchema.g:477:4: rule__ExtendedObject__Group_4_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__Group_4_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedObjectAccess().getGroup_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:481:2: ( ( rule__ExtendedObject__PropertiesAssignment_4_0_1 ) )
                    {
                    // InternalJSchema.g:481:2: ( ( rule__ExtendedObject__PropertiesAssignment_4_0_1 ) )
                    // InternalJSchema.g:482:3: ( rule__ExtendedObject__PropertiesAssignment_4_0_1 )
                    {
                     before(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_0_1()); 
                    // InternalJSchema.g:483:3: ( rule__ExtendedObject__PropertiesAssignment_4_0_1 )
                    // InternalJSchema.g:483:4: rule__ExtendedObject__PropertiesAssignment_4_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__PropertiesAssignment_4_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_0_1()); 

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
    // $ANTLR end "rule__ExtendedObject__Alternatives_4_0"


    // $ANTLR start "rule__ExtendedObject__Alternatives_4_1"
    // InternalJSchema.g:491:1: rule__ExtendedObject__Alternatives_4_1 : ( ( ( rule__ExtendedObject__Group_4_1_0__0 ) ) | ( ( rule__ExtendedObject__PropertiesAssignment_4_1_1 ) ) );
    public final void rule__ExtendedObject__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:495:1: ( ( ( rule__ExtendedObject__Group_4_1_0__0 ) ) | ( ( rule__ExtendedObject__PropertiesAssignment_4_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||(LA4_0>=41 && LA4_0<=42)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:496:2: ( ( rule__ExtendedObject__Group_4_1_0__0 ) )
                    {
                    // InternalJSchema.g:496:2: ( ( rule__ExtendedObject__Group_4_1_0__0 ) )
                    // InternalJSchema.g:497:3: ( rule__ExtendedObject__Group_4_1_0__0 )
                    {
                     before(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0()); 
                    // InternalJSchema.g:498:3: ( rule__ExtendedObject__Group_4_1_0__0 )
                    // InternalJSchema.g:498:4: rule__ExtendedObject__Group_4_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__Group_4_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:502:2: ( ( rule__ExtendedObject__PropertiesAssignment_4_1_1 ) )
                    {
                    // InternalJSchema.g:502:2: ( ( rule__ExtendedObject__PropertiesAssignment_4_1_1 ) )
                    // InternalJSchema.g:503:3: ( rule__ExtendedObject__PropertiesAssignment_4_1_1 )
                    {
                     before(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_1_1()); 
                    // InternalJSchema.g:504:3: ( rule__ExtendedObject__PropertiesAssignment_4_1_1 )
                    // InternalJSchema.g:504:4: rule__ExtendedObject__PropertiesAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__PropertiesAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedObjectAccess().getPropertiesAssignment_4_1_1()); 

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
    // $ANTLR end "rule__ExtendedObject__Alternatives_4_1"


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // InternalJSchema.g:512:1: rule__PrimitiveTypes__Alternatives : ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:516:1: ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 42:
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
                    // InternalJSchema.g:517:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    {
                    // InternalJSchema.g:517:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    // InternalJSchema.g:518:3: ( rule__PrimitiveTypes__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:519:3: ( rule__PrimitiveTypes__Group_0__0 )
                    // InternalJSchema.g:519:4: rule__PrimitiveTypes__Group_0__0
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
                    // InternalJSchema.g:523:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    {
                    // InternalJSchema.g:523:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    // InternalJSchema.g:524:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 
                    // InternalJSchema.g:525:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    // InternalJSchema.g:525:4: rule__PrimitiveTypes__ArrayAssignment_1
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
                    // InternalJSchema.g:529:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    {
                    // InternalJSchema.g:529:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    // InternalJSchema.g:530:3: ( rule__PrimitiveTypes__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:531:3: ( rule__PrimitiveTypes__Group_2__0 )
                    // InternalJSchema.g:531:4: rule__PrimitiveTypes__Group_2__0
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
    // InternalJSchema.g:539:1: rule__Property__Alternatives : ( ( ( rule__Property__PropPrimAssignment_0 ) ) | ( ( rule__Property__PropObjAssignment_1 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:543:1: ( ( ( rule__Property__PropPrimAssignment_0 ) ) | ( ( rule__Property__PropObjAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=41 && LA6_0<=42)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==47) ) {
                    alt6=1;
                }
                else if ( (LA6_2==33||LA6_2==35||LA6_2==49) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:544:2: ( ( rule__Property__PropPrimAssignment_0 ) )
                    {
                    // InternalJSchema.g:544:2: ( ( rule__Property__PropPrimAssignment_0 ) )
                    // InternalJSchema.g:545:3: ( rule__Property__PropPrimAssignment_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getPropPrimAssignment_0()); 
                    // InternalJSchema.g:546:3: ( rule__Property__PropPrimAssignment_0 )
                    // InternalJSchema.g:546:4: rule__Property__PropPrimAssignment_0
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
                    // InternalJSchema.g:550:2: ( ( rule__Property__PropObjAssignment_1 ) )
                    {
                    // InternalJSchema.g:550:2: ( ( rule__Property__PropObjAssignment_1 ) )
                    // InternalJSchema.g:551:3: ( rule__Property__PropObjAssignment_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getPropObjAssignment_1()); 
                    // InternalJSchema.g:552:3: ( rule__Property__PropObjAssignment_1 )
                    // InternalJSchema.g:552:4: rule__Property__PropObjAssignment_1
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
    // InternalJSchema.g:560:1: rule__PrimitiveProperties__Alternatives : ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) );
    public final void rule__PrimitiveProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:564:1: ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:565:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    {
                    // InternalJSchema.g:565:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    // InternalJSchema.g:566:3: ( rule__PrimitiveProperties__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 
                    // InternalJSchema.g:567:3: ( rule__PrimitiveProperties__Group_0__0 )
                    // InternalJSchema.g:567:4: rule__PrimitiveProperties__Group_0__0
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
                    // InternalJSchema.g:571:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    {
                    // InternalJSchema.g:571:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    // InternalJSchema.g:572:3: ( rule__PrimitiveProperties__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 
                    // InternalJSchema.g:573:3: ( rule__PrimitiveProperties__Group_1__0 )
                    // InternalJSchema.g:573:4: rule__PrimitiveProperties__Group_1__0
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
                    // InternalJSchema.g:577:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    {
                    // InternalJSchema.g:577:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    // InternalJSchema.g:578:3: ( rule__PrimitiveProperties__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 
                    // InternalJSchema.g:579:3: ( rule__PrimitiveProperties__Group_2__0 )
                    // InternalJSchema.g:579:4: rule__PrimitiveProperties__Group_2__0
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
    // InternalJSchema.g:587:1: rule__ArrayType__Alternatives : ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:591:1: ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:592:2: ( 'string' )
                    {
                    // InternalJSchema.g:592:2: ( 'string' )
                    // InternalJSchema.g:593:3: 'string'
                    {
                     before(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:598:2: ( 'integer' )
                    {
                    // InternalJSchema.g:598:2: ( 'integer' )
                    // InternalJSchema.g:599:3: 'integer'
                    {
                     before(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:604:2: ( 'float' )
                    {
                    // InternalJSchema.g:604:2: ( 'float' )
                    // InternalJSchema.g:605:3: 'float'
                    {
                     before(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:610:2: ( 'double' )
                    {
                    // InternalJSchema.g:610:2: ( 'double' )
                    // InternalJSchema.g:611:3: 'double'
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
    // InternalJSchema.g:620:1: rule__FormatTypes__Alternatives : ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) );
    public final void rule__FormatTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:624:1: ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) )
            int alt9=17;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            case 21:
                {
                alt9=7;
                }
                break;
            case 22:
                {
                alt9=8;
                }
                break;
            case 23:
                {
                alt9=9;
                }
                break;
            case 24:
                {
                alt9=10;
                }
                break;
            case 25:
                {
                alt9=11;
                }
                break;
            case 26:
                {
                alt9=12;
                }
                break;
            case 27:
                {
                alt9=13;
                }
                break;
            case 28:
                {
                alt9=14;
                }
                break;
            case 29:
                {
                alt9=15;
                }
                break;
            case 30:
                {
                alt9=16;
                }
                break;
            case 31:
                {
                alt9=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:625:2: ( ( 'null' ) )
                    {
                    // InternalJSchema.g:625:2: ( ( 'null' ) )
                    // InternalJSchema.g:626:3: ( 'null' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // InternalJSchema.g:627:3: ( 'null' )
                    // InternalJSchema.g:627:4: 'null'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:631:2: ( ( 'date-time' ) )
                    {
                    // InternalJSchema.g:631:2: ( ( 'date-time' ) )
                    // InternalJSchema.g:632:3: ( 'date-time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 
                    // InternalJSchema.g:633:3: ( 'date-time' )
                    // InternalJSchema.g:633:4: 'date-time'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:637:2: ( ( 'time' ) )
                    {
                    // InternalJSchema.g:637:2: ( ( 'time' ) )
                    // InternalJSchema.g:638:3: ( 'time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 
                    // InternalJSchema.g:639:3: ( 'time' )
                    // InternalJSchema.g:639:4: 'time'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:643:2: ( ( 'date' ) )
                    {
                    // InternalJSchema.g:643:2: ( ( 'date' ) )
                    // InternalJSchema.g:644:3: ( 'date' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalJSchema.g:645:3: ( 'date' )
                    // InternalJSchema.g:645:4: 'date'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:649:2: ( ( 'email' ) )
                    {
                    // InternalJSchema.g:649:2: ( ( 'email' ) )
                    // InternalJSchema.g:650:3: ( 'email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 
                    // InternalJSchema.g:651:3: ( 'email' )
                    // InternalJSchema.g:651:4: 'email'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:655:2: ( ( 'idn-email' ) )
                    {
                    // InternalJSchema.g:655:2: ( ( 'idn-email' ) )
                    // InternalJSchema.g:656:3: ( 'idn-email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 
                    // InternalJSchema.g:657:3: ( 'idn-email' )
                    // InternalJSchema.g:657:4: 'idn-email'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:661:2: ( ( 'hostname' ) )
                    {
                    // InternalJSchema.g:661:2: ( ( 'hostname' ) )
                    // InternalJSchema.g:662:3: ( 'hostname' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 
                    // InternalJSchema.g:663:3: ( 'hostname' )
                    // InternalJSchema.g:663:4: 'hostname'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:667:2: ( ( 'ipv4' ) )
                    {
                    // InternalJSchema.g:667:2: ( ( 'ipv4' ) )
                    // InternalJSchema.g:668:3: ( 'ipv4' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 
                    // InternalJSchema.g:669:3: ( 'ipv4' )
                    // InternalJSchema.g:669:4: 'ipv4'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:673:2: ( ( 'ipv6' ) )
                    {
                    // InternalJSchema.g:673:2: ( ( 'ipv6' ) )
                    // InternalJSchema.g:674:3: ( 'ipv6' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 
                    // InternalJSchema.g:675:3: ( 'ipv6' )
                    // InternalJSchema.g:675:4: 'ipv6'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:679:2: ( ( 'uri' ) )
                    {
                    // InternalJSchema.g:679:2: ( ( 'uri' ) )
                    // InternalJSchema.g:680:3: ( 'uri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 
                    // InternalJSchema.g:681:3: ( 'uri' )
                    // InternalJSchema.g:681:4: 'uri'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:685:2: ( ( 'uri-reference' ) )
                    {
                    // InternalJSchema.g:685:2: ( ( 'uri-reference' ) )
                    // InternalJSchema.g:686:3: ( 'uri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 
                    // InternalJSchema.g:687:3: ( 'uri-reference' )
                    // InternalJSchema.g:687:4: 'uri-reference'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:691:2: ( ( 'iri' ) )
                    {
                    // InternalJSchema.g:691:2: ( ( 'iri' ) )
                    // InternalJSchema.g:692:3: ( 'iri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 
                    // InternalJSchema.g:693:3: ( 'iri' )
                    // InternalJSchema.g:693:4: 'iri'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:697:2: ( ( 'iri-reference' ) )
                    {
                    // InternalJSchema.g:697:2: ( ( 'iri-reference' ) )
                    // InternalJSchema.g:698:3: ( 'iri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 
                    // InternalJSchema.g:699:3: ( 'iri-reference' )
                    // InternalJSchema.g:699:4: 'iri-reference'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:703:2: ( ( 'uri-template' ) )
                    {
                    // InternalJSchema.g:703:2: ( ( 'uri-template' ) )
                    // InternalJSchema.g:704:3: ( 'uri-template' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 
                    // InternalJSchema.g:705:3: ( 'uri-template' )
                    // InternalJSchema.g:705:4: 'uri-template'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:709:2: ( ( 'json-pointer' ) )
                    {
                    // InternalJSchema.g:709:2: ( ( 'json-pointer' ) )
                    // InternalJSchema.g:710:3: ( 'json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 
                    // InternalJSchema.g:711:3: ( 'json-pointer' )
                    // InternalJSchema.g:711:4: 'json-pointer'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:715:2: ( ( 'relative-json-pointer' ) )
                    {
                    // InternalJSchema.g:715:2: ( ( 'relative-json-pointer' ) )
                    // InternalJSchema.g:716:3: ( 'relative-json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 
                    // InternalJSchema.g:717:3: ( 'relative-json-pointer' )
                    // InternalJSchema.g:717:4: 'relative-json-pointer'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:721:2: ( ( 'regex' ) )
                    {
                    // InternalJSchema.g:721:2: ( ( 'regex' ) )
                    // InternalJSchema.g:722:3: ( 'regex' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16()); 
                    // InternalJSchema.g:723:3: ( 'regex' )
                    // InternalJSchema.g:723:4: 'regex'
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
    // InternalJSchema.g:731:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:735:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSchema.g:736:2: rule__Number__Group__0__Impl rule__Number__Group__1
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
    // InternalJSchema.g:743:1: rule__Number__Group__0__Impl : ( ( rule__Number__NumberAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:747:1: ( ( ( rule__Number__NumberAssignment_0 ) ) )
            // InternalJSchema.g:748:1: ( ( rule__Number__NumberAssignment_0 ) )
            {
            // InternalJSchema.g:748:1: ( ( rule__Number__NumberAssignment_0 ) )
            // InternalJSchema.g:749:2: ( rule__Number__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment_0()); 
            // InternalJSchema.g:750:2: ( rule__Number__NumberAssignment_0 )
            // InternalJSchema.g:750:3: rule__Number__NumberAssignment_0
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
    // InternalJSchema.g:758:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:762:1: ( rule__Number__Group__1__Impl )
            // InternalJSchema.g:763:2: rule__Number__Group__1__Impl
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
    // InternalJSchema.g:769:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:773:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalJSchema.g:774:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalJSchema.g:774:1: ( ( rule__Number__Group_1__0 )? )
            // InternalJSchema.g:775:2: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // InternalJSchema.g:776:2: ( rule__Number__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:776:3: rule__Number__Group_1__0
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
    // InternalJSchema.g:785:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:789:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalJSchema.g:790:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
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
    // InternalJSchema.g:797:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:801:1: ( ( '.' ) )
            // InternalJSchema.g:802:1: ( '.' )
            {
            // InternalJSchema.g:802:1: ( '.' )
            // InternalJSchema.g:803:2: '.'
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
    // InternalJSchema.g:812:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:816:1: ( rule__Number__Group_1__1__Impl )
            // InternalJSchema.g:817:2: rule__Number__Group_1__1__Impl
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
    // InternalJSchema.g:823:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__DecimalAssignment_1_1 ) ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:827:1: ( ( ( rule__Number__DecimalAssignment_1_1 ) ) )
            // InternalJSchema.g:828:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            {
            // InternalJSchema.g:828:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            // InternalJSchema.g:829:2: ( rule__Number__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 
            // InternalJSchema.g:830:2: ( rule__Number__DecimalAssignment_1_1 )
            // InternalJSchema.g:830:3: rule__Number__DecimalAssignment_1_1
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
    // InternalJSchema.g:839:1: rule__MainObject__Group__0 : rule__MainObject__Group__0__Impl rule__MainObject__Group__1 ;
    public final void rule__MainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:843:1: ( rule__MainObject__Group__0__Impl rule__MainObject__Group__1 )
            // InternalJSchema.g:844:2: rule__MainObject__Group__0__Impl rule__MainObject__Group__1
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
    // InternalJSchema.g:851:1: rule__MainObject__Group__0__Impl : ( ( rule__MainObject__ObjectNameAssignment_0 ) ) ;
    public final void rule__MainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:855:1: ( ( ( rule__MainObject__ObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:856:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:856:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            // InternalJSchema.g:857:2: ( rule__MainObject__ObjectNameAssignment_0 )
            {
             before(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0()); 
            // InternalJSchema.g:858:2: ( rule__MainObject__ObjectNameAssignment_0 )
            // InternalJSchema.g:858:3: rule__MainObject__ObjectNameAssignment_0
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
    // InternalJSchema.g:866:1: rule__MainObject__Group__1 : rule__MainObject__Group__1__Impl rule__MainObject__Group__2 ;
    public final void rule__MainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:870:1: ( rule__MainObject__Group__1__Impl rule__MainObject__Group__2 )
            // InternalJSchema.g:871:2: rule__MainObject__Group__1__Impl rule__MainObject__Group__2
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
    // InternalJSchema.g:878:1: rule__MainObject__Group__1__Impl : ( ( rule__MainObject__RootAssignment_1 )? ) ;
    public final void rule__MainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:882:1: ( ( ( rule__MainObject__RootAssignment_1 )? ) )
            // InternalJSchema.g:883:1: ( ( rule__MainObject__RootAssignment_1 )? )
            {
            // InternalJSchema.g:883:1: ( ( rule__MainObject__RootAssignment_1 )? )
            // InternalJSchema.g:884:2: ( rule__MainObject__RootAssignment_1 )?
            {
             before(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 
            // InternalJSchema.g:885:2: ( rule__MainObject__RootAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:885:3: rule__MainObject__RootAssignment_1
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
    // InternalJSchema.g:893:1: rule__MainObject__Group__2 : rule__MainObject__Group__2__Impl rule__MainObject__Group__3 ;
    public final void rule__MainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:897:1: ( rule__MainObject__Group__2__Impl rule__MainObject__Group__3 )
            // InternalJSchema.g:898:2: rule__MainObject__Group__2__Impl rule__MainObject__Group__3
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
    // InternalJSchema.g:905:1: rule__MainObject__Group__2__Impl : ( ( rule__MainObject__Group_2__0 )? ) ;
    public final void rule__MainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:909:1: ( ( ( rule__MainObject__Group_2__0 )? ) )
            // InternalJSchema.g:910:1: ( ( rule__MainObject__Group_2__0 )? )
            {
            // InternalJSchema.g:910:1: ( ( rule__MainObject__Group_2__0 )? )
            // InternalJSchema.g:911:2: ( rule__MainObject__Group_2__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_2()); 
            // InternalJSchema.g:912:2: ( rule__MainObject__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJSchema.g:912:3: rule__MainObject__Group_2__0
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
    // InternalJSchema.g:920:1: rule__MainObject__Group__3 : rule__MainObject__Group__3__Impl rule__MainObject__Group__4 ;
    public final void rule__MainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:924:1: ( rule__MainObject__Group__3__Impl rule__MainObject__Group__4 )
            // InternalJSchema.g:925:2: rule__MainObject__Group__3__Impl rule__MainObject__Group__4
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
    // InternalJSchema.g:932:1: rule__MainObject__Group__3__Impl : ( '{' ) ;
    public final void rule__MainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:936:1: ( ( '{' ) )
            // InternalJSchema.g:937:1: ( '{' )
            {
            // InternalJSchema.g:937:1: ( '{' )
            // InternalJSchema.g:938:2: '{'
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
    // InternalJSchema.g:947:1: rule__MainObject__Group__4 : rule__MainObject__Group__4__Impl rule__MainObject__Group__5 ;
    public final void rule__MainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:951:1: ( rule__MainObject__Group__4__Impl rule__MainObject__Group__5 )
            // InternalJSchema.g:952:2: rule__MainObject__Group__4__Impl rule__MainObject__Group__5
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
    // InternalJSchema.g:959:1: rule__MainObject__Group__4__Impl : ( ( rule__MainObject__Group_4__0 )? ) ;
    public final void rule__MainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:963:1: ( ( ( rule__MainObject__Group_4__0 )? ) )
            // InternalJSchema.g:964:1: ( ( rule__MainObject__Group_4__0 )? )
            {
            // InternalJSchema.g:964:1: ( ( rule__MainObject__Group_4__0 )? )
            // InternalJSchema.g:965:2: ( rule__MainObject__Group_4__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4()); 
            // InternalJSchema.g:966:2: ( rule__MainObject__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=41 && LA13_0<=42)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:966:3: rule__MainObject__Group_4__0
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
    // InternalJSchema.g:974:1: rule__MainObject__Group__5 : rule__MainObject__Group__5__Impl ;
    public final void rule__MainObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:978:1: ( rule__MainObject__Group__5__Impl )
            // InternalJSchema.g:979:2: rule__MainObject__Group__5__Impl
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
    // InternalJSchema.g:985:1: rule__MainObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MainObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:989:1: ( ( '}' ) )
            // InternalJSchema.g:990:1: ( '}' )
            {
            // InternalJSchema.g:990:1: ( '}' )
            // InternalJSchema.g:991:2: '}'
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
    // InternalJSchema.g:1001:1: rule__MainObject__Group_2__0 : rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 ;
    public final void rule__MainObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1005:1: ( rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 )
            // InternalJSchema.g:1006:2: rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1
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
    // InternalJSchema.g:1013:1: rule__MainObject__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__MainObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1017:1: ( ( 'includes' ) )
            // InternalJSchema.g:1018:1: ( 'includes' )
            {
            // InternalJSchema.g:1018:1: ( 'includes' )
            // InternalJSchema.g:1019:2: 'includes'
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
    // InternalJSchema.g:1028:1: rule__MainObject__Group_2__1 : rule__MainObject__Group_2__1__Impl ;
    public final void rule__MainObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1032:1: ( rule__MainObject__Group_2__1__Impl )
            // InternalJSchema.g:1033:2: rule__MainObject__Group_2__1__Impl
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
    // InternalJSchema.g:1039:1: rule__MainObject__Group_2__1__Impl : ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) ;
    public final void rule__MainObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1043:1: ( ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) )
            // InternalJSchema.g:1044:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            {
            // InternalJSchema.g:1044:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            // InternalJSchema.g:1045:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            {
             before(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1()); 
            // InternalJSchema.g:1046:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            // InternalJSchema.g:1046:3: rule__MainObject__IncludeObjectsAssignment_2_1
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
    // InternalJSchema.g:1055:1: rule__MainObject__Group_4__0 : rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 ;
    public final void rule__MainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1059:1: ( rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 )
            // InternalJSchema.g:1060:2: rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1
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
    // InternalJSchema.g:1067:1: rule__MainObject__Group_4__0__Impl : ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) ;
    public final void rule__MainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1071:1: ( ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) )
            // InternalJSchema.g:1072:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            {
            // InternalJSchema.g:1072:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            // InternalJSchema.g:1073:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 
            // InternalJSchema.g:1074:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            // InternalJSchema.g:1074:3: rule__MainObject__PropertiesAssignment_4_0
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
    // InternalJSchema.g:1082:1: rule__MainObject__Group_4__1 : rule__MainObject__Group_4__1__Impl ;
    public final void rule__MainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1086:1: ( rule__MainObject__Group_4__1__Impl )
            // InternalJSchema.g:1087:2: rule__MainObject__Group_4__1__Impl
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
    // InternalJSchema.g:1093:1: rule__MainObject__Group_4__1__Impl : ( ( rule__MainObject__Group_4_1__0 )* ) ;
    public final void rule__MainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1097:1: ( ( ( rule__MainObject__Group_4_1__0 )* ) )
            // InternalJSchema.g:1098:1: ( ( rule__MainObject__Group_4_1__0 )* )
            {
            // InternalJSchema.g:1098:1: ( ( rule__MainObject__Group_4_1__0 )* )
            // InternalJSchema.g:1099:2: ( rule__MainObject__Group_4_1__0 )*
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4_1()); 
            // InternalJSchema.g:1100:2: ( rule__MainObject__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:1100:3: rule__MainObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJSchema.g:1109:1: rule__MainObject__Group_4_1__0 : rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 ;
    public final void rule__MainObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1113:1: ( rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 )
            // InternalJSchema.g:1114:2: rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1
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
    // InternalJSchema.g:1121:1: rule__MainObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MainObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1125:1: ( ( ',' ) )
            // InternalJSchema.g:1126:1: ( ',' )
            {
            // InternalJSchema.g:1126:1: ( ',' )
            // InternalJSchema.g:1127:2: ','
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
    // InternalJSchema.g:1136:1: rule__MainObject__Group_4_1__1 : rule__MainObject__Group_4_1__1__Impl ;
    public final void rule__MainObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1140:1: ( rule__MainObject__Group_4_1__1__Impl )
            // InternalJSchema.g:1141:2: rule__MainObject__Group_4_1__1__Impl
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
    // InternalJSchema.g:1147:1: rule__MainObject__Group_4_1__1__Impl : ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) ;
    public final void rule__MainObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1151:1: ( ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) )
            // InternalJSchema.g:1152:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            {
            // InternalJSchema.g:1152:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            // InternalJSchema.g:1153:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 
            // InternalJSchema.g:1154:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            // InternalJSchema.g:1154:3: rule__MainObject__PropertiesAssignment_4_1_1
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
    // InternalJSchema.g:1163:1: rule__PrimitiveObject__Group__0 : rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 ;
    public final void rule__PrimitiveObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1167:1: ( rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 )
            // InternalJSchema.g:1168:2: rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1
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
    // InternalJSchema.g:1175:1: rule__PrimitiveObject__Group__0__Impl : ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1179:1: ( ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) )
            // InternalJSchema.g:1180:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            {
            // InternalJSchema.g:1180:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            // InternalJSchema.g:1181:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 
            // InternalJSchema.g:1182:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            // InternalJSchema.g:1182:3: rule__PrimitiveObject__TypeAssignment_0
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
    // InternalJSchema.g:1190:1: rule__PrimitiveObject__Group__1 : rule__PrimitiveObject__Group__1__Impl ;
    public final void rule__PrimitiveObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1194:1: ( rule__PrimitiveObject__Group__1__Impl )
            // InternalJSchema.g:1195:2: rule__PrimitiveObject__Group__1__Impl
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
    // InternalJSchema.g:1201:1: rule__PrimitiveObject__Group__1__Impl : ( ( rule__PrimitiveObject__Group_1__0 )? ) ;
    public final void rule__PrimitiveObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1205:1: ( ( ( rule__PrimitiveObject__Group_1__0 )? ) )
            // InternalJSchema.g:1206:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            {
            // InternalJSchema.g:1206:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            // InternalJSchema.g:1207:2: ( rule__PrimitiveObject__Group_1__0 )?
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 
            // InternalJSchema.g:1208:2: ( rule__PrimitiveObject__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJSchema.g:1208:3: rule__PrimitiveObject__Group_1__0
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
    // InternalJSchema.g:1217:1: rule__PrimitiveObject__Group_1__0 : rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 ;
    public final void rule__PrimitiveObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1221:1: ( rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 )
            // InternalJSchema.g:1222:2: rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1
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
    // InternalJSchema.g:1229:1: rule__PrimitiveObject__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__PrimitiveObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1233:1: ( ( 'with' ) )
            // InternalJSchema.g:1234:1: ( 'with' )
            {
            // InternalJSchema.g:1234:1: ( 'with' )
            // InternalJSchema.g:1235:2: 'with'
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
    // InternalJSchema.g:1244:1: rule__PrimitiveObject__Group_1__1 : rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 ;
    public final void rule__PrimitiveObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1248:1: ( rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 )
            // InternalJSchema.g:1249:2: rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2
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
    // InternalJSchema.g:1256:1: rule__PrimitiveObject__Group_1__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1260:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) )
            // InternalJSchema.g:1261:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            {
            // InternalJSchema.g:1261:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            // InternalJSchema.g:1262:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 
            // InternalJSchema.g:1263:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            // InternalJSchema.g:1263:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1
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
    // InternalJSchema.g:1271:1: rule__PrimitiveObject__Group_1__2 : rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 ;
    public final void rule__PrimitiveObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1275:1: ( rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 )
            // InternalJSchema.g:1276:2: rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3
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
    // InternalJSchema.g:1283:1: rule__PrimitiveObject__Group_1__2__Impl : ( ( rule__PrimitiveObject__Group_1_2__0 )* ) ;
    public final void rule__PrimitiveObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1287:1: ( ( ( rule__PrimitiveObject__Group_1_2__0 )* ) )
            // InternalJSchema.g:1288:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            {
            // InternalJSchema.g:1288:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            // InternalJSchema.g:1289:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 
            // InternalJSchema.g:1290:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalJSchema.g:1290:3: rule__PrimitiveObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrimitiveObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalJSchema.g:1298:1: rule__PrimitiveObject__Group_1__3 : rule__PrimitiveObject__Group_1__3__Impl ;
    public final void rule__PrimitiveObject__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1302:1: ( rule__PrimitiveObject__Group_1__3__Impl )
            // InternalJSchema.g:1303:2: rule__PrimitiveObject__Group_1__3__Impl
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
    // InternalJSchema.g:1309:1: rule__PrimitiveObject__Group_1__3__Impl : ( ';' ) ;
    public final void rule__PrimitiveObject__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1313:1: ( ( ';' ) )
            // InternalJSchema.g:1314:1: ( ';' )
            {
            // InternalJSchema.g:1314:1: ( ';' )
            // InternalJSchema.g:1315:2: ';'
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
    // InternalJSchema.g:1325:1: rule__PrimitiveObject__Group_1_2__0 : rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 ;
    public final void rule__PrimitiveObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1329:1: ( rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 )
            // InternalJSchema.g:1330:2: rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1
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
    // InternalJSchema.g:1337:1: rule__PrimitiveObject__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1341:1: ( ( ',' ) )
            // InternalJSchema.g:1342:1: ( ',' )
            {
            // InternalJSchema.g:1342:1: ( ',' )
            // InternalJSchema.g:1343:2: ','
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
    // InternalJSchema.g:1352:1: rule__PrimitiveObject__Group_1_2__1 : rule__PrimitiveObject__Group_1_2__1__Impl ;
    public final void rule__PrimitiveObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1356:1: ( rule__PrimitiveObject__Group_1_2__1__Impl )
            // InternalJSchema.g:1357:2: rule__PrimitiveObject__Group_1_2__1__Impl
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
    // InternalJSchema.g:1363:1: rule__PrimitiveObject__Group_1_2__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1367:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) )
            // InternalJSchema.g:1368:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            {
            // InternalJSchema.g:1368:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            // InternalJSchema.g:1369:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 
            // InternalJSchema.g:1370:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            // InternalJSchema.g:1370:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1
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
    // InternalJSchema.g:1379:1: rule__ExtendedObject__Group__0 : rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1 ;
    public final void rule__ExtendedObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1383:1: ( rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1 )
            // InternalJSchema.g:1384:2: rule__ExtendedObject__Group__0__Impl rule__ExtendedObject__Group__1
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
    // InternalJSchema.g:1391:1: rule__ExtendedObject__Group__0__Impl : ( ( rule__ExtendedObject__ObjectNameAssignment_0 ) ) ;
    public final void rule__ExtendedObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1395:1: ( ( ( rule__ExtendedObject__ObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:1396:1: ( ( rule__ExtendedObject__ObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:1396:1: ( ( rule__ExtendedObject__ObjectNameAssignment_0 ) )
            // InternalJSchema.g:1397:2: ( rule__ExtendedObject__ObjectNameAssignment_0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getObjectNameAssignment_0()); 
            // InternalJSchema.g:1398:2: ( rule__ExtendedObject__ObjectNameAssignment_0 )
            // InternalJSchema.g:1398:3: rule__ExtendedObject__ObjectNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__ObjectNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getObjectNameAssignment_0()); 

            }


            }

        }
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
    // InternalJSchema.g:1406:1: rule__ExtendedObject__Group__1 : rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2 ;
    public final void rule__ExtendedObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1410:1: ( rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2 )
            // InternalJSchema.g:1411:2: rule__ExtendedObject__Group__1__Impl rule__ExtendedObject__Group__2
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
    // InternalJSchema.g:1418:1: rule__ExtendedObject__Group__1__Impl : ( 'extends' ) ;
    public final void rule__ExtendedObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1422:1: ( ( 'extends' ) )
            // InternalJSchema.g:1423:1: ( 'extends' )
            {
            // InternalJSchema.g:1423:1: ( 'extends' )
            // InternalJSchema.g:1424:2: 'extends'
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
    // InternalJSchema.g:1433:1: rule__ExtendedObject__Group__2 : rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3 ;
    public final void rule__ExtendedObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1437:1: ( rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3 )
            // InternalJSchema.g:1438:2: rule__ExtendedObject__Group__2__Impl rule__ExtendedObject__Group__3
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
    // InternalJSchema.g:1445:1: rule__ExtendedObject__Group__2__Impl : ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) ) ;
    public final void rule__ExtendedObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1449:1: ( ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) ) )
            // InternalJSchema.g:1450:1: ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) )
            {
            // InternalJSchema.g:1450:1: ( ( rule__ExtendedObject__ExtendsIDAssignment_2 ) )
            // InternalJSchema.g:1451:2: ( rule__ExtendedObject__ExtendsIDAssignment_2 )
            {
             before(grammarAccess.getExtendedObjectAccess().getExtendsIDAssignment_2()); 
            // InternalJSchema.g:1452:2: ( rule__ExtendedObject__ExtendsIDAssignment_2 )
            // InternalJSchema.g:1452:3: rule__ExtendedObject__ExtendsIDAssignment_2
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
    // InternalJSchema.g:1460:1: rule__ExtendedObject__Group__3 : rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4 ;
    public final void rule__ExtendedObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1464:1: ( rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4 )
            // InternalJSchema.g:1465:2: rule__ExtendedObject__Group__3__Impl rule__ExtendedObject__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalJSchema.g:1472:1: rule__ExtendedObject__Group__3__Impl : ( '{' ) ;
    public final void rule__ExtendedObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1476:1: ( ( '{' ) )
            // InternalJSchema.g:1477:1: ( '{' )
            {
            // InternalJSchema.g:1477:1: ( '{' )
            // InternalJSchema.g:1478:2: '{'
            {
             before(grammarAccess.getExtendedObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalJSchema.g:1487:1: rule__ExtendedObject__Group__4 : rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5 ;
    public final void rule__ExtendedObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1491:1: ( rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5 )
            // InternalJSchema.g:1492:2: rule__ExtendedObject__Group__4__Impl rule__ExtendedObject__Group__5
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
    // InternalJSchema.g:1499:1: rule__ExtendedObject__Group__4__Impl : ( ( rule__ExtendedObject__Group_4__0 )? ) ;
    public final void rule__ExtendedObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1503:1: ( ( ( rule__ExtendedObject__Group_4__0 )? ) )
            // InternalJSchema.g:1504:1: ( ( rule__ExtendedObject__Group_4__0 )? )
            {
            // InternalJSchema.g:1504:1: ( ( rule__ExtendedObject__Group_4__0 )? )
            // InternalJSchema.g:1505:2: ( rule__ExtendedObject__Group_4__0 )?
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup_4()); 
            // InternalJSchema.g:1506:2: ( rule__ExtendedObject__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=40 && LA17_0<=42)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJSchema.g:1506:3: rule__ExtendedObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtendedObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedObjectAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalJSchema.g:1514:1: rule__ExtendedObject__Group__5 : rule__ExtendedObject__Group__5__Impl ;
    public final void rule__ExtendedObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1518:1: ( rule__ExtendedObject__Group__5__Impl )
            // InternalJSchema.g:1519:2: rule__ExtendedObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group__5__Impl();

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
    // InternalJSchema.g:1525:1: rule__ExtendedObject__Group__5__Impl : ( '}' ) ;
    public final void rule__ExtendedObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1529:1: ( ( '}' ) )
            // InternalJSchema.g:1530:1: ( '}' )
            {
            // InternalJSchema.g:1530:1: ( '}' )
            // InternalJSchema.g:1531:2: '}'
            {
             before(grammarAccess.getExtendedObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExtendedObject__Group_4__0"
    // InternalJSchema.g:1541:1: rule__ExtendedObject__Group_4__0 : rule__ExtendedObject__Group_4__0__Impl rule__ExtendedObject__Group_4__1 ;
    public final void rule__ExtendedObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1545:1: ( rule__ExtendedObject__Group_4__0__Impl rule__ExtendedObject__Group_4__1 )
            // InternalJSchema.g:1546:2: rule__ExtendedObject__Group_4__0__Impl rule__ExtendedObject__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtendedObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_4__0"


    // $ANTLR start "rule__ExtendedObject__Group_4__0__Impl"
    // InternalJSchema.g:1553:1: rule__ExtendedObject__Group_4__0__Impl : ( ( rule__ExtendedObject__Alternatives_4_0 ) ) ;
    public final void rule__ExtendedObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1557:1: ( ( ( rule__ExtendedObject__Alternatives_4_0 ) ) )
            // InternalJSchema.g:1558:1: ( ( rule__ExtendedObject__Alternatives_4_0 ) )
            {
            // InternalJSchema.g:1558:1: ( ( rule__ExtendedObject__Alternatives_4_0 ) )
            // InternalJSchema.g:1559:2: ( rule__ExtendedObject__Alternatives_4_0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getAlternatives_4_0()); 
            // InternalJSchema.g:1560:2: ( rule__ExtendedObject__Alternatives_4_0 )
            // InternalJSchema.g:1560:3: rule__ExtendedObject__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4__1"
    // InternalJSchema.g:1568:1: rule__ExtendedObject__Group_4__1 : rule__ExtendedObject__Group_4__1__Impl ;
    public final void rule__ExtendedObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1572:1: ( rule__ExtendedObject__Group_4__1__Impl )
            // InternalJSchema.g:1573:2: rule__ExtendedObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_4__1"


    // $ANTLR start "rule__ExtendedObject__Group_4__1__Impl"
    // InternalJSchema.g:1579:1: rule__ExtendedObject__Group_4__1__Impl : ( ( rule__ExtendedObject__Alternatives_4_1 )* ) ;
    public final void rule__ExtendedObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1583:1: ( ( ( rule__ExtendedObject__Alternatives_4_1 )* ) )
            // InternalJSchema.g:1584:1: ( ( rule__ExtendedObject__Alternatives_4_1 )* )
            {
            // InternalJSchema.g:1584:1: ( ( rule__ExtendedObject__Alternatives_4_1 )* )
            // InternalJSchema.g:1585:2: ( rule__ExtendedObject__Alternatives_4_1 )*
            {
             before(grammarAccess.getExtendedObjectAccess().getAlternatives_4_1()); 
            // InternalJSchema.g:1586:2: ( rule__ExtendedObject__Alternatives_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==36||(LA18_0>=41 && LA18_0<=42)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJSchema.g:1586:3: rule__ExtendedObject__Alternatives_4_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ExtendedObject__Alternatives_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExtendedObjectAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_0_0__0"
    // InternalJSchema.g:1595:1: rule__ExtendedObject__Group_4_0_0__0 : rule__ExtendedObject__Group_4_0_0__0__Impl rule__ExtendedObject__Group_4_0_0__1 ;
    public final void rule__ExtendedObject__Group_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1599:1: ( rule__ExtendedObject__Group_4_0_0__0__Impl rule__ExtendedObject__Group_4_0_0__1 )
            // InternalJSchema.g:1600:2: rule__ExtendedObject__Group_4_0_0__0__Impl rule__ExtendedObject__Group_4_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ExtendedObject__Group_4_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_0_0__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_0_0__0"


    // $ANTLR start "rule__ExtendedObject__Group_4_0_0__0__Impl"
    // InternalJSchema.g:1607:1: rule__ExtendedObject__Group_4_0_0__0__Impl : ( 'override' ) ;
    public final void rule__ExtendedObject__Group_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1611:1: ( ( 'override' ) )
            // InternalJSchema.g:1612:1: ( 'override' )
            {
            // InternalJSchema.g:1612:1: ( 'override' )
            // InternalJSchema.g:1613:2: 'override'
            {
             before(grammarAccess.getExtendedObjectAccess().getOverrideKeyword_4_0_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getOverrideKeyword_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_0_0__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_0_0__1"
    // InternalJSchema.g:1622:1: rule__ExtendedObject__Group_4_0_0__1 : rule__ExtendedObject__Group_4_0_0__1__Impl ;
    public final void rule__ExtendedObject__Group_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1626:1: ( rule__ExtendedObject__Group_4_0_0__1__Impl )
            // InternalJSchema.g:1627:2: rule__ExtendedObject__Group_4_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_0_0__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_0_0__1"


    // $ANTLR start "rule__ExtendedObject__Group_4_0_0__1__Impl"
    // InternalJSchema.g:1633:1: rule__ExtendedObject__Group_4_0_0__1__Impl : ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 ) ) ;
    public final void rule__ExtendedObject__Group_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1637:1: ( ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 ) ) )
            // InternalJSchema.g:1638:1: ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 ) )
            {
            // InternalJSchema.g:1638:1: ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 ) )
            // InternalJSchema.g:1639:2: ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 )
            {
             before(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_0_0_1()); 
            // InternalJSchema.g:1640:2: ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 )
            // InternalJSchema.g:1640:3: rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_0_0__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0__0"
    // InternalJSchema.g:1649:1: rule__ExtendedObject__Group_4_1_0__0 : rule__ExtendedObject__Group_4_1_0__0__Impl rule__ExtendedObject__Group_4_1_0__1 ;
    public final void rule__ExtendedObject__Group_4_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1653:1: ( rule__ExtendedObject__Group_4_1_0__0__Impl rule__ExtendedObject__Group_4_1_0__1 )
            // InternalJSchema.g:1654:2: rule__ExtendedObject__Group_4_1_0__0__Impl rule__ExtendedObject__Group_4_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ExtendedObject__Group_4_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_1_0__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0__0"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0__0__Impl"
    // InternalJSchema.g:1661:1: rule__ExtendedObject__Group_4_1_0__0__Impl : ( ',' ) ;
    public final void rule__ExtendedObject__Group_4_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1665:1: ( ( ',' ) )
            // InternalJSchema.g:1666:1: ( ',' )
            {
            // InternalJSchema.g:1666:1: ( ',' )
            // InternalJSchema.g:1667:2: ','
            {
             before(grammarAccess.getExtendedObjectAccess().getCommaKeyword_4_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getCommaKeyword_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0__1"
    // InternalJSchema.g:1676:1: rule__ExtendedObject__Group_4_1_0__1 : rule__ExtendedObject__Group_4_1_0__1__Impl ;
    public final void rule__ExtendedObject__Group_4_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1680:1: ( rule__ExtendedObject__Group_4_1_0__1__Impl )
            // InternalJSchema.g:1681:2: rule__ExtendedObject__Group_4_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_1_0__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0__1"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0__1__Impl"
    // InternalJSchema.g:1687:1: rule__ExtendedObject__Group_4_1_0__1__Impl : ( ( rule__ExtendedObject__Group_4_1_0_1__0 ) ) ;
    public final void rule__ExtendedObject__Group_4_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1691:1: ( ( ( rule__ExtendedObject__Group_4_1_0_1__0 ) ) )
            // InternalJSchema.g:1692:1: ( ( rule__ExtendedObject__Group_4_1_0_1__0 ) )
            {
            // InternalJSchema.g:1692:1: ( ( rule__ExtendedObject__Group_4_1_0_1__0 ) )
            // InternalJSchema.g:1693:2: ( rule__ExtendedObject__Group_4_1_0_1__0 )
            {
             before(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0_1()); 
            // InternalJSchema.g:1694:2: ( rule__ExtendedObject__Group_4_1_0_1__0 )
            // InternalJSchema.g:1694:3: rule__ExtendedObject__Group_4_1_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_1_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getGroup_4_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0__1__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0_1__0"
    // InternalJSchema.g:1703:1: rule__ExtendedObject__Group_4_1_0_1__0 : rule__ExtendedObject__Group_4_1_0_1__0__Impl rule__ExtendedObject__Group_4_1_0_1__1 ;
    public final void rule__ExtendedObject__Group_4_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1707:1: ( rule__ExtendedObject__Group_4_1_0_1__0__Impl rule__ExtendedObject__Group_4_1_0_1__1 )
            // InternalJSchema.g:1708:2: rule__ExtendedObject__Group_4_1_0_1__0__Impl rule__ExtendedObject__Group_4_1_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ExtendedObject__Group_4_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_1_0_1__1();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0_1__0"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0_1__0__Impl"
    // InternalJSchema.g:1715:1: rule__ExtendedObject__Group_4_1_0_1__0__Impl : ( 'override' ) ;
    public final void rule__ExtendedObject__Group_4_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1719:1: ( ( 'override' ) )
            // InternalJSchema.g:1720:1: ( 'override' )
            {
            // InternalJSchema.g:1720:1: ( 'override' )
            // InternalJSchema.g:1721:2: 'override'
            {
             before(grammarAccess.getExtendedObjectAccess().getOverrideKeyword_4_1_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getOverrideKeyword_4_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0_1__0__Impl"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0_1__1"
    // InternalJSchema.g:1730:1: rule__ExtendedObject__Group_4_1_0_1__1 : rule__ExtendedObject__Group_4_1_0_1__1__Impl ;
    public final void rule__ExtendedObject__Group_4_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1734:1: ( rule__ExtendedObject__Group_4_1_0_1__1__Impl )
            // InternalJSchema.g:1735:2: rule__ExtendedObject__Group_4_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__Group_4_1_0_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0_1__1"


    // $ANTLR start "rule__ExtendedObject__Group_4_1_0_1__1__Impl"
    // InternalJSchema.g:1741:1: rule__ExtendedObject__Group_4_1_0_1__1__Impl : ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 ) ) ;
    public final void rule__ExtendedObject__Group_4_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1745:1: ( ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 ) ) )
            // InternalJSchema.g:1746:1: ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 ) )
            {
            // InternalJSchema.g:1746:1: ( ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 ) )
            // InternalJSchema.g:1747:2: ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 )
            {
             before(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_1_0_1_1()); 
            // InternalJSchema.g:1748:2: ( rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 )
            // InternalJSchema.g:1748:3: rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesAssignment_4_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__Group_4_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__0"
    // InternalJSchema.g:1757:1: rule__PrimitiveTypes__Group_0__0 : rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 ;
    public final void rule__PrimitiveTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1761:1: ( rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 )
            // InternalJSchema.g:1762:2: rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalJSchema.g:1769:1: rule__PrimitiveTypes__Group_0__0__Impl : ( 'String' ) ;
    public final void rule__PrimitiveTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1773:1: ( ( 'String' ) )
            // InternalJSchema.g:1774:1: ( 'String' )
            {
            // InternalJSchema.g:1774:1: ( 'String' )
            // InternalJSchema.g:1775:2: 'String'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJSchema.g:1784:1: rule__PrimitiveTypes__Group_0__1 : rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2 ;
    public final void rule__PrimitiveTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1788:1: ( rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2 )
            // InternalJSchema.g:1789:2: rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__2();

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
    // InternalJSchema.g:1796:1: rule__PrimitiveTypes__Group_0__1__Impl : ( ( rule__PrimitiveTypes__StringNameAssignment_0_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1800:1: ( ( ( rule__PrimitiveTypes__StringNameAssignment_0_1 ) ) )
            // InternalJSchema.g:1801:1: ( ( rule__PrimitiveTypes__StringNameAssignment_0_1 ) )
            {
            // InternalJSchema.g:1801:1: ( ( rule__PrimitiveTypes__StringNameAssignment_0_1 ) )
            // InternalJSchema.g:1802:2: ( rule__PrimitiveTypes__StringNameAssignment_0_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringNameAssignment_0_1()); 
            // InternalJSchema.g:1803:2: ( rule__PrimitiveTypes__StringNameAssignment_0_1 )
            // InternalJSchema.g:1803:3: rule__PrimitiveTypes__StringNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__StringNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getStringNameAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypes__Group_0__2"
    // InternalJSchema.g:1811:1: rule__PrimitiveTypes__Group_0__2 : rule__PrimitiveTypes__Group_0__2__Impl ;
    public final void rule__PrimitiveTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1815:1: ( rule__PrimitiveTypes__Group_0__2__Impl )
            // InternalJSchema.g:1816:2: rule__PrimitiveTypes__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__2__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__2"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__2__Impl"
    // InternalJSchema.g:1822:1: rule__PrimitiveTypes__Group_0__2__Impl : ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) ) ;
    public final void rule__PrimitiveTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1826:1: ( ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) ) )
            // InternalJSchema.g:1827:1: ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) )
            {
            // InternalJSchema.g:1827:1: ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) )
            // InternalJSchema.g:1828:2: ( rule__PrimitiveTypes__StringAssignment_0_2 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_2()); 
            // InternalJSchema.g:1829:2: ( rule__PrimitiveTypes__StringAssignment_0_2 )
            // InternalJSchema.g:1829:3: rule__PrimitiveTypes__StringAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__StringAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__2__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0"
    // InternalJSchema.g:1838:1: rule__PrimitiveTypes__Group_2__0 : rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 ;
    public final void rule__PrimitiveTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1842:1: ( rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 )
            // InternalJSchema.g:1843:2: rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalJSchema.g:1850:1: rule__PrimitiveTypes__Group_2__0__Impl : ( 'num' ) ;
    public final void rule__PrimitiveTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1854:1: ( ( 'num' ) )
            // InternalJSchema.g:1855:1: ( 'num' )
            {
            // InternalJSchema.g:1855:1: ( 'num' )
            // InternalJSchema.g:1856:2: 'num'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJSchema.g:1865:1: rule__PrimitiveTypes__Group_2__1 : rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2 ;
    public final void rule__PrimitiveTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1869:1: ( rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2 )
            // InternalJSchema.g:1870:2: rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__2();

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
    // InternalJSchema.g:1877:1: rule__PrimitiveTypes__Group_2__1__Impl : ( ( rule__PrimitiveTypes__NumIDAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1881:1: ( ( ( rule__PrimitiveTypes__NumIDAssignment_2_1 ) ) )
            // InternalJSchema.g:1882:1: ( ( rule__PrimitiveTypes__NumIDAssignment_2_1 ) )
            {
            // InternalJSchema.g:1882:1: ( ( rule__PrimitiveTypes__NumIDAssignment_2_1 ) )
            // InternalJSchema.g:1883:2: ( rule__PrimitiveTypes__NumIDAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumIDAssignment_2_1()); 
            // InternalJSchema.g:1884:2: ( rule__PrimitiveTypes__NumIDAssignment_2_1 )
            // InternalJSchema.g:1884:3: rule__PrimitiveTypes__NumIDAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__NumIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getNumIDAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypes__Group_2__2"
    // InternalJSchema.g:1892:1: rule__PrimitiveTypes__Group_2__2 : rule__PrimitiveTypes__Group_2__2__Impl ;
    public final void rule__PrimitiveTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1896:1: ( rule__PrimitiveTypes__Group_2__2__Impl )
            // InternalJSchema.g:1897:2: rule__PrimitiveTypes__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__2__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__2"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__2__Impl"
    // InternalJSchema.g:1903:1: rule__PrimitiveTypes__Group_2__2__Impl : ( ( rule__PrimitiveTypes__NumberAssignment_2_2 )? ) ;
    public final void rule__PrimitiveTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1907:1: ( ( ( rule__PrimitiveTypes__NumberAssignment_2_2 )? ) )
            // InternalJSchema.g:1908:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_2 )? )
            {
            // InternalJSchema.g:1908:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_2 )? )
            // InternalJSchema.g:1909:2: ( rule__PrimitiveTypes__NumberAssignment_2_2 )?
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_2()); 
            // InternalJSchema.g:1910:2: ( rule__PrimitiveTypes__NumberAssignment_2_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJSchema.g:1910:3: rule__PrimitiveTypes__NumberAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__NumberAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__2__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0"
    // InternalJSchema.g:1919:1: rule__PrimitiveProperties__Group_0__0 : rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 ;
    public final void rule__PrimitiveProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1923:1: ( rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 )
            // InternalJSchema.g:1924:2: rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1
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
    // InternalJSchema.g:1931:1: rule__PrimitiveProperties__Group_0__0__Impl : ( 'length' ) ;
    public final void rule__PrimitiveProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1935:1: ( ( 'length' ) )
            // InternalJSchema.g:1936:1: ( 'length' )
            {
            // InternalJSchema.g:1936:1: ( 'length' )
            // InternalJSchema.g:1937:2: 'length'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJSchema.g:1946:1: rule__PrimitiveProperties__Group_0__1 : rule__PrimitiveProperties__Group_0__1__Impl ;
    public final void rule__PrimitiveProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1950:1: ( rule__PrimitiveProperties__Group_0__1__Impl )
            // InternalJSchema.g:1951:2: rule__PrimitiveProperties__Group_0__1__Impl
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
    // InternalJSchema.g:1957:1: rule__PrimitiveProperties__Group_0__1__Impl : ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1961:1: ( ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) )
            // InternalJSchema.g:1962:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            {
            // InternalJSchema.g:1962:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            // InternalJSchema.g:1963:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1()); 
            // InternalJSchema.g:1964:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            // InternalJSchema.g:1964:3: rule__PrimitiveProperties__StringLengthAssignment_0_1
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
    // InternalJSchema.g:1973:1: rule__PrimitiveProperties__Group_1__0 : rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 ;
    public final void rule__PrimitiveProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1977:1: ( rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 )
            // InternalJSchema.g:1978:2: rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1
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
    // InternalJSchema.g:1985:1: rule__PrimitiveProperties__Group_1__0__Impl : ( 'pattern' ) ;
    public final void rule__PrimitiveProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1989:1: ( ( 'pattern' ) )
            // InternalJSchema.g:1990:1: ( 'pattern' )
            {
            // InternalJSchema.g:1990:1: ( 'pattern' )
            // InternalJSchema.g:1991:2: 'pattern'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJSchema.g:2000:1: rule__PrimitiveProperties__Group_1__1 : rule__PrimitiveProperties__Group_1__1__Impl ;
    public final void rule__PrimitiveProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2004:1: ( rule__PrimitiveProperties__Group_1__1__Impl )
            // InternalJSchema.g:2005:2: rule__PrimitiveProperties__Group_1__1__Impl
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
    // InternalJSchema.g:2011:1: rule__PrimitiveProperties__Group_1__1__Impl : ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2015:1: ( ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) )
            // InternalJSchema.g:2016:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            {
            // InternalJSchema.g:2016:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            // InternalJSchema.g:2017:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 
            // InternalJSchema.g:2018:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            // InternalJSchema.g:2018:3: rule__PrimitiveProperties__PatternStringAssignment_1_1
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
    // InternalJSchema.g:2027:1: rule__PrimitiveProperties__Group_2__0 : rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 ;
    public final void rule__PrimitiveProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2031:1: ( rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 )
            // InternalJSchema.g:2032:2: rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJSchema.g:2039:1: rule__PrimitiveProperties__Group_2__0__Impl : ( 'format' ) ;
    public final void rule__PrimitiveProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2043:1: ( ( 'format' ) )
            // InternalJSchema.g:2044:1: ( 'format' )
            {
            // InternalJSchema.g:2044:1: ( 'format' )
            // InternalJSchema.g:2045:2: 'format'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalJSchema.g:2054:1: rule__PrimitiveProperties__Group_2__1 : rule__PrimitiveProperties__Group_2__1__Impl ;
    public final void rule__PrimitiveProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2058:1: ( rule__PrimitiveProperties__Group_2__1__Impl )
            // InternalJSchema.g:2059:2: rule__PrimitiveProperties__Group_2__1__Impl
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
    // InternalJSchema.g:2065:1: rule__PrimitiveProperties__Group_2__1__Impl : ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2069:1: ( ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) )
            // InternalJSchema.g:2070:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            {
            // InternalJSchema.g:2070:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            // InternalJSchema.g:2071:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 
            // InternalJSchema.g:2072:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            // InternalJSchema.g:2072:3: rule__PrimitiveProperties__StringFormatAssignment_2_1
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
    // InternalJSchema.g:2081:1: rule__StringLength__Group__0 : rule__StringLength__Group__0__Impl rule__StringLength__Group__1 ;
    public final void rule__StringLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2085:1: ( rule__StringLength__Group__0__Impl rule__StringLength__Group__1 )
            // InternalJSchema.g:2086:2: rule__StringLength__Group__0__Impl rule__StringLength__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalJSchema.g:2093:1: rule__StringLength__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2097:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2098:1: ( RULE_INT )
            {
            // InternalJSchema.g:2098:1: ( RULE_INT )
            // InternalJSchema.g:2099:2: RULE_INT
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
    // InternalJSchema.g:2108:1: rule__StringLength__Group__1 : rule__StringLength__Group__1__Impl rule__StringLength__Group__2 ;
    public final void rule__StringLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2112:1: ( rule__StringLength__Group__1__Impl rule__StringLength__Group__2 )
            // InternalJSchema.g:2113:2: rule__StringLength__Group__1__Impl rule__StringLength__Group__2
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
    // InternalJSchema.g:2120:1: rule__StringLength__Group__1__Impl : ( '-' ) ;
    public final void rule__StringLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2124:1: ( ( '-' ) )
            // InternalJSchema.g:2125:1: ( '-' )
            {
            // InternalJSchema.g:2125:1: ( '-' )
            // InternalJSchema.g:2126:2: '-'
            {
             before(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalJSchema.g:2135:1: rule__StringLength__Group__2 : rule__StringLength__Group__2__Impl ;
    public final void rule__StringLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2139:1: ( rule__StringLength__Group__2__Impl )
            // InternalJSchema.g:2140:2: rule__StringLength__Group__2__Impl
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
    // InternalJSchema.g:2146:1: rule__StringLength__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2150:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2151:1: ( RULE_INT )
            {
            // InternalJSchema.g:2151:1: ( RULE_INT )
            // InternalJSchema.g:2152:2: RULE_INT
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
    // InternalJSchema.g:2162:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2166:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalJSchema.g:2167:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
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
    // InternalJSchema.g:2174:1: rule__Includes__Group__0__Impl : ( ( rule__Includes__ObjectIDAssignment_0 ) ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2178:1: ( ( ( rule__Includes__ObjectIDAssignment_0 ) ) )
            // InternalJSchema.g:2179:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            {
            // InternalJSchema.g:2179:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            // InternalJSchema.g:2180:2: ( rule__Includes__ObjectIDAssignment_0 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 
            // InternalJSchema.g:2181:2: ( rule__Includes__ObjectIDAssignment_0 )
            // InternalJSchema.g:2181:3: rule__Includes__ObjectIDAssignment_0
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
    // InternalJSchema.g:2189:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2193:1: ( rule__Includes__Group__1__Impl )
            // InternalJSchema.g:2194:2: rule__Includes__Group__1__Impl
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
    // InternalJSchema.g:2200:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__Group_1__0 )* ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2204:1: ( ( ( rule__Includes__Group_1__0 )* ) )
            // InternalJSchema.g:2205:1: ( ( rule__Includes__Group_1__0 )* )
            {
            // InternalJSchema.g:2205:1: ( ( rule__Includes__Group_1__0 )* )
            // InternalJSchema.g:2206:2: ( rule__Includes__Group_1__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_1()); 
            // InternalJSchema.g:2207:2: ( rule__Includes__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJSchema.g:2207:3: rule__Includes__Group_1__0
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
    // InternalJSchema.g:2216:1: rule__Includes__Group_1__0 : rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 ;
    public final void rule__Includes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2220:1: ( rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 )
            // InternalJSchema.g:2221:2: rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1
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
    // InternalJSchema.g:2228:1: rule__Includes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2232:1: ( ( ',' ) )
            // InternalJSchema.g:2233:1: ( ',' )
            {
            // InternalJSchema.g:2233:1: ( ',' )
            // InternalJSchema.g:2234:2: ','
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
    // InternalJSchema.g:2243:1: rule__Includes__Group_1__1 : rule__Includes__Group_1__1__Impl ;
    public final void rule__Includes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2247:1: ( rule__Includes__Group_1__1__Impl )
            // InternalJSchema.g:2248:2: rule__Includes__Group_1__1__Impl
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
    // InternalJSchema.g:2254:1: rule__Includes__Group_1__1__Impl : ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) ;
    public final void rule__Includes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2258:1: ( ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) )
            // InternalJSchema.g:2259:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            {
            // InternalJSchema.g:2259:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            // InternalJSchema.g:2260:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 
            // InternalJSchema.g:2261:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            // InternalJSchema.g:2261:3: rule__Includes__ObjectIDAssignment_1_1
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
    // InternalJSchema.g:2270:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2274:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSchema.g:2275:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJSchema.g:2282:1: rule__Array__Group__0__Impl : ( ( rule__Array__ArrayNameAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2286:1: ( ( ( rule__Array__ArrayNameAssignment_0 ) ) )
            // InternalJSchema.g:2287:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            {
            // InternalJSchema.g:2287:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            // InternalJSchema.g:2288:2: ( rule__Array__ArrayNameAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 
            // InternalJSchema.g:2289:2: ( rule__Array__ArrayNameAssignment_0 )
            // InternalJSchema.g:2289:3: rule__Array__ArrayNameAssignment_0
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
    // InternalJSchema.g:2297:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2301:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSchema.g:2302:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2309:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2313:1: ( ( '[' ) )
            // InternalJSchema.g:2314:1: ( '[' )
            {
            // InternalJSchema.g:2314:1: ( '[' )
            // InternalJSchema.g:2315:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalJSchema.g:2324:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2328:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSchema.g:2329:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2336:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2340:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSchema.g:2341:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSchema.g:2341:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSchema.g:2342:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSchema.g:2343:2: ( rule__Array__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=41 && LA21_0<=42)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJSchema.g:2343:3: rule__Array__Group_2__0
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
    // InternalJSchema.g:2351:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2355:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // InternalJSchema.g:2356:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2363:1: rule__Array__Group__3__Impl : ( ( rule__Array__ArrayTypeAssignment_3 )? ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2367:1: ( ( ( rule__Array__ArrayTypeAssignment_3 )? ) )
            // InternalJSchema.g:2368:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            {
            // InternalJSchema.g:2368:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            // InternalJSchema.g:2369:2: ( rule__Array__ArrayTypeAssignment_3 )?
            {
             before(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 
            // InternalJSchema.g:2370:2: ( rule__Array__ArrayTypeAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=11 && LA22_0<=14)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJSchema.g:2370:3: rule__Array__ArrayTypeAssignment_3
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
    // InternalJSchema.g:2378:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2382:1: ( rule__Array__Group__4__Impl )
            // InternalJSchema.g:2383:2: rule__Array__Group__4__Impl
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
    // InternalJSchema.g:2389:1: rule__Array__Group__4__Impl : ( ']' ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2393:1: ( ( ']' ) )
            // InternalJSchema.g:2394:1: ( ']' )
            {
            // InternalJSchema.g:2394:1: ( ']' )
            // InternalJSchema.g:2395:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJSchema.g:2405:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2409:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSchema.g:2410:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
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
    // InternalJSchema.g:2417:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__PropertiesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2421:1: ( ( ( rule__Array__PropertiesAssignment_2_0 ) ) )
            // InternalJSchema.g:2422:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            {
            // InternalJSchema.g:2422:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            // InternalJSchema.g:2423:2: ( rule__Array__PropertiesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 
            // InternalJSchema.g:2424:2: ( rule__Array__PropertiesAssignment_2_0 )
            // InternalJSchema.g:2424:3: rule__Array__PropertiesAssignment_2_0
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
    // InternalJSchema.g:2432:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2436:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSchema.g:2437:2: rule__Array__Group_2__1__Impl
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
    // InternalJSchema.g:2443:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2447:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSchema.g:2448:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSchema.g:2448:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSchema.g:2449:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSchema.g:2450:2: ( rule__Array__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJSchema.g:2450:3: rule__Array__Group_2_1__0
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
    // InternalJSchema.g:2459:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2463:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSchema.g:2464:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
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
    // InternalJSchema.g:2471:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2475:1: ( ( ',' ) )
            // InternalJSchema.g:2476:1: ( ',' )
            {
            // InternalJSchema.g:2476:1: ( ',' )
            // InternalJSchema.g:2477:2: ','
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
    // InternalJSchema.g:2486:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2490:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSchema.g:2491:2: rule__Array__Group_2_1__1__Impl
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
    // InternalJSchema.g:2497:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2501:1: ( ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) )
            // InternalJSchema.g:2502:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            {
            // InternalJSchema.g:2502:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            // InternalJSchema.g:2503:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 
            // InternalJSchema.g:2504:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            // InternalJSchema.g:2504:3: rule__Array__PropertiesAssignment_2_1_1
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
    // InternalJSchema.g:2513:1: rule__Model__AbstractObjectAssignment : ( ruleAbstractObject ) ;
    public final void rule__Model__AbstractObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2517:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2518:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2518:2: ( ruleAbstractObject )
            // InternalJSchema.g:2519:3: ruleAbstractObject
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
    // InternalJSchema.g:2528:1: rule__Number__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__Number__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2532:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2533:2: ( RULE_INT )
            {
            // InternalJSchema.g:2533:2: ( RULE_INT )
            // InternalJSchema.g:2534:3: RULE_INT
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
    // InternalJSchema.g:2543:1: rule__Number__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2547:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2548:2: ( RULE_INT )
            {
            // InternalJSchema.g:2548:2: ( RULE_INT )
            // InternalJSchema.g:2549:3: RULE_INT
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
    // InternalJSchema.g:2558:1: rule__MainObject__ObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MainObject__ObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2562:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2563:2: ( RULE_ID )
            {
            // InternalJSchema.g:2563:2: ( RULE_ID )
            // InternalJSchema.g:2564:3: RULE_ID
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
    // InternalJSchema.g:2573:1: rule__MainObject__RootAssignment_1 : ( ruleIsRoot ) ;
    public final void rule__MainObject__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2577:1: ( ( ruleIsRoot ) )
            // InternalJSchema.g:2578:2: ( ruleIsRoot )
            {
            // InternalJSchema.g:2578:2: ( ruleIsRoot )
            // InternalJSchema.g:2579:3: ruleIsRoot
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
    // InternalJSchema.g:2588:1: rule__MainObject__IncludeObjectsAssignment_2_1 : ( ruleIncludes ) ;
    public final void rule__MainObject__IncludeObjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2592:1: ( ( ruleIncludes ) )
            // InternalJSchema.g:2593:2: ( ruleIncludes )
            {
            // InternalJSchema.g:2593:2: ( ruleIncludes )
            // InternalJSchema.g:2594:3: ruleIncludes
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
    // InternalJSchema.g:2603:1: rule__MainObject__PropertiesAssignment_4_0 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2607:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2608:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2608:2: ( rulehasProperties )
            // InternalJSchema.g:2609:3: rulehasProperties
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
    // InternalJSchema.g:2618:1: rule__MainObject__PropertiesAssignment_4_1_1 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2622:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2623:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2623:2: ( rulehasProperties )
            // InternalJSchema.g:2624:3: rulehasProperties
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
    // InternalJSchema.g:2633:1: rule__PrimitiveObject__TypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__PrimitiveObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2637:1: ( ( rulePrimitiveTypes ) )
            // InternalJSchema.g:2638:2: ( rulePrimitiveTypes )
            {
            // InternalJSchema.g:2638:2: ( rulePrimitiveTypes )
            // InternalJSchema.g:2639:3: rulePrimitiveTypes
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
    // InternalJSchema.g:2648:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2652:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2653:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2653:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2654:3: rulePrimitiveProperties
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
    // InternalJSchema.g:2663:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2667:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2668:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2668:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2669:3: rulePrimitiveProperties
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


    // $ANTLR start "rule__ExtendedObject__ObjectNameAssignment_0"
    // InternalJSchema.g:2678:1: rule__ExtendedObject__ObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExtendedObject__ObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2682:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2683:2: ( RULE_ID )
            {
            // InternalJSchema.g:2683:2: ( RULE_ID )
            // InternalJSchema.g:2684:3: RULE_ID
            {
             before(grammarAccess.getExtendedObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendedObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__ObjectNameAssignment_0"


    // $ANTLR start "rule__ExtendedObject__ExtendsIDAssignment_2"
    // InternalJSchema.g:2693:1: rule__ExtendedObject__ExtendsIDAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ExtendedObject__ExtendsIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2697:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2698:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2698:2: ( RULE_STRING )
            // InternalJSchema.g:2699:3: RULE_STRING
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


    // $ANTLR start "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1"
    // InternalJSchema.g:2708:1: rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1 : ( rulehasProperties ) ;
    public final void rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2712:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2713:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2713:2: ( rulehasProperties )
            // InternalJSchema.g:2714:3: rulehasProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesHasPropertiesParserRuleCall_4_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesHasPropertiesParserRuleCall_4_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_0_0_1"


    // $ANTLR start "rule__ExtendedObject__PropertiesAssignment_4_0_1"
    // InternalJSchema.g:2723:1: rule__ExtendedObject__PropertiesAssignment_4_0_1 : ( rulehasProperties ) ;
    public final void rule__ExtendedObject__PropertiesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2727:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2728:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2728:2: ( rulehasProperties )
            // InternalJSchema.g:2729:3: rulehasProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__PropertiesAssignment_4_0_1"


    // $ANTLR start "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1"
    // InternalJSchema.g:2738:1: rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1 : ( rulehasProperties ) ;
    public final void rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2742:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2743:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2743:2: ( rulehasProperties )
            // InternalJSchema.g:2744:3: rulehasProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesHasPropertiesParserRuleCall_4_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getOverRiddenPropertiesHasPropertiesParserRuleCall_4_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__OverRiddenPropertiesAssignment_4_1_0_1_1"


    // $ANTLR start "rule__ExtendedObject__PropertiesAssignment_4_1_1"
    // InternalJSchema.g:2753:1: rule__ExtendedObject__PropertiesAssignment_4_1_1 : ( rulehasProperties ) ;
    public final void rule__ExtendedObject__PropertiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2757:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2758:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2758:2: ( rulehasProperties )
            // InternalJSchema.g:2759:3: rulehasProperties
            {
             before(grammarAccess.getExtendedObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getExtendedObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedObject__PropertiesAssignment_4_1_1"


    // $ANTLR start "rule__PrimitiveTypes__StringNameAssignment_0_1"
    // InternalJSchema.g:2768:1: rule__PrimitiveTypes__StringNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypes__StringNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2772:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2773:2: ( RULE_ID )
            {
            // InternalJSchema.g:2773:2: ( RULE_ID )
            // InternalJSchema.g:2774:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__StringNameAssignment_0_1"


    // $ANTLR start "rule__PrimitiveTypes__StringAssignment_0_2"
    // InternalJSchema.g:2783:1: rule__PrimitiveTypes__StringAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__PrimitiveTypes__StringAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2787:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2788:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2788:2: ( RULE_STRING )
            // InternalJSchema.g:2789:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__StringAssignment_0_2"


    // $ANTLR start "rule__PrimitiveTypes__ArrayAssignment_1"
    // InternalJSchema.g:2798:1: rule__PrimitiveTypes__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__PrimitiveTypes__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2802:1: ( ( ruleArray ) )
            // InternalJSchema.g:2803:2: ( ruleArray )
            {
            // InternalJSchema.g:2803:2: ( ruleArray )
            // InternalJSchema.g:2804:3: ruleArray
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


    // $ANTLR start "rule__PrimitiveTypes__NumIDAssignment_2_1"
    // InternalJSchema.g:2813:1: rule__PrimitiveTypes__NumIDAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypes__NumIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2817:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2818:2: ( RULE_ID )
            {
            // InternalJSchema.g:2818:2: ( RULE_ID )
            // InternalJSchema.g:2819:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumIDIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getNumIDIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NumIDAssignment_2_1"


    // $ANTLR start "rule__PrimitiveTypes__NumberAssignment_2_2"
    // InternalJSchema.g:2828:1: rule__PrimitiveTypes__NumberAssignment_2_2 : ( ruleNumber ) ;
    public final void rule__PrimitiveTypes__NumberAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2832:1: ( ( ruleNumber ) )
            // InternalJSchema.g:2833:2: ( ruleNumber )
            {
            // InternalJSchema.g:2833:2: ( ruleNumber )
            // InternalJSchema.g:2834:3: ruleNumber
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NumberAssignment_2_2"


    // $ANTLR start "rule__IsRoot__StringAssignment"
    // InternalJSchema.g:2843:1: rule__IsRoot__StringAssignment : ( ( 'root' ) ) ;
    public final void rule__IsRoot__StringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2847:1: ( ( ( 'root' ) ) )
            // InternalJSchema.g:2848:2: ( ( 'root' ) )
            {
            // InternalJSchema.g:2848:2: ( ( 'root' ) )
            // InternalJSchema.g:2849:3: ( 'root' )
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            // InternalJSchema.g:2850:3: ( 'root' )
            // InternalJSchema.g:2851:4: 'root'
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
    // InternalJSchema.g:2862:1: rule__HasProperties__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__HasProperties__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2866:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2867:2: ( ruleProperty )
            {
            // InternalJSchema.g:2867:2: ( ruleProperty )
            // InternalJSchema.g:2868:3: ruleProperty
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
    // InternalJSchema.g:2877:1: rule__Property__PropPrimAssignment_0 : ( rulePrimitiveObject ) ;
    public final void rule__Property__PropPrimAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2881:1: ( ( rulePrimitiveObject ) )
            // InternalJSchema.g:2882:2: ( rulePrimitiveObject )
            {
            // InternalJSchema.g:2882:2: ( rulePrimitiveObject )
            // InternalJSchema.g:2883:3: rulePrimitiveObject
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
    // InternalJSchema.g:2892:1: rule__Property__PropObjAssignment_1 : ( ruleMainObject ) ;
    public final void rule__Property__PropObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2896:1: ( ( ruleMainObject ) )
            // InternalJSchema.g:2897:2: ( ruleMainObject )
            {
            // InternalJSchema.g:2897:2: ( ruleMainObject )
            // InternalJSchema.g:2898:3: ruleMainObject
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
    // InternalJSchema.g:2907:1: rule__PrimitiveProperties__StringLengthAssignment_0_1 : ( ruleStringLength ) ;
    public final void rule__PrimitiveProperties__StringLengthAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2911:1: ( ( ruleStringLength ) )
            // InternalJSchema.g:2912:2: ( ruleStringLength )
            {
            // InternalJSchema.g:2912:2: ( ruleStringLength )
            // InternalJSchema.g:2913:3: ruleStringLength
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
    // InternalJSchema.g:2922:1: rule__PrimitiveProperties__PatternStringAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveProperties__PatternStringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2926:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2927:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2927:2: ( RULE_STRING )
            // InternalJSchema.g:2928:3: RULE_STRING
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
    // InternalJSchema.g:2937:1: rule__PrimitiveProperties__StringFormatAssignment_2_1 : ( ruleFormatTypes ) ;
    public final void rule__PrimitiveProperties__StringFormatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2941:1: ( ( ruleFormatTypes ) )
            // InternalJSchema.g:2942:2: ( ruleFormatTypes )
            {
            // InternalJSchema.g:2942:2: ( ruleFormatTypes )
            // InternalJSchema.g:2943:3: ruleFormatTypes
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
    // InternalJSchema.g:2952:1: rule__Includes__ObjectIDAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2956:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2957:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2957:2: ( RULE_STRING )
            // InternalJSchema.g:2958:3: RULE_STRING
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
    // InternalJSchema.g:2967:1: rule__Includes__ObjectIDAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2971:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2972:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2972:2: ( RULE_STRING )
            // InternalJSchema.g:2973:3: RULE_STRING
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
    // InternalJSchema.g:2982:1: rule__Array__ArrayNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Array__ArrayNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2986:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2987:2: ( RULE_ID )
            {
            // InternalJSchema.g:2987:2: ( RULE_ID )
            // InternalJSchema.g:2988:3: RULE_ID
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
    // InternalJSchema.g:2997:1: rule__Array__PropertiesAssignment_2_0 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:3001:1: ( ( ruleProperty ) )
            // InternalJSchema.g:3002:2: ( ruleProperty )
            {
            // InternalJSchema.g:3002:2: ( ruleProperty )
            // InternalJSchema.g:3003:3: ruleProperty
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
    // InternalJSchema.g:3012:1: rule__Array__PropertiesAssignment_2_1_1 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:3016:1: ( ( ruleProperty ) )
            // InternalJSchema.g:3017:2: ( ruleProperty )
            {
            // InternalJSchema.g:3017:2: ( ruleProperty )
            // InternalJSchema.g:3018:3: ruleProperty
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
    // InternalJSchema.g:3027:1: rule__Array__ArrayTypeAssignment_3 : ( ruleArrayType ) ;
    public final void rule__Array__ArrayTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:3031:1: ( ( ruleArrayType ) )
            // InternalJSchema.g:3032:2: ( ruleArrayType )
            {
            // InternalJSchema.g:3032:2: ( ruleArrayType )
            // InternalJSchema.g:3033:3: ruleArrayType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000060000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000A00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000060400000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000060000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000070400000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000061000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000061000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000FFFF8000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001060000007820L});

}
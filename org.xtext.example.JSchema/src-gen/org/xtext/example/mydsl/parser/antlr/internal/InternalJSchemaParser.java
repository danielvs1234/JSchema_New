package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'includes'", "'{'", "','", "'}'", "'with'", "';'", "'extends'", "'override'", "'String'", "'num'", "'root'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'", "'string'", "'integer'", "'float'", "'double'", "'null'", "'date-time'", "'time'", "'date'", "'email'", "'idn-email'", "'hostname'", "'ipv4'", "'ipv6'", "'uri'", "'uri-reference'", "'iri'", "'iri-reference'", "'uri-template'", "'json-pointer'", "'relative-json-pointer'", "'regex'"
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

        public InternalJSchemaParser(TokenStream input, JSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJSchema.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJSchema.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalJSchema.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalJSchema.g:72:1: ruleModel returns [EObject current=null] : ( (lv_AbstractObject_0_0= ruleAbstractObject ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_AbstractObject_0_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:78:2: ( ( (lv_AbstractObject_0_0= ruleAbstractObject ) )* )
            // InternalJSchema.g:79:2: ( (lv_AbstractObject_0_0= ruleAbstractObject ) )*
            {
            // InternalJSchema.g:79:2: ( (lv_AbstractObject_0_0= ruleAbstractObject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJSchema.g:80:3: (lv_AbstractObject_0_0= ruleAbstractObject )
            	    {
            	    // InternalJSchema.g:80:3: (lv_AbstractObject_0_0= ruleAbstractObject )
            	    // InternalJSchema.g:81:4: lv_AbstractObject_0_0= ruleAbstractObject
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_AbstractObject_0_0=ruleAbstractObject();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"AbstractObject",
            	    					lv_AbstractObject_0_0,
            	    					"org.xtext.example.mydsl.JSchema.AbstractObject");
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


    // $ANTLR start "entryRuleNumber"
    // InternalJSchema.g:101:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalJSchema.g:101:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSchema.g:102:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSchema.g:108:1: ruleNumber returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:114:2: ( ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // InternalJSchema.g:115:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // InternalJSchema.g:115:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // InternalJSchema.g:116:3: ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // InternalJSchema.g:116:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalJSchema.g:117:4: (lv_number_0_0= RULE_INT )
            {
            // InternalJSchema.g:117:4: (lv_number_0_0= RULE_INT )
            // InternalJSchema.g:118:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_number_0_0, grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJSchema.g:134:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:135:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJSchema.g:139:4: ( (lv_decimal_2_0= RULE_INT ) )
                    // InternalJSchema.g:140:5: (lv_decimal_2_0= RULE_INT )
                    {
                    // InternalJSchema.g:140:5: (lv_decimal_2_0= RULE_INT )
                    // InternalJSchema.g:141:6: lv_decimal_2_0= RULE_INT
                    {
                    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_decimal_2_0, grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"decimal",
                    							lv_decimal_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleAbstractObject"
    // InternalJSchema.g:162:1: entryRuleAbstractObject returns [EObject current=null] : iv_ruleAbstractObject= ruleAbstractObject EOF ;
    public final EObject entryRuleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractObject = null;


        try {
            // InternalJSchema.g:162:55: (iv_ruleAbstractObject= ruleAbstractObject EOF )
            // InternalJSchema.g:163:2: iv_ruleAbstractObject= ruleAbstractObject EOF
            {
             newCompositeNode(grammarAccess.getAbstractObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractObject=ruleAbstractObject();

            state._fsp--;

             current =iv_ruleAbstractObject; 
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
    // $ANTLR end "entryRuleAbstractObject"


    // $ANTLR start "ruleAbstractObject"
    // InternalJSchema.g:169:1: ruleAbstractObject returns [EObject current=null] : (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject | this_ExtendedObject_2= ruleExtendedObject ) ;
    public final EObject ruleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject this_MainObject_0 = null;

        EObject this_PrimitiveObject_1 = null;

        EObject this_ExtendedObject_2 = null;



        	enterRule();

        try {
            // InternalJSchema.g:175:2: ( (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject | this_ExtendedObject_2= ruleExtendedObject ) )
            // InternalJSchema.g:176:2: (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject | this_ExtendedObject_2= ruleExtendedObject )
            {
            // InternalJSchema.g:176:2: (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject | this_ExtendedObject_2= ruleExtendedObject )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt3=3;
                    }
                    break;
                case 12:
                case 13:
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA3_0>=20 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:177:3: this_MainObject_0= ruleMainObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MainObject_0=ruleMainObject();

                    state._fsp--;


                    			current = this_MainObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:186:3: this_PrimitiveObject_1= rulePrimitiveObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveObject_1=rulePrimitiveObject();

                    state._fsp--;


                    			current = this_PrimitiveObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJSchema.g:195:3: this_ExtendedObject_2= ruleExtendedObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getExtendedObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtendedObject_2=ruleExtendedObject();

                    state._fsp--;


                    			current = this_ExtendedObject_2;
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
    // $ANTLR end "ruleAbstractObject"


    // $ANTLR start "entryRuleMainObject"
    // InternalJSchema.g:207:1: entryRuleMainObject returns [EObject current=null] : iv_ruleMainObject= ruleMainObject EOF ;
    public final EObject entryRuleMainObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainObject = null;


        try {
            // InternalJSchema.g:207:51: (iv_ruleMainObject= ruleMainObject EOF )
            // InternalJSchema.g:208:2: iv_ruleMainObject= ruleMainObject EOF
            {
             newCompositeNode(grammarAccess.getMainObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainObject=ruleMainObject();

            state._fsp--;

             current =iv_ruleMainObject; 
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
    // $ANTLR end "entryRuleMainObject"


    // $ANTLR start "ruleMainObject"
    // InternalJSchema.g:214:1: ruleMainObject returns [EObject current=null] : ( ( (lv_objectName_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleMainObject() throws RecognitionException {
        EObject current = null;

        Token lv_objectName_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_root_1_0 = null;

        EObject lv_includeObjects_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:220:2: ( ( ( (lv_objectName_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )? otherlv_8= '}' ) )
            // InternalJSchema.g:221:2: ( ( (lv_objectName_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )? otherlv_8= '}' )
            {
            // InternalJSchema.g:221:2: ( ( (lv_objectName_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )? otherlv_8= '}' )
            // InternalJSchema.g:222:3: ( (lv_objectName_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )? otherlv_4= '{' ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )? otherlv_8= '}'
            {
            // InternalJSchema.g:222:3: ( (lv_objectName_0_0= RULE_ID ) )
            // InternalJSchema.g:223:4: (lv_objectName_0_0= RULE_ID )
            {
            // InternalJSchema.g:223:4: (lv_objectName_0_0= RULE_ID )
            // InternalJSchema.g:224:5: lv_objectName_0_0= RULE_ID
            {
            lv_objectName_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_objectName_0_0, grammarAccess.getMainObjectAccess().getObjectNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objectName",
            						lv_objectName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJSchema.g:240:3: ( (lv_root_1_0= ruleIsRoot ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:241:4: (lv_root_1_0= ruleIsRoot )
                    {
                    // InternalJSchema.g:241:4: (lv_root_1_0= ruleIsRoot )
                    // InternalJSchema.g:242:5: lv_root_1_0= ruleIsRoot
                    {

                    					newCompositeNode(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_root_1_0=ruleIsRoot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainObjectRule());
                    					}
                    					set(
                    						current,
                    						"root",
                    						lv_root_1_0,
                    						"org.xtext.example.mydsl.JSchema.IsRoot");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJSchema.g:259:3: (otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSchema.g:260:4: otherlv_2= 'includes' ( (lv_includeObjects_3_0= ruleIncludes ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMainObjectAccess().getIncludesKeyword_2_0());
                    			
                    // InternalJSchema.g:264:4: ( (lv_includeObjects_3_0= ruleIncludes ) )
                    // InternalJSchema.g:265:5: (lv_includeObjects_3_0= ruleIncludes )
                    {
                    // InternalJSchema.g:265:5: (lv_includeObjects_3_0= ruleIncludes )
                    // InternalJSchema.g:266:6: lv_includeObjects_3_0= ruleIncludes
                    {

                    						newCompositeNode(grammarAccess.getMainObjectAccess().getIncludeObjectsIncludesParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_includeObjects_3_0=ruleIncludes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainObjectRule());
                    						}
                    						set(
                    							current,
                    							"includeObjects",
                    							lv_includeObjects_3_0,
                    							"org.xtext.example.mydsl.JSchema.Includes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJSchema.g:288:3: ( ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:289:4: ( (lv_properties_5_0= rulehasProperties ) ) (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )*
                    {
                    // InternalJSchema.g:289:4: ( (lv_properties_5_0= rulehasProperties ) )
                    // InternalJSchema.g:290:5: (lv_properties_5_0= rulehasProperties )
                    {
                    // InternalJSchema.g:290:5: (lv_properties_5_0= rulehasProperties )
                    // InternalJSchema.g:291:6: lv_properties_5_0= rulehasProperties
                    {

                    						newCompositeNode(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_5_0=rulehasProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainObjectRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"org.xtext.example.mydsl.JSchema.hasProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:308:4: (otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJSchema.g:309:5: otherlv_6= ',' ( (lv_properties_7_0= rulehasProperties ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJSchema.g:313:5: ( (lv_properties_7_0= rulehasProperties ) )
                    	    // InternalJSchema.g:314:6: (lv_properties_7_0= rulehasProperties )
                    	    {
                    	    // InternalJSchema.g:314:6: (lv_properties_7_0= rulehasProperties )
                    	    // InternalJSchema.g:315:7: lv_properties_7_0= rulehasProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_7_0=rulehasProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMainObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_7_0,
                    	    								"org.xtext.example.mydsl.JSchema.hasProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMainObject"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:342:1: entryRulePrimitiveObject returns [EObject current=null] : iv_rulePrimitiveObject= rulePrimitiveObject EOF ;
    public final EObject entryRulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveObject = null;


        try {
            // InternalJSchema.g:342:56: (iv_rulePrimitiveObject= rulePrimitiveObject EOF )
            // InternalJSchema.g:343:2: iv_rulePrimitiveObject= rulePrimitiveObject EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveObject=rulePrimitiveObject();

            state._fsp--;

             current =iv_rulePrimitiveObject; 
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
    // $ANTLR end "entryRulePrimitiveObject"


    // $ANTLR start "rulePrimitiveObject"
    // InternalJSchema.g:349:1: rulePrimitiveObject returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) ;
    public final EObject rulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_primitiveProperties_2_0 = null;

        EObject lv_primitiveProperties_4_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:355:2: ( ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) )
            // InternalJSchema.g:356:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            {
            // InternalJSchema.g:356:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            // InternalJSchema.g:357:3: ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            {
            // InternalJSchema.g:357:3: ( (lv_type_0_0= rulePrimitiveTypes ) )
            // InternalJSchema.g:358:4: (lv_type_0_0= rulePrimitiveTypes )
            {
            // InternalJSchema.g:358:4: (lv_type_0_0= rulePrimitiveTypes )
            // InternalJSchema.g:359:5: lv_type_0_0= rulePrimitiveTypes
            {

            					newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_0_0=rulePrimitiveTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.JSchema.PrimitiveTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJSchema.g:376:3: (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:377:4: otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0());
                    			
                    // InternalJSchema.g:381:4: ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) )
                    // InternalJSchema.g:382:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    {
                    // InternalJSchema.g:382:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    // InternalJSchema.g:383:6: lv_primitiveProperties_2_0= rulePrimitiveProperties
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_primitiveProperties_2_0=rulePrimitiveProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
                    						}
                    						add(
                    							current,
                    							"primitiveProperties",
                    							lv_primitiveProperties_2_0,
                    							"org.xtext.example.mydsl.JSchema.PrimitiveProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:400:4: (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJSchema.g:401:5: otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJSchema.g:405:5: ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    // InternalJSchema.g:406:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    {
                    	    // InternalJSchema.g:406:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    // InternalJSchema.g:407:7: lv_primitiveProperties_4_0= rulePrimitiveProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_primitiveProperties_4_0=rulePrimitiveProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"primitiveProperties",
                    	    								lv_primitiveProperties_4_0,
                    	    								"org.xtext.example.mydsl.JSchema.PrimitiveProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "rulePrimitiveObject"


    // $ANTLR start "entryRuleExtendedObject"
    // InternalJSchema.g:434:1: entryRuleExtendedObject returns [EObject current=null] : iv_ruleExtendedObject= ruleExtendedObject EOF ;
    public final EObject entryRuleExtendedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedObject = null;


        try {
            // InternalJSchema.g:434:55: (iv_ruleExtendedObject= ruleExtendedObject EOF )
            // InternalJSchema.g:435:2: iv_ruleExtendedObject= ruleExtendedObject EOF
            {
             newCompositeNode(grammarAccess.getExtendedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendedObject=ruleExtendedObject();

            state._fsp--;

             current =iv_ruleExtendedObject; 
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
    // $ANTLR end "entryRuleExtendedObject"


    // $ANTLR start "ruleExtendedObject"
    // InternalJSchema.g:441:1: ruleExtendedObject returns [EObject current=null] : ( ( (lv_exObjectName_0_0= RULE_ID ) ) otherlv_1= 'extends' ( (lv_extendsID_2_0= RULE_STRING ) ) (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )? otherlv_5= '{' ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleExtendedObject() throws RecognitionException {
        EObject current = null;

        Token lv_exObjectName_0_0=null;
        Token otherlv_1=null;
        Token lv_extendsID_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_includeObjects_4_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:447:2: ( ( ( (lv_exObjectName_0_0= RULE_ID ) ) otherlv_1= 'extends' ( (lv_extendsID_2_0= RULE_STRING ) ) (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )? otherlv_5= '{' ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )? otherlv_9= '}' ) )
            // InternalJSchema.g:448:2: ( ( (lv_exObjectName_0_0= RULE_ID ) ) otherlv_1= 'extends' ( (lv_extendsID_2_0= RULE_STRING ) ) (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )? otherlv_5= '{' ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )? otherlv_9= '}' )
            {
            // InternalJSchema.g:448:2: ( ( (lv_exObjectName_0_0= RULE_ID ) ) otherlv_1= 'extends' ( (lv_extendsID_2_0= RULE_STRING ) ) (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )? otherlv_5= '{' ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )? otherlv_9= '}' )
            // InternalJSchema.g:449:3: ( (lv_exObjectName_0_0= RULE_ID ) ) otherlv_1= 'extends' ( (lv_extendsID_2_0= RULE_STRING ) ) (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )? otherlv_5= '{' ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )? otherlv_9= '}'
            {
            // InternalJSchema.g:449:3: ( (lv_exObjectName_0_0= RULE_ID ) )
            // InternalJSchema.g:450:4: (lv_exObjectName_0_0= RULE_ID )
            {
            // InternalJSchema.g:450:4: (lv_exObjectName_0_0= RULE_ID )
            // InternalJSchema.g:451:5: lv_exObjectName_0_0= RULE_ID
            {
            lv_exObjectName_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_exObjectName_0_0, grammarAccess.getExtendedObjectAccess().getExObjectNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exObjectName",
            						lv_exObjectName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendedObjectAccess().getExtendsKeyword_1());
            		
            // InternalJSchema.g:471:3: ( (lv_extendsID_2_0= RULE_STRING ) )
            // InternalJSchema.g:472:4: (lv_extendsID_2_0= RULE_STRING )
            {
            // InternalJSchema.g:472:4: (lv_extendsID_2_0= RULE_STRING )
            // InternalJSchema.g:473:5: lv_extendsID_2_0= RULE_STRING
            {
            lv_extendsID_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_extendsID_2_0, grammarAccess.getExtendedObjectAccess().getExtendsIDSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"extendsID",
            						lv_extendsID_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalJSchema.g:489:3: (otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:490:4: otherlv_3= 'includes' ( (lv_includeObjects_4_0= ruleIncludes ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendedObjectAccess().getIncludesKeyword_3_0());
                    			
                    // InternalJSchema.g:494:4: ( (lv_includeObjects_4_0= ruleIncludes ) )
                    // InternalJSchema.g:495:5: (lv_includeObjects_4_0= ruleIncludes )
                    {
                    // InternalJSchema.g:495:5: (lv_includeObjects_4_0= ruleIncludes )
                    // InternalJSchema.g:496:6: lv_includeObjects_4_0= ruleIncludes
                    {

                    						newCompositeNode(grammarAccess.getExtendedObjectAccess().getIncludeObjectsIncludesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_includeObjects_4_0=ruleIncludes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtendedObjectRule());
                    						}
                    						set(
                    							current,
                    							"includeObjects",
                    							lv_includeObjects_4_0,
                    							"org.xtext.example.mydsl.JSchema.Includes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendedObjectAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalJSchema.g:518:3: ( ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=21)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJSchema.g:519:4: ( (lv_body_6_0= ruleExtendedProperties ) ) (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )*
                    {
                    // InternalJSchema.g:519:4: ( (lv_body_6_0= ruleExtendedProperties ) )
                    // InternalJSchema.g:520:5: (lv_body_6_0= ruleExtendedProperties )
                    {
                    // InternalJSchema.g:520:5: (lv_body_6_0= ruleExtendedProperties )
                    // InternalJSchema.g:521:6: lv_body_6_0= ruleExtendedProperties
                    {

                    						newCompositeNode(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_body_6_0=ruleExtendedProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtendedObjectRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_6_0,
                    							"org.xtext.example.mydsl.JSchema.ExtendedProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:538:4: (otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalJSchema.g:539:5: otherlv_7= ',' ( (lv_body_8_0= ruleExtendedProperties ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExtendedObjectAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalJSchema.g:543:5: ( (lv_body_8_0= ruleExtendedProperties ) )
                    	    // InternalJSchema.g:544:6: (lv_body_8_0= ruleExtendedProperties )
                    	    {
                    	    // InternalJSchema.g:544:6: (lv_body_8_0= ruleExtendedProperties )
                    	    // InternalJSchema.g:545:7: lv_body_8_0= ruleExtendedProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtendedObjectAccess().getBodyExtendedPropertiesParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_body_8_0=ruleExtendedProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExtendedObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_8_0,
                    	    								"org.xtext.example.mydsl.JSchema.ExtendedProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExtendedObjectAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExtendedObject"


    // $ANTLR start "entryRuleExtendedProperties"
    // InternalJSchema.g:572:1: entryRuleExtendedProperties returns [EObject current=null] : iv_ruleExtendedProperties= ruleExtendedProperties EOF ;
    public final EObject entryRuleExtendedProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedProperties = null;


        try {
            // InternalJSchema.g:572:59: (iv_ruleExtendedProperties= ruleExtendedProperties EOF )
            // InternalJSchema.g:573:2: iv_ruleExtendedProperties= ruleExtendedProperties EOF
            {
             newCompositeNode(grammarAccess.getExtendedPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendedProperties=ruleExtendedProperties();

            state._fsp--;

             current =iv_ruleExtendedProperties; 
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
    // $ANTLR end "entryRuleExtendedProperties"


    // $ANTLR start "ruleExtendedProperties"
    // InternalJSchema.g:579:1: ruleExtendedProperties returns [EObject current=null] : ( ( (lv_override_0_0= 'override' ) )? ( (lv_extendedProperties_1_0= rulehasProperties ) ) ) ;
    public final EObject ruleExtendedProperties() throws RecognitionException {
        EObject current = null;

        Token lv_override_0_0=null;
        EObject lv_extendedProperties_1_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:585:2: ( ( ( (lv_override_0_0= 'override' ) )? ( (lv_extendedProperties_1_0= rulehasProperties ) ) ) )
            // InternalJSchema.g:586:2: ( ( (lv_override_0_0= 'override' ) )? ( (lv_extendedProperties_1_0= rulehasProperties ) ) )
            {
            // InternalJSchema.g:586:2: ( ( (lv_override_0_0= 'override' ) )? ( (lv_extendedProperties_1_0= rulehasProperties ) ) )
            // InternalJSchema.g:587:3: ( (lv_override_0_0= 'override' ) )? ( (lv_extendedProperties_1_0= rulehasProperties ) )
            {
            // InternalJSchema.g:587:3: ( (lv_override_0_0= 'override' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:588:4: (lv_override_0_0= 'override' )
                    {
                    // InternalJSchema.g:588:4: (lv_override_0_0= 'override' )
                    // InternalJSchema.g:589:5: lv_override_0_0= 'override'
                    {
                    lv_override_0_0=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(lv_override_0_0, grammarAccess.getExtendedPropertiesAccess().getOverrideOverrideKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExtendedPropertiesRule());
                    					}
                    					setWithLastConsumed(current, "override", lv_override_0_0, "override");
                    				

                    }


                    }
                    break;

            }

            // InternalJSchema.g:601:3: ( (lv_extendedProperties_1_0= rulehasProperties ) )
            // InternalJSchema.g:602:4: (lv_extendedProperties_1_0= rulehasProperties )
            {
            // InternalJSchema.g:602:4: (lv_extendedProperties_1_0= rulehasProperties )
            // InternalJSchema.g:603:5: lv_extendedProperties_1_0= rulehasProperties
            {

            					newCompositeNode(grammarAccess.getExtendedPropertiesAccess().getExtendedPropertiesHasPropertiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_extendedProperties_1_0=rulehasProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendedPropertiesRule());
            					}
            					set(
            						current,
            						"extendedProperties",
            						lv_extendedProperties_1_0,
            						"org.xtext.example.mydsl.JSchema.hasProperties");
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
    // $ANTLR end "ruleExtendedProperties"


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalJSchema.g:624:1: entryRulePrimitiveTypes returns [EObject current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final EObject entryRulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypes = null;


        try {
            // InternalJSchema.g:624:55: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // InternalJSchema.g:625:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes; 
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
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalJSchema.g:631:1: rulePrimitiveTypes returns [EObject current=null] : ( (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? ) ) ;
    public final EObject rulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;
        Token otherlv_3=null;
        EObject lv_array_2_0 = null;

        EObject lv_number_4_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:637:2: ( ( (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? ) ) )
            // InternalJSchema.g:638:2: ( (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? ) )
            {
            // InternalJSchema.g:638:2: ( (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJSchema.g:639:3: (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:639:3: (otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) ) )
                    // InternalJSchema.g:640:4: otherlv_0= 'String' ( (lv_string_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0());
                    			
                    // InternalJSchema.g:644:4: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalJSchema.g:645:5: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalJSchema.g:645:5: (lv_string_1_0= RULE_STRING )
                    // InternalJSchema.g:646:6: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_1_0, grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:664:3: ( (lv_array_2_0= ruleArray ) )
                    {
                    // InternalJSchema.g:664:3: ( (lv_array_2_0= ruleArray ) )
                    // InternalJSchema.g:665:4: (lv_array_2_0= ruleArray )
                    {
                    // InternalJSchema.g:665:4: (lv_array_2_0= ruleArray )
                    // InternalJSchema.g:666:5: lv_array_2_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_2_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypesRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_2_0,
                    						"org.xtext.example.mydsl.JSchema.Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:684:3: (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? )
                    {
                    // InternalJSchema.g:684:3: (otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )? )
                    // InternalJSchema.g:685:4: otherlv_3= 'num' ( (lv_number_4_0= ruleNumber ) )?
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0());
                    			
                    // InternalJSchema.g:689:4: ( (lv_number_4_0= ruleNumber ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJSchema.g:690:5: (lv_number_4_0= ruleNumber )
                            {
                            // InternalJSchema.g:690:5: (lv_number_4_0= ruleNumber )
                            // InternalJSchema.g:691:6: lv_number_4_0= ruleNumber
                            {

                            						newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_number_4_0=ruleNumber();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimitiveTypesRule());
                            						}
                            						set(
                            							current,
                            							"number",
                            							lv_number_4_0,
                            							"org.xtext.example.mydsl.JSchema.Number");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleIsRoot"
    // InternalJSchema.g:713:1: entryRuleIsRoot returns [EObject current=null] : iv_ruleIsRoot= ruleIsRoot EOF ;
    public final EObject entryRuleIsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsRoot = null;


        try {
            // InternalJSchema.g:713:47: (iv_ruleIsRoot= ruleIsRoot EOF )
            // InternalJSchema.g:714:2: iv_ruleIsRoot= ruleIsRoot EOF
            {
             newCompositeNode(grammarAccess.getIsRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsRoot=ruleIsRoot();

            state._fsp--;

             current =iv_ruleIsRoot; 
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
    // $ANTLR end "entryRuleIsRoot"


    // $ANTLR start "ruleIsRoot"
    // InternalJSchema.g:720:1: ruleIsRoot returns [EObject current=null] : ( (lv_string_0_0= 'root' ) ) ;
    public final EObject ruleIsRoot() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:726:2: ( ( (lv_string_0_0= 'root' ) ) )
            // InternalJSchema.g:727:2: ( (lv_string_0_0= 'root' ) )
            {
            // InternalJSchema.g:727:2: ( (lv_string_0_0= 'root' ) )
            // InternalJSchema.g:728:3: (lv_string_0_0= 'root' )
            {
            // InternalJSchema.g:728:3: (lv_string_0_0= 'root' )
            // InternalJSchema.g:729:4: lv_string_0_0= 'root'
            {
            lv_string_0_0=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getIsRootAccess().getStringRootKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIsRootRule());
            				}
            				setWithLastConsumed(current, "string", lv_string_0_0, "root");
            			

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
    // $ANTLR end "ruleIsRoot"


    // $ANTLR start "entryRulehasProperties"
    // InternalJSchema.g:744:1: entryRulehasProperties returns [EObject current=null] : iv_rulehasProperties= rulehasProperties EOF ;
    public final EObject entryRulehasProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehasProperties = null;


        try {
            // InternalJSchema.g:744:54: (iv_rulehasProperties= rulehasProperties EOF )
            // InternalJSchema.g:745:2: iv_rulehasProperties= rulehasProperties EOF
            {
             newCompositeNode(grammarAccess.getHasPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehasProperties=rulehasProperties();

            state._fsp--;

             current =iv_rulehasProperties; 
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
    // $ANTLR end "entryRulehasProperties"


    // $ANTLR start "rulehasProperties"
    // InternalJSchema.g:751:1: rulehasProperties returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) ) ;
    public final EObject rulehasProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:757:2: ( ( (lv_properties_0_0= ruleProperty ) ) )
            // InternalJSchema.g:758:2: ( (lv_properties_0_0= ruleProperty ) )
            {
            // InternalJSchema.g:758:2: ( (lv_properties_0_0= ruleProperty ) )
            // InternalJSchema.g:759:3: (lv_properties_0_0= ruleProperty )
            {
            // InternalJSchema.g:759:3: (lv_properties_0_0= ruleProperty )
            // InternalJSchema.g:760:4: lv_properties_0_0= ruleProperty
            {

            				newCompositeNode(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_properties_0_0=ruleProperty();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getHasPropertiesRule());
            				}
            				set(
            					current,
            					"properties",
            					lv_properties_0_0,
            					"org.xtext.example.mydsl.JSchema.Property");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulehasProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:780:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJSchema.g:780:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJSchema.g:781:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJSchema.g:787:1: ruleProperty returns [EObject current=null] : ( ( (lv_propPrim_0_0= rulePrimitiveObject ) ) | ( (lv_propObj_1_0= ruleMainObject ) ) | ( (lv_propExtObj_2_0= ruleExtendedObject ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject lv_propPrim_0_0 = null;

        EObject lv_propObj_1_0 = null;

        EObject lv_propExtObj_2_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:793:2: ( ( ( (lv_propPrim_0_0= rulePrimitiveObject ) ) | ( (lv_propObj_1_0= ruleMainObject ) ) | ( (lv_propExtObj_2_0= ruleExtendedObject ) ) ) )
            // InternalJSchema.g:794:2: ( ( (lv_propPrim_0_0= rulePrimitiveObject ) ) | ( (lv_propObj_1_0= ruleMainObject ) ) | ( (lv_propExtObj_2_0= ruleExtendedObject ) ) )
            {
            // InternalJSchema.g:794:2: ( ( (lv_propPrim_0_0= rulePrimitiveObject ) ) | ( (lv_propObj_1_0= ruleMainObject ) ) | ( (lv_propExtObj_2_0= ruleExtendedObject ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=21)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt16=1;
                    }
                    break;
                case 12:
                case 13:
                case 22:
                    {
                    alt16=2;
                    }
                    break;
                case 18:
                    {
                    alt16=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalJSchema.g:795:3: ( (lv_propPrim_0_0= rulePrimitiveObject ) )
                    {
                    // InternalJSchema.g:795:3: ( (lv_propPrim_0_0= rulePrimitiveObject ) )
                    // InternalJSchema.g:796:4: (lv_propPrim_0_0= rulePrimitiveObject )
                    {
                    // InternalJSchema.g:796:4: (lv_propPrim_0_0= rulePrimitiveObject )
                    // InternalJSchema.g:797:5: lv_propPrim_0_0= rulePrimitiveObject
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropPrimPrimitiveObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propPrim_0_0=rulePrimitiveObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propPrim",
                    						lv_propPrim_0_0,
                    						"org.xtext.example.mydsl.JSchema.PrimitiveObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:815:3: ( (lv_propObj_1_0= ruleMainObject ) )
                    {
                    // InternalJSchema.g:815:3: ( (lv_propObj_1_0= ruleMainObject ) )
                    // InternalJSchema.g:816:4: (lv_propObj_1_0= ruleMainObject )
                    {
                    // InternalJSchema.g:816:4: (lv_propObj_1_0= ruleMainObject )
                    // InternalJSchema.g:817:5: lv_propObj_1_0= ruleMainObject
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropObjMainObjectParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propObj_1_0=ruleMainObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propObj",
                    						lv_propObj_1_0,
                    						"org.xtext.example.mydsl.JSchema.MainObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:835:3: ( (lv_propExtObj_2_0= ruleExtendedObject ) )
                    {
                    // InternalJSchema.g:835:3: ( (lv_propExtObj_2_0= ruleExtendedObject ) )
                    // InternalJSchema.g:836:4: (lv_propExtObj_2_0= ruleExtendedObject )
                    {
                    // InternalJSchema.g:836:4: (lv_propExtObj_2_0= ruleExtendedObject )
                    // InternalJSchema.g:837:5: lv_propExtObj_2_0= ruleExtendedObject
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPropExtObjExtendedObjectParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propExtObj_2_0=ruleExtendedObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"propExtObj",
                    						lv_propExtObj_2_0,
                    						"org.xtext.example.mydsl.JSchema.ExtendedObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePrimitiveProperties"
    // InternalJSchema.g:858:1: entryRulePrimitiveProperties returns [EObject current=null] : iv_rulePrimitiveProperties= rulePrimitiveProperties EOF ;
    public final EObject entryRulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveProperties = null;


        try {
            // InternalJSchema.g:858:60: (iv_rulePrimitiveProperties= rulePrimitiveProperties EOF )
            // InternalJSchema.g:859:2: iv_rulePrimitiveProperties= rulePrimitiveProperties EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveProperties=rulePrimitiveProperties();

            state._fsp--;

             current =iv_rulePrimitiveProperties; 
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
    // $ANTLR end "entryRulePrimitiveProperties"


    // $ANTLR start "rulePrimitiveProperties"
    // InternalJSchema.g:865:1: rulePrimitiveProperties returns [EObject current=null] : ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) ;
    public final EObject rulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_patternString_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_stringLength_1_0 = null;

        Enumerator lv_stringFormat_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:871:2: ( ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) )
            // InternalJSchema.g:872:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            {
            // InternalJSchema.g:872:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalJSchema.g:873:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    {
                    // InternalJSchema.g:873:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    // InternalJSchema.g:874:4: otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0());
                    			
                    // InternalJSchema.g:878:4: ( (lv_stringLength_1_0= ruleStringLength ) )
                    // InternalJSchema.g:879:5: (lv_stringLength_1_0= ruleStringLength )
                    {
                    // InternalJSchema.g:879:5: (lv_stringLength_1_0= ruleStringLength )
                    // InternalJSchema.g:880:6: lv_stringLength_1_0= ruleStringLength
                    {

                    						newCompositeNode(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stringLength_1_0=ruleStringLength();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						set(
                    							current,
                    							"stringLength",
                    							lv_stringLength_1_0,
                    							"org.xtext.example.mydsl.JSchema.StringLength");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:899:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:899:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    // InternalJSchema.g:900:4: otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0());
                    			
                    // InternalJSchema.g:904:4: ( (lv_patternString_3_0= RULE_STRING ) )
                    // InternalJSchema.g:905:5: (lv_patternString_3_0= RULE_STRING )
                    {
                    // InternalJSchema.g:905:5: (lv_patternString_3_0= RULE_STRING )
                    // InternalJSchema.g:906:6: lv_patternString_3_0= RULE_STRING
                    {
                    lv_patternString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_patternString_3_0, grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"patternString",
                    							lv_patternString_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:924:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    {
                    // InternalJSchema.g:924:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    // InternalJSchema.g:925:4: otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0());
                    			
                    // InternalJSchema.g:929:4: ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    // InternalJSchema.g:930:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    {
                    // InternalJSchema.g:930:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    // InternalJSchema.g:931:6: lv_stringFormat_5_0= ruleFormatTypes
                    {

                    						newCompositeNode(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stringFormat_5_0=ruleFormatTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						set(
                    							current,
                    							"stringFormat",
                    							lv_stringFormat_5_0,
                    							"org.xtext.example.mydsl.JSchema.FormatTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePrimitiveProperties"


    // $ANTLR start "entryRuleStringLength"
    // InternalJSchema.g:953:1: entryRuleStringLength returns [String current=null] : iv_ruleStringLength= ruleStringLength EOF ;
    public final String entryRuleStringLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLength = null;


        try {
            // InternalJSchema.g:953:52: (iv_ruleStringLength= ruleStringLength EOF )
            // InternalJSchema.g:954:2: iv_ruleStringLength= ruleStringLength EOF
            {
             newCompositeNode(grammarAccess.getStringLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLength=ruleStringLength();

            state._fsp--;

             current =iv_ruleStringLength.getText(); 
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
    // $ANTLR end "entryRuleStringLength"


    // $ANTLR start "ruleStringLength"
    // InternalJSchema.g:960:1: ruleStringLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleStringLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJSchema.g:966:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) )
            // InternalJSchema.g:967:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            {
            // InternalJSchema.g:967:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            // InternalJSchema.g:968:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleStringLength"


    // $ANTLR start "entryRuleIncludes"
    // InternalJSchema.g:991:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalJSchema.g:991:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalJSchema.g:992:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalJSchema.g:998:1: ruleIncludes returns [EObject current=null] : ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token lv_objectID_0_0=null;
        Token otherlv_1=null;
        Token lv_objectID_2_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:1004:2: ( ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* ) )
            // InternalJSchema.g:1005:2: ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* )
            {
            // InternalJSchema.g:1005:2: ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* )
            // InternalJSchema.g:1006:3: ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )*
            {
            // InternalJSchema.g:1006:3: ( (lv_objectID_0_0= RULE_STRING ) )
            // InternalJSchema.g:1007:4: (lv_objectID_0_0= RULE_STRING )
            {
            // InternalJSchema.g:1007:4: (lv_objectID_0_0= RULE_STRING )
            // InternalJSchema.g:1008:5: lv_objectID_0_0= RULE_STRING
            {
            lv_objectID_0_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_objectID_0_0, grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objectID",
            						lv_objectID_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalJSchema.g:1024:3: (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJSchema.g:1025:4: otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalJSchema.g:1029:4: ( (lv_objectID_2_0= RULE_STRING ) )
            	    // InternalJSchema.g:1030:5: (lv_objectID_2_0= RULE_STRING )
            	    {
            	    // InternalJSchema.g:1030:5: (lv_objectID_2_0= RULE_STRING )
            	    // InternalJSchema.g:1031:6: lv_objectID_2_0= RULE_STRING
            	    {
            	    lv_objectID_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    						newLeafNode(lv_objectID_2_0, grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIncludesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objectID",
            	    							lv_objectID_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleArray"
    // InternalJSchema.g:1052:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSchema.g:1052:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSchema.g:1053:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSchema.g:1059:1: ruleArray returns [EObject current=null] : ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token lv_arrayName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;

        AntlrDatatypeRuleToken lv_arrayType_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:1065:2: ( ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) )
            // InternalJSchema.g:1066:2: ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            {
            // InternalJSchema.g:1066:2: ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            // InternalJSchema.g:1067:3: ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']'
            {
            // InternalJSchema.g:1067:3: ( (lv_arrayName_0_0= RULE_ID ) )
            // InternalJSchema.g:1068:4: (lv_arrayName_0_0= RULE_ID )
            {
            // InternalJSchema.g:1068:4: (lv_arrayName_0_0= RULE_ID )
            // InternalJSchema.g:1069:5: lv_arrayName_0_0= RULE_ID
            {
            lv_arrayName_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_arrayName_0_0, grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arrayName",
            						lv_arrayName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJSchema.g:1089:3: ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=20 && LA20_0<=21)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJSchema.g:1090:4: ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )*
                    {
                    // InternalJSchema.g:1090:4: ( (lv_properties_2_0= ruleProperty ) )
                    // InternalJSchema.g:1091:5: (lv_properties_2_0= ruleProperty )
                    {
                    // InternalJSchema.g:1091:5: (lv_properties_2_0= ruleProperty )
                    // InternalJSchema.g:1092:6: lv_properties_2_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_properties_2_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_2_0,
                    							"org.xtext.example.mydsl.JSchema.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:1109:4: (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalJSchema.g:1110:5: otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSchema.g:1114:5: ( (lv_properties_4_0= ruleProperty ) )
                    	    // InternalJSchema.g:1115:6: (lv_properties_4_0= ruleProperty )
                    	    {
                    	    // InternalJSchema.g:1115:6: (lv_properties_4_0= ruleProperty )
                    	    // InternalJSchema.g:1116:7: lv_properties_4_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_properties_4_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_4_0,
                    	    								"org.xtext.example.mydsl.JSchema.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJSchema.g:1135:3: ( (lv_arrayType_5_0= ruleArrayType ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=29 && LA21_0<=32)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJSchema.g:1136:4: (lv_arrayType_5_0= ruleArrayType )
                    {
                    // InternalJSchema.g:1136:4: (lv_arrayType_5_0= ruleArrayType )
                    // InternalJSchema.g:1137:5: lv_arrayType_5_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_arrayType_5_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArrayRule());
                    					}
                    					set(
                    						current,
                    						"arrayType",
                    						lv_arrayType_5_0,
                    						"org.xtext.example.mydsl.JSchema.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleArrayType"
    // InternalJSchema.g:1162:1: entryRuleArrayType returns [String current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final String entryRuleArrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayType = null;


        try {
            // InternalJSchema.g:1162:49: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalJSchema.g:1163:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType.getText(); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalJSchema.g:1169:1: ruleArrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleArrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJSchema.g:1175:2: ( (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) )
            // InternalJSchema.g:1176:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            {
            // InternalJSchema.g:1176:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalJSchema.g:1177:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1183:3: kw= 'integer'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJSchema.g:1189:3: kw= 'float'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJSchema.g:1195:3: kw= 'double'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getDoubleKeyword_3());
                    		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:1204:1: ruleFormatTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) ;
    public final Enumerator ruleFormatTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;


        	enterRule();

        try {
            // InternalJSchema.g:1210:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) )
            // InternalJSchema.g:1211:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            {
            // InternalJSchema.g:1211:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            int alt23=17;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            case 36:
                {
                alt23=4;
                }
                break;
            case 37:
                {
                alt23=5;
                }
                break;
            case 38:
                {
                alt23=6;
                }
                break;
            case 39:
                {
                alt23=7;
                }
                break;
            case 40:
                {
                alt23=8;
                }
                break;
            case 41:
                {
                alt23=9;
                }
                break;
            case 42:
                {
                alt23=10;
                }
                break;
            case 43:
                {
                alt23=11;
                }
                break;
            case 44:
                {
                alt23=12;
                }
                break;
            case 45:
                {
                alt23=13;
                }
                break;
            case 46:
                {
                alt23=14;
                }
                break;
            case 47:
                {
                alt23=15;
                }
                break;
            case 48:
                {
                alt23=16;
                }
                break;
            case 49:
                {
                alt23=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalJSchema.g:1212:3: (enumLiteral_0= 'null' )
                    {
                    // InternalJSchema.g:1212:3: (enumLiteral_0= 'null' )
                    // InternalJSchema.g:1213:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1220:3: (enumLiteral_1= 'date-time' )
                    {
                    // InternalJSchema.g:1220:3: (enumLiteral_1= 'date-time' )
                    // InternalJSchema.g:1221:4: enumLiteral_1= 'date-time'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:1228:3: (enumLiteral_2= 'time' )
                    {
                    // InternalJSchema.g:1228:3: (enumLiteral_2= 'time' )
                    // InternalJSchema.g:1229:4: enumLiteral_2= 'time'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:1236:3: (enumLiteral_3= 'date' )
                    {
                    // InternalJSchema.g:1236:3: (enumLiteral_3= 'date' )
                    // InternalJSchema.g:1237:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:1244:3: (enumLiteral_4= 'email' )
                    {
                    // InternalJSchema.g:1244:3: (enumLiteral_4= 'email' )
                    // InternalJSchema.g:1245:4: enumLiteral_4= 'email'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:1252:3: (enumLiteral_5= 'idn-email' )
                    {
                    // InternalJSchema.g:1252:3: (enumLiteral_5= 'idn-email' )
                    // InternalJSchema.g:1253:4: enumLiteral_5= 'idn-email'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:1260:3: (enumLiteral_6= 'hostname' )
                    {
                    // InternalJSchema.g:1260:3: (enumLiteral_6= 'hostname' )
                    // InternalJSchema.g:1261:4: enumLiteral_6= 'hostname'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:1268:3: (enumLiteral_7= 'ipv4' )
                    {
                    // InternalJSchema.g:1268:3: (enumLiteral_7= 'ipv4' )
                    // InternalJSchema.g:1269:4: enumLiteral_7= 'ipv4'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:1276:3: (enumLiteral_8= 'ipv6' )
                    {
                    // InternalJSchema.g:1276:3: (enumLiteral_8= 'ipv6' )
                    // InternalJSchema.g:1277:4: enumLiteral_8= 'ipv6'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:1284:3: (enumLiteral_9= 'uri' )
                    {
                    // InternalJSchema.g:1284:3: (enumLiteral_9= 'uri' )
                    // InternalJSchema.g:1285:4: enumLiteral_9= 'uri'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:1292:3: (enumLiteral_10= 'uri-reference' )
                    {
                    // InternalJSchema.g:1292:3: (enumLiteral_10= 'uri-reference' )
                    // InternalJSchema.g:1293:4: enumLiteral_10= 'uri-reference'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:1300:3: (enumLiteral_11= 'iri' )
                    {
                    // InternalJSchema.g:1300:3: (enumLiteral_11= 'iri' )
                    // InternalJSchema.g:1301:4: enumLiteral_11= 'iri'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:1308:3: (enumLiteral_12= 'iri-reference' )
                    {
                    // InternalJSchema.g:1308:3: (enumLiteral_12= 'iri-reference' )
                    // InternalJSchema.g:1309:4: enumLiteral_12= 'iri-reference'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:1316:3: (enumLiteral_13= 'uri-template' )
                    {
                    // InternalJSchema.g:1316:3: (enumLiteral_13= 'uri-template' )
                    // InternalJSchema.g:1317:4: enumLiteral_13= 'uri-template'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:1324:3: (enumLiteral_14= 'json-pointer' )
                    {
                    // InternalJSchema.g:1324:3: (enumLiteral_14= 'json-pointer' )
                    // InternalJSchema.g:1325:4: enumLiteral_14= 'json-pointer'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:1332:3: (enumLiteral_15= 'relative-json-pointer' )
                    {
                    // InternalJSchema.g:1332:3: (enumLiteral_15= 'relative-json-pointer' )
                    // InternalJSchema.g:1333:4: enumLiteral_15= 'relative-json-pointer'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:1340:3: (enumLiteral_16= 'regex' )
                    {
                    // InternalJSchema.g:1340:3: (enumLiteral_16= 'regex' )
                    // InternalJSchema.g:1341:4: enumLiteral_16= 'regex'
                    {
                    enumLiteral_16=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16());
                    			

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
    // $ANTLR end "ruleFormatTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000300022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000403000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000308020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000388020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0003FFFE00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001F0300020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001F0004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});

}
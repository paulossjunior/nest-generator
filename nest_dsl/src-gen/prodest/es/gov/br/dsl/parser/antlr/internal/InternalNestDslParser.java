package prodest.es.gov.br.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import prodest.es.gov.br.dsl.services.NestDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNestDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ARGUMENTREGEX", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "'type'", "'[]'", "';'", "':'", "'OneToOne'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "','", "'Get'", "'Post'", "'Delete'", "'Put'", "'('", "'):'"
    };
    public static final int RULE_ARGUMENTREGEX=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNestDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNestDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNestDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNestDsl.g"; }



     	private NestDslGrammarAccess grammarAccess;

        public InternalNestDslParser(TokenStream input, NestDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected NestDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalNestDsl.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalNestDsl.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalNestDsl.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalNestDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalNestDsl.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalNestDsl.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNestDsl.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalNestDsl.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalNestDsl.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"prodest.es.gov.br.dsl.NestDsl.AbstractElement");
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalNestDsl.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalNestDsl.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalNestDsl.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalNestDsl.g:107:1: ruleAbstractElement returns [EObject current=null] : this_Type_0= ruleType ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:113:2: (this_Type_0= ruleType )
            // InternalNestDsl.g:114:2: this_Type_0= ruleType
            {

            		newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;


            		current = this_Type_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleEntity"
    // InternalNestDsl.g:125:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalNestDsl.g:125:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalNestDsl.g:126:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalNestDsl.g:132:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_properties_5_0 = null;

        EObject lv_methods_6_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:138:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) )
            // InternalNestDsl.g:139:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            {
            // InternalNestDsl.g:139:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            // InternalNestDsl.g:140:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalNestDsl.g:144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:145:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:146:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNestDsl.g:162:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNestDsl.g:163:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNestDsl.g:167:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:168:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:168:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:169:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNestDsl.g:188:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=20 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNestDsl.g:189:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalNestDsl.g:189:4: (lv_properties_5_0= ruleProperty )
            	    // InternalNestDsl.g:190:5: lv_properties_5_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalNestDsl.g:207:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=25 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNestDsl.g:208:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalNestDsl.g:208:4: (lv_methods_6_0= ruleMethod )
            	    // InternalNestDsl.g:209:5: lv_methods_6_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_methods_6_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_6_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleType"
    // InternalNestDsl.g:234:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalNestDsl.g:234:45: (iv_ruleType= ruleType EOF )
            // InternalNestDsl.g:235:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalNestDsl.g:241:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:247:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalNestDsl.g:248:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalNestDsl.g:248:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNestDsl.g:249:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:258:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalNestDsl.g:270:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalNestDsl.g:270:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalNestDsl.g:271:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalNestDsl.g:277:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalNestDsl.g:283:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? ) )
            // InternalNestDsl.g:284:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? )
            {
            // InternalNestDsl.g:284:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? )
            // InternalNestDsl.g:285:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getTypeKeyword_0());
            		
            // InternalNestDsl.g:289:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:290:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:290:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:291:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNestDsl.g:307:3: (otherlv_2= '[]' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNestDsl.g:308:4: otherlv_2= '[]'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                    			

                    }
                    break;

            }

            // InternalNestDsl.g:313:3: (otherlv_3= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNestDsl.g:314:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNestDsl.g:323:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNestDsl.g:323:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNestDsl.g:324:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalNestDsl.g:330:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:336:2: (this_ID_0= RULE_ID )
            // InternalNestDsl.g:337:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleProperty"
    // InternalNestDsl.g:347:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalNestDsl.g:347:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalNestDsl.g:348:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalNestDsl.g:354:1: ruleProperty returns [EObject current=null] : ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_array_4_0=null;
        Token otherlv_5=null;
        EObject lv_relation_0_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:360:2: ( ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) )
            // InternalNestDsl.g:361:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            {
            // InternalNestDsl.g:361:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            // InternalNestDsl.g:362:3: ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )?
            {
            // InternalNestDsl.g:362:3: ( (lv_relation_0_0= ruleRelation ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=20 && LA8_0<=23)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNestDsl.g:363:4: (lv_relation_0_0= ruleRelation )
                    {
                    // InternalNestDsl.g:363:4: (lv_relation_0_0= ruleRelation )
                    // InternalNestDsl.g:364:5: lv_relation_0_0= ruleRelation
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getRelationRelationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_relation_0_0=ruleRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"relation",
                    						lv_relation_0_0,
                    						"prodest.es.gov.br.dsl.NestDsl.Relation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:381:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:382:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:382:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:383:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalNestDsl.g:403:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:404:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:404:4: ( ruleQualifiedName )
            // InternalNestDsl.g:405:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:419:3: ( (lv_array_4_0= '[]' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNestDsl.g:420:4: (lv_array_4_0= '[]' )
                    {
                    // InternalNestDsl.g:420:4: (lv_array_4_0= '[]' )
                    // InternalNestDsl.g:421:5: lv_array_4_0= '[]'
                    {
                    lv_array_4_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_4_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:433:3: (otherlv_5= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNestDsl.g:434:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleRelation"
    // InternalNestDsl.g:443:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalNestDsl.g:443:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalNestDsl.g:444:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalNestDsl.g:450:1: ruleRelation returns [EObject current=null] : ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject lv_oneArgument_0_0 = null;

        EObject lv_multipleArgument_1_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:456:2: ( ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) )
            // InternalNestDsl.g:457:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            {
            // InternalNestDsl.g:457:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=21)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNestDsl.g:458:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    {
                    // InternalNestDsl.g:458:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    // InternalNestDsl.g:459:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    {
                    // InternalNestDsl.g:459:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    // InternalNestDsl.g:460:5: lv_oneArgument_0_0= ruleOneArgumentRelation
                    {

                    					newCompositeNode(grammarAccess.getRelationAccess().getOneArgumentOneArgumentRelationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_oneArgument_0_0=ruleOneArgumentRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationRule());
                    					}
                    					set(
                    						current,
                    						"oneArgument",
                    						lv_oneArgument_0_0,
                    						"prodest.es.gov.br.dsl.NestDsl.OneArgumentRelation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:478:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    {
                    // InternalNestDsl.g:478:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    // InternalNestDsl.g:479:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    {
                    // InternalNestDsl.g:479:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    // InternalNestDsl.g:480:5: lv_multipleArgument_1_0= ruleMultipleArgumentRelation
                    {

                    					newCompositeNode(grammarAccess.getRelationAccess().getMultipleArgumentMultipleArgumentRelationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_multipleArgument_1_0=ruleMultipleArgumentRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationRule());
                    					}
                    					set(
                    						current,
                    						"multipleArgument",
                    						lv_multipleArgument_1_0,
                    						"prodest.es.gov.br.dsl.NestDsl.MultipleArgumentRelation");
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleOneArgumentRelation"
    // InternalNestDsl.g:501:1: entryRuleOneArgumentRelation returns [EObject current=null] : iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF ;
    public final EObject entryRuleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneArgumentRelation = null;


        try {
            // InternalNestDsl.g:501:60: (iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF )
            // InternalNestDsl.g:502:2: iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF
            {
             newCompositeNode(grammarAccess.getOneArgumentRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneArgumentRelation=ruleOneArgumentRelation();

            state._fsp--;

             current =iv_ruleOneArgumentRelation; 
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
    // $ANTLR end "entryRuleOneArgumentRelation"


    // $ANTLR start "ruleOneArgumentRelation"
    // InternalNestDsl.g:508:1: ruleOneArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNestDsl.g:514:2: ( ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalNestDsl.g:515:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalNestDsl.g:515:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalNestDsl.g:516:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalNestDsl.g:516:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) )
            // InternalNestDsl.g:517:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            {
            // InternalNestDsl.g:517:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            // InternalNestDsl.g:518:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            {
            // InternalNestDsl.g:518:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalNestDsl.g:519:6: lv_argument_0_1= 'OneToOne'
                    {
                    lv_argument_0_1=(Token)match(input,20,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getOneArgumentRelationAccess().getArgumentOneToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOneArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:530:6: lv_argument_0_2= 'ManyToMany'
                    {
                    lv_argument_0_2=(Token)match(input,21,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_2, grammarAccess.getOneArgumentRelationAccess().getArgumentManyToManyKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOneArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalNestDsl.g:543:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:544:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:544:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:545:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneArgumentRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOneArgumentRelationAccess().getTypeEntityCrossReference_1_0());
            				

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
    // $ANTLR end "ruleOneArgumentRelation"


    // $ANTLR start "entryRuleMultipleArgumentRelation"
    // InternalNestDsl.g:560:1: entryRuleMultipleArgumentRelation returns [EObject current=null] : iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF ;
    public final EObject entryRuleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleArgumentRelation = null;


        try {
            // InternalNestDsl.g:560:65: (iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF )
            // InternalNestDsl.g:561:2: iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF
            {
             newCompositeNode(grammarAccess.getMultipleArgumentRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleArgumentRelation=ruleMultipleArgumentRelation();

            state._fsp--;

             current =iv_ruleMultipleArgumentRelation; 
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
    // $ANTLR end "entryRuleMultipleArgumentRelation"


    // $ANTLR start "ruleMultipleArgumentRelation"
    // InternalNestDsl.g:567:1: ruleMultipleArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) ;
    public final EObject ruleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_secondArgument_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:573:2: ( ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) )
            // InternalNestDsl.g:574:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            {
            // InternalNestDsl.g:574:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            // InternalNestDsl.g:575:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            {
            // InternalNestDsl.g:575:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) )
            // InternalNestDsl.g:576:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            {
            // InternalNestDsl.g:576:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            // InternalNestDsl.g:577:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            {
            // InternalNestDsl.g:577:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:578:6: lv_argument_0_1= 'ManyToOne'
                    {
                    lv_argument_0_1=(Token)match(input,22,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getMultipleArgumentRelationAccess().getArgumentManyToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:589:6: lv_argument_0_2= 'OneToMany'
                    {
                    lv_argument_0_2=(Token)match(input,23,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_2, grammarAccess.getMultipleArgumentRelationAccess().getArgumentOneToManyKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalNestDsl.g:602:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:603:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:603:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:604:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getMultipleArgumentRelationAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleArgumentRelationAccess().getCommaKeyword_2());
            		
            // InternalNestDsl.g:619:3: ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            // InternalNestDsl.g:620:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            {
            // InternalNestDsl.g:620:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            // InternalNestDsl.g:621:5: lv_secondArgument_3_0= RULE_ARGUMENTREGEX
            {
            lv_secondArgument_3_0=(Token)match(input,RULE_ARGUMENTREGEX,FOLLOW_2); 

            					newLeafNode(lv_secondArgument_3_0, grammarAccess.getMultipleArgumentRelationAccess().getSecondArgumentARGUMENTREGEXTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"secondArgument",
            						lv_secondArgument_3_0,
            						"prodest.es.gov.br.dsl.NestDsl.ARGUMENTREGEX");
            				

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
    // $ANTLR end "ruleMultipleArgumentRelation"


    // $ANTLR start "entryRuleMethod"
    // InternalNestDsl.g:641:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalNestDsl.g:641:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalNestDsl.g:642:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalNestDsl.g:648:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_verb_0_1=null;
        Token lv_verb_0_2=null;
        Token lv_verb_0_3=null;
        Token lv_verb_0_4=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_array_7_0=null;
        Token otherlv_8=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:654:2: ( ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) )
            // InternalNestDsl.g:655:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            {
            // InternalNestDsl.g:655:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            // InternalNestDsl.g:656:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )?
            {
            // InternalNestDsl.g:656:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) )
            // InternalNestDsl.g:657:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            {
            // InternalNestDsl.g:657:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            // InternalNestDsl.g:658:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            {
            // InternalNestDsl.g:658:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalNestDsl.g:659:6: lv_verb_0_1= 'Get'
                    {
                    lv_verb_0_1=(Token)match(input,25,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_1, grammarAccess.getMethodAccess().getVerbGetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:670:6: lv_verb_0_2= 'Post'
                    {
                    lv_verb_0_2=(Token)match(input,26,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_2, grammarAccess.getMethodAccess().getVerbPostKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalNestDsl.g:681:6: lv_verb_0_3= 'Delete'
                    {
                    lv_verb_0_3=(Token)match(input,27,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_3, grammarAccess.getMethodAccess().getVerbDeleteKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalNestDsl.g:692:6: lv_verb_0_4= 'Put'
                    {
                    lv_verb_0_4=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_4, grammarAccess.getMethodAccess().getVerbPutKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalNestDsl.g:705:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:706:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:706:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:707:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalNestDsl.g:727:3: ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalNestDsl.g:728:4: ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )?
            	    {
            	    // InternalNestDsl.g:728:4: ( (lv_args_3_0= ruleMethodArg ) )
            	    // InternalNestDsl.g:729:5: (lv_args_3_0= ruleMethodArg )
            	    {
            	    // InternalNestDsl.g:729:5: (lv_args_3_0= ruleMethodArg )
            	    // InternalNestDsl.g:730:6: lv_args_3_0= ruleMethodArg
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getArgsMethodArgParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_args_3_0=ruleMethodArg();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_3_0,
            	    							"prodest.es.gov.br.dsl.NestDsl.MethodArg");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalNestDsl.g:747:4: (otherlv_4= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==24) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalNestDsl.g:748:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,24,FOLLOW_15); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisColonKeyword_4());
            		
            // InternalNestDsl.g:758:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:759:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:759:4: ( ruleQualifiedName )
            // InternalNestDsl.g:760:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:774:3: ( (lv_array_7_0= '[]' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNestDsl.g:775:4: (lv_array_7_0= '[]' )
                    {
                    // InternalNestDsl.g:775:4: (lv_array_7_0= '[]' )
                    // InternalNestDsl.g:776:5: lv_array_7_0= '[]'
                    {
                    lv_array_7_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_array_7_0, grammarAccess.getMethodAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_7_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:788:3: (otherlv_8= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNestDsl.g:789:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getSemicolonKeyword_7());
                    			

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodArg"
    // InternalNestDsl.g:798:1: entryRuleMethodArg returns [EObject current=null] : iv_ruleMethodArg= ruleMethodArg EOF ;
    public final EObject entryRuleMethodArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodArg = null;


        try {
            // InternalNestDsl.g:798:50: (iv_ruleMethodArg= ruleMethodArg EOF )
            // InternalNestDsl.g:799:2: iv_ruleMethodArg= ruleMethodArg EOF
            {
             newCompositeNode(grammarAccess.getMethodArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodArg=ruleMethodArg();

            state._fsp--;

             current =iv_ruleMethodArg; 
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
    // $ANTLR end "entryRuleMethodArg"


    // $ANTLR start "ruleMethodArg"
    // InternalNestDsl.g:805:1: ruleMethodArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) ;
    public final EObject ruleMethodArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:811:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) )
            // InternalNestDsl.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            {
            // InternalNestDsl.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            // InternalNestDsl.g:813:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )?
            {
            // InternalNestDsl.g:813:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:814:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:814:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:815:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMethodArgAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodArgRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodArgAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:835:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:836:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:836:4: ( ruleQualifiedName )
            // InternalNestDsl.g:837:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodArgRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodArgAccess().getTypeTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:851:3: ( (lv_array_3_0= '[]' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNestDsl.g:852:4: (lv_array_3_0= '[]' )
                    {
                    // InternalNestDsl.g:852:4: (lv_array_3_0= '[]' )
                    // InternalNestDsl.g:853:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_array_3_0, grammarAccess.getMethodArgAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodArgRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_3_0, "[]");
                    				

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
    // $ANTLR end "ruleMethodArg"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001EF08010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001E008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000041000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});

}
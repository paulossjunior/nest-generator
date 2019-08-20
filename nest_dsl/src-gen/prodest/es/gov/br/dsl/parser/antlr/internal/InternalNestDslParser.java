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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DATATYPE", "RULE_ARGUMENTREGEX", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "'dto'", "':'", "'[]'", "';'", "'OneToOne'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "','", "'Get'", "'Post'", "'Delete'", "'Put'", "'('", "'):'"
    };
    public static final int RULE_ARGUMENTREGEX=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DATATYPE=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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

                if ( (LA1_0==13||LA1_0==17) ) {
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
    // InternalNestDsl.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Dto_1= ruleDto ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Dto_1 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:113:2: ( (this_Entity_0= ruleEntity | this_Dto_1= ruleDto ) )
            // InternalNestDsl.g:114:2: (this_Entity_0= ruleEntity | this_Dto_1= ruleDto )
            {
            // InternalNestDsl.g:114:2: (this_Entity_0= ruleEntity | this_Dto_1= ruleDto )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNestDsl.g:115:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:124:3: this_Dto_1= ruleDto
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDtoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dto_1=ruleDto();

                    state._fsp--;


                    			current = this_Dto_1;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleEntity"
    // InternalNestDsl.g:136:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalNestDsl.g:136:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalNestDsl.g:137:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalNestDsl.g:143:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) ;
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
            // InternalNestDsl.g:149:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) )
            // InternalNestDsl.g:150:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            {
            // InternalNestDsl.g:150:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            // InternalNestDsl.g:151:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalNestDsl.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:157:5: lv_name_1_0= RULE_ID
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

            // InternalNestDsl.g:173:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNestDsl.g:174:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNestDsl.g:178:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:179:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:179:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:180:6: ruleQualifiedName
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

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNestDsl.g:199:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=21 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNestDsl.g:200:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalNestDsl.g:200:4: (lv_properties_5_0= ruleProperty )
            	    // InternalNestDsl.g:201:5: lv_properties_5_0= ruleProperty
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
            	    break loop4;
                }
            } while (true);

            // InternalNestDsl.g:218:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=26 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNestDsl.g:219:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalNestDsl.g:219:4: (lv_methods_6_0= ruleMethod )
            	    // InternalNestDsl.g:220:5: lv_methods_6_0= ruleMethod
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
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDto"
    // InternalNestDsl.g:245:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // InternalNestDsl.g:245:44: (iv_ruleDto= ruleDto EOF )
            // InternalNestDsl.g:246:2: iv_ruleDto= ruleDto EOF
            {
             newCompositeNode(grammarAccess.getDtoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDto=ruleDto();

            state._fsp--;

             current =iv_ruleDto; 
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
    // $ANTLR end "entryRuleDto"


    // $ANTLR start "ruleDto"
    // InternalNestDsl.g:252:1: ruleDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleDto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:258:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' ) )
            // InternalNestDsl.g:259:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' )
            {
            // InternalNestDsl.g:259:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' )
            // InternalNestDsl.g:260:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDtoAccess().getDtoKeyword_0());
            		
            // InternalNestDsl.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNestDsl.g:282:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNestDsl.g:283:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDtoAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNestDsl.g:287:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:288:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:288:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:289:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDtoAccess().getSuperTypeDtoCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDtoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNestDsl.g:308:3: ( (lv_properties_5_0= ruleDtoProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNestDsl.g:309:4: (lv_properties_5_0= ruleDtoProperty )
            	    {
            	    // InternalNestDsl.g:309:4: (lv_properties_5_0= ruleDtoProperty )
            	    // InternalNestDsl.g:310:5: lv_properties_5_0= ruleDtoProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_properties_5_0=ruleDtoProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.DtoProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDtoAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDto"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNestDsl.g:335:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNestDsl.g:335:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNestDsl.g:336:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalNestDsl.g:342:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:348:2: (this_ID_0= RULE_ID )
            // InternalNestDsl.g:349:2: this_ID_0= RULE_ID
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
    // InternalNestDsl.g:359:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalNestDsl.g:359:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalNestDsl.g:360:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalNestDsl.g:366:1: ruleProperty returns [EObject current=null] : ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_4_0=null;
        Token lv_array_5_0=null;
        Token otherlv_6=null;
        EObject lv_relation_0_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:372:2: ( ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? ) )
            // InternalNestDsl.g:373:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? )
            {
            // InternalNestDsl.g:373:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? )
            // InternalNestDsl.g:374:3: ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )?
            {
            // InternalNestDsl.g:374:3: ( (lv_relation_0_0= ruleRelation ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=24)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNestDsl.g:375:4: (lv_relation_0_0= ruleRelation )
                    {
                    // InternalNestDsl.g:375:4: (lv_relation_0_0= ruleRelation )
                    // InternalNestDsl.g:376:5: lv_relation_0_0= ruleRelation
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

            // InternalNestDsl.g:393:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:394:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:394:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:395:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalNestDsl.g:415:3: ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_DATATYPE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNestDsl.g:416:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:416:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:417:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:417:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:418:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPropertyAccess().getClassTypeEntityCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:433:4: ( (lv_type_4_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:433:4: ( (lv_type_4_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:434:5: (lv_type_4_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:434:5: (lv_type_4_0= RULE_DATATYPE )
                    // InternalNestDsl.g:435:6: lv_type_4_0= RULE_DATATYPE
                    {
                    lv_type_4_0=(Token)match(input,RULE_DATATYPE,FOLLOW_12); 

                    						newLeafNode(lv_type_4_0, grammarAccess.getPropertyAccess().getTypeDATATYPETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"prodest.es.gov.br.dsl.NestDsl.DATATYPE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNestDsl.g:452:3: ( (lv_array_5_0= '[]' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNestDsl.g:453:4: (lv_array_5_0= '[]' )
                    {
                    // InternalNestDsl.g:453:4: (lv_array_5_0= '[]' )
                    // InternalNestDsl.g:454:5: lv_array_5_0= '[]'
                    {
                    lv_array_5_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_array_5_0, grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_5_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:466:3: (otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNestDsl.g:467:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getSemicolonKeyword_5());
                    			

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


    // $ANTLR start "entryRuleDtoProperty"
    // InternalNestDsl.g:476:1: entryRuleDtoProperty returns [EObject current=null] : iv_ruleDtoProperty= ruleDtoProperty EOF ;
    public final EObject entryRuleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoProperty = null;


        try {
            // InternalNestDsl.g:476:52: (iv_ruleDtoProperty= ruleDtoProperty EOF )
            // InternalNestDsl.g:477:2: iv_ruleDtoProperty= ruleDtoProperty EOF
            {
             newCompositeNode(grammarAccess.getDtoPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoProperty=ruleDtoProperty();

            state._fsp--;

             current =iv_ruleDtoProperty; 
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
    // $ANTLR end "entryRuleDtoProperty"


    // $ANTLR start "ruleDtoProperty"
    // InternalNestDsl.g:483:1: ruleDtoProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleDtoProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_3_0=null;
        Token lv_array_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalNestDsl.g:489:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) )
            // InternalNestDsl.g:490:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            {
            // InternalNestDsl.g:490:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            // InternalNestDsl.g:491:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )?
            {
            // InternalNestDsl.g:491:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:492:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:492:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:493:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDtoPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoPropertyAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:513:3: ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DATATYPE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalNestDsl.g:514:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:514:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:515:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:515:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:516:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDtoPropertyAccess().getClassTypeDtoCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:531:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:531:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:532:5: (lv_type_3_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:532:5: (lv_type_3_0= RULE_DATATYPE )
                    // InternalNestDsl.g:533:6: lv_type_3_0= RULE_DATATYPE
                    {
                    lv_type_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_12); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getDtoPropertyAccess().getTypeDATATYPETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"prodest.es.gov.br.dsl.NestDsl.DATATYPE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNestDsl.g:550:3: ( (lv_array_4_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:551:4: (lv_array_4_0= '[]' )
                    {
                    // InternalNestDsl.g:551:4: (lv_array_4_0= '[]' )
                    // InternalNestDsl.g:552:5: lv_array_4_0= '[]'
                    {
                    lv_array_4_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getDtoPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDtoPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_4_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:564:3: (otherlv_5= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNestDsl.g:565:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleDtoProperty"


    // $ANTLR start "entryRuleRelation"
    // InternalNestDsl.g:574:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalNestDsl.g:574:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalNestDsl.g:575:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalNestDsl.g:581:1: ruleRelation returns [EObject current=null] : ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject lv_oneArgument_0_0 = null;

        EObject lv_multipleArgument_1_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:587:2: ( ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) )
            // InternalNestDsl.g:588:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            {
            // InternalNestDsl.g:588:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=21 && LA15_0<=22)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=23 && LA15_0<=24)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalNestDsl.g:589:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    {
                    // InternalNestDsl.g:589:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    // InternalNestDsl.g:590:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    {
                    // InternalNestDsl.g:590:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    // InternalNestDsl.g:591:5: lv_oneArgument_0_0= ruleOneArgumentRelation
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
                    // InternalNestDsl.g:609:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    {
                    // InternalNestDsl.g:609:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    // InternalNestDsl.g:610:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    {
                    // InternalNestDsl.g:610:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    // InternalNestDsl.g:611:5: lv_multipleArgument_1_0= ruleMultipleArgumentRelation
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
    // InternalNestDsl.g:632:1: entryRuleOneArgumentRelation returns [EObject current=null] : iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF ;
    public final EObject entryRuleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneArgumentRelation = null;


        try {
            // InternalNestDsl.g:632:60: (iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF )
            // InternalNestDsl.g:633:2: iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF
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
    // InternalNestDsl.g:639:1: ruleOneArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNestDsl.g:645:2: ( ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalNestDsl.g:646:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalNestDsl.g:646:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalNestDsl.g:647:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalNestDsl.g:647:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) )
            // InternalNestDsl.g:648:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            {
            // InternalNestDsl.g:648:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            // InternalNestDsl.g:649:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            {
            // InternalNestDsl.g:649:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==22) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNestDsl.g:650:6: lv_argument_0_1= 'OneToOne'
                    {
                    lv_argument_0_1=(Token)match(input,21,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getOneArgumentRelationAccess().getArgumentOneToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOneArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:661:6: lv_argument_0_2= 'ManyToMany'
                    {
                    lv_argument_0_2=(Token)match(input,22,FOLLOW_4); 

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

            // InternalNestDsl.g:674:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:675:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:675:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:676:5: otherlv_1= RULE_ID
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
    // InternalNestDsl.g:691:1: entryRuleMultipleArgumentRelation returns [EObject current=null] : iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF ;
    public final EObject entryRuleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleArgumentRelation = null;


        try {
            // InternalNestDsl.g:691:65: (iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF )
            // InternalNestDsl.g:692:2: iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF
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
    // InternalNestDsl.g:698:1: ruleMultipleArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) ;
    public final EObject ruleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_secondArgument_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:704:2: ( ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) )
            // InternalNestDsl.g:705:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            {
            // InternalNestDsl.g:705:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            // InternalNestDsl.g:706:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            {
            // InternalNestDsl.g:706:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) )
            // InternalNestDsl.g:707:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            {
            // InternalNestDsl.g:707:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            // InternalNestDsl.g:708:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            {
            // InternalNestDsl.g:708:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==24) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNestDsl.g:709:6: lv_argument_0_1= 'ManyToOne'
                    {
                    lv_argument_0_1=(Token)match(input,23,FOLLOW_4); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getMultipleArgumentRelationAccess().getArgumentManyToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:720:6: lv_argument_0_2= 'OneToMany'
                    {
                    lv_argument_0_2=(Token)match(input,24,FOLLOW_4); 

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

            // InternalNestDsl.g:733:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:734:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:734:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:735:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getMultipleArgumentRelationAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleArgumentRelationAccess().getCommaKeyword_2());
            		
            // InternalNestDsl.g:750:3: ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            // InternalNestDsl.g:751:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            {
            // InternalNestDsl.g:751:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            // InternalNestDsl.g:752:5: lv_secondArgument_3_0= RULE_ARGUMENTREGEX
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
    // InternalNestDsl.g:772:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalNestDsl.g:772:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalNestDsl.g:773:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalNestDsl.g:779:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) ;
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
            // InternalNestDsl.g:785:2: ( ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) )
            // InternalNestDsl.g:786:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            {
            // InternalNestDsl.g:786:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            // InternalNestDsl.g:787:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )?
            {
            // InternalNestDsl.g:787:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) )
            // InternalNestDsl.g:788:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            {
            // InternalNestDsl.g:788:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            // InternalNestDsl.g:789:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            {
            // InternalNestDsl.g:789:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalNestDsl.g:790:6: lv_verb_0_1= 'Get'
                    {
                    lv_verb_0_1=(Token)match(input,26,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_1, grammarAccess.getMethodAccess().getVerbGetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:801:6: lv_verb_0_2= 'Post'
                    {
                    lv_verb_0_2=(Token)match(input,27,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_2, grammarAccess.getMethodAccess().getVerbPostKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalNestDsl.g:812:6: lv_verb_0_3= 'Delete'
                    {
                    lv_verb_0_3=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(lv_verb_0_3, grammarAccess.getMethodAccess().getVerbDeleteKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalNestDsl.g:823:6: lv_verb_0_4= 'Put'
                    {
                    lv_verb_0_4=(Token)match(input,29,FOLLOW_4); 

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

            // InternalNestDsl.g:836:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:837:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:837:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:838:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalNestDsl.g:858:3: ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalNestDsl.g:859:4: ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )?
            	    {
            	    // InternalNestDsl.g:859:4: ( (lv_args_3_0= ruleMethodArg ) )
            	    // InternalNestDsl.g:860:5: (lv_args_3_0= ruleMethodArg )
            	    {
            	    // InternalNestDsl.g:860:5: (lv_args_3_0= ruleMethodArg )
            	    // InternalNestDsl.g:861:6: lv_args_3_0= ruleMethodArg
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getArgsMethodArgParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
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

            	    // InternalNestDsl.g:878:4: (otherlv_4= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==25) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalNestDsl.g:879:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_17); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisColonKeyword_4());
            		
            // InternalNestDsl.g:889:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:890:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:890:4: ( ruleQualifiedName )
            // InternalNestDsl.g:891:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeAbstractElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:905:3: ( (lv_array_7_0= '[]' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNestDsl.g:906:4: (lv_array_7_0= '[]' )
                    {
                    // InternalNestDsl.g:906:4: (lv_array_7_0= '[]' )
                    // InternalNestDsl.g:907:5: lv_array_7_0= '[]'
                    {
                    lv_array_7_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_array_7_0, grammarAccess.getMethodAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_7_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:919:3: (otherlv_8= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalNestDsl.g:920:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

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
    // InternalNestDsl.g:929:1: entryRuleMethodArg returns [EObject current=null] : iv_ruleMethodArg= ruleMethodArg EOF ;
    public final EObject entryRuleMethodArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodArg = null;


        try {
            // InternalNestDsl.g:929:50: (iv_ruleMethodArg= ruleMethodArg EOF )
            // InternalNestDsl.g:930:2: iv_ruleMethodArg= ruleMethodArg EOF
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
    // InternalNestDsl.g:936:1: ruleMethodArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) ;
    public final EObject ruleMethodArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:942:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) )
            // InternalNestDsl.g:943:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            {
            // InternalNestDsl.g:943:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            // InternalNestDsl.g:944:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )?
            {
            // InternalNestDsl.g:944:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:945:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:945:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:946:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodArgAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:966:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:967:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:967:4: ( ruleQualifiedName )
            // InternalNestDsl.g:968:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodArgRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodArgAccess().getTypeAbstractElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:982:3: ( (lv_array_3_0= '[]' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNestDsl.g:983:4: (lv_array_3_0= '[]' )
                    {
                    // InternalNestDsl.g:983:4: (lv_array_3_0= '[]' )
                    // InternalNestDsl.g:984:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,19,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003DE10010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003C010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000082000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});

}
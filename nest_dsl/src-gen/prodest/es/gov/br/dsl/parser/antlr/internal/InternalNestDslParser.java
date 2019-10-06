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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DATATYPE", "RULE_ARGUMENTREGEX", "RULE_BOOLEANTYTPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'entity'", "'extends'", "'{'", "'}'", "'dto'", "':'", "'[]'", "';'", "'OneToOne'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "','", "'required'", "'Get'", "'Post'", "'Delete'", "'Put'", "'('", "'):'"
    };
    public static final int RULE_ARGUMENTREGEX=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_DATATYPE=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_BOOLEANTYTPE=8;
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

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==19) ) {
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
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==15) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==19) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            default:
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


    // $ANTLR start "entryRuleDescription"
    // InternalNestDsl.g:136:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalNestDsl.g:136:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalNestDsl.g:137:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalNestDsl.g:143:1: ruleDescription returns [EObject current=null] : (otherlv_0= '#' ( (lv_textfield_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_textfield_1_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:149:2: ( (otherlv_0= '#' ( (lv_textfield_1_0= RULE_STRING ) ) ) )
            // InternalNestDsl.g:150:2: (otherlv_0= '#' ( (lv_textfield_1_0= RULE_STRING ) ) )
            {
            // InternalNestDsl.g:150:2: (otherlv_0= '#' ( (lv_textfield_1_0= RULE_STRING ) ) )
            // InternalNestDsl.g:151:3: otherlv_0= '#' ( (lv_textfield_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getNumberSignKeyword_0());
            		
            // InternalNestDsl.g:155:3: ( (lv_textfield_1_0= RULE_STRING ) )
            // InternalNestDsl.g:156:4: (lv_textfield_1_0= RULE_STRING )
            {
            // InternalNestDsl.g:156:4: (lv_textfield_1_0= RULE_STRING )
            // InternalNestDsl.g:157:5: lv_textfield_1_0= RULE_STRING
            {
            lv_textfield_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_textfield_1_0, grammarAccess.getDescriptionAccess().getTextfieldSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"textfield",
            						lv_textfield_1_0,
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleEntity"
    // InternalNestDsl.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalNestDsl.g:177:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalNestDsl.g:178:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalNestDsl.g:184:1: ruleEntity returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_description_0_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_methods_7_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:190:2: ( ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= '}' ) )
            // InternalNestDsl.g:191:2: ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= '}' )
            {
            // InternalNestDsl.g:191:2: ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= '}' )
            // InternalNestDsl.g:192:3: ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= '}'
            {
            // InternalNestDsl.g:192:3: ( (lv_description_0_0= ruleDescription ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNestDsl.g:193:4: (lv_description_0_0= ruleDescription )
                    {
                    // InternalNestDsl.g:193:4: (lv_description_0_0= ruleDescription )
                    // InternalNestDsl.g:194:5: lv_description_0_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getDescriptionDescriptionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"prodest.es.gov.br.dsl.NestDsl.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalNestDsl.g:215:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNestDsl.g:216:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNestDsl.g:216:4: (lv_name_2_0= RULE_ID )
            // InternalNestDsl.g:217:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNestDsl.g:233:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNestDsl.g:234:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalNestDsl.g:238:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:239:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:239:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:240:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalNestDsl.g:259:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=23 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNestDsl.g:260:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalNestDsl.g:260:4: (lv_properties_6_0= ruleProperty )
            	    // InternalNestDsl.g:261:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalNestDsl.g:278:3: ( (lv_methods_7_0= ruleMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=32)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNestDsl.g:279:4: (lv_methods_7_0= ruleMethod )
            	    {
            	    // InternalNestDsl.g:279:4: (lv_methods_7_0= ruleMethod )
            	    // InternalNestDsl.g:280:5: lv_methods_7_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_methods_7_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_7_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalNestDsl.g:305:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // InternalNestDsl.g:305:44: (iv_ruleDto= ruleDto EOF )
            // InternalNestDsl.g:306:2: iv_ruleDto= ruleDto EOF
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
    // InternalNestDsl.g:312:1: ruleDto returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'dto' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleDtoProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleDto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_0_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:318:2: ( ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'dto' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleDtoProperty ) )* otherlv_7= '}' ) )
            // InternalNestDsl.g:319:2: ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'dto' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleDtoProperty ) )* otherlv_7= '}' )
            {
            // InternalNestDsl.g:319:2: ( ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'dto' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleDtoProperty ) )* otherlv_7= '}' )
            // InternalNestDsl.g:320:3: ( (lv_description_0_0= ruleDescription ) )? otherlv_1= 'dto' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_properties_6_0= ruleDtoProperty ) )* otherlv_7= '}'
            {
            // InternalNestDsl.g:320:3: ( (lv_description_0_0= ruleDescription ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNestDsl.g:321:4: (lv_description_0_0= ruleDescription )
                    {
                    // InternalNestDsl.g:321:4: (lv_description_0_0= ruleDescription )
                    // InternalNestDsl.g:322:5: lv_description_0_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getDtoAccess().getDescriptionDescriptionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtoRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_0_0,
                    						"prodest.es.gov.br.dsl.NestDsl.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoAccess().getDtoKeyword_1());
            		
            // InternalNestDsl.g:343:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNestDsl.g:344:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNestDsl.g:344:4: (lv_name_2_0= RULE_ID )
            // InternalNestDsl.g:345:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDtoAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalNestDsl.g:361:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNestDsl.g:362:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtoAccess().getExtendsKeyword_3_0());
                    			
                    // InternalNestDsl.g:366:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:367:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:367:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:368:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDtoAccess().getSuperTypeDtoCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDtoAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalNestDsl.g:387:3: ( (lv_properties_6_0= ruleDtoProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNestDsl.g:388:4: (lv_properties_6_0= ruleDtoProperty )
            	    {
            	    // InternalNestDsl.g:388:4: (lv_properties_6_0= ruleDtoProperty )
            	    // InternalNestDsl.g:389:5: lv_properties_6_0= ruleDtoProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDtoAccess().getPropertiesDtoPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_properties_6_0=ruleDtoProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"prodest.es.gov.br.dsl.NestDsl.DtoProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDtoAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalNestDsl.g:414:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNestDsl.g:414:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNestDsl.g:415:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalNestDsl.g:421:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:427:2: (this_ID_0= RULE_ID )
            // InternalNestDsl.g:428:2: this_ID_0= RULE_ID
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
    // InternalNestDsl.g:438:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalNestDsl.g:438:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalNestDsl.g:439:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalNestDsl.g:445:1: ruleProperty returns [EObject current=null] : ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_4_0=null;
        Token lv_array_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_relation_0_0 = null;

        AntlrDatatypeRuleToken lv_propertyOptions_8_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:451:2: ( ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )? ) )
            // InternalNestDsl.g:452:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )? )
            {
            // InternalNestDsl.g:452:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )? )
            // InternalNestDsl.g:453:3: ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) ) ( (lv_array_5_0= '[]' ) )? (otherlv_6= ';' )? (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )?
            {
            // InternalNestDsl.g:453:3: ( (lv_relation_0_0= ruleRelation ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNestDsl.g:454:4: (lv_relation_0_0= ruleRelation )
                    {
                    // InternalNestDsl.g:454:4: (lv_relation_0_0= ruleRelation )
                    // InternalNestDsl.g:455:5: lv_relation_0_0= ruleRelation
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getRelationRelationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
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

            // InternalNestDsl.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalNestDsl.g:494:3: ( ( ( ruleQualifiedName ) ) | ( (lv_type_4_0= RULE_DATATYPE ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DATATYPE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNestDsl.g:495:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:495:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:496:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:496:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:497:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPropertyAccess().getClassTypeEntityCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:512:4: ( (lv_type_4_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:512:4: ( (lv_type_4_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:513:5: (lv_type_4_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:513:5: (lv_type_4_0= RULE_DATATYPE )
                    // InternalNestDsl.g:514:6: lv_type_4_0= RULE_DATATYPE
                    {
                    lv_type_4_0=(Token)match(input,RULE_DATATYPE,FOLLOW_15); 

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

            // InternalNestDsl.g:531:3: ( (lv_array_5_0= '[]' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNestDsl.g:532:4: (lv_array_5_0= '[]' )
                    {
                    // InternalNestDsl.g:532:4: (lv_array_5_0= '[]' )
                    // InternalNestDsl.g:533:5: lv_array_5_0= '[]'
                    {
                    lv_array_5_0=(Token)match(input,21,FOLLOW_16); 

                    					newLeafNode(lv_array_5_0, grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_5_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:545:3: (otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:546:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            // InternalNestDsl.g:551:3: (otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNestDsl.g:552:4: otherlv_7= '{' ( (lv_propertyOptions_8_0= rulePropertyOptions ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalNestDsl.g:556:4: ( (lv_propertyOptions_8_0= rulePropertyOptions ) )
                    // InternalNestDsl.g:557:5: (lv_propertyOptions_8_0= rulePropertyOptions )
                    {
                    // InternalNestDsl.g:557:5: (lv_propertyOptions_8_0= rulePropertyOptions )
                    // InternalNestDsl.g:558:6: lv_propertyOptions_8_0= rulePropertyOptions
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getPropertyOptionsPropertyOptionsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_propertyOptions_8_0=rulePropertyOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"propertyOptions",
                    							lv_propertyOptions_8_0,
                    							"prodest.es.gov.br.dsl.NestDsl.PropertyOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_6_2());
                    			

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
    // InternalNestDsl.g:584:1: entryRuleDtoProperty returns [EObject current=null] : iv_ruleDtoProperty= ruleDtoProperty EOF ;
    public final EObject entryRuleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoProperty = null;


        try {
            // InternalNestDsl.g:584:52: (iv_ruleDtoProperty= ruleDtoProperty EOF )
            // InternalNestDsl.g:585:2: iv_ruleDtoProperty= ruleDtoProperty EOF
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
    // InternalNestDsl.g:591:1: ruleDtoProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleDtoProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_3_0=null;
        Token lv_array_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalNestDsl.g:597:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) )
            // InternalNestDsl.g:598:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            {
            // InternalNestDsl.g:598:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            // InternalNestDsl.g:599:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )?
            {
            // InternalNestDsl.g:599:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:600:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:600:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:601:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoPropertyAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:621:3: ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_DATATYPE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalNestDsl.g:622:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:622:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:623:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:623:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:624:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDtoPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDtoPropertyAccess().getClassTypeDtoCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:639:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:639:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:640:5: (lv_type_3_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:640:5: (lv_type_3_0= RULE_DATATYPE )
                    // InternalNestDsl.g:641:6: lv_type_3_0= RULE_DATATYPE
                    {
                    lv_type_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_20); 

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

            // InternalNestDsl.g:658:3: ( (lv_array_4_0= '[]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNestDsl.g:659:4: (lv_array_4_0= '[]' )
                    {
                    // InternalNestDsl.g:659:4: (lv_array_4_0= '[]' )
                    // InternalNestDsl.g:660:5: lv_array_4_0= '[]'
                    {
                    lv_array_4_0=(Token)match(input,21,FOLLOW_21); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getDtoPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDtoPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_4_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:672:3: (otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNestDsl.g:673:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

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
    // InternalNestDsl.g:682:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalNestDsl.g:682:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalNestDsl.g:683:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalNestDsl.g:689:1: ruleRelation returns [EObject current=null] : ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject lv_oneArgument_0_0 = null;

        EObject lv_multipleArgument_1_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:695:2: ( ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) )
            // InternalNestDsl.g:696:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            {
            // InternalNestDsl.g:696:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=23 && LA18_0<=24)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=25 && LA18_0<=26)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalNestDsl.g:697:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    {
                    // InternalNestDsl.g:697:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    // InternalNestDsl.g:698:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    {
                    // InternalNestDsl.g:698:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    // InternalNestDsl.g:699:5: lv_oneArgument_0_0= ruleOneArgumentRelation
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
                    // InternalNestDsl.g:717:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    {
                    // InternalNestDsl.g:717:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    // InternalNestDsl.g:718:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    {
                    // InternalNestDsl.g:718:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    // InternalNestDsl.g:719:5: lv_multipleArgument_1_0= ruleMultipleArgumentRelation
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
    // InternalNestDsl.g:740:1: entryRuleOneArgumentRelation returns [EObject current=null] : iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF ;
    public final EObject entryRuleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneArgumentRelation = null;


        try {
            // InternalNestDsl.g:740:60: (iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF )
            // InternalNestDsl.g:741:2: iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF
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
    // InternalNestDsl.g:747:1: ruleOneArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNestDsl.g:753:2: ( ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalNestDsl.g:754:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalNestDsl.g:754:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalNestDsl.g:755:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalNestDsl.g:755:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) )
            // InternalNestDsl.g:756:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            {
            // InternalNestDsl.g:756:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            // InternalNestDsl.g:757:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            {
            // InternalNestDsl.g:757:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalNestDsl.g:758:6: lv_argument_0_1= 'OneToOne'
                    {
                    lv_argument_0_1=(Token)match(input,23,FOLLOW_6); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getOneArgumentRelationAccess().getArgumentOneToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOneArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:769:6: lv_argument_0_2= 'ManyToMany'
                    {
                    lv_argument_0_2=(Token)match(input,24,FOLLOW_6); 

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

            // InternalNestDsl.g:782:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:783:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:783:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:784:5: otherlv_1= RULE_ID
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
    // InternalNestDsl.g:799:1: entryRuleMultipleArgumentRelation returns [EObject current=null] : iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF ;
    public final EObject entryRuleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleArgumentRelation = null;


        try {
            // InternalNestDsl.g:799:65: (iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF )
            // InternalNestDsl.g:800:2: iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF
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
    // InternalNestDsl.g:806:1: ruleMultipleArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) ;
    public final EObject ruleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_secondArgument_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:812:2: ( ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) )
            // InternalNestDsl.g:813:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            {
            // InternalNestDsl.g:813:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            // InternalNestDsl.g:814:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            {
            // InternalNestDsl.g:814:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) )
            // InternalNestDsl.g:815:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            {
            // InternalNestDsl.g:815:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            // InternalNestDsl.g:816:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            {
            // InternalNestDsl.g:816:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalNestDsl.g:817:6: lv_argument_0_1= 'ManyToOne'
                    {
                    lv_argument_0_1=(Token)match(input,25,FOLLOW_6); 

                    						newLeafNode(lv_argument_0_1, grammarAccess.getMultipleArgumentRelationAccess().getArgumentManyToOneKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
                    						}
                    						setWithLastConsumed(current, "argument", lv_argument_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:828:6: lv_argument_0_2= 'OneToMany'
                    {
                    lv_argument_0_2=(Token)match(input,26,FOLLOW_6); 

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

            // InternalNestDsl.g:841:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:842:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:842:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:843:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getMultipleArgumentRelationAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleArgumentRelationAccess().getCommaKeyword_2());
            		
            // InternalNestDsl.g:858:3: ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            // InternalNestDsl.g:859:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            {
            // InternalNestDsl.g:859:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            // InternalNestDsl.g:860:5: lv_secondArgument_3_0= RULE_ARGUMENTREGEX
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


    // $ANTLR start "entryRulePropertyOptions"
    // InternalNestDsl.g:880:1: entryRulePropertyOptions returns [String current=null] : iv_rulePropertyOptions= rulePropertyOptions EOF ;
    public final String entryRulePropertyOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyOptions = null;


        try {
            // InternalNestDsl.g:880:55: (iv_rulePropertyOptions= rulePropertyOptions EOF )
            // InternalNestDsl.g:881:2: iv_rulePropertyOptions= rulePropertyOptions EOF
            {
             newCompositeNode(grammarAccess.getPropertyOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyOptions=rulePropertyOptions();

            state._fsp--;

             current =iv_rulePropertyOptions.getText(); 
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
    // $ANTLR end "entryRulePropertyOptions"


    // $ANTLR start "rulePropertyOptions"
    // InternalNestDsl.g:887:1: rulePropertyOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_RequiredOption_0= ruleRequiredOption ;
    public final AntlrDatatypeRuleToken rulePropertyOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_RequiredOption_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:893:2: (this_RequiredOption_0= ruleRequiredOption )
            // InternalNestDsl.g:894:2: this_RequiredOption_0= ruleRequiredOption
            {

            		newCompositeNode(grammarAccess.getPropertyOptionsAccess().getRequiredOptionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RequiredOption_0=ruleRequiredOption();

            state._fsp--;


            		current.merge(this_RequiredOption_0);
            	

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
    // $ANTLR end "rulePropertyOptions"


    // $ANTLR start "entryRuleRequiredOption"
    // InternalNestDsl.g:907:1: entryRuleRequiredOption returns [String current=null] : iv_ruleRequiredOption= ruleRequiredOption EOF ;
    public final String entryRuleRequiredOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiredOption = null;


        try {
            // InternalNestDsl.g:907:54: (iv_ruleRequiredOption= ruleRequiredOption EOF )
            // InternalNestDsl.g:908:2: iv_ruleRequiredOption= ruleRequiredOption EOF
            {
             newCompositeNode(grammarAccess.getRequiredOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredOption=ruleRequiredOption();

            state._fsp--;

             current =iv_ruleRequiredOption.getText(); 
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
    // $ANTLR end "entryRuleRequiredOption"


    // $ANTLR start "ruleRequiredOption"
    // InternalNestDsl.g:914:1: ruleRequiredOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'required' kw= ':' this_BOOLEANTYTPE_2= RULE_BOOLEANTYTPE ) ;
    public final AntlrDatatypeRuleToken ruleRequiredOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BOOLEANTYTPE_2=null;


        	enterRule();

        try {
            // InternalNestDsl.g:920:2: ( (kw= 'required' kw= ':' this_BOOLEANTYTPE_2= RULE_BOOLEANTYTPE ) )
            // InternalNestDsl.g:921:2: (kw= 'required' kw= ':' this_BOOLEANTYTPE_2= RULE_BOOLEANTYTPE )
            {
            // InternalNestDsl.g:921:2: (kw= 'required' kw= ':' this_BOOLEANTYTPE_2= RULE_BOOLEANTYTPE )
            // InternalNestDsl.g:922:3: kw= 'required' kw= ':' this_BOOLEANTYTPE_2= RULE_BOOLEANTYTPE
            {
            kw=(Token)match(input,28,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRequiredOptionAccess().getRequiredKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRequiredOptionAccess().getColonKeyword_1());
            		
            this_BOOLEANTYTPE_2=(Token)match(input,RULE_BOOLEANTYTPE,FOLLOW_2); 

            			current.merge(this_BOOLEANTYTPE_2);
            		

            			newLeafNode(this_BOOLEANTYTPE_2, grammarAccess.getRequiredOptionAccess().getBOOLEANTYTPETerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleRequiredOption"


    // $ANTLR start "entryRuleMethod"
    // InternalNestDsl.g:943:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalNestDsl.g:943:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalNestDsl.g:944:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalNestDsl.g:950:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) ) ( (lv_array_8_0= '[]' ) )? (otherlv_9= ';' )? ) ;
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
        Token lv_returnType_7_0=null;
        Token lv_array_8_0=null;
        Token otherlv_9=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:956:2: ( ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) ) ( (lv_array_8_0= '[]' ) )? (otherlv_9= ';' )? ) )
            // InternalNestDsl.g:957:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) ) ( (lv_array_8_0= '[]' ) )? (otherlv_9= ';' )? )
            {
            // InternalNestDsl.g:957:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) ) ( (lv_array_8_0= '[]' ) )? (otherlv_9= ';' )? )
            // InternalNestDsl.g:958:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) ) ( (lv_array_8_0= '[]' ) )? (otherlv_9= ';' )?
            {
            // InternalNestDsl.g:958:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) )
            // InternalNestDsl.g:959:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            {
            // InternalNestDsl.g:959:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            // InternalNestDsl.g:960:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            {
            // InternalNestDsl.g:960:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalNestDsl.g:961:6: lv_verb_0_1= 'Get'
                    {
                    lv_verb_0_1=(Token)match(input,29,FOLLOW_6); 

                    						newLeafNode(lv_verb_0_1, grammarAccess.getMethodAccess().getVerbGetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:972:6: lv_verb_0_2= 'Post'
                    {
                    lv_verb_0_2=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(lv_verb_0_2, grammarAccess.getMethodAccess().getVerbPostKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalNestDsl.g:983:6: lv_verb_0_3= 'Delete'
                    {
                    lv_verb_0_3=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_verb_0_3, grammarAccess.getMethodAccess().getVerbDeleteKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalNestDsl.g:994:6: lv_verb_0_4= 'Put'
                    {
                    lv_verb_0_4=(Token)match(input,32,FOLLOW_6); 

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

            // InternalNestDsl.g:1007:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:1008:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:1008:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:1009:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalNestDsl.g:1029:3: ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalNestDsl.g:1030:4: ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )?
            	    {
            	    // InternalNestDsl.g:1030:4: ( (lv_args_3_0= ruleMethodArg ) )
            	    // InternalNestDsl.g:1031:5: (lv_args_3_0= ruleMethodArg )
            	    {
            	    // InternalNestDsl.g:1031:5: (lv_args_3_0= ruleMethodArg )
            	    // InternalNestDsl.g:1032:6: lv_args_3_0= ruleMethodArg
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getArgsMethodArgParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
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

            	    // InternalNestDsl.g:1049:4: (otherlv_4= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==27) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalNestDsl.g:1050:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,27,FOLLOW_26); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisColonKeyword_4());
            		
            // InternalNestDsl.g:1060:3: ( ( ( ruleQualifiedName ) ) | ( (lv_returnType_7_0= RULE_DATATYPE ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_DATATYPE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalNestDsl.g:1061:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:1061:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:1062:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:1062:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:1063:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnClassTypeAbstractElementCrossReference_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:1078:4: ( (lv_returnType_7_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:1078:4: ( (lv_returnType_7_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:1079:5: (lv_returnType_7_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:1079:5: (lv_returnType_7_0= RULE_DATATYPE )
                    // InternalNestDsl.g:1080:6: lv_returnType_7_0= RULE_DATATYPE
                    {
                    lv_returnType_7_0=(Token)match(input,RULE_DATATYPE,FOLLOW_20); 

                    						newLeafNode(lv_returnType_7_0, grammarAccess.getMethodAccess().getReturnTypeDATATYPETerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"returnType",
                    							lv_returnType_7_0,
                    							"prodest.es.gov.br.dsl.NestDsl.DATATYPE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNestDsl.g:1097:3: ( (lv_array_8_0= '[]' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNestDsl.g:1098:4: (lv_array_8_0= '[]' )
                    {
                    // InternalNestDsl.g:1098:4: (lv_array_8_0= '[]' )
                    // InternalNestDsl.g:1099:5: lv_array_8_0= '[]'
                    {
                    lv_array_8_0=(Token)match(input,21,FOLLOW_21); 

                    					newLeafNode(lv_array_8_0, grammarAccess.getMethodAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_8_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:1111:3: (otherlv_9= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNestDsl.g:1112:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getSemicolonKeyword_7());
                    			

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
    // InternalNestDsl.g:1121:1: entryRuleMethodArg returns [EObject current=null] : iv_ruleMethodArg= ruleMethodArg EOF ;
    public final EObject entryRuleMethodArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodArg = null;


        try {
            // InternalNestDsl.g:1121:50: (iv_ruleMethodArg= ruleMethodArg EOF )
            // InternalNestDsl.g:1122:2: iv_ruleMethodArg= ruleMethodArg EOF
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
    // InternalNestDsl.g:1128:1: ruleMethodArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? ) ;
    public final EObject ruleMethodArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_3_0=null;
        Token lv_array_4_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:1134:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? ) )
            // InternalNestDsl.g:1135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? )
            {
            // InternalNestDsl.g:1135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )? )
            // InternalNestDsl.g:1136:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) ) ( (lv_array_4_0= '[]' ) )?
            {
            // InternalNestDsl.g:1136:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:1137:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:1137:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:1138:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodArgAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:1158:3: ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= RULE_DATATYPE ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_DATATYPE) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalNestDsl.g:1159:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalNestDsl.g:1159:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:1160:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:1160:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:1161:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodArgRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodArgAccess().getClassTypeAbstractElementCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:1176:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    {
                    // InternalNestDsl.g:1176:4: ( (lv_type_3_0= RULE_DATATYPE ) )
                    // InternalNestDsl.g:1177:5: (lv_type_3_0= RULE_DATATYPE )
                    {
                    // InternalNestDsl.g:1177:5: (lv_type_3_0= RULE_DATATYPE )
                    // InternalNestDsl.g:1178:6: lv_type_3_0= RULE_DATATYPE
                    {
                    lv_type_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_28); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getMethodArgAccess().getTypeDATATYPETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodArgRule());
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

            // InternalNestDsl.g:1195:3: ( (lv_array_4_0= '[]' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNestDsl.g:1196:4: (lv_array_4_0= '[]' )
                    {
                    // InternalNestDsl.g:1196:4: (lv_array_4_0= '[]' )
                    // InternalNestDsl.g:1197:5: lv_array_4_0= '[]'
                    {
                    lv_array_4_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getMethodArgAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodArgRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_4_0, "[]");
                    				

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000008C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001E7840020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000620002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000408000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200002L});

}
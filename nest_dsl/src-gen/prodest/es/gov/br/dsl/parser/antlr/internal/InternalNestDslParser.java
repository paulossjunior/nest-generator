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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ARGUMENTREGEX", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "'dto'", "'type'", "'[]'", "';'", "':'", "'OneToOne'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "','", "'Get'", "'Post'", "'Delete'", "'Put'", "'('", "'):'"
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
    public static final int T__31=31;
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

                if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=17)) ) {
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
    // InternalNestDsl.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Type_0= ruleType | this_DtoType_1= ruleDtoType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_DtoType_1 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:113:2: ( (this_Type_0= ruleType | this_DtoType_1= ruleDtoType ) )
            // InternalNestDsl.g:114:2: (this_Type_0= ruleType | this_DtoType_1= ruleDtoType )
            {
            // InternalNestDsl.g:114:2: (this_Type_0= ruleType | this_DtoType_1= ruleDtoType )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
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
                    // InternalNestDsl.g:115:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current = this_Type_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:124:3: this_DtoType_1= ruleDtoType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDtoTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtoType_1=ruleDtoType();

                    state._fsp--;


                    			current = this_DtoType_1;
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


    // $ANTLR start "entryRuleType"
    // InternalNestDsl.g:136:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalNestDsl.g:136:45: (iv_ruleType= ruleType EOF )
            // InternalNestDsl.g:137:2: iv_ruleType= ruleType EOF
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
    // InternalNestDsl.g:143:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:149:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalNestDsl.g:150:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalNestDsl.g:150:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNestDsl.g:151:3: this_DataType_0= ruleDataType
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
                    // InternalNestDsl.g:160:3: this_Entity_1= ruleEntity
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


    // $ANTLR start "entryRuleDtoType"
    // InternalNestDsl.g:172:1: entryRuleDtoType returns [EObject current=null] : iv_ruleDtoType= ruleDtoType EOF ;
    public final EObject entryRuleDtoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoType = null;


        try {
            // InternalNestDsl.g:172:48: (iv_ruleDtoType= ruleDtoType EOF )
            // InternalNestDsl.g:173:2: iv_ruleDtoType= ruleDtoType EOF
            {
             newCompositeNode(grammarAccess.getDtoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtoType=ruleDtoType();

            state._fsp--;

             current =iv_ruleDtoType; 
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
    // $ANTLR end "entryRuleDtoType"


    // $ANTLR start "ruleDtoType"
    // InternalNestDsl.g:179:1: ruleDtoType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Dto_1= ruleDto ) ;
    public final EObject ruleDtoType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Dto_1 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:185:2: ( (this_DataType_0= ruleDataType | this_Dto_1= ruleDto ) )
            // InternalNestDsl.g:186:2: (this_DataType_0= ruleDataType | this_Dto_1= ruleDto )
            {
            // InternalNestDsl.g:186:2: (this_DataType_0= ruleDataType | this_Dto_1= ruleDto )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNestDsl.g:187:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getDtoTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:196:3: this_Dto_1= ruleDto
                    {

                    			newCompositeNode(grammarAccess.getDtoTypeAccess().getDtoParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleDtoType"


    // $ANTLR start "entryRuleEntity"
    // InternalNestDsl.g:208:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalNestDsl.g:208:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalNestDsl.g:209:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalNestDsl.g:215:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) ;
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
            // InternalNestDsl.g:221:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' ) )
            // InternalNestDsl.g:222:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            {
            // InternalNestDsl.g:222:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}' )
            // InternalNestDsl.g:223:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* ( (lv_methods_6_0= ruleMethod ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalNestDsl.g:227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:228:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:229:5: lv_name_1_0= RULE_ID
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

            // InternalNestDsl.g:245:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNestDsl.g:246:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNestDsl.g:250:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:251:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:251:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:252:6: ruleQualifiedName
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
            		
            // InternalNestDsl.g:271:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNestDsl.g:272:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalNestDsl.g:272:4: (lv_properties_5_0= ruleProperty )
            	    // InternalNestDsl.g:273:5: lv_properties_5_0= ruleProperty
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
            	    break loop6;
                }
            } while (true);

            // InternalNestDsl.g:290:3: ( (lv_methods_6_0= ruleMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNestDsl.g:291:4: (lv_methods_6_0= ruleMethod )
            	    {
            	    // InternalNestDsl.g:291:4: (lv_methods_6_0= ruleMethod )
            	    // InternalNestDsl.g:292:5: lv_methods_6_0= ruleMethod
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
            	    break loop7;
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


    // $ANTLR start "entryRuleDto"
    // InternalNestDsl.g:317:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // InternalNestDsl.g:317:44: (iv_ruleDto= ruleDto EOF )
            // InternalNestDsl.g:318:2: iv_ruleDto= ruleDto EOF
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
    // InternalNestDsl.g:324:1: ruleDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' ) ;
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
            // InternalNestDsl.g:330:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' ) )
            // InternalNestDsl.g:331:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' )
            {
            // InternalNestDsl.g:331:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}' )
            // InternalNestDsl.g:332:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleDtoProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDtoAccess().getDtoKeyword_0());
            		
            // InternalNestDsl.g:336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:337:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:338:5: lv_name_1_0= RULE_ID
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

            // InternalNestDsl.g:354:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNestDsl.g:355:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDtoAccess().getExtendsKeyword_2_0());
                    			
                    // InternalNestDsl.g:359:4: ( ( ruleQualifiedName ) )
                    // InternalNestDsl.g:360:5: ( ruleQualifiedName )
                    {
                    // InternalNestDsl.g:360:5: ( ruleQualifiedName )
                    // InternalNestDsl.g:361:6: ruleQualifiedName
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

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDtoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNestDsl.g:380:3: ( (lv_properties_5_0= ruleDtoProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNestDsl.g:381:4: (lv_properties_5_0= ruleDtoProperty )
            	    {
            	    // InternalNestDsl.g:381:4: (lv_properties_5_0= ruleDtoProperty )
            	    // InternalNestDsl.g:382:5: lv_properties_5_0= ruleDtoProperty
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDataType"
    // InternalNestDsl.g:407:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalNestDsl.g:407:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalNestDsl.g:408:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalNestDsl.g:414:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalNestDsl.g:420:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? ) )
            // InternalNestDsl.g:421:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? )
            {
            // InternalNestDsl.g:421:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )? )
            // InternalNestDsl.g:422:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[]' )? (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getTypeKeyword_0());
            		
            // InternalNestDsl.g:426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:427:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalNestDsl.g:444:3: (otherlv_2= '[]' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNestDsl.g:445:4: otherlv_2= '[]'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                    			

                    }
                    break;

            }

            // InternalNestDsl.g:450:3: (otherlv_3= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNestDsl.g:451:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalNestDsl.g:460:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalNestDsl.g:460:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalNestDsl.g:461:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalNestDsl.g:467:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:473:2: (this_ID_0= RULE_ID )
            // InternalNestDsl.g:474:2: this_ID_0= RULE_ID
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
    // InternalNestDsl.g:484:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalNestDsl.g:484:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalNestDsl.g:485:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalNestDsl.g:491:1: ruleProperty returns [EObject current=null] : ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_array_4_0=null;
        Token otherlv_5=null;
        EObject lv_relation_0_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:497:2: ( ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? ) )
            // InternalNestDsl.g:498:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            {
            // InternalNestDsl.g:498:2: ( ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )? )
            // InternalNestDsl.g:499:3: ( (lv_relation_0_0= ruleRelation ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_array_4_0= '[]' ) )? (otherlv_5= ';' )?
            {
            // InternalNestDsl.g:499:3: ( (lv_relation_0_0= ruleRelation ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNestDsl.g:500:4: (lv_relation_0_0= ruleRelation )
                    {
                    // InternalNestDsl.g:500:4: (lv_relation_0_0= ruleRelation )
                    // InternalNestDsl.g:501:5: lv_relation_0_0= ruleRelation
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

            // InternalNestDsl.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalNestDsl.g:540:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:541:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:541:4: ( ruleQualifiedName )
            // InternalNestDsl.g:542:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:556:3: ( (lv_array_4_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:557:4: (lv_array_4_0= '[]' )
                    {
                    // InternalNestDsl.g:557:4: (lv_array_4_0= '[]' )
                    // InternalNestDsl.g:558:5: lv_array_4_0= '[]'
                    {
                    lv_array_4_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_array_4_0, grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_4_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:570:3: (otherlv_5= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNestDsl.g:571:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDtoProperty"
    // InternalNestDsl.g:580:1: entryRuleDtoProperty returns [EObject current=null] : iv_ruleDtoProperty= ruleDtoProperty EOF ;
    public final EObject entryRuleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoProperty = null;


        try {
            // InternalNestDsl.g:580:52: (iv_ruleDtoProperty= ruleDtoProperty EOF )
            // InternalNestDsl.g:581:2: iv_ruleDtoProperty= ruleDtoProperty EOF
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
    // InternalNestDsl.g:587:1: ruleDtoProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleDtoProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalNestDsl.g:593:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? (otherlv_4= ';' )? ) )
            // InternalNestDsl.g:594:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? (otherlv_4= ';' )? )
            {
            // InternalNestDsl.g:594:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? (otherlv_4= ';' )? )
            // InternalNestDsl.g:595:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? (otherlv_4= ';' )?
            {
            // InternalNestDsl.g:595:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:596:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:596:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:597:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDtoPropertyAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:617:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:618:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:618:4: ( ruleQualifiedName )
            // InternalNestDsl.g:619:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtoPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDtoPropertyAccess().getTypeDtoTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:633:3: ( (lv_array_3_0= '[]' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNestDsl.g:634:4: (lv_array_3_0= '[]' )
                    {
                    // InternalNestDsl.g:634:4: (lv_array_3_0= '[]' )
                    // InternalNestDsl.g:635:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_array_3_0, grammarAccess.getDtoPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDtoPropertyRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_3_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:647:3: (otherlv_4= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNestDsl.g:648:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_4());
                    			

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
    // InternalNestDsl.g:657:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalNestDsl.g:657:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalNestDsl.g:658:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalNestDsl.g:664:1: ruleRelation returns [EObject current=null] : ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject lv_oneArgument_0_0 = null;

        EObject lv_multipleArgument_1_0 = null;



        	enterRule();

        try {
            // InternalNestDsl.g:670:2: ( ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) ) )
            // InternalNestDsl.g:671:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            {
            // InternalNestDsl.g:671:2: ( ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) ) | ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=23 && LA17_0<=24)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNestDsl.g:672:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    {
                    // InternalNestDsl.g:672:3: ( (lv_oneArgument_0_0= ruleOneArgumentRelation ) )
                    // InternalNestDsl.g:673:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    {
                    // InternalNestDsl.g:673:4: (lv_oneArgument_0_0= ruleOneArgumentRelation )
                    // InternalNestDsl.g:674:5: lv_oneArgument_0_0= ruleOneArgumentRelation
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
                    // InternalNestDsl.g:692:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    {
                    // InternalNestDsl.g:692:3: ( (lv_multipleArgument_1_0= ruleMultipleArgumentRelation ) )
                    // InternalNestDsl.g:693:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    {
                    // InternalNestDsl.g:693:4: (lv_multipleArgument_1_0= ruleMultipleArgumentRelation )
                    // InternalNestDsl.g:694:5: lv_multipleArgument_1_0= ruleMultipleArgumentRelation
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
    // InternalNestDsl.g:715:1: entryRuleOneArgumentRelation returns [EObject current=null] : iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF ;
    public final EObject entryRuleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneArgumentRelation = null;


        try {
            // InternalNestDsl.g:715:60: (iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF )
            // InternalNestDsl.g:716:2: iv_ruleOneArgumentRelation= ruleOneArgumentRelation EOF
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
    // InternalNestDsl.g:722:1: ruleOneArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOneArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNestDsl.g:728:2: ( ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalNestDsl.g:729:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalNestDsl.g:729:2: ( ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalNestDsl.g:730:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalNestDsl.g:730:3: ( ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) ) )
            // InternalNestDsl.g:731:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            {
            // InternalNestDsl.g:731:4: ( (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' ) )
            // InternalNestDsl.g:732:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            {
            // InternalNestDsl.g:732:5: (lv_argument_0_1= 'OneToOne' | lv_argument_0_2= 'ManyToMany' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalNestDsl.g:733:6: lv_argument_0_1= 'OneToOne'
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
                    // InternalNestDsl.g:744:6: lv_argument_0_2= 'ManyToMany'
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

            // InternalNestDsl.g:757:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:758:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:758:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:759:5: otherlv_1= RULE_ID
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
    // InternalNestDsl.g:774:1: entryRuleMultipleArgumentRelation returns [EObject current=null] : iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF ;
    public final EObject entryRuleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleArgumentRelation = null;


        try {
            // InternalNestDsl.g:774:65: (iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF )
            // InternalNestDsl.g:775:2: iv_ruleMultipleArgumentRelation= ruleMultipleArgumentRelation EOF
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
    // InternalNestDsl.g:781:1: ruleMultipleArgumentRelation returns [EObject current=null] : ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) ;
    public final EObject ruleMultipleArgumentRelation() throws RecognitionException {
        EObject current = null;

        Token lv_argument_0_1=null;
        Token lv_argument_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_secondArgument_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:787:2: ( ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) ) )
            // InternalNestDsl.g:788:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            {
            // InternalNestDsl.g:788:2: ( ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) ) )
            // InternalNestDsl.g:789:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            {
            // InternalNestDsl.g:789:3: ( ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) ) )
            // InternalNestDsl.g:790:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            {
            // InternalNestDsl.g:790:4: ( (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' ) )
            // InternalNestDsl.g:791:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
            {
            // InternalNestDsl.g:791:5: (lv_argument_0_1= 'ManyToOne' | lv_argument_0_2= 'OneToMany' )
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
                    // InternalNestDsl.g:792:6: lv_argument_0_1= 'ManyToOne'
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
                    // InternalNestDsl.g:803:6: lv_argument_0_2= 'OneToMany'
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

            // InternalNestDsl.g:816:3: ( (otherlv_1= RULE_ID ) )
            // InternalNestDsl.g:817:4: (otherlv_1= RULE_ID )
            {
            // InternalNestDsl.g:817:4: (otherlv_1= RULE_ID )
            // InternalNestDsl.g:818:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleArgumentRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getMultipleArgumentRelationAccess().getTypeEntityCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleArgumentRelationAccess().getCommaKeyword_2());
            		
            // InternalNestDsl.g:833:3: ( (lv_secondArgument_3_0= RULE_ARGUMENTREGEX ) )
            // InternalNestDsl.g:834:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            {
            // InternalNestDsl.g:834:4: (lv_secondArgument_3_0= RULE_ARGUMENTREGEX )
            // InternalNestDsl.g:835:5: lv_secondArgument_3_0= RULE_ARGUMENTREGEX
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
    // InternalNestDsl.g:855:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalNestDsl.g:855:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalNestDsl.g:856:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalNestDsl.g:862:1: ruleMethod returns [EObject current=null] : ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) ;
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
            // InternalNestDsl.g:868:2: ( ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? ) )
            // InternalNestDsl.g:869:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            {
            // InternalNestDsl.g:869:2: ( ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )? )
            // InternalNestDsl.g:870:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )* otherlv_5= '):' ( ( ruleQualifiedName ) ) ( (lv_array_7_0= '[]' ) )? (otherlv_8= ';' )?
            {
            // InternalNestDsl.g:870:3: ( ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) ) )
            // InternalNestDsl.g:871:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            {
            // InternalNestDsl.g:871:4: ( (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' ) )
            // InternalNestDsl.g:872:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            {
            // InternalNestDsl.g:872:5: (lv_verb_0_1= 'Get' | lv_verb_0_2= 'Post' | lv_verb_0_3= 'Delete' | lv_verb_0_4= 'Put' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt20=1;
                }
                break;
            case 27:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            case 29:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalNestDsl.g:873:6: lv_verb_0_1= 'Get'
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
                    // InternalNestDsl.g:884:6: lv_verb_0_2= 'Post'
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
                    // InternalNestDsl.g:895:6: lv_verb_0_3= 'Delete'
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
                    // InternalNestDsl.g:906:6: lv_verb_0_4= 'Put'
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

            // InternalNestDsl.g:919:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalNestDsl.g:920:4: (lv_name_1_0= RULE_ID )
            {
            // InternalNestDsl.g:920:4: (lv_name_1_0= RULE_ID )
            // InternalNestDsl.g:921:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalNestDsl.g:941:3: ( ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )? )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalNestDsl.g:942:4: ( (lv_args_3_0= ruleMethodArg ) ) (otherlv_4= ',' )?
            	    {
            	    // InternalNestDsl.g:942:4: ( (lv_args_3_0= ruleMethodArg ) )
            	    // InternalNestDsl.g:943:5: (lv_args_3_0= ruleMethodArg )
            	    {
            	    // InternalNestDsl.g:943:5: (lv_args_3_0= ruleMethodArg )
            	    // InternalNestDsl.g:944:6: lv_args_3_0= ruleMethodArg
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getArgsMethodArgParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalNestDsl.g:961:4: (otherlv_4= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==25) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalNestDsl.g:962:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_16); 

            	            					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisColonKeyword_4());
            		
            // InternalNestDsl.g:972:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:973:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:973:4: ( ruleQualifiedName )
            // InternalNestDsl.g:974:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:988:3: ( (lv_array_7_0= '[]' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNestDsl.g:989:4: (lv_array_7_0= '[]' )
                    {
                    // InternalNestDsl.g:989:4: (lv_array_7_0= '[]' )
                    // InternalNestDsl.g:990:5: lv_array_7_0= '[]'
                    {
                    lv_array_7_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_array_7_0, grammarAccess.getMethodAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_7_0, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalNestDsl.g:1002:3: (otherlv_8= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNestDsl.g:1003:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalNestDsl.g:1012:1: entryRuleMethodArg returns [EObject current=null] : iv_ruleMethodArg= ruleMethodArg EOF ;
    public final EObject entryRuleMethodArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodArg = null;


        try {
            // InternalNestDsl.g:1012:50: (iv_ruleMethodArg= ruleMethodArg EOF )
            // InternalNestDsl.g:1013:2: iv_ruleMethodArg= ruleMethodArg EOF
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
    // InternalNestDsl.g:1019:1: ruleMethodArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) ;
    public final EObject ruleMethodArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;


        	enterRule();

        try {
            // InternalNestDsl.g:1025:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? ) )
            // InternalNestDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            {
            // InternalNestDsl.g:1026:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )? )
            // InternalNestDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ( (lv_array_3_0= '[]' ) )?
            {
            // InternalNestDsl.g:1027:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNestDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNestDsl.g:1028:4: (lv_name_0_0= RULE_ID )
            // InternalNestDsl.g:1029:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodArgAccess().getColonKeyword_1());
            		
            // InternalNestDsl.g:1049:3: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:1050:4: ( ruleQualifiedName )
            {
            // InternalNestDsl.g:1050:4: ( ruleQualifiedName )
            // InternalNestDsl.g:1051:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodArgRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodArgAccess().getTypeTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNestDsl.g:1065:3: ( (lv_array_3_0= '[]' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNestDsl.g:1066:4: (lv_array_3_0= '[]' )
                    {
                    // InternalNestDsl.g:1066:4: (lv_array_3_0= '[]' )
                    // InternalNestDsl.g:1067:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,18,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000031002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003DE08010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003C008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000082000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});

}
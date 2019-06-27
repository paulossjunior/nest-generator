package prodest.es.gov.br.dsl.ide.contentassist.antlr.internal;

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
import prodest.es.gov.br.dsl.services.NestDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNestDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'extends'", "'type'", "'[]'", "';'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

    	public void setGrammarAccess(NestDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalNestDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalNestDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalNestDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalNestDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalNestDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalNestDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalNestDsl.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalNestDsl.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNestDsl.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalNestDsl.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalNestDsl.g:79:1: ( ruleAbstractElement EOF )
            // InternalNestDsl.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalNestDsl.g:87:1: ruleAbstractElement : ( ruleType ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:91:2: ( ( ruleType ) )
            // InternalNestDsl.g:92:2: ( ruleType )
            {
            // InternalNestDsl.g:92:2: ( ruleType )
            // InternalNestDsl.g:93:3: ruleType
            {
             before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleEntity"
    // InternalNestDsl.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalNestDsl.g:104:1: ( ruleEntity EOF )
            // InternalNestDsl.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalNestDsl.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalNestDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalNestDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalNestDsl.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalNestDsl.g:119:3: ( rule__Entity__Group__0 )
            // InternalNestDsl.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleType"
    // InternalNestDsl.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalNestDsl.g:129:1: ( ruleType EOF )
            // InternalNestDsl.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalNestDsl.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalNestDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalNestDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalNestDsl.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalNestDsl.g:144:3: ( rule__Type__Alternatives )
            // InternalNestDsl.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalNestDsl.g:153:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalNestDsl.g:154:1: ( ruleDataType EOF )
            // InternalNestDsl.g:155:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalNestDsl.g:162:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:166:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalNestDsl.g:167:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalNestDsl.g:167:2: ( ( rule__DataType__Group__0 ) )
            // InternalNestDsl.g:168:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalNestDsl.g:169:3: ( rule__DataType__Group__0 )
            // InternalNestDsl.g:169:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalNestDsl.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalNestDsl.g:179:1: ( ruleQualifiedName EOF )
            // InternalNestDsl.g:180:1: ruleQualifiedName EOF
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
    // InternalNestDsl.g:187:1: ruleQualifiedName : ( RULE_ID ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:191:2: ( ( RULE_ID ) )
            // InternalNestDsl.g:192:2: ( RULE_ID )
            {
            // InternalNestDsl.g:192:2: ( RULE_ID )
            // InternalNestDsl.g:193:3: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProperty"
    // InternalNestDsl.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalNestDsl.g:204:1: ( ruleProperty EOF )
            // InternalNestDsl.g:205:1: ruleProperty EOF
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
    // InternalNestDsl.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalNestDsl.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalNestDsl.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalNestDsl.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalNestDsl.g:219:3: ( rule__Property__Group__0 )
            // InternalNestDsl.g:219:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalNestDsl.g:227:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:231:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNestDsl.g:232:2: ( ruleDataType )
                    {
                    // InternalNestDsl.g:232:2: ( ruleDataType )
                    // InternalNestDsl.g:233:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:238:2: ( ruleEntity )
                    {
                    // InternalNestDsl.g:238:2: ( ruleEntity )
                    // InternalNestDsl.g:239:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalNestDsl.g:248:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:252:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalNestDsl.g:253:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalNestDsl.g:260:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:264:1: ( ( 'entity' ) )
            // InternalNestDsl.g:265:1: ( 'entity' )
            {
            // InternalNestDsl.g:265:1: ( 'entity' )
            // InternalNestDsl.g:266:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalNestDsl.g:275:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:279:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalNestDsl.g:280:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalNestDsl.g:287:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:291:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalNestDsl.g:292:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalNestDsl.g:292:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalNestDsl.g:293:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalNestDsl.g:294:2: ( rule__Entity__NameAssignment_1 )
            // InternalNestDsl.g:294:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalNestDsl.g:302:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:306:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalNestDsl.g:307:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalNestDsl.g:314:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:318:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalNestDsl.g:319:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalNestDsl.g:319:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalNestDsl.g:320:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalNestDsl.g:321:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNestDsl.g:321:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalNestDsl.g:329:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:333:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalNestDsl.g:334:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalNestDsl.g:341:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:345:1: ( ( '{' ) )
            // InternalNestDsl.g:346:1: ( '{' )
            {
            // InternalNestDsl.g:346:1: ( '{' )
            // InternalNestDsl.g:347:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalNestDsl.g:356:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:360:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalNestDsl.g:361:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalNestDsl.g:368:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:372:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // InternalNestDsl.g:373:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // InternalNestDsl.g:373:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // InternalNestDsl.g:374:2: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // InternalNestDsl.g:375:2: ( rule__Entity__PropertiesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNestDsl.g:375:3: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalNestDsl.g:383:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:387:1: ( rule__Entity__Group__5__Impl )
            // InternalNestDsl.g:388:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalNestDsl.g:394:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:398:1: ( ( '}' ) )
            // InternalNestDsl.g:399:1: ( '}' )
            {
            // InternalNestDsl.g:399:1: ( '}' )
            // InternalNestDsl.g:400:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalNestDsl.g:410:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:414:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalNestDsl.g:415:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalNestDsl.g:422:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:426:1: ( ( 'extends' ) )
            // InternalNestDsl.g:427:1: ( 'extends' )
            {
            // InternalNestDsl.g:427:1: ( 'extends' )
            // InternalNestDsl.g:428:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalNestDsl.g:437:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:441:1: ( rule__Entity__Group_2__1__Impl )
            // InternalNestDsl.g:442:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalNestDsl.g:448:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:452:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalNestDsl.g:453:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalNestDsl.g:453:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalNestDsl.g:454:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalNestDsl.g:455:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalNestDsl.g:455:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalNestDsl.g:464:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:468:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalNestDsl.g:469:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalNestDsl.g:476:1: rule__DataType__Group__0__Impl : ( 'type' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:480:1: ( ( 'type' ) )
            // InternalNestDsl.g:481:1: ( 'type' )
            {
            // InternalNestDsl.g:481:1: ( 'type' )
            // InternalNestDsl.g:482:2: 'type'
            {
             before(grammarAccess.getDataTypeAccess().getTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalNestDsl.g:491:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:495:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalNestDsl.g:496:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__2();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalNestDsl.g:503:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:507:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalNestDsl.g:508:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalNestDsl.g:508:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalNestDsl.g:509:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalNestDsl.g:510:2: ( rule__DataType__NameAssignment_1 )
            // InternalNestDsl.g:510:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalNestDsl.g:518:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:522:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // InternalNestDsl.g:523:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__3();

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
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalNestDsl.g:530:1: rule__DataType__Group__2__Impl : ( ( '[]' )? ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:534:1: ( ( ( '[]' )? ) )
            // InternalNestDsl.g:535:1: ( ( '[]' )? )
            {
            // InternalNestDsl.g:535:1: ( ( '[]' )? )
            // InternalNestDsl.g:536:2: ( '[]' )?
            {
             before(grammarAccess.getDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            // InternalNestDsl.g:537:2: ( '[]' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNestDsl.g:537:3: '[]'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // InternalNestDsl.g:545:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:549:1: ( rule__DataType__Group__3__Impl )
            // InternalNestDsl.g:550:2: rule__DataType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__3__Impl();

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
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // InternalNestDsl.g:556:1: rule__DataType__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:560:1: ( ( ( ';' )? ) )
            // InternalNestDsl.g:561:1: ( ( ';' )? )
            {
            // InternalNestDsl.g:561:1: ( ( ';' )? )
            // InternalNestDsl.g:562:2: ( ';' )?
            {
             before(grammarAccess.getDataTypeAccess().getSemicolonKeyword_3()); 
            // InternalNestDsl.g:563:2: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNestDsl.g:563:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalNestDsl.g:572:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:576:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalNestDsl.g:577:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalNestDsl.g:584:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:588:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalNestDsl.g:589:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalNestDsl.g:589:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalNestDsl.g:590:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalNestDsl.g:591:2: ( rule__Property__NameAssignment_0 )
            // InternalNestDsl.g:591:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalNestDsl.g:599:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:603:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalNestDsl.g:604:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalNestDsl.g:611:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:615:1: ( ( ':' ) )
            // InternalNestDsl.g:616:1: ( ':' )
            {
            // InternalNestDsl.g:616:1: ( ':' )
            // InternalNestDsl.g:617:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalNestDsl.g:626:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:630:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalNestDsl.g:631:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalNestDsl.g:638:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:642:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalNestDsl.g:643:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalNestDsl.g:643:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalNestDsl.g:644:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalNestDsl.g:645:2: ( rule__Property__TypeAssignment_2 )
            // InternalNestDsl.g:645:3: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalNestDsl.g:653:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:657:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalNestDsl.g:658:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalNestDsl.g:665:1: rule__Property__Group__3__Impl : ( ( rule__Property__ArrayAssignment_3 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:669:1: ( ( ( rule__Property__ArrayAssignment_3 )? ) )
            // InternalNestDsl.g:670:1: ( ( rule__Property__ArrayAssignment_3 )? )
            {
            // InternalNestDsl.g:670:1: ( ( rule__Property__ArrayAssignment_3 )? )
            // InternalNestDsl.g:671:2: ( rule__Property__ArrayAssignment_3 )?
            {
             before(grammarAccess.getPropertyAccess().getArrayAssignment_3()); 
            // InternalNestDsl.g:672:2: ( rule__Property__ArrayAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNestDsl.g:672:3: rule__Property__ArrayAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__ArrayAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getArrayAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalNestDsl.g:680:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:684:1: ( rule__Property__Group__4__Impl )
            // InternalNestDsl.g:685:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__4__Impl();

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
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalNestDsl.g:691:1: rule__Property__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:695:1: ( ( ( ';' )? ) )
            // InternalNestDsl.g:696:1: ( ( ';' )? )
            {
            // InternalNestDsl.g:696:1: ( ( ';' )? )
            // InternalNestDsl.g:697:2: ( ';' )?
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 
            // InternalNestDsl.g:698:2: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNestDsl.g:698:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalNestDsl.g:707:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:711:1: ( ( ruleAbstractElement ) )
            // InternalNestDsl.g:712:2: ( ruleAbstractElement )
            {
            // InternalNestDsl.g:712:2: ( ruleAbstractElement )
            // InternalNestDsl.g:713:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalNestDsl.g:722:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:726:1: ( ( RULE_ID ) )
            // InternalNestDsl.g:727:2: ( RULE_ID )
            {
            // InternalNestDsl.g:727:2: ( RULE_ID )
            // InternalNestDsl.g:728:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalNestDsl.g:737:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:741:1: ( ( ( ruleQualifiedName ) ) )
            // InternalNestDsl.g:742:2: ( ( ruleQualifiedName ) )
            {
            // InternalNestDsl.g:742:2: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:743:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalNestDsl.g:744:3: ( ruleQualifiedName )
            // InternalNestDsl.g:745:4: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_4"
    // InternalNestDsl.g:756:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:760:1: ( ( ruleProperty ) )
            // InternalNestDsl.g:761:2: ( ruleProperty )
            {
            // InternalNestDsl.g:761:2: ( ruleProperty )
            // InternalNestDsl.g:762:3: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertiesAssignment_4"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalNestDsl.g:771:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:775:1: ( ( RULE_ID ) )
            // InternalNestDsl.g:776:2: ( RULE_ID )
            {
            // InternalNestDsl.g:776:2: ( RULE_ID )
            // InternalNestDsl.g:777:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalNestDsl.g:786:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:790:1: ( ( RULE_ID ) )
            // InternalNestDsl.g:791:2: ( RULE_ID )
            {
            // InternalNestDsl.g:791:2: ( RULE_ID )
            // InternalNestDsl.g:792:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // InternalNestDsl.g:801:1: rule__Property__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:805:1: ( ( ( ruleQualifiedName ) ) )
            // InternalNestDsl.g:806:2: ( ( ruleQualifiedName ) )
            {
            // InternalNestDsl.g:806:2: ( ( ruleQualifiedName ) )
            // InternalNestDsl.g:807:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // InternalNestDsl.g:808:3: ( ruleQualifiedName )
            // InternalNestDsl.g:809:4: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_2"


    // $ANTLR start "rule__Property__ArrayAssignment_3"
    // InternalNestDsl.g:820:1: rule__Property__ArrayAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Property__ArrayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNestDsl.g:824:1: ( ( ( '[]' ) ) )
            // InternalNestDsl.g:825:2: ( ( '[]' ) )
            {
            // InternalNestDsl.g:825:2: ( ( '[]' ) )
            // InternalNestDsl.g:826:3: ( '[]' )
            {
             before(grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // InternalNestDsl.g:827:3: ( '[]' )
            // InternalNestDsl.g:828:4: '[]'
            {
             before(grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }

             after(grammarAccess.getPropertyAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ArrayAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}
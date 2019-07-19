package prodest.es.gov.br.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNestDslLexer extends Lexer {
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
    public static final int T__32=32;
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

    public InternalNestDslLexer() {;} 
    public InternalNestDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNestDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNestDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:11:7: ( 'entity' )
            // InternalNestDsl.g:11:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:12:7: ( 'extends' )
            // InternalNestDsl.g:12:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:13:7: ( '{' )
            // InternalNestDsl.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:14:7: ( '}' )
            // InternalNestDsl.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:15:7: ( 'string' )
            // InternalNestDsl.g:15:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:16:7: ( 'number' )
            // InternalNestDsl.g:16:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:17:7: ( 'boolean' )
            // InternalNestDsl.g:17:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:18:7: ( '[]' )
            // InternalNestDsl.g:18:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:19:7: ( ';' )
            // InternalNestDsl.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:20:7: ( ':' )
            // InternalNestDsl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:21:7: ( 'OneToOne' )
            // InternalNestDsl.g:21:9: 'OneToOne'
            {
            match("OneToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:22:7: ( 'ManyToMany' )
            // InternalNestDsl.g:22:9: 'ManyToMany'
            {
            match("ManyToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:23:7: ( 'ManyToOne' )
            // InternalNestDsl.g:23:9: 'ManyToOne'
            {
            match("ManyToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:24:7: ( 'OneToMany' )
            // InternalNestDsl.g:24:9: 'OneToMany'
            {
            match("OneToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:25:7: ( ',' )
            // InternalNestDsl.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:26:7: ( 'Get' )
            // InternalNestDsl.g:26:9: 'Get'
            {
            match("Get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:27:7: ( 'Post' )
            // InternalNestDsl.g:27:9: 'Post'
            {
            match("Post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:28:7: ( 'Delete' )
            // InternalNestDsl.g:28:9: 'Delete'
            {
            match("Delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:29:7: ( 'Put' )
            // InternalNestDsl.g:29:9: 'Put'
            {
            match("Put"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:30:7: ( '(' )
            // InternalNestDsl.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:31:7: ( '):' )
            // InternalNestDsl.g:31:9: '):'
            {
            match("):"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_ARGUMENTREGEX"
    public final void mRULE_ARGUMENTREGEX() throws RecognitionException {
        try {
            int _type = RULE_ARGUMENTREGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:880:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:880:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:880:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNestDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("=>"); 

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:880:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalNestDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('.'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:880:171: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalNestDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARGUMENTREGEX"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:882:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:882:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNestDsl.g:882:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNestDsl.g:882:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:882:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNestDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:884:10: ( ( '0' .. '9' )+ )
            // InternalNestDsl.g:884:12: ( '0' .. '9' )+
            {
            // InternalNestDsl.g:884:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalNestDsl.g:884:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:886:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalNestDsl.g:886:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalNestDsl.g:886:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNestDsl.g:886:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNestDsl.g:886:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalNestDsl.g:886:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:886:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:886:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalNestDsl.g:886:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNestDsl.g:886:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:886:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:888:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNestDsl.g:888:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNestDsl.g:888:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNestDsl.g:888:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:890:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNestDsl.g:890:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNestDsl.g:890:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNestDsl.g:890:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalNestDsl.g:890:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:890:41: ( '\\r' )? '\\n'
                    {
                    // InternalNestDsl.g:890:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalNestDsl.g:890:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:892:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNestDsl.g:892:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNestDsl.g:892:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalNestDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:894:16: ( . )
            // InternalNestDsl.g:894:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalNestDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=29;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalNestDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalNestDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalNestDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalNestDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalNestDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalNestDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalNestDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalNestDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalNestDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalNestDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalNestDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalNestDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalNestDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalNestDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalNestDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalNestDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalNestDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalNestDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalNestDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalNestDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalNestDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalNestDsl.g:1:136: RULE_ARGUMENTREGEX
                {
                mRULE_ARGUMENTREGEX(); 

                }
                break;
            case 23 :
                // InternalNestDsl.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalNestDsl.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalNestDsl.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalNestDsl.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalNestDsl.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalNestDsl.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalNestDsl.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\34\2\uffff\3\34\1\31\2\uffff\2\34\1\uffff\3\34\1\uffff\1\31\1\34\1\31\1\uffff\3\31\2\uffff\2\34\1\uffff\1\34\3\uffff\3\34\3\uffff\2\34\1\uffff\4\34\7\uffff\7\34\1\107\1\34\1\111\10\34\1\uffff\1\122\1\uffff\10\34\1\uffff\1\34\1\135\1\34\1\137\1\140\4\34\1\146\1\uffff\1\147\2\uffff\1\150\4\34\3\uffff\1\155\3\34\1\uffff\1\161\1\34\1\163\1\uffff\1\164\2\uffff";
    static final String DFA15_eofS =
        "\165\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\2\uffff\3\60\1\135\2\uffff\2\60\1\uffff\3\60\1\uffff\1\72\1\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\60\3\uffff\3\60\3\uffff\2\60\1\uffff\4\60\7\uffff\22\60\1\uffff\1\60\1\uffff\10\60\1\uffff\12\60\1\uffff\1\60\2\uffff\5\60\3\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\2\uffff\3\172\1\135\2\uffff\2\172\1\uffff\3\172\1\uffff\1\72\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\3\uffff\3\172\3\uffff\2\172\1\uffff\4\172\7\uffff\22\172\1\uffff\1\172\1\uffff\10\172\1\uffff\12\172\1\uffff\1\172\2\uffff\5\172\3\uffff\4\172\1\uffff\3\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\4\4\uffff\1\11\1\12\2\uffff\1\17\3\uffff\1\24\3\uffff\1\30\3\uffff\1\34\1\35\2\uffff\1\27\1\uffff\1\26\1\3\1\4\3\uffff\1\10\1\11\1\12\2\uffff\1\17\4\uffff\1\24\1\25\1\30\1\31\1\32\1\33\1\34\22\uffff\1\20\1\uffff\1\23\10\uffff\1\21\12\uffff\1\1\1\uffff\1\5\1\6\5\uffff\1\22\1\2\1\7\4\uffff\1\13\3\uffff\1\16\1\uffff\1\15\1\14";
    static final String DFA15_specialS =
        "\1\1\24\uffff\1\0\1\2\136\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\1\20\1\21\2\31\1\14\2\31\1\27\12\24\1\11\1\10\5\31\3\22\1\17\2\22\1\15\5\22\1\13\1\22\1\12\1\16\12\22\1\7\2\31\1\23\1\22\1\31\1\22\1\6\2\22\1\1\10\22\1\5\4\22\1\4\7\22\1\2\1\31\1\3\uff82\31",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\32\11\35\1\33\2\35",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\41\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\24\35\1\42\5\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\43\13\35",
            "\1\44",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\47\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\1\50\31\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\52\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\53\5\35\1\54\5\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\55\25\35",
            "",
            "\1\57",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\65\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\66\6\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\67\10\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\14\35\1\70\15\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\71\13\35",
            "",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\72\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\73\14\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\74\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\75\7\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\76\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\77\16\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\100\21\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\101\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\102\21\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\1\35\1\103\30\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\104\16\35",
            "\12\35\3\uffff\1\36\3\uffff\23\35\1\105\6\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\106\1\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\110\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\112\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\113\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\114\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\115\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\116\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\117\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\120\13\35",
            "\12\35\3\uffff\1\36\3\uffff\23\35\1\121\6\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\123\6\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\124\1\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\125\26\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\6\35\1\126\23\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\127\10\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\1\130\31\35",
            "\12\35\3\uffff\1\36\3\uffff\14\35\1\132\1\35\1\131\13\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\133\13\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\134\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\136\7\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\141\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\142\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\1\143\31\35",
            "\12\35\3\uffff\1\36\3\uffff\14\35\1\144\1\35\1\145\13\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\151\25\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\152\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\1\153\31\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\154\14\35",
            "",
            "",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\156\1\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\157\14\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\160\25\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\162\1\35",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\3\uffff\1\36\3\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 49;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='e') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='}') ) {s = 3;}

                        else if ( (LA15_0=='s') ) {s = 4;}

                        else if ( (LA15_0=='n') ) {s = 5;}

                        else if ( (LA15_0=='b') ) {s = 6;}

                        else if ( (LA15_0=='[') ) {s = 7;}

                        else if ( (LA15_0==';') ) {s = 8;}

                        else if ( (LA15_0==':') ) {s = 9;}

                        else if ( (LA15_0=='O') ) {s = 10;}

                        else if ( (LA15_0=='M') ) {s = 11;}

                        else if ( (LA15_0==',') ) {s = 12;}

                        else if ( (LA15_0=='G') ) {s = 13;}

                        else if ( (LA15_0=='P') ) {s = 14;}

                        else if ( (LA15_0=='D') ) {s = 15;}

                        else if ( (LA15_0=='(') ) {s = 16;}

                        else if ( (LA15_0==')') ) {s = 17;}

                        else if ( ((LA15_0>='A' && LA15_0<='C')||(LA15_0>='E' && LA15_0<='F')||(LA15_0>='H' && LA15_0<='L')||LA15_0=='N'||(LA15_0>='Q' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||(LA15_0>='c' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='r')||(LA15_0>='t' && LA15_0<='z')) ) {s = 18;}

                        else if ( (LA15_0=='^') ) {s = 19;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 20;}

                        else if ( (LA15_0=='\"') ) {s = 21;}

                        else if ( (LA15_0=='\'') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 24;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='\\' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='\uFFFF')) ) {s = 49;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
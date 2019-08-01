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
            // InternalNestDsl.g:15:7: ( 'dto' )
            // InternalNestDsl.g:15:9: 'dto'
            {
            match("dto"); 


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
            // InternalNestDsl.g:16:7: ( 'type' )
            // InternalNestDsl.g:16:9: 'type'
            {
            match("type"); 


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
            // InternalNestDsl.g:17:7: ( '[]' )
            // InternalNestDsl.g:17:9: '[]'
            {
            match("[]"); 


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
            // InternalNestDsl.g:18:7: ( ';' )
            // InternalNestDsl.g:18:9: ';'
            {
            match(';'); 

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
            // InternalNestDsl.g:19:7: ( ':' )
            // InternalNestDsl.g:19:9: ':'
            {
            match(':'); 

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
            // InternalNestDsl.g:20:7: ( 'OneToOne' )
            // InternalNestDsl.g:20:9: 'OneToOne'
            {
            match("OneToOne"); 


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
            // InternalNestDsl.g:21:7: ( 'ManyToMany' )
            // InternalNestDsl.g:21:9: 'ManyToMany'
            {
            match("ManyToMany"); 


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
            // InternalNestDsl.g:22:7: ( 'ManyToOne' )
            // InternalNestDsl.g:22:9: 'ManyToOne'
            {
            match("ManyToOne"); 


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
            // InternalNestDsl.g:23:7: ( 'OneToMany' )
            // InternalNestDsl.g:23:9: 'OneToMany'
            {
            match("OneToMany"); 


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
            // InternalNestDsl.g:24:7: ( ',' )
            // InternalNestDsl.g:24:9: ','
            {
            match(','); 

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
            // InternalNestDsl.g:25:7: ( 'Get' )
            // InternalNestDsl.g:25:9: 'Get'
            {
            match("Get"); 


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
            // InternalNestDsl.g:26:7: ( 'Post' )
            // InternalNestDsl.g:26:9: 'Post'
            {
            match("Post"); 


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
            // InternalNestDsl.g:27:7: ( 'Delete' )
            // InternalNestDsl.g:27:9: 'Delete'
            {
            match("Delete"); 


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
            // InternalNestDsl.g:28:7: ( 'Put' )
            // InternalNestDsl.g:28:9: 'Put'
            {
            match("Put"); 


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
            // InternalNestDsl.g:29:7: ( '(' )
            // InternalNestDsl.g:29:9: '('
            {
            match('('); 

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
            // InternalNestDsl.g:30:7: ( '):' )
            // InternalNestDsl.g:30:9: '):'
            {
            match("):"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ARGUMENTREGEX"
    public final void mRULE_ARGUMENTREGEX() throws RecognitionException {
        try {
            int _type = RULE_ARGUMENTREGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:967:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:967:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:967:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            // InternalNestDsl.g:967:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            // InternalNestDsl.g:967:171: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalNestDsl.g:969:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:969:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNestDsl.g:969:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNestDsl.g:969:11: '^'
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

            // InternalNestDsl.g:969:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalNestDsl.g:971:10: ( ( '0' .. '9' )+ )
            // InternalNestDsl.g:971:12: ( '0' .. '9' )+
            {
            // InternalNestDsl.g:971:12: ( '0' .. '9' )+
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
            	    // InternalNestDsl.g:971:13: '0' .. '9'
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
            // InternalNestDsl.g:973:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalNestDsl.g:973:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalNestDsl.g:973:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalNestDsl.g:973:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNestDsl.g:973:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalNestDsl.g:973:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:973:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalNestDsl.g:973:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalNestDsl.g:973:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalNestDsl.g:973:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:973:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalNestDsl.g:975:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNestDsl.g:975:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNestDsl.g:975:24: ( options {greedy=false; } : . )*
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
            	    // InternalNestDsl.g:975:52: .
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
            // InternalNestDsl.g:977:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNestDsl.g:977:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNestDsl.g:977:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNestDsl.g:977:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalNestDsl.g:977:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:977:41: ( '\\r' )? '\\n'
                    {
                    // InternalNestDsl.g:977:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalNestDsl.g:977:41: '\\r'
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
            // InternalNestDsl.g:979:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNestDsl.g:979:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNestDsl.g:979:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalNestDsl.g:981:16: ( . )
            // InternalNestDsl.g:981:18: .
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
        // InternalNestDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=28;
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
                // InternalNestDsl.g:1:130: RULE_ARGUMENTREGEX
                {
                mRULE_ARGUMENTREGEX(); 

                }
                break;
            case 22 :
                // InternalNestDsl.g:1:149: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalNestDsl.g:1:157: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalNestDsl.g:1:166: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalNestDsl.g:1:178: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalNestDsl.g:1:194: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalNestDsl.g:1:210: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalNestDsl.g:1:218: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\33\2\uffff\2\33\1\30\2\uffff\2\33\1\uffff\3\33\1\uffff\1\30\1\33\1\30\1\uffff\3\30\2\uffff\2\33\1\uffff\1\33\3\uffff\2\33\3\uffff\2\33\1\uffff\4\33\7\uffff\2\33\1\77\3\33\1\103\1\33\1\105\3\33\1\uffff\1\111\2\33\1\uffff\1\114\1\uffff\3\33\1\uffff\2\33\1\uffff\1\33\1\124\4\33\1\132\1\uffff\1\133\4\33\2\uffff\1\140\3\33\1\uffff\1\144\1\33\1\146\1\uffff\1\147\2\uffff";
    static final String DFA15_eofS =
        "\150\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\2\uffff\2\60\1\135\2\uffff\2\60\1\uffff\3\60\1\uffff\1\72\1\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\60\3\uffff\2\60\3\uffff\2\60\1\uffff\4\60\7\uffff\14\60\1\uffff\3\60\1\uffff\1\60\1\uffff\3\60\1\uffff\2\60\1\uffff\7\60\1\uffff\5\60\2\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\2\uffff\2\172\1\135\2\uffff\2\172\1\uffff\3\172\1\uffff\1\72\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\3\uffff\2\172\3\uffff\2\172\1\uffff\4\172\7\uffff\14\172\1\uffff\3\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\7\172\1\uffff\5\172\2\uffff\4\172\1\uffff\3\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\4\3\uffff\1\10\1\11\2\uffff\1\16\3\uffff\1\23\3\uffff\1\27\3\uffff\1\33\1\34\2\uffff\1\26\1\uffff\1\25\1\3\1\4\2\uffff\1\7\1\10\1\11\2\uffff\1\16\4\uffff\1\23\1\24\1\27\1\30\1\31\1\32\1\33\14\uffff\1\5\3\uffff\1\17\1\uffff\1\22\3\uffff\1\6\2\uffff\1\20\7\uffff\1\1\5\uffff\1\21\1\2\4\uffff\1\12\3\uffff\1\15\1\uffff\1\14\1\13";
    static final String DFA15_specialS =
        "\1\2\23\uffff\1\1\1\0\122\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\17\1\20\2\30\1\13\2\30\1\26\12\23\1\10\1\7\5\30\3\21\1\16\2\21\1\14\5\21\1\12\1\21\1\11\1\15\12\21\1\6\2\30\1\22\1\21\1\30\3\21\1\4\1\1\16\21\1\5\6\21\1\2\1\30\1\3\uff82\30",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\31\11\34\1\32\2\34",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\40\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\41\1\34",
            "\1\42",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\45\14\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\1\46\31\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\50\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\51\5\34\1\52\5\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\53\25\34",
            "",
            "\1\55",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\63\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\64\6\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\65\13\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\17\34\1\66\12\34",
            "",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\67\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\70\14\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\71\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\72\7\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\73\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\74\16\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\75\21\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\76\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\100\25\34",
            "\12\34\3\uffff\1\35\3\uffff\23\34\1\101\6\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\102\1\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\104\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\106\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\107\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\110\14\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\112\13\34",
            "\12\34\3\uffff\1\35\3\uffff\23\34\1\113\6\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\115\6\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\116\1\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\117\26\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\14\34\1\121\1\34\1\120\13\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\122\13\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\123\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\125\7\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\126\14\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\1\127\31\34",
            "\12\34\3\uffff\1\35\3\uffff\14\34\1\130\1\34\1\131\13\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\134\25\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\135\14\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\1\136\31\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\137\14\34",
            "",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\141\1\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\142\14\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\143\25\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\30\34\1\145\1\34",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\3\uffff\1\35\3\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( ((LA15_20>='\u0000' && LA15_20<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='e') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='}') ) {s = 3;}

                        else if ( (LA15_0=='d') ) {s = 4;}

                        else if ( (LA15_0=='t') ) {s = 5;}

                        else if ( (LA15_0=='[') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0==':') ) {s = 8;}

                        else if ( (LA15_0=='O') ) {s = 9;}

                        else if ( (LA15_0=='M') ) {s = 10;}

                        else if ( (LA15_0==',') ) {s = 11;}

                        else if ( (LA15_0=='G') ) {s = 12;}

                        else if ( (LA15_0=='P') ) {s = 13;}

                        else if ( (LA15_0=='D') ) {s = 14;}

                        else if ( (LA15_0=='(') ) {s = 15;}

                        else if ( (LA15_0==')') ) {s = 16;}

                        else if ( ((LA15_0>='A' && LA15_0<='C')||(LA15_0>='E' && LA15_0<='F')||(LA15_0>='H' && LA15_0<='L')||LA15_0=='N'||(LA15_0>='Q' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='f' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 17;}

                        else if ( (LA15_0=='^') ) {s = 18;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 19;}

                        else if ( (LA15_0=='\"') ) {s = 20;}

                        else if ( (LA15_0=='\'') ) {s = 21;}

                        else if ( (LA15_0=='/') ) {s = 22;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 23;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='\\' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 24;}

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
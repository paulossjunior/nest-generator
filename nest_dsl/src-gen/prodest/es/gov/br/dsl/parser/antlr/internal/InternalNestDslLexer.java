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

    public InternalNestDslLexer() {;} 
    public InternalNestDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNestDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalNestDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:16:7: ( ':' )
            // InternalNestDsl.g:16:9: ':'
            {
            match(':'); 

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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:19:7: ( 'OneToOne' )
            // InternalNestDsl.g:19:9: 'OneToOne'
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
            // InternalNestDsl.g:20:7: ( 'ManyToMany' )
            // InternalNestDsl.g:20:9: 'ManyToMany'
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
            // InternalNestDsl.g:21:7: ( 'ManyToOne' )
            // InternalNestDsl.g:21:9: 'ManyToOne'
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
            // InternalNestDsl.g:22:7: ( 'OneToMany' )
            // InternalNestDsl.g:22:9: 'OneToMany'
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
            // InternalNestDsl.g:23:7: ( ',' )
            // InternalNestDsl.g:23:9: ','
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
            // InternalNestDsl.g:24:7: ( 'Get' )
            // InternalNestDsl.g:24:9: 'Get'
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
            // InternalNestDsl.g:25:7: ( 'Post' )
            // InternalNestDsl.g:25:9: 'Post'
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
            // InternalNestDsl.g:26:7: ( 'Delete' )
            // InternalNestDsl.g:26:9: 'Delete'
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
            // InternalNestDsl.g:27:7: ( 'Put' )
            // InternalNestDsl.g:27:9: 'Put'
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
            // InternalNestDsl.g:28:7: ( '(' )
            // InternalNestDsl.g:28:9: '('
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
            // InternalNestDsl.g:29:7: ( '):' )
            // InternalNestDsl.g:29:9: '):'
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

    // $ANTLR start "RULE_DATATYPE"
    public final void mRULE_DATATYPE() throws RecognitionException {
        try {
            int _type = RULE_DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:1041:15: ( ( 'string' | 'number' | 'Date' | 'boolean' ) )
            // InternalNestDsl.g:1041:17: ( 'string' | 'number' | 'Date' | 'boolean' )
            {
            // InternalNestDsl.g:1041:17: ( 'string' | 'number' | 'Date' | 'boolean' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt1=1;
                }
                break;
            case 'n':
                {
                alt1=2;
                }
                break;
            case 'D':
                {
                alt1=3;
                }
                break;
            case 'b':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalNestDsl.g:1041:18: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:1041:27: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // InternalNestDsl.g:1041:36: 'Date'
                    {
                    match("Date"); 


                    }
                    break;
                case 4 :
                    // InternalNestDsl.g:1041:43: 'boolean'
                    {
                    match("boolean"); 


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
    // $ANTLR end "RULE_DATATYPE"

    // $ANTLR start "RULE_ARGUMENTREGEX"
    public final void mRULE_ARGUMENTREGEX() throws RecognitionException {
        try {
            int _type = RULE_ARGUMENTREGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:1043:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:1043:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:1043:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            match("=>"); 

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:1043:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            match('.'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:1043:171: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalNestDsl.g:1045:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:1045:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNestDsl.g:1045:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNestDsl.g:1045:11: '^'
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

            // InternalNestDsl.g:1045:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalNestDsl.g:1047:10: ( ( '0' .. '9' )+ )
            // InternalNestDsl.g:1047:12: ( '0' .. '9' )+
            {
            // InternalNestDsl.g:1047:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNestDsl.g:1047:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalNestDsl.g:1049:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalNestDsl.g:1049:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalNestDsl.g:1049:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNestDsl.g:1049:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNestDsl.g:1049:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNestDsl.g:1049:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:1049:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:1049:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalNestDsl.g:1049:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalNestDsl.g:1049:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:1049:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalNestDsl.g:1051:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNestDsl.g:1051:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNestDsl.g:1051:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNestDsl.g:1051:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalNestDsl.g:1053:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNestDsl.g:1053:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNestDsl.g:1053:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNestDsl.g:1053:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalNestDsl.g:1053:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNestDsl.g:1053:41: ( '\\r' )? '\\n'
                    {
                    // InternalNestDsl.g:1053:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalNestDsl.g:1053:41: '\\r'
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
            // InternalNestDsl.g:1055:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNestDsl.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNestDsl.g:1055:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalNestDsl.g:1057:16: ( . )
            // InternalNestDsl.g:1057:18: .
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
        // InternalNestDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_DATATYPE | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=28;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalNestDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalNestDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalNestDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalNestDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalNestDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalNestDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalNestDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalNestDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalNestDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalNestDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalNestDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalNestDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalNestDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalNestDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalNestDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalNestDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalNestDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalNestDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalNestDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalNestDsl.g:1:124: RULE_DATATYPE
                {
                mRULE_DATATYPE(); 

                }
                break;
            case 21 :
                // InternalNestDsl.g:1:138: RULE_ARGUMENTREGEX
                {
                mRULE_ARGUMENTREGEX(); 

                }
                break;
            case 22 :
                // InternalNestDsl.g:1:157: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalNestDsl.g:1:165: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalNestDsl.g:1:174: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalNestDsl.g:1:186: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalNestDsl.g:1:202: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalNestDsl.g:1:218: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalNestDsl.g:1:226: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\35\2\uffff\1\35\1\uffff\1\32\1\uffff\2\35\1\uffff\3\35\1\uffff\1\32\4\35\1\32\1\uffff\3\32\2\uffff\2\35\1\uffff\1\35\3\uffff\1\35\3\uffff\2\35\1\uffff\5\35\2\uffff\3\35\5\uffff\2\35\1\107\2\35\1\112\1\35\1\114\7\35\1\uffff\2\35\1\uffff\1\126\1\uffff\1\35\1\130\7\35\1\uffff\1\35\1\uffff\3\35\1\145\4\35\1\153\2\130\1\35\1\uffff\1\155\4\35\1\uffff\1\130\1\uffff\1\162\3\35\1\uffff\1\166\1\35\1\170\1\uffff\1\171\2\uffff";
    static final String DFA16_eofS =
        "\172\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\2\uffff\1\60\1\uffff\1\135\1\uffff\2\60\1\uffff\3\60\1\uffff\1\72\4\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\60\3\uffff\1\60\3\uffff\2\60\1\uffff\5\60\2\uffff\3\60\5\uffff\17\60\1\uffff\2\60\1\uffff\1\60\1\uffff\11\60\1\uffff\1\60\1\uffff\14\60\1\uffff\5\60\1\uffff\1\60\1\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\2\uffff\1\172\1\uffff\1\135\1\uffff\2\172\1\uffff\3\172\1\uffff\1\72\5\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\3\uffff\1\172\3\uffff\2\172\1\uffff\5\172\2\uffff\3\172\5\uffff\17\172\1\uffff\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff\1\172\1\uffff\14\172\1\uffff\5\172\1\uffff\1\172\1\uffff\4\172\1\uffff\3\172\1\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\6\1\uffff\1\10\2\uffff\1\15\3\uffff\1\22\6\uffff\1\27\3\uffff\1\33\1\34\2\uffff\1\26\1\uffff\1\25\1\3\1\4\1\uffff\1\6\1\7\1\10\2\uffff\1\15\5\uffff\1\22\1\23\3\uffff\1\27\1\30\1\31\1\32\1\33\17\uffff\1\5\2\uffff\1\16\1\uffff\1\21\11\uffff\1\17\1\uffff\1\24\14\uffff\1\1\5\uffff\1\20\1\uffff\1\2\4\uffff\1\11\3\uffff\1\14\1\uffff\1\13\1\12";
    static final String DFA16_specialS =
        "\1\2\25\uffff\1\1\1\0\142\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\1\16\1\17\2\32\1\12\2\32\1\30\12\25\1\5\1\7\5\32\3\23\1\15\2\23\1\13\5\23\1\11\1\23\1\10\1\14\12\23\1\6\2\32\1\24\1\23\1\32\1\23\1\22\1\23\1\4\1\1\10\23\1\21\4\23\1\20\7\23\1\2\1\32\1\3\uff82\32",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\33\11\36\1\34\2\36",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\42\6\36",
            "",
            "\1\44",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\46\14\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\47\31\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\51\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\52\5\36\1\53\5\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\55\3\36\1\54\25\36",
            "",
            "\1\57",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\60\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\61\5\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\62\13\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\70\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\71\6\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\72\13\36",
            "",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\73\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\74\14\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\75\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\76\7\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\77\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\100\16\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\101\6\36",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\102\10\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\103\15\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\104\13\36",
            "",
            "",
            "",
            "",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\105\21\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\106\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\23\36\1\110\6\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\111\1\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\113\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\115\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\116\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\117\21\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\36\1\120\30\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\121\16\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\122\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\123\14\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\124\13\36",
            "\12\36\3\uffff\1\37\3\uffff\23\36\1\125\6\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\127\6\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\131\14\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\132\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\133\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\134\1\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\135\26\36",
            "\12\36\3\uffff\1\37\3\uffff\14\36\1\137\1\36\1\136\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\140\13\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\141\25\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\142\23\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\143\10\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\144\31\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\146\7\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\147\14\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\150\31\36",
            "\12\36\3\uffff\1\37\3\uffff\14\36\1\151\1\36\1\152\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\154\14\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\156\25\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\157\14\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\1\160\31\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\161\14\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\163\1\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\164\14\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\165\25\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\167\1\36",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\37\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_DATATYPE | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( ((LA16_22>='\u0000' && LA16_22<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='e') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='}') ) {s = 3;}

                        else if ( (LA16_0=='d') ) {s = 4;}

                        else if ( (LA16_0==':') ) {s = 5;}

                        else if ( (LA16_0=='[') ) {s = 6;}

                        else if ( (LA16_0==';') ) {s = 7;}

                        else if ( (LA16_0=='O') ) {s = 8;}

                        else if ( (LA16_0=='M') ) {s = 9;}

                        else if ( (LA16_0==',') ) {s = 10;}

                        else if ( (LA16_0=='G') ) {s = 11;}

                        else if ( (LA16_0=='P') ) {s = 12;}

                        else if ( (LA16_0=='D') ) {s = 13;}

                        else if ( (LA16_0=='(') ) {s = 14;}

                        else if ( (LA16_0==')') ) {s = 15;}

                        else if ( (LA16_0=='s') ) {s = 16;}

                        else if ( (LA16_0=='n') ) {s = 17;}

                        else if ( (LA16_0=='b') ) {s = 18;}

                        else if ( ((LA16_0>='A' && LA16_0<='C')||(LA16_0>='E' && LA16_0<='F')||(LA16_0>='H' && LA16_0<='L')||LA16_0=='N'||(LA16_0>='Q' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||LA16_0=='c'||(LA16_0>='f' && LA16_0<='m')||(LA16_0>='o' && LA16_0<='r')||(LA16_0>='t' && LA16_0<='z')) ) {s = 19;}

                        else if ( (LA16_0=='^') ) {s = 20;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 21;}

                        else if ( (LA16_0=='\"') ) {s = 22;}

                        else if ( (LA16_0=='\'') ) {s = 23;}

                        else if ( (LA16_0=='/') ) {s = 24;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 25;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||(LA16_0>='<' && LA16_0<='@')||(LA16_0>='\\' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
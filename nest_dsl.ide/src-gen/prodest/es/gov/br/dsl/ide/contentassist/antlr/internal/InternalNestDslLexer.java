package prodest.es.gov.br.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNestDslLexer extends Lexer {
    public static final int RULE_ARGUMENTREGEX=8;
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_DATATYPE=7;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_BOOLEANTYTPE=5;
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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:11:7: ( 'OneToOne' )
            // InternalNestDsl.g:11:9: 'OneToOne'
            {
            match("OneToOne"); 


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
            // InternalNestDsl.g:12:7: ( 'ManyToMany' )
            // InternalNestDsl.g:12:9: 'ManyToMany'
            {
            match("ManyToMany"); 


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
            // InternalNestDsl.g:13:7: ( 'ManyToOne' )
            // InternalNestDsl.g:13:9: 'ManyToOne'
            {
            match("ManyToOne"); 


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
            // InternalNestDsl.g:14:7: ( 'OneToMany' )
            // InternalNestDsl.g:14:9: 'OneToMany'
            {
            match("OneToMany"); 


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
            // InternalNestDsl.g:15:7: ( 'Get' )
            // InternalNestDsl.g:15:9: 'Get'
            {
            match("Get"); 


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
            // InternalNestDsl.g:16:7: ( 'Post' )
            // InternalNestDsl.g:16:9: 'Post'
            {
            match("Post"); 


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
            // InternalNestDsl.g:17:7: ( 'Delete' )
            // InternalNestDsl.g:17:9: 'Delete'
            {
            match("Delete"); 


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
            // InternalNestDsl.g:18:7: ( 'Put' )
            // InternalNestDsl.g:18:9: 'Put'
            {
            match("Put"); 


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
            // InternalNestDsl.g:19:7: ( '#' )
            // InternalNestDsl.g:19:9: '#'
            {
            match('#'); 

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
            // InternalNestDsl.g:20:7: ( 'entity' )
            // InternalNestDsl.g:20:9: 'entity'
            {
            match("entity"); 


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
            // InternalNestDsl.g:21:7: ( '{' )
            // InternalNestDsl.g:21:9: '{'
            {
            match('{'); 

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
            // InternalNestDsl.g:22:7: ( '}' )
            // InternalNestDsl.g:22:9: '}'
            {
            match('}'); 

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
            // InternalNestDsl.g:23:7: ( 'extends' )
            // InternalNestDsl.g:23:9: 'extends'
            {
            match("extends"); 


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
            // InternalNestDsl.g:24:7: ( 'dto' )
            // InternalNestDsl.g:24:9: 'dto'
            {
            match("dto"); 


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
            // InternalNestDsl.g:25:7: ( ':' )
            // InternalNestDsl.g:25:9: ':'
            {
            match(':'); 

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
            // InternalNestDsl.g:26:7: ( ';' )
            // InternalNestDsl.g:26:9: ';'
            {
            match(';'); 

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
            // InternalNestDsl.g:27:7: ( ',' )
            // InternalNestDsl.g:27:9: ','
            {
            match(','); 

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
            // InternalNestDsl.g:28:7: ( 'required' )
            // InternalNestDsl.g:28:9: 'required'
            {
            match("required"); 


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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:31:7: ( '[]' )
            // InternalNestDsl.g:31:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DATATYPE"
    public final void mRULE_DATATYPE() throws RecognitionException {
        try {
            int _type = RULE_DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:2839:15: ( ( 'string' | 'number' | 'Date' | 'boolean' ) )
            // InternalNestDsl.g:2839:17: ( 'string' | 'number' | 'Date' | 'boolean' )
            {
            // InternalNestDsl.g:2839:17: ( 'string' | 'number' | 'Date' | 'boolean' )
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
                    // InternalNestDsl.g:2839:18: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:2839:27: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // InternalNestDsl.g:2839:36: 'Date'
                    {
                    match("Date"); 


                    }
                    break;
                case 4 :
                    // InternalNestDsl.g:2839:43: 'boolean'
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

    // $ANTLR start "RULE_BOOLEANTYTPE"
    public final void mRULE_BOOLEANTYTPE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEANTYTPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:2841:19: ( ( 'true' | 'false' ) )
            // InternalNestDsl.g:2841:21: ( 'true' | 'false' )
            {
            // InternalNestDsl.g:2841:21: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNestDsl.g:2841:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:2841:29: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEANTYTPE"

    // $ANTLR start "RULE_ARGUMENTREGEX"
    public final void mRULE_ARGUMENTREGEX() throws RecognitionException {
        try {
            int _type = RULE_ARGUMENTREGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:2843:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:2843:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:2843:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            match("=>"); 

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:2843:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            match('.'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:2843:171: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
    // $ANTLR end "RULE_ARGUMENTREGEX"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:2845:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:2845:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNestDsl.g:2845:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNestDsl.g:2845:11: '^'
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

            // InternalNestDsl.g:2845:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    break loop7;
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
            // InternalNestDsl.g:2847:10: ( ( '0' .. '9' )+ )
            // InternalNestDsl.g:2847:12: ( '0' .. '9' )+
            {
            // InternalNestDsl.g:2847:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNestDsl.g:2847:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalNestDsl.g:2849:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalNestDsl.g:2849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalNestDsl.g:2849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNestDsl.g:2849:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNestDsl.g:2849:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalNestDsl.g:2849:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:2849:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalNestDsl.g:2849:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalNestDsl.g:2849:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalNestDsl.g:2849:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:2849:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalNestDsl.g:2851:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNestDsl.g:2851:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNestDsl.g:2851:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNestDsl.g:2851:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalNestDsl.g:2853:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNestDsl.g:2853:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNestDsl.g:2853:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNestDsl.g:2853:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalNestDsl.g:2853:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNestDsl.g:2853:41: ( '\\r' )? '\\n'
                    {
                    // InternalNestDsl.g:2853:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalNestDsl.g:2853:41: '\\r'
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
            // InternalNestDsl.g:2855:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNestDsl.g:2855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNestDsl.g:2855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalNestDsl.g:2857:16: ( . )
            // InternalNestDsl.g:2857:18: .
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
        // InternalNestDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DATATYPE | RULE_BOOLEANTYTPE | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=31;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalNestDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalNestDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalNestDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalNestDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalNestDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalNestDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalNestDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalNestDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalNestDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalNestDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalNestDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalNestDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalNestDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalNestDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalNestDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalNestDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalNestDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalNestDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalNestDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalNestDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalNestDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalNestDsl.g:1:136: RULE_DATATYPE
                {
                mRULE_DATATYPE(); 

                }
                break;
            case 23 :
                // InternalNestDsl.g:1:150: RULE_BOOLEANTYTPE
                {
                mRULE_BOOLEANTYTPE(); 

                }
                break;
            case 24 :
                // InternalNestDsl.g:1:168: RULE_ARGUMENTREGEX
                {
                mRULE_ARGUMENTREGEX(); 

                }
                break;
            case 25 :
                // InternalNestDsl.g:1:187: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalNestDsl.g:1:195: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalNestDsl.g:1:204: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalNestDsl.g:1:216: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalNestDsl.g:1:232: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalNestDsl.g:1:248: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalNestDsl.g:1:256: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\5\40\1\uffff\1\40\2\uffff\1\40\3\uffff\1\40\1\uffff\2\36\6\40\1\36\1\uffff\3\36\2\uffff\1\40\1\uffff\1\40\1\uffff\6\40\1\uffff\2\40\2\uffff\1\40\3\uffff\1\40\3\uffff\5\40\5\uffff\2\40\1\122\1\40\1\124\4\40\1\131\10\40\1\uffff\1\142\1\uffff\1\40\1\144\2\40\1\uffff\4\40\1\153\3\40\1\uffff\1\40\1\uffff\6\40\1\uffff\1\153\3\40\1\173\1\174\2\40\2\144\5\40\2\uffff\1\u0084\1\40\1\144\1\u0086\3\40\1\uffff\1\u008a\1\uffff\1\u008b\1\40\1\u008d\2\uffff\1\u008e\2\uffff";
    static final String DFA17_eofS =
        "\u008f\uffff";
    static final String DFA17_minS =
        "\1\0\5\60\1\uffff\1\60\2\uffff\1\60\3\uffff\1\60\1\uffff\1\72\1\135\6\60\1\101\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\1\60\1\uffff\6\60\1\uffff\2\60\2\uffff\1\60\3\uffff\1\60\3\uffff\5\60\5\uffff\22\60\1\uffff\1\60\1\uffff\4\60\1\uffff\10\60\1\uffff\1\60\1\uffff\6\60\1\uffff\17\60\2\uffff\7\60\1\uffff\1\60\1\uffff\3\60\2\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\5\172\1\uffff\1\172\2\uffff\1\172\3\uffff\1\172\1\uffff\1\72\1\135\7\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\uffff\2\172\2\uffff\1\172\3\uffff\1\172\3\uffff\5\172\5\uffff\22\172\1\uffff\1\172\1\uffff\4\172\1\uffff\10\172\1\uffff\1\172\1\uffff\6\172\1\uffff\17\172\2\uffff\7\172\1\uffff\1\172\1\uffff\3\172\2\uffff\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\6\uffff\1\11\1\uffff\1\13\1\14\1\uffff\1\17\1\20\1\21\1\uffff\1\23\11\uffff\1\32\3\uffff\1\36\1\37\1\uffff\1\31\1\uffff\1\30\6\uffff\1\11\2\uffff\1\13\1\14\1\uffff\1\17\1\20\1\21\1\uffff\1\23\1\24\1\25\5\uffff\1\32\1\33\1\34\1\35\1\36\22\uffff\1\5\1\uffff\1\10\4\uffff\1\16\10\uffff\1\6\1\uffff\1\26\6\uffff\1\27\17\uffff\1\7\1\12\7\uffff\1\15\1\uffff\1\1\3\uffff\1\22\1\4\1\uffff\1\3\1\2";
    static final String DFA17_specialS =
        "\1\1\31\uffff\1\0\1\2\163\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\1\6\3\36\1\33\1\17\1\20\2\36\1\15\2\36\1\34\12\31\1\13\1\14\5\36\3\27\1\5\2\27\1\3\5\27\1\2\1\27\1\1\1\4\12\27\1\21\2\36\1\30\1\27\1\36\1\27\1\24\1\27\1\12\1\7\1\26\7\27\1\23\3\27\1\16\1\22\1\25\6\27\1\10\1\36\1\11\uff82\36",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\37\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\43\31\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\44\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\45\5\41\1\46\5\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\50\3\41\1\47\25\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\52\11\41\1\53\2\41",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\56\6\41",
            "",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\62\25\41",
            "",
            "\1\64",
            "\1\65",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\66\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\24\41\1\67\5\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\70\13\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\21\41\1\71\10\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\72\31\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\100\25\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\101\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\102\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\103\7\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\104\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\105\16\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\106\6\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\107\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\110\6\41",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\111\13\41",
            "",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\20\41\1\112\11\41",
            "",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\21\41\1\113\10\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\14\41\1\114\15\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\115\13\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\24\41\1\116\5\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\117\16\41",
            "",
            "",
            "",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\23\41\1\120\6\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\30\41\1\121\1\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\123\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\125\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\126\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\10\41\1\127\21\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\130\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\24\41\1\132\5\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\10\41\1\133\21\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\41\1\134\30\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\135\16\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\136\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\137\7\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\140\13\41",
            "\12\41\3\uffff\1\42\3\uffff\23\41\1\141\6\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\143\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\145\6\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\146\14\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\10\41\1\147\21\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\150\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\151\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\152\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\154\25\41",
            "\12\41\3\uffff\1\42\3\uffff\14\41\1\156\1\41\1\155\13\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\157\13\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\160\25\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\30\41\1\161\1\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\162\26\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\21\41\1\163\10\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\6\41\1\164\23\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\21\41\1\165\10\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\166\31\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\167\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\170\31\41",
            "\12\41\3\uffff\1\42\3\uffff\14\41\1\171\1\41\1\172\13\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\175\7\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\176\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\177\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\u0080\25\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\u0081\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\1\u0082\31\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\u0083\14\41",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\u0085\26\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\30\41\1\u0087\1\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\15\41\1\u0088\14\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\u0089\25\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\30\41\1\u008c\1\41",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\3\uffff\1\42\3\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DATATYPE | RULE_BOOLEANTYTPE | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='O') ) {s = 1;}

                        else if ( (LA17_0=='M') ) {s = 2;}

                        else if ( (LA17_0=='G') ) {s = 3;}

                        else if ( (LA17_0=='P') ) {s = 4;}

                        else if ( (LA17_0=='D') ) {s = 5;}

                        else if ( (LA17_0=='#') ) {s = 6;}

                        else if ( (LA17_0=='e') ) {s = 7;}

                        else if ( (LA17_0=='{') ) {s = 8;}

                        else if ( (LA17_0=='}') ) {s = 9;}

                        else if ( (LA17_0=='d') ) {s = 10;}

                        else if ( (LA17_0==':') ) {s = 11;}

                        else if ( (LA17_0==';') ) {s = 12;}

                        else if ( (LA17_0==',') ) {s = 13;}

                        else if ( (LA17_0=='r') ) {s = 14;}

                        else if ( (LA17_0=='(') ) {s = 15;}

                        else if ( (LA17_0==')') ) {s = 16;}

                        else if ( (LA17_0=='[') ) {s = 17;}

                        else if ( (LA17_0=='s') ) {s = 18;}

                        else if ( (LA17_0=='n') ) {s = 19;}

                        else if ( (LA17_0=='b') ) {s = 20;}

                        else if ( (LA17_0=='t') ) {s = 21;}

                        else if ( (LA17_0=='f') ) {s = 22;}

                        else if ( ((LA17_0>='A' && LA17_0<='C')||(LA17_0>='E' && LA17_0<='F')||(LA17_0>='H' && LA17_0<='L')||LA17_0=='N'||(LA17_0>='Q' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='a'||LA17_0=='c'||(LA17_0>='g' && LA17_0<='m')||(LA17_0>='o' && LA17_0<='q')||(LA17_0>='u' && LA17_0<='z')) ) {s = 23;}

                        else if ( (LA17_0=='^') ) {s = 24;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 25;}

                        else if ( (LA17_0=='\"') ) {s = 26;}

                        else if ( (LA17_0=='\'') ) {s = 27;}

                        else if ( (LA17_0=='/') ) {s = 28;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 29;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='$' && LA17_0<='&')||(LA17_0>='*' && LA17_0<='+')||(LA17_0>='-' && LA17_0<='.')||(LA17_0>='<' && LA17_0<='@')||(LA17_0>='\\' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
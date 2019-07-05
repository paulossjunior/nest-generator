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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
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
            // InternalNestDsl.g:15:7: ( 'type' )
            // InternalNestDsl.g:15:9: 'type'
            {
            match("type"); 


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
            // InternalNestDsl.g:16:7: ( '[]' )
            // InternalNestDsl.g:16:9: '[]'
            {
            match("[]"); 


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
            // InternalNestDsl.g:17:7: ( ';' )
            // InternalNestDsl.g:17:9: ';'
            {
            match(';'); 

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
            // InternalNestDsl.g:18:7: ( ':' )
            // InternalNestDsl.g:18:9: ':'
            {
            match(':'); 

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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_ARGUMENTREGEX"
    public final void mRULE_ARGUMENTREGEX() throws RecognitionException {
        try {
            int _type = RULE_ARGUMENTREGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalNestDsl.g:621:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:621:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '=>' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalNestDsl.g:621:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            // InternalNestDsl.g:621:109: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

            // InternalNestDsl.g:621:171: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalNestDsl.g:623:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalNestDsl.g:623:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalNestDsl.g:623:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNestDsl.g:623:11: '^'
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

            // InternalNestDsl.g:623:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalNestDsl.g:625:10: ( ( '0' .. '9' )+ )
            // InternalNestDsl.g:625:12: ( '0' .. '9' )+
            {
            // InternalNestDsl.g:625:12: ( '0' .. '9' )+
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
            	    // InternalNestDsl.g:625:13: '0' .. '9'
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
            // InternalNestDsl.g:627:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalNestDsl.g:627:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalNestDsl.g:627:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalNestDsl.g:627:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalNestDsl.g:627:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalNestDsl.g:627:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:627:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalNestDsl.g:627:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalNestDsl.g:627:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalNestDsl.g:627:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalNestDsl.g:627:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalNestDsl.g:629:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalNestDsl.g:629:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalNestDsl.g:629:24: ( options {greedy=false; } : . )*
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
            	    // InternalNestDsl.g:629:52: .
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
            // InternalNestDsl.g:631:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalNestDsl.g:631:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalNestDsl.g:631:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNestDsl.g:631:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalNestDsl.g:631:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNestDsl.g:631:41: ( '\\r' )? '\\n'
                    {
                    // InternalNestDsl.g:631:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalNestDsl.g:631:41: '\\r'
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
            // InternalNestDsl.g:633:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalNestDsl.g:633:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalNestDsl.g:633:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalNestDsl.g:635:16: ( . )
            // InternalNestDsl.g:635:18: .
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
        // InternalNestDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=21;
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
                // InternalNestDsl.g:1:88: RULE_ARGUMENTREGEX
                {
                mRULE_ARGUMENTREGEX(); 

                }
                break;
            case 15 :
                // InternalNestDsl.g:1:107: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalNestDsl.g:1:115: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // InternalNestDsl.g:1:124: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // InternalNestDsl.g:1:136: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // InternalNestDsl.g:1:152: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // InternalNestDsl.g:1:168: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // InternalNestDsl.g:1:176: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\25\2\uffff\1\25\1\22\2\uffff\2\25\1\uffff\1\25\1\22\1\uffff\3\22\2\uffff\2\25\1\uffff\1\25\3\uffff\1\25\3\uffff\2\25\6\uffff\7\25\1\62\4\25\1\uffff\2\25\1\72\4\25\1\uffff\1\100\4\25\1\uffff\1\105\3\25\1\uffff\1\111\1\25\1\113\1\uffff\1\114\2\uffff";
    static final String DFA15_eofS =
        "\115\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\2\uffff\1\60\1\135\2\uffff\2\60\1\uffff\1\60\1\101\1\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\60\3\uffff\1\60\3\uffff\2\60\6\uffff\14\60\1\uffff\7\60\1\uffff\5\60\1\uffff\4\60\1\uffff\3\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\2\uffff\1\172\1\135\2\uffff\2\172\1\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\3\uffff\1\172\3\uffff\2\172\6\uffff\14\172\1\uffff\7\172\1\uffff\5\172\1\uffff\4\172\1\uffff\3\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\4\2\uffff\1\7\1\10\2\uffff\1\15\2\uffff\1\20\3\uffff\1\24\1\25\2\uffff\1\17\1\uffff\1\16\1\3\1\4\1\uffff\1\6\1\7\1\10\2\uffff\1\15\1\20\1\21\1\22\1\23\1\24\14\uffff\1\5\7\uffff\1\1\5\uffff\1\2\4\uffff\1\11\3\uffff\1\14\1\uffff\1\13\1\12";
    static final String DFA15_specialS =
        "\1\1\15\uffff\1\0\1\2\75\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\4\22\1\12\2\22\1\20\12\15\1\7\1\6\5\22\14\13\1\11\1\13\1\10\13\13\1\5\2\22\1\14\1\13\1\22\4\13\1\1\16\13\1\4\6\13\1\2\1\22\1\3\uff82\22",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\23\11\26\1\24\2\26",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\30\26\1\32\1\26",
            "\1\33",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\36\14\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\1\37\31\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\23\26\1\46\6\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\23\26\1\47\6\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\17\26\1\50\12\26",
            "",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\51\25\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\52\14\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\10\26\1\53\21\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\54\25\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\55\25\26",
            "\12\26\3\uffff\1\27\3\uffff\23\26\1\56\6\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\30\26\1\57\1\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\23\26\1\60\6\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\61\14\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\16\26\1\63\13\26",
            "\12\26\3\uffff\1\27\3\uffff\23\26\1\64\6\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\30\26\1\65\1\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\3\26\1\66\26\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\14\26\1\70\1\26\1\67\13\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\16\26\1\71\13\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\22\26\1\73\7\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\74\14\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\1\75\31\26",
            "\12\26\3\uffff\1\27\3\uffff\14\26\1\76\1\26\1\77\13\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\101\25\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\102\14\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\1\103\31\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\104\14\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\30\26\1\106\1\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\15\26\1\107\14\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\110\25\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\30\26\1\112\1\26",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\3\uffff\1\27\3\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ARGUMENTREGEX | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_14 = input.LA(1);

                        s = -1;
                        if ( ((LA15_14>='\u0000' && LA15_14<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='e') ) {s = 1;}

                        else if ( (LA15_0=='{') ) {s = 2;}

                        else if ( (LA15_0=='}') ) {s = 3;}

                        else if ( (LA15_0=='t') ) {s = 4;}

                        else if ( (LA15_0=='[') ) {s = 5;}

                        else if ( (LA15_0==';') ) {s = 6;}

                        else if ( (LA15_0==':') ) {s = 7;}

                        else if ( (LA15_0=='O') ) {s = 8;}

                        else if ( (LA15_0=='M') ) {s = 9;}

                        else if ( (LA15_0==',') ) {s = 10;}

                        else if ( ((LA15_0>='A' && LA15_0<='L')||LA15_0=='N'||(LA15_0>='P' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 11;}

                        else if ( (LA15_0=='^') ) {s = 12;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 13;}

                        else if ( (LA15_0=='\"') ) {s = 14;}

                        else if ( (LA15_0=='\'') ) {s = 15;}

                        else if ( (LA15_0=='/') ) {s = 16;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 17;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='\\' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 34;}

                        else s = 18;

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
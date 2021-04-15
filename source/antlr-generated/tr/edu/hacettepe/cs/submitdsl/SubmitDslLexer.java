// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g 2010-03-24 22:54:02

 package tr.edu.hacettepe.cs.submitdsl;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SubmitDslLexer extends Lexer {
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=6;
    public static final int INT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int PRINT_CHAR=7;
    public static final int T__8=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int STRING=5;

    // delegates
    // delegators

    public SubmitDslLexer() {;} 
    public SubmitDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SubmitDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:11:6: ( 'assignment' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:11:8: 'assignment'
            {
            match("assignment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:12:6: ( '{' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:12:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:13:7: ( '}' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:14:7: ( 'subject' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:14:9: 'subject'
            {
            match("subject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:15:7: ( ':' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:15:9: ':'
            {
            match(':'); 

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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:16:7: ( '.' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:16:9: '.'
            {
            match('.'); 

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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:17:7: ( 'advisors' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:17:9: 'advisors'
            {
            match("advisors"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:18:7: ( ',' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:18:9: ','
            {
            match(','); 

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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:19:7: ( 'start-date' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:19:9: 'start-date'
            {
            match("start-date"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:20:7: ( '/' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:20:9: '/'
            {
            match('/'); 

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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:21:7: ( '-' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:21:9: '-'
            {
            match('-'); 

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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:22:7: ( 'end-date' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:22:9: 'end-date'
            {
            match("end-date"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:23:7: ( 'submission-format' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:23:9: 'submission-format'
            {
            match("submission-format"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:24:7: ( 'directory' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:24:9: 'directory'
            {
            match("directory"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:25:7: ( 'file-pattern' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:25:9: 'file-pattern'
            {
            match("file-pattern"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:26:7: ( 'file' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:26:9: 'file'
            {
            match("file"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:27:7: ( 'any' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:27:9: 'any'
            {
            match("any"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:28:7: ( 'optional' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:28:9: 'optional'
            {
            match("optional"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:29:7: ( 'mandatory' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:29:9: 'mandatory'
            {
            match("mandatory"); 


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
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:30:7: ( 'folder-recursive' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:30:9: 'folder-recursive'
            {
            match("folder-recursive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:128:12: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:128:14: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:128:14: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:131:2: ( ( '0' .. '9' )+ )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:132:2: ( '0' .. '9' )+
            {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:132:2: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:132:2: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:167:6: ( '\"' ( PRINT_CHAR )* '\"' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:168:6: '\"' ( PRINT_CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:168:10: ( PRINT_CHAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' '||LA3_0=='*'||(LA3_0>='-' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:168:10: PRINT_CHAR
            	    {
            	    mPRINT_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "PRINT_CHAR"
    public final void mPRINT_CHAR() throws RecognitionException {
        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:173:1: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | ' ' | '*' | '.' | '/' ) )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:174:1: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '-' | '_' | ' ' | '*' | '.' | '/' )
            {
            if ( input.LA(1)==' '||input.LA(1)=='*'||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PRINT_CHAR"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | WHITESPACE | INT | STRING )
        int alt4=23;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:128: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 22 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:139: INT
                {
                mINT(); 

                }
                break;
            case 23 :
                // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:1:143: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\35\uffff\1\37\2\uffff";
    static final String DFA4_eofS =
        "\40\uffff";
    static final String DFA4_minS =
        "\1\11\1\144\2\uffff\1\164\7\uffff\1\151\10\uffff\1\142\1\uffff"+
        "\1\154\1\uffff\1\152\1\145\2\uffff\1\55\2\uffff";
    static final String DFA4_maxS =
        "\1\175\1\163\2\uffff\1\165\7\uffff\1\157\10\uffff\1\142\1\uffff"+
        "\1\154\1\uffff\1\155\1\145\2\uffff\1\55\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\10\1\12\1\13\1\14\1\16\1\uffff"+
        "\1\22\1\23\1\25\1\26\1\27\1\1\1\7\1\21\1\uffff\1\11\1\uffff\1\24"+
        "\2\uffff\1\4\1\15\1\uffff\1\17\1\20";
    static final String DFA4_specialS =
        "\40\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\21\11\uffff\1\7"+
            "\1\11\1\6\1\10\12\20\1\5\46\uffff\1\1\2\uffff\1\13\1\12\1\14"+
            "\6\uffff\1\16\1\uffff\1\15\3\uffff\1\4\7\uffff\1\2\1\uffff\1"+
            "\3",
            "\1\23\11\uffff\1\24\4\uffff\1\22",
            "",
            "",
            "\1\26\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\5\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "",
            "\1\32",
            "",
            "\1\33\2\uffff\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | WHITESPACE | INT | STRING );";
        }
    }
 

}
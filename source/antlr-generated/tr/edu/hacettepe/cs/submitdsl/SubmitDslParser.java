// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g 2010-03-24 22:54:01

  package tr.edu.hacettepe.cs.submitdsl;
	import java.util.Date;
	import java.util.List;
	import java.util.ArrayList;
	
	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SubmitDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "STRING", "WHITESPACE", "PRINT_CHAR", "'assignment'", "'{'", "'}'", "'subject'", "':'", "'.'", "'advisors'", "','", "'start-date'", "'/'", "'-'", "'end-date'", "'submission-format'", "'directory'", "'file-pattern'", "'file'", "'any'", "'optional'", "'mandatory'", "'folder-recursive'"
    };
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


        public SubmitDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SubmitDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SubmitDslParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g"; }


    	List<String> arrayList = new ArrayList<String>();
    	MySubmitModel model = new MySubmitModel();
    	Date date = new Date();
    	List<MySubmitFormat> bigList = new ArrayList<MySubmitFormat>();
    	



    // $ANTLR start "parse"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:32:1: parse returns [MySubmitModel finalModel] : assignment EOF ;
    public final MySubmitModel parse() throws RecognitionException {
        MySubmitModel finalModel = null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:33:2: ( assignment EOF )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:34:2: assignment EOF
            {
            pushFollow(FOLLOW_assignment_in_parse55);
            assignment();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_parse57); 
             
            		finalModel = model;
            	

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return finalModel;
    }
    // $ANTLR end "parse"


    // $ANTLR start "integer"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:38:1: integer returns [int value] : INT ;
    public final int integer() throws RecognitionException {
        int value = 0;

        Token INT1=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:39:5: ( INT )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:39:8: INT
            {
            INT1=(Token)match(input,INT,FOLLOW_INT_in_integer77); 
            value = Integer.parseInt((INT1!=null?INT1.getText():null));

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "integer"


    // $ANTLR start "string"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:41:1: string returns [String value] : quotedValue= STRING ;
    public final String string() throws RecognitionException {
        String value = null;

        Token quotedValue=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:42:2: (quotedValue= STRING )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:43:2: quotedValue= STRING
            {
            quotedValue=(Token)match(input,STRING,FOLLOW_STRING_in_string99); 

            	value = quotedValue.getText().substring(1, 
            	quotedValue.getText().length()-1);
            	

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return value;
    }
    // $ANTLR end "string"


    // $ANTLR start "assignment"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:49:1: assignment : 'assignment' assignment_name= string '{' ( subject | advisors | end_date | start_date | submission_format )+ '}' ;
    public final void assignment() throws RecognitionException {
        String assignment_name = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:50:2: ( 'assignment' assignment_name= string '{' ( subject | advisors | end_date | start_date | submission_format )+ '}' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:51:2: 'assignment' assignment_name= string '{' ( subject | advisors | end_date | start_date | submission_format )+ '}'
            {
            match(input,8,FOLLOW_8_in_assignment116); 
            pushFollow(FOLLOW_string_in_assignment120);
            assignment_name=string();

            state._fsp--;


            	model.setName(assignment_name);
            match(input,9,FOLLOW_9_in_assignment125); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:3: ( subject | advisors | end_date | start_date | submission_format )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 16:
                    {
                    alt1=4;
                    }
                    break;
                case 20:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:4: subject
            	    {
            	    pushFollow(FOLLOW_subject_in_assignment130);
            	    subject();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:12: advisors
            	    {
            	    pushFollow(FOLLOW_advisors_in_assignment132);
            	    advisors();

            	    state._fsp--;

            	    model.setAdvisors(arrayList);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:53: end_date
            	    {
            	    pushFollow(FOLLOW_end_date_in_assignment136);
            	    end_date();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:62: start_date
            	    {
            	    pushFollow(FOLLOW_start_date_in_assignment138);
            	    start_date();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:54:73: submission_format
            	    {
            	    pushFollow(FOLLOW_submission_format_in_assignment140);
            	    submission_format();

            	    state._fsp--;

            	    model.setSubmitFormat(bigList);

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

            match(input,10,FOLLOW_10_in_assignment147); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "subject"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:60:1: subject : 'subject' ':' subject_name= string '.' ;
    public final void subject() throws RecognitionException {
        String subject_name = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:61:2: ( 'subject' ':' subject_name= string '.' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:62:2: 'subject' ':' subject_name= string '.'
            {
            match(input,11,FOLLOW_11_in_subject163); 
            match(input,12,FOLLOW_12_in_subject165); 
            pushFollow(FOLLOW_string_in_subject169);
            subject_name=string();

            state._fsp--;

            if(model.getSubject()==null) model.setSubject(subject_name);
            match(input,13,FOLLOW_13_in_subject173); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "subject"


    // $ANTLR start "advisors"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:65:1: advisors : 'advisors' ':' (advisor_name= string ( ',' | '.' ) )+ ;
    public final void advisors() throws RecognitionException {
        String advisor_name = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:66:3: ( 'advisors' ':' (advisor_name= string ( ',' | '.' ) )+ )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:67:3: 'advisors' ':' (advisor_name= string ( ',' | '.' ) )+
            {
            match(input,14,FOLLOW_14_in_advisors189); 
            match(input,12,FOLLOW_12_in_advisors191); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:67:18: (advisor_name= string ( ',' | '.' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:67:19: advisor_name= string ( ',' | '.' )
            	    {
            	    pushFollow(FOLLOW_string_in_advisors196);
            	    advisor_name=string();

            	    state._fsp--;

            	    arrayList.add(advisor_name);
            	    if ( input.LA(1)==13||input.LA(1)==15 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "advisors"


    // $ANTLR start "start_date"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:70:1: start_date : 'start-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.' ;
    public final void start_date() throws RecognitionException {
        int year = 0;

        int month = 0;

        int day = 0;

        int clock = 0;

        int minute = 0;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:71:2: ( 'start-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:72:2: 'start-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.'
            {
            match(input,16,FOLLOW_16_in_start_date219); 
            match(input,12,FOLLOW_12_in_start_date221); 
            pushFollow(FOLLOW_integer_in_start_date225);
            year=integer();

            state._fsp--;

            match(input,17,FOLLOW_17_in_start_date226); 
            pushFollow(FOLLOW_integer_in_start_date229);
            month=integer();

            state._fsp--;

            match(input,17,FOLLOW_17_in_start_date230); 
            pushFollow(FOLLOW_integer_in_start_date233);
            day=integer();

            state._fsp--;

            match(input,18,FOLLOW_18_in_start_date235); 
            pushFollow(FOLLOW_integer_in_start_date239);
            clock=integer();

            state._fsp--;

            match(input,12,FOLLOW_12_in_start_date241); 
            pushFollow(FOLLOW_integer_in_start_date245);
            minute=integer();

            state._fsp--;

            match(input,13,FOLLOW_13_in_start_date247); 

            	model.setStartDate(year,month,day,clock,minute);
            	

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "start_date"


    // $ANTLR start "end_date"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:78:1: end_date : 'end-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.' ;
    public final void end_date() throws RecognitionException {
        int year = 0;

        int month = 0;

        int day = 0;

        int clock = 0;

        int minute = 0;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:79:2: ( 'end-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:80:2: 'end-date' ':' year= integer '/' month= integer '/' day= integer '-' clock= integer ':' minute= integer '.'
            {
            match(input,19,FOLLOW_19_in_end_date263); 
            match(input,12,FOLLOW_12_in_end_date265); 
            pushFollow(FOLLOW_integer_in_end_date269);
            year=integer();

            state._fsp--;

            match(input,17,FOLLOW_17_in_end_date270); 
            pushFollow(FOLLOW_integer_in_end_date273);
            month=integer();

            state._fsp--;

            match(input,17,FOLLOW_17_in_end_date274); 
            pushFollow(FOLLOW_integer_in_end_date277);
            day=integer();

            state._fsp--;

            match(input,18,FOLLOW_18_in_end_date279); 
            pushFollow(FOLLOW_integer_in_end_date283);
            clock=integer();

            state._fsp--;

            match(input,12,FOLLOW_12_in_end_date285); 
            pushFollow(FOLLOW_integer_in_end_date289);
            minute=integer();

            state._fsp--;

            match(input,13,FOLLOW_13_in_end_date291); 

            	if(model.getEndDate()!=null)System.out.println("null bu");
            	model.setEndDate(year,month,day,clock,minute);
            	

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "end_date"


    // $ANTLR start "submission_format"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:86:1: submission_format : 'submission-format' '{' ( file | file_pattern | directory | any )+ '}' ;
    public final void submission_format() throws RecognitionException {
        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:87:2: ( 'submission-format' '{' ( file | file_pattern | directory | any )+ '}' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:88:2: 'submission-format' '{' ( file | file_pattern | directory | any )+ '}'
            {
            match(input,20,FOLLOW_20_in_submission_format305); 
            match(input,9,FOLLOW_9_in_submission_format308); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:90:3: ( file | file_pattern | directory | any )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 22:
                    {
                    alt3=2;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;
                case 24:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:90:4: file
            	    {
            	    pushFollow(FOLLOW_file_in_submission_format313);
            	    file();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:90:11: file_pattern
            	    {
            	    pushFollow(FOLLOW_file_pattern_in_submission_format317);
            	    file_pattern();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:90:26: directory
            	    {
            	    pushFollow(FOLLOW_directory_in_submission_format321);
            	    directory();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:90:38: any
            	    {
            	    pushFollow(FOLLOW_any_in_submission_format325);
            	    any();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(input,10,FOLLOW_10_in_submission_format330); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "submission_format"


    // $ANTLR start "directory"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:94:1: directory : 'directory' directory_name= string ':' (order_= order )+ '{' ( ( file | file_pattern )+ | any '.' ) '}' ;
    public final void directory() throws RecognitionException {
        String directory_name = null;

        String order_ = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:95:2: ( 'directory' directory_name= string ':' (order_= order )+ '{' ( ( file | file_pattern )+ | any '.' ) '}' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:96:2: 'directory' directory_name= string ':' (order_= order )+ '{' ( ( file | file_pattern )+ | any '.' ) '}'
            {
            match(input,21,FOLLOW_21_in_directory343); 
            int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(2);
            pushFollow(FOLLOW_string_in_directory350);
            directory_name=string();

            state._fsp--;

             file_.setElement_name(directory_name);
            match(input,12,FOLLOW_12_in_directory355); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:98:7: (order_= order )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=25 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:98:8: order_= order
            	    {
            	    pushFollow(FOLLOW_order_in_directory363);
            	    order_=order();

            	    state._fsp--;

            	    str[i]=order_; file_.setElement_order(str); i++;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            bigList.add(file_);
            match(input,9,FOLLOW_9_in_directory373); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:3: ( ( file | file_pattern )+ | any '.' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:4: ( file | file_pattern )+
                    {
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:4: ( file | file_pattern )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==22) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:5: file
                    	    {
                    	    pushFollow(FOLLOW_file_in_directory379);
                    	    file();

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:10: file_pattern
                    	    {
                    	    pushFollow(FOLLOW_file_pattern_in_directory381);
                    	    file_pattern();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:101:27: any '.'
                    {
                    pushFollow(FOLLOW_any_in_directory387);
                    any();

                    state._fsp--;

                    match(input,13,FOLLOW_13_in_directory389); 

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_directory394); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "directory"


    // $ANTLR start "file_pattern"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:105:1: file_pattern : 'file-pattern' file_pattern_name= string ':' (order_= order ( '.' | ',' ) )+ ;
    public final void file_pattern() throws RecognitionException {
        String file_pattern_name = null;

        String order_ = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:106:2: ( 'file-pattern' file_pattern_name= string ':' (order_= order ( '.' | ',' ) )+ )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:107:2: 'file-pattern' file_pattern_name= string ':' (order_= order ( '.' | ',' ) )+
            {
            match(input,22,FOLLOW_22_in_file_pattern407); 
            int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(1);
            pushFollow(FOLLOW_string_in_file_pattern415);
            file_pattern_name=string();

            state._fsp--;

             file_.setElement_name(file_pattern_name);
            match(input,12,FOLLOW_12_in_file_pattern420); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:109:6: (order_= order ( '.' | ',' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:109:7: order_= order ( '.' | ',' )
            	    {
            	    pushFollow(FOLLOW_order_in_file_pattern427);
            	    order_=order();

            	    state._fsp--;

            	    str[i]=order_; file_.setElement_order(str); i++;
            	    if ( input.LA(1)==13||input.LA(1)==15 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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

            bigList.add(file_);

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "file_pattern"


    // $ANTLR start "file"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:113:1: file : 'file' file_name= string ':' (order_= order ( '.' | ',' ) )+ ;
    public final void file() throws RecognitionException {
        String file_name = null;

        String order_ = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:114:2: ( 'file' file_name= string ':' (order_= order ( '.' | ',' ) )+ )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:115:2: 'file' file_name= string ':' (order_= order ( '.' | ',' ) )+
            {
            match(input,23,FOLLOW_23_in_file454); 
             int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(0);
            pushFollow(FOLLOW_string_in_file462);
            file_name=string();

            state._fsp--;

             file_.setElement_name(file_name);
            match(input,12,FOLLOW_12_in_file467); 
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:117:6: (order_= order ( '.' | ',' ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:117:7: order_= order ( '.' | ',' )
            	    {
            	    pushFollow(FOLLOW_order_in_file474);
            	    order_=order();

            	    state._fsp--;

            	    str[i]=order_; file_.setElement_order(str); i++;
            	    if ( input.LA(1)==13||input.LA(1)==15 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


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

            bigList.add(file_);

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return ;
    }
    // $ANTLR end "file"


    // $ANTLR start "any"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:121:1: any returns [String result] : quotedValue= 'any' ;
    public final String any() throws RecognitionException {
        String result = null;

        Token quotedValue=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:122:2: (quotedValue= 'any' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:123:2: quotedValue= 'any'
            {
            quotedValue=(Token)match(input,24,FOLLOW_24_in_any506); 

            	result = quotedValue.getText();

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return result;
    }
    // $ANTLR end "any"


    // $ANTLR start "optional"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:135:1: optional returns [String result] : quotedValue= 'optional' ;
    public final String optional() throws RecognitionException {
        String result = null;

        Token quotedValue=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:136:2: (quotedValue= 'optional' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:137:2: quotedValue= 'optional'
            {
            quotedValue=(Token)match(input,25,FOLLOW_25_in_optional571); 

            	result = quotedValue.getText();
            	

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return result;
    }
    // $ANTLR end "optional"


    // $ANTLR start "mandatory"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:142:1: mandatory returns [String result] : quotedValue= 'mandatory' ;
    public final String mandatory() throws RecognitionException {
        String result = null;

        Token quotedValue=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:143:2: (quotedValue= 'mandatory' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:144:2: quotedValue= 'mandatory'
            {
            quotedValue=(Token)match(input,26,FOLLOW_26_in_mandatory592); 

            	result = quotedValue.getText();

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return result;
    }
    // $ANTLR end "mandatory"


    // $ANTLR start "recursive"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:148:1: recursive returns [String result] : quotedValue= 'folder-recursive' ;
    public final String recursive() throws RecognitionException {
        String result = null;

        Token quotedValue=null;

        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:149:2: (quotedValue= 'folder-recursive' )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:150:2: quotedValue= 'folder-recursive'
            {
            quotedValue=(Token)match(input,27,FOLLOW_27_in_recursive613); 

            	result = quotedValue.getText();

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return result;
    }
    // $ANTLR end "recursive"


    // $ANTLR start "order"
    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:154:1: order returns [String result] : (read= optional | read= mandatory | read= recursive ) ;
    public final String order() throws RecognitionException {
        String result = null;

        String read = null;


        try {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:155:2: ( (read= optional | read= mandatory | read= recursive ) )
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:156:3: (read= optional | read= mandatory | read= recursive )
            {
            // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:156:3: (read= optional | read= mandatory | read= recursive )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:156:4: read= optional
                    {
                    pushFollow(FOLLOW_optional_in_order636);
                    read=optional();

                    state._fsp--;

                    result = read;

                    }
                    break;
                case 2 :
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:156:35: read= mandatory
                    {
                    pushFollow(FOLLOW_mandatory_in_order642);
                    read=mandatory();

                    state._fsp--;

                    result=read;

                    }
                    break;
                case 3 :
                    // C:\\Users\\ibo\\Desktop\\skeleton\\src\\main\\antlr3\\tr\\edu\\hacettepe\\cs\\submitdsl\\SubmitDsl.g:156:64: read= recursive
                    {
                    pushFollow(FOLLOW_recursive_in_order647);
                    read=recursive();

                    state._fsp--;

                    result = read;

                    }
                    break;

            }


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}
        finally {
        }
        return result;
    }
    // $ANTLR end "order"

    // Delegated rules


 

    public static final BitSet FOLLOW_assignment_in_parse55 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integer77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_assignment116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_assignment120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignment125 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_subject_in_assignment130 = new BitSet(new long[]{0x0000000000194C00L});
    public static final BitSet FOLLOW_advisors_in_assignment132 = new BitSet(new long[]{0x0000000000194C00L});
    public static final BitSet FOLLOW_end_date_in_assignment136 = new BitSet(new long[]{0x0000000000194C00L});
    public static final BitSet FOLLOW_start_date_in_assignment138 = new BitSet(new long[]{0x0000000000194C00L});
    public static final BitSet FOLLOW_submission_format_in_assignment140 = new BitSet(new long[]{0x0000000000194C00L});
    public static final BitSet FOLLOW_10_in_assignment147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_subject163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_subject165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_subject169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_subject173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_advisors189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_advisors191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_advisors196 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_set_in_advisors198 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16_in_start_date219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start_date221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_start_date225 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_start_date226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_start_date229 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_start_date230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_start_date233 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_start_date235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_start_date239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_start_date241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_start_date245 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_start_date247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_end_date263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_end_date265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_end_date269 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_end_date270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_end_date273 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_end_date274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_end_date277 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_end_date279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_end_date283 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_end_date285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_integer_in_end_date289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_end_date291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_submission_format305 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_submission_format308 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_file_in_submission_format313 = new BitSet(new long[]{0x0000000001E00400L});
    public static final BitSet FOLLOW_file_pattern_in_submission_format317 = new BitSet(new long[]{0x0000000001E00400L});
    public static final BitSet FOLLOW_directory_in_submission_format321 = new BitSet(new long[]{0x0000000001E00400L});
    public static final BitSet FOLLOW_any_in_submission_format325 = new BitSet(new long[]{0x0000000001E00400L});
    public static final BitSet FOLLOW_10_in_submission_format330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_directory343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_directory350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_directory355 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_order_in_directory363 = new BitSet(new long[]{0x000000000E000200L});
    public static final BitSet FOLLOW_9_in_directory373 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_file_in_directory379 = new BitSet(new long[]{0x0000000000C00400L});
    public static final BitSet FOLLOW_file_pattern_in_directory381 = new BitSet(new long[]{0x0000000000C00400L});
    public static final BitSet FOLLOW_any_in_directory387 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_directory389 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_directory394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_file_pattern407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_file_pattern415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_file_pattern420 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_order_in_file_pattern427 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_set_in_file_pattern431 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_23_in_file454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_string_in_file462 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_file467 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_order_in_file474 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_set_in_file478 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_24_in_any506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_optional571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_mandatory592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_recursive613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optional_in_order636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mandatory_in_order642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recursive_in_order647 = new BitSet(new long[]{0x0000000000000002L});

}
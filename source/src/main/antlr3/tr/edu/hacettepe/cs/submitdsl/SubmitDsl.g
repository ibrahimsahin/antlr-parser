grammar SubmitDsl;

options {
  language = Java;
}
@header {
  package tr.edu.hacettepe.cs.submitdsl;
	import java.util.Date;
	import java.util.List;
	import java.util.ArrayList;
	
	
}
@lexer::header {
 package tr.edu.hacettepe.cs.submitdsl;
 }

@members {
	List<String> arrayList = new ArrayList<String>();
	MySubmitModel model = new MySubmitModel();
	Date date = new Date();
	List<MySubmitFormat> bigList = new ArrayList<MySubmitFormat>();
	
}

@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

parse returns [MySubmitModel finalModel]
	:
	assignment EOF { 
		finalModel = model;
	}
	;
integer returns [int value]
    :  INT {$value = Integer.parseInt($INT.text);}
    ;
string returns [String value]
	:
	quotedValue=STRING {
	value = $quotedValue.getText().substring(1, 
	$quotedValue.getText().length()-1);
	}
	;
	
assignment 	
	:
	'assignment' assignment_name=string {
	model.setName(assignment_name);}
	'{'
		(subject|advisors {model.setAdvisors(arrayList);}|end_date|start_date|submission_format{model.setSubmitFormat(bigList);} )+
	'}'
	
	
	;

subject
	:
	'subject' ':' subject_name=string {if(model.getSubject()==null) model.setSubject(subject_name);} '.'
	;
	
advisors
	 : 
	 'advisors' ':' (advisor_name=string{arrayList.add(advisor_name);}(','|'.')) +
	 ;
	
start_date
	:
	'start-date' ':' year=integer'/'month=integer'/'day=integer '-' clock=integer ':' minute=integer '.'
	{
	model.setStartDate(year,month,day,clock,minute);
	}
	;
	
end_date
	:
	'end-date' ':' year=integer'/'month=integer'/'day=integer '-' clock=integer ':' minute=integer '.'
	{
	if(model.getEndDate()!=null)System.out.println("null bu");
	model.setEndDate(year,month,day,clock,minute);
	}
	;
submission_format
	:
	'submission-format'
	'{'
		(file | file_pattern | directory | any)+
	'}'
	;
	
directory
	:
	'directory' {int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(2);}
	directory_name=string { file_.setElement_name(directory_name);}
	':'  (order_ = order {str[i]=order_; file_.setElement_order(str); i++;})+
	{bigList.add(file_);}
	'{'
		((file|file_pattern)+ | any '.') 
	'}'
	;
	
file_pattern
	:
	'file-pattern' {int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(1);} 
	file_pattern_name=string { file_.setElement_name(file_pattern_name);}
	':' (order_ = order {str[i]=order_; file_.setElement_order(str); i++;} ('.'|','))+
	{bigList.add(file_);}
	;
	 
file
	:
	'file' { int i=0; String []str = new String[2]; MySubmitFormat file_=new MySubmitFormat(); file_.setNumero(0);} 
	file_name=string { file_.setElement_name(file_name);}
	':' (order_ = order {str[i]=order_; file_.setElement_order(str); i++;} ('.'|','))+
	{bigList.add(file_);}
	;
	
any returns [String result]
	:
	quotedValue='any' {
	result = $quotedValue.getText();}
	;

	
WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )+ { $channel = HIDDEN; };

INT
	:
	'0'..'9'+
	;
	
optional returns [String result]
	:
	quotedValue='optional' {
	result = $quotedValue.getText();
	}
	;
	
mandatory returns [String result]
	:
	quotedValue='mandatory' {
	result = $quotedValue.getText();}
	;
	
recursive returns [String result]
	:
	quotedValue='folder-recursive' {
	result = $quotedValue.getText();}
	;
	
order returns [String result]
	:
		(read=optional {result = read;}|read=mandatory{result=read;}|read=recursive {result = read;} )
	;
	
//order returns [String result]
	//:
		//(read=optional {result = read;}|read=mandatory{result=read;})
	 	//| (read=optional{result = read;} | read=mandatory {result = read;}) ',' read=recursive{result = read;}
	 	//| read=recursive {result = read;}',' (read=optional{result = read;}|read=mandatory{result = read;})
	//;

STRING
     :
     '"' PRINT_CHAR* '"'
     ;

fragment
PRINT_CHAR
:
('0'..'9'|'a'..'z'|'A'..'Z' | '-' | '_' | ' '|'*'|'.'|'/') 
;

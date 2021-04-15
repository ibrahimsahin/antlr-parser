Experiment
In this experiment we are asked to create the specification of a language and develop a parser and post-parsing
processor for that language. The language will define the details of a student assignment, particularly allowed file
hierarchy within a submitted single compressed assignment file.
The SubmitDsl Language
SubmitDSL allows specifying some basic properties of an assignment like its advisors' names, end data as well as the
allowed file hierarchy within a submitted compressed assignment file. Example specifications which comply with
SubmitDsl are given in Listing 1 and Listing 2. (You can find one more example at the end of the sheet.)
Listing 1. An example of SubmitDsl compatible assignment specification
assignment "WORK-10-2" {
subject: "Domain Specific Formal Language Processing".
start-date: 2010/3/8 - 10:00.
end-date: 2010/03/24 - 16:45.
advisors: "iBRAHİM SAHİN", "SEFA SAHİN".
submission-format {
directory "src/main/java" : mandatory {
file-pattern "*.java": folder-recursive, mandatory.
}
directory "src/main/antlr3" : mandatory {
file "SubmitDsl.g" : mandatory, folder-recursive.
}
directory "src/main/resources" : optional {
any.
}
directory "src/test" : optional {
any.
}
directory "report" : mandatory {
file "report.pdf" : mandatory.
}
directory "testdata" : optional {
any.
}
file "pom.xml": optional.
}
}
1
Listing 2. Another example of SubmitDsl compatible assignment specification
assignment "WORK-10-1" {
submission-format {
directory "src" : mandatory {
file-pattern "*.c": folder-recursive, mandatory.
file-pattern "*.h": folder-recursive, optional.
}
directory "report" : mandatory {
file "report.pdf" : mandatory.
}
file "Makefile": mandatory.
}
end-date: 2010/2/16 - 16:45.
start-date: 2010/02/01 - 10:00.
advisors: "İBRAHİM ŞAHİN", "SEFA SAHİN".
subject: "Multi-Threaded Programming on UNIX".
}
As it's your duty to create an EBNF specification of SubmitDsl, its structure will only be explained informally here.
An assignment specification starts with the word "assignment" followed by the name of the assignment within
double quotes. All other elements of the specification fall inside a pair of opening and closing curly braces.
Elements of an assignment specification are the following sections in any order:
• subject
• start-date
• end-date
• advisors
• submission-format
Among these sections, subject, start-date and advisors are optional ones.
The subject section starts with the word "subject" followed by a colon and its value within double quotes.
Both start-date and end-date start with their corresponding identifiers and continue with a date specifier in the
format YYYY/MM/DD - HH:MM where month and day fields can also be one digit numbers (like 2 instead of 02).
The advisors section starts with the word "advisors" followed by a list of strings each within double quotes and
separated by commas. Length of the list is unlimited.
The submission-format section starts with its identifier and all its contents are declared inside a pair of opening
and closing curly braces.
Within the submission-format section the following rules can be specified:
• file
• file-pattern
• any
• directory
The file rule declares the existence of a file with the given name. A file rule can be annotated with either optional
or mandatory in order to specify whether the existence of the file is required or optional. A file rule can also be
annotated with folder-recursive. It means any directory structure is allowed as long as they are empty or contain
the specified file.
The file-pattern rule declares the existence of files whose names matches with the given simple regular
expression. The mandatory, optional, folder-recursive annotations for file-pattern rule can be interpreted in a
similar way as for the file rule. Although the file rule declares only one file's existence, file-pattern rule declares
2
the existence of a set of files.
The any rule is the most flexible rule which allows any files and directories.
The directory rule declares the existence of a directory whose path is given. A directory rule must include a non
empty set of file, file-pattern and any rules. A directory rule cannot be defined within another directory rule. For
that purpose the rule allows specifying nested structures in the directory path name. A directory rule can be
annotated with either optional or mandatory in order to specify whether the existence of the directory is required
or optional.
Antlr Parser Generator
Antlr is a parser generator which accepts an EBNF based grammar optionally enhanced with code actions and
creates a parser for the specified language. Using Antlr properly constitutes the main point of the experiment.
More information on Antlr can be found from the given resources at the end of this sheet. An project skeleton is
also provided for you at the FTP site of the course which includes a complete example of usage of Antlr as well as
JUnit and Maven.
Maven and JUnit
You are going to use Apache Maven for managing the build process of your software. Maven provides many plugins
in order to simplify and automate the build process of Java applications. In this experiment your are going to use it
for compiling, testing and automatically generating the Antlr based parser. Keep in mind that you need to be
connected to the Internet in order to use Maven properly.
JUnit is one of the most popular unit testing frameworks for Java. In this experiment your are going to use it to
automate and formalize the evaluation process of our application. (Your advisor will also do so.)
Usage of these tools can be learned by browsing the provided project skeleton code. Both of the tools are quite
intuitive and easy to use.
Required Code Artifacts
The parsed specification should be stored within an instance of MySubmitModel class which implements the
SubmitModel interface provided for you. The system will be tested over instances of MySubmitDslEngine which
implements the given SubmitDslEngine interface. Their usage is shown in the project skeleton provided for you at
the FTP site of the course. Locations and names of these files are fixed in the submission as defined at the bottom
of this sheet.
Post-Parsing Phase
As defined in the SubmitDslEngine interface you should implement a processor which evaluates a given zip file in
order to check whether it complies with the given submission specification. For this module you should especially
pay attention to the algorithm you develop and your object oriented design. Don't forget that any file within a
submission should have at least one corresponding rule in the SubmitDsl specification and mandatory rules in a
specification should be satisfied with appropriate files within the submission.
3
Submission Details for this experiment expressed in SubmitDsl
assignment "WORK-10-2" {
subject: "Domain Specific Formal Language Processing".
start-date: 2010/3/8 - 10:00.
end-date: 2010/03/24 - 16:45.
advisors: "İBRAHİM ŞAHİN", "SEFA ŞAHİN".
submission-format {
directory "src/main/java/tr/edu/hacettepe/cs/submitdsl" : mandatory {
file "SubmitDslEngine.java" : mandatory.
file "MySubmitDslEngine.java" : mandatory.
file "SubmitModel.java" : mandatory.
file "MySubmitModel.java" : mandatory.
file-pattern "*.java" : optional, folder-recursive.
}
directory "src/main/antlr3/tr/edu/hacettepe/cs/submitdsl" : mandatory {
file "SubmitDsl.g" : mandatory.
}
directory "src/main/resources" : optional {
any.
}
directory "src/test" : optional {
any.
}
directory "report" : mandatory {
file "report.pdf" : mandatory.
}
directory "target" : optional {
any.
}
file "pom.xml": optional.
file ".classpath": optional.
file ".project": optional.
}
}
Resources
• http://www.antlr.org/
• http://www.antlr.org/grammar/list
• http://javadude.com/articles/antlr3xtut/
• http://maven.apache.org/
• http://www.junit.org/
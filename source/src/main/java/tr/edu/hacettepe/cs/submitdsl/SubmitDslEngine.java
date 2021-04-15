package tr.edu.hacettepe.cs.submitdsl;
//Do not change this file!

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

public interface SubmitDslEngine {

	public void parseInput(String input) throws RecognitionException;

	public SubmitModel getSubmitModel();

	public boolean checkSubmission(String zipFilePath) throws IOException;
}

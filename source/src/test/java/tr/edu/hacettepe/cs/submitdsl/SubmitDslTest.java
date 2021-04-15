package tr.edu.hacettepe.cs.submitdsl;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;

public class SubmitDslTest {

	
	@Test
	public void testInvalidSubmission() throws RecognitionException, IOException {
		String submitSpecFileName = "submit4.sbmt";
		String submissionFileName = "submission4.zip";

		String submitSpecFilePath = getPath(submitSpecFileName); 
		String submissionFilePath = getPath(submissionFileName);
		
		String submitSpecFileContent = getFileContent(submitSpecFilePath);
		
		SubmitDslEngine engine = new MySubmitDslEngine();
		engine.parseInput(submitSpecFileContent);
		SubmitModel model = engine.getSubmitModel();
		Assert.assertNotNull(model);
		
		boolean submissionValid = engine.checkSubmission(submissionFilePath);
		Assert.assertFalse(submissionValid);
		
	}

	
	// More tests will be provided. You can also write your own ones.
	
	
	private String getPath(String fileName) {
		return this.getClass().getResource("/" + fileName).getPath(); 
	}
	
	private String getFileContent(String filePath) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filePath));
		StringBuffer fileContent = new StringBuffer();
		while (scanner.hasNextLine()) {
			fileContent.append(scanner.nextLine());
			fileContent.append(System.getProperty("line.separator"));
		}
		scanner.close();
		return fileContent.toString();
	}
	
	private Date getDate(int year, int month, int day, int hour, int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, hour, minute);
		return calendar.getTime();
	}
	
	private boolean datesEqual(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		
		return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && 
		       cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
		       cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH) &&
		       cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) &&
		       cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE);
	}
}

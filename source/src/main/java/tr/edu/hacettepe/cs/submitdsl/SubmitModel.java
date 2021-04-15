package tr.edu.hacettepe.cs.submitdsl;

//Do not change this file!

import java.util.Date;
import java.util.List;

public interface SubmitModel {

	public String getName();
	
	public String getSubject();
	
	public List<String> getAdvisors();
	
	public Date getStartDate();
	
	public Date getEndDate();
	
	public List<MySubmitFormat> getSubmitFormat();
}


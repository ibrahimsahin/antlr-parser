package tr.edu.hacettepe.cs.submitdsl;

import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class MySubmitModel implements SubmitModel {
	
	private String name;
	private String subject;
	private Date startDate;
	private Date endDate;
	private List<String> advisors;
	private List<MySubmitFormat> submitformat;
	
	
	@Override
	public List<MySubmitFormat> getSubmitFormat() {
		return submitformat;
	}

	public void setSubmitFormat(List<MySubmitFormat> submitformat) {
		this.submitformat = submitformat;
		
	}

	@Override
	public List<String> getAdvisors() {
		return advisors;
	}

	@Override
	public Date getEndDate() {
		return endDate;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getStartDate() {
		return startDate;
	}

	@Override
	public String getSubject() {
		return subject;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	public void setStartDate(int yil,int ay,int gun,int saat,int dakika) {
		this.startDate = getDate(yil,ay,gun,saat,dakika);
	}

	public void setEndDate(int yil,int ay,int gun,int saat,int dakika) {
		this.endDate = getDate(yil,ay,gun,saat,dakika);
	}
	
	public Date getDate(int year, int month, int day, int hour, int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day, hour, minute);
		return calendar.getTime();
	}
	
	public void setAdvisors(List<String> advisors) {
		this.advisors = advisors;
	}

}


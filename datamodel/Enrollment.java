package datamodel;

import java.util.Date;

public class Enrollment {
	private int enrollmentID;
	private String details;
	private Date enrollmentDate;
	
	public int getEnrollmentID() {
		return enrollmentID;
	}
	public void setEnrollmentID(int enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
}

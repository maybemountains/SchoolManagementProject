package datamodel;

import java.math.BigInteger;

public class Instructors extends Students {
	private String instructorID;
	private String name;
	private String email;
	private String subject;
	private BigInteger phoneNumber;
	private String targetYear;
	
	public String getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(String instructorID) {
		this.instructorID = instructorID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getTargetYear() {
		return targetYear;
	}
	public void setTargetYear(String targetYear) {
		this.targetYear = targetYear;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Instructors [instructorID=" + instructorID + ", name=" + name + ", email=" + email + ", subject="
				+ subject + ", phoneNumber=" + phoneNumber + ", targetYear=" + targetYear + "]";
	}
	
}

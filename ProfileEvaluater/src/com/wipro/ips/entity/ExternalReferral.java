package com.wipro.ips.entity;

public class ExternalReferral extends Applicant {
	
	String agencyName;
	
	public ExternalReferral(int applicantId, String applicantName, int yrsOfExp, String skills, double expSalary, String agencyName) {
		super(applicantId, applicantName, yrsOfExp, skills, expSalary);
		this.agencyName=agencyName;
		
	}
	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
}
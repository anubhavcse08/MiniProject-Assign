package com.wipro.ips.entity;

public class InternalReferral extends Applicant{
	int employeeId;
	
	public InternalReferral(int applicantId, String applicantName, int yrsOfExp, String skills, double expSalary, int employeeId) {
		super(applicantId, applicantName, yrsOfExp, skills, expSalary);
		this.employeeId=employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}
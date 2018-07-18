package com.wipro.ips.service;
import com.wipro.ips.entity.Applicant;
import com.wipro.ips.entity.ExternalReferral;
import com.wipro.ips.entity.InternalReferral;
import com.wipro.ips.exception.DataValidationException;


public class ProfileEvaluator {

	private int jobId;
	private String jobName;
	private String requiredSkill;
	private int expMinExperience;
	private int expMaxExperience;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getRequiredSkill() {
		return requiredSkill;
	}
	public void setRequiredSkill(String requiredSkill) {
		this.requiredSkill = requiredSkill;
	}
	public int getExpMinExperience() {
		return expMinExperience;
	}
	public void setExpMinExperience(int expMinExperience) {
		this.expMinExperience = expMinExperience;
	}
	public int getExpMaxExperience() {
		return expMaxExperience;
	}
	public void setExpMaxExperience(int expMaxExperience) {
		this.expMaxExperience = expMaxExperience;
	}
	
	 
	public Applicant createObject(char referralType, int applicantId, String applicantName, int yrsOfExp, String skills, double expSalary, String referralInfo ) {
		Applicant returnresult=null;	
		if(referralType=='I') {
			returnresult=new InternalReferral(applicantId, applicantName, yrsOfExp, skills, expSalary, Integer.parseInt(referralInfo));
		}
		else if(referralType=='E') {
			returnresult=new ExternalReferral(applicantId, applicantName, yrsOfExp, skills, expSalary, referralInfo);
		}
		return returnresult;
	}
	
	

	public String validateObject(Applicant applicant) throws DataValidationException {
		//DataValidationException objDVE = null;
		if(applicant.getApplicantName()==null || applicant==null) {
			//objDVE.toString();
			//return "INVALID DATA";
			throw new DataValidationException();
		}
		//int minExp = obj.getExpMinExperience();
		if(applicant.getYrsOfExp() <=0) {
			return "INVALID EXPERIENCE";
		}
		if(applicant.getExcepectedSalary() <=0) {
			return "INVALID SALARY";
		}
		return "VALID";
	}
	
	
	public String ProcessProfile(Applicant applicant) {
		ProfileEvaluator objPE = new ProfileEvaluator();
		
		if(applicant.getYrsOfExp()<objPE.getExpMinExperience() && applicant.getYrsOfExp()>objPE.getExpMaxExperience()) {
			return "NON ELIGIBLE EXPERIENCE";
		}
		if (applicant.getSkills().equals(objPE.getRequiredSkill())) {
			return "NON ELIGIBLE SKILLS";
		}
		return "selected";
		
	}

}

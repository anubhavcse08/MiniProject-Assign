package com.wipro.ips.main;
import com.wipro.ips.entity.Applicant;
import com.wipro.ips.exception.DataValidationException;
import com.wipro.ips.service.ProfileEvaluator;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hellooooooooo......");
		ProfileEvaluator objPE = new ProfileEvaluator();
		objPE.setJobId(101);
		objPE.setJobName("Java Developer");
		objPE.setExpMinExperience(5);
		objPE.setExpMaxExperience(10);
		objPE.setRequiredSkill("java");
		
		int applicantId = 1001;
        String applicantName = "Anubhav";
        int yrsOfExp = 18;
        String skills = "java";
        double expSalary = 2000;
        char referralType = 'I';
        String referralInfo = "12345";

        Applicant applicant = objPE.createObject(referralType, applicantId, applicantName, yrsOfExp, skills, expSalary, referralInfo);
        
        try {
        	
        	String status =objPE.validateObject(applicant);
        	if(status.equals("VALID")) {
        		String result = objPE.ProcessProfile(applicant);
        		System.out.println("Process Result is: "+result);
        	}
        	
        }catch (DataValidationException e) {
			e.printStackTrace();
		}
        
	}

}

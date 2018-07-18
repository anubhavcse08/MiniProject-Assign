package com.wipro.bank.service;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	
	public boolean validateData(float principal, int tenure, int age, String gender) throws BankValidationException {
		boolean check=true;
		if(principal<500 || tenure<5 || tenure>10 || gender!="male" || gender!="female" || age<1 || age>100) {
			check = false;
			throw new BankValidationException();
		}	
		return check;
	}
	
	public void calculate(float principal,int tenure, int age, String gender) throws BankValidationException {
		if(validateData(principal, tenure, age, gender)) {
			RDAccount objRD = new RDAccount(age, principal);
			System.out.println(objRD.setInterest(age, gender));
			System.out.println(objRD.calculateInterest());
			System.out.println(objRD.calculateAmountDeposited());
			System.out.println(objRD.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest));
		}
	}

}

package com.wipro.interestCalculate;

public class SBAccount extends Account {
	double interestRate;
	double amount;
	String accType;
	@Override
	public double calculateInterest() {
		if(accType.equals("NORMAL")) {
			interestRate=(amount*4)/100;
		}
		else if(accType.equals("NRI")) {
			interestRate=(amount*6)/100;
		}
		return interestRate;
	}

}

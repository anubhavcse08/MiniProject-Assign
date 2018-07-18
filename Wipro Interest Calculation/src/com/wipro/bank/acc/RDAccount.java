package com.wipro.bank.acc;

public class RDAccount extends Account {
	
	public RDAccount(int tenure, float principal) {
		this.tenure = tenure;
		this.principal = principal;
	}

	@Override
	public float calculateInterest() {
		return principal*tenure*12;
	}

	@Override
	public float calculateAmountDeposited() {
		return (float) (principal * (Math.pow(((1+rateOfInterest/4)),4*tenure) - 1));
	}

}

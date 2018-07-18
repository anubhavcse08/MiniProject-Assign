package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;
	
	public void setInterest(int age, String gender) {
		if(gender.equals("male")) {
			if(age < 60)
				rateOfInterest = (float) 9.8;
			if(age >= 60)
				rateOfInterest = (float) 10.5;
		}
		if(gender.equals("female")) {
			if(age < 58)
				rateOfInterest = (float) 10.2;
			if(age >= 58)
				rateOfInterest = (float) 10.8;
		}
	}
	
	public float calculateMaturityAmount(float totalPrincipleDeposited, float maturityInterest) {
		return maturityInterest;
	}
	
	public abstract float calculateInterest();
	
	public abstract float calculateAmountDeposited();

}

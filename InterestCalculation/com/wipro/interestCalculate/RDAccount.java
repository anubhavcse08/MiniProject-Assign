package com.wipro.interestCalculate;

public class RDAccount extends Account {
	double interestRate;
	double amount;
	int noOfMonths;
	int ageOfAcHolder;
	double monthlyAmount;
	
	@Override
	public double calculateInterest() {
		if(noOfMonths<=1 || noOfMonths<=6) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*7.50)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.00)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		else if(noOfMonths>=7 && noOfMonths<=9) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*7.75)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.25)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		else if(noOfMonths>=10 && noOfMonths<=12) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.00)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.50)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		else if(noOfMonths>=13 && noOfMonths<=15) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.25)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.75)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		else if(noOfMonths>=16 && noOfMonths<=18) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.50)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*9.00)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		else if(noOfMonths>=19 && noOfMonths<=21) {
			if(ageOfAcHolder<60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.75)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*9.25)/200);
				interestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		return interestRate;
	}

}

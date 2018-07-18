package com.wipro.interestCalculate;

public class FDAccount extends Account{
	double interstRate;
	double amount;
	int ageOfACHolder;
	int noOfDays;
	
	@Override
	public double calculateInterest() {
		if(amount>10000000) {
			if(noOfDays>=7 && noOfDays<=14) {
				interestRate=(amount*6.50)/100;
			}
			else if(noOfDays>=15 && noOfDays<=29) {
				interestRate=(amount*6.75)/100;
			}
			else if(noOfDays>=30 && noOfDays<=45) {
				interestRate=(amount*6.75)/100;
			}
			else if(noOfDays>=46 && noOfDays<=60) {
				interestRate=(amount*8)/100;
			}
			else if(noOfDays>=61 && noOfDays<=184) {
				interestRate=(amount*8.50)/100;
			}
			else if(noOfDays>=185 && noOfDays<=360) {
				interestRate=(amount*10.00)/100;
			}
		}
		else {
			if(ageOfACHolder<50) {
				if(noOfDays>=7 && noOfDays<=14) {
					interestRate=(amount*4.50)/100;
				}
				else if(noOfDays>=15 && noOfDays<=29) {
					interestRate=(amount*4.75)/100;
				}
				else if(noOfDays>=30 && noOfDays<=45) {
					interestRate=(amount*5.50)/100;
				}
				else if(noOfDays>=46 && noOfDays<=60) {
					interestRate=(amount*7)/100;
				}
				else if(noOfDays>=61 && noOfDays<=184) {
					interestRate=(amount*4.75)/100;
				}
				else if(noOfDays>=185 && noOfDays<=360) {
					interestRate=(amount*4.75)/100;
				}
			}
			else {
				if(noOfDays>=7 && noOfDays<=14) {
					interestRate=(amount*5.00)/100;
				}
				else if(noOfDays>=15 && noOfDays<=29) {
					interestRate=(amount*5.25)/100;
				}
				else if(noOfDays>=30 && noOfDays<=45) {
					interestRate=(amount*6.00)/100;
				}
				else if(noOfDays>=46 && noOfDays<=60) {
					interestRate=(amount*7.50)/100;
				}
				else if(noOfDays>=61 && noOfDays<=184) {
					interestRate=(amount*8.00)/100;
				}
				else if(noOfDays>=185 && noOfDays<=360) {
					interestRate=(amount*8.50)/100;
				}
			}
			
		}
		return interestRate;
	}

}

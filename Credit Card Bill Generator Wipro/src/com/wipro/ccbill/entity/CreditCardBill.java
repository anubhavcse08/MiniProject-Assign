package com.wipro.ccbill.entity;
import java.util.Date;
import com.wipro.ccbill.entity.Transaction;
import com.wipro.ccbill.exception.InputValidationException;

public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	private Date billDate;
	private Transaction monthTransactions[];
	
	public CreditCardBill() { }
	public CreditCardBill(String creditCardNo, String customerId, Date billDate, Transaction monthTransactions[]) {
		this.creditCardNo = creditCardNo;
		this.customerId = customerId;
		this.billDate = billDate;
		this.monthTransactions = monthTransactions;
	}
	
	public double getTotalAmount(String transactionType) {
		double total=0;
		for(int i=0;i<monthTransactions.length;i++) {
			if(transactionType.equals("DB") && monthTransactions[i].getTransactionType().equals("DB")) {
				total=total+monthTransactions[i].getTransactionAmount();
			}
			else if(transactionType.equals("CR") && monthTransactions[i].getTransactionType().equals("CR")) {
				total=total+monthTransactions[i].getTransactionAmount();
			}
		}
		return total;
	}
	public double calculateBillAmount() throws InputValidationException {
		double creditAmt=0,debitAmt=0,outStanding=0,interest=0;
		String str = validateData();
		System.out.println(str);
		if(str.equals("valid")) {
			if(monthTransactions != null && monthTransactions.length > 0) {
				debitAmt = getTotalAmount("DB");
				creditAmt = getTotalAmount("CR");
			
				System.out.println(debitAmt + " "+creditAmt);
				if(debitAmt > creditAmt)
					outStanding = debitAmt - creditAmt;
				else
					outStanding = creditAmt - debitAmt;
				System.out.println(outStanding);
				interest = outStanding + (outStanding * ((19.9/100)/12));		
			}
			else
				return 0;
		}
		else 
			return 0;
		return interest;
	}
	
	public String validateData() throws InputValidationException {
		if(creditCardNo == null || creditCardNo.length() < 16 || creditCardNo.length() > 16) {
			throw new InputValidationException();
		}
		if(customerId == null || customerId.length() < 6) {
			throw new InputValidationException();
		}
		return "valid";
	}
}

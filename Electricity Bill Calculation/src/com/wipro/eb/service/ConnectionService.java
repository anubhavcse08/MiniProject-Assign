package com.wipro.eb.service;
import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	
	public boolean validate(int previousReading, int currentReading, String type) throws InvalidReadingException, InvalidConnectionException {
		//boolean check=true;
		if((currentReading < previousReading) || (currentReading <0) || (previousReading <0)) {
			//try {
				throw new InvalidReadingException();
			//}catch (InvalidReadingException ire) {throw ire;}
		}
		if(!(type.equals("Domestic") || type.equals("Commercial"))) {
			//try {
				throw new InvalidConnectionException();
			//}catch (InvalidConnectionException ice) {throw ice;}
		}
		return true;
	}
	
	
	public float calculateBillAmt(int previousReading, int currentReading, String type) throws InvalidReadingException, InvalidConnectionException {
		boolean resval=validate(previousReading, currentReading, type);
		float res=0;
		if(resval!=true)
			res= -1;
		else if(resval!=true)
			res= -2;
		else if(resval==true) {
			if(type.equals("Domestic")) {
				float newBillAmtD =	new Domestic(previousReading, currentReading, null).computeBill();
				res= newBillAmtD;
			}
			if(type.equals("Commercial")) {
				float newBillAmtC = new Commercial(previousReading, currentReading, null).computeBill();
				res= newBillAmtC;
			}
		 }	
		return res;
	}
	
	public String generateBill(int previousReading, int currentReading, String type) throws InvalidReadingException, InvalidConnectionException {
		float result=(int)calculateBillAmt(previousReading, currentReading, type);
		//System.out.println(result);
		if(result==-1) {
			try {
				throw new InvalidReadingException();
			}catch (InvalidReadingException e) {
				System.out.println("from gd:"+e);
			}
		}else if(result==-2) {
			try {
				throw new InvalidConnectionException();
			}catch (InvalidConnectionException e) {
				System.out.println("from gc:"+e);
			}
			
		}
		else {
			return "Amount to be paid : "+result;
		}
	
		return null;
  }
	//public static void main(String args[]) throws Exception{
	//	System.out.println(new ConnectionService().generateBill(70,130,"Commercial"));
	//}
}

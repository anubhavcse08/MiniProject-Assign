package com.wipro.interestCalculate;
import java.util.Scanner;

public abstract class Account {
	double interestRate;
	double amount;
	
	public abstract double calculateInterest();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option=0;
		do {
			System.out.println("MAIN MENU");
			System.out.println("_ _ _ _ _ _");
			System.out.println("1. Interest Calculator –SB ");
			System.out.println("2. Interest Calculator –FD ");
			System.out.println("3. Interest Calculator –RD ");
			System.out.println("4. Exit ");
			option=sc.nextInt();
			switch (option) {
			case 1:
				try {
					SBAccount sb = new SBAccount();
					System.out.println("Enter the Average amount in your account : ");
					double am1=Double.parseDouble(sc.next());
					System.out.println("Enter the Account type: (NRI   or   NORMAL) ");
					String acctype=sc.next().toUpperCase();
					if(am1<0 || acctype==null)
						throw new NullPointerException("Enter the given account types...");
					sb.accType=acctype;
					sb.amount=am1;
					System.out.println("Interest Gained : "+sb.calculateInterest());
				} catch (Exception e) {
					System.out.println("Invalid choosed Amount, Please enter correct value.");
				}
				
				break;
			case 2:
				try {
					FDAccount fd = new FDAccount();
					System.out.println("Enter the FD Amount : ");
					double am2=Double.parseDouble(sc.next());
					System.out.println("Enter the number of days:");
					int days = Integer.parseInt(sc.next());
					System.out.println("Enter your Age : ");
					int age = Integer.parseInt(sc.next());
					if(am2<0 || days<0 || age<0)
						throw new NumberFormatException("Enter the positive value....");
					fd.amount=am2;fd.noOfDays=days;
					fd.ageOfACHolder=age;
					System.out.println("Interest gain is "+fd.calculateInterest());
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Please Enter Correct value.");
				}
				break;
			case 3:
				try {
					RDAccount rd = new RDAccount();
					System.out.println("Enter the Monthly Amount :" );
					double monAmt=Integer.parseInt(sc.next());
					System.out.println("Enter the age of Account holder.");
					int age=Integer.parseInt(sc.next());
					System.out.println("Enter the number of Months :");
					int month=Integer.parseInt(sc.next());
					if(monAmt<0 || age<0 || month<0)
						throw new NumberFormatException("Enter the positive value....");
					rd.ageOfAcHolder=age;
					rd.noOfMonths=month;
					rd.monthlyAmount=monAmt;
					System.out.println("Interest Gained is "+rd.calculateInterest());
					
				} catch (Exception e) {
					System.out.println(e.toString());
					System.out.println("Please Enter Correct value.");
				}
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Choosed Invalid Option");
				break;
			}
		} while (option!=0);
		
	}

}

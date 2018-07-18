package WithdrawBalanceSysnchrozationImportant;
import java.util.Scanner;

class Account {
	private int bal;
	public Account(int bal)
		{this.bal=bal;}
	public boolean isSufficientWithraw(int w) {
		if(bal>=w)
			return(true);
		else
			return (false);
	}
	public void withdraw(int amt) {
		bal=bal-amt;
		System.out.println("Withdraw Amount is: "+amt);
		System.out.println("After withdraw balance is: "+bal);
		System.out.println();
	}
}

class Customer implements Runnable {
	private Account account;
	private String name;
	public Customer(Account account, String name)
			{this.account=account;this.name=name;}
	public void run() {
		synchronized (account) {
			System.out.print(name+",Enter the withdraw Balance: ");
			int enteredAmt = new Scanner(System.in).nextInt();
			if(account.isSufficientWithraw(enteredAmt)) {
				System.out.println(name);
				account.withdraw(enteredAmt);
			}
			else
				System.out.println("InSufficientBalance");
		}
	}
	
}

public class WithdrawBalanceSysnchrozation {
			public static void main(String[] args) {
				Account a1 = new Account(1000000);
				Customer c1 = new Customer(a1, "Anubhav"), c2 = new Customer(a1, "Anu");
				Thread t1 = new Thread(c1);
				Thread t2 = new Thread(c2);
				t1.start();
				t2.start();
			}

}

package CollectionMapProject._01_ProjectEmployeedetailsManage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDetails {
	String firstname;
	String lastname;
	long mobNum;
	String email;
	String address;
	
	public EmployeeDetails(String firstname, String lastName, long mobNum, String email, String address) {
		this.firstname=firstname;
		this.lastname=lastName;
		this.mobNum=mobNum;
		this.email=email;
		this.address=address;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number Of Employees : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Employee "+(i+1)+" Details -");
			System.out.print("Enter the firstName: ");
			String a=sc.next();
			System.out.print("Enter the lastName: ");
			String b=sc.next();
			System.out.print("Enter the Mobile Number: ");
			long c=sc.nextLong();
			System.out.print("Enter the Email : ");
			String d=sc.next();
			System.out.print("Enter the Address : ");
			String e=sc.next();
			EmployeeDetails obj = new EmployeeDetails(a, b, c, d, e);
			arr.add(obj);
		}
		Iterator<EmployeeDetails> it=arr.iterator();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		while(it.hasNext()) {
			EmployeeDetails ee = it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",ee.firstname,ee.lastname,ee.mobNum,ee.email,ee.address);
		}
	}

}

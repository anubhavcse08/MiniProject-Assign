package project.Employer.project11.Same;
class Hello{
	public void show(int ch){
		int empno[] = new int[]{1001,1002,1003,1004,1005,1006,1007};
		String empname[] = new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","suman","Tanmay"};
		String designcode[] = new String[]{"Engineer","Consultant","Clerk","Receptionist","manager","null","null"};
		String dept[] = new String[]{"R&D","PM","Acct","Front_Desk","Engg","ManuFact Engg","PM"};
		int basic[] = new int[]{2000,12000,8000,6000,20000,9000,12000};
		int hra[] = new int[]{8000,12000,8000,6000,20000,9000,12000};
		int it[] = new int[]{3000,9000,1000,2000,20000,4400,10000};
		int da[] = new int[]{20000,32000,12000,15000,40000,0,0};
		
		switch(ch){
		case 1001:
			int sal =(int) (basic[0]+hra[0]+da[0]-it[0]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"  "+"designation"+"  "+"Salary" );
			System.out.println(empno[0]+"     "+empname[0]+"    "+dept[0]+"         "+designcode[0]+"     "+sal);
			break;
		case 1002:
			sal =(int) (basic[1]+hra[1]+da[1]-it[1]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"  "+"designation"+"  "+"Salary" );
			System.out.println(empno[1]+"     "+empname[1]+"    "+dept[1]+"          "+designcode[1]+"   "+sal);
			break;
		case 1003:
			sal =(int) (basic[2]+hra[2]+da[2]-it[2]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"  "+"designation"+"  "+"Salary" );
			System.out.println(empno[2]+"     "+empname[2]+"    "+dept[2]+"         "+designcode[2]+"         "+sal);
			break;
		case 1004:
			sal =(int) (basic[3]+hra[3]+da[3]-it[3]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"    "+"designation"+"    "+"Salary" );
			System.out.println(empno[3]+"     "+empname[3]+"    "+dept[3]+"    "+designcode[3]+"    "+sal);
			break;
		case 1005:
			sal =(int) (basic[4]+hra[4]+da[4]-it[4]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"  "+"designation"+"  "+"Salary" );
			System.out.println(empno[4]+"     "+empname[4]+"    "+dept[4]+"         "+designcode[4]+"     "+sal);
			break;
		case 1006:
			sal =(int) (basic[5]+hra[5]+da[5]-it[5]);
			System.out.println("Emp No"+"   "+"Emp Name"+"      "+"Department"+"    "+"designation"+"     "+"Salary" );
			System.out.println(empno[5]+"     "+empname[5]+"        "+dept[5]+"      "+designcode[5]+"       "+sal);
			break;
		case 1007:
			sal =(int) (basic[6]+hra[6]+da[6]-it[6]);
			System.out.println("Emp No"+"   "+"Emp Name"+"  "+"Department"+"  "+"designation"+"  "+"Salary" );
			System.out.println(empno[6]+"     "+empname[6]+"     "+dept[6]+"         "+designcode[6]+"          "+sal);
			break;
		}
	}
}

public class Impo {
	public static void main(String[] args) {
		int ch;
		Hello he = new Hello();
		he.show(ch = Integer.parseInt(args[0]));
		//ch = Integer.parseInt(args[0]);
	}

}

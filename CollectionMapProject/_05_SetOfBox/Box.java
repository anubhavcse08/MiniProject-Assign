package CollectionMapProject._05_SetOfBox;

import java.util.Scanner;
import java.util.TreeSet;

public class Box {
	public static void main(String[] args) {
		TreeSet<Double> tr = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Box : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length : ");
			double length=sc.nextDouble();
			System.out.println("Enter Width : ");
			double width=sc.nextDouble();
			System.out.println("Enter Height : ");
			double height=sc.nextDouble();
			tr.add(length*width*height);
		}
		for(Double d: tr) {
			System.out.println(d);
		}
	}

}

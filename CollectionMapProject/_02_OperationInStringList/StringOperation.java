package CollectionMapProject._02_OperationInStringList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringOperation {
	List<String> arr = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	private String insertMethod(String item) {
		arr.add(item);
		return "Inserted Sucessfully.";
	}
	private String searchMethod(String item) {
		if(arr.contains(item))
			return "Item found in list.";
		else
			return "Item not found in list.";
	}
	private String deleteMethod(String item) {
		if(arr.contains(item)) {
			arr.remove(item);
			return "Deleted Sucessfully.";
		}
		else
			return "Item doesn't exists.";
	}
	private void displayMethod() {
		System.out.println("The items in list are: ");
		for(String s : arr)
			System.out.println(s);
	}
	private void replaceMethod() {
		int len=arr.size();
		System.out.println("There are"+len+" elements in the list.");
		System.out.print("Enter the index (0 to "+(len-1)+") that you want to replace: ");
		int ind=sc.nextInt();
		if(ind<len && ind>=0) {
			System.out.println("The elememt at index "+ind+" is "+arr.get(ind));
			System.out.print("What do you want to replace it with ? ");
			String rep=sc.next();
			arr.set(ind, rep);
			System.out.println("Item replaced successfully.");
		}
		else
			System.out.println("That's an invalid elements.");
	}
	private void sortMethod() {
		Collections.sort(arr);
	}
	private void shuffleMethod() {
		Collections.shuffle(arr);
	}
	private void reverseMethod() {
		Collections.reverse(arr);
	}
	
	public static void main(String[] args) {
		StringOperation obj = new StringOperation();
		String c="";
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Replace");
			System.out.println("6. Sort");
			System.out.println("7. Shuffle");
			System.out.println("8. Reverse");
			System.out.println("9. Exit");
			System.out.println("Enter your choice (1...9): ");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the item to be inserted: ");
				System.out.println(obj.insertMethod(sc.next()));
				break;
			case 2:
				System.out.print("Enter the item to search: ");
				System.out.println(obj.searchMethod(sc.next()));
				break;
			case 3:
				System.out.print("Enter the item to delete: ");
				System.out.println(obj.deleteMethod(sc.next()));
				break;
			case 4:
				obj.displayMethod();
				break;
			case 5:
				obj.replaceMethod();
				break;
			case 6:
				obj.sortMethod();
				break;
			case 7:
				obj.shuffleMethod();
				break;
			case 8:
				obj.reverseMethod();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (c!="y");
	}		
}

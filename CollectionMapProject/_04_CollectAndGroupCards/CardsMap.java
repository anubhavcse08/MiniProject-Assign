package CollectionMapProject._04_CollectAndGroupCards;
import java.util.*;
import java.util.Map.Entry;

public class CardsMap {
	static Map<String, List<Integer>> hm = new HashMap<String, List<Integer>>();
	static Map<Integer, String> hm1 = new HashMap<Integer, String>();
	static List<Integer> arr = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Cards : ");
		int n=sc.nextInt();
		int p=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter card "+(i+1)+" : ");
			String key=sc.next();
			int value=sc.nextInt();
			if(hm.containsKey(key)) {
				for(Entry<Integer, String> mmm : hm1.entrySet()) {
					for(Entry<String, List<Integer>> mm : hm.entrySet()) {
						if(mmm.getKey().equals(key) && )
							arr.add(value);
					}
				}
				System.out.println(key+" "+arr);
			}
			else if(!(hm.containsKey(key))){
				arr = new ArrayList();
				arr.add(value);
				hm1.put(p++, key);
			}
			hm.put(key, arr);
		}
		System.out.println(hm);
		System.out.println(hm1);
		System.out.println(arr);
		System.out.println("Distinct Symbols are : ");
		for(Map.Entry<String, List<Integer>> mm1 : hm.entrySet()) {
			System.out.print(mm1.getKey()+" "+mm1.getValue());
		}
		for(Map.Entry<String, List<Integer>> mm2 : hm.entrySet()) {
			for(int i=0;i<hm.size();i++) {
				
			}
		}
	}
}

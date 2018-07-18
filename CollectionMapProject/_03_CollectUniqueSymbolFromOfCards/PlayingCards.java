package CollectionMapProject._03_CollectUniqueSymbolFromOfCards;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PlayingCards {
	String symbol;
	int number;
	public PlayingCards(String symbol, int number) {
		this.symbol=symbol;
		this.number=number;
	}
	static Set<PlayingCards> tr = new TreeSet<PlayingCards>(new Comparator<PlayingCards>() {
		@Override
		public int compare(PlayingCards o1, PlayingCards o2) {
			return o1.symbol.compareTo(o2.symbol);
		}
	});
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<8;i++) {
			System.out.println("Enter the Card: ");
			String symbol=sc.next();
			int number=sc.nextInt();
			tr.add(new PlayingCards(symbol, number));
		}
		
		Iterator<PlayingCards> itr = tr.iterator();
		while(itr.hasNext()) {
			PlayingCards pc=itr.next();
			System.out.println(pc.symbol+" "+pc.number);
		}
	}

}

import java.util.Scanner;

class Video {
	String name;
	boolean flag;
	float rating;
	public Video() {}
	public Video(String name) {
		this.name=name;
		this.flag=true;
	}
	public String name() {
		return name;
	}
	void beingReturned() {
		flag=true;
	}
	public void receiveRating(float rating) {
		this.rating=(this.rating+rating)/2;
	}
	public boolean getCheckout() {
		return flag;
	}
	
}
class VideoStore {
	//Video objVideo = new Video();
	Video[] store=new Video[20];
	int index=0,p;
	public void addVideo(String name) {
		store[p++]=new Video(name);
		System.out.println("Video Added Successfully....");
	}
	public void doCheckout(String name) {
		for(int i=0;i<p;i++) {
			
			if(store[i].name.toString().equals(name)) {
				if(store[i].flag) {
					System.out.println("Movie "+name+" is Available...");
					store[i].flag=false;
					break;
				}
				else {
					System.out.println("Movie "+name+" is not Available...");
				}
			}
		}
	}
	public void returnvideo(String name) {
		//float rating=0;
		for(int i=0;i<p;i++) {
				if(store[i].name.toString().equals(name)) {
					System.out.println("Enter the rating for Movie...");
					float rating =new Scanner(System.in).nextFloat();
					store[i].flag=true;
					recieveRating(name, rating);
					break;
				}
				else {
				System.out.println("Enter movie is not available...");
			}
		}
	}
	public void recieveRating(String name,float rating) {
		for(int i=0;i<p;i++) {
			if(store[i].name.equals(name)) {
				store[i].receiveRating(rating);
			}
		}
	}
	public void listInventory() {
		System.out.println("S.No"+"\t"+"Video Title"+"\t"+"Rating"+"\t"+"Availability");
		for(int i=0;i<p;i++) {
			System.out.println(i+1+" \t "+store[i].name+" \t\t "+store[i].rating+" \t "+store[i].flag);
		}
	}
	
}
public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		VideoStore objVS = new VideoStore();
		int option=0;
		do {
			System.out.println("MAIN MENU\n=========");
			System.out.println("1.Add Videos : ");
			System.out.println("2.Check out Video : ");
			System.out.println("3.Return Video : ");
			System.out.println("4.List Inventory : ");
			System.out.println("5.Exit : ");
			System.out.println("Enter your choice (1..5) : ");
			option=sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the name of the video you want to add: ");
				objVS.addVideo(sc.next());
				break;
			case 2:
				System.out.println("Enter the name of the video you want to check out: ");
				objVS.doCheckout(sc.next());
				break;
			case 3:
				System.out.println("Enter the name of the video you want to Rate: ");
				String name=sc.next();
				objVS.returnvideo(name);
				break;
			case 4:
				objVS.listInventory();
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Choose Given Option...");
				break;
			}
			System.out.println("\n");
		} while (option!=0);
	}

}

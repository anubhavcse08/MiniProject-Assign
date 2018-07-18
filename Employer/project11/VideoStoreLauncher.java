package project.Employer.project11;
import java.util.Scanner;

class Video{
	String title;
	boolean isAvailable;
	float userRating;
	
   public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

 Video(String title){
	   this.title = title;
	   this.isAvailable = true;
	   this.userRating =userRating;
   }
   boolean beingChecked(){
	   return isAvailable;
   }
   void beingReturn(){
	   isAvailable = true;
   }
   void receiveRating(int rating){
	   userRating=(userRating+rating)/2;
   }
}



class VideoStream{
	int count;
	Video objVideos[] = new Video[10];
	
	void addvideo(String title){
		objVideos[count++] = new Video(title);
	}
	
	void checkOut(String title){
		for(int i=0;i<count;i++){
			if(objVideos[i].title.equals(title)){
			if(objVideos[i].isAvailable)
				System.out.println("This video "+title+" is available now.");
			else
				System.out.println("This video "+title+" is rented out.");
			break;
			}
			else
				System.out.println("This video "+title+" is not available.");
		}
	}
	
	void returnVideo(String title){
		int rating=0;
		for (int i=0;i<count;i++) {
		if(objVideos[i].title.equals(title)){
		System.out.println("Enter the ratting for this video.");
		rating = new Scanner(System.in).nextInt();
		receiveRating(title, rating);
		break;
		}
	}
	}
	
	void receiveRating(String title,int rating){
		for(int i=0;i<count;i++){
			if(objVideos[i].title.equals(title)){
				objVideos[i].receiveRating(rating);
				break;
			}
		}
	}
	
	void listInventory(){
		System.out.println("S.No. \t\t Video Title  \t\t Rating  \t\t Availablility");
		for(int i=0;i<count;i++){
			System.out.println(i+1 +" \t\t "+objVideos[i].title +" \t\t "+objVideos[i].userRating +" \t\t\t "+objVideos[i].isAvailable);
		}
	}
	
}

public class VideoStoreLauncher {
	public static void main(String[] args) {
		int choice=0;
		VideoStream objNewStore = new VideoStream();
		do{
			System.out.println("1.Add new video");
			System.out.println("2.list Inventory");
			choice = new Scanner(System.in).nextInt();
			switch(choice){
			case 1:
				System.out.println("Enetr the new Video name");
				String title = new Scanner(System.in).nextLine();
				objNewStore.addvideo(title);
				break;
			case 2:
				objNewStore.listInventory();
				break;
			}
		}while(choice !=0);
		
	}

}

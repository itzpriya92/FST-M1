package activities;


abstract class Book {
	String title;
	//abstract method
	abstract void setTitle(String S);
	
	//concrete method
	public String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String S) {
		this.title=S;
	}
}
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyBook newNovel =new MyBook();
		newNovel.setTitle("FLINTO");
		System.out.println("Title of the story is " +newNovel.getTitle());

	}

}
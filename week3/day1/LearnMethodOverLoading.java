package week3.day1;

public class LearnMethodOverLoading {

	//0-input args
	public void browser() {
		System.out.println("ChromeBrowser");
	}
	
	//1-input args
	public void browser(float browserVersion) {
		System.out.println("Browser Name is "+browserVersion);
	}
	
	//2-input args
	public void browser(String name,int noOfWindow) {
		System.out.println("Browser name :"+name +"Number of window :"+noOfWindow);
	}
	
	public void browser(int noOfWindow ,String name) {
		System.out.println("Number of window :"+noOfWindow +"Browser name :"+name );
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		
		ol.browser();
		ol.browser(121.34F);
		ol.browser(3, "Edge");
		ol.browser("Chrome", 2);
	}
	
}

package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browser="Edge";
		int val=4;

		
		
		//switch(Chrome)
		switch(browser) {
		case "Edge":
			System.out.println("Edge is opened");
			break;
		case "Firefox":
			System.out.println("Firefox is opened");
			break;
		case "Chrome":
			System.out.println("Chrome is opened");
                  break;
		case "Safari":
			System.out.println("Safari is opened");
			break;
			
			default:
				System.out.println("its not in the list");
				break;
				
		
		
		
		}
	}

}

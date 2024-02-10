package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {

		//EdgeDriver driver= new EdgeDriver();
		//step1 - to launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//step2- maximize screen
		driver.manage().window().maximize();
		
		//step3-load the url ->.get()
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		//step 4-close browser
		driver.close();
		
		
		
	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.leafground.com/frame.xhtml");

//frame-handled
driver.switchTo().frame(0);

driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	
//control will switch to main webpage
//it will comeout from frame to main page
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.leafground.com/frame.xhtml");

//frame-handled -1st frame
driver.switchTo().frame(2);

//2nd -frame
driver.switchTo().frame("frame2");

//click on the button
driver.findElement(By.xpath("//button[text()='Click Me']")).click();


//switch to parent frame

driver.switchTo().parentFrame();

//switch to webpage
driver.switchTo().defaultContent();
	}

}

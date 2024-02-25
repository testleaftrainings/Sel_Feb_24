package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		WebElement scroll = driver.findElement(By.linkText("About Us"));
//
//		
//		Actions act=new Actions(driver);
//		act.scrollToElement(scroll).perform();
//		
//		scroll.click();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
	}

}

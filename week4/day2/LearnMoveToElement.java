package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveToElement {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement movetoelement = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	
		//syntax
		Actions act=new Actions(driver);
		
		//perform()=>mandatory
		act.moveToElement(movetoelement).perform();
	
	}

}

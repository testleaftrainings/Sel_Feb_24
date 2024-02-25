package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnJavaScrpitClick {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		WebElement js = driver.findElement(By.xpath("//span[text()='Create']"));
		
		//java script
		driver.executeScript("arguments[0].click()", js);
		//javascript Exception
	}

}

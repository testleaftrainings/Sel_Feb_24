package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnChromeOptions {

	public static void main(String[] args) {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		//op.addArguments("--headless");
		op.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement ch = driver.findElement(By.id("src"));
		ch.sendKeys("Chennai");
		System.out.println("Done");
		
	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LearnWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dilip");
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :"+currentUrl);
		
		//title
		String title = driver.getTitle();
		System.out.println("title of the page :"+title);
	}
}

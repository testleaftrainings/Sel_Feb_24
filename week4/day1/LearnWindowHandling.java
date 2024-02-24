package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//getwindowHandle()- single value
		String windowHandle = driver.getWindowHandle();
		System.out.println("parent window address :"+windowHandle);
		
		String parentTitle = driver.getTitle();
		System.out.println("parent window Title :"+parentTitle);
		
		
		//
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set in to list
		
		List<String> window=new ArrayList<String>(windowHandles); 
		
		//switch to child window
		driver.switchTo().window(window.get(1));
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//close the child window also my control will be in child window
		driver.close();
		
		//switch back to parent window 
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

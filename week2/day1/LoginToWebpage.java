package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginToWebpage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		user.clear();
		Thread.sleep(2000);
		user.sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//ctrl+2-l
		String title = driver.getTitle();
		System.out.println(title);
		
		//contains will partial match
		if(title.contains("TestLeaf Automation")) {
			System.out.println("login is successful");
		}else {
			System.out.println("login is not successful");
		}
		
	//driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM/")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//return for findElement -> webElement
		WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		
		//Select Class
		//step -1 
		Select opt=new Select(data);
		
		//step 2 
	//	opt.selectByIndex(1);
		
		opt.selectByVisibleText("Existing Customer");
		
		
		//java wait
		
		Thread.sleep(5000);
		
		//driver.close();
		
	}

}

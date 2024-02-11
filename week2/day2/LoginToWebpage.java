package week2.day2;

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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		
		WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(data);
		opt.selectByVisibleText("Cold Call");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String fName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(fName.contains("Dilip")) {
			System.out.println("Lead is Created");
		}else {
			System.out.println("Lead is not Created");
		}
		
		
		
	}

}

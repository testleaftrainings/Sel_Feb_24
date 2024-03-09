package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver ;
	
	//step 3
	public String filedata;
	
	@Parameters({"browser","url","username","password"})
	
	
	//indices -index value start from '0'
		//create -dilip,gokul
		//delete - 98,97
		//step 1
		@DataProvider(name="getData",indices = {0,2})
		public String[][] sentData() throws IOException{
			
			//step 4
			return ExcelIntegrationWithTC.excelvalue(filedata);
		}
	
	
	@BeforeMethod
	public void preCondition(String browser,String url,String uName,String pw) {
	   
		if(browser.equalsIgnoreCase("chrome")) {
		driver  = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
	    driver= new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@AfterMethod
	public void postCondition(){
		driver.close();
		
	}
	
	
}

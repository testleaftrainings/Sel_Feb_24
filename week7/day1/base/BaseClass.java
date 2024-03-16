package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelIntegrationWithTC;


public class BaseClass {
	
	//static- common driver value to pass all the pages
//public static ChromeDriver driver ;
	
	//for parallel execution -static need to be remove
	public  ChromeDriver driver ;
	
	//step-3
	public String filedata;
	
	//step4
	@DataProvider(name="getData",indices = {0,2})
	public String[][] sentData() throws IOException{
		
		return ExcelIntegrationWithTC.excelvalue(filedata);
	}

	
	
	
	@BeforeMethod
	public void preCondition() {
	    driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	
	@AfterMethod
	public void postCondition(){
		driver.close();
		
	}
}

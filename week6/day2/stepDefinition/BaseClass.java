package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass  extends  AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	
	//static-to pass common driver value to all the step definition
	
	@BeforeMethod
	public void precondition() {
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@AfterMethod
	public void postcondition() {
		driver.close();
		
	}
}

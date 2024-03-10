package stepDefinition;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {

	//@Before,@After
	
	//public static ChromeDriver driver;
	//io.cucumber.java.InvalidMethodException: 
	//You're not allowed to extend classes that define Step Definitions or hooks. class stepDefinition.CreateLeadSD extends class stepDefinition.Hooks

//	@Before
//	public void precondition() {
//
//		 driver=new ChromeDriver();
//		 driver.manage().window().maximize();
//	     driver.get("http://leaftaps.com/opentaps/control/main");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//	
//	
//	
//	@After
//	public void postcondition() {
//		driver.close();
//	}
}

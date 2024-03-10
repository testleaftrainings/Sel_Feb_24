package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{

	
	
//	@Given("Launch the browser and Load the Url")
//	public void precondition() {
//		
//		 driver=new ChromeDriver();
//		 driver.manage().window().maximize();
//	     driver.get("http://leaftaps.com/opentaps/control/main");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
	
	@When("Enter the username as {string}")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);

	}

	@And("Click on LoginButton")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Hompage should be displayed")
	public void verfiyHomePage() {
		
		String title=driver.getTitle();
		if(title.contains("Automation ")) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login not Successful");
		}
	}

	@But("Hompage should not be displayed")
	public void verifyPage(){
		String title=driver.getTitle();
		if(title.contains("Automation ")) {
			System.out.println("Login not Successfull");
		}else {
			System.out.println("Login Successful");
		}
		
	}

	
}

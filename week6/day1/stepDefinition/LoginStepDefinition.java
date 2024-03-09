package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public ChromeDriver driver;
	
	@Given("Launch The browser and Load the Url")
	public void precondition() {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@When("Enter the username as Demosalesmanager")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	}
	
	@And("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

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


	
}

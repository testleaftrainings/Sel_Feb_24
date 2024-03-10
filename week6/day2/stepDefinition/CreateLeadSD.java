package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass{

	@When("Click on CRMSFA link")
	public void clickCrmsaf(){
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@And("Click on Leads link")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();

		
	}
	
	@And("Click on CreateLead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	//@When("Enter CompanyName as {string})- 'dilip','98'
	@When("Enter CompanyName as (.*)$") // dilip,98
	public void enter_company_name_as(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	    
	}
	@When("Enter FirstName as (.*)$")
	public void enter_first_name_as(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	    
	}
	@When("Enter LastName as (.*)$")
	public void enter_last_name_as(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	    
	}
	@When("Click on Sumbit Button")
	public void click_on_sumbit_button() {
		driver.findElement(By.name("submitButton")).click();

	   
	}
	@Then("ViewLeads Page Should be Displayed")
	public void view_leads_page_should_be_displayed() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	    
	}



	
}

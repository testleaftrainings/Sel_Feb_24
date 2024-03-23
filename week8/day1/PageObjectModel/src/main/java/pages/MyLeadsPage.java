package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	
	public void clickOnFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

}

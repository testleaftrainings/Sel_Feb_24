package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	public CreateLeadPage clickOnCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	
	public void clickOnFindLead() {
		getDriver().findElement(By.linkText("Find Leads")).click();

	}

}

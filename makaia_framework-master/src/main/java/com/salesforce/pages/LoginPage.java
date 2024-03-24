package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uname) {
//		WebElement unamewe = getDriver().findElement(By.id("username"));
		WebElement usernameWE = locateElement(Locators.ID, "username");
		//unamewe.sendKeys(uname);
		clearAndType(usernameWE, uname);
		reportStep("Username "+uname+" is entered successfully ", "pass");
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		// getDriver().findElement(By.id("password")).sendKeys(pwd);
		clearAndType(locateElement(Locators.ID, "password"), pwd);
		reportStep("Password "+pwd+" is entered successfully", "pass");
		return this;
	}
	
	public HomePage clickLogin() {
		
		click(locateElement(Locators.ID, "Login"));
		reportStep("Login button clicked successfully ", "pass");
		return new HomePage();		
	}
	
}

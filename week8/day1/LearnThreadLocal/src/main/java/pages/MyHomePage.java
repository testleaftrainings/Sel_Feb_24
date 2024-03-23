package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	
	
	public MyLeadsPage clickLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
	
	public MyLeadsPage clickAccounts() {
		getDriver().findElement(By.linkText("Accounts")).click();
		return new MyLeadsPage();
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	
	
	public MyHomePage clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage();
	}
	
	
	public LoginPage logOut() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage();

	}

}

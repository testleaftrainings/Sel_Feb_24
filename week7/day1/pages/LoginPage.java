package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	//static parameter -create input agrs inside method and replace hardcoded values
	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		
		return this;
	}
    public LoginPage enterPassWord(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
		return this;
	}
    
    public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}

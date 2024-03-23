package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	//static parameter -create input agrs inside method and replace hardcoded values
	public LoginPage enterUserName(String uName) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(uName);	
//			test.pass("Username entered sucessfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/pass.png").build());
			reportStep("pass", "Username entered Sucessfully");
		} catch (Exception e) {
//			test.fail("Unable to enter a username and exception is "+e, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/fail.png").build());
			reportStep("fail", "unable to enter username " +e);
		}
		
		return this;
	}
    public LoginPage enterPassWord(String passWord) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(passWord);
			reportStep("pass", "Password entered Successfully");
		} catch (Exception e) {
			reportStep("fail", "Unable enter password "+e);
		}
		return this;
	}
    
    public HomePage clickOnLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("pass", "Login is successfully ");
		} catch (Exception e) {
			reportStep("fail", "Unable to click Login button "+e);
		}
		return new HomePage(driver);
	}
}

package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginTC extends BaseClass{

	@Test
	public void runLogin() throws IOException {
		new LoginPage()
		.enterUserName("demosalesmanager")
		.enterPassWord("crmsfa")
		.clickOnLoginButton();
	}
	
	
	
}

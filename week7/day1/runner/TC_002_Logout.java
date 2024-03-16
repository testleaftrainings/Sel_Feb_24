package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Logout extends BaseClass{

	@Test
	public void logout() {
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		
		lp.enterUserName("demosalesmanager").enterPassWord("crmsfa")
		.clickOnLoginButton().logOut();
		
	}
}

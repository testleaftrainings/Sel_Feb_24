package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_CreateLeadTC extends BaseClass{

	@Test
	public void runCreateLead() throws IOException {
		new LoginPage()
		.enterUserName("demosalesmanager")
		.enterPassWord("crmsfa")
		.clickOnLoginButton()
		.clickCrmsfa()
		.clickLeads();
	}
	
	
	
}

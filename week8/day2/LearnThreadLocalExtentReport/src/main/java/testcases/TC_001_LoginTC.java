package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginTC extends BaseClass{

	@Test(dataProvider = "sendData")
	public void runLogin(String uname, String pwd) throws IOException {
		new LoginPage()
		.enterUserName(uname)
		.enterPassWord(pwd)
		.clickOnLoginButton();
	}
	
	@BeforeTest
	public void setData() {
		testcaseName = "Login TC";
		testcaseDesc = "Login testcase with positive functionality";
		authorName = "Gokul";
		categoryName = "Functional";
		filedata = "loginTc";
	}
	
}

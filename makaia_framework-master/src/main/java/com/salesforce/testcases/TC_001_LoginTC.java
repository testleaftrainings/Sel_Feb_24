package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC_001_LoginTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testcaseName ="Salesforce Login";
		testDescription= "Login with valid credentials";
		authors = "Gokul";
		category = "Regression";
		excelFileName = "Login";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname, String pwd) {
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin();
	}
	
	
}

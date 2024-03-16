package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_Login extends BaseClass{

	//step -7
	@BeforeTest
	public void setData() {
		filedata="LoginSheet";
	}
	
	
	//step-5
	@Test(dataProvider = "getData")
	
	//step-6
	public void login(String uName,String pass) {
		
		LoginPage lp=new LoginPage(driver);
		
		System.out.println(driver);
		lp.enterUserName(uName)
		.enterPassWord(pass)
		.clickOnLoginButton();
		
		//.clickCrmsfa()
		//.clickLeads().clickOnCreateLead();
	}
	
}

package week5.day2;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@DataProvider(name="getData")
	public String[][] sentData() throws IOException{
		
		/*
		 * data[0][0]="TestLeaf"; data[0][1]="Aravind"; data[0][2]="R"; data[0][3]="98";
		 * 
		 * data[1][0]="TestLeaf"; data[1][1]="Gokul"; data[1][2]="S"; data[1][3]="97";
		 * 
		 * data[2][0]="TestLeaf"; data[2][1]="Vinoth"; data[2][2]="S"; data[2][3]="99";
		 * 
		 * return data;
		 */
		
		//static keyword-without creating object i can use that methods
		//classname.method();
		//step 5
		return ExcelIntegrationWithTC.excelvalue();
	}
	
	@Test(dataProvider ="getData")
	public void runCreateLead(String cName,String fName, String lName,String Ph) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Ph);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}

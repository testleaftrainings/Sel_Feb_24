package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ExcelIntegrationWithTC;


public class BaseClass {
	
	//static- common driver value to pass all the pages
//public static ChromeDriver driver ;
	
	//for parallel execution -static need to be remove
	public  ChromeDriver driver ;
	
	public ExtentReports extent;
	
	public static ExtentTest test;
	
	//step-3
	public String filedata;
	
	//step4
	@DataProvider(name="getData",indices = {0,2})
	public String[][] sentData() throws IOException{
		
		return ExcelIntegrationWithTC.excelvalue(filedata);
	}

	
	
	
	@BeforeMethod
	public void preCondition() {
	    driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	
	@AfterMethod
	public void postCondition(){
		driver.close();
		
	}
	
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		reporter.setAppendExisting(true);
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
	}
	
	@BeforeClass
	public void setDetails() {
		test = extent.createTest("Login testcase", "Login testcase with positive credentials");
		test.assignAuthor("Gokul");
		test.assignCategory("Functional");
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
	
	public void reportStep(String status, String description) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			test.pass(description, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(description, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img/"+takeSnap()+".png").build());
		}
		
	}
	
	
	
	public int takeSnap() throws IOException {
		int randomNumber = (int)(Math.random()*99999);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+randomNumber+".png");
		FileUtils.copyFile(src, des);
		return randomNumber;
	}
	
	
}

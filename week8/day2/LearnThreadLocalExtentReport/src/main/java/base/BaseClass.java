package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
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
	
	
	public static ExtentReports extent;
	
//	public static ExtentTest test;
	
	//step-3
	public String filedata, testcaseName, testcaseDesc, authorName, categoryName;
	
	private static final ThreadLocal<RemoteWebDriver> rd  = new ThreadLocal<RemoteWebDriver>();
	
	private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	private static final ThreadLocal<String> testName = new ThreadLocal<String>();
	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	
	
	
	@BeforeMethod
	public void preCondition() {
		setNode();
	    setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	
	@AfterMethod
	public void postCondition(){
		getDriver().close();
		
	}
	
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
//		reporter.setAppendExisting(true);
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
	}
	
	@BeforeClass
	public void setDetails() {
	ExtentTest	test = extent.createTest(testcaseName, testcaseDesc);
		test.assignAuthor(authorName);
		test.assignCategory(categoryName);
		parentTest.set(test);
		setTestName();
		
	}
	
	
	public void setTestName() {
		testName.set(testcaseName);
	}
	
	public String getTestName() {
		return testName.get();
	}
	
	public void setNode() {
		ExtentTest node = parentTest.get().createNode(getTestName());
		test.set(node);
	}
	
	public ExtentTest getNode() {
		return test.get();
	}
	
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
	
	public void reportStep(String status, String description) throws IOException {
		
		if(status.equalsIgnoreCase("pass")) {
			getNode().pass(description, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			getNode().fail(description, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img/"+takeSnap()+".png").build());
		}
		
	}
	
	
	
	public int takeSnap() throws IOException {
		int randomNumber = (int)(Math.random()*99999);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+randomNumber+".png");
		FileUtils.copyFile(src, des);
		return randomNumber;
	}
	
	
	@DataProvider(name="sendData")
	public String[][] fetchData() throws IOException {
		return ExcelIntegrationWithTC.excelvalue(filedata);
	}
	
	
}

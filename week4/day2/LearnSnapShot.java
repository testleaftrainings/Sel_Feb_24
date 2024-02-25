package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//snap shot we have 3step follow
		
		WebElement dr = driver.findElement(By.id("nav-logo-sprites"));
		
		//step-1
	  File scr = dr.getScreenshotAs(OutputType.FILE);
		
		//step-2
	File dst=new File("./SnapShot/img1.png");
	
	//step-3
		FileUtils.copyFile(scr, dst);
	}

}

package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnMultilingual {

	@Parameters({"lang"})
	@Test
	public void runLearnMultilingual(String lang) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		
		prop.load(fis);
		
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//div[text()='"+prop.getProperty("product")+"']")).click();
	}
	
	
}

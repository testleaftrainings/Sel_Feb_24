package runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.leafground.com/window.xhtml");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 //Open with delay
		 WebElement w = driver.findElement(By.xpath("//span[text()='Open with delay']"));
		 w.click();
		 
		// WebElement data=driver.findElement(By.xpath(""));
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		 
		 driver.quit();
		 
		// wait.until(ExpectedConditions.);
		 
	}

}

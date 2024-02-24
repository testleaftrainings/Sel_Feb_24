package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.leafground.com/alert.xhtml");
//simple alert
driver.findElement(By.xpath("//span[text()='Show']")).click();

//alert
Alert alert = driver.switchTo().alert();

//get Text
String text = alert.getText();
System.out.println(text);

alert.accept();

String text2 = driver.findElement(By.id("simple_result")).getText();
System.out.println(text2);


Thread.sleep(3000);
//Confirmation Alert

driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

alert.dismiss();

String text3 = driver.findElement(By.id("result")).getText();
System.out.println(text3);

//again try handle the alert

alert.accept();


Thread.sleep(3000);

//sweet Alert

driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}

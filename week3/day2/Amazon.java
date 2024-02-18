package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
		List<WebElement> phPrice = driver.findElements(By.className("a-price-whole"));

		//create empty list
		List<Integer> allPrice=new ArrayList<Integer>();
		
		for (WebElement j : phPrice) {
			String text = j.getText();
			//System.out.println(text);
			
			//51,790->removing ','->51790
			String replaceAll = text.replaceAll(",", "");
			//System.out.println(replaceAll);
			
			//convert string value into int
			int parseInt = Integer.parseInt(replaceAll);
			//System.out.println(parseInt);
			
			//adding value into empty list
			allPrice.add(parseInt);
			
		}
		Collections.sort(allPrice);
		
		System.out.println(allPrice);
		System.out.println("min value :"+ allPrice.get(0));
	}

}

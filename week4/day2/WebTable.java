package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml");
		
		//data from 1st row and 1st col
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("1st row & 1st col data :"+text);
		
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println("3rd row & 4th col :"+text2);
		
		//find total number of rows
		List<WebElement> rowvalue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rowvalue.size();
		System.out.println("rowCount :"+rowCount);
		
		//find total  number of col 
		List<WebElement> colvalue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colCount = colvalue.size();
		System.out.println("colCount :"+colCount);
		
		//to print all values from the table
		
		for (int i = 1; i <=rowCount; i++) {
			
			
			for (int j = 1; j <=colCount; j++) {
				
				//driver.findElement
				
				String alldata = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();

				System.out.println(alldata);
			}
			
		}
		
	}

}

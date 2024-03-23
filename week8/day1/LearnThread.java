package week8.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnThread {
	
	// 
	
	private static final ThreadLocal<RemoteWebDriver> rd  = new ThreadLocal<RemoteWebDriver>();

	
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}
	
	@Test()
	public void run() {
		setDriver();
		getDriver().manage().window().maximize();
	}
	
	
	
}

package driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

	
	
	
	
	
public static WebDriver driver;
	
	public static WebDriver InitializeDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("bing")) {
			driver =  new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	public static WebDriver getdriver() {
		return driver;
	}
	public void closeDriver() {
		driver.quit();
	}
}

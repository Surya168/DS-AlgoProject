package hooks;

import org.openqa.selenium.WebDriver;
import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DSHooks {
	
	WebDriver driver = null;;
	DriverFactory df;
	
	@Before
	public void setup() {
		df = new DriverFactory();
		DriverFactory.InitializeDriver("chrome");	
		DriverFactory.driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	@After
	public void teardown() {
		df.closeDriver();
	}
	public  WebDriver getDriver() {
		return driver;
	}
	
	
	

}

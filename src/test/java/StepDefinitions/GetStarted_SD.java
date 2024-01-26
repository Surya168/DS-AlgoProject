package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStarted_SD {
	
	
	
	WebDriver driver;
	@Given("User is on Get Started Page")
	public void user_is_on_get_started_page() {
	    
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://dsportalapp.herokuapp.com/");
	  driver.manage().window().maximize();	}

	
	@When("User clicks the GetStarted button")
	public void user_clicks_the_getstarted_button() throws InterruptedException {
	   
	   driver.findElement(By.xpath("//button[@class='btn']")).click();
	   Thread.sleep(2000);
	}

	@Then("User is navigated to the Home page")
	public void user_is_navigated_to_the_home_page(){
		
		String expectedUrl = "https://dsportalapp.herokuapp.com/home";
		String actualUrl = driver.getCurrentUrl();
		
		
	  Assert.assertEquals(expectedUrl, actualUrl);
	  driver.close();
	  
	}

	
	
	

}

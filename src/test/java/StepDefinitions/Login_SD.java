package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverfactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.loginPage;

public class Login_SD {

	WebDriver driver;
	loginPage loginpage;
	
	@BeforeTest
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
	  
		driver = DriverFactory.getdriver();
		
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().window().maximize();
			
	}
@Test(priority=1)
	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String username) {
	loginPage loginpage = new loginPage(driver);
	loginpage.enterusername(username);
	
	
	}

	@Test(priority=2)
@And("enters valid password {string}")
	public void enters_valid_password(String password) {
		loginPage loginpage = new loginPage(driver);
		loginpage.enterpassword(password);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		loginPage loginpage = new loginPage(driver);
	  loginpage.clickOnLoginButton();
	}

	@Then("User should login successfully and Username should be displayed alongwith Signout button")
	public void user_should_login_successfully_and_username_should_be_displayed_alongwith_signout_button() {
		
		WebElement displayname = driver.findElement(By.xpath("//a[normalize-space()='Bugslayers@SDET143']"));
		Assert.assertTrue(displayname.isDisplayed());
		WebElement signout = driver.findElement(By.xpath("//a[normalize-space()='Sign out']"));
		Assert.assertTrue(signout.isDisplayed());
		
	}

/*	@When("User enters invalid username")
	public void user_enters_invalid_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters invalid password")
	public void enters_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get warning relevant warning message")
	public void user_should_get_warning_relevant_warning_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get relevant warning message")
	public void user_should_get_relevant_warning_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters valid password")
	public void enters_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get relevant warning message below Username textbox")
	public void user_should_get_relevant_warning_message_below_username_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

*/

	
	
	
	
	
	
	
	
	
	
}

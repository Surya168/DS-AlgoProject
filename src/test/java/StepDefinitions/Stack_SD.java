package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Homepage;
import pageFactory.Stackpage;
import pageFactory.TryEditor;
import pageFactory.loginPage;

public class Stack_SD {
	
	static WebDriver driver;
	
	
	
	@Given("User is in the Home page after login")
	public void user_is_in_the_home_page_after_login() {
		driver= DriverFactory.getdriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
		Homepage homepage = new Homepage(driver);
	/*	driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("Bugslayers@SDET143");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("SuDhJoRa_143");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Successfully logged into Home page");
	*/
		homepage.clickonsignin();
		loginPage loginpage = new loginPage(driver);
		loginpage.enterusername("Bugslayers@SDET143");
		loginpage.enterpassword("SuDhJoRa_143");
		loginpage.clickOnLoginButton();
		
		
	}

	@When("User clicks Get Started button in Stack pane")
	public void user_clicks_get_started_button_in_stack_pane() {
		
		Homepage homepage = new Homepage(driver);
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homepage.clickonstackbutton();
		 
	}
	@Then("User should be in the Stack page")
	public void user_should_be_in_the_stack_page() {
		
		
		String expectedUrl = "https://dsportalapp.herokuapp.com/stack/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}   

	@Given("The User navigates to tryEditor page by clicking Operations in Stack link")
	public void the_user_navigates_to_try_editor_page_by_clicking_operations_in_stack_link() {
	    
		Stackpage stackpage= new Stackpage(driver);
		stackpage.clickonOperationsinStack();
		stackpage.clikconTryhere();
		
	}
	
	@Then("User enters code in tryEditor of Operations in Stack link page")
	public void user_enters_code_in_try_editor_of_operations_in_stack_link_page() {
	   
		
		TryEditor tryeditor = new TryEditor(driver);
		tryeditor.sendDatatoTextarea();
		tryeditor.clickOnRunButton();
		
		
	}
	
	
	

	
	@Then("click on Run")
	public void click_on_run() {
		
	}

	
	@Then("User should get the output for Operations in stack sneraio")
	public void user_should_get_the_output_for_operations_in_stack_sneraio() {
		
		TryEditor tryeditor = new TryEditor(driver);
		
		 tryeditor.gettextFromOutput();
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

@When("The User navigates to tryEditor page by clicking Implementation link")
public void the_user_navigates_to_try_editor_page_by_clicking_implementation_link() {
	Stackpage stackpage= new Stackpage(driver);
	
	stackpage.clickonImplementation();
	stackpage.clikconTryhere();
}


@Then("User enters code in tryEditor of Implementation link")
public void user_enters_code_in_try_editor_of_implementation_link() {
	TryEditor tryeditor = new TryEditor(driver);

	tryeditor.sendDatatoTextarea();
	tryeditor.clickOnRunButton();
}

@Then("User should get the output for Implementation scenario")
public String user_should_get_the_output_for_implementation_scenario() {
	TryEditor tryeditor = new TryEditor(driver);
	return tryeditor.gettextFromOutput();
}


@When("User navigates to tryEditor page by clicking Applications link")
public void user_navigates_to_try_editor_page_by_clicking_applications_link() throws InterruptedException {
	Stackpage stackpage= new Stackpage(driver);
    stackpage.clickonApplications();
    stackpage.clikconTryhere();
 
    Thread.sleep(2000);
    
}


@Then("The User enters code in tryEditor of Applications link")
public void the_user_enters_code_in_try_editor_of_applications_link() throws InterruptedException {
	
	TryEditor tryeditor = new TryEditor(driver);
    tryeditor.sendDatatoTextarea();
    tryeditor.clickOnRunButton();
    Thread.sleep(200);
}




@Then("User should get the output for Applications scenario")
public void user_should_get_the_output_for_applications_scenario() throws InterruptedException {
	TryEditor tryeditor = new TryEditor(driver);
      tryeditor.gettextFromOutput();
      Thread.sleep(200);
}

}

package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Homepage;
import pageFactory.QueuePage;
import pageFactory.TryEditor;
import pageFactory.loginPage;

public class Queue_SD {
	

	
static WebDriver driver;
	

	
	
	@Given("User is in the Home page after successful login")
	public void user_is_in_the_home_page_after_successful_login() {
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

		@When("User clicks Get Started button in Queue pane")
		public void user_clicks_get_started_button_in_queue_pane() {

			Homepage homepage = new Homepage(driver);
			homepage.clickonQueuebutton();
			
		}

		@Then("User should be in the Queue page")
		public void user_should_be_in_the_queue_page() {
			
			
			String expectedUrl = "https://dsportalapp.herokuapp.com/queue/";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
		
			
		}

		@When("The User navigates to tryEditor page by clicking Implementation of Queue in Python")
		public void the_user_navigates_to_try_editor_page_by_clicking_implementation_of_queue_in_python() {
		   QueuePage queuepage = new QueuePage (driver);
		   queuepage.clickOnImplementationofQueueinPython();
		   queuepage.clickonTryhere();
		   
		}

		@Then("User enters code in tryEditor of Implementation of Queue in Python  page")
		public void user_enters_code_in_try_editor_of_implementation_of_queue_in_python_page() {
			
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.sendDatatoTextarea();
			tryeditor.clickOnRunButton();
		
			
		}
		
		@Then("click on Run button")
		public void click_on_run() {
			
		}
		
		
		
		@Then("User should get the output for Implementation of Queue scenario")
		public void user_should_get_the_output_for_implementation_of_queue_scenario() throws InterruptedException {
			
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.gettextFromOutput();
			Thread.sleep(200);
		
		}

		@When("The User navigates to tryEditor page by clicking Implementation using collectionsdeque")
		public void the_user_navigates_to_try_editor_page_by_clicking_implementation_using_collectionsdeque() {
		    
			QueuePage queuepage = new QueuePage(driver);
			queuepage.clickOnImplementationUsingcollection();
			queuepage.clickonTryhere();
		}

		@Then("User enters code in tryEditor of Implementation using collectionsdeque page")
		public void user_enters_code_in_try_editor_of_implementation_using_collectionsdeque_page() {
		    
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.sendDatatoTextarea();
			tryeditor.clickOnRunButton();
		}
		
		

		@Then("User should get the output for Implementation using collectionsdeque scenario")
		public void user_should_get_the_output_for_implementation_using_collectionsdeque_scenario() throws InterruptedException {
		    
			TryEditor tryeditor = new TryEditor(driver);
		tryeditor.gettextFromOutput();
		Thread.sleep(200);
		}

		@When("User navigates to tryEditor page by clicking Implementation using array link")
		public void user_navigates_to_try_editor_page_by_clicking_implementation_using_array_link() throws InterruptedException {
		   
			QueuePage queuepage = new QueuePage(driver);
			queuepage.clickOnImplementationUsingarray();
			queuepage.clickonTryhere();
			Thread.sleep(200);
			
		}

		@Then("The User enters code in tryEditor of Implementation using array")
		public void the_user_enters_code_in_try_editor_of_implementation_using_array() {
		    
			
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.sendDatatoTextarea();
			tryeditor.clickOnRunButton();
		}

		@Then("User should get the output for Implementation using array scenario")
		public void user_should_get_the_output_for_implementation_using_array_scenario() throws InterruptedException {
			
			TryEditor tryeditor = new TryEditor(driver);
		  tryeditor.gettextFromOutput();
		  Thread.sleep(200);
		}

		@When("User navigates to tryEditor page by clicking Queue Operations link")
		public void user_navigates_to_try_editor_page_by_clicking_queue_operations_link() {
		    
			QueuePage queuepage = new QueuePage(driver);
			queuepage.clickonQueueOperations();
			queuepage.clickonTryhere();
		}

		@Then("The User enters code in tryEditor of Queue Operations")
		public void the_user_enters_code_in_try_editor_of_queue_operations() {
		    
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.sendDatatoTextarea();
			tryeditor.clickOnRunButton();
			
		}

		@Then("User should get the output for Queue Operations scenario")
		public void user_should_get_the_output_for_queue_operations_scenario() throws InterruptedException {
		    
			TryEditor tryeditor = new TryEditor(driver);
			tryeditor.gettextFromOutput();
			Thread.sleep(200);
			
		}




}

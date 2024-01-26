package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	
	
	@FindBy(id="id_username")
	WebElement username_textbox;
	
	@FindBy(id="id_password")
	WebElement password_textbox;
	

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbutton;

	
	@FindBy(xpath = "//div[@class=\"container\"]/following-sibling::div")
	WebElement warningmessage;


	 public loginPage(WebDriver driver) {
		  this.driver = driver ;
		  PageFactory.initElements(driver, this);
		  }

	public void enterusername(String username) {
		
		username_textbox.sendKeys(username);
		
		
	}
	
	public void enterpassword(String password){
		
		password_textbox.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginbutton.click();
	}
	
	
	
	
	
	
 
  }
	


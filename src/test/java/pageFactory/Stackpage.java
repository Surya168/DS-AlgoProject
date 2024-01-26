package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stackpage {

	
	WebDriver driver;
	
	
	public Stackpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Operations in Stack']")
	WebElement OperationsinStack_link;
	
	@FindBy(xpath="//a[normalize-space()='Implementation']")
	WebElement Implementation_link;
	
	@FindBy(xpath="//a[normalize-space()='Applications']")
	WebElement Applications_link;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement Tryhere_btn;
	
	
	public void clickonOperationsinStack() {
		OperationsinStack_link.click();
		
	}
	
	public void clickonImplementation() {
		
		Implementation_link.click();
	}
	
	public void clickonApplications() {
		
		Applications_link.click();
	}
	
	public void clikconTryhere() {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Tryhere_btn).click().build().perform();
	}
	
	
}




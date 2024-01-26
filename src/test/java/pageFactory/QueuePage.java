package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {

	
	WebDriver driver;
	
	
	public QueuePage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement tryhere_button;
	
	
	@FindBy(xpath="//a[normalize-space()='Implementation of Queue in Python']")
	WebElement implementationOfQueueinPython;
	
	@FindBy(xpath="//a[normalize-space()='Implementation using collections.deque']")
	WebElement implementationUsingCollctn;
	
	
	@FindBy(xpath="//a[normalize-space()='Implementation using array']")
	WebElement implementationusingArray;
	
	@FindBy(xpath="//a[normalize-space()='Queue Operations']")
	WebElement queueOperations;
	
	@FindBy(xpath="//a[normalize-space()='Queue']")
	WebElement queue;
	
	
	public void clickonTryhere() {
		
		
		Actions actions =new Actions(driver);
		actions.moveToElement(tryhere_button).click().build().perform();
	}

	public void clickOnImplementationofQueueinPython() {
		
		implementationOfQueueinPython.click();
	}
	
	public void clickOnImplementationUsingcollection() {
		implementationUsingCollctn.click();
		
	}
	
	public void clickOnImplementationUsingarray() {
		implementationusingArray.click();
	}
	
	
	
	public void clickonQueueOperations() {
		
		queueOperations.click();
		
	}
	
	public void clickOnQueue() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(queue).click().build().perform();
	}
}





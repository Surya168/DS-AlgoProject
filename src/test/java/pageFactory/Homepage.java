package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register_btn;
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
    WebElement signin_btn;
	
	@FindBy(xpath="//a[normalize-space()='Sign out']")
	WebElement signout_btn;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement datastructures_drpdwn;
		
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement ds_btn;
	
	@FindBy(xpath="//a[@href='array']")
	WebElement array_btn;
	
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement linkedlist_btn;
	
	
	@FindBy(xpath="//a[@href='stack']")
	WebElement stack_btn;
	
	@FindBy(xpath="//a[@href='queue']")
	WebElement queue_btn;
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement tree_btn;
	
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graph_btn;
	
	@FindBy(xpath="//*[contains(@class,\"alert alert-primary\")]")
	 WebElement logoutmsg;
	
	@FindBy(xpath="//a[normalize-space()='Arrays']")
	WebElement array_drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Linked List']")
	WebElement linkedlist_drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Stack']")
	WebElement stack_drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Queue']")
	WebElement queue_drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Tree']")
	WebElement tree_drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Graph']")
	WebElement graph_drpdwn;
	
	public void clickonregister() {
		
		register_btn.click();
		
	}

	public void clickonsignin() {
		
		signin_btn.click();
		
		
		
	}
	
	public boolean signoutLink() {
		
		return signout_btn.isDisplayed();
	}
	
	
	public boolean logoutMessage() {
		
		return logoutmsg.isDisplayed();
	}
	
	public void clickonDSintro() {
		
		
		datastructures_drpdwn.click();
	}
	
	
 public void clickonstackbutton() {
	 
	 stack_btn.click();
 }
 
 public void clickOnStackdropdown()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(stack_btn).click().build().perform();
	}	
	
 
 public void clickonQueuebutton() {
	 
	 queue_btn.click();
	 
 }
 
 public void clickonQueuedropdown() {
 
 Actions actions = new Actions(driver);
 
 actions.moveToElement(queue_btn).click().build().perform();
 }
 
public Homepage(WebDriver driver) {
	 
	 this.driver= driver ;
	 PageFactory.initElements(driver,this);
	 
	 
 }
}
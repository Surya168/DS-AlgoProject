package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class TryEditor {
	
	
	WebDriver driver;
	

	public TryEditor(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement textArea;
	
	
 @FindBy(xpath="//button[@type='button']")
WebElement run_btn;
 
 
 @FindBy(xpath="//pre[@id='output']")
 WebElement output;
 

 
 

 public void clickOnRunButton() {
	 
	 run_btn.click();
 }
 
 
 
 public String gettextFromOutput() {
	 
	 return output.getText();
	 
 }
 
 
    Properties properties ;
 
	 public void sendDatatoTextarea(){
		 
		 
		properties= ReadPropertyFile.loadproperties();
		Actions actions = new Actions(driver);
		actions.scrollToElement(textArea).sendKeys(properties.getProperty("pythoncode")).build().perform();
		//	textArea.sendKeys(properties.getProperty("pythoncode"));
			System.out.println("Inside text area");
		
		 
	 }

/* public void sendDatatoTextarea() {
	 
	 Properties p = new Properties();
	 try {
		
		 FileInputStream f = new FileInputStream("/Users/sarathkumar/eclipse-workspace/DSAlgo/src/test/resources/config/config.properties");
		 
		p.load(f);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	textArea.sendKeys(p.getProperty("pythoncode")) ;
	 
 }
 
 */
 
	 public WebElement  geteditorTextArea() {
		 
		 return textArea;
		 
		 
	 }	 
		 
	 
	 
 }
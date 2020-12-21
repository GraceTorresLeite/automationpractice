package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class SignIn {
	
	private static WebDriver driver;
	private static Waits waits;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		this.waits = new Waits(this.driver);
	}
	
	 public WebElement getFormlink(){
	     return waits.visibilityOfElement(By.xpath("//h1[@class='page-heading']"));
	    }	
	 
	 public WebElement createAccount() {
		 return waits.visibilityOfElement(By.xpath("//input[@id='email_create']"));
	 }
	 
	 public WebElement submitCreateAccount() {
		 return waits.visibilityOfElement(By.xpath("//div[@class='submit']/button[@id='SubmitCreate']"));
	 }
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class PaymentChoose {
	
	private WebDriver driver;
	 private Waits waits;
	 
	 
	public PaymentChoose(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	
	public WebElement getNameTextFieldForm(){
		 return waits.visibilityOfElement(By.className("page-heading"));
	    }
	
	public WebElement getFormPayment(){
		 return waits.visibilityOfElement(By.xpath("//div[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
	    }
	
}

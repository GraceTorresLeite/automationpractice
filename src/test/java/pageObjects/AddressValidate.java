package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class AddressValidate {
	
	private WebDriver driver;
	 private Waits waits;
	 
	 
	public AddressValidate(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	
	public WebElement getNameTextFieldForm(){
		 return waits.visibilityOfElement(By.className("page-heading"));
	    }
	
	public WebElement getButtonCheckout(){
		 return waits.visibilityOfElement(By.xpath("//p[@class='cart_navigation clearfix']/button[@name='processAddress']"));
	    }

}

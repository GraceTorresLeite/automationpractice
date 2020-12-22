package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class Shipping {
	
	private WebDriver driver;
	 private Waits waits;
	 
	 
	public Shipping(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	
	public WebElement getNameTextFieldForm(){
		 return waits.visibilityOfElement(By.className("page-heading"));
	    }
	
	public WebElement getAceptTerms(){
		 return waits.visibilityOfElement(By.id("uniform-cgv"));
	    }
	
	public WebElement getButtonCheckout(){
		 return waits.visibilityOfElement(By.xpath("//p[@class='cart_navigation clearfix']/button[@name='processCarrier']"));
	    }

}

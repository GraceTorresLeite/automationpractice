package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class OrderConfirmation {
	
	private WebDriver driver;
	private Waits waits;
	 
	 
	public OrderConfirmation(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	
	public WebElement getNameTextFieldForm(){
		 return waits.visibilityOfElement(By.className("page-heading"));
	    }
	
	public WebElement getButtonSignOut(){
		 return waits.visibilityOfElement(By.xpath("//div[@class='header_user_info']/a[@class='logout']"));
	    }
	

}

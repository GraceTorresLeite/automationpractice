package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class ConfirmMyOrder {
	
	private WebDriver driver;
	private Waits waits;
	 
	 
	public ConfirmMyOrder(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	
	public WebElement getNameTextFieldForm(){
		 return waits.visibilityOfElement(By.className("page-heading"));
	    }
	
	public WebElement getButtonConfirmMyOrder(){
		 return waits.visibilityOfElement(By.xpath("//p[@id='cart_navigation']/button[@type='submit']"));
	    }
	

}

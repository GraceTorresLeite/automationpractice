package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class HomePage {
	
	private static WebDriver driver;

	private static Waits waits;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.waits = new Waits(this.driver);
	}
	
	 public WebElement homeTitle(){	        
	     return waits.visibilityOfElement(By.className("header-container"));
	    }

	/* public WebElement selectCategoryDresses(){	        
	     return waits.visibilityOfElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a"));
	    }*/

	public WebElement addCart() {
		return waits.visibilityOfElement(By.xpath("//div[@class='right-block']/div[2]/a[1]"));
	}
	
	public WebElement proceedCheckout() {
		return waits.visibilityOfElement(By.xpath("//div[@class='button-container']/a"));
	}
}

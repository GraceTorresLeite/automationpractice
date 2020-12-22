package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import formWeb.Waits;

public class FormPage {
	
	 private WebDriver driver;
	 private Waits waits;
	 
	 
	public FormPage(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}
	 
	 public WebElement getNameTextFieldForm(){
	      return this.driver.findElement(By.className("page-subheading"));
	    }
	 
	 public WebElement getRadioGender(){

	        return this.driver.findElement(By.xpath("//div[@id='uniform-id_gender2']/span/input[@id='id_gender2']"));
	    }
	 
	 public WebElement getFirstNameTextField(){

	        return this.driver.findElement(By.id("customer_firstname"));
	    }
	 
	 public WebElement getLastNameTextField(){

	        return this.driver.findElement(By.id("customer_lastname"));
	    }
	 
	 public WebElement getPasswordTextField(){

	        return this.driver.findElement(By.id("passwd"));
	    }
	 
	 public WebElement getDaysSelectField(){

	        return this.driver.findElement(By.id("days"));
	    }
	 
	 public WebElement getMonthsSelectField(){

	        return this.driver.findElement(By.id("months"));
	    }
	 
	 public WebElement getYearsSelectField(){

	        return this.driver.findElement(By.id("years"));
	    }
	 
	 public WebElement getNewsletterField(){

	        return this.driver.findElement(By.id("newsletter"));
	    }
	 
	 public WebElement getOffersField(){

	        return this.driver.findElement(By.id("optin"));
	    }
	 
	 public WebElement getAddressFirtsNameTextField(){

	        return this.driver.findElement(By.id("firstname"));
	    }
	 
	 public WebElement getAddressLastNameTextField(){

	        return this.driver.findElement(By.id("lastname"));
	    }
	 
	 public WebElement getAddressCompanyTextField(){

	        return this.driver.findElement(By.id("company"));
	    }
	 
	 public WebElement getAddressStreetNameTextField(){

	        return this.driver.findElement(By.id("address1"));
	    }
	 
	 public WebElement getAddressComplementTextField(){

	        return this.driver.findElement(By.id("address2"));
	    }
	 
	 public WebElement getCityTextField(){

	        return this.driver.findElement(By.id("city"));
	    }
	 
	 public WebElement getStateSelectField(){

	        return this.driver.findElement(By.id("id_state"));
	    }
	 
	 public WebElement getPostCodeTextField(){

	        return this.driver.findElement(By.id("postcode"));
	    }
	 
	 public WebElement getCountrySelectField(){

	        return this.driver.findElement(By.id("id_country"));
	    }
	 
	 public WebElement getAddInformationTextField(){

	        return this.driver.findElement(By.id("other"));
	    }
	 
	 public WebElement getHomePhoneTextField(){

	        return this.driver.findElement(By.id("phone"));
	    }
	 
	 public WebElement getMobilePhoneTextField(){

	        return this.driver.findElement(By.id("phone_mobile"));
	    }
	 
	 public WebElement getAddressRefenceTextField(){

	        return this.driver.findElement(By.id("alias"));
	    }
	 
	 public WebElement getButtonRegister(){

	        return this.driver.findElement(By.id("submitAccount"));
	    }
}

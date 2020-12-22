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
		 return waits.visibilityOfElement(By.className("page-subheading"));
	    }
	////div[@id='uniform-id_gender2']/span/input[@id='id_gender2']
	//div[@class='center_column col-xs-12 col-sm-12']/div/form/div/div/div[2]/label/div/span/input[@id='id_gender2']"
	 public WebElement getRadioGender(){
		 return waits.visibilityOfElement(By.id("id_gender2"));
	    }
	 
	 public WebElement getFirstNameTextField(){
		 return waits.visibilityOfElement(By.id("customer_firstname"));
	    }
	 
	 public WebElement getLastNameTextField(){
		 return waits.visibilityOfElement(By.id("customer_lastname"));
	    }
	 
	 public WebElement getPasswordTextField(){
		 return waits.visibilityOfElement(By.id("passwd"));
	    }
	 
	 public WebElement getDaysSelectField(){
		 return waits.visibilityOfElement(By.xpath("//div[@class='form-group']/div/div/div/select/option[@value='1']"));
	    }
	 
	 public WebElement getMonthsSelectField(){
		 return waits.visibilityOfElement(By.xpath("//div[@class='form-group']/div/div[2]/div/select/option[@value='1']"));
	    }
	 
	 public WebElement getYearsSelectField(){
		 return waits.visibilityOfElement(By.xpath("//div[@class='form-group']/div/div[3]/div/select/option[@value='1979']"));
	    }
	 
	 public WebElement getNewsletterField(){
		 return waits.visibilityOfElement(By.xpath("//form[@id='account-creation_form']/div[1]/div[7]/div/span/input[@value='1']"));
	    }
	 
	 public WebElement getOffersField(){
		 return waits.visibilityOfElement(By.xpath("//form[@id='account-creation_form']/div[1]/div[8]/div/span/input[@value='1']"));
	    }
	 
	 public WebElement getAddressFirtsNameTextField(){
		 return waits.visibilityOfElement(By.id("firstname"));
	    }
	 
	 public WebElement getAddressLastNameTextField(){
		 return waits.visibilityOfElement(By.id("lastname"));
	    }
	 
	 public WebElement getAddressCompanyTextField(){
		 return waits.visibilityOfElement(By.id("company"));
	    }
	 
	 public WebElement getAddressStreetNameTextField(){
		 return waits.visibilityOfElement(By.id("address1"));
	    }
	 
	 public WebElement getAddressComplementTextField(){
		 return waits.visibilityOfElement(By.id("address2"));
	    }
	 
	 public WebElement getCityTextField(){
		 return waits.visibilityOfElement(By.id("city"));
	    }
	 
	 public WebElement getStateSelectField(){
		 return waits.visibilityOfElement(By.xpath("//div[@class='selector']/select[@id='id_state']/option[@value='1']"));
	    }
	 
	 public WebElement getPostCodeTextField(){
		 return waits.visibilityOfElement(By.id("postcode"));
	    }
	 
	 public WebElement getCountrySelectField(){
		 return waits.visibilityOfElement(By.xpath("//div[@id='uniform-id_country']/select/option[@value='21']"));
	    }
	 
	 public WebElement getAddInformationTextField(){
		 return waits.visibilityOfElement(By.id("other"));
	    }
	 
	 public WebElement getHomePhoneTextField(){
		 return waits.visibilityOfElement(By.id("phone"));
	    }
	 
	 public WebElement getMobilePhoneTextField(){
		 return waits.visibilityOfElement(By.id("phone_mobile"));
	    }
	 
	 public WebElement getAddressRefenceTextField(){
		 return waits.visibilityOfElement(By.id("alias"));
	    }
	 
	 public WebElement getButtonRegister(){
		 return waits.visibilityOfElement(By.id("submitAccount"));
	    }
}

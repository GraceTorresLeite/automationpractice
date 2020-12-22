package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.Shipping;

public class ShippingTask {
	
	private WebDriver driver;
    private Shipping shipping;
   
    private static Waits waits;
    
    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        shipping = new Shipping(this.driver);
        waits = new Waits(this.driver);	
    }
    
    
    public void aceptTerms() {
    	
    	titleFormValidation();
    	
    	waits.loadElement(shipping.getAceptTerms());
    	shipping.getAceptTerms().click();
    	
    	waits.loadElement(shipping.getButtonCheckout());
    	shipping.getButtonCheckout().click();
    	
    	buttonValidation();
    	
    }
    
    
 private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(shipping.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Shipping acessado com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar etapa Shipping", Screenshot.capture(driver));

	        }
    }
	
	private void buttonValidation() {
    	
    	try {
			Assertions.assertTrue(shipping.getButtonCheckout().isDisplayed());
			Report.extentTest.log(Status.PASS, "Etapa Shipping concluída com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel concluir a etapa Shipping", Screenshot.capture(driver));

	        }
    }

}

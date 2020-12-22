package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.AddressValidate;

public class AddressValidateTask {
	
	private WebDriver driver;
    private AddressValidate addressValidate;
    private static Waits waits;
    
    public AddressValidateTask(WebDriver driver) {
        this.driver = driver;
        addressValidate = new AddressValidate(this.driver);
        waits = new Waits(this.driver);	
    }
    
    public void addressConfirm() {
    	
    	titleFormValidation();
    	
    	waits.loadElement(addressValidate.getButtonCheckout());
    	addressValidate.getButtonCheckout().click();
    	
    	buttonValidation();
    	
    }
	
    private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(addressValidate.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagina valida endereco acessada com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar a pagina de validar endereco", Screenshot.capture(driver));

	        }
    }
	
	private void buttonValidation() {
    	
    	try {
			Assertions.assertTrue(addressValidate.getButtonCheckout().isDisplayed());
			Report.extentTest.log(Status.PASS, "Etapa Address concluída com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel concluir a etapa Address", Screenshot.capture(driver));

	        }
    }

}

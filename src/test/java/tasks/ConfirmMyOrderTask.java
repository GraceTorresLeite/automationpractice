package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.ConfirmMyOrder;

public class ConfirmMyOrderTask {
	
	private WebDriver driver;
    private ConfirmMyOrder confirmMyOrder;
    private static Waits waits;
    
    public ConfirmMyOrderTask(WebDriver driver) {
        this.driver = driver;
        confirmMyOrder = new ConfirmMyOrder(this.driver);
        waits = new Waits(this.driver);	
    }
    
    
    public void getConfirmMyOrder() {
    	
    	titleFormValidation();
    	
    	waits.loadElement(confirmMyOrder.getButtonConfirmMyOrder());
    	confirmMyOrder.getButtonConfirmMyOrder().click();
    	
    	buttonValidation();
    	
    }
    
    
    private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(confirmMyOrder.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagamento acessado com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar etapa Pagamento", Screenshot.capture(driver));

	        }
    }
	
	private void buttonValidation() {
    	
    	try {
			Assertions.assertTrue(confirmMyOrder.getButtonConfirmMyOrder().isDisplayed());
			Report.extentTest.log(Status.PASS, "Etapa confirmar minha ordem de compra concluída com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel concluir a etapa confirmar ordem de compra", Screenshot.capture(driver));

	        }
    }

}

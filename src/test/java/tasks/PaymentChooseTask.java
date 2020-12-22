package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.PaymentChoose;

public class PaymentChooseTask {
	
	private WebDriver driver;
    private PaymentChoose paymentChoose;
   
    private static Waits waits;
    
    public PaymentChooseTask(WebDriver driver) {
        this.driver = driver;
        paymentChoose = new PaymentChoose(this.driver);
        waits = new Waits(this.driver);	
    }
    
    
    public void getPaymentChoose() {
    	
    	titleFormValidation();
    	
    	waits.loadElement(paymentChoose.getFormPayment());
    	paymentChoose.getFormPayment().click();
    	
    	buttonValidation();
    	
    }
    
    
 private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(paymentChoose.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagamento acessado com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar etapa Pagamento", Screenshot.capture(driver));

	        }
    }
	
	private void buttonValidation() {
    	
    	try {
			Assertions.assertTrue(paymentChoose.getFormPayment().isDisplayed());
			Report.extentTest.log(Status.PASS, "Etapa escolha do pagamento concluída com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel concluir a etapa escolha do pagamento", Screenshot.capture(driver));

	        }
    }


}

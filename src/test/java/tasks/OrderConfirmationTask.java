package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.OrderConfirmation;

public class OrderConfirmationTask {
	
	private WebDriver driver;
    private OrderConfirmation orderConfirmation;
    private static Waits waits;
    
    public OrderConfirmationTask(WebDriver driver) {
        this.driver = driver;
        orderConfirmation = new OrderConfirmation(this.driver);
        waits = new Waits(this.driver);	
    }
    
    
    public void getOrderConfirmation() {
    	
    	titleFormValidation();
    	
    	waits.loadElement(orderConfirmation.getButtonSignOut());
    	orderConfirmation.getButtonSignOut().click();
    	
    	buttonLogoutValidation();
    	
    }
    
    
    private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(orderConfirmation.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Ordem de compra acessado com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar a ordem de compra", Screenshot.capture(driver));

	        }
    }
	
	private void buttonLogoutValidation() {
    	
    	try {
			Assertions.assertTrue(orderConfirmation.getButtonSignOut().isDisplayed());
			Report.extentTest.log(Status.PASS, "Acao sair concluída com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel deslogar", Screenshot.capture(driver));

	        }
    }


}

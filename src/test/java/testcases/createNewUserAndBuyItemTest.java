package testcases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.BaseTest;
import formWeb.Report;
import formWeb.Screenshot;
import tasks.AddressValidateTask;
import tasks.ConfirmMyOrderTask;
import tasks.FormTask;
import tasks.HomeTask;
import tasks.OrderConfirmationTask;
import tasks.PaymentChooseTask;
import tasks.ShippingTask;
import tasks.SignInTask;
/*
 * criando run para os testes*/
public class createNewUserAndBuyItemTest extends BaseTest {

	private WebDriver driver =this.getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private SignInTask signIntask = new SignInTask(driver);
	private FormTask formTask = new FormTask(driver);
	private AddressValidateTask addressValidateTask = new AddressValidateTask(driver);
	private ShippingTask shippingTask = new ShippingTask(driver);
	private PaymentChooseTask paymentChooseTask = new PaymentChooseTask(driver);
	private ConfirmMyOrderTask confirmMyOrderTask = new ConfirmMyOrderTask(driver);
	private OrderConfirmationTask orderConfirmationTask = new OrderConfirmationTask(driver);
	
	@Test
	public void createUserForm() {
		try{

            Report.startReport("Automation steps");

            homeTask.acessPageAutomationWeb();
            signIntask.getForm();
            formTask.fillForm();
            addressValidateTask.addressConfirm();
            shippingTask.aceptTerms();
            paymentChooseTask.getPaymentChoose();
            confirmMyOrderTask.getConfirmMyOrder();
            orderConfirmationTask.getOrderConfirmation();
           

        }catch (Exception e){

             Report.extentTest.log(Status.ERROR, e.getMessage(), Screenshot.captureBase64(driver));
        }
		
	}
	

}

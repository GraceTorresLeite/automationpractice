package testcases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.BaseTest;
import formWeb.Report;
import formWeb.Screenshot;
import tasks.FormTask;
import tasks.HomeTask;
import tasks.SignInTask;
/*
 * criando run para os testes*/
public class createNewUserAndBuyItemTest extends BaseTest {

	private WebDriver driver =this.getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private SignInTask signIntask = new SignInTask(driver);
	private FormTask formTask = new FormTask(driver);
	
	@Test
	public void createUserForm() {
		try{

            Report.startReport("Automation steps");

            homeTask.acessPageAutomationWeb();
            signIntask.getForm();
            formTask.fillForm();
            
           

        }catch (Exception e){

             Report.extentTest.log(Status.ERROR, e.getMessage(), Screenshot.captureBase64(driver));
        }
		
	}
	

}

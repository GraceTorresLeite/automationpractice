package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.SignIn;

public class SignInTask {
	
	private static WebDriver driver;
	private static SignIn signIn;
	private static Waits waits;
	
	public SignInTask(WebDriver driver){
		this.driver = driver;
		signIn = new SignIn(this.driver);
		waits = new Waits(this.driver);
	}
	
	public void getForm() {
		linkValidation();
		waits.loadElement(signIn.createAccount());
		signIn.createAccount().click();
		createValidation();
		
		
	}
	
	private void linkValidation() {
		
		try {
			Assertions.assertTrue(signIn.getFormlink().isDisplayed());
			Report.extentTest.log(Status.PASS, "Form para cadastro selecionado", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Não foi possivel acessar o formulário de cadastro", Screenshot.capture(driver));

	        }
	}
	
	private void createValidation() {
		
		try {
			Assertions.assertTrue(signIn.createAccount().isDisplayed());
			Report.extentTest.log(Status.PASS, "criar conta", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Não foi possivel acessar criar conta", Screenshot.capture(driver));

	        }
	}
	 
}

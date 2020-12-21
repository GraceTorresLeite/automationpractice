package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.HomePage;

public class HomeTask {
	
	private static WebDriver driver;
	private static HomePage homePage;
	private static Waits waits;
	
	public HomeTask(WebDriver driver) {
		this.driver = driver;
        homePage = new HomePage(this.driver);
        waits = new Waits(this.driver);		
	}
	
	
	public void acessPageAutomationWeb() {
		  homeValidation();
	      /*waits.loadElement(homePage.selectCategoryDresses());
	      homePage.selectCategoryDresses().click();*/
		  waits.loadElement(homePage.addCart());
	      homePage.addCart().click();
	      addValidation();
	      waits.loadElement(homePage.proceedCheckout());
	      homePage.proceedCheckout().click();
	      checkoutValidation();
	      waits.loadElement(homePage.verifyTotalAndProceedCheckoutAgain());
	      homePage.verifyTotalAndProceedCheckoutAgain().click();
	      totalCartValidation();
	      
		
	}
	private void homeValidation() {
		
		try {
			Assertions.assertTrue(homePage.homeTitle().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagina acessada com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar a pagina", Screenshot.capture(driver));

	        }
	}
	
	private void addValidation() {
		try {
			Assertions.assertTrue(homePage.addCart().isDisplayed());
			Report.extentTest.log(Status.PASS, "Produto add com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel add o produto", Screenshot.capture(driver));

	        }
	}
	
	private void checkoutValidation() {
		
		try {
			Assertions.assertTrue(homePage.proceedCheckout().isSelected());
			Report.extentTest.log(Status.PASS, "Checkout com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel realizar o checkout", Screenshot.capture(driver));

	        }
	}
	
	private void totalCartValidation() {
		
		try {
			Assertions.assertTrue(homePage.verifyTotalAndProceedCheckoutAgain().isDisplayed());
			Report.extentTest.log(Status.PASS, "Total cart e checkout com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel o checkout do total do carrinho", Screenshot.capture(driver));

	        }
	}
	
}

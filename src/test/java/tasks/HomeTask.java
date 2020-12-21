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
		
	}
	private void homeValidation() {
		
		try {
			Assertions.assertTrue(homePage.homeTitle().isDisplayed());
			Report.extentTest.log(Status.PASS, "Página acessada com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Não foi possivel acessar a página", Screenshot.capture(driver));

	        }
	}
	
	private void addValidation() {
		try {
			Assertions.assertTrue(homePage.addCart().isDisplayed());
			Report.extentTest.log(Status.PASS, "Cart acessado com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Não foi possivel acessar o cart", Screenshot.capture(driver));

	        }
	}
	
	private void checkoutValidation() {
		try {
			Assertions.assertTrue(homePage.proceedCheckout().isDisplayed());
			Report.extentTest.log(Status.PASS, "Checkout com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Não foi possivel realizar o checkout", Screenshot.capture(driver));

	        }
	}
	
}

package tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import formWeb.Report;
import formWeb.Screenshot;
import formWeb.Waits;
import pageObjects.FormPage;
import utils.FakerGeneration;

public class FormTask {
	
	private WebDriver driver;
    private FormPage formPage;
    private FakerGeneration faker;
    private static Waits waits;
    
    public FormTask(WebDriver driver) {
        this.driver = driver;
        formPage = new FormPage(this.driver);
        faker = new FakerGeneration(this.driver);
        waits = new Waits(this.driver);	
    }
    
    public void fillForm() {
    	
    	titleFormValidation();
    	waits.loadElement(formPage.getRadioGender());
    	formPage.getRadioGender().click();
    	waits.loadElement(formPage.getFirstNameTextField());
    	formPage.getFirstNameTextField().sendKeys(faker.getFirstName());
    	waits.loadElement(formPage.getLastNameTextField());
    	formPage.getLastNameTextField().sendKeys(faker.getLastName());
    	waits.loadElement(formPage.getPasswordTextField());
    	formPage.getPasswordTextField().sendKeys(faker.getPassword());
    	waits.loadElement(formPage.getDaysSelectField());
    	formPage.getDaysSelectField().sendKeys(faker.getDateDay());
    	waits.loadElement(formPage.getMonthsSelectField());
    	formPage.getMonthsSelectField().sendKeys(faker.getDateMonth());
    	waits.loadElement(formPage.getYearsSelectField());
    	formPage.getYearsSelectField().sendKeys(faker.getDateYear());
    	waits.loadElement(formPage.getNewsletterField());
    	formPage.getNewsletterField().click();
    	waits.loadElement(formPage.getOffersField());
    	formPage.getOffersField().click();
    	waits.loadElement(formPage.getAddressFirtsNameTextField());
    	formPage.getAddressFirtsNameTextField().sendKeys(faker.getAddressFirtsName());
    	waits.loadElement(formPage.getAddressLastNameTextField());
    	formPage.getAddressLastNameTextField().sendKeys(faker.getAddressLastName());
    	waits.loadElement(formPage.getAddressCompanyTextField());
    	formPage.getAddressCompanyTextField().sendKeys(faker.getCompany());
    	waits.loadElement(formPage.getAddressStreetNameTextField());
    	formPage.getAddressStreetNameTextField().sendKeys(faker.getAddress());
    	waits.loadElement(formPage.getAddressComplementTextField());
    	formPage.getAddressComplementTextField().sendKeys(faker.getAddressNumber());
    	waits.loadElement(formPage.getCityTextField());
    	formPage.getCityTextField().sendKeys(faker.getAddressCity());
    	waits.loadElement(formPage.getStateSelectField());
    	formPage.getStateSelectField().sendKeys(faker.getAddressState());
    	waits.loadElement(formPage.getPostCodeTextField());
    	formPage.getPostCodeTextField().sendKeys(faker.getAddressPostalCode());
    	waits.loadElement(formPage.getCountrySelectField());
    	formPage.getCountrySelectField().sendKeys(faker.getAddressCountry());
    	waits.loadElement(formPage.getAddInformationTextField());
    	formPage.getAddInformationTextField().sendKeys(faker.getPhoneHome());
    	waits.loadElement(formPage.getHomePhoneTextField());
    	formPage.getHomePhoneTextField().sendKeys(faker.getPhoneHome());
    	waits.loadElement(formPage.getMobilePhoneTextField());
    	formPage.getMobilePhoneTextField().sendKeys(faker.getPhoneMobile());
    	waits.loadElement(formPage.getAddressRefenceTextField());
    	formPage.getAddressRefenceTextField().sendKeys(faker.getBooleanAddressSecundary());
    	waits.loadElement(formPage.getButtonRegister());
    	formPage.getButtonRegister().click();
    	buttonValidation();
    	
    }
    
    private void titleFormValidation() {
    	
    	try {
			Assertions.assertTrue(formPage.getNameTextFieldForm().isDisplayed());
			Report.extentTest.log(Status.PASS, "Pagina acessada com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar a pagina", Screenshot.capture(driver));

	        }
    }
    
    private void buttonValidation() {
    	
    	try {
			Assertions.assertTrue(formPage.getButtonRegister().isSelected());
			Report.extentTest.log(Status.PASS, "Pagina acessada com sucesso", Screenshot.capture(driver));
		
		}catch (Exception e){

	        Report.extentTest.log(Status.FAIL, "Nao foi possivel acessar a pagina", Screenshot.capture(driver));

	        }
    }

}

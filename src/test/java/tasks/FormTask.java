package tasks;

import org.openqa.selenium.WebDriver;

import pageObjects.FormPage;
import utils.FakerGeneration;

public class FormTask {
	
	private WebDriver driver;
    private FormPage formPage;
    private FakerGeneration faker;
    
    public FormTask(WebDriver driver) {
        this.driver = driver;
        formPage = new FormPage(this.driver);
        faker = new FakerGeneration(this.driver);
    }
    
    public void fillForm() {
    	
    	
    	
    }

}

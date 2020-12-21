package formWeb;

import static formWeb.Report.endReport;
import static formWeb.Report.setExtent;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverManager{
	
	private WebDriver driver;
	private String URL = "http://automationpractice.com/index.php?";
	
	public WebDriver getDriver() {
		return this.driver = getDriver(DriverType.CHROME);
		
	}
	
	@BeforeEach
	public void setUp() {
		setExtent();
		getDriver().get(URL);
	}
	@AfterEach
	public void tearDown() {
		endReport();
		quitDriver();
	}
	

}

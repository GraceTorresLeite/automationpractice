package formWeb;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;
	

	private static WebDriver getManager(DriverType type) {
		switch(type) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximizad");
			driver =new ChromeDriver(options);
			break;
			
		case HEADLESS:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options_headless = new ChromeOptions();
			options_headless.addArguments("--headless");
			options_headless.addArguments("--window-size(1200,600)");
			driver=new ChromeDriver(options_headless);
			break;
			
		case IE:
			WebDriverManager.chromedriver().setup();
			MutableCapabilities mutableCapabilities = new MutableCapabilities();
			mutableCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
			mutableCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver();
			break;
			
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
			default:
				break;
		}
					
		return driver;
		
	}
	
	public static WebDriver getDriver(DriverType type) {
		if(driver == null) {
			driver =getManager(type);
		}
		return driver;		
	}
	
	public static void quitDriver() { //close = fecha /quit = close + terminar processo de excecução do drive(sem encher a memória)
		if(driver != null) {
			driver.quit();
			driver =null;
		}
	}
}

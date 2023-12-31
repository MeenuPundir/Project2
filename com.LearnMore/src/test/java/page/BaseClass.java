package page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.BrowserFactory;
public class BaseClass {
	
public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

}
	

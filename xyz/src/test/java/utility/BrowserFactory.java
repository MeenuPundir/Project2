package utility;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	WebDriver driver;
	public static WebDriver startApp(WebDriver driver, String browser, String url) {
	
	if
		(browser.equals("Chrome")){
		
		WebDriverManager.chromedriver().setup();
	}
		
		else if 
		(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
		}
		else if
		(browser.equals("Firefox")){ 
		WebDriverManager.firefoxdriver().setup();
		}
		else
			System.out.println("Wrong Browser");
	
	}
	driver.manage().timeouts.pageLoadTimeout(30, TimeUnits, seconds);
	
	
	
	return driver;
	
	
	
public static void tearDown(WebDriver driver) {
	driver.close();
}

}

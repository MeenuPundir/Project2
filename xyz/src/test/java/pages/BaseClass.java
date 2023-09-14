package pages;

public class BaseClass {
	
	public void setup() {
		driver =BrowserFactory.startApp(driver, "Chrome" , "https://www.saucedemo.com/");
		
	}

	public void tearDown() {
	BrowserFactory.quitBrowser();
	}
}

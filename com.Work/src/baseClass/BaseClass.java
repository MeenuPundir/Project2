package baseClass;

import homePage.HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseClass {
	public static Properties CONFIG=null;
	public static Properties OR=null;
	 public static WebDriver dr= null;
	public static EventFiringWebDriver driver=null;
	public static boolean isLoggedIn=false;
	HomePage objHomePage;
	
	public static WebDriver initialize() throws IOException{
	if(driver == null){
		// config property file
		CONFIG= new Properties();
		FileInputStream fn =new FileInputStream(System.getProperty("user.dir")+"//src//config/config.properties");
		CONFIG.load(fn);
		
		
		// OR Properties
		OR= new Properties();
		fn =new FileInputStream(System.getProperty("user.dir")+"//src//config/OR.properties");
		OR.load(fn);
		
		
		// Initalize the webdriver and EventFiringWebDriver
		if(CONFIG.getProperty("browser").equals("Firefox")){
			 dr = new FirefoxDriver();
		}
		else if(CONFIG.getProperty("browser").equals("IE")){
			System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
			 dr = new InternetExplorerDriver();
		}
		else if(CONFIG.getProperty("browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			dr = new ChromeDriver();
		}
					
		driver = new EventFiringWebDriver(dr);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
	}
	return driver;
	}

	//create log4j method to access log4j property class
	public void log4jMethod(){
	PropertyConfigurator.configure(System.getProperty("user.dir")+"//src//config/log4j.properties");
	}
	
	
		//method to get values of webElements, present on different pages
		public static WebElement getValue(String xpathKey) {
			try{
				 (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(OR.getProperty(xpathKey))));
				 return driver.findElement(By.xpath(OR.getProperty(xpathKey)));
			}catch(Throwable t){
				//report error
				//TestUtil.takeScreenShot(System.getProperty("user.dir")+"//src//snapShot/test.png");
				Assert.assertEquals(t.getMessage(),false);
				
				return null;
			}
		
	}
}

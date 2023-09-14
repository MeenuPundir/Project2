package executeMain;

import homePage.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import myApptPage.MyApptPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import userLogin.UserLogin;
import baseClass.BaseClass;

public class CrossBrowserTesting extends BaseClass {
	HomePage objHomepage;
	UserLogin objUserlogin;
	MyApptPage objMyApptPage;
	//static WebDriver driver;
	
	@BeforeTest
	@Parameters("browsr")
	public static void setBrowsers(String browsr) throws Exception{
	
		if(browsr.equalsIgnoreCase("Firefox")){
		dr = new FirefoxDriver();
		}	
		else if(browsr.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",".\\src\\config\\chromedriver.exe");
			dr = new ChromeDriver();
		}
				else if(browsr.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver",".\\src\\config\\IEDriverServer.exe");	
				 dr = new InternetExplorerDriver();
					}
	else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
	}
		 driver = new EventFiringWebDriver(dr);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

    
	
	@Test
	public void setUrl() throws IOException{
		System.out.println("Open Url");
		driver.get("http://test.docasap.com");
	}
	
	@Test
	public void loginPage(){
		objHomepage= new HomePage();
		objHomepage.loginMenu();
		String lgTxt= objHomepage.setLoginText();	
		System.out.println(lgTxt);
		Assert.assertEquals(lgTxt,"Log In");
				
	}
	
	
}
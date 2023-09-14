//http://stackoverflow.com/questions/19403949/how-to-handle-pop-up-in-selenium-webdriver-using-java
package providerAccount;

	import homePage.HomePage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import myApptPage.MyApptPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import userLogin.UserLogin;
import baseClass.BaseClass;
@Test
public class windowHandle extends BaseClass{
	HomePage objHomepage;
	UserLogin objUserlogin;
	MyApptPage objMyApptPage;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String firstWindow,secondWindow;
			
			public void startDriver() throws Exception{
				driver= new FirefoxDriver(); 
				driver.manage().window().maximize();
				wait=new WebDriverWait(driver, 20);

				driver.get("http://test.docasap.com");
				firstWindow=driver.getWindowHandle();

					driver=new FirefoxDriver();
					//driver.manage().window().maximize();
					wait=new WebDriverWait(driver, 20);
					driver.get("https://test.docasap.com/doctors");
					secondWindow=driver.getWindowHandle();


			        System.out.println("First window handle :" + firstWindow);
			        System.out.println("\n Second window handle :" + secondWindow);

			driver.switchTo().window(firstWindow);
			System.out.println("hello");
			}
			}
package executeMain;

//import report.Report;
import homePage.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import keyWordDriven.ExecuteTest;
import myApptPage.MyApptPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import providerAccount.HandlingAlert;
import providerAccount.HandlingFrames;
import providerLogin.ProviderLoginPage;
import excelSheet.ExcelSheet;
import userLogin.UserLogin;
import adminLoginPage.AdminLoginPage;
import adminLoginPage.PendingUserDymanic;
import adminLoginPage.PendingUserTabStatic;
import baseClass.BaseClass;

//@Listeners({screenShot.ScreenShotOnFailure.class})

	public class ExecuteSuit extends BaseClass {
		//create objects of different pages/classes
			HomePage objHomepage;
			UserLogin objUserlogin;
			MyApptPage objMyApptPage;
			ExcelSheet objExcelSheet;
			PendingUserTabStatic objPendingUserTabStatic;
			AdminLoginPage objAdminLoginPage;
			Logger log;
			HandlingAlert objHandlingAlert;
			ExecuteTest objExecuteTest;
			HandlingFrames objHandlingFrames;
			
			
			//call log4j method to maintain record of log
			@BeforeClass
			public void methodLog4j(){
			log = Logger.getLogger("log4jFile");
			log4jMethod();
			}
			
			
			//read data from excel sheet using dataProvider annotation
			@DataProvider(name = "dataValues")
			public Object[][] FetchDataFromXl() throws Exception
			{
				// Xls_Reader reader=new Xls_Reader();
				ExcelSheet readExcel = new ExcelSheet();
				Object[][] retObjArr = readExcel.readData();
				return retObjArr;
			}		
		
		@BeforeTest
		public void setup() throws IOException{
			System.out.println("Open Url");	
			initialize();	
		}
		
		
		@Test(priority = 0)
		public void loginPage() throws IOException{
			log.info("Login Page");
			//initialize();
			driver.get(CONFIG.getProperty("userSiteName"));
			objHomepage= new HomePage();
			objHomepage.loginMenu();
			String lgTxt= objHomepage.setLoginText();	
			System.out.println(lgTxt);
			Assert.assertEquals(lgTxt,"LogIn");
						
		}
		
		
		//pass parameters
		@Test(dataProvider = "dataValues", dependsOnMethods={"loginPage"})
		public void loginCredentialsReadXl(String Username, String Password) throws Throwable
		{
			//System.out.println("Put login credentials");
			log.info("Put login credentials");
			UserLogin objUserlogin= new UserLogin();
			objUserlogin.UserLoginPage(Username,Password);
			objMyApptPage= new MyApptPage();
			String ApptPage=objMyApptPage.BookNewApptButton();
			System.out.println(ApptPage);
			Assert.assertEquals(objMyApptPage.BookNewApptButton(),"BOOK NEW APPOINTMENT");
			//TestUtil.takeScreenShot(System.getProperty("user.dir")+"\\src\\snapShot\\pass.png");
		}
		

		//navigate to next tab
		@Test
		public void adminLogin() throws IOException {
			//System.out.println("Open Url in next tab" + " Go to Admin Url");
			log.info("Go to Admin Url");
			initialize();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");//next tab
			driver.get(CONFIG.getProperty("adminSiteName"));
		}
			

		//@Test(enabled=false)
		@Test
		public void adminAccount() throws Exception{
			log.info("Go to Admin Account");
			objAdminLoginPage= new AdminLoginPage();
			objAdminLoginPage.putAdminLogin("Docasapadmin", "da_dev_test");			
			objPendingUserTabStatic= new PendingUserTabStatic();
			objPendingUserTabStatic.clickPendingUserTab();
		}
		
		//use webtable handling
		@Test
		public void fetchValuesFromPendingUserTab(){
		objPendingUserTabStatic= new PendingUserTabStatic();
			objPendingUserTabStatic.clickPendingUserTab();	
			
		}
		
		@Test
		public void providerAccountLogin() throws IOException{
		initialize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");//next tab
		driver.get(CONFIG.getProperty("providerSiteName"));
		
	}
		//use alert
		 @Test
		public void alert(){
			objHandlingAlert= new HandlingAlert();
			objHandlingAlert.alert();
			
	}
		 //handle frame
		 @Test
		 public void frameHandle(){
			 objHandlingFrames= new HandlingFrames(); 
			 objHandlingFrames.frame();
		 }
		 
		 
	}



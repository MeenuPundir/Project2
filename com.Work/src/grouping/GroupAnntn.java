package grouping;

import homePage.HomePage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dropdownList.DropDownList;
import baseClass.BaseClass;
import adminLoginPage.AdminLoginPage;
import adminLoginPage.PendingUserDymanic;


public class GroupAnntn extends BaseClass{
	AdminLoginPage objAdminLoginPage;
	PendingUserDymanic objPendingUser;
	DropDownList objDropDownList;
	HomePage objHomepage;
	
	public static String secondWindow;
	
	@Test(groups="Regression")
	public void setup(){
		System.out.println("Open Url");

}
	
	@Test(groups="Regression")
	public void execute() throws IOException{
		//System.out.println("Login Page");
		
		objDropDownList= new DropDownList();
		objDropDownList.dropDown();
	}
	
	

	@Test(groups="Smoke Test")
	public void goToProviderUrl() throws Throwable
	{
		System.out.println("Opening provider side Url");
		initialize();
   driver.get(CONFIG.getProperty("providerSiteName"));
	}
	
	// @Parameters("Reg")
	     @Test(groups={"Smoke Test", "Regression"}) 
	     public void abc(@Optional("TestNG Examples") String Hello) {	 
	         System.out.println(Hello);
	 
	     }

		
	
	
/*	@Test(groups="Regression")
	public void adminAccount(){
		System.out.println("Go to Admin Account");
		objAdminLoginPage= new AdminLoginPage();
		objAdminLoginPage.putAdminLogin("Docasapadmin", "da_dev_test");
	}
	
	@Test(groups="Smoke Test")
	public void PendingUserTab(){
		objPendingUser= new PendingUserDymanic();
		objPendingUser.clickPendingUserTab();
	}
	*/
	
	
}


package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;

public class Login extends BaseClass {
	
	@Test
	public void loginApp()
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
		loginpage.loginToApp("standard_user", "secret_sauce");
		
	}
	

}

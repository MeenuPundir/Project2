package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.SetBrowsers;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	driver = SetBrowsers.setBrowser(driver, "Chrome", "https://www.saucedemo.com/");
	
	}
	
	@AfterClass
	public void teardown() {
		SetBrowsers.quitBrowser(driver);
		
	
	}
}

package com.utility;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetBrowsers {
	
	public static WebDriver setBrowser(WebDriver driver, String browser, String url) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Wrong Driver");
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("url");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
			
		return driver;
	}		
		
		public static void quitBrowser(WebDriver driver) {
			driver.close();
		}

}

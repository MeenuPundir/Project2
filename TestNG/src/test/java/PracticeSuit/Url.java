package PracticeSuit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url {
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
	}

	@Test
	public void getUrl() throws InterruptedException {
		String ExpectedUrl ="https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		if(ExpectedUrl.equals(ActualUrl)) {
			System.out.println("We are on a right URl");
			
		}
		else
			System.out.println("Incorrect URL");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}

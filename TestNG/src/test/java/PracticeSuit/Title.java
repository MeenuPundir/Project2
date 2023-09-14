package PracticeSuit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
	}

	@Test
	public void getTitle() throws InterruptedException{
		String ExpectedTitle ="Swag Labs";
		String ActualTitle = driver.getTitle();
		Thread.sleep(2000);
		
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("We are on a right Page");
			
		}
		else
			System.out.println("Incorrect Title");
		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}

package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("in BeforeTest method");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void login() throws InterruptedException {
		System.out.println("in test method");
		WebElement ele1= driver.findElement(By.id("user-name"));
		ele1.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("password"));
		ele2.sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	

	@AfterTest
	public void close()
	{
		System.out.println("in After Test method");
		driver.close();
	}
}

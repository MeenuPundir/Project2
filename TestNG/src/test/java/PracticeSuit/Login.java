package PracticeSuit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}

	@Test
	public void loginPage() throws InterruptedException {
		WebElement ele1= driver.findElement(By.id("user-name"));
		ele1.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele2= driver.findElement(By.id("password"));
		ele2.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}

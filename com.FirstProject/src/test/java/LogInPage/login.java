package LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		System.out.println("The url of the current page is=:" + url);

		String title = driver.getTitle();
		System.out.println("The title of the page is=:" + title);

		String pagesource = driver.getPageSource();
		System.out.println("The pagesource of the page is=:" + pagesource);

		WebElement ele1 = driver.findElement(By.id("user-name"));
		ele1.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("password"));
		ele2.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();

		
		
		//verify that after click on login button right page should open.
		String expectedurl = "https://www.saucedemo.com/inventory.html";

		String actualurl = driver.getCurrentUrl();

		if (expectedurl.equals(actualurl)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login failed");
		}

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	
		driver.close();

	}
		

	}

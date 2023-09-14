package LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 
		 String url = driver.getCurrentUrl();
		 System.out.println("The url of the current page is = " + url);
		 
		 String title = driver.getTitle();
		 System.out.println("The title of the page is = " + title);
		 
		 String pageSource = driver.getPageSource();
		 System.out.println("The pagesource of the page is = " + pageSource);
		 
		 WebElement ele1 = driver.findElement(By.id("APjFqb"));
		 ele1.sendKeys("who is the pm of India");
		 Thread.sleep(2000);
		
		 Scanner keyboard = new Scanner(System.in);
		 keyboard.nextLine();
		 
		
		 
		 
		 
		 
		 
		 
		
		 
;		
		
	}

}

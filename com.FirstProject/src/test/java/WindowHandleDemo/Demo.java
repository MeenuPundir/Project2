package WindowHandleDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Thread.sleep(2000);
		
//		String windowid = driver.getWindowHandle();
//		System.out.println("Current window id=:" + windowid);
		
		//handling windows by Ids
		Set<String> windowid = driver.getWindowHandles(); 
		
		//making an arrayList of window Ids
		List<String> windowlist = new ArrayList<String>(windowid);
		String pwindow = windowlist.get(0);
		System.out.println("Parent window id is:" +pwindow);
		String cwindow = windowlist.get(1);
		System.out.println("Child window id is:" +cwindow);
		Thread.sleep(4000);
		
		//switch between windows
		driver.switchTo().window(pwindow);
		Thread.sleep(4000);
		WebElement ele1 = driver.findElement(By.name("username"));
		ele1.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.name("password"));
		ele2.sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(4000);
		
		//close() will close the current window only
		//driver.close();
		
		//quit() will close all the windows or complete browser
		driver.quit();
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}

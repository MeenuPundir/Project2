package FileUpload;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo{
		public static void main(String[] args) throws InterruptedException{

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://the-internet.herokuapp.com/upload");
			driver.manage().window().maximize();
		
			Thread.sleep(3000);
			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ASUS\\OneDrive\\Desktop\\demoFile.docx");

			Thread.sleep(2000);
			driver.findElement(By.id("file-submit")).click();
			Thread.sleep(2000);
			driver.close();
		}

	}
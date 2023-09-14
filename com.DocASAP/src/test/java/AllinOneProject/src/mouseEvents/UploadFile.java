package mouseEvents;
	 
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	
public class UploadFile {
		
	@Test
		public void upload() {
	String baseUrl = "http://www.megafileupload.com/";
	WebDriver driver = new FirefoxDriver();
	 
	driver.get(baseUrl);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='slider-btn slider-btn-upload']")).click();
	
	WebElement uploadElement = driver.findElement(By.xpath("//i[@class='entypo-upload']"));
	 
	// enter the file path onto the file-selection input field
	uploadElement.sendKeys("D:\\ab.txt");

	}
	}

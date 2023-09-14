package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//form/input[@type='checkbox']"));
		System.out.println(ele1.size());
		
		for(WebElement checkbox : ele1)
		{
			Thread.sleep(2000);
			checkbox.click();
			}
		
		Thread.sleep(2000);
		driver.close();
		
		//form/input[@type='checkbox']
		
	}

}

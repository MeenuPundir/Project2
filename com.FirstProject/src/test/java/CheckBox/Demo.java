package CheckBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args)throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//most important code use for checkbox
		List<WebElement> ele1 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(ele1.size());

		for (WebElement checkbox : ele1) {
			Thread.sleep(2000);

			checkbox.click();

		}
		Thread.sleep(2000);

		driver.close();

		
		
	}

}

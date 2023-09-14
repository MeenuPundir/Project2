package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Usage {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver"," path of chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//driver.findElement(By.id("dblClkBtn"));
	
	//Double click
	Actions act = new Actions(driver);
	WebElement ele1 = driver.findElement(By.id("dblClkBtn")); 
	act.doubleClick(ele1).perform();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	List<WebElement> ele2 = driver.findElements(By.xpath("//form/input[@type='checkbox']"));
	System.out.println(ele2.size());
	
	for(WebElement checkbox : ele2)
	{
		Thread.sleep(2000);
		checkbox.click();
		}
	Thread.sleep(2000); 
	
	WebElement ele3 = driver.findElement(By.id("testingDropdown"));
	Select drp1 = new Select(ele3);
	drp1.selectByValue("Database");
	
	Thread.sleep(2000);
	
	
}

}

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select drp1 = new Select(ele1);
		//drp1.selectByValue("Boston");
		//Thread.sleep(2000);
		
		drp1.selectByValue("Mexico City");
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp2 = new Select(ele2);
		drp2.selectByValue("New York");
		Thread.sleep(2000);
		
		drp2.selectByValue("London");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("inputName"));
		ele3.sendKeys("Meenu");
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("address"));
		ele4.sendKeys("Mexico");
		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("city"));
		ele5.sendKeys("abc");
		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.id("state"));
		ele6.sendKeys("United States");
		Thread.sleep(2000);
		
		WebElement ele7 = driver.findElement(By.id("zipCode"));
		ele7.sendKeys("10001");
		Thread.sleep(2000);
		
		WebElement ele8 = driver.findElement(By.id("cardType"));
		//WebElement ele8 = driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		Select drp3 = new Select(ele8);
		drp3.selectByValue("amex");
		Thread.sleep(2000);
		
		WebElement ele9 = driver.findElement(By.id("creditCardNumber"));
		ele9.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement ele10 = driver.findElement(By.id("creditCardMonth"));
		ele10.clear();
		ele10.sendKeys("08");
		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.id("creditCardYear"));
		ele11.clear();
		ele11.sendKeys("2024");
		Thread.sleep(2000);
		
		WebElement ele12 = driver.findElement(By.id("nameOnCard"));
		ele12.sendKeys("Meenu");
		Thread.sleep(2000);
		
		WebElement ele13 = driver.findElement(By.id("rememberMe"));
		ele13.isEnabled();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}

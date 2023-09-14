package providerAccount;

import homePage.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import providerLogin.ProviderLoginPage;
import baseClass.BaseClass;

public class HandlingAlert extends BaseClass{
	
	ProviderLoginPage objProviderLoginPage;

	@BeforeTest
	public void setup() throws IOException{
		System.out.println("Open Url");
		initialize();
		driver.get(CONFIG.getProperty("providerSiteName"));
		
}
		
	@Test
	public void alert(){
		//objProviderLoginPage= new ProviderLoginPage();
		//objProviderLoginPage.clickOnProviderLogin();
		
		WebElement providerLogin=driver.findElement(By.xpath("//input[@name='Login']"));
		providerLogin.click();
		//Alert alert=driver.switchTo().alert();
	
		//alert.accept();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		   Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println(alert.getText());
		alert.getText();
	alert.dismiss();
//	alert.dismiss();
	//	alert.sendkeys();
		//String handle= driver.getWindowHandle();
      //  System.out.println(handle);
	//String mainWindowHandle=driver.getWindowHandle();
	}
		
	
	
}
	
	
package providerAccount;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import providerLogin.ProviderLoginPage;
import adminLoginPage.AdminLoginPage;
import baseClass.BaseClass;

public class HandlingFrames extends BaseClass {
	
	ProviderLoginPage objProviderLoginPage;
	@Test
	public void setup() throws IOException{
		System.out.println("Open Url");
		initialize();
		driver.get(CONFIG.getProperty("providerSiteName"));
        objProviderLoginPage=new ProviderLoginPage();
        objProviderLoginPage.putproviderLogin("Penncca", "Docasap12#");
   
		
}
	@Test
	public void frame(){
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(1);     
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
      WebDriverWait wait = new WebDriverWait(driver, 30);// 1 minute 
       //click on checkbox
      //  objProviderLoginPage.clickOnCaptcha();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"))).click();
	}
	
}

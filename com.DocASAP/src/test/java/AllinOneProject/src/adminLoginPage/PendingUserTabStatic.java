package adminLoginPage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import adminLoginPage.AdminLoginPage;
import baseClass.BaseClass;

public class PendingUserTabStatic extends BaseClass {
//WebElement pendingUser= getValue("admin_pending_user");
AdminLoginPage objAdminLoginPage;



public void setup() throws IOException{
	System.out.println("Open Url");
initialize();
	driver.get(CONFIG.getProperty("adminSiteName"));
	objAdminLoginPage = new AdminLoginPage();
	objAdminLoginPage.putAdminLogin("docasapadmin", "da_dev_test");
}
	
	public void clickPendingUserTab(){
		WebElement pendingUser= driver.findElement(By.xpath("//li/a[text()='Pending Users']"));
		pendingUser.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String getValueOfparticularCell= driver.findElement(By.xpath("//table[@id='penddingUser']/tbody/tr[2]/td[3]")).getText();
		System.out.println(getValueOfparticularCell);
	
		
		
		
	}
}

package adminLoginPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BaseClass;
//Getting values for WebElements present on this page
public class AdminLoginPage extends BaseClass {
	WebElement adminLogin = getValue("admin_login");
	WebElement adminPassword = getValue("admin_password");
	WebElement adminLoginButton= getValue("admin_login_button");
	
	
	
	public void putAdminLogin(String strAdminName, String strAdminPaswrd)
	{
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 adminLogin.sendKeys(strAdminName);
		 adminPassword.sendKeys(strAdminPaswrd);
		 adminLoginButton.click();
		 
    }
}
	




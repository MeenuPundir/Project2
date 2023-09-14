package providerLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class ProviderLoginPage extends BaseClass {
	WebElement providerLogin = getValue("provider_login");
	WebElement providerPassword = getValue("provider_password");
	WebElement providerLoginButton= getValue("provider_login_button");
	WebElement captcha=getValue("provider_captcha");
	
	public void putproviderLogin(String strProviderName, String strProviderPaswrd)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 providerLogin.sendKeys(strProviderName);
		 providerPassword.sendKeys(strProviderPaswrd);
		
}
	public void clickOnCaptcha(){
		captcha.click();
	}
	
	public void clickOnProviderLogin(){
		providerLoginButton.click();	
		
	}
	public void providerLoginButton(){
		this.clickOnProviderLogin();
	}
	
}

package userLogin;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class UserLogin extends BaseClass {

	WebElement username= getValue("username_signin_input");
	WebElement userpassword= getValue("password_signing_input");
	WebElement signin=getValue("signin_button");
	
	public void setUserName(String strUserName){
	username.sendKeys(strUserName);
	}
	
	public void setUserPassword(String strUserPassword){
		userpassword.sendKeys(strUserPassword);
	}
	
	public void clickSignIn(){
		signin.click();
	}
	
	
	public void UserLoginPage(String strUserName, String strUserPassword){
		this.setUserName(strUserName);
		this.setUserPassword(strUserPassword);
		this.clickSignIn();
	}
	
	
}

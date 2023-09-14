package homePage;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class HomePage extends BaseClass {

	WebElement loginMenu= getValue("login_menu");
	WebElement loginText= getValue("login_text");
	WebElement bookApptBtn= getValue("book_appt_btn");
	WebElement loginTextBox=getValue("login_text_box");
		
	public void clickLoginMenu(){
			loginMenu.click();
		}
			public void loginMenu(){
			this.clickLoginMenu();
			}
		

		public String setLoginText(){
		return loginText.getText();	
		}
		
		
		public void clickBookApptBtn(){
		bookApptBtn.click();
		}
		
			public void bookApptBtn(){
			this.clickBookApptBtn();
			}
			
		public void clickLoginTextBox() {
		loginTextBox.click();
		}
		
			public void loginTextBox(){
			this.clickLoginTextBox();
					
			}
}

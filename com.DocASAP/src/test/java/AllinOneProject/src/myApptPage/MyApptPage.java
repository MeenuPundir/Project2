package myApptPage;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class MyApptPage extends BaseClass {
	WebElement booknewapptButton= getValue("book_new_appt_button");
	
	public String BookNewApptButton(){
		return booknewapptButton.getText();
	}

}

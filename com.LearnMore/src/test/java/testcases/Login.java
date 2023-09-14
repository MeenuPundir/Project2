package testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.BaseClass;
import page.LoginPage;
	
	public class Login extends BaseClass {

		@Test
		public void loginapp() {

			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
			loginpage.loginToSaucedemo("standard_user", "secret_sauce");

		}

}

package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pageobject.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;

public class def extends Baseclass {

	Loginpage l;

	WebDriver driver;

	@Given("user Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		l = new Loginpage(driver);
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String emailid, String passwords) {
		l.enterEmail(emailid);
		l.enterPassword(passwords);
	}

	@When("Click on Login")
	public void click_on_login() {
		l.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) {

		String actualtitle = driver.getTitle();

		if (actualtitle.equals(exptitle)) {

			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

//	@When("User click on the log out link")
//	public void user_click_on_the_log_out_link() {
//		l.clickOnLogOutButton();
//	}

//	@Then("Close the Browser")
//	public void close_the_browser() {
//		driver.close();
//		driver.quit();
//	}

//Customr add

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		
		addNewCustPg.clickOnCustomersMenu();
		log.info("customer menu clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		addNewCustPg.clickOnCustomersMenuItem();
		log.info("customer menu item clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		addNewCustPg.clickOnAddnew();
		log.info("clicked on add new button.");

	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = addNewCustPg.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if (actualTitle.equals(expectedTitle)) {
			log.info("User can view Add new customer page- passed");

			Assert.assertTrue(true);// pass
		} else {
			log.info("User can view Add new customer page- failed");

			Assert.assertTrue(false);// fail
		}
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		addNewCustPg.enterEmail("cs129@gmail.com");
		// addNewCustPg.enterEmail(generateEmailId() + "@gmail.com");
		addNewCustPg.enterPassword("test1");
		addNewCustPg.enterFirstName("Prachi");
		addNewCustPg.enterLastName("Gupta");
		addNewCustPg.enterGender("Female");
		addNewCustPg.enterDob("6/13/1988");
		addNewCustPg.enterCompanyName("CodeStudio");
		addNewCustPg.enterAdminContent("Admin content");
		addNewCustPg.enterManagerOfVendor("Vendor 1");

		log.info("customer information entered");

	}

	@When("click on Save button")
	public void click_on_save_button() {
		addNewCustPg.clickOnSave();
		log.info("clicked on save button");

	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {

		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if (bodyTagText.contains(exptectedConfirmationMsg)) {
			Assert.assertTrue(true);// pass
			log.info("User can view confirmation message - passed");

		} else {
			log.warn("User can view confirmation message - failed");

			Assert.assertTrue(false);// fail

		}

	}

}

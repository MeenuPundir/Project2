package mouseEvents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import homePage.HomePage;
import baseClass.BaseClass;

public class MouseEvents extends BaseClass {
	HomePage objHomepage;
	
	@BeforeTest
	public void setup() throws IOException{
		System.out.println("Open Url");
		initialize();
		driver.get(CONFIG.getProperty("userSiteName"));
		objHomepage= new HomePage();
		
	}
	
	//@Test(enabled= false)
	@Test
	public void mouseHover(){
		WebElement forProviderLink	=driver.findElement(By.linkText("Log In"));
		Actions builder = new Actions(driver);
        Action mouseOver = builder.moveToElement(forProviderLink).build();
        mouseOver.perform(); 
        //driver.quit();
		
	}
	
	@Test
		public void mouseEvent() throws InterruptedException {
			//initialize();
			objHomepage.loginMenu();
			 objHomepage.loginTextBox();
			 
			 //WebElement loginTextBox;
	         WebElement abc	=driver.findElement(By.id("field-username"));
		       Actions builder = new Actions(driver);
		       Thread.sleep(2000);
		    //  Action seriesOfAction= builder.doubleClick(abc).build();
		       
		       Action seriesOfActions= builder.moveToElement(abc).click().keyDown(abc, Keys.SHIFT).sendKeys(abc, "meenu").keyUp(abc, Keys.SHIFT).doubleClick(abc).contextClick().build();
		    //  seriesOfAction.perform();
		       seriesOfActions.perform();
		        
		}
		
}

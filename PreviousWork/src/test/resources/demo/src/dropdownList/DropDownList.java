package dropdownList;

import homePage.HomePage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class DropDownList extends BaseClass {
	//create object of class HomePage 
HomePage objHomepage;

	public void setup() throws IOException{
		System.out.println("Open Url");
	}
		 
		public void dropDown() throws IOException {
			//call method
			 initialize();
				driver.get(CONFIG.getProperty("userSiteName"));
				objHomepage= new HomePage();
				objHomepage.clickBookApptBtn();
			
	   WebElement abc	=driver.findElement(By.xpath("//select[@id='dr_specialty_id']"));
	  //set timer to wait
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     
		    Select dropDown = new Select(abc);
		    List<WebElement> selected = dropDown.getOptions();
		    int values= selected.size();
		for(int i=0; i<values;i++ ){
			 String textValues= selected.get(i).getAttribute("textContent");
			 System.out.println(textValues);
			
		}     
		}
	         //Actions builder = new Actions(driver);

		
		

}
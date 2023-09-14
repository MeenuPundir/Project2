package grid2;
import homePage.HomePage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class DropDownList {
		static WebDriver driver = null;
		static String baseURl;
		static String nodeURl;
		@Test
		public void grid() throws Throwable {
			baseURl="http://test.docasap.com";
			nodeURl= "http://192.168.1.38:5555/wd/hub";
			DesiredCapabilities c1= DesiredCapabilities.firefox();
			c1.setBrowserName("firefox");
			//c1.setVersion("30.0");
			c1.setPlatform(Platform.VISTA);
			driver=new RemoteWebDriver(new URL(nodeURl),c1);
			driver.navigate().to("http://test.docasap.com");
			
			driver.manage().window().maximize();
			
			//use ajax 
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='btn-book btn-book-secondary']")));
			driver.findElement(By.xpath("//a[@class='btn-book btn-book-secondary']")).click();
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Doctor Specialty']")));
			WebElement doctorSpecialty=driver.findElement(By.xpath("//input[@placeholder='Doctor Specialty']"));
			doctorSpecialty.click();
			
			WebElement specialtyDropDown=driver.findElement(By.xpath("//select[@id='dr_specialty_id']"));
			 
			
			
			Select oSelect = new Select(specialtyDropDown);
			 List <WebElement> elementCount = oSelect.getOptions();
				int iSize = elementCount.size();
			 
				for(int i =1; i<iSize ; i++){
					String sValue = elementCount.get(i).getAttribute("textContent");
						System.out.println(sValue);
					}
				
		}
		

	}


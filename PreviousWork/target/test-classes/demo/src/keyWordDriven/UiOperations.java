package keyWordDriven;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiOperations {

	WebDriver driver;
	public UiOperations(WebDriver driver){
		this.driver = driver;
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
		//System.out.println("");
		switch (operation.toUpperCase()) {
		case "CLICK":
			//Perform click
			driver.findElement(this.getObject(p,objectName,objectType)).click();
			break;
		case "SETTEXT":
			//Set text on control
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			break;
			
		case "GOTOURL":
			//Get url of application
			driver.get(p.getProperty(value));
			break;
		
		case "GETTEXT":
			//Get text of an element
			driver.findElement(this.getObject(p,objectName,objectType)).getText();
			break;

		default:
			break;
		}
	}
	
	
	private By getObject(Properties p,String objectName,String objectType) throws Exception{
		//Find by xpath
		if(objectType.equalsIgnoreCase("XPATH")){
			
			return By.xpath(p.getProperty(objectName));
		}
		else
		{
			throw new Exception("Wrong object type");
		}
	}
}

package keyWordDriven;

import java.io.File;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class ExecuteTest {
   //WebDriver driver;
   
	@Test(priority=0)
	public void loginToAdmin() throws Exception {
		// TODO Auto-generated method stub
      WebDriver webdriver = new FirefoxDriver();
      KeyWorkXlFile file = new KeyWorkXlFile(); //create object of class ExcelFile
      ReadSheet object = new ReadSheet(); //create object of class ReadObject  
      Properties allObjects =  object.getObjectRepository();//call
      UiOperations operation = new UiOperations(webdriver);// create object of class UIOperations
        
        //Read keyword sheet
        Sheet exlSheet = file.readExcel(System.getProperty("user.dir")+"\\src\\config\\","TestCaseUsingKeyWords.xlsx" , "KeywordFramework");
      //Find number of rows in excel file
    	int rowCount = exlSheet.getLastRowNum()-exlSheet.getFirstRowNum();
    	//Create a loop over all the rows of excel file to read it
    	for (int i = 1; i < rowCount+1; i++) {
    		//Loop over all the rows
    		Row row = exlSheet.getRow(i);
    		//Check if the first cell contain a value, if yes, That means it is the new testcase name
    		if(row.getCell(0).toString().length()==0){
    		//Print testcase detail on console
    			System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
    			row.getCell(3).toString()+"----"+ row.getCell(4).toString());
    		//Call perform function to perform operation on UI
    			operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
    				row.getCell(3).toString(), row.getCell(4).toString());
    	    }
    		else{
    			//Print the new  testcase name when it started
    				System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
    			}
    		}
	

  
    } 
 

   } 




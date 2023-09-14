package excelSheet;

	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class ExcelSheet {
		static WebDriver driver=null;
		private XSSFRow row   =null;
		//static WebDriver FirefoxDriver=null;
	public Object[][] readData(){
		Object[][] cellData=null;
		
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(("user.dir")+"//src//config//TestCase.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("Regression"); ; 
	    int  totalRow,totalCol;
	    totalRow=sheet.getLastRowNum()-sheet.getFirstRowNum();
	    row= sheet.getRow(0);
	    totalCol=row.getLastCellNum()-row.getFirstCellNum();
	   
	    System.out.println("TotalRow="+totalRow+",  " +"TotalCol="+totalCol+"" );
			
	    cellData=new String[totalRow][totalCol];
	    
	    for (int i=0;i<totalRow;i++)
	    {
	       
	        for (int j=0;j<totalCol;j++){
	        	Row row = sheet.getRow(i+1);
	        	cellData[i][j]=row.getCell(j).toString();;
	          
	    }
	    
	    }
	    return cellData;
		                }


			
		}

	

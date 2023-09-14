//http://www.tutorialspoint.com/apache_poi/apache_poi_spreadsheets.htm

package testSuitWriteExcel;
 
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
	@Test
	public class Xcel {
		public static void writeInXl() throws Exception 
	   {
	      //Create blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook(); 
	      //Create a blank sheet
	      XSSFSheet spreadsheet = workbook.createSheet("Regression1");
	      //Create row object
	      XSSFRow row;
	      //This data needs to be written (Object[])
	      Map < String, Object[] > testcase = new TreeMap < String, Object[] >();
	      testcase.put( "1", new Object[] {"TestCase", "TestcaseName", "Status"});
	      testcase.put( "2", new Object[] {"Test_01", "Login", "Pass" });
	     
	      //Iterate over data and write to sheet
	      Set < String > keyid = testcase.keySet();
	      int rowid = 0;
	      for (String key : keyid){
	         row = spreadsheet.createRow(rowid++);
	         Object [] objectArr = testcase.get(key);
	         int cellid = 0;
	         for (Object obj : objectArr){
	            Cell cell = row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	         }}
	      //Write the workbook in file system
	      FileOutputStream out = new FileOutputStream(new File("./src/xcelOutputSheets/Writesheet.xlsx"));
	      workbook.write(out);
	     out.close();
	      System.out.println("Writesheet.xlsx written successfully" );
	   }
	}


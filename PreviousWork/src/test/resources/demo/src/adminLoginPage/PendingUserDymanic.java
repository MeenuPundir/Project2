package adminLoginPage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class PendingUserDymanic extends BaseClass {
	WebElement pendingUser= getValue("admin_pending_user");
	//To print list of all the pending users present there.
	public void clickPendingUserTab(){
		pendingUser.click();
		WebElement mytable=(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//table[@id='penddingUser']"))));
				//locate rows of table.
				List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
				
				//To calculate number of rows
				int rows_count = rows_table.size();

				//looping till the last row
				for (int row = 0; row < rows_count; row++) {
					
					// To locate columns(cells) of that specific row.
					List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
					
					// To calculate no of columns(cells) In that specific row.
					int columns_count = Columns_row.size();
					System.out.println("Number of cells In Row " + row + " is equal to "+ columns_count);

					// Loop will execute till the last cell of that specific row.
					for (int column = 0; column < columns_count; column++) {
						
						// To retrieve text from that specific cell.
						String celtext = Columns_row.get(column).getText();
						System.out.println("Cell Value Of row number " + row + " and column number " + column + " Is " + celtext);
					}
					System.out.println("...");
				}
			}
		
}

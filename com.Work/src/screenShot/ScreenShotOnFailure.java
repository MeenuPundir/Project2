package screenShot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import baseClass.BaseClass;

public class ScreenShotOnFailure extends TestListenerAdapter {
	WebDriver driver;
	  @Override
		public void onTestFailure(ITestResult tr) {
			//WebDriver driver;
		  if(tr.FAILURE == tr.getStatus())
          {
			try {
				driver = BaseClass.initialize();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
			String destDir = System.getProperty("user.dir")+"\\src\\snapShot";
			new File(destDir).mkdirs();
			String destFile = dateFormat.format(new Date()) + ".png";

	        try {
				FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
			Reporter.setEscapeHtml(false);
			Reporter.log("Saved <a href=../src/snapShot/" + destFile + ">Screenshot</a>");
		} 

}}

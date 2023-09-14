package dropdownList;

import homePage.HomePage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropMain {
	
	DropDownList objDropDownList;
	@BeforeTest
	public void setup(){
		System.out.println("Open Url");

}
	
	@Test
	public void execute() throws IOException{
		//Click on dropdown list to get all values  
		objDropDownList= new DropDownList();
		objDropDownList.dropDown();
		
}
}
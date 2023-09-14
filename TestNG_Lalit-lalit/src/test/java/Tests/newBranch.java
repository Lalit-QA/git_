/*To see log file go to project and refresh*/

package Tests;

import java.io.IOException;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.CheckBox;
import PageObjects.WelcomePage;
import TestComponents.BaseTest;
//import pageObjects.AmazonLandingPage;
//import pageObjects.AmazonLoginPage;
//import pageObjects.AmazonSignIn;
//import TestComponents.BaseTest;

public class newBranch extends BaseTest {

	
	public WebDriver driver;
	public CheckBox checkBox;
	
@BeforeTest
//public void initialise() throws IOException
public void launch_URL_on_Browser() throws IOException
{
	driver = launchBrowser();
	
	 	driver.get(prop.getProperty("url"));
	 
}


	
	@Test()
	/*
We are sending ,go and find data provider called get data so that it first goes into
data  provider and 
get the data and will use those data in text box
	 */
	public void click_Login_Button() throws InterruptedException 
	{
		System.out.println("i am in");
		checkBox = new CheckBox(driver);
		checkBox.getcheckBox1();
		
		

	
	}
	
	@AfterTest
	public void AfterScenario() throws IOException
	{
		
	//	driver.quit();
		
	}
	
}

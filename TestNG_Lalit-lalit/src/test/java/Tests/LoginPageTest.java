/*To see log file go to project and refresh*/

package Tests;

import java.io.IOException;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.WelcomePage;
import TestComponents.BaseTest;
//import pageObjects.AmazonLandingPage;
//import pageObjects.AmazonLoginPage;
//import pageObjects.AmazonSignIn;
//import TestComponents.BaseTest;

public class LoginPageTest extends BaseTest {

	
	public WebDriver driver;
	public WelcomePage welcomePage;
	public LoginPage loginPage;
	
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
		welcomePage = new WelcomePage(driver);
		welcomePage.clickLoginButton();
	
	}
	
	@Test()
	public void user_enters_valid_valid() throws InterruptedException {

		 loginPage = new LoginPage(driver);
		// Thread.sleep(5000);
		 loginPage.enterEmail("farragutglobal@aristanalytics.onmicrosoft.com");
		// Thread.sleep(5000);
		 loginPage.enterPassword("Farragut@123");

	}
	
	//@Test(priority = 3)
	public void click_signIN_Button() throws InterruptedException 
	{
		System.out.println("i am in");
		loginPage = new LoginPage(driver);
		loginPage.click_SignIn_Button();
		Thread.sleep(10000);
	
	}
	
	@AfterTest
	public void AfterScenario() throws IOException
	{
		
		//driver.quit();
		
	}
	
}

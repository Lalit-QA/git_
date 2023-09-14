/*To see log file go to project and refresh*/

package Tests;

import java.io.IOException;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestComponents.BaseTest;
//import pageObjects.AmazonLandingPage;
//import pageObjects.AmazonLoginPage;
//import pageObjects.AmazonSignIn;
//import TestComponents.BaseTest;

public class gitPractise extends BaseTest {
/*
 Now with the help of extends ,all the methods written in base can be call here in this block
 */
	
	public WebDriver driver;
//will help to close the browser as test case executed bec. it all the driver of this class
//point to the above driver first
	
	//public static Logger log = LogManager.getLogger(base.class.getName());
	/* code for getting logfile - paste above code in every test case*/
	
@BeforeTest
//before test for url  and after test to close browser
//Note – paste aftertest and beforetest in every test cases
public void initialise() throws IOException
{
	driver = launchBrowser();
//	log.info("Driver is initialized");
	
	 	driver.get(prop.getProperty("url"));
	// 	log.info("Navigated to HomePAge");
		/*
As we need to invoke the browser for multiple data i.e restriced and non restriced to that page 
should be invoke twice therefore paste url back into test annotation
*/
	 
}


	
	@Test()
	/*
We are sending ,go and find data provider called get data so that it first goes into
data  provider and 
get the data and will use those data in text box
	 */
	public void signIN() throws IOException
	{
		System.out.println("i am in");
		
		System.out.println("git Second version");
		
//		Listeners lk=new Listeners(driver);
//	AmazonLandingPage l=new AmazonLandingPage(driver);
//	
//	AmazonLoginPage lp=l.getLogin(); 
//	lp.getEnterMobileNo().sendKeys("7038340485");
//	lp.getcontin().click();
//	
//	AmazonSignIn lr=lp.getPassword();
//	lr.getPassword().sendKeys("Lalit@123");
//	lr.getLogin().click();
//	
//	
//	log.info("User Login Successfully");
//	
	}
	
}

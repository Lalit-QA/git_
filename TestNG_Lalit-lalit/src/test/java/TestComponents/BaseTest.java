package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	/*
	 * in Selenium Base class is the main class which takes care of Browser setup,
	 * loading configuration file and other reusable methods like screenshot,
	 * handling sync issues and many more. With base class you can avoid code
	 * duplication and can reuse the code as much you want. Base Class works with
	 * Selenium in following manner:
	 * 
	 * When we create base class and if TestCases extends BaseClass then we can use
	 * all the methods of Baseclass.
	 * 
	 * Before calling actual @Test, Base class methods will get executed and Depends
	 * on annotations it will call the respective methods.
	 * 
	 * We can extend this class in all test cases and we can call custom methods as
	 * well directly.
	 */

	public WebDriver driver;
	/*
	 * (best practice ) Don’t create driver object inside the code ,always define in
	 * global level variable In this way we can create driver object only once and
	 * we using it for all browser If we write inside block so we need to use driver
	 * object for every block and scope of object(driver) will only inside loop and
	 * we need to create driver object for every block And will also help to create
	 * implicit wait or other wait for 100 of test cases reffering that driver And
	 * then return to driver
	 */

	public Properties prop;
	/*
	 * Method is defined in global level so that it can access throughout that class
	 * and when we use extends in other class it access all the method of base class
	 * which is public
	 */
	// properties should be available at public for across all the classes

	public WebDriver launchBrowser() throws IOException /* to launch driver */
	{

		/*
		 * Properties prop= new Properties();
		 * 
		 * Prop object/properties file is responsible to pull the file from
		 * data.properties But the prop file don’t have the knowledge of data.properties
		 * So there is method called prop.load , this is method takes fis as argument
		 * and fis has the knowledge about path And prop.getProperty ,browser value will
		 * be printed ,so this way we connected the data.properties file to base file
		 * Put prop.getProperty into variable called browserName
		 * 
		 */

		prop = new Properties();
		/*
		 * Prop object/properties file is responsible to pull the file from
		 * data.properties But the prop file don’t have the knowledge of data.properties
		 * So there is method called prop.load , this is method which takes fis as
		 * argument and fis has the knowledge about path And prop.getProperty ,browser
		 * value will be printed ,so this way we connected the data.properties file to
		 * base file Put prop.getProperty into variable called browserName
		 * 
		 */

//FileInputStream fis=new FileInputStream("D:\\Lalit_TestNG_Framework\\TestNGFramework\\src\\main\\java\\Resources\\data.properties");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//Resources//data.properties");

		prop.load(fis);
		/*
		 * So there is method called prop.load , this is method takes fis as argument
		 * and fis has the knowledge about path
		 */

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		/*
		 * And prop.getProperty ,browser value will be printed ,so this way we connected
		 * the data.properties file to base file Put prop.getProperty into variable
		 * called browserName
		 */

		/*
		 
		 */

		if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\Lalit_TestNG_Framework\\TestNGFramework\\src\\test\\resources\\chromedriverVersion116.exe");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//resources//chromedriverVersion116.exe");
			driver = new ChromeDriver();
			/*
			 * (best practice ) Don’t create driver object inside the code ,always define in
			 * global level variable
			 */

			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src/test//resources//geckodriver.exe");
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "//src/test//resources//msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		return driver;
		/**/

	}
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+ "\\reports\\" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+ "\\reports\\" + testCaseName + ".png";
	}

//	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		/*
//		 * Source is virtual location therefore to store in our local machine we use
//		 * fileutils
//		 */
//
//		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
//		/*
//		 * 1.user.dir ----> Give the location of current project path 2.reports ---- >
//		 * in report folder we have sceenshot 3.testcasename ----> test case screenshot
//		 * name dynamically in run time
//		 */
//		/* It is the path where screenshot is captured and return this. */
//
//		FileUtils.copyFile(source, new File(destinationFile));
//		return destinationFile;
//		/*
//		 * Why we are returning this because this method expect path of screenshot And
//		 * change return type to string
//		 */

	}



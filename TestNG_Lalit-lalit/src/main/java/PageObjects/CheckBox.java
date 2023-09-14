package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

//public class WelcomePage extends AbstractComponent {

public class CheckBox extends AbstractComponent {
	WebDriver driver;

	public CheckBox(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='checkBoxOption1']")
	////input[@id='checkBoxOption1']
	WebElement checkBox1;
	
	@FindBy(xpath = "//input[@name=\"radioButto\"]")
	////input[@id='checkBoxOption1']
	WebElement checkBox12;
	
	//input[@name="radioButton"]

	// By welcomeTitle = By.xpath("//h1[normalize-space()='Welcome to Arist']");

	public void getcheckBox1() throws InterruptedException {
		checkBox1.click();
		// Thread.sleep(2000);
		// waitForElementToAppear(welcomeTitle);
		//explictWait(loginButton);
//		for (int i = 0; i <= 2; i++) {
//			try {
//				checkBox1.click();
//				break;
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			// LoginPage loginPage = new LoginPage(driver);
//			// return loginPage;
//		}
	}
	
	public void getcheckBox2() throws InterruptedException {
		checkBox12.click();
		// Thread.sleep(2000);
		// waitForElementToAppear(welcomeTitle);
		//explictWait(loginButton);
//		for (int i = 0; i <= 2; i++) {
//			try {
//				checkBox1.click();
//				break;
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			// LoginPage loginPage = new LoginPage(driver);
//			// return loginPage;
//		}
	}
}

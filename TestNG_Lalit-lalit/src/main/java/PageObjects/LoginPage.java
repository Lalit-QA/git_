package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

//public class WelcomePage extends AbstractComponent {

public class LoginPage extends AbstractComponent {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "(.button-variant-red.landing-page-login-btn")
	WebElement loginButton;
	
	@FindBy(css = "#signInName")
	WebElement emailTextbox;
	
	@FindBy(css = "#password")
	WebElement passwordTextbox;
	
	@FindBy(xpath = "//button[@id='next']")
	WebElement signInButton;
	

	// By welcomeTitle = By.xpath("//h1[normalize-space()='Welcome to Arist']");

	public void click_Login_Button() throws InterruptedException {
		// Thread.sleep(2000);
		// waitForElementToAppear(welcomeTitle);
		//explictWait(loginButton);
		for (int i = 0; i <= 2; i++) {
			try {
				loginButton.click();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}}
			// LoginPage loginPage = new LoginPage(driver);
			// return loginPage;
		}
		
		public void enterEmail(String Email) throws InterruptedException {
		   // Thread.sleep(1000);
		    emailTextbox.sendKeys(Email);	          
	    }
		
		public void enterPassword(String Password) throws InterruptedException {
	    	// Thread.sleep(1000);
	    	 passwordTextbox.sendKeys(Password);
		}
		
		public void click_SignIn_Button() throws InterruptedException {
			//explictWait(signInButton);
			Thread.sleep(50000);
			signInButton.click();
			Thread.sleep(50000);
			// Thread.sleep(2000);
			// waitForElementToAppear(welcomeTitle);
			//explictWait(signInButton);
//			for (int i = 0; i <= 2; i++) {
//				try {				
//					signInButton.click();
//					Thread.sleep(5000);
//					break;
//				} catch (Exception e) {
//					System.out.println(e);
//				}}
				// LoginPage loginPage = new LoginPage(driver);
				// return loginPage;
			}
		
}
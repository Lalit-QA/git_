package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

//public class WelcomePage extends AbstractComponent {

public class WelcomePage extends AbstractComponent {
	WebDriver driver;

	public WelcomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='button-variant-red landing-page-login-btn']")
	WebElement loginButton;

	// By welcomeTitle = By.xpath("//h1[normalize-space()='Welcome to Arist']");

	public void clickLoginButton() throws InterruptedException {
		// Thread.sleep(2000);
		// waitForElementToAppear(welcomeTitle);
		//explictWait(loginButton);
		for (int i = 0; i <= 2; i++) {
			try {
				loginButton.click();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
			// LoginPage loginPage = new LoginPage(driver);
			// return loginPage;
		}
	}
}

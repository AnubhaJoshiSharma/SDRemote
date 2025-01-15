package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestDataReader;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("Login page initialized with driver"+ this.driver);
	}
	
	@FindBy(id="user-name")
	WebElement loginname;
	@FindBy(id="password")
	WebElement loginpwd;
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public void enterUname() {
		loginname.sendKeys(TestDataReader.readLoginName(1, 0));
	}
	
	public void enterPwd() {
		loginpwd.sendKeys(TestDataReader.readPassword(1, 1));
	}
	public void clickLogin() {
		loginbutton.click();
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ReUsableMethods;
import utilities.TestDataReader;

public class LoginPage {
	WebDriver driver;
	ReUsableMethods reuse;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("Login page initialized with driver"+ this.driver);
		 reuse = new ReUsableMethods(driver);
	}
	
	@FindBy(id="user-name")
	WebElement loginname;
	@FindBy(id="password")
	WebElement loginpwd;
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public void enterUname() {
		reuse.checkElementVisible(loginname);
		loginname.sendKeys(TestDataReader.readLoginName(1, 0));
	}
	
	public void enterPwd() {
		reuse.checkElementVisible(loginpwd);
		loginpwd.sendKeys(TestDataReader.readPassword(1, 1));
	}
	public void clickLogin() {
		reuse.checkElementVisible(loginbutton);
		loginbutton.click();
	}
}

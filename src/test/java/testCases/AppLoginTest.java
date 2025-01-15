package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ConfigReader;

public class AppLoginTest extends BaseClass {
	LoginPage lp;
	String username = "standard_user";
	String pwd = "secret_sauce";
 	
	@Test
  public void validateSuccessfulLogin() {
	 driver.get(ConfigReader.readAppUrl());
	 lp=PageFactory.initElements(driver, LoginPage.class);
	 lp.enterUname(username);
	 lp.enterPwd(pwd);
	 lp.clickLogin();
	  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("Issue with login "+ e.getMessage());
		}
	  System.out.println("Login successful");
  }
	  
}

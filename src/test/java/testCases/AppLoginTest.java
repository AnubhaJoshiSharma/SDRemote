//Login test

package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;

public class AppLoginTest extends BaseClass {
	LoginPage lp;
	
	@Test
  public void validateSuccessfulLogin() {
	System.out.println("Thread info"+ Thread.currentThread().getId());
	 lp=PageFactory.initElements(driver, LoginPage.class);
	 lp.enterUname();
	 lp.enterPwd();
	 lp.clickLogin();
	 
	 	  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("Issue with login "+ e.getMessage());
		}
	  System.out.println("Login successful");
  }
	  
}

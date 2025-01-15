package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.ConfigReader;

public class AppLoginTest extends BaseClass {
	String username = "standard_user";
	String pwd = "secret_sauce";
  @Test
  public void validateSuccessfulLogin() {
	// driver.get(baseUrl);
	 driver.get(ConfigReader.readAppUrl());
	 System.out.println("Debug t1");
	 driver.findElement(By.id("user-name")).sendKeys(username);
	 driver.findElement(By.id("password")).sendKeys(pwd);
		  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("Issue with login "+ e.getMessage());
		}
	  driver.findElement(By.id("login-button")).click();
	  System.out.println("Login successful");
  }
	  
}

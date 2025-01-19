package testNGRevise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITestResultDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  Assert.assertTrue(false);  
  }
  @AfterMethod
  public void cleanUp(ITestResult itr) {
	  if(itr.getStatus()==ITestResult.FAILURE) {
		  System.out.println("Test method failed--->"+ itr.getName());
		  System.out.println(itr.getMethod().getMethodName().getClass());
	 }
	  
	  driver.quit();
  }
}

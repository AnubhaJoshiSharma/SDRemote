package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsCatalog;

public class AddProductTest extends BaseClass {
	LoginPage lp;
	ProductsCatalog pc;
	
  @Test
  public void addProduct() throws InterruptedException {
	  System.out.println("Thread info"+ Thread.currentThread().getId());
	  lp = PageFactory.initElements(driver, LoginPage.class);
	  pc = PageFactory.initElements(driver, ProductsCatalog.class);
	  lp.enterUname();
	  lp.enterPwd();
	  lp.clickLogin();
	  pc.addRedShirt();
	  pc.clickCartIcon();
	  Thread.sleep(3000);
  }
}

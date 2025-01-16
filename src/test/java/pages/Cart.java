package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
	WebDriver driver;
	
	public Cart(WebDriver driver) {	
			this.driver=driver;
	}
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeitem;
}

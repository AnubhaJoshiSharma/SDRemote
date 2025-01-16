package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUsableMethods {
	WebDriver driver;
	 WebDriverWait wait;
	public ReUsableMethods(WebDriver driver) {
		this.driver = driver;
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	
	public  void checkElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}

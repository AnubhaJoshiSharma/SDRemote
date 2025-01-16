package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ReUsableMethods;

public class ProductsCatalog {
	WebDriver driver;
	ReUsableMethods reuse;
	
	public ProductsCatalog(WebDriver driver) {
		this.driver = driver;
		reuse = new ReUsableMethods(driver);
		}
	
	@FindBy(xpath="//span[text()='Products']")
	WebElement products_label;
		
	@FindBy(xpath="//div[contains(text(),'T-Shirt (Red)')]")
	WebElement redshirt;
	
	@FindBy(xpath="//button[contains(@data-test,'allthethings()-t-shirt-(red)')]")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement gotocart;
	
	public void addRedShirt() {
		reuse.checkElementVisible(addtocartbutton);
		addtocartbutton.click();
	}
	public void clickCartIcon() {
		gotocart.click();
	}
}


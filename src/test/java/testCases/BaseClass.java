package testCases;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ConfigReader;

public class BaseClass {
	WebDriver driver;
	//protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@BeforeClass
	public void setUpAUT() {
		String browserType = ConfigReader.readBrowserName();
		if(browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browserType.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else {
			System.out.println("Issue with the browser type provided");
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 driver.get(ConfigReader.readAppUrl());
		 }
	
	@AfterClass
	  public void cleanUpAUT() {
		  driver.quit();
		 // driver.remove();
	  }

}

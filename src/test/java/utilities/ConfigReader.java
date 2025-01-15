package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public  class ConfigReader {
	static File file = new File("./config/configs.properties");
	static Properties prop;
	public static String readBrowserName() {
		
		try {
			FileInputStream fis = new FileInputStream(file);
			 prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Issues with reading config file");
		}
	String browserName = prop.getProperty("browsername");
	return browserName;
	}
	public static String readAppUrl() {
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
		
		} catch (Exception e) {
		System.out.println("Issues with reading config file");
		}
	String appurl = prop.getProperty("appUrl");
		return appurl;
	}
	

}

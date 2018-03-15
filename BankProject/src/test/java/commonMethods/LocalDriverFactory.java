package commonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverFactory {
	
	public static WebDriver driver = null;
	
	static WebDriver createInstance(String browseName){
		
		
		if(browseName.toLowerCase().equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium 18 March\\Selenium_jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}

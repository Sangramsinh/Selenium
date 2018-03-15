package commonMethods;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver = null;
	String browserName = null;
	String baseURL = null;
	String fileName = "config.properties";
	GetPropertyValue getPropValue = new GetPropertyValue();
	
	@BeforeSuite
	public void initializeBrowser(){
		browserName = getPropValue.getPropertyValues(fileName, "browserName");
		
		driver = LocalDriverFactory.createInstance(browserName);
	}
	
	@BeforeMethod
	public void goToURL(){
		baseURL = getPropValue.getPropertyValues(fileName, "baseURL");
		driver.get(baseURL);
	}
	
	@AfterMethod
	public void afterMethod(){
		
	}
	
	@AfterSuite
	public void closeBrowser(){
		
	}
}
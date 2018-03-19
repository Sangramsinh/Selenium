package actions.home_Page_Action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import componentFunctions.GetPropertyValue;

public class Home_Page_Action {
	WebDriver driver = null;
	GetPropertyValue getPropValue = new GetPropertyValue();
	String fileName = "config.properties"; 
			
	public Home_Page_Action(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyHomePageTitle(){
		Assert.assertEquals(driver.getTitle(), getPropValue.getPropertyValues(fileName, "homePageTitle"));
	}

}
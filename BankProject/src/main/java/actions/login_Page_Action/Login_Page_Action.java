package actions.login_Page_Action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commonMethods.GetPropertyValue;

public class Login_Page_Action {
	
	public WebDriver driver = null;
	GetPropertyValue getPropValue = new GetPropertyValue();
	
	public Login_Page_Action(WebDriver driver){
		this.driver = driver;
	}
	
	void verifyLoginPageTitle(String fileName){
		Assert.assertEquals(driver.getTitle(), getPropValue.getPropertyValues(fileName, "loginPageTitle"));
		System.out.println("Login page verified");
	}
}
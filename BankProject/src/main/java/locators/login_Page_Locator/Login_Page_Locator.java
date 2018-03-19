package locators.login_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Locator {
  
	public WebDriver driver = null;
	
	public Login_Page_Locator(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(name = "uid")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement loginButton;
	
	@FindBy(name = "btnReset")
	WebElement resetButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton(){
		return loginButton;
	}
	
}

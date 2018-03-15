package verifications.loginPageVerification;

import org.openqa.selenium.WebDriver;

public class Login_Page_Verification {

	public WebDriver driver = null;
	Login_Page_Action loginPA = null;
	
	public Login_Page_Verification(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyLogin(){
		loginPA = new Login_Page_Action(driver);
		loginPA.verifyLoginPageTitle();
		
	}
	
}

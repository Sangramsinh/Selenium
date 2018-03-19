package verifications.loginPageVerification;

import org.openqa.selenium.WebDriver;

import actions.login_Page_Action.Login_Page_Action;
import verifications.home_Page_Verification.Home_Page_Verification;

public class Login_Page_Verification {

	public WebDriver driver = null;
	Login_Page_Action loginPA = null;
	
	public Login_Page_Verification(WebDriver driver){
		this.driver = driver;
	}
	
	public Home_Page_Verification verifyLogin(){
		Home_Page_Verification homePV = null;
		loginPA = new Login_Page_Action(driver);
		loginPA.verifyLoginPageTitle();
		loginPA.verifyUserNameIsNull();
		loginPA.enterUserName();
		loginPA.verifyUserName();
		loginPA.verifyPasswordIsNull();
		loginPA.enterPassword();
		loginPA.verifyPassword();
		loginPA.loginButtonClick();
		homePV = new Home_Page_Verification(driver);
		return homePV;
	}
	
}

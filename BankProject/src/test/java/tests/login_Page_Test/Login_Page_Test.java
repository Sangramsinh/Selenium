package tests.login_Page_Test;

import org.testng.annotations.Test;

import componentFunctions.BaseClass;
import componentFunctions.GetPropertyValue;
import verifications.home_Page_Verification.Home_Page_Verification;
import verifications.loginPageVerification.Login_Page_Verification;

public class Login_Page_Test extends BaseClass {
  Login_Page_Verification loginPV = null;
  String fileName = "config.properties";
  GetPropertyValue getPropValue = new GetPropertyValue();
  
	@Test(priority = 0)
  public void successfullLogin() {
		loginPV = new Login_Page_Verification(driver);
		Home_Page_Verification homePV =  loginPV.verifyLogin();
		
		homePV.verifyHomePageTitle();
  }
	
	@Test(priority = 1)
	public void unsuccessfullLoginInvalidUserName(){
		loginPV = new Login_Page_Verification(driver);
		loginPV.verifyInvalidUserName();
	}
	
	@Test(priority = 2)
	public void unsuccessfullLoginInvalidPassword(){
		loginPV = new Login_Page_Verification(driver);
		loginPV.verifyInvalidPassword();
	}
	
	@Test(priority = 3)
	public void unsuccessfullLoginInvalidUserNameAndPassword(){
		loginPV = new Login_Page_Verification(driver);
		loginPV.verifyInvalidUserNameAndPassword();
	}
}

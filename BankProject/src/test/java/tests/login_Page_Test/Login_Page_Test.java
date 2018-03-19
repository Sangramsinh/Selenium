package tests.login_Page_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import componentFunctions.BaseClass;
import componentFunctions.GetPropertyValue;
import verifications.home_Page_Verification.Home_Page_Verification;
import verifications.loginPageVerification.Login_Page_Verification;

public class Login_Page_Test extends BaseClass {
  Login_Page_Verification loginPV = null;
  String fileName = "config.properties";
  GetPropertyValue getPropValue = new GetPropertyValue();
  
	@Test
  public void successfullLogin() {
		loginPV = new Login_Page_Verification(driver);
		Home_Page_Verification homePV =  loginPV.verifyLogin();
		
		homePV.verifyHomePageTitle();
  }
}

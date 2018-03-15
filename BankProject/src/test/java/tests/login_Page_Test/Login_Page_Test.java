package tests.login_Page_Test;

import org.testng.annotations.Test;

import componentFunctions.BaseClass;
import verifications.loginPageVerification.Login_Page_Verification;

public class Login_Page_Test extends BaseClass {
  Login_Page_Verification loginPV = null;
  
	@Test
  public void successfullLogin() {
		loginPV = new Login_Page_Verification(driver);
		loginPV.verifyLogin();
  }
}

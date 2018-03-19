package verifications.home_Page_Verification;

import org.openqa.selenium.WebDriver;

import actions.home_Page_Action.Home_Page_Action;

public class Home_Page_Verification {

	WebDriver driver = null;
	Home_Page_Action homePA = null;
	public Home_Page_Verification(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyHomePageTitle(){
		homePA =new  Home_Page_Action(driver);
		homePA.verifyHomePageTitle();
	}
	
}

package componentFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LocalDriverFactory {
	
	public static WebDriver driver = null;
	
	static WebDriver createInstance(String browseName){
				
		if(browseName.toLowerCase().equals("firefox")){
			
			/*FirefoxProfile myFirefoxProfile = new FirefoxProfile(new File("C:\\Users\\hp\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\lfqjzjwv.Selenium")); 
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(myFirefoxProfile);		*/	

			/*ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myFirefoxProfile = profile.getProfile("Selenium");
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(myFirefoxProfile);
			*/
			
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium 18 March\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
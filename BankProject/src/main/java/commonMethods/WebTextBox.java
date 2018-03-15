package commonMethods;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
	public static boolean enterKeys(WebElement ele,String inputToEnter){
		boolean isEntered = false;
		if(ele != null){
			ele.sendKeys(inputToEnter);
			isEntered = true;
		}
		else
			System.out.println("Element is null");
		return isEntered;
	}

}

package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import execution.Execute;
import page.login;

public class Test {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		PageFactory.initElements(driver, login.class);
		
		Execute.LunchBrowser("browser");
		
		login.SendValue();
		
		
		
	}

}

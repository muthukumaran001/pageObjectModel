package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import execution.Execute;

public class login extends Execute {
	
	WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
		
	}
	
	/*By mailID = By.id("email");
	By password = By.name("pass");
	By Login = By.id("u_0_b");*/
	
	@FindBy(id = "email")
	static 
	WebElement mailID;
	
	@FindBy(id = "pass")
	static
	WebElement password;
	
	@FindBy(id = "u_0_b")
	static
	WebElement Login;
	
	public static WebElement getMail() {
		return mailID;
	}


	public static WebElement getPassword() {
		return password;
	}


	public static WebElement getLogin() {
		return Login;
	}


	public static void SendValue( ) {
		
		getMail().sendKeys("muthukumarank36@gmail.com");
		getPassword().sendKeys("MuthuKumaran@123");
		getLogin().click();
		
		
	
		
		
		
		

	}


	

}

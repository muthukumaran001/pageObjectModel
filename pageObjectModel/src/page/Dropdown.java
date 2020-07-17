package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
	
			
			WebElement day = driver.findElement(By.id("day"));
			Select select = new Select(day);
			select.selectByValue("19");
			
			WebElement month = driver.findElement(By.id("month"));
			Select select1 = new Select(month);
			select1.selectByVisibleText("Nov");
			
			WebElement year = driver.findElement(By.id("year"));
			Select select2 = new Select(year);
			select2.selectByIndex(25);
			
		}

}


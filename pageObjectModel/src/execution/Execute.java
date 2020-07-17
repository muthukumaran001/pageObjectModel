package execution;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Execute {
	
	static WebDriver driver;
	
	public static String readFile(String key) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("./configuration/config.properties"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key); 

	}
	
	public static WebDriver LunchBrowser(String key) {
		
		String browser = readFile(key);
		
		switch (browser.toUpperCase()) {
		case "CHROME":
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "IE":
			
			System.setProperty("webdriver.ie.driver", "./driver/IEDriver.exe");
			driver= new InternetExplorerDriver();
			break;
		case "FIREFOX":
			
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver= new FirefoxDriver();
			break;
			
				default:
			throw new IllegalArgumentException("Unexpected value: " + browser.toUpperCase());
		}
		
			driver.get(readFile("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			return driver;
	}

}

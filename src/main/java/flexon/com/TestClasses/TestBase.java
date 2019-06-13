package flexon.com.TestClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	WebDriver driver;
	
	@BeforeTest
	public void intialzeThis() throws IOException{
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("/Users/kunaljuneja/Desktop/Flexon Training/BasicFramework/src/main/java/Resources/utilities.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("webBrowser");
		String urlName = prop.getProperty("URL");
		int waitTime = Integer.parseInt(prop.getProperty("implicitWaitTime"));
		
		if(browserName.contains("chromeG")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/kunaljuneja/desktop/automation/chromedriver");
			driver = new ChromeDriver();
			
			driver.get(urlName);
			
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			
		}
		else if(browserName.contains("fireFox")) { 
			
			System.setProperty("webdriver.gecko.driver", "/Users/kunaljuneja/desktop/automation/geckodriver");
			driver = new FirefoxDriver();
			
			driver.get(urlName);
			
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			
		}
		
	}
    @AfterTest
      public void closeThis() throws IOException{
	           driver.quit();
 }


}

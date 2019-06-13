package flexon.com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement passCode;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement login;
	
	
	public void signIn() {
		
		login.click();
		
	}
	
	
	
	

}

package flexon.com.TestClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;


import flexon.com.Pages.Login;

public class TestCases extends TestBase {
	
	
	@Test(priority=1,dataProvider="newdata")
	public void enterUnamepass(String username,String passCode) throws Exception{
		Login f = PageFactory.initElements(driver,Login.class);
		f.username.sendKeys(username);
		f.passCode.sendKeys(passCode);
		f.signIn();		
	}
	@DataProvider(name="newdata")
	public Object[][] getdata(){
		Object[][] data = new Object[1][2];
		data[0][0]="Kunal@gmail.com";
		data[0][1]="Kunal";
		
		
		return data;
		
	}
	

}

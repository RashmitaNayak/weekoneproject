package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.ELTC_072DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_072POM;
import com.training.pom.LoginPOM;
import com.training.pom.LogoutPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_072Test {
	//login as admin and creates multiple users
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_072POM eltc072POM;
	
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		loginPOM = new LoginPOM(driver); 
		eltc072POM = new ELTC_072POM(driver);
		/*Actions action =new Actions(driver);*/
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	
	/*@AfterTest
	public void close() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	
	@Test(dataProvider ="exceldata-inputs", dataProviderClass = ELTC_072DataProviders.class)
	public void subscribeTest(String val1,String val2,String val3,String val4,String val5,String val6,String val7) throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("first");
		eltc072POM.clickAddusernamelink();
		eltc072POM.enterFirstname(val1);
		Thread.sleep(3000);
		eltc072POM.enterLastname(val2);
		eltc072POM.enterEmailid(val3);
		eltc072POM.enterPhoneno(val7);
		eltc072POM.enterLogin(val4);
		Thread.sleep(3000);

		eltc072POM.clickRadiobutton();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		eltc072POM.enterPassword(val5);
		eltc072POM.ClickProfileDropDown();
		eltc072POM.enterProfile(val6);
		eltc072POM.clickAddbtn();
		eltc072POM.clickDropdownicon();
		eltc072POM.clickLogoutbtn();
		screenShot.captureScreenShot("fifteen");

}
}
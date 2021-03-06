package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LostpasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Lostpassword {
	private WebDriver driver;
	private String baseUrl;
    private LostpasswordPOM lostpasswordPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		//clicks on lost password link and sends mail for resetting password after entering the valid mail id
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		lostpasswordPOM = new LostpasswordPOM(driver); 
		
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	
	@AfterTest
	public void manTest() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void lostpasswordTest() {
		
		lostpasswordPOM.clickIlostpasswordlink();
		lostpasswordPOM.enterValidemailid("manzoor@gmail.com");
		lostpasswordPOM.clickSendmessagebtn();
        screenShot.captureScreenShot("Third");
	}

}

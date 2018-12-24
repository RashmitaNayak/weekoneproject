package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.EditProfilePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class EditprofileTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private EditProfilePOM editprofilePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		editprofilePOM = new EditProfilePOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	
	@AfterTest
	public void close() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void editprofileTest() {
		loginPOM.sendUserName("manzoor");
		loginPOM.sendPassword("mehadim");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("first");
		editprofilePOM.clickHomepageBtn();
		editprofilePOM.clickProfileBtn();
		editprofilePOM.clickEditprofileBtn();
        editprofilePOM.changePassword("mehadim");
        editprofilePOM.enterNewpassword("mehadi");
        editprofilePOM.confirmNewpassword("mehadi");
        editprofilePOM.clickSavesettingsBtn(); 
		screenShot.captureScreenShot("Second");
	}
}

 
  


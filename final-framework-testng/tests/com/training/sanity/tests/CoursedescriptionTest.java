package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CoursedescriptionPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CoursedescriptionTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CoursedescriptionPOM coursedescriptionPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		loginPOM = new LoginPOM(driver); 
		coursedescriptionPOM = new CoursedescriptionPOM(driver);
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
	
	@Test
	public void subscribeTest() throws InterruptedException {
		loginPOM.sendUserName("manzoor");
		loginPOM.sendPassword("mehadi");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("first");
		coursedescriptionPOM.clickMycoursesBtn();
		System.out.println("coursebtn");
	
		coursedescriptionPOM.clickTestingBtn();
		System.out.println("testing");
		Thread.sleep(2000);
		coursedescriptionPOM.clickCoursedescriptionlink();
         
		screenShot.captureScreenShot("Fifth");
	}


}

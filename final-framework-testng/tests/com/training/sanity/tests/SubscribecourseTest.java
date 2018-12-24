package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.interactions.Actions;*/
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.SubscribePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SubscribecourseTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private SubscribePOM subscribePOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private  JavascriptExecutor js;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		js = (JavascriptExecutor) driver;
		loginPOM = new LoginPOM(driver); 
		subscribePOM = new SubscribePOM(driver);
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
		subscribePOM.clickMycoursesBtn();
		System.out.println("coursebtn");
	
		subscribePOM.clickCoursescataloglink();
		System.out.println("coursecataloglink");
		Thread.sleep(2000);
        subscribePOM.enterValueinsearchbox("testing");
        Thread.sleep(2000);
        System.out.println("entervalue");
        Thread.sleep(2000);
        subscribePOM.clickSearchbtn();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)");
        subscribePOM.clickSubscribebtn(); 
		screenShot.captureScreenShot("Fourth");
	}

}

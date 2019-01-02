package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DiscussforumPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DiscussforumTest {
	//testcase-ELTC_044
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private DiscussforumPOM discussforumPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private  JavascriptExecutor js;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		//
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		js = (JavascriptExecutor) driver;
		loginPOM = new LoginPOM(driver); 
		discussforumPOM = new DiscussforumPOM(driver);
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
		discussforumPOM.clickLearnseleniumlink2();
		System.out.println("coursebtn");
		Thread.sleep(2000);
		discussforumPOM.clickForumicon();
		Thread.sleep(5000);
		discussforumPOM.clickGroupname();
		System.out.println("lernseleniumlink");
		Thread.sleep(5000);
		discussforumPOM.clickCreatethreadicon();
        Thread.sleep(2000);
        System.out.println("testicon");
        Thread.sleep(2000);
        discussforumPOM.enterThreadtitle("test");
        Thread.sleep(8000);
        discussforumPOM.writeThreadpostbox();
        Thread.sleep(2000);

        discussforumPOM.clickCreatethreadbtn();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)");
         
		screenShot.captureScreenShot("eleventh");
	}



}

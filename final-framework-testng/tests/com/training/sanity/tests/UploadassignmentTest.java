package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UploadassignmentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UploadassignmentTest {
	//To verify whether the application allows the student to take the authored assignment testcase-ELTC_043
		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private UploadassignmentPOM uploadassignmentPOM;
		private static Properties properties;
		private ScreenShot screenShot;
		private  JavascriptExecutor js;

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			//subscribes selected course
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			
			
			
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			js = (JavascriptExecutor) driver;
			loginPOM = new LoginPOM(driver); 
			uploadassignmentPOM = new UploadassignmentPOM(driver);
		
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
			uploadassignmentPOM.clickLearnseleniumlink2();
			System.out.println("courselink");
			Thread.sleep(2000);
			
			uploadassignmentPOM.clickAssignmenticon();
			System.out.println("assignmenticon");
			Thread.sleep(2000);
			uploadassignmentPOM.clickAssignmentlink();
			Thread.sleep(2000);
		    System.out.println("assignmentlink");
			Thread.sleep(2000);
			uploadassignmentPOM.uploadAssignmentlink();
	        
	        System.out.println("uploadbtn");
	        Thread.sleep(2000);
	        
	        
	        
	        Thread.sleep(2000);
	        js.executeScript("window.scrollBy(0,1000)");
	        
			screenShot.captureScreenShot("tenth");
		}


}

package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChatPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChatTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ChatPOM chatPOM;
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
		chatPOM = new ChatPOM(driver);
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
		chatPOM.clickLearnseleniumlinkchat();
		System.out.println("coursebtn");
		Thread.sleep(4000);
		chatPOM.clickOngroupicon();
		Thread.sleep(4000);
		chatPOM.clickOngrouplink();
		System.out.println("grouplink");
		Thread.sleep(4000);
		chatPOM.clickOnchaticon();
		String mainWindow=driver.getWindowHandle();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1)); //this is to switch to new window
	    driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("chaticon");
        Thread.sleep(2000);
       
		Thread.sleep(8000);
        chatPOM.clickOnchatimage();
        Thread.sleep(2000);
        System.out.println("chatimage");
        chatPOM.writesMessage("Hello");
        Thread.sleep(2000);
        chatPOM.clickOnsendmessagebtn();
        Thread.sleep(2000);
		 
		// This is to switch to the main window
				 driver.switchTo().window(mainWindow);
				 Thread.sleep(2000);
      
        js.executeScript("window.scrollBy(0,1000)");
         
		screenShot.captureScreenShot("twelveth");
	}



}

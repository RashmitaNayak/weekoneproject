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

import com.training.dataproviders.ELTC_074DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_074POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_074Test {
private WebDriver driver;
private String baseUrl;
private LoginPOM loginPOM;
private ELTC_074POM eltc074POM;

private static Properties properties;
private ScreenShot screenShot;


@BeforeClass
public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	
	
	
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	
	loginPOM = new LoginPOM(driver); 
	eltc074POM = new ELTC_074POM(driver);
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

@Test(dataProvider ="exceldata1-inputs", dataProviderClass = ELTC_074DataProviders.class)
public void subscribeTest(String cc,String cn,String ct,String ccode,String tcode) throws InterruptedException, AWTException
{
	Robot robot = new Robot();
	loginPOM.sendUserName("admin");
	loginPOM.sendPassword("admin@123");
	loginPOM.clickLoginBtn(); 
	screenShot.captureScreenShot("first");
	eltc074POM.clickCoursecatagorylink();
	eltc074POM.clickAddcatagoryicon();
	eltc074POM.enterCoursecatagory(cc);
	eltc074POM.enterCoursename(cn);
	eltc074POM.clickRadiobtn();
	eltc074POM.clickAddbtn();
	eltc074POM.clickAdminlink();
	eltc074POM.clickCourselink();
	eltc074POM.enterCoursetitle(ct);
	eltc074POM.enterCoursecode(ccode);
	eltc074POM.clickTeacherbox();
	eltc074POM.enterTeachercode(tcode);
	robot.keyPress(KeyEvent.VK_ENTER);
	eltc074POM.clickTeachersMenu();
	eltc074POM.clickCatagorybox();
	eltc074POM.enterCatagoryboxcode("Blended Learning");
	eltc074POM.clickLanguagebox();
	eltc074POM.enterLanguageboxcode("English");
	
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	eltc074POM.clickCreatecoursebtn();
	eltc074POM.clickDropdownicon();
	eltc074POM.clickLogoutbtn();
	
	

}
}

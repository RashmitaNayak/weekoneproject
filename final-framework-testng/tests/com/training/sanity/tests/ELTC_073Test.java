package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.ELTC_073DataProviders;
import com.training.dataproviders.ELTC_075DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_073POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_073Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_073POM eltc073POM;

	private static Properties properties;
	private ScreenShot screenShot;
	


	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		loginPOM = new LoginPOM(driver); 
		eltc073POM = new ELTC_073POM(driver);
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

	@Test(dataProvider ="dbdata-inputs", dataProviderClass = ELTC_073DataProviders.class)
	public void subscribeTest(String cc,String cn,String ct,String ccode,String tcode) throws InterruptedException, AWTException
	{
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("first");
		eltc073POM.clickCoursecatagorylink();
		eltc073POM.clickAddcatagoryicon();
		eltc073POM.enterCoursecatagory("BL");
		String Expcoucatname = eltc073POM.getCoursecategory("value");
		String Actcoucatname = cc;
		Assert.assertEquals(Actcoucatname, Expcoucatname);
		System.out.println("The Coursecategory is " +Actcoucatname  + " " +Expcoucatname );
		eltc073POM.enterCoursename("Blended Learning");
		String Expcoursecatname = eltc073POM.getCoursename("value");
		String Actcoursecatname = cn;
		Assert.assertEquals(Actcoursecatname, Expcoursecatname);
		System.out.println("The Coursecategory name is " +Actcoursecatname  + " " +Expcoursecatname );
		eltc073POM.clickRadiobtn();
		eltc073POM.clickAddbtn();
		eltc073POM.clickAdminlink();
		eltc073POM.clickCourselink();
		eltc073POM.enterCoursetitle("testing");
		String Expcoursettlname = eltc073POM.getCoursetitle("value");
		String Actcoursettlname = ct;
		Assert.assertEquals(Actcoursettlname, Expcoursettlname);
		System.out.println("The Coursecategory title is " +Actcoursettlname  + " " +Expcoursettlname );
		eltc073POM.enterCoursecode("tes");
		String Expcoursecodename = eltc073POM.getCoursecode("value");
		String Actcoursecodename = ccode;
		Assert.assertEquals(Actcoursecodename, Expcoursecodename);
		System.out.println("The Coursecategory code is " +Actcoursecodename  + " " +Expcoursecodename );
		eltc073POM.clickTeacherbox();
		eltc073POM.enterTeachercode("manzoor");
		String Expcoursetcrname = eltc073POM.getTeachercode("value");
		String Actcoursetcrname = tcode;
		Assert.assertEquals(Actcoursetcrname, Expcoursetcrname);
		System.out.println("The Coursecategory teacher is " +Actcoursetcrname  + " " +Expcoursetcrname );
		eltc073POM.clickCatagorybox();
		eltc073POM.enterCatagoryboxcode("Blended Learning");
		
		eltc073POM.clickLanguagebox();
		eltc073POM.enterLanguageboxcode("English");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		eltc073POM.clickCreatecoursebtn();
		eltc073POM.clickDropdownicon();
		eltc073POM.clickLogoutbtn();

	}
}

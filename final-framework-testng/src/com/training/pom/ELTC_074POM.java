package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_074POM {
private WebDriver driver; 
	
	public ELTC_074POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement coursecatagorylink; 
	
	public void clickCoursecatagorylink() {
		this.coursecatagorylink.click(); 
	}//clicks on coursecatagory  link
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addcatagoryicon; 
	
	public void clickAddcatagoryicon() {
		this.addcatagoryicon.click(); 
	}//clicks on add catagory  icon
	
	@FindBy(xpath="//input[@id='course_category_code']")
	private WebElement coursecatagorybox; 
	
	public void enterCoursecatagory(String cc) {
		this.coursecatagorybox.clear();
		this.coursecatagorybox.sendKeys(cc);
	}//enters value in coursecatagory  
	@FindBy(xpath="//input[@id='course_category_name']")
	private WebElement coursename; 
	
	public void enterCoursename(String cn) {
		this.coursename.clear();
		this.coursename.sendKeys(cn);
}//enters course name
	@FindBy(name="auth_course_child")
	private WebElement yesradiobtn; 
	
	public void clickRadiobtn() {
		this.yesradiobtn.click();
}//clicks yes radio button
	@FindBy(xpath="//button[@id='course_category_submit']")
	private WebElement addbtn; 
	
	public void clickAddbtn() {
		this.addbtn.click();
}//clicks add catagory button
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement admnlink; 
	
	public void clickAdminlink() {
		this.admnlink.click();
}//clicks admin link
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement courselink; 
	
	public void clickCourselink() {
		this.courselink.click();
}//clicks create course link
	@FindBy(xpath="//input[@id='update_course_title']")
	private WebElement coursetitle; 
	
	public void enterCoursetitle(String ct) {
		this.coursetitle.clear();
		this.coursetitle.sendKeys(ct);
}//enters course title
	@FindBy(xpath="//input[@id='visual_code']")
	private WebElement coursecode; 
	
	public void enterCoursecode(String ccode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(ccode);
}//enters course code
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default'and @data-id='course_teachers']")
	private WebElement teacheredd;
	public void clickTeacherbox() {
		this.teacheredd.click();
	}
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[3]/div[1]/div/div/div/input")
	private WebElement teachercode; 
	
	public void enterTeachercode(String tcode) {
		this.teachercode.clear();
		this.teachercode.sendKeys(tcode);
}//enters course code
	@FindBy(xpath="//button[@class='btn dropdown-toggle bs-placeholder btn-default'and @data-id='update_course_category_code']")
	private WebElement catagorybox;
	public void clickCatagorybox() {
		this.catagorybox.click();
	}//clicks catagory box
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[4]/div[1]/div/div/div/input")
	private WebElement catagoryboxcode; 
	
	public void enterCatagoryboxcode(String cboxcode) {
		this.catagoryboxcode.clear();
		this.catagoryboxcode.sendKeys(cboxcode);
}//enters coursecatagorybox code
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default'and @data-id='update_course_course_language']")
	private WebElement languageedd;
	public void clickLanguagebox() {
		this.languageedd.click();
	}//clicks language box
	@FindBy(xpath="//*[@id=\"update_course\"]/fieldset/div[7]/div[1]/div/div/div/input")
	private WebElement languageboxcode; 
	
	public void enterLanguageboxcode(String Lboxcode) {
		this.languageboxcode.clear();
		this.languageboxcode.sendKeys(Lboxcode);
}//enters languagebox code
	@FindBy(xpath="//button[@id='update_course_submit']")
	private WebElement createcoursebtn;
	
	public void clickCreatecoursebtn() {
		this.createcoursebtn.click();
	}//clicks on create a course button
	@FindBy(xpath="//a[@class='dropdown-toggle']//span[@class='caret']")
	private WebElement dropdowniconforlogout;
	
	public void clickDropdownicon() {
		this.dropdowniconforlogout.click();
	}//clicks on dropdown link for logout
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logoutbtn;
	
	public void clickLogoutbtn() {
		this.logoutbtn.click();
	}//clicks on logout link for logout
}

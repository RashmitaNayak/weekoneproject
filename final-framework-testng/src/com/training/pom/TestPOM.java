package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPOM {
	//To verify whether the application allows the student to subscribe course and take the authored test testcase-ELTC_041
private WebDriver driver; 
	
	public TestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement mycourseslink ;
	
	public void clickMycourseslink() {
		this.mycourseslink.click(); 
	}
	@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
	private WebElement coursecataloglink ;
	
	public void clickCoursecataloglink() {
		this.coursecataloglink.click(); 
	}
	@FindBy(name="search_term")
	private WebElement entervalueinsearchbox ;
	
	public void enterValueinsearchbox(String value1) {
		this.entervalueinsearchbox.clear(); 
		this.entervalueinsearchbox.sendKeys(value1);
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickonsearchbtn ;
	
	public void clickSearchbtn() {
		this.clickonsearchbtn.click(); 
	}
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribebtn ;
	
	public void clickSubscribebtn() {
		this.subscribebtn.click(); 
	}
	@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
	private WebElement courselink ;
	
	public void clickOncourselink() {
		this.courselink.click(); 
	}
	@FindBy(id="toolimage_1939")
	private WebElement testicon ;
	
	public void clickOntesticon() {
		this.testicon.click(); 
	}
	@FindBy(xpath="//a[contains(text(),'Test1')]")
	private WebElement testnamelink ;
	
	public void clickOntestnamelink() {
		this.testnamelink.click(); 
	}
	@FindBy(xpath="//a[@class='btn btn-success btn-large']")
	private WebElement starttestbtn ;
	
	public void clickOnstarttestbtn() {
		this.starttestbtn.click(); 
	}
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement answerbox ;
	
	public void writeAnswer(String value2) {
		
			driver.switchTo().frame(0);
			this.answerbox.sendKeys(value2);
			driver.switchTo().defaultContent();
		 
	}
	@FindBy(name="save_now")
	private WebElement endtestbtn ;
	
	public void clickEndtestbtn() {
		this.endtestbtn.click(); 
	}
	@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
	private WebElement learnseleniumlink ;
	
	public void clickLearnseleniumlink() {
		this.learnseleniumlink.click(); 
	}
	
}

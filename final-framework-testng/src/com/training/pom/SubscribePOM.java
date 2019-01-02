package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePOM {
	//subscribes selected course
private WebDriver driver; 
	
	public SubscribePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement mycoursesbtn ;
	
	public void clickMycoursesBtn() {
		this.mycoursesbtn.click(); 
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-large']")
	private WebElement coursecataloglink ;
	
	public void clickCoursescataloglink() {
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
	@FindBy(xpath="//div[@class='row']//div[9]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribebtn ;
	
	public void clickSubscribebtn() {
		this.subscribebtn.click(); 
	}
}

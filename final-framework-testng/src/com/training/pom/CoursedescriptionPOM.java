package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursedescriptionPOM {
private WebDriver driver; 
	
	public CoursedescriptionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement mycoursesbtn ;
	
	public void clickMycoursesBtn() {
		this.mycoursesbtn.click(); 
	}
	@FindBy(xpath="//a[contains(text(),'testing')]")
	private WebElement testingbtn ;
	
	public void clickTestingBtn() {
		this.testingbtn.click(); 
	}
	@FindBy(id="istooldesc_577")
	private WebElement coursedescriptionlink ;
	
	public void clickCoursedescriptionlink() {
		this.coursedescriptionlink.click(); 
	}

}

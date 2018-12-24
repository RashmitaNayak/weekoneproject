package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePOM {
private WebDriver driver; 
	
	public SubscribePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[2]/a")
	private WebElement mycoursesbtn ;
	
	public void clickMycoursesBtn() {
		this.mycoursesbtn.click(); 
	}
	
	
	@FindBy(xpath="//*[@id=\"homepage-course\"]/div/a")
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
	@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
	private WebElement clickonsearchbtn ;
	
	public void clickSearchbtn() {
		this.clickonsearchbtn.click(); 
	}
	@FindBy(linkText="Subscribe")
	private WebElement subscribebtn ;
	
	public void clickSubscribebtn() {
		this.subscribebtn.click(); 
	}
}

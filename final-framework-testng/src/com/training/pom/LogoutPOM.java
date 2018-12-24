package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//span[@class='caret']")
	private WebElement dropdownlink ;
	
	public void clickDropdownlink() {
		this.dropdownlink.click(); 
	}
	@FindBy(id="logout_button")
	private WebElement logoutlink ;
	
	public void clickLogout() {
		this.logoutlink.click(); 
	}
}

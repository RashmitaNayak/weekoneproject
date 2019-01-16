package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsePOM {
private WebDriver driver; 
	
	public ResponsePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName1) {
		this.userName.clear();
		this.userName.sendKeys(userName1);
	}
	
	public void sendPassword(String password1) {
		this.password.clear(); 
		this.password.sendKeys(password1); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

}

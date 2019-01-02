package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostpasswordPOM {
	//clicks on lost password link and sends mail for resetting password after entering the valid mail id
private WebDriver driver; 
	
	public LostpasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//*[@id=\"login_block\"]/div/ul/li[2]/a")
	private WebElement ilostpasswordlink;
	
	public void clickIlostpasswordlink() {
		this.ilostpasswordlink.click(); 
	}
	@FindBy(id="lost_password_user")
	private WebElement emailid;
	
	public void enterValidemailid(String Emailid) {
		this.emailid.sendKeys(Emailid);; 
	}
	@FindBy(id="lost_password_submit")
	private WebElement sendmessagebtn;
	
	public void clickSendmessagebtn() {
		this.sendmessagebtn.click(); 
	}
}

package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePOM {
	//edits profile
private WebDriver driver; 
	
	public EditProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[@id=\"menuone\"]/ul[1]/li[1]/a")
	private WebElement homepageBtn;
	
	public void clickHomepageBtn() {
		this.homepageBtn.click(); 
	}
	@FindBy(xpath="//*[@id=\"profileCollapse\"]/div/ul/li[4]/a")
	private WebElement profileBtn;
	
	public void clickProfileBtn() {
		this.profileBtn.click(); 
	}
	@FindBy(xpath="//*[@id=\"sn-avatar-one\"]/div/ul/li[4]/a")
	private WebElement editprofileBtn;
	
	public void clickEditprofileBtn() {
		this.editprofileBtn.click(); 
	}
	@FindBy(id="profile_password0")
	private WebElement password01;
	
	public void changePassword(String password0) {
		this.password01.clear();
		this.password01.sendKeys(password0);
	}
	@FindBy(id="password1")
	private WebElement password02;
	
	public void enterNewpassword(String password1) {
		this.password02.clear();
		this.password02.sendKeys(password1);
	}
	@FindBy(id="profile_password2")
	private WebElement password03;
	
	public void confirmNewpassword(String password2) {
		this.password03.clear();
		this.password03.sendKeys(password2);
	}
	@FindBy(id="profile_apply_change")
	private WebElement savesettingsbtn;
	
	public void clickSavesettingsBtn() {
		this.savesettingsbtn.click(); 
	}
}
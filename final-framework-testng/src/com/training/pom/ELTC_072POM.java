package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_072POM {
private WebDriver driver; 
	
	public ELTC_072POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement addusernamelink; 
	
	public void clickAddusernamelink() {
		this.addusernamelink.click(); 
	}//clicks on add user name  link
	@FindBy(id="firstname")
	private WebElement firstnamebox; 
	
	public void enterFirstname(String val1) {
		this.firstnamebox.clear();
		this.firstnamebox.sendKeys(val1);
	}//enters value in firstname
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastnamebox; 
	
	public void enterLastname(String val2) {
		this.lastnamebox.clear();
		this.lastnamebox.sendKeys(val2);
	}//enters value in lastname
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailidbox; 
	
	public void enterEmailid(String val3) {
		this.emailidbox.clear();
		this.emailidbox.sendKeys(val3);
	}//enters value in emailid
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneno; 
	
	public void enterPhoneno(String val7) {
		this.phoneno.clear();
		this.phoneno.sendKeys(val7);
	}//enters value in phone no
	@FindBy(xpath="//input[@id='username']")
	private WebElement loginbox; 
	
	public void enterLogin(String val4) {
		this.loginbox.clear();
		this.loginbox.sendKeys(val4);
	}//enters value in login
	@FindBy(xpath="//input[@name='password[password_auto]' and @value='0']")
	private WebElement radiobtn; 
	
	public void clickRadiobutton() {
		this.radiobtn.click(); 
	}//clicks on radiobutton of enterpassword
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordbox; 
	
	public void enterPassword(String val5) {
		this.passwordbox.clear();
		this.passwordbox.sendKeys(val5);
	}//enters value in passwordbox
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default' and @data-id ='status_select']")
	private WebElement clickprofiledd;
	public void ClickProfileDropDown()
	{
		this.clickprofiledd.click();
	}//clicks the profile drop down box
	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[11]/div[1]/div/div/div/input")
	private WebElement profilebox; 
	
	public void enterProfile(String val6) {
		this.profilebox.clear();
		this.profilebox.sendKeys(val6);
	}//selects value in profiledropdownbox
	@FindBy(xpath="//button[@name='submit']")
	private WebElement addbtn; 
	
	public void clickAddbtn() {
		this.addbtn.click(); 
	}//clicks on add button
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

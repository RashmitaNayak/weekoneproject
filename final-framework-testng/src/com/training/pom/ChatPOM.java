package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPOM {
private WebDriver driver; 
	
	public ChatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
	private WebElement learnseleniumlinkchat; 
	
	public void clickLearnseleniumlinkchat() {
		this.learnseleniumlinkchat.click(); 
	}//clicks on learn selenium link
	@FindBy(xpath="//img[@id='toolimage_1944']")
	private WebElement groupicon; 
	
	public void clickOngroupicon() {
		this.groupicon.click(); 
	}//clicks on group icon
	@FindBy(xpath="//a[contains(text(),'Group 0001')]")
	private WebElement grouplink; 
	
	public void clickOngrouplink() {
		this.grouplink.click(); 
	}//clicks on group link
	@FindBy(xpath="//img[@title='Chat']")
	private WebElement chaticon; 
	
	public void clickOnchaticon() {
		this.chaticon.click(); 
	}//clicks on small chat icon
	@FindBy(xpath="//*[@title='LeaveAMessage']")
	private WebElement chatimage; 
	
	public void clickOnchatimage() {
		this.chatimage.click(); 
	}//clicks on small chat image
	@FindBy(xpath="//div[@class='emoji-wysiwyg-editor']")
	private WebElement writemessage; 
	
	public void writesMessage(String value6) {
		this.writemessage.sendKeys(value6);
	}//writes message
	@FindBy(xpath="//*[@title='LeaveAMessage']")
	private WebElement sendmessagebtn; 
	
	public void clickOnsendmessagebtn() {
		this.sendmessagebtn.click(); 
	}//clicks on send message button
	
}

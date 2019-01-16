package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussforumPOM {
	//To verify whether the application allows the student to discuss in the forum testcase-ELTC_044
		private WebDriver driver; 
			
			public DiscussforumPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);

		}
			@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
			private WebElement learnselenium3link ;
			
			public void clickLearnseleniumlink2() {
				this.learnselenium3link.click(); 
			}
			@FindBy(xpath="//img[@id='toolimage_1941']")
			private WebElement forumicon ;
			
			public void clickForumicon() {
				this.forumicon.click(); 
			}
			@FindBy(xpath="//a[contains(text(),'Group 0001')]")
			private WebElement groupname ;
			
			public void clickGroupname() {
				this.groupname.click(); 
			}
			@FindBy(xpath="//img[@title='Create thread']")
			private WebElement createthreadicon;
			
			public void clickCreatethreadicon() {
				this.createthreadicon.click(); 
			}
			@FindBy(xpath="//input[@id='thread_post_title']")
			private WebElement threadtitlebox;
			
			public void enterThreadtitle(String value4) {
				this.threadtitlebox.sendKeys(value4); 
			}
			
			@FindBy(xpath="/html/body")
			private WebElement threadpostbox ;
			
			public void writeThreadpostbox(String value5) {
				
					driver.switchTo().frame(0);
					this.threadpostbox.sendKeys(value5);
					driver.switchTo().defaultContent();
				 
			}
			@FindBy(xpath="//button[@id='thread_SubmitPost']")
			private WebElement createthreadbtn;
			
			public void clickCreatethreadbtn() {
				this.createthreadbtn.click(); 
			}

}

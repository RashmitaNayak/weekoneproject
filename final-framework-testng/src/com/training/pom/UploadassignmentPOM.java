package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadassignmentPOM {
	//To verify whether the application allows the student to upload assignment testcase-ELTC_043
	private WebDriver driver; 
		
		public UploadassignmentPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);

	}
		@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
		private WebElement learnselenium2link ;
		
		public void clickLearnseleniumlink2() {
			this.learnselenium2link.click(); 
		}
		@FindBy(xpath="//img[@id='toolimage_1946']")
		private WebElement assignmenticon ;
		
		public void clickAssignmenticon() {
			this.assignmenticon.click(); 
		}
		@FindBy(xpath="//a[contains(text(),'assignment')]")
		private WebElement assignmentlink ;
		
		public void clickAssignmentlink() {
			this.assignmentlink.click(); 
		}
		@FindBy(xpath="//a[@class='btn-toolbar']")
		private WebElement uploadassignmentlink ;
		
		public void uploadAssignmentlink() {
			this.uploadassignmentlink.click(); 
		}
		
}

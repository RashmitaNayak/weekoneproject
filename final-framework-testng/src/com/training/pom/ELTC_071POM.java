package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_071POM {
	WebDriver driver;
	public ELTC_071POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText="SampleTest data")
private WebElement courselink;
//Click on course link
@FindBy(xpath="//*[contains(@title,'Tests')]")
private WebElement test;
//click on test icon
@FindBy(xpath="//*[contains(@title,'Create a new test')]")
private WebElement newtest;
//click on new test
@FindBy(id="exercise_title")
private WebElement title;
@FindBy(id="advanced_params")
private WebElement advancedbutton;
//click on advanced button
@FindBy(xpath="//*[@id='cke_1_contents']//iframe")
private WebElement Frame;
//enter valid credentials in Give a context to the test textbox
@FindBy(name="activate_start_date_check")
private WebElement starttime;
//click on starttime radio button
@FindBy(id="start_time_alt_text")
private WebElement settime;
//click on set time radio button 
@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[3]/button[1]")
private WebElement now;
//enabling start time as now
@FindBy(id="pass_percentage")
private WebElement percent;
//entering pass percentage
@FindBy(name="submitExercise")
private WebElement proceed;
//click on proceed to submit button
@FindBy(xpath="//*[contains(@title,'Multiple choice')]")
private WebElement multiple;
//click on multiple choice question icon.
@FindBy(name="questionName")
private WebElement question;
//enter the question
@FindBy(xpath="//*[@id='cke_2_contents']//iframe")
private WebElement option1;
@FindBy(xpath="//*[@id='cke_4_contents']//iframe")
private WebElement option2;
@FindBy(xpath="//*[@id='cke_6_contents']//iframe")
private WebElement option3;
@FindBy(xpath="//*[@id='cke_8_contents']//iframe")
private WebElement option4;
//entering all the four options
@FindBy(xpath="//*[@id=\"submit-question\"]")
private WebElement submitque;
//submit question
@FindBy(xpath="//*[contains(@title,'Preview')]")
private WebElement preview;
//click on preview button

@FindBy(linkText="Course catalog")
private WebElement catalog;
//login as student &click on course catalog
@FindBy(css="input[name='search_term']")
private WebElement search;
//enter course name on search box
@FindBy(xpath="//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")
private WebElement sbutton;
//click on search
@FindBy(xpath="//*[contains(@href,'courses.php?action=subscribe_course')]")
private WebElement subscribe;
//click on subscribe button
@FindBy(linkText="My courses")
private WebElement mycourse;
//click on mycourse
@FindBy(linkText="online quiz")
private WebElement onlinequiz;
//click on online quiz
@FindBy(linkText="Start test")
private WebElement starttest;
//click on start test
@FindBy(xpath="//*[contains(text(),'Selenium')]")
private WebElement optionans;
//click on answer
@FindBy(name="save_now")
private WebElement nextques;
//click  next button
@FindBy(css="input#question_div_203 > div.question_options > label:nth-child(4) > p")
private WebElement optionanswer;
//click on answer
@FindBy(xpath="//input[@name='choice[203]' and @value='797'] ")
private WebElement end;
//click on end button
@FindBy(xpath="//*[@id=\"menuone\"]/ul[2]/li[2]/a")
private WebElement logout;
//click on logout drop down
@FindBy(xpath="//*[@id=\"logout_button\"]")
private WebElement logoutbutton;
//click on logout 
@FindBy(xpath="//*[contains(@title,'Results and Feedback')]")
private WebElement result;
//click on result and feedback
@FindBy(xpath="//*[contains(@title,'Grade activity')]")
private WebElement grade;
//click on grade
@FindBy(name="send_notification")
private WebElement checkbox;
//click on checkbox
@FindBy(name="submit")
private WebElement send;
//click on send

public void sendcourselink()
{
	this.courselink.click();
}
public void sendtest()
{
	this.test.click();
}
public void sendnewtest()
{
	this.newtest.click();
}
public void sendtitle(String title)
{
	this.title.sendKeys(title);
}
public void sendadvancedbutton()
{
	this.advancedbutton.click();
}
public void sendframe(String body)
{
	driver.switchTo().frame(Frame);
	WebElement printbody = driver.switchTo().activeElement();
	printbody.sendKeys(body);//enter body
	driver.switchTo().defaultContent();
}
public void sendstarttime()
{
	this.starttime.click();
}
public void sendsettime()
{
	this.settime.click();
}
public void sendnow()
{
	this.now.click();
}
public void sendpercent(String percentage)
{
	this.percent.sendKeys(percentage);
}
public void sendproceed()
{
	this.proceed.click();
}
public void sendmultiple()
{
	this.multiple.click();
}
public void sendquestion(String questions)
{
	this.question.clear();
	this.question.sendKeys(questions);
}
public void sendoption1(String body1)
{
	driver.switchTo().frame(option1);
	WebElement option = driver.switchTo().activeElement();
	option.sendKeys(body1);//enter body
	driver.switchTo().defaultContent();
}
public void sendoption2(String body2)
{
	driver.switchTo().frame(option2);
	WebElement option = driver.switchTo().activeElement();
	option.sendKeys(body2);//enter body
	driver.switchTo().defaultContent();
}
public void sendoption3(String body3)
{
	driver.switchTo().frame(option3);
	WebElement option = driver.switchTo().activeElement();
	option.sendKeys(body3);//enter body
	driver.switchTo().defaultContent();
}
public void sendoption4(String body4)
{
	driver.switchTo().frame(option4);
	WebElement option = driver.switchTo().activeElement();
	option.sendKeys(body4);//enter body
	driver.switchTo().defaultContent();
}
public void sendsubmitque()
{
	this.submitque.click();
}
public void sendpreview()
{
	this.preview.click();
}
public void sendcatalog()
{
	this.catalog.click();
}
public void sendsearch(String course)
{
	this.search.sendKeys(course);
}
public void sendsbutton()
{
	this.sbutton.click();
}
public void sendsubscribe()
{
	this.subscribe.click();
}
public void sendmycourse()
{
	this.mycourse.click();
}
public void sendonlinequiz()
{
	this.onlinequiz.click();
}
public void sendstarttest()
{
	this.starttest.click();
}
public void sendoptionans()
{
	this.optionans.click();//click on answer
}
public void sendnextques()
{
	this.nextques.click();//click on next question button
}
public void sendoptionanswer()
{
	this.optionanswer.click();//click on answer
}
public void sendend()
{
	this.end.click();//click on answer
}
public void sendlogout()
{
	this.logout.click();//click on logout dropdown
}
public void sendlogoutbutton()
{
	this.logoutbutton.click();//click on logout button
}
public void sendresult()
{
	this.result.click();//click on logout button
}
public void sendgrade()
{
	this.grade.click();//click on grade activity
}
public void sendcheckbox()
{
	this.checkbox.click();//click on checkbox
}
public void sendsend()
{
	this.send.click();//click on send
}
}

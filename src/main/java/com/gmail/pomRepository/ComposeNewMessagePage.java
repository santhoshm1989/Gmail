package com.gmail.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeNewMessagePage {
	
	
	public ComposeNewMessagePage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Recipients']")
	private WebElement Totextfld;
	
	@FindBy(xpath="//div[@class='aoD az6']/descendant::input[@class='aoT']")
	private WebElement Subjecttextfild;
	
	@FindBy(xpath="//td[@class='gU Up']")
	private WebElement Sendbtn;
	
	@FindBy(xpath="//td[@class='Hm']/descendant::img[@class='Ha']")
	private WebElement CloseBtn;

	public WebElement getTotextfld() {
		return Totextfld;
	}
	
	@FindBy(xpath="//div[@class='oj']/descendant::textarea[@class='vO' and @name='to']")
	private WebElement textarea;

	public WebElement getSubjecttextfild() {
		return Subjecttextfild;
	}

	public WebElement getSendbtn() {
		return Sendbtn;
	}
	
	public WebElement gettextarea() {
		return textarea;
	}
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	public void composeNewMessage(String emailid, String Subtxt) throws InterruptedException{
		Thread.sleep(4000);
		textarea.sendKeys(emailid);
		Subjecttextfild.sendKeys(Subtxt);
		}	
	public void enterToMail(String email){
		textarea.sendKeys(email);
		
	}
	
	public void enterSubject(String sub) throws InterruptedException{
		Subjecttextfild.sendKeys(sub);
		Thread.sleep(4000);
		
	}
	
	public void closeNewMsg() throws InterruptedException{
		Thread.sleep(4000);
		CloseBtn.click();
	}
	
	public void clickOnSendButton(){
		Sendbtn.click();
	}
	
	}

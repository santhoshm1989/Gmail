package com.gmail.pomRepository;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.genaricUtility.WebDriverUtility;

public class AllMailsPage {
	WebDriverUtility wlib=new WebDriverUtility();
	public AllMailsPage(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//div[@class='HY']/descendant::span[@class='H5 bwo' and text()='From']")
	private WebElement Frombtn;

	public WebElement getFrombtn() {
		return Frombtn;
	}
	public void clickOnFrombtn() throws InterruptedException{
		Thread.sleep(4000);
		Frombtn.click();
	}
	
	@FindBy(xpath="(//div[@class='agJ aFB']/descendant::div[@class='aL8' and text()='jyotihm19@gmail.com'])[2]")
	private WebElement JyotiMail;
	
	public WebElement getJyotiMail() {
		return JyotiMail;
	}
	
	public void verifyFromMails(WebDriver driver){
		String actualFromMail=JyotiMail.getText();
		wlib.waitForElement(driver);
		Assert.assertTrue(actualFromMail.contains("jyoti"));
		System.out.println("== From mails displayed successfully....!");
	}
	
}

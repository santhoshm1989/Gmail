package com.gmail.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gmail.genaricUtility.WebDriverUtility;

public class SentPage {
	WebDriverUtility wlib=new WebDriverUtility();
	public SentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='yW' and @id=':dp']/descendant::span[@name='Google' and text()='Google']")
	private WebElement RecentMails;
	
	public WebElement getRecentMails() {	
		return RecentMails;
	}
	
	public void verifySentMail(WebDriver driver){
		wlib.waitForElement(driver);
		String actualRecentMail=RecentMails.getText();
		Assert.assertTrue(actualRecentMail.contains("Google"));
		System.out.println("== Recent replyed message dispalayed successfully....!");
	}
	
}

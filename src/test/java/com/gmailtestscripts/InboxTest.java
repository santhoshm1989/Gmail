package com.gmailtestscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gmail.genaricUtility.BaseClass;
import com.gmail.genaricUtility.WebDriverUtility;
import com.gmail.pomRepository.GmailHomePage;
import com.gmail.pomRepository.InboxPage;
import com.gmail.pomRepository.SentPage;

public class InboxTest extends BaseClass {
	WebDriverUtility wlib=new WebDriverUtility();	
	
	@Test
	public void inboxTest() throws InterruptedException{

		wlib.waitForElement(driver);
		wlib.switchToWindow(driver);
		
		//Click on Inbox feature
		GmailHomePage ghomepg=new GmailHomePage(driver);				
		ghomepg.getInboxbtn().click();
		Thread.sleep(4000);

		//Select the latest  email, click on replay button and subject.		
		InboxPage inbox=new InboxPage(driver);
		String msg="Hi";
		inbox.sendReplayToMail(msg);
		Thread.sleep(5000);

		//Click on sent feature
		ghomepg.clickOnSentBox();
		
		//click on GoogleAccount
		ghomepg.getSignOutIcon().click();
		
	}

}

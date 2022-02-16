package com.gmailtestscripts;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.gmail.genaricUtility.BaseClass;
import com.gmail.genaricUtility.WebDriverUtility;
import com.gmail.pomRepository.ComposeNewMessagePage;
import com.gmail.pomRepository.GmailHomePage;

public class DraftsTest extends BaseClass {
	WebDriverUtility wlib=new WebDriverUtility();
	
	@Test
	public void DraftsTest() throws InterruptedException{
	
		wlib.waitForElement(driver);
		wlib.switchToWindow(driver);

		//click on compose feature
		GmailHomePage ghomepg=new GmailHomePage(driver);
		ghomepg.clickOnComposeBtn();
		wlib.waitForElement(driver);

		//Enter valid email id, subject and click on close button
		ComposeNewMessagePage draft=new ComposeNewMessagePage(driver);
		Thread.sleep(4000);
		String email="jyotijogur@gmail.com";
		String sub="Assignment";
		
		draft.enterToMail(email);
		Thread.sleep(4000);
		
		draft.enterSubject(sub);
		Thread.sleep(4000);
		
		draft.closeNewMsg();
		Thread.sleep(5000);
		
		//click on Drafrs feature
		ghomepg.clickOnDraftsBtn();

	}
}

package com.gmailtestscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gmail.genaricUtility.BaseClass;
import com.gmail.genaricUtility.WebDriverUtility;
import com.gmail.pomRepository.AllMailsPage;
import com.gmail.pomRepository.GmailHomePage;

public class AllMailTest extends BaseClass{
	WebDriverUtility wlib=new WebDriverUtility();

	@Test
	public void allMailTest() throws InterruptedException{

		wlib.waitForElement(driver);
		wlib.switchToWindow(driver);
		
		GmailHomePage ghmallmail=new GmailHomePage(driver);
		//ghmallmail.getAllMailbtn().click();
		//click on more feature
		Thread.sleep(4000);
		ghmallmail.clickOnMoreBtn();

		//drag to all mail
		ghmallmail.dragImportantToAllMAils(driver);

		//click on All Mails
		ghmallmail.getAllMails().click();

		AllMailsPage amp=new AllMailsPage(driver);
		amp.clickOnFrombtn();

		//Verify using Assert statements.
		amp.verifyFromMails(driver);
	}
}

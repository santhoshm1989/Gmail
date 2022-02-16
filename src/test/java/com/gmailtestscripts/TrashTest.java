package com.gmailtestscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gmail.genaricUtility.BaseClass;
import com.gmail.genaricUtility.WebDriverUtility;
import com.gmail.pomRepository.GmailHomePage;
import com.gmail.pomRepository.InboxPage;

public class TrashTest  extends BaseClass{
	WebDriverUtility wlib=new WebDriverUtility();

	@Test
	public void TrashTest() throws InterruptedException{

		wlib.switchToWindow(driver);
		wlib.waitForElement(driver);

		//click on inbox feature
		GmailHomePage ghomepage1=new GmailHomePage(driver);
		Thread.sleep(4000);		
		ghomepage1.getInboxbtn().click();
		Thread.sleep(4000);

		//click on check box for particular email
		InboxPage ip=new InboxPage(driver);
		Thread.sleep(6000);
		ip.getcheckbox().click();

		//click on Delete
		Thread.sleep(4000);
		ip.deletButton();


		//click on More Button
		ghomepage1.clickOnMoreBtn();
		Thread.sleep(4000);

		////drag to Trash 
		ghomepage1.dragImportantToAllMAils(driver);
		Thread.sleep(4000);

		//click on Trash Feature
		ghomepage1.getTrashbtn().click();

	}

}

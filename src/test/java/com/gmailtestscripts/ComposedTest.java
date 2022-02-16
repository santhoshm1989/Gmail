package com.gmailtestscripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.gmail.genaricUtility.BaseClass;
import com.gmail.genaricUtility.WebDriverUtility;
import com.gmail.pomRepository.ComposeNewMessagePage;
import com.gmail.pomRepository.GmailHomePage;

public class ComposedTest extends BaseClass {

	@Test
	public void compoaseTest() throws InterruptedException{

		WebDriverUtility wlib=new WebDriverUtility();	

		wlib.waitForElement(driver);
		wlib.switchToWindow(driver);

		//Click on compose feature	
		GmailHomePage gmpg=new GmailHomePage(driver);		
		Thread.sleep(3000);

		//click on Compose feature
		gmpg.getComposebtn().click();
		Thread.sleep(3000);

		//Enter emailid and subjet & click on send button
		String emailid="jyotihm19@gmail.com";
		Thread.sleep(5000);
		String Subtxt="Hi";
		ComposeNewMessagePage cnmp=new ComposeNewMessagePage(driver);	
		cnmp.enterToMail(emailid);	
		cnmp.enterSubject(Subtxt);
		cnmp.clickOnSendButton();
		Thread.sleep(5000);

		//click on Sent Mails
		gmpg.clickOnSentBox();
		Thread.sleep(5000);
				
		//click on GoogleAccount
		gmpg.getSignOutIcon().click();
		
				
		
		

	}
}

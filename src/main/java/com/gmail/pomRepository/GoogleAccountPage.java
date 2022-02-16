package com.gmail.pomRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.genaricUtility.WebDriverUtility;

public class GoogleAccountPage {
	WebDriverUtility wlib=new WebDriverUtility();
	
	public GoogleAccountPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='gb_A']")
	private WebElement GoogleAppsIcon;
	
	@FindBy(xpath="//span[@class='MrEfLc' and @style='background-position: 0 -2001px;']")
	private WebElement Gmail;

	public WebElement getGoogleAppsIcon() {
		return GoogleAppsIcon;
	}

	public WebElement getGmail() {
		return Gmail;
	}

	public void navigateToGoogleAccount(WebDriver driver) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		GoogleAppsIcon.click();
		Thread.sleep(4000);
		wlib.switchFrame(driver, 0);
		Gmail.click();
		
	}
}

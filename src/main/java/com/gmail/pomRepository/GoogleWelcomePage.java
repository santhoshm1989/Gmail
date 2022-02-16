package com.gmail.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.genaricUtility.WebDriverUtility;

public class GoogleWelcomePage {
	//WebDriverUtility wlib=new WebDriverUtility();
			
	public GoogleWelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='whsOnd zHQkBf' and @name='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d' and text()='Next']")
	private WebElement nextbtn;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}
	
	public void enterPasswordAndClickNext(String pwd) throws InterruptedException {
		Thread.sleep(4000);
		password.sendKeys(pwd);
		Thread.sleep(4000);
		nextbtn.click();
	}
	
}

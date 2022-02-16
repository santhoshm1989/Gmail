package com.gmail.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignInPage {

	public GoogleSignInPage(WebDriver driver){
		PageFactory.initElements(driver, this);
				
	}

	@FindBy(xpath="//input[@class='whsOnd zHQkBf' and @name='identifier']")
	private WebElement EmailorPhone;
	
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d' and text()='Next']")
	private WebElement NextBtn;
	
	public WebElement getEmailorPhone() {
		return EmailorPhone;
		
	}
	
	public WebElement getNextBtn() {
		return NextBtn;
		
	}
	
	 public void enterEmailOrPhone(String emailorphone){
		 EmailorPhone.sendKeys(emailorphone);
		 NextBtn.click();
		 
	 }
	 
	 
}

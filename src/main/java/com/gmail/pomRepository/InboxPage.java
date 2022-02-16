package com.gmail.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {

	public InboxPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//dIV[@class='yW']")
	private WebElement LatestEmail;

	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-Js-IF aaq T-I-ax7 L3' and @role='button']")
	private WebElement repayBtn;	

	@FindBy(xpath="//div[@class='Am aO9 Al editable LW-avf tS-tW']")
	private WebElement replayTextBox;

	@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	private WebElement replaySendtBtn;

	public WebElement getRepayBtn() {
		return repayBtn;
	}

	public WebElement getLatestEmail() {
		return LatestEmail;
	}

	public WebElement getReplayTextBox() {
		return replayTextBox;
	}

	public WebElement getReplaySendtBtn() {
		return replaySendtBtn;
	}

	public void sendReplayToMail(String msg) throws InterruptedException{
		LatestEmail.click();
		Thread.sleep(4000);
		repayBtn.click();
		Thread.sleep(4000);
		replayTextBox.sendKeys(msg);
		replaySendtBtn.click();

	}

	@FindBy(xpath="//td[@id=':28' and @class='oZ-x3 xY']")
	private WebElement checkbox;

	public WebElement getcheckbox() {
		return checkbox;
	}

	public void selectParticularCheckboxAndDelete(){
		checkbox.click();
	}

	@FindBy(xpath="//div[@class='aeH']/descendant::div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']")
	private WebElement deletbtn;

	public WebElement getdeletbtn() {
		return deletbtn;
	}

	public void deletButton(){
		deletbtn.click();
	}
}

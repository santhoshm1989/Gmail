package com.gmail.pomRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.genaricUtility.WebDriverUtility;

public class GmailHomePage {
	WebDriverUtility wdu=new WebDriverUtility();

	public  GmailHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(xpath="//div[text()='Compose']"),@FindBy(xpath="//*[@id=':39']/div/div"),@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")})
	private WebElement Composebtn;

	@FindBy(xpath="//a[@class='J-Ke n0' and text()='Inbox']")
	private WebElement Inboxbtn;

	@FindBy(xpath="//a[@class='J-Ke n0' and @aria-label='Trash']")
	private WebElement Trashbtn;

	@FindBy(xpath="//div[@class='aio UKr6le']/descendant::a[text()='Drafts']")
	private WebElement Draftsbtn;

	@FindBy(xpath="//a[@class='J-Ke n0' and text()='Sent']")
	private WebElement SentBtn;

	public WebElement getComposebtn() {	
		return Composebtn;
	}

	public WebElement getInboxbtn() {
		return Inboxbtn;
	}

	public WebElement getTrashbtn() {
		return Trashbtn;
	}

	public WebElement getDraftsbtn() {
		return Draftsbtn;
	}

	public WebElement getSentBtn() {
		return SentBtn;
	}


	//public void clickOnComposeBtn(WebDriver driver) throws InterruptedException{
	public void clickOnComposeBtn() throws InterruptedException{
		Composebtn.click();
	}

	public void InboxBtn(){
		Inboxbtn.click();
	}

	public void TrashBtn(){
		Trashbtn.click();
	}

	public void DraftsBtn(){
		Draftsbtn.click();
	}

//	@FindBy(xpath="//div[@class='gb_La gb_ed gb_jg gb_f gb_xf']/descendant::a[@class='gb_A gb_Ka gb_f']")
//	private WebElement SignAccount;
//
//	public WebElement getSignAccount() {
//		return SignAccount;
//	}
//
//	@FindBy(xpath="//div[@class='EeWTFe']/descendant::a[@class='jAcX2 ZWVAt R37Fhd']")
//	private WebElement Signout;
//
//	public WebElement getSignout() {	
//		return Signout;
//	}
//	public void mouseHoveSignAccount(WebDriver driver) throws InterruptedException{
//		//wdu.mouseOver(driver, SignAccount);
//		wdu.switchFrame(driver, 0);
//		SignAccount.click();
//		Thread.sleep(4000);
//		Signout.click();
		
//	}


	@FindBy(xpath="//div[@class='n6']/descendant::span[@class='CJ'  and text()='More']")
	private WebElement Morebtn;

	public WebElement getMorebtn() {	
		return Morebtn;
	}

	public void clickOnMoreBtn(){
		Morebtn.click();
	}


	@FindBy(xpath="//div[@class='aio UKr6le']/descendant::a[@class='J-Ke n0' and text()='All Mail']")
	private WebElement AllMails;

	public WebElement getAllMails() {	
		return AllMails;
	}

	public void dragImportantToAllMAils(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		wdu.dragAndDrop(driver, SentBtn, AllMails);
		AllMails.click();
	}

	@FindBy(xpath="//div[@class='gb_La gb_ed gb_jg gb_f gb_xf']/descendant::a[@class='gb_A gb_Ka gb_f']")
	private WebElement SignOutIcon;
	
	public WebElement getSignOutIcon() {	
		return SignOutIcon;
	}
	
	@FindBy(xpath="//div[@class='T4LgNb eejsDc']/descendant::div[@class='wBFtm' and text()='Sign out']")
	private WebElement Signoutbtn;
	
	public WebElement getSignoutbtn() {	
		return Signoutbtn;
	}
	
	public void signoutAccount(WebDriver driver){
		SignOutIcon.click();
		wdu.waitForElement(driver);
		wdu.switchFrame(driver, 0);
		wdu.waitForElement(driver);		
		Signoutbtn.click();
		
	}
	public void clickOnSentBox(){
		SentBtn.click();
		System.out.println("===Recent mail displayed successfully...!");
	}
	
	public void clickOnDraftsBtn(){
		Draftsbtn.click();
		System.out.println("=== Message saved as Draft ===");
	}	

	public void clickOnInboxbtn(){
		Inboxbtn.click();		
	}
	

	
	
}
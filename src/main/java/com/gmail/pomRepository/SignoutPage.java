//package com.gmail.pomRepository;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;import com.gmail.genaricUtility.WebDriverUtility;
//
//public class SignoutPage {
//	WebDriverUtility wlib=new WebDriverUtility();
//
//	public  SignoutPage(WebDriver driver){
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath="//div[@class='gb_La gb_ed gb_jg gb_f gb_xf']/descendant::a[@class='gb_A gb_Ka gb_f']")
//	private WebElement SignOutIcon;
//
//	public WebElement getSignOutIcon() {	
//		return SignOutIcon;
//	}
//
//	@FindBy(xpath="//div[@class='T4LgNb eejsDc']/descendant::div[ text()='Sign out']")
//	private WebElement Signoutbtn;
//
//	public WebElement getSignoutbtn() {	
//		return Signoutbtn;
//	}
//
//	public void signoutAccount(WebDriver driver){
//		SignOutIcon.click();
//		wlib.waitForElement(driver);
//		wlib.switchFrame(driver, 0);
//		wlib.waitForElement(driver);
//		//wlib.mouseOver(driver, Signoutbtn);
//		Signoutbtn.click();
//
//	}
//}
//
//

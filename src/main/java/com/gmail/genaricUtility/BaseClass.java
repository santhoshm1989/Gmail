package com.gmail.genaricUtility;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.gmail.pomRepository.GmailHomePage;
import com.gmail.pomRepository.GoogleAccountPage;
import com.gmail.pomRepository.GoogleSignInPage;
import com.gmail.pomRepository.GoogleWelcomePage;
//import com.gmail.pomRepository.SignoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtility wlib=new WebDriverUtility();
	public FileUtility flib=new FileUtility();
	
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("========database opened successfull========");
	}

	@BeforeClass
	public void  launchBrowser() throws Throwable{
		WebDriverManager.chromedriver().setup();
		
		String Browser=flib.getPropertyKeyValue("browser");
		
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
				
		driver.manage().window().maximize();
		
		System.out.println("**** Browser Launched Successfully...! ****");
		
		String URL=flib.getPropertyKeyValue("url");
		driver.get(URL);

	}	


	@BeforeMethod
	public void loginToGmailApp() throws Throwable{

		//read the data from property file
		GoogleSignInPage login=new GoogleSignInPage(driver);
         String emailorphone=flib.getPropertyKeyValue("username");
		 login.enterEmailOrPhone(emailorphone);		

		GoogleWelcomePage pwdpage=new GoogleWelcomePage(driver);
		String Password=flib.getPropertyKeyValue("password");
		pwdpage.enterPasswordAndClickNext(Password);

		GoogleAccountPage gap=new GoogleAccountPage(driver);
		gap.navigateToGoogleAccount(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("**** User Successfully loged..! ****");
	}

	@AfterMethod
	public void SignOut() throws InterruptedException{
		
		GmailHomePage hp=new GmailHomePage(driver);
		hp.getSignoutbtn();
		
//		SignoutPage sop=new SignoutPage(driver);
//		Thread.sleep(4000);
//		sop.getSignOutIcon().click();
//		Thread.sleep(8000);
//		sop.getSignoutbtn().click();
		
		System.out.println("**** User Successfully Logout..! ****");
	}

//	@AfterClass
//	public void  closeBrowser(){
//		driver.quit();
//		System.out.println("**** Browser Closed Successfully...! ****");
//	}
	
	@AfterSuite
	public void closeDB()
	{
		System.out.println("========database closed successfull========");
	}
}

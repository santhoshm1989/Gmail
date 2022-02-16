//package com.gmailtestscripts;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import javax.xml.xpath.XPath;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import com.gmail.genaricUtility.BaseClass;
//import com.gmail.pomRepository.GoogleAccountPage;
//import com.gmail.pomRepository.GoogleSignInPage;
//import com.gmail.pomRepository.GoogleWelcomePage;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginpageTest  {
//	WebDriver driver;//Author Santhosh
//	@Test
//	public void GamilLoginTest() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://accounts.google.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='identifier']")).sendKeys("santhoshsdet22@gmail.com");
////		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']")).click();
////		
////		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='password']")).sendKeys("santhosh22@");
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']")).click();
//		
////		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
////		Thread.sleep(5000);
////		driver.switchTo().frame(0);
//		
////		driver.findElement(By.xpath("//span[@class='MrEfLc' and @style='background-position: 0 -2001px;']")).click();
//		//driver.close();
//		
//		GoogleSignInPage signIn=new GoogleSignInPage(driver);
//		signIn.enterEmailOrPhone("santhoshsdet222@gmail.com");
//		Thread.sleep(5000);
//		
//		GoogleWelcomePage welcome=new GoogleWelcomePage(driver);
//		welcome.enterPasswordAndClickNext("santhosh222@");
//		
//		GoogleAccountPage Account=new GoogleAccountPage(driver);
//		Account.navigateToGoogleAccount(driver);
//		
//		Thread.sleep(4000);
//		Set<String> title = driver.getWindowHandles();
//		for(String text:title){
//			driver.switchTo().window(text);
//		}
//	}
//
//}

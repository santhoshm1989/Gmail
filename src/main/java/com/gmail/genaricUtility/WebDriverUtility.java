package com.gmail.genaricUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	
	public void switchFrame(WebDriver driver, int index){
		driver.switchTo().frame(index);
	}
	
	public void mouseOver(WebDriver driver,WebElement element){
		  Actions act=new Actions(driver);
		  act.moveToElement(element).perform();
	  }
	
	public void mouseOverAndClick(WebDriver driver,WebElement element){
		  Actions act=new Actions(driver);
		  act.moveToElement(element).click().perform();
	  }
	public void waitForElement(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void switchToWindow(WebDriver driver) throws InterruptedException{
		Set<String> windows = driver.getWindowHandles();
	//  System.out.println("No of window "+windows.size());
		Iterator<String> itr = windows.iterator();
		String pid=itr.next();
		String cid=itr.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
	}
	
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target){
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target);
	}
	
	
}

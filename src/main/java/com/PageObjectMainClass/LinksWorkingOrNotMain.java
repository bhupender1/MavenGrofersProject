package com.PageObjectMainClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.LinksOpenOrNotObjects;

public class LinksWorkingOrNotMain {
	WebDriver driver=null;
	LinksOpenOrNotObjects linkobject=new LinksOpenOrNotObjects();
	public LinksWorkingOrNotMain(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, linkobject);
	}
	public void LinkToBeOpen()
	{
		linkobject.LocationSelection.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> myList=new ArrayList<>();
		myList.add(linkobject.facebook);
		myList.add(linkobject.Linkedin);
		myList.add(linkobject.Twitter);
		myList.add(linkobject.Instagrsm);
		for(WebElement element:myList)
		{
		String selectAll = Keys.chord(Keys.SHIFT,Keys.RETURN);
		element.sendKeys(selectAll);
		}
	}

}

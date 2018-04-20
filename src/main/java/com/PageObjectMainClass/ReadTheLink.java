package com.PageObjectMainClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.VerifyLinks;

public class ReadTheLink {
	
	VerifyLinks verifylinks=new VerifyLinks();
	WebDriver driver;
 public ReadTheLink(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}
public String TotalLinks()
{
	
	List<WebElement> element=driver.findElements(By.tagName("a"));
		String URL=((WebElement) element).getAttribute("href");
		return URL;
		
	
	
}
}

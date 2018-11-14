package com.PageObjectMainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.LocationSelectorObjects;

public class LocationSelectorMain {
	WebDriver driver=null;
	LocationSelectorObjects obj=new LocationSelectorObjects();
	public LocationSelectorMain(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, obj);
	}
	
public void ClickonAddToCart() 
	{
	obj.LocationSelection.click();	
  
	
	}

}

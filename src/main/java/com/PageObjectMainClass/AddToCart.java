package com.PageObjectMainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.AddToCartObject;

public class AddToCart {
	WebDriver driver=null;
	AddToCartObject obj=new AddToCartObject();
	public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, obj);
	}
	
	

	public void ClickonAddToCart() 
	{
	obj.LocationSelection.click();	
     obj.AddToCartelement.click();
	
	}

}

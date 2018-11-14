package com.ApplicationHandler;

import org.openqa.selenium.WebDriver;

import com.PageObjectMainClass.AddToCartElement;

import junit.framework.Assert;

public class AddToCartController {
	
	public void AddToCart(WebDriver driver) throws InterruptedException
	{
		AddToCartElement ace=new AddToCartElement(driver);
		ace.SearchTextItems().sendKeys("Amul pure ghee");
		ace.SearchButton().click();
		Thread.sleep(4000);
		String Amount=ace.AmulPureGheePrice().getText();
		String Text=ace.AmulPureGheeText().getText();
		ace.AmulPureGhee().click();
		ace.CartIcon().click();
		Assert.assertEquals(Amount, ace.SubTotal().getText());
		Assert.assertEquals(Text, ace.CartText().getText());
		
		
		
	}

}

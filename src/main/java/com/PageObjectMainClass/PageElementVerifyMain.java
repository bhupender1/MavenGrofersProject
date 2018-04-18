package com.PageObjectMainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.PageElementVerifyObjects;

public class PageElementVerifyMain {
	WebDriver driver;
	PageElementVerifyObjects pageobject=new PageElementVerifyObjects();
	public PageElementVerifyMain(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, pageobject);
	}
	public void verify(WebElement element)
	{
		if(element.isDisplayed())
		{
			System.out.println(element+" "+"element is Displayed");
		}
		else
		{
			System.out.println("element is not displayed"+element);
		}
	}
	public void check()
	{
		verify(pageobject.logo);
		if(pageobject.logo.isDisplayed())
		{
			System.out.println(" Logo is visible");
		}
		else
		{
			System.out.println("Logo is not vivible");
		}
		if(pageobject.Location.isDisplayed())
		{
			System.out.println("location is select");
			pageobject.LocationSelection.click();
		}
		else
		{
			System.out.println("Location is not selected");
		}
		if(pageobject.searchelement.isDisplayed())
		{
			System.out.println("elements are displayed");
		}
		else
		{
			System.out.println("elements are not displayed");
		}
		if(pageobject.Login.isEnabled())
		{
			System.out.println("Login SIgnUp is Enabled");
		}
		else
		{
			System.out.println("Login Sign Up is not Enabled");
		}
		if(pageobject.MyCart.isDisplayed())
		{
			System.out.println("My Cart displayed");
		}
		else
		{
			System.out.println("my cart is not displayed");
		}
		if(pageobject.HeaderLink.isEnabled())
		{
			System.out.println("Link is enabled");
		}
		else
		{
			System.out.println("link is not enabled");
		}
	}
}

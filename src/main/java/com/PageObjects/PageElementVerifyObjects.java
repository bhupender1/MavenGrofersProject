package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElementVerifyObjects {
	
	@FindBy(className="logo") 
	public WebElement logo;
	@FindBy(xpath="//div[@class='user-address']")
	public WebElement Location;
	@FindBy(xpath="//input[@class='react-autosuggest__input']")
	public WebElement searchbar;
	@FindBy(xpath="//div[@class='search']")
	public WebElement searchelement;
	@FindBy(xpath="//div[text()='Login/Sign Up']")
	public WebElement Login;
	@FindBy(xpath="//*[text()='My Cart']")
	public WebElement MyCart;
	@FindBy(xpath="//*[text()='20% cashback for new users | Code: GROFERS20']")
	public WebElement HeaderLink;
	@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
	public WebElement LocationSelection;

}

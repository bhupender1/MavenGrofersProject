package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartObject {
	
	
	@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
	public WebElement LocationSelection;
	@FindBy(className="shopping-cart shopping-cart--empty")
	public WebElement AddToCartelement;
	
}

package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationSelectorObjects {
	
	
	@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
	public WebElement LocationSelection;

	
}

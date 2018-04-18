package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksOpenOrNotObjects {
	@FindBy(xpath="//a[@class='social-icon--facebook']")
	public WebElement facebook;
	@FindBy(xpath="//a[@class='social-icon--twitter']")
	public WebElement Twitter;
	@FindBy(xpath="//a[@class='social-icon--instagram']")
	public WebElement Instagrsm;
	@FindBy(xpath="//a[@class='social-icon--linkedin']")
	public WebElement Linkedin;
	@FindBy(xpath="//*[text()='Gurugram / Faridabad']")
	public WebElement LocationSelection;

}

package com.PageObjectMainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.Constant;

public class CheckApplicationTitle {
	WebDriver driver;
	public CheckApplicationTitle(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	public void CheckTitleAndURL()
	{
		String expectedUrl=Constant.URL;
		String expectedtitle="Online Grocery Shopping - Buy Fruits, Vegetables, Groceries and More | Grofers";
		String actualurl=driver.getCurrentUrl();
		//String expttitle="Grocery";
		Assert.assertEquals(expectedUrl, actualurl);
		Assert.assertEquals(expectedtitle,driver.getTitle());
		System.out.println(driver.getTitle());
	}

}

package com.AppModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PageObjectMainClass.AddToCart;
import com.PageObjectMainClass.CheckApplicationTitle;
import com.PageObjects.PageElementVerifyObjects;
import com.Utility.Constant;

public class App_Modular {
	
	WebDriver driver;
	public WebDriver invokeBrowser(String browser)
	{
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","E:\\Eclipse WorkSpace\\Online_Store_Hybrid_Framework\\Online_Store_Hybrid_Framework\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(Constant.URL);
			break;
   
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\BHUPENDER\\MY_WorkSpace\\TesNGProject\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(Constant.URL);
			break;
		
		}
		return driver;
	}
	
}

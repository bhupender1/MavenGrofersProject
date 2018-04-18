package com.TestApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppModular.App_Modular;
import com.PageObjectMainClass.AddToCart;
import com.PageObjectMainClass.CheckApplicationTitle;
import com.PageObjectMainClass.LinksWorkingOrNotMain;
import com.PageObjectMainClass.PageElementVerifyMain;
import com.PageObjectMainClass.StoreCardCategoryMain;
import com.PageObjects.LinksOpenOrNotObjects;
import com.Utility.Constant;



public class Test_App {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void TestApplication(String browser) throws InterruptedException
	{
		App_Modular app=new App_Modular();
		driver=app.invokeBrowser(browser);
		
  
	}
	@Test(priority=0)
	public void ApplicationTittle() 
	{
		CheckApplicationTitle checktittle=new CheckApplicationTitle(driver);
		checktittle.CheckTitleAndURL();
	}
	@Test(priority=1)
	public void verifypagelement()
	{
		PageElementVerifyMain pagemain=new PageElementVerifyMain(driver);
		pagemain.check();
	}
	@Test(priority=2)
	public void storeandobject()
	{
		StoreCardCategoryMain pagemain=new StoreCardCategoryMain(driver);
		pagemain.Category();
	}
	@Test(priority=3)
	public void linkWorking()
	{
		LinksWorkingOrNotMain linksmain=new LinksWorkingOrNotMain(driver);
		linksmain.LinkToBeOpen();
	}
	
}

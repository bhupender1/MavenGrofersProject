package com.TestApplication;

import org.testng.annotations.Test;

import java.lang.invoke.LambdaConversionException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppModular.App_Modular;
import com.ApplicationHandler.AddToCartController;
import com.PageObjectMainClass.LocationSelectorMain;
import com.PageObjectMainClass.CheckApplicationTitle;
import com.PageObjectMainClass.LinksWorkingOrNotMain;
import com.PageObjectMainClass.PageElementVerifyMain;
import com.PageObjectMainClass.ReadTheLink;
import com.PageObjectMainClass.StoreCardCategoryMain;
import com.PageObjects.LinksOpenOrNotObjects;
import com.Utility.Constant;
import com.Utility.ExcelUtility;




public class Test_App {
	WebDriver driver;
   @Parameters("browser")
	@Test
	public void TestApplication(String browser) throws InterruptedException
	{

		App_Modular app=new App_Modular();
		driver=app.invokeBrowser(browser);
		
  
	}
	@Test(priority=1,groups="AddToCart")
	public void selectlocation()
	{
		LocationSelectorMain lsm=new LocationSelectorMain(driver);
		lsm.ClickonAddToCart();
	}
	@Test(priority=2,groups="AddToCart")
	public void verifypagelement()
	{
		PageElementVerifyMain pagemain=new PageElementVerifyMain(driver);
		pagemain.check();
	}
	@Test(priority=3,groups="AddToCart")
	public void SelectAddToCartElement() throws InterruptedException
	{
		Thread.sleep(3000);
		AddToCartController acc=new AddToCartController();
		acc.AddToCart(driver);
	}
	
	@Test(priority=2,enabled=false)
	public void storeandobject()
	{
		StoreCardCategoryMain pagemain=new StoreCardCategoryMain(driver);
		pagemain.Category();
	}
	@Test(priority=3,enabled=false)
	public void linkWorking()
	{
		LinksWorkingOrNotMain linksmain=new LinksWorkingOrNotMain(driver);
		linksmain.LinkToBeOpen();
	}
	@Test(priority=4, enabled=false)
	public void ReadLinksInExcel() throws Exception
	{
		ReadTheLink readlink=new ReadTheLink(driver);
		String res=readlink.TotalLinks();
		ExcelUtility.setCellData(Constant.Excel_Path,res,"sheet1", 1, 50);
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}

package com.PageObjectMainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.StoreCardCategoryObjects;

public class StoreCardCategoryMain {
	WebDriver driver;
	StoreCardCategoryObjects storeobjects=new StoreCardCategoryObjects();
	public StoreCardCategoryMain(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, storeobjects);
	}
	public void verify(WebElement element)
	{
		if(element.isDisplayed())
		{
			System.out.println(element+" "+"element is Displayed");
			System.out.println(element.getText());
		}
		else
		{
			System.out.println("element is not displayed"+element);
			System.out.println(element.getText());
		}
	}
	public void Category() 
	{
      verify(storeobjects.FruitsAndVegetable);
      verify(storeobjects.GroceryAndStaple);
      verify(storeobjects.Beverage);
      verify(storeobjects.HomeAndKitchen);
      verify(storeobjects.FurnishingAndHomeNeeds);
      verify(storeobjects.HouseholdNeeds);
      verify(storeobjects.PersonalCare);
      verify(storeobjects.BreakfastAndDairy);
      verify(storeobjects.BiscuitsSnacks);
      verify(storeobjects.NoodlesAndSauces);
      verify(storeobjects.BabyAndKids);
      verify(storeobjects.PetCare);
      verify(storeobjects.MeatsFrozenSeafood);
      
	
	}

}

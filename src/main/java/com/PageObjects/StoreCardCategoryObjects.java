package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreCardCategoryObjects {
	@FindBy(xpath="//div[text()='Fruits & Vegetables' and @class='category-slider__category-text']")
	public WebElement FruitsAndVegetable;
	@FindBy(xpath="//div[text()='Grocery & Staples' and @class='category-slider__category-text']")
	public WebElement GroceryAndStaple;
	@FindBy(xpath="//div[text()='Beverages' and @class='category-slider__category-text']")
	public WebElement Beverage;
	@FindBy(xpath="//div[text()='Home & Kitchen' and @class='category-slider__category-text']")
	public WebElement HomeAndKitchen;
	@FindBy(xpath="//div[text()='Furnishing & Home Needs' and @class='category-slider__category-text']")
	public WebElement FurnishingAndHomeNeeds;
	@FindBy(xpath="//div[text()='Household Needs' and @class='category-slider__category-text']")
	public  WebElement HouseholdNeeds;
	@FindBy(xpath="//div[text()='Personal Care' and @class='category-slider__category-text']")
	public WebElement PersonalCare;
	@FindBy(xpath="//div[text()='Breakfast & Dairy' and @class='category-slider__category-text']")
	public WebElement BreakfastAndDairy;
	@FindBy(xpath="//div[text()='Biscuits, Snacks & Chocolates' and @class='category-slider__category-text']")
	public WebElement BiscuitsSnacks;
	@FindBy(xpath="//div[text()='Noodles, Sauces & Instant Food' and @class='category-slider__category-text']")
	public WebElement NoodlesAndSauces;
	@FindBy(xpath="//div[text()='Baby & Kids' and @class='category-slider__category-text']")
	public WebElement BabyAndKids;
	@FindBy(xpath="//div[text()='Pet Care' and @class='category-slider__category-text']")
	public WebElement PetCare;
	@FindBy(xpath="//div[text()='Meats, Frozen & Seafood' and @class='category-slider__category-text']")
	public WebElement MeatsFrozenSeafood;
	@FindBy(xpath="//div[@title='Next Product' and @class='slider__arrow--nav slider__arrow--right icon-angle-bracket-right slider__arrow--circle']")
	public WebElement slider;
}

package com.PageObjectMainClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.AddToCartObjects;

public class AddToCartElement {
	
	WebElement element;
	AddToCartObjects aco=new AddToCartObjects();
	public AddToCartElement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, aco);
		
	}
//public List<WebElement> ElementHandler(int i)
//{
//	List<WebElement> element1=aco.AddToCart;
//	element1.get(i).click();
//	return element1;
//}
	public WebElement SearchTextItems()
	{
		element=aco.SearchTextitems;
		return element;
		
	}
	public WebElement SearchButton()
	{
		element=aco.SearchBtn;
		return element;
		
	}
	public WebElement AmulPureGhee()
	   {
	  element=aco.AmulPureGhee_1;
	  return element;
	   }
	public WebElement AmulPureGheePrice()
	   {
	  element=aco.AmulPureGhee_1_Price;
	  return element;
	   }
	public WebElement AmulPureGheeText()
	   {
	  element=aco.AmulPureGhee_1_Text;
	  return element;
	   }
	public WebElement CartIcon()
	  {
	element=aco.CartIcon;
	return element;
	}
	public WebElement SubTotal()
	{
	element=aco.subtotal;
	return element;
	}
	public WebElement CartText()
	{
	element=aco.CartText;
	return element;
	}
	
   
    
}

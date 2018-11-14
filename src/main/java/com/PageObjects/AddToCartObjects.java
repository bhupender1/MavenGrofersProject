package com.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartObjects {
	
	//@FindBy(xpath="//button[@class='add-to-cart__add-btn display--inline-block']")
	//public List<WebElement> AddToCart;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement SearchTextitems;
	@FindBy(xpath="//button[@class='btn search__btn']")
	public WebElement SearchBtn;
	@FindBy(xpath="(//*[@class='add-to-cart__add-btn display--inline-block'])[1]")
	public WebElement AmulPureGhee_1;
	@FindBy(xpath="(//*[@class='plp-product__price--new'])[1]")
	public WebElement AmulPureGhee_1_Price;
	@FindBy(xpath="(//*[@class='plp-product__name--box'])[1]")
	public WebElement AmulPureGhee_1_Text;
	@FindBy(xpath=".//div[@class='shopping-cart shopping-cart--empty']")
	public WebElement CartIcon;
	@FindBy(xpath=".//div[@class='cart-store-details__total-price float-right']")
	public WebElement subtotal;
	@FindBy(xpath="//*[@class='product-name']")
	public WebElement CartText;
	

}

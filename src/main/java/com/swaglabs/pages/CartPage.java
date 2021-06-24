package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.swaglabs.base.BasePage.driver;
public class CartPage {
    @FindBy(xpath="//*[@id='shopping_cart_container']/a")
    private static WebElement checkout;
    public CartPage(){
        PageFactory.initElements(driver,this);
        }
    public static void clickCheckout(){
        ElementUtil.doClick(checkout);
    }
}

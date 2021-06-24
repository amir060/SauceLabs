package com.swaglabs.base;

import com.swaglabs.pages.*;

public class PagesManager {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static ItemPage itemPage;
    public static CartPage cartPage;
    public static CheckoutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;



    public static void init_PageObjects(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        cartPage = new CartPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();
    }


}

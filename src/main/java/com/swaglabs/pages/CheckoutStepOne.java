package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.swaglabs.base.BasePage.driver;

public class CheckoutStepOne {
    @FindBy(id = "first-name")
    private static WebElement firstName;
    @FindBy(id = "last-name")
    private static WebElement lastName;
    @FindBy(id = "postal-code")
    private static WebElement zipCode;
    @FindBy(xpath= "//input[@value='CONTINUE']")
    private static WebElement continueBtn;

    public CheckoutStepOne(){
        PageFactory.initElements(driver,this);
    }
    public static void sendOrderInformation(String f_Name,String l_name,String zip_code){
        ElementUtil.doSendText(firstName,f_Name);
        ElementUtil.doSendText(lastName,l_name);
        ElementUtil.doSendText(zipCode,zip_code);

    }
    public static void clickContinue(){
        ElementUtil.doClick(continueBtn);
    }
}


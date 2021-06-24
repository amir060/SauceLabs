package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.swaglabs.base.BasePage.driver;
public class LoginPage {
    //locators
    @FindBy(id="user-name")
    private  static WebElement userName;
    @FindBy(id="password")
    private static WebElement password;
    @FindBy(id="login-button")
    private static WebElement loginBtn;
    @FindBy(xpath="//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
    private static WebElement errorMessage;
    //constructor
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    //page actions
    public static String verifyTitle() {
       return ElementUtil.doGetPageTitle();
    }
    public static void enterUserName(String user) {
        ElementUtil.doSendText(userName,user);
    }
    public static void enterPassword(String psw) {
        ElementUtil.doSendText(password,psw);
    }
    public static void clickLoginBtn() {
        ElementUtil.doClick(loginBtn);
    }
    public static String getErrorMessage() {
       return ElementUtil.doGetText(errorMessage);
    }

}

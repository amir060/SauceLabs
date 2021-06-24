package com.swaglabs.utils;
import org.openqa.selenium.WebElement;

import static com.swaglabs.base.BasePage.driver;
public class ElementUtil {

    public static String doGetPageTitle() {
       try {
           return driver.getTitle();
       }catch (Exception e) {
           System.out.println("Some exception occured when getting the title");
       return null;
       }
    }
    public static void doSendText(WebElement element, String value) {
        try {
            element.sendKeys(value);
        } catch (Exception e) {
            System.out.println("Some exception occured when sending text !");
        }
    }
    public static void doClick(WebElement element){
        try {
            element.click();
        }catch (Exception e) {
            System.out.println("Some exception occured when clicking button!");
        }
    }
    public static String doGetText(WebElement element){
        try {
            return element.getText();
        }catch (Exception e) {
            System.out.println("Some exception occured when getting text!");
            return null;
        }
    }
    public static boolean doIsDisplayed(WebElement element){
        try {
            return element.isDisplayed();
        }catch (Exception e) {
            System.out.println("Some exception occured when clicking on an item !");
            return false;
        }
    }

}

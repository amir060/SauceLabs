package com.swaglabs.stepsdefinition;

import com.swaglabs.base.ConfigReader;
import com.swaglabs.pages.HomePage;
import com.swaglabs.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {


    @Given("I am in the login page")
    public void verifyTitleTest() {
        Assert.assertEquals("Swag Labs", LoginPage.verifyTitle());
    }

    @When("I enter a correct user name")
    public void enterValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter a correct password")
    public void enterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void clickOnLogin() {
        LoginPage.clickLoginBtn();
    }
    @Then("I see home page")
    public void verifyHomePageTitle(){
        Assert.assertEquals("Swag Labs", HomePage.verifyTitle());
    }

    @When("I enter incorrect user name")
    public void enterAIncorrectUserName() {
    LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password")
    public void enterAIncorrectPassword() {
    LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see error message on the login page")
    public void iSeeErrorMessage() {
    Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
            LoginPage.getErrorMessage());
    }
}

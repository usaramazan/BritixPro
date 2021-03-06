package com.bitrix.stepDefinitions.US9;

import com.bitrix.pages.US9.LoginPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class loginStepDefenitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    @Given("User enter {string} and {string}, click login button")
    public void userEnterAndClickLoginButton(String username, String password) {

       loginPage.login(username, password);
    }




    @Then("Verify the page title has Portal")
    public void verify_the_page_title_has_portal() {

        String expected = "Portal";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));
        System.out.println("Page title is Successful Displayed");
    }

    @Then("User should logout")
    public void user_should_logout() {
        loginPage.logout();


    }




}

package com.bitrix.stepDefinitions;

import com.bitrix.pages.CrmLoginPage;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CrmLogin_StepDefinition {
    CrmLoginPage crmLoginPage = new CrmLoginPage();

    @Given("User goes into given url")
    public void userGoesIntoGivenUrl() {

        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        crmLoginPage.usernameInput.sendKeys(username);
        crmLoginPage.passwordInput.sendKeys(password);
    }


    @Then("User click on login button")
    public void userClickOnLoginButton() {
        crmLoginPage.loginButton.click();

    }

    @Then("Verify page title has Portal")
    public void verifyPageTitleHasPortal() {
        String expected = "Portal";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("user click arrow")
    public void userClickArrow()  {
       crmLoginPage.emailArrow.click();


    }

    @Then("User logout")
    public void userLogout() throws InterruptedException {
        crmLoginPage.logoutButton.click();
        crmLoginPage.usernameInput.clear();
        Thread.sleep(2000);
    }


}

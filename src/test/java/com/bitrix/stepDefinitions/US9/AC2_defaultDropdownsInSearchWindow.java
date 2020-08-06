package com.bitrix.stepDefinitions.US9;

import com.bitrix.pages.US9.AC1_SearchPage;
import com.bitrix.pages.US9.AC2_FilterFunctionality;
import com.bitrix.pages.US9.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC2_defaultDropdownsInSearchWindow {

    LoginPage loginPage = new LoginPage();
    AC1_SearchPage searchPage = new AC1_SearchPage();
    AC2_FilterFunctionality filterFunctionality = new AC2_FilterFunctionality();

    @Given("User enter {string} and {string}, and login")
    public void userEnterAndAndLogin(String username, String password) {
        loginPage.login(username, password);
    }

    @When("User on the search window page")
    public void user_on_the_search_window_page() {

    searchPage.clickOnSearchLine();
    }

    @Then("User should select add field line")
    public void userShouldSelectAddFieldLine() {


        filterFunctionality.clickAddFieldButton();



    }

    @Then("User should select default {string}")
    public void userShouldSelectDefault(String checkboxes) {


        filterFunctionality.setCheckboxes();


    }



}

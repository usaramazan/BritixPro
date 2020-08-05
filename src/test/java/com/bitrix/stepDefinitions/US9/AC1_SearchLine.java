package com.bitrix.stepDefinitions.US9;

import com.bitrix.pages.US9.AC1_SearchPage;
import com.bitrix.pages.US9.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class AC1_SearchLine {

    LoginPage loginPage = new LoginPage();
    AC1_SearchPage searchPage = new AC1_SearchPage();

    @Given("User is on the Active Stream page")
    public void user_is_on_the_active_stream_page() {

        loginPage.login();
    }

    @Then("User should click on search button")
    public void user_should_click_on_search_button() {

        searchPage.clickOnSearchLine();
    }

    @Then("User should see below words displayed in search window")
    public void user_should_see_below_words_displayed_in_search_window(List<String> wordsDisplayed) {

        System.out.println("Words displayed = " + wordsDisplayed);

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }


}

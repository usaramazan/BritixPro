package com.bitrix.stepDefinitions;

import com.BritixPro.pages.CrmLoginPage;
import com.BritixPro.pages.CrmPollPage;
import com.BritixPro.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class EmailStepDef_UnderPoll {
    CrmPollPage crmPollPage = new CrmPollPage();
    CrmLoginPage crmLoginPage = new CrmLoginPage();

    @Then("User click on Add more link")
    public void user_click_on_add_more_link() throws InterruptedException {
        Thread.sleep(3000);
        crmPollPage.addMoreEmail.click();
    }


    @Then("click on Employees and departments tab")
    public void click_on_employees_and_departments_tab() throws InterruptedException {
        String windowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(windowHandle);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[1].click();",crmPollPage.employeesAndDepartments);
       // crmPollPage.employeesAndDepartments.click();
    }
    @Then("select fist email")
    public void select_fist_email() {
        crmPollPage.firstEmailAtEmployeesAndDepartments.click();

    }
    @Then("close pop up window")
    public void close_pop_up_window() {
        Driver.getDriver().close();

    }
    @Then("verify selected email is there")
    public void verify_selected_email_is_there() {

    }


}

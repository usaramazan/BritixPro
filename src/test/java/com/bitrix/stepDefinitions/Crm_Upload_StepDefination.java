package com.bitrix.stepDefinitions;


import com.bitrix.pages.CrmLoginPage;
import com.bitrix.pages.CrmPollPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Crm_Upload_StepDefination {

    CrmPollPage crmPollPage = new CrmPollPage();
    CrmLoginPage crmLoginPage = new CrmLoginPage();

    @Given("User go into given url")
    public void userGoIntoGivenUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User click on poll button")
    public void user_click_on_poll_button()  {
        crmPollPage.pollTab.click();

        
    }
    
    @When("User click on upload file icon")
    public void user_click_on_upload_file_icon()  {
        crmPollPage.uploadIcon.click();

        
    }
    
    @Then("User click on Select document from Bixtrix")
    public void user_click_on_select_document_from_bixtrix() {

        crmPollPage.SelectDocumentFromBritix.click();
    }


    @Then("Select document from bixtrix")
    public void selectDocumentFromBixtrix() throws InterruptedException {
//        String windowHandle = Driver.getDriver().getWindowHandle();
//        Driver.getDriver().switchTo().window(windowHandle);
        BrowserUtils.switchToWindow("Select one or more documents");
      //  BrowserUtils.waitForClickability(crmPollPage.selectDocument,3);
       // Driver.getDriver().findElement(By.xpath("//a[.='Logo.gif']")).click();
        //BrowserUtils.waitForClickability(crmPollPage.selectDocument,3);
        Thread.sleep(3000);
        //BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.xpath("//a[.='Logo.gif']")));
        crmPollPage.logoLink.click();

    }

    @And("Click Select document button")
    public void clickSelectDocumentButton() throws InterruptedException {
        Thread.sleep(2000);
        crmPollPage.selectDocument.click();
    }

    @And("Verify uploaded item there")
    public void verifyUploadedItemThere() {
        Assert.assertTrue(crmPollPage.uploadedItem.isDisplayed());
        Driver.closeDriver();
    }


    @Then("User click on Upload files and images")
    public void userClickOnUploadFilesAndImages() {
        
    }

    @And("Select AgileMeetings file")
    public void selectAgileMeetingsFile() {
        
    }

    @Then("click open")
    public void clcikOpen() {
    }
}

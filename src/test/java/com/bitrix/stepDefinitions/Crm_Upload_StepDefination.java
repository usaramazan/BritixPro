package com.bitrix.stepDefinitions;

import com.bitrix.pages.CrmLoginPage;
import com.bitrix.pages.CrmPollPage;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Crm_Upload_StepDefination {

    CrmPollPage crmPollPage = new CrmPollPage();
    CrmLoginPage crmLoginPage = new CrmLoginPage();

    @Given("User go into given url")
    public void userGoIntoGivenUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User click on poll button")
    public void user_click_on_poll_button() throws InterruptedException {
        crmPollPage.pollTab.click();
        Thread.sleep(2000);
        
    }
    
    @When("User click on upload file icon")
    public void user_click_on_upload_file_icon() throws InterruptedException {
        crmPollPage.uploadIcon.click();
        Thread.sleep(2000);
        
    }
    
    @Then("User click on Select document from Bixtrix")
    public void user_click_on_select_document_from_bixtrix() {

        crmPollPage.SelectDocumentFromBritix.click();
    }


    @Then("Select document from bixtrix")
    public void selectDocumentFromBixtrix() {
        String windowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(windowHandle);
        Driver.getDriver().findElement(By.xpath("(//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file'])[2]")).click();

    }

    @And("Click Select document button")
    public void clickSelectDocumentButton() {
        crmPollPage.selectDocument.click();
    }

    @And("Verify uploaded item there")
    public void verifyUploadedItemThere() {
        Assert.assertTrue(crmPollPage.uploadedItem.isDisplayed());
    }

    @Then("User click on Upload files and images")
    public void userClickOnUploadFilesAndImages() {
        crmPollPage.UploadFilesAndImages.sendKeys("/Users/home/Desktop/IMG_1252.PNG");
    }


    @Then("User click on download from external drive")
    public void userClickOnDownloadFromExternalDrive() {
        crmPollPage.downloadFromExternal.click();
    }


    @Then("User click all options one by one to make upload")
    public void userClickAllOptionsOneByOneToMakeUpload() {
        String windowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(windowHandle);
        List<WebElement> externalDriveList = Driver.getDriver().findElements(By.xpath("//div[@class='bx-file-dialog-tab-item']"));
        for (WebElement each:externalDriveList) {
            each.click();
            WebElement content = Driver.getDriver().findElement(By.xpath("//div[@class='bx-file-dialog-content']"));
            Assert.assertFalse(content.getText().isEmpty());
        }
    }


}

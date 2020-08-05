package com.bitrix.pages;


import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmPollPage extends BasePage {

    public CrmPollPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")//(//div[@class='diskuf-uploader'])[1]
    //(//span[@class='wd-fa-add-file-light-title'])[1]
    public WebElement UploadFilesAndImages;

    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement SelectDocumentFromBritix;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text'])[1]")
    public WebElement downloadFromExternal;

    @FindBy(xpath = "(//*[contains(text(),'Create using ')])[2]")
    public WebElement createUsingDesktop;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectDocument;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement uploadedItem;

    //@FindBy(id = "n513")
    @FindBy(xpath = "//a[.='Logo.gif']")
    public WebElement logoLink;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreEmail;

    @FindBy(id = "destDepartmentTab_destination2911323")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']/a[1]")
    public WebElement firstEmailAtEmployeesAndDepartments;

    @FindBy(xpath = "//span[@data-id='U537']")
    public WebElement addedEmail;

}

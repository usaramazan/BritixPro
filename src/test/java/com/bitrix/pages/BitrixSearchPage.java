package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BitrixSearchPage {

    public BitrixSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreModule;

    @FindBy(xpath = "//span[text()='Workflow']")
    public WebElement workflowModule;

    @FindBy(xpath = "(//a[text()='Close'])[2]")
    public WebElement closeTab;

    @FindBy(xpath = "//a[text()='23']")
    public WebElement startDate;

    @FindBy(xpath = "//a[text()='25']")
    public WebElement endDate;

    







    @FindBy(xpath = "//span[text()='Leave Approval']")
    public WebElement leaveApprovalModule;

    @FindBy(xpath = "//span[text()='Business Trip']")
    public WebElement businessTripModule;

    @FindBy(xpath = "//span[text()='General Requests']")
    public WebElement generalRequestModule;

    @FindBy(xpath = "//span[text()='Expense Report']")
    public WebElement expenseReportModule;

    @FindBy(xpath = "//span[text()='Workflows Directory']")
    public WebElement workflowsDirectoryModule;





}

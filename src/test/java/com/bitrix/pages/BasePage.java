package com.bitrix.pages;


import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskTab;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventTab;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreTab;


}

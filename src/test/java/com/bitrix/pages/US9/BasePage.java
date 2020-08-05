package com.bitrix.pages.US9;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    //create singlton desighn pattern for chose only 1, and Its create connection between our driver and object in this class.
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

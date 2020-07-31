package com.bitrix.pages.US9;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @FindBy (id = "LIVEFEED_search")
    private WebElement viewSearchline;
 //create singlton desighn pattern for chose only 1, and Its create connection between our driver and object in this class.
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //create methods public for clicking everywhere
    public void clickOnSearchLine(){
        System.out.println("Clicking on 'View Search line'");
        wait.until(ExpectedConditions.elementToBeClickable(viewSearchline));
        viewSearchline.click();

    }
}

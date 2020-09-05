package com.bitrix.pages.US9;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AC1_SearchPage extends BasePage{

    @FindBy(id = "LIVEFEED_search")
    private WebElement viewSearchline;

    //create methods public for clicking everywhere
    public void clickOnSearchLine(){
        System.out.println("Clicking on 'View Search line'");
        wait.until(ExpectedConditions.elementToBeClickable(viewSearchline));
        viewSearchline.click();

        //ndsmfd
    }
}

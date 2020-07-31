package com.bitrix.pages;

//uc
//dort

import com.bitrix.utilities.Driver;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLoginPage {


   public CrmLoginPage(){

       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")

    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "user-name")
    public WebElement emailArrow;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logoutButton;
    //iki satir jhijlkasmd
//3 satir hello


}

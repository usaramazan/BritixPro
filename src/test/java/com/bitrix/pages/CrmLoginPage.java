package com.bitrix.pages;

<<<<<<< HEAD
import com.BritixPro.utilities.Driver;
=======

//ucDEDIL DORT
=======



import com.bitrix.utilities.Driver;
import com.bitrix.utilities.Driver;
>>>>>>> 7201c4ac4723c587b7a629750e41baacb6c23d89
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

<<<<<<< HEAD
    @FindBy(id = "user-name")
    public WebElement emailArrow;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logoutButton;
=======



>>>>>>> 7201c4ac4723c587b7a629750e41baacb6c23d89
}

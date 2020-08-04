package com.bitrix.pages.US9;


import com.bitrix.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;



//extends BasePage class
public class LoginPage extends BasePage{
    //also create all locate web elements private
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement emailArrow;

    @FindBy(xpath = "//span[.='Log out']")
    private WebElement logoutButton;

    public void login(String username, String password){
//create wait for every new page!
        wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(username);
        usernameInput.sendKeys(username+ Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
        passwordInput.sendKeys(password+Keys.ENTER);

        // 1st way we use SCENARIO OUTLINE: delete keywords and put new at the same time!
        usernameInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

 /* public void login(){

 //2-nd way we use CONFIGURATION PROPERTIES to login
//create ArrayList and put all usernames
ArrayList<String> usernames = new ArrayList<>(Arrays.asList("username1", "username2", "username3", "username4", "username5", "username6"));
//create loop to run all of them
for(int i = 0; i< usernames.size(); i++) {

    String userName = ConfigurationReader.getProperty(usernames.get(i));
//password the same
    String password = ConfigurationReader.getProperty("password");
//this line delete and write new keyword at the same time
    usernameInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), userName);
    passwordInput.sendKeys(password, Keys.ENTER);
//put if statement for logout
    if(emailArrow.isDisplayed()){
       logout();

       }

    }

    }

 */

    public void logout(){
        wait.until(ExpectedConditions.visibilityOf(emailArrow));
        emailArrow.click();
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
        Driver.closeDriver();

    }


}

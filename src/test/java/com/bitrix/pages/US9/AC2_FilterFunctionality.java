package com.bitrix.pages.US9;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC2_FilterFunctionality extends BasePage{

    @FindBy(xpath = "//span[.='Add field']")
    private WebElement addFieldButton;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-list-item main-ui-select-inner-item main-ui-checked']")
    private WebElement checkboxes;


   // @FindBy(xpath = "//div[@data-id='field_DATE_CREATE']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[1]")
    private WebElement dateCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_EVENT_ID']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[2]")
    private WebElement typeCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_CREATED_BY_ID']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[3]")
    private WebElement authorCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_TO']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[4]")
    private WebElement toCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_FAVORITES_USER_ID']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[5]")
    private WebElement favoritesCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_TAG']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[6]")
    private WebElement tagCheckbox;

    //@FindBy(xpath = "//div[@data-id='field_EXTRANET']")
    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[7]")
    private WebElement extranetCheckbox;


    @FindBy(xpath = "//div[@class='main-ui-filter-field-button-inner']/..")
    private WebElement searchButton;


    public void clickAddFieldButton(){

        wait.until(ExpectedConditions.visibilityOf(addFieldButton));
        addFieldButton.click();

    }

    public void setCheckboxes(){
        System.out.println("check if checkboxes are clicking");
     ArrayList<WebElement> addCheckboxes = new ArrayList<WebElement>(
        Arrays.asList(dateCheckbox,typeCheckbox, authorCheckbox,
                toCheckbox,favoritesCheckbox, tagCheckbox, extranetCheckbox));

        for(int i =0; i<addCheckboxes.size(); i++) {

        wait.until(ExpectedConditions.visibilityOf(addCheckboxes.get(i)));
          if (addCheckboxes.get(i).isSelected()){

              continue;
           }else{

              addCheckboxes.get(i).click();
           }


        }


    }

}



  /*  public void clickDataLine (){
        wait.until(ExpectedConditions.visibilityOf(dateLine));
        dateLine.click();
        Select dataSelect = new Select (dateLine);

        dataSelect.selectByVisibleText("Any date");
        ArrayList<String> dateVariables = new ArrayList<>(Arrays.asList(
                "Any date","Yesterday","Current day","This week",
                "This month","Current quarter","Last 7 days","Last 30 days",
                "Last 60 days","Last 90 days","Last N days","Month","Quarter",
                "Year","Exact date","Last week","Last month","Custom range"));

        for (String each: dateVariables){

            dataSelect.selectByVisibleText(each);
            wait.until(ExpectedConditions.visibilityOf(searchButton));
            searchButton.click();

        }
    }

   */


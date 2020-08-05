package com.bitrix.stepDefinitions;

import com.BritixPro.pages.CrmLoginPage;
import com.BritixPro.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    CrmLoginPage crmLoginPage = new CrmLoginPage();
    @Before
    public void setUp(Scenario scenario){
         System.out.println("scenario = " + scenario.getName());

    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
            // take screenshot using selenium
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // attach to report
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

}

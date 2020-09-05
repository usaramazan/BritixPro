package com.bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},

        //"json:target/cucumber.jason","rerun:target/rerun.txt"
        features = "src/test/resources/features",
        glue = "com/bitrix/stepDefinitions",
        dryRun = false,
        tags = "@AC2"

        //change

)

public class CukeRunner {


}


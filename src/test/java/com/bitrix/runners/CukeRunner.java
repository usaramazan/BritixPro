package com.bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


<<<<<<< HEAD
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html","json:target/cucumber.json","rerun:target/rerun.txt","junit:target/cucumber.xml"},
        //"json:target/cucumber.json","rerun:target/rerun.txt"
        features = "src/test/resources/features",
        glue = "com/crm24/stepdefinitions",
        dryRun = false,
        tags = "@email"
)
=======
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumber-report.html","json:target/cucumber.jason","rerun:target/rerun.txt"},
            features = "src/test/resources/features",
            glue = "com/bitrix/stepDefinitions",
            dryRun = false,
            tags = "@ac1"
>>>>>>> 7201c4ac4723c587b7a629750e41baacb6c23d89

public class CukeRunner {


}


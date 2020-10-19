package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features",// copied from content root "feature"
                   glue = "com\\vytrack\\step_definitions",  // copied from source root " step definitions"
                    dryRun = false)

public class CucumberRunner {
    // running cucumber test scenarios

}

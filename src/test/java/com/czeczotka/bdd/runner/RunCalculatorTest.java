package com.czeczotka.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "json:target/cucumber-report/C72SeleniumTest.json" },
        glue = "com.czeczotka.bdd.steps",
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}

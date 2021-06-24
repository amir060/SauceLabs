package com.swaglabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target/site/cucumber-pretty.html"},
        snippets =CucumberOptions.SnippetType.CAMELCASE,
        //specify step definition package
        glue = {"com/swaglabs/stepsdefinition"},
        features ={"src/test/resources/features"},
        tags = "@Checkout",
        dryRun = true,
        monochrome =true,
        publish = true
)
public class TestRunner {


}

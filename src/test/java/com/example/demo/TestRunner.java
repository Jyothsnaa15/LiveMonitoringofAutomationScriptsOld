package com.example.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.demo.steps",
        tags = "not @skip",
        plugin = {"pretty", "json:target/cucumber-report.json"},
        publish = true
)

public class TestRunner {
}

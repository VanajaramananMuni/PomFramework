package com.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/LoginTestcase.feature", // Use relative path
    glue = "com.stepsdefnition", // Use correct package name
    plugin = {"pretty", "html:target/cucumber-reports"}, // Reporting
    monochrome = true // Improves console output readability
)
public class Runner extends AbstractTestNGCucumberTests {
	
	
	
	
}


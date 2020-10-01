package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/java/com/api/cucumber/featureFile/Login.feature"},
		glue = {"com.api.cucumber.stepDefinition"},
		dryRun = true,
		monochrome = true
		)
public class UserLogin {

}

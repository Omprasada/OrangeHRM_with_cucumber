package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue={"com.stepdefinition"},
		monochrome = true,
		plugin = {"html:Reports\\HTMLReports" , 
				"json:Reports\\jsonReports\\cucumber.json" , 
				"junit:Reports\\junitReports\\cucmber.xml"},
		dryRun = true)

public class RunnerClass {

}

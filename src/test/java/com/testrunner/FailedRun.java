package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "@target/failedrerun.txt", glue="com/Stepdefinations", publish=true, 
plugin= {"json:target/jsonreports/cucumber-report.json", "html:target/htmlreports/cucumber-report.html", "rerun:target/failedrerun.txt"})
public class FailedRun extends AbstractTestNGCucumberTests {

}

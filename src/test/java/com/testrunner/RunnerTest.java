package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/resources/Myntra.feature", glue="com/Stepdefinations", publish=true, 
plugin= {"json:target/jsonreports/cucumber-report.json", "html:target/htmlreports/cucumber-report.html", "rerun:target/failedrerun.txt"}
)
public class RunnerTest extends AbstractTestNGCucumberTests{

}

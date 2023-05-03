package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/resources/Myntra.feature", glue="com/Stepdefinations")
public class RunnerTest extends AbstractTestNGCucumberTests{

}

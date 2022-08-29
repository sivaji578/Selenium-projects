package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",snippets= SnippetType.CAMELCASE, glue= {"com.stepdefinition"},monochrome=true,
plugin = {"pretty","html:target/output.html"})
public class Runner {

}

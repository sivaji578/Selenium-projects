package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
         features = ".//feature/NewProposal.feature",
         glue="stepDefinition",dryRun=false,monochrome = true)


public class TestRunner{
}

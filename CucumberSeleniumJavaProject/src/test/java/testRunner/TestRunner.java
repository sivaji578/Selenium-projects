package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/CucumberSeleniumJavaProject/src/test/java/stepDefinition/LoginClass.java",glue={"stepDefinition"},monochrome=true)
public class TestRunner {
}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\WorksiteLabsAllProjects\\WorkSiteLabs\\NH5UpworkProject\\src\\test\\java\\features\\ManageService.feature",
plugin = { "pretty", "html:target/cucumber-reports" },
glue={"stepDefinition"},monochrome=true)



public class ManageServiceRunner {

}

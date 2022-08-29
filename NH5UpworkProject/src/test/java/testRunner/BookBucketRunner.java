package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\WorksiteLabsAllProjects\\WorkSiteLabs\\NH5UpworkProject\\src\\test\\java\\features\\BookBucket.feature",
glue={"stepDefinition"},monochrome=true)
//plugin = { "pretty", "html:target/cucumber-reports" },
public class BookBucketRunner {

}
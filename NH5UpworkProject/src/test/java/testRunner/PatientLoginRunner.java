package testRunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)	
@CucumberOptions(features="D:\\WorksiteLabsAllProjects\\WorkSiteLabs\\NH5UpworkProject\\src\\test\\java\\features\\PatientLogin.feature",
plugin = { "pretty", "html:target/cucumber-reports" },glue={"stepDefinition"},
        monochrome=true
       )
	//tags="@testMe"
//"src/test/java/features/PatientLoginRunner.fearures",


public class PatientLoginRunner {
	
}
                     
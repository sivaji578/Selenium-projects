package testRunner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)	
@CucumberOptions(features="src/test/java/features",

        glue={"stepDefinition"},
        monochrome=true
       )
	//tags="@testMe"
public class PatientLoginRunner {
	
}

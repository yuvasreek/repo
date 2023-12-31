package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; //yuva

@RunWith(Cucumber.class) //ponnuvel
@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations",tags="@PortalTest",strict=true,monochrome=true,
	    plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {

}

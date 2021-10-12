package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/addition.feature",
		glue="StepDefinition",
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target/htmlReport.html","json:target/jsonReport/report.json"}
		)
public class AddRunner
{
	
}

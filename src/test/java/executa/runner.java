package executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "tests",
		tags = "@formulario",
		plugin = {"pretty",  "json:target/report-json"},
		dryRun = false,
		monochrome = true		
		)

public class runner {

}

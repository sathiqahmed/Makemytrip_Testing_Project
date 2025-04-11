package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/Features/MakemyTrip.feature",
	glue="step", 
	dryRun = false, 
	monochrome = true, 
	snippets = SnippetType.CAMELCASE,
	plugin = {"pretty","html:target/Reports/Demo.html"})

	public class TripRun {
}


package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@OMT-7932",
        dryRun = false
)
//ReRunner allows to ReRun only scenario that failed. And stores failure line in rerun.txt file
public class Runner {
}

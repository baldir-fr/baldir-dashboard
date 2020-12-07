import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

/**
 * This is the entry point of Hello feature testing. It will fetch and glue step definitions defined in other test classes.
 */
@RunWith(Cucumber::class)
@CucumberOptions(
    plugin = [
        "pretty",
        "html:build/reports/acceptance/cucumberReport.html",
        "summary",
        "json:build/reports/acceptance/cucumberReport.json"
    ],
    strict = true
)
class HelloCucumberTestRun
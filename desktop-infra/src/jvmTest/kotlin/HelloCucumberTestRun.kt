import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(plugin = ["pretty", "html:build/reports/acceptance/cucumberReport.html", "summary"], strict = true)
class HelloCucumberTestRun
import fr.baldir.dashboard.domain.Hello
import io.cucumber.java8.En
import io.cucumber.java8.Scenario
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotSame
import org.junit.jupiter.api.Assertions.assertSame

var lastHelloInstance: HelloStepDefinitions? = null

class HelloStepDefinitions : En {
    var lastGreeting: String? = null

    init {

        Before { scenario: Scenario ->
            assertNotSame(this, lastHelloInstance)
            lastHelloInstance = this
        }

        BeforeStep { scenario: Scenario ->
            assertSame(this, lastHelloInstance)
            lastHelloInstance = this
        }

        AfterStep { scenario: Scenario ->
            assertSame(this, lastHelloInstance)
            lastHelloInstance = this
        }

        After { scenario: Scenario ->
            assertSame(this, lastHelloInstance)
            lastHelloInstance = this
        }

        Given("^A default$") {}
        When("^greeting is not addressed anyone specific$") {
            lastGreeting = Hello().hello()
        }
        When("^greeting is addressed to \"([^\"]*)\"$") { target: String? ->
            lastGreeting = Hello().hello(target!!)
        }
        Then("^the greeting is \"([^\"]*)\"$") { expectedGreeting: String? ->
            assertEquals(expectedGreeting, lastGreeting)
        }
    }
}
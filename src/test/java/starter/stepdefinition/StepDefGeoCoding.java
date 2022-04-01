package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.DataGeoCoding;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class StepDefGeoCoding {
    @Steps
    DataGeoCoding dataGeoCoding;

    @When("I put parameter value")
    public void iPutParameterValue() {
        dataGeoCoding.data();
    }

    @Then("the resulting should be appears")
    public void theResultingShouldBeAppears() {
        restAssuredThat(response ->response.statusCode(200));
    }
}

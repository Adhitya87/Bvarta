package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.RouteService;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class StepDefRouteService {
    @Steps
    RouteService routeService;

    @When("I look up location by street name")
    public void iLookUpLocationByStreetName() {
            routeService.location();
    }

    @Then("the resulting location should be appears")
    public void theResultingLocationShouldBeAppears() {
        restAssuredThat(response ->response.statusCode(200));
    }
}

package starter.step;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class RouteService {
    public static String URLCreate="http://52.76.248.34:5020/api/v1.0/lokasimaps/geocoding?text=Jalan-sudirman-jakarta-pusat";

@Step
    public void location()
{
    Response res = given()

            .header("Accept", "application/json")
            .header("Content-type", "multipart/form-data")
            .multiPart("language", "id")
            .multiPart("unit", "mi")
            .multiPart("waypoints", "106.642914,-6.092763;111.924438,-7.326218")
            .multiPart("alternative", "true")
            .multiPart("avoid", "toll")
            .multiPart("origin", "107.016449%2C-6.230493")
            .multiPart("destination", "106.636219%2C-6.205489")
            .multiPart("prefered", "toll")
            .multiPart("mode", "car")
            .multiPart("departure", "2022-03-10 09:01:00")
            .multiPart("arrival", "2022-03-10 09:01:00")
            .when()
            .get(URLCreate);

    System.out.println(res.getStatusCode());

    System.out.println(res.jsonPath().prettify());
}
}

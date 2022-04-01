package starter.step;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class DataGeoCoding {
    public static String URLCreate="http://52.76.248.34:5020/api/v1.0/lokasimaps/geocoding?text=banjarbaru";

    @Step
    public void data()
    {
        Response res = given()

                .header("Accept", "application/json")
                .header("Content-type", "multipart/form-data")
                .multiPart("text", "banjarbaru")
                .when()
                .get(URLCreate);

        System.out.println(res.getStatusCode());
        System.out.println(res.jsonPath().prettify());
    }

}

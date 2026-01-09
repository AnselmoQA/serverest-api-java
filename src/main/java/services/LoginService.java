package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class LoginService {

    private static final String BASE_URL = "https://serverest.dev";

    public Response login(String email, String password) {

        JSONObject body = new JSONObject();
        body.put("email", email);
        body.put("password", password);

        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .post("/login");
    }
}

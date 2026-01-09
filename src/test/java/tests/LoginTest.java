package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import services.LoginService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginTest {

    LoginService loginService = new LoginService();

    @Test
    public void deveRealizarLoginComSucesso() {

        Response response = loginService.login(
                "fulano@qa.com",
                "teste"
        );

        assertEquals(200, response.statusCode());
        assertNotNull(response.jsonPath().getString("authorization"));
        assertEquals("Login realizado com sucesso",
                response.jsonPath().getString("message"));
    }
}

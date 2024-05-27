import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoblazeAPITests {

    private static final String BASE_URL = "https://api.demoblaze.com/";

    @Test
    @Order(1)
    public void testSignup() {
        // Define signup payload
        String signupBody = "{\"username\": \"testaaa@test.com\", \"password\": \"Test@123\"}";

        // Send POST request to signup endpoint
        given()
                .contentType(ContentType.JSON)
                .body(signupBody).log().all()
                .when()
                .post(BASE_URL + "signup")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                //validate on the success sign up status code.
                .statusCode(200);
    }

    @Test
    @Order(2)
    public void testLogin() {
        // Define login payload
        String loginBody = "{\"username\": \"testaaa@test.com\", \"password\": \"Test@123\"}";

        // Send POST request to login endpoint
        given()
                .contentType(ContentType.JSON)
                .body(loginBody).log().all()
                .when()
                .post(BASE_URL + "login")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                //validate on the success login status code.
                .statusCode(200);
    }


}

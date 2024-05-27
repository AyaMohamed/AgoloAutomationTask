import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetstoreAPITests {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    private static final String API_KEY = "your_api_key";


    @BeforeAll
    public static void setUp() {
        baseURI = BASE_URL;
    }

    @Test
    @Order(1)
    public void testAddPet() {
        //1. define request body.
        //2. define request content type
        //3. log request body
        //4. send request to the specific endpoint.
        //5. log response
        //6. validate on the response

        String requestBody = "{\"id\": 10293939, \"name\": \"puppy\", \"status\": \"available\"}";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBody)
                .log().all()
                .when()
                .post(BASE_URL + "/pet")
                .then()
                .log().all();

        // Send POST request to add a pet
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBody)
                .post(BASE_URL + "/pet");

        // Validate response
        response.then().statusCode(200);
        response.then().contentType(ContentType.JSON);
        response.then().body("id", equalTo(10293939));
        response.then().body("name", equalTo("puppy"));
        response.then().body("status", equalTo("available"));
    }

    @Test
    @Order(2)
    public void testGetPet() {
        given()
                .accept(ContentType.JSON)
                .when()
                .get("/pet/10293939")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", equalTo(10293939))
                .body("name", equalTo("puppy"))
                .body("status", equalTo("available"));
    }


    @Test
    @Order(3)
    public void testUpdatePet() {
        String requestBody = "{\"id\": 10293939, \"name\": \"puppy\", \"status\": \"sold\"}";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("/pet")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id", equalTo(10293939))
                .body("name", equalTo("puppy"))
                .body("status", equalTo("sold"));
    }

    @Test
    @Order(4)
    public void testDeletePet() {
        given()
                .accept(ContentType.JSON)
                .when()
                .delete("/pet/10293939")
                .then()
                .statusCode(200);
    }
}

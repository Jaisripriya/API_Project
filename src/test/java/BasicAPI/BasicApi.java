package BasicAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import APIPayLoad.Payload;

public class BasicApi {
public static void main(String[] args) {
	
	RestAssured.baseURI="https://rahulshettyacademy.com/";
	System.out.println("\nPOST METHOD: \n");
	
	given().log().all().queryParam("key", "qaclick123").header("content-type", "application/json").body(Payload.cre)
	
}

}

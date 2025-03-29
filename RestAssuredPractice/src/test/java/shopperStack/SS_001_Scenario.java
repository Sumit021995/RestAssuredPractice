package shopperStack;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import shopperStackPayloads.ShopperProfilePayload;

public class SS_001_Scenario {

	@Test
	public  void test_API_001() {
		// Shopper Profile
		// Register as a shopper
		
		given()
		.when()
		.then();		
		//given - all input details 
		//when - Submit the API -resource,http method
		//Then - validate the response
		
		        // 🔥 Disable SSL Verification
		        RestAssured.useRelaxedHTTPSValidation();

		        // 🔥 Set Base URI
		        RestAssured.baseURI = "https://www.shoppersstack.com/shopping";

		        // 🔥 Send Login Request
		        String response = 
		        	given()
		        		.header("Content-Type", "application/json")
		        		.body(ShopperProfilePayload.loginPayload())
		            .when()
		            	.post("/users/login")
		            .then()
		            	.extract().response().asString();

		        System.out.println("==================");
		        System.out.println(response);
		        JsonPath js=new JsonPath(response); //for parsing Json
		        String email = js.getString("data.email");
		        System.out.println("==================");
		        System.out.println(email);
		        String zoneId = js.getString("data.zoneId");
		        String role = js.getString("data.role");
		        String userId = js.getString("data.userId");
		        String jwtToken = js.getString("data.jwtToken");
		        System.out.println(zoneId);
		        System.out.println(role);
		        System.out.println(userId);
		        System.out.println(jwtToken);
		        
		        String getResponse = given()
		        	.queryParam("zoneId", zoneId)
		        	.header("Authorization", "Bearer " + jwtToken)
		        .when()
		        	.get("/products")
		        .then()
		        	.assertThat()
		        	.statusCode(200)
		        	.extract()
		        	.response()
		        	.asString();
		        	
		        System.out.println("++++++++++++");
		        System.out.println(getResponse);
		        
		    }
		

//		String placeId=js.getString("place_id");
//		
//		System.out.println(placeId);
//		
//		//Update Place
//		String newAddress = "Summer Walk, Africa";
//		
//		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body("{\r\n" + 
//				"\"place_id\":\""+placeId+"\",\r\n" + 
//				"\"address\":\""+newAddress+"\",\r\n" + 
//				"\"key\":\"qaclick123\"\r\n" + 
//				"}").
//		when().put("maps/api/place/update/json")
//		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
//		
//		//Get Place
//		
//	String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
//		.queryParam("place_id",placeId)
//		.when().get("maps/api/place/get/json")
//		.then().assertThat().log().all().statusCode(200).extract().response().asString();
//	JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
//	String actualAddress =js1.getString("address");
//	System.out.println(actualAddress);
//	Assert.assertEquals(actualAddress, "Pacific ocean");
//	//Cucumber Junit, Testng	
		
	}




package shopperStack;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import shopperStackPayloads.ShopperProfilePayload;

public class SS_001_Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// validate if Add Place API is workimg as expected 
		//Add place-> Update Place with New Address -> Get Place to validate if New address is present in response
		
		//given - all input details 
		//when - Submit the API -resource,http method
		//Then - validate the response
		
		        // 🔥 Disable SSL Verification
		        RestAssured.useRelaxedHTTPSValidation();

		        // 🔥 Set Base URI
		        RestAssured.baseURI = "https://www.shoppersstack.com/shopping";

		        // 🔥 Send Login Request
		        String response = 
		        	given().log().all()
		        		.header("Content-Type", "application/json")
		        		.body(ShopperProfilePayload.loginPayload())
		            .when()
		            	.post("/users/login")
		            .then().assertThat().statusCode(200)
		            	.body("data.email", equalTo("sumitofficial021995@gmail.com"))
		            	.extract().response().asString();

		        System.out.println("==================");
		        System.out.println(response);
		        JsonPath js=new JsonPath(response); //for parsing Json
		        String string = js.getString("data.email");
		        System.out.println("==================");
		        System.out.println(string);
		        
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




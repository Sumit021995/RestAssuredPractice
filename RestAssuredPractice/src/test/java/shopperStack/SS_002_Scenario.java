package shopperStack;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class SS_002_Scenario {
	@Test
	public void test_API_002()
	{
		 // 🔥 Disable SSL Verification
        RestAssured.useRelaxedHTTPSValidation();
        
     // 🔥 Set Base URI
        RestAssured.baseURI = "https://www.shoppersstack.com/shopping";
        
        given()
        	.header("Content-Type","application/json")
        	.when().then();

	}
}

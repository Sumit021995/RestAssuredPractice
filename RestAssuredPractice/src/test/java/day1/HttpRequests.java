package day1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HttpRequests 
{
	int id;

//	@Test(priority=1)
	void getUserList()
	{
		given()
		
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
		
	}
	
	/*
	{
    "name": "morpheus",
    "job": "leader"
	}
	 */
//	@Test(priority=2)
	void createUser()
	{
		HashMap data = new HashMap();
		data.put("name", "Sumit");
		data.put("job", "Test Engineer");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
	}
	
	@Test(priority=3)
	void createUserForGettingId()
	{
		HashMap data = new HashMap();
		data.put("name", "Sumit");
		data.put("job", "Test Engineer");
		
		id=given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
//		.then()
//		.statusCode(201)
//		.log().all();
	}
	
	@Test(priority=4,dependsOnMethods = {"createUserForGettingId"})
	void updateUser()
	{
		HashMap data = new HashMap();
		data.put("name", "Amit");
		data.put("job", "Teacher");
		
		given()
				.contentType("application/json")
				.body(data)
		.when()
				.put("https://reqres.in/api/users/"+id)
		.then()
				.statusCode(200)
				.log().all();
	}

/*
	{
    "name": "Sumit",
    "job": "Test Engineer",
    "id": "571",
    "createdAt": "2024-12-21T16:02:47.598Z"
	}
 */

	@Test(priority=5,dependsOnMethods = {"createUserForGettingId"})
	void deleteUser()
	{
		given()
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(204)
			.log().all();
	}
}
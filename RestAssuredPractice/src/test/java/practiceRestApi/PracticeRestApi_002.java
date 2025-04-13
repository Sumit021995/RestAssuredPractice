package practiceRestApi;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import files.ReUsableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PracticeRestApi_002 {

//	@Test(dataProvider = "BooksData")
//	public void addBook(String isbn, String aisle)
//	{
//		RestAssured.baseURI = "http://216.10.245.166";
//		String resp= given()
//						.header("Content-Type", "application/json")
//						.body(Payload.Addbook(isbn, aisle))
//					.when()
//						.post("/Library/Addbook.php")
//					.then()
//						.assertThat()
//						.statusCode(200)
//						.extract()
//						.response()
//						.asString();
//
//		JsonPath jsPath = ReUsableMethods.rawToJson(resp);
//		String id = jsPath.get("ID");
//		System.out.println(id);
//	}
//	@DataProvider(name="BooksData")
//	public Object[][] getData()
//	{
//		return new Object[][] { {"qwer","4562"},{"asdf","7894"},{"zxcv","5236"}};
//	}
}

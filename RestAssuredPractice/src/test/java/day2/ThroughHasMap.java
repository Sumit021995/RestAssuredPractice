package day2;

import java.util.HashMap;

 import static io.restassured.RestAssured.*;import static io.restassured.matcher.RestAssuredMatchers.*;import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class ThroughHasMap {
	@Test
	void createUser()
	{
		HashMap data = new HashMap();
		data.put("name", "Amit");
		data.put("age", 29);
		data.put("job", "Teacher");
		
		given()
			.
	}
}

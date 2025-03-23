package practiceRestApi;

import io.restassured.path.json.JsonPath;
import practicePayload.PayloadSample1;

public class PracticeRestApi_001 {
	public static void main(String[] args) {
		
		JsonPath jp = new JsonPath(PayloadSample1.samplePayload_001());
		int int1 = jp.getInt("courses.size()");
		System.out.println(int1);
	}
}

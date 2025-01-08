package day2;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ThroughHasMap {
	@Test
	void createUser()
	{
		HashMap data = new HashMap();
		data.put(data, data);
	}
}

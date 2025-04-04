package shopperStackPayloads;

public class ShopperRegisterPayload {
	 public static String shopperRequestPayload()
	 {
		 String email="sumitofficial021995@gmail.com";
		 String city="Bangalore";
		 String country="India";
		 String state="Karnataka";
		 String firstName="Sumit";
		 String LastName="Saurav";
		 String password="Infocus";
		 String phone="9818425197";
		 
		 return "{\r\n"
		 		+ "  \"city\": \"string\",\r\n"
		 		+ "  \"country\": \"string\",\r\n"
		 		+ "  \"email\": \"string\",\r\n"
		 		+ "  \"firstName\": \"string\",\r\n"
		 		+ "  \"gender\": \"MALE\",\r\n"
		 		+ "  \"lastName\": \"string\",\r\n"
		 		+ "  \"password\": \"string\",\r\n"
		 		+ "  \"phone\": 0,\r\n"
		 		+ "  \"state\": \"string\",\r\n"
		 		+ "  \"zoneId\": \"string\"\r\n"
		 		+ "}";
	 }
}

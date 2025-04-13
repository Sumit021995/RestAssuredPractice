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
		 		+ "  \"city\": \""+city+"\",\r\n"
		 		+ "  \"country\": \""+country+"\",\r\n"
		 		+ "  \"email\": \""+email+"\",\r\n"
		 		+ "  \"firstName\": \""+firstName+"\",\r\n"
		 		+ "  \"gender\": \"MALE\",\r\n"
		 		+ "  \"lastName\": \""+LastName+"\",\r\n"
		 		+ "  \"password\": \""+password+"\",\r\n"
		 		+ "  \"phone\": ++,\r\n"
		 		+ "  \"state\": \"string\",\r\n"
		 		+ "  \"zoneId\": \"string\"\r\n"
		 		+ "}";
	 }
}

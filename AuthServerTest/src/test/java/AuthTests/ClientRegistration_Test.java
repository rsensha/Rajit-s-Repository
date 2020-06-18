package AuthTests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ClientRegistration_Test {
	
	@Test()
	public void ClientRegistrationValidation() {
		
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("clientname", "POIli");
		jobj.put("hostname", "localhost1");
		jobj.put("clientcontact_no", "033");
		jobj.put("clientcontact_email", "asmaka@gmail.com");
		jobj.put("username", "Asma");
		jobj.put("loginid", "ffg");
		jobj.put("emailid", "abc@gmail.com");
		
	
		
		given().
			body(jobj.toJSONString()).
			contentType("application/json").
		when().
			post("http://13.126.112.227:9000/registerclients").
		then().statusCode(200).log().all();
		
//		contentType("text/plain; charset=UTF-8")
		
	}

}

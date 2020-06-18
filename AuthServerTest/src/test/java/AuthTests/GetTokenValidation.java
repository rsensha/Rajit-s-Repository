package AuthTests;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetTokenValidation {
	
	String token = null;
	
Properties prop = new Properties();
	
	@BeforeMethod
	public void setup() throws Exception{
	FileInputStream ip = new FileInputStream("./src/main/java/Config/config.properties");
	prop.load(ip);
	
	}
	
	@Test(enabled = false,priority = 1)
	public void gettokenvalidation() {
		
		JSONObject obj = new JSONObject();
		obj.put("password", "1-p0VHQmnu+SKYi2Qily8ga5+0ioRVpZIW");
		obj.put("loginid", "1-ADfSU68sqEEvodzmSXiHLVKgPjrJuw==");
		obj.put("clientid", "1-aL/LUeM/yDgyXcuaXZ4Mp6vgZs16BoD6WsYU39xIGvf9Cf8hw3qZpAonlAxweRLP");
		obj.put("clientsecret", "1-18PrmW3buRxpxpAM311UuGuBUpV2icPtyQCHedTpnr8m0MjpRhZH54netHrPFbPBeP6OFyntyx2wG9U7fyO6ZvroSAM=");
		
		
	Response resp= 	given().body(obj.toJSONString()).contentType("application/json").
					when().post("http://3.7.69.241:9000/gettoken").
					then().statusCode(200).using().extract().response();
	
	 token= resp.jsonPath().get("access_token");
	System.out.println("Body>>>>>>> " + token);
		
	}
	
	@Test(enabled = false, priority = 2)
	public void usercreation() {
		
		JSONObject obj = new JSONObject();
		
//		obj.put("access_token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXNzd29yZCI6IjEtYnBHMkZlUTYzelFUNDUvTGE1cFlxR2VpVjJpam8rQUwiLCJsb2dpbmlkIjoiMS1KRjlYNGpPdWpaUk04VDZ5SHZ2YUZKVWJmQT09IiwiY2xpZW50aWQiOiIxLUVvck9yY2FZdU1jQnByenI1NThobzRIdUZmZS9DcDIyTkdtYURDdEVJVGZWR2lpQko5cVltVjk3VXRvZ3o0NFciLCJjbGllbnRzZWNyZXQiOiIxLUJ5eCtYd2JhMTBPdG1WdU4ybHpJQmViL1lDR0RxYk52Ui9OeGdpTXRUQ0ZyMzJhNjVMaG9ReGJieUxpYm5JbVdBbkZEbTRacWFsRDB3OVFBMkQxcmlsYjUzRFE9In0.FRYAeh8Fm4HxTRG3s6bRAeZWgxhz4SYSfRDmjOzx5IY");
		obj.put("loginid", "testinguser218");
		obj.put("username", "testinguser213");
		obj.put("emailid", "bca@abc");
		obj.put("Contact_No", "453373");
	 Response resp1 = given().
			 			body(obj.toJSONString()).
			 			contentType("application/json").
			 			headers("Authorization" , "bearer" + token).
			 			
			 		  when().
			 		  	post("http://3.7.69.241:9000/registerusers").
			 		  	
			 		  then().
			 		  	statusCode(200).using().extract().response();
	 
	 String body = resp1.getBody().asString();
			
		
		
		
	
	
	
	
//	System.out.println("Reponse is >>>>>>>    " + body);
	
//	System.out.println("Content type>>>>>>> " + token);
//					resp.contains("token_type");
					
					
		
		
	}
	
	@Test
	public void groupdetails() {
		
		
			System.out.println("URI>>>>>>>>> " +prop.getProperty("URI") +"/getgroupdetails" );
			
			Response resp1 = given().
		 			
					header("usertoken" , "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyY2xpZW50aWQiOiIxLWdjaS95SW9mWUtKRm05V1dDSlpuSU1LU0l0cklKckc5ZE9TQWk2OFRyUFkxVnhYakpRTTUrK3JqYXZZTG9tMUUiLCJ1c2VybG9naW5pZCI6IjEtRXBWZG9Ld0ptcS9LblRVMVdZUFpNR21RZ1B6QzRFMDcwMHVQclZZdiIsInVzZXJpZCI6IjEtWTBUcW9OM0xYRmgvRWFnWUd1aHJQRUd2bEE9PSIsInVzZXJwYXNzd29yZCI6IjEtaVlmekRsNWFMZU9zTWJVQXN0eDhNSFlqNlc4bVhUNHgifQ.YMKaxin31vPo1WefFCPTs4HoMxIJ7giydF5WYxpSK2I").
		 			headers("Authorization" , "bearer" + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXNzd29yZCI6IjEtcDBWSFFtbnUrU0tZaTJRaWx5OGdhNSswaW9SVnBaSVciLCJsb2dpbmlkIjoiMS1BRGZTVTY4c3FFRXZvZHptU1hpSExWS2dQanJKdXc9PSIsImNsaWVudGlkIjoiMS1hTC9MVWVNL3lEZ3lYY3VhWFo0TXA2dmdaczE2Qm9ENldzWVUzOXhJR3ZmOUNmOGh3M3FacEFvbmxBeHdlUkxQIiwiY2xpZW50c2VjcmV0IjoiMS0xOFBybVczYnVSeHB4cEFNMzExVXVHdUJVcFYyaWNQdHlRQ0hlZFRwbnI4bTBNanBSaFpINTRuZXRIclBGYlBCZVA2T0Z5bnR5eDJ3RzlVN2Z5TzZadnJvU0FNPSJ9.uq2G-qQUESe10AyfBihSfS8_GO91pRPKY-qKXy5iPeA").
		 			
		 			
		 		  when().
		 		  	post(prop.getProperty("URI") +"/getgroupdetails").
		 		  	
		 		  then().
		 		  	statusCode(442).using().extract().response();
			
			String bodyofGroup = resp1.jsonPath().get("errormsg");
			System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<< " + bodyofGroup);
			
			Assert.assertEquals("No data found.", bodyofGroup);

		}
		
	}



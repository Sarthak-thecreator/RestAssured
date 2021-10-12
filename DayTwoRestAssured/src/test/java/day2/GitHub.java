package day2;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
public class GitHub {
	@BeforeTest
	public void BeforeTest()
	{
		RestAssured.baseURI="https://api.github.com/orgs/ORG/repos";
		RestAssured.authentication=RestAssured.oauth2("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");
		
	}
 @Test(enabled=true)
  public void gettingAllRepositories() 
  {
	  given()
	  	.auth()
	  	.oauth2("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")
	  .when()
	  		.get()
	  .then()
	  		.log()
	  		.body()
	  		.statusCode(200);
  }
  @Test(enabled=true)
  public void createRepositories() 
  {
	  JSONObject data=new JSONObject();
	  data.put("name","RestAssured1");
	  data.put("description","I am created by Rest Assured Tool");
	  data.put("home page", "https://github.com/Sarthak-thecreator");
	  given()
	  	.auth()
	  	.oauth2("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")
	  	.header("Content-Type","application/json")
	  	.body(data.toJSONString())
	  .when()
	  		.post("https://api.github.com/orgs/ORG/repos")
	  .then()
	  		.log()
	  		.headers()
	  		.statusCode(201)
	  		.time(Matchers.lessThan(8000L),TimeUnit.MILLISECONDS);
  }
}

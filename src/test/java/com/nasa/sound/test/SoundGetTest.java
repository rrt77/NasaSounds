package com.nasa.sound.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SoundGetTest {
	
	
	
	
	@BeforeMethod
	@BeforeTest
	public void setUp(){
		
		RestAssured.baseURI ="https://api.nasa.gov";
		//RestAssured.port =8085;
		RestAssured.basePath ="/planetary/sounds";
	}
	
	
	
		@Test
		public void getStudentFromCSC(){
			
			Response r = given()
			.param("q","apollo")
			.param("limit", 10)
			.param("api_key","DEMO_KEY")
			.when()
			
			.get("/list");
			//.then()
			//.statusCode(200);
			System.out.println(r.body().prettyPrint());
			
			
			
			
		}
		
		
	}



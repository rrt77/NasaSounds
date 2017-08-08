package com.student.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StudentGetTest {
	
	
	
	
	@BeforeMethod
	@BeforeTest
	public void setUp(){
		
		RestAssured.baseURI ="http://localhost";
		RestAssured.port =8085;
		RestAssured.basePath ="/student";
	}
	
	
	@Test
	public void getAllStudentList(){
		
		Response r =given()
		.when()
		.get("/list");
		
		
		System.out.println(r.body().prettyPrint());
		System.out.println("_________________________________________________________________________");
	}
		
		@Test
		public void getAllStudentListAndVerifyStetusCode(){
			
			given()
			.when()
			.get("/list")
			.then()
			.statusCode(200);
			
			System.out.println("_________________________________________________________________________");
			
		}
		
		@Test
		public void getStudentInfo(){
			
			Response r =given()
			.when()
			.get("/1");
			//.then()
			//.statusCode(200);
			System.out.println(r.body().prettyPrint());
			
			given()
			.when()
			.get("/1")
			.then()
			.statusCode(200);
			
			System.out.println("_________________________________________________________________________");
			
			
		}
		
		@Test
		public void getStudentFromCSC(){
			
			Response r = given()
			.param("programme","Computer Science")
			.param("limit", 2)
			.when()
			
			.get("/list");
			//.then()
			//.statusCode(200);
			System.out.println(r.body().prettyPrint());
			System.out.println("_________________________________________________________________________");
			
			
			
		}
		
		
	}



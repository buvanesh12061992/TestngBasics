package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORE CLASS");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
	}
	@Parameters({"sername","password"})
	@Test
	public void test(String name,String pass) {
		System.out.println("TEST CASES1");
		System.out.println(name);
		System.out.println(pass);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After METHOD");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After CLASS");
	}
	
	
}

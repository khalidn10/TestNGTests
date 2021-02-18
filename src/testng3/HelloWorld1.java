package testng3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld1 {
	
	@AfterSuite
	public void afterSuite1_1()
	{
		System.out.println("After Suite 1-1");
	}
	
	@AfterSuite
	public void afterSuite1_2()
	{
		System.out.println("After Suite 1-2");
	}
	
	@AfterTest
	public void afterTest1_1()
	{
		System.out.println("After Test 1-1");
	}
	
	@AfterTest
	public void afterTest1_2()
	{
		System.out.println("After Test 1-2");
	}
	
	@AfterClass
	public void afterClass1_1()
	{
		System.out.println("After Class 1-1");
	}
	
	@AfterClass
	public void afterClass1_2()
	{
		System.out.println("After Class 1-2");
	}
	
	@AfterMethod
	public void afterMethod1_1()
	{
		System.out.println("After Method 1-1");
	}
	
	@AfterMethod
	public void afterMethod1_2()
	{
		System.out.println("After Method 1-2");
	}
	
	@Test
	public void printHelloWorld1_1()
	{
		System.out.println("Hello World 1-1");
	}
	
	@Test
	public void printHelloWorld1_2()
	{
		System.out.println("Hello World 1-2");
	}
	
	@Test
	public void createHelloWorld1_1()
	{
		System.out.println("Create Hello World 1-1");
	}
	
	@BeforeMethod
	public void beforeMethod1_1()
	{
		System.out.println("Before Method 1-1");
	}
	
	@BeforeMethod
	public void beforeMethod1_2()
	{
		System.out.println("Before Method 1-2");
	}
	
	@BeforeClass
	public void beforeClass1_1()
	{
		System.out.println("Before Class 1-1");
	}
	
	@BeforeClass
	public void beforeClass1_2()
	{
		System.out.println("Before Class 1-2");
	}
	
	@BeforeTest
	public void beforeTest1_1()
	{
		System.out.println("Before Test 1-1");
	}
	
	@BeforeTest
	public void beforeTest1_2()
	{
		System.out.println("Before Test 1-2");
	}
	
	@BeforeSuite
	public void beforeSuite1_1()
	{
		System.out.println("Before Suite 1-1");
	}
	
	@BeforeSuite
	public void beforeSuite1_2()
	{
		System.out.println("Before Suite 1-2");
	}
}

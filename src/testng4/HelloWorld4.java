package testng4;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld4 {
	
	@BeforeSuite
	public void beforeSuite4_1()
	{
		System.out.println("Before Suite 4-1");
	}
	
	@BeforeTest
	public void beforeTest4_1()
	{
		System.out.println("Before Test 4-1");
	}
	
	@Test
	public void printHelloWorld4_1()
	{
		System.out.println("Hello World 4-1");
	}
	
	@Test
	public void createHelloWorld4_1()
	{
		System.out.println("Create Hello World 4-1");
	}
	
	@AfterTest
	public void afterTest4_1()
	{
		System.out.println("After Test 4-1");
	}
	
	@AfterSuite
	public void afterSuite4_1()
	{
		System.out.println("After Suite 4-1");
	}
}

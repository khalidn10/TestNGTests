package testng7;

import org.testng.annotations.Test;

public class HelloWorld1 {
	
	@Test(priority=4, description="This is a description of method printHelloWorld1_1")
	public void printHelloWorld1_1()
	{
		System.out.println("Hello World 1-1");
	}
	
	@Test(priority=3, description="This is a description of method printHelloWorld1_2")
	public void printHelloWorld1_2()
	{
		System.out.println("Hello World 1-2");
	}
	
	@Test(dependsOnMethods={"printHelloWorld1_1","printHelloWorld1_2"},
		  dependsOnGroups={"createGroup3"},
		  description="This is a description of method createHelloWorld1_1")
	public void createHelloWorld1_1()
	{
		System.out.println("Create Hello World 1-1");
	}
	
}

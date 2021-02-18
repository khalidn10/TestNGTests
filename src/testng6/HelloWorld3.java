package testng6;

import org.testng.annotations.Test;

public class HelloWorld3 {
	
	@Test
	public void printHelloWorld3_1()
	{
		System.out.println("Hello World 3-1");
	}
	
	@Test
	public void printHelloWorld3_2()
	{
		System.out.println("Hello World 3-2");
	}
	
	@Test(groups={"smokeTest"})
	public void createHelloWorld3_1()
	{
		System.out.println("Create Hello World 3-1");
	}
}

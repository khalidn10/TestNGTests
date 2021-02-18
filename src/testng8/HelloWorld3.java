package testng8;

import org.testng.annotations.Test;

@Test(groups={"createGroup3"})
public class HelloWorld3 {
	
	@Test(priority=1)
	public void printHelloWorld3_1()
	{
		System.out.println("Hello World 3-1");
	}
	
	@Test
	public void printHelloWorld3_2()
	{
		System.out.println("Hello World 3-2");
	}
	
	@Test(priority=2)
	public void createHelloWorld3_1()
	{
		System.out.println("Create Hello World 3-1");
	}
}

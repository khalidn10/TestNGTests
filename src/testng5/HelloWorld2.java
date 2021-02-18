package testng5;

import org.testng.annotations.Test;

public class HelloWorld2 {
	
	@Test
	public void printHelloWorld2_1()
	{
		System.out.println("Hello World 2-1");
	}
	
	@Test(groups={"smokeTest"})
	public void createHelloWorld2_1()
	{
		System.out.println("Create Hello World 2-1");
	}
}

package testng6;

import org.testng.annotations.Test;

public class HelloWorld4 {
	
	@Test
	public void printHelloWorld4_1()
	{
		System.out.println("Hello World 4-1");
	}
	
	@Test(groups={"smokeTest","regressionTest"})
	public void createHelloWorld4_1()
	{
		System.out.println("Create Hello World 4-1");
	}
	
}

package testng8;

import org.testng.annotations.Test;

@Test(timeOut=1500)
public class HelloWorld4 {
	
	@Test
	public void printHelloWorld4_1() throws InterruptedException
	{
		Thread.sleep(800);
		System.out.println("Hello World 4-1");
	}
	
	@Test
	public void printHelloWorld4_2() throws InterruptedException
	{
		Thread.sleep(1200);
		System.out.println("Hello World 4-2");
	}
	
	public void printHelloWorld4_3() throws InterruptedException
	{
		Thread.sleep(1200);
		System.out.println("Hello World 4-3");
	}
	
	@Test(timeOut=1800)
	public void printHelloWorld4_4() throws InterruptedException
	{
		Thread.sleep(1600);
		System.out.println("Hello World 4-4");
	}
	
}

package testng11;

import org.testng.annotations.Test;

public class ParallelTest2 {

	@Test
	public void test1() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 1 complete for ParallelTest2");
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 2 complete for ParallelTest2");
	}
	
	@Test
	public void test3() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 3 complete for ParallelTest2");
	}
	
	@Test
	public void test4() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 4 complete for ParallelTest2");
	}
	
	@Test
	public void test5() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 5 complete for ParallelTest2");
	}
	
}

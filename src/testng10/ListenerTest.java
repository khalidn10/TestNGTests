package testng10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	
	@Test(alwaysRun=true)
	public void successTest1()
	{
		System.out.print("Running successTest1...\t");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="successTest1", alwaysRun=true)
	public void failTest1()
	{
		System.out.print("Running failTest1...\t");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="failTest1", alwaysRun=true)
	public void successTest2()
	{
		System.out.print("Running successTest2...\t");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="successTest2", alwaysRun=true)
	public void failTest2()
	{
		System.out.print("Running failTest2...\t");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="failTest2", alwaysRun=true)
	public void successTest3()
	{
		System.out.print("Running successTest3...\t");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="successTest3", alwaysRun=true)
	public void failTest3()
	{
		System.out.print("Running failTest3...\t");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="failTest3", alwaysRun=true)
	public void successTest4()
	{
		System.out.print("Running successTest4...\t");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="successTest4", alwaysRun=true)
	public void failTest4()
	{
		System.out.print("Running failTest4...\t");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="failTest4", alwaysRun=true)
	public void successTest5()
	{
		System.out.print("Running successTest5...\t");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="successTest5", alwaysRun=true)
	public void failTest5()
	{
		System.out.print("Running failTest5...\t");
		Assert.assertTrue(false);
	}
	
}

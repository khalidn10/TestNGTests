package testng9;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrintParams1 {
	
	@Parameters({"parameter1","parameter2"})
	@Test
	public void pParams1(String pm1, int pm2)
	{
		System.out.println("From PrintParams1:");
		System.out.println("parameter1: " + pm1);
		System.out.println("parameter2: " + pm2);
		System.out.println("");
	}
	
}

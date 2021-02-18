package testng9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	int index = 0;
	
	@Test(dataProvider="getParams")
	public void pParams1(String pm1, Integer pm2, Float pm3)
	{
		index++;
		System.out.println("Params from Row " + index);
		System.out.println("Parameter1: " + pm1);
		System.out.println("Parameter2: " + pm2);
		System.out.println("Parameter3: " + pm3);
		System.out.println("");
	}
	
	@DataProvider
	public Object[][] getParams()
	{
		Object[][] params = new Object[4][3];
		
		//1st set of params 
		params[0][0] = "Param1";
		params[0][1] = Integer.valueOf(1);
		params[0][2] = Float.valueOf(1.0F);
		
		//2nd set of params 
		params[1][0] = "Param2";
		params[1][1] = Integer.valueOf(2);
		params[1][2] = Float.valueOf(2.0F);
		
		//3rd set of params 
		params[2][0] = "Param3";
		params[2][1] = Integer.valueOf(3);
		params[2][2] = Float.valueOf(3.0F);
		
		//4th set of params 
		params[3][0] = "Param4";
		params[3][1] = Integer.valueOf(4);
		params[3][2] = Float.valueOf(4.0F);
		
		return params;
	}
}

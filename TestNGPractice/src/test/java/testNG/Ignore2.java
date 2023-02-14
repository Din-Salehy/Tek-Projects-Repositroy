package testNG;

import org.testng.annotations.Test;

public class Ignore2 {

	@Test 
	public void searchForFlights()
	{
		System.out.println("Ignore2--->Test1");
	}
	@Test 
	public void bookFlights()
	{
		System.out.println("Ignore2--->Test2");
	}
	
	@Test 
	public void SignedOutApp()
	{
		System.out.println("Ignore2--->Test3");
	}
}

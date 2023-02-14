package testNG;

import org.testng.annotations.Test;

public class Group2 {

	
	@Test (groups = {"smoke", "regression"})
	public void searchForFlights()
	{
		System.out.println("Group2 class--->Test1");
	}
	
	
	@Test (groups = {"regression", "functional"})
	public void bookFlights()
	{
		System.out.println("Group2 class--->Test2");
	}
	
	
	@Test (groups = {"smoke", "sanity"})
	public void SignedOutApp()
	{
		System.out.println("Group2 class--->Test3");
	}
}

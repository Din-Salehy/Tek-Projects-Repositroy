package testNG;

import org.testng.annotations.Test;

public class Perioritize {

	@Test (priority =1)
	public void launchApp()
	{
		System.out.println("Application launched");
	}
	
	@Test(priority =2)
	public void signUp()
	{
		System.out.println("Sign up to aplication done");
	}
	@Test (priority =5)
	public void logintoApp()
	{
		System.out.println("logged in to app done");
	}
	@Test (priority =6)
	public void searchForFlights()
	{
		System.out.println("Searching for flights");
	}
	@Test (priority =4)
	public void bookFlights()
	{
		System.out.println("Booked flights");
	}
	
	@Test (priority =3)
	public void SignedOutApp()
	{
		System.out.println("Signed out of the App");
	}
}

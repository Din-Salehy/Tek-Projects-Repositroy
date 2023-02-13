package rahulShetty;

import org.testng.annotations.*;

public class Day3 {

	@Test
	public void createAcc () {
		System.out.println("Account created");
	}
	@Test (groups ={"smoke"})
	public void loginAcc () {
		System.out.println("Account login");
	}
	@Test
	public void logOut () {
		System.out.println("Account logout");
	}
	@Test
	public void checkAcc () {
		System.out.println("Account checked");
	}
	@BeforeSuite
	public void beforeSuitCheck () {
		System.out.println("Before suite checked");
	}
	
	@AfterMethod
	public void AfterMethodCheck () {
		System.out.println("After method checked");
	}
	
	@BeforeClass
	public void BeforeClass () {
		System.out.println("Before class checked");
	}
	
	@AfterClass
	public void AfterClass () {
		System.out.println("After class checked");
	}
	
}

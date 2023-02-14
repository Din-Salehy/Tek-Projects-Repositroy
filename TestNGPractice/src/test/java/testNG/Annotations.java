package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class Annotations {
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Beofre class Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Method");

	}

}

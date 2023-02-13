package rahulShetty;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void startCar() {
		System.out.println("Car started");
	}
	@Test
	public void stopCar () {
		System.out.println("Car stopped");
	}
	@Test (groups ={"smoke"})
	public void checkEngine() {
		System.out.println("Engine checked");
	}
	@BeforeTest
	public void beforeTestCheck() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTestCheck() {
		System.out.println("After Test");
	}
	
	
}

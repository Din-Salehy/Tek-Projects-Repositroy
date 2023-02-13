package rahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	WebDriver driver;

	@Test
	public void login() {

		System.out.println("Test login");

}
	@Test (groups ={"smoke"})
	public void logout() {
		System.out.println("Test logout");
	}
	@Test
	public void loginValidation() {
		System.out.println("Login validation test");
	}
	@AfterSuite
	public void afterSuitcheck() {
		System.out.println("After suite test ");
	}
}
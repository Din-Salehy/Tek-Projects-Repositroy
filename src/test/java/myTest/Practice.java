package myTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	WebDriver driver;

	@Test
	public void TestGoogle() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Amazon", Keys.ENTER);
		String ExpectedTtile = "Amazon - Google Search";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTtile);
		driver.close();

	}

	@Test
	public void TestFaceBook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		Thread.sleep(5000);
		// Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		assertEquals(actualTitle,expectedTitle, "Title is mismatched");
		
		// URL Assertion
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/45";
		assertEquals(actualURL,expectedURL, "URL is mismatched");
		
		// Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		assertEquals(actualText,expectedText, "Username text is mismatched");
		
		System.out.println(driver.getTitle());
		driver.close();
	}
		public void TestTekSchool() {
		driver = new ChromeDriver();
		driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("supervisor");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tek_supervisor");
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}

}

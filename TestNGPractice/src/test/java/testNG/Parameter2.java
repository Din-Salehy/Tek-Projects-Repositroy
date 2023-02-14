package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter2 {

	WebDriver driver;

	@Test
	public void testGoogle() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorial", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public void testFaceBook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https:/www.facebook.com/"));
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}
}

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void testGoogle() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorial",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}
	@Test
	public void testFaceBook() throws InterruptedException
	{
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

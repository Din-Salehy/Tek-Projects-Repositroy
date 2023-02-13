package myTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver;

	@Test
	public void navigateToPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
Thread.sleep(3000);
	}

	@Test
	public void enterLogin() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	public void verifyLogin() {
		WebElement element = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title'][1]/span/h6"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.close();
	}
	
}

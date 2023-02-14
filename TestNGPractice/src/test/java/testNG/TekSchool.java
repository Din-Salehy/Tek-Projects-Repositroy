package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekSchool {

	WebDriver driver;

	@Test
	public void enterLoginDetails() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("tiger420@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("tiger420");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	}
	@Test
	public void verifyLogin()
	{
		driver.findElement(By.xpath("//div[@id='account-account']/ul/li[2]/a")).isDisplayed();
		WebElement text = driver.findElement(By.xpath("//div[@id='account-account']/ul/li[2]/a"));
		System.out.println(text);
	}
	@Test
	public void verifLoginPage()
	{
		driver.findElement(By.xpath("//div[@id='content']")).isDisplayed();
		driver.quit();
	}
	
	public void tearDown()
	{
		driver.close();
	}
}

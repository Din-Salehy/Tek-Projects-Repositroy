package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	WebDriver driver;

	@Test
	public void hotelLoginTest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/hotel/");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("email")).sendKeys("tiger420@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12324");
		driver.findElement(By.name("SubmitLogin")).click();
		WebElement actualErrorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li"));
		System.out.println("This is errorMesga " + actualErrorMsg);
		driver.quit();
		
	}
	@Test
	public void tekSchoolLogin() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("tiger420@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("tiger420");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.quit();
	}
	
	@Test
	public void googleTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook.com",Keys.ENTER);
		String expectedTitle = "facebook.com - Google Search";
		String actualTitle = driver.getTitle();
		System.out.println();
		Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		driver.quit();
		
	}
}

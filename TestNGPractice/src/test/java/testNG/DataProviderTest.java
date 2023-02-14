package testNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	@Test(dataProvider = "loginTestData")
	public void testLogin(String userName, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
		driver.close();
	}
	@DataProvider (name= "loginTestData")
	public Object[][] loginData() {
		Object [][] data = new Object[2][2]; 
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "admin1234";
		
		return data;
	}
}
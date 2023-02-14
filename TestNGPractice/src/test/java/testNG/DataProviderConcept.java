package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {

	
	@Test(dataProvider = "loginData") // Calling the Data provider-- > Use dataProvider parameter , and pass Data provider name
	public void enterLoginDetails(String usreName, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://tek-school.com/retail/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("usreName");
		driver.findElement(By.id("input-password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.quit();
}
	@DataProvider
	public Object [][] loginData() throws InterruptedException{
		Object[][] data = new Object[2][2];
		Thread.sleep(2000);
		data[0][0] = "tiger420@gmail.com";
		data[0][1] = "tiger420";	
		Thread.sleep(2000);
		data[1][0] = "tiger123";
		data[1][1] = "123445";
				
		return data;
	}
	
	
	
}
package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	WebDriver driver;

	@org.testng.annotations.Parameters("browserName")
	@Test
	public void lounchBrowser(String browserName) {
		switch(browserName)
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
			break;
			
			default: 
				System.err.println("Browser name is invalid");
				break;
			
		}
		
		driver.manage().window().maximize();
	}

	
	@org.testng.annotations.Parameters ("url")
	@Test
	public void launchApp(String url) 
	{
		driver.get(url);
	}
	@org.testng.annotations.Parameters ({"userName" , "password"}) // here use curly bracket for more than one parameter values.
	@Test
	public void enterLoginDetails(String userName, String password) throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	}

	@Test
	public void verifyLogin() {
		driver.findElement(By.xpath("//div[@id='account-account']/ul/li[2]/a")).isDisplayed();
		WebElement text = driver.findElement(By.xpath("//div[@id='account-account']/ul/li[2]/a"));
		System.out.println(text);
	}

	@Test
	public void verifLoginPage() {
		driver.findElement(By.xpath("//div[@id='content']")).isDisplayed();
		driver.quit();
	}
}

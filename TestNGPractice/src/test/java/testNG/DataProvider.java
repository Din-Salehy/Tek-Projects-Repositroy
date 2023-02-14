package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

	WebDriver driver;

	@Test(dataProvider = "signInData")
	public void enterLoginDetails(String userName, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown open']/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

	@org.testng.annotations.DataProvider(name = "signInData") // to identify each data provider, uniquely we assign name to data provider
	public Object[][] loginData() 
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "tiger420@gmail.com";
		data[0][1] = "tiger420";
		
		data[1][0] ="tiger420@gmail.com";
		data[1][1] ="234324";
		
		return data;
		
	}

}
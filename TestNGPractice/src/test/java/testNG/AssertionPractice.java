package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionPractice {

	@Test
	public void checkAssertion() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		String actualtitle = driver.getTitle();
//		Assert.assertEquals(actualtitle, "Your Store");	
		Assert.assertTrue(actualtitle.equals("Your Stroe"));
		driver.close();
		
		}
		
		
	}

package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01_swaglogin extends TestBase
{
	@Test
	public void validation()
{
		log.info("apply verification");

//BA/PO/DEV--acceptance criteria
		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			log.info("login test case is passed");
		}
		else
		{
			log.info("login test case is failed");
		}
}
		
}


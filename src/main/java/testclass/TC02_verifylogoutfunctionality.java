package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_verifylogoutfunctionality extends TestBase
{
	@Test
public void validation()
{
		//apply verification
		
		String expectedTitle = "Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			log.info("logout test case is passed");
		}
		else
		{
			log.info("logout test case is failed");
		}
		
		
}
}

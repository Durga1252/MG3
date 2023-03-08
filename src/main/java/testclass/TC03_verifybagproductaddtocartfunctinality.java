package testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtest.Homepomclass;
public class TC03_verifybagproductaddtocartfunctinality extends TestBase 
{
	@Test
	public void validation()
	{
	
		log.info("apply validation");
		
		Homepomclass hp= new Homepomclass(driver);
		hp.clickbagproduct();
		String expectedproductselected="1";
		String actualproductselected=hp.getTextfromaddtocart();
		
		if(expectedproductselected.equals(actualproductselected))
		{
			log.info("bag add to cart test case is passed");
		}
		else
		{
			log.info("bag add to cart test case is failed");
		}
		
		
}
}

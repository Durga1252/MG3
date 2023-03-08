package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomtest.Homepomclass;

public class TC04_verifyallproductsaddtocartfunctionality extends TestBase
{
    //WebDriver driver;
		@Test
	public  void verifyTitle()
	{
			log.info("Went on homepage");
		String title= driver.getTitle();
		String expTitle="Swag Labs";
		if(expTitle.equals(title))
		{
			log.info("Title test case is passed");
		}
		else
		{
			log.info("Title test case is failed");
		}
	}
		
		//all bag product addtocart
		@Test
	public void verifyproduct()	
	{
		Homepomclass hp= new Homepomclass(driver);
		
//		hp.clickonmultiproducts();
		// System.out.println("clicked on all products");
		
		// apply dropdown 
		
		hp.clickdropdown();
		log.info("clicked on dropdown");
		
		log.info("apply validation");
		
		hp.clickonmultiproducts();
		
		hp.getTextfromaddtocart();
		log.info("add to cart contains 6 items");
	
		String expectedproductselected="6";
		String actualproductselected=hp.getTextfromaddtocart();
		
		if(expectedproductselected.equals(actualproductselected))
		{
			log.info("all product add to cart test case is passed");
		}
		else
		{
			log.info("all product add to cart test case is failed");
		}
		
		}
		
}

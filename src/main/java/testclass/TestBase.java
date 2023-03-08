package testclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pomtest.Homepomclass;
import pomtest.Swagpomcl;

public class TestBase 
{
	
	WebDriver driver;
	Logger log =Logger.getLogger("Org.SauceDemo");
	@Parameters("browserName")
	@BeforeMethod
	public  void setUp(String browserName) 
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
			"F:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
		
				"F:\\chromedriver_win32\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else
		{
			log.info("Throw Error");
		}
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		// System.out.println("Window is maximized");
		log.info("Window is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Swagpomcl x=new Swagpomcl(driver);
		x.sendusername();
		log.info("username is entered");

		x.sendpass();
		log.info("password is entered");
		
		x.clickloginbtn();
		log.info("click on login button");
		
//		Homepomclass hp= new Homepomclass(driver);
//		
//		hp.clicksettingbtn();
//		System.out.println("clicked on setting button");
//		
//		hp.clicklogoutbtn();
//		System.out.println("clicked on logout button");
//		
//		hp.clickbagproduct();
//		System.out.println("clicked on bag product");
		
		Homepomclass hp= new Homepomclass(driver);

		
		hp.clickonmultiproducts();
		log.info("clicked on all products");
		
		hp.clickdropdown();
		log.info("clicked on dropdown");
		
	}
	 @AfterMethod
		public void tearDown()
		{
		driver.quit();
		log.info("browser is closed");
		log.info("end of program");
}

}

package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swagpomcl 
{
 private WebDriver driver;
 private Actions act;

@FindBy(xpath="//input[@id='user-name']")WebElement username;
 public void sendusername()
 {
	 username.sendKeys("standard_user");
 }
  
 @FindBy(xpath="//input[@id='password']") WebElement pass;
 public void sendpass()
 {
	 pass.sendKeys("secret_sauce");
 }
 
 @FindBy(xpath="//input[@type='submit']") WebElement login;
 public void clickloginbtn()
 {
	 act.click(login).perform();
 }
 
 public Swagpomcl(WebDriver driver)
 {
	 this.driver = driver;
	 
	 PageFactory.initElements(driver, this);
	 act = new Actions(driver);
 }


}

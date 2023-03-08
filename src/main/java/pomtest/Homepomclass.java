package pomtest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepomclass 
{
	private WebDriver driver;
	private Select s;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")WebElement settingbtn;
	 public void clicksettingbtn()
	 {
		 settingbtn.click();
	 }
	 
	 @FindBy(xpath="//a[@id='logout_sidebar_link']")WebElement logoutbtn;
	 public void clicklogoutbtn()
	 {
		 logoutbtn.click();
	 }
	 
	 //Bag elemnet add to cart
	 @FindBy(xpath="(//div[@class='inventory_item_name'])[1]")WebElement bagproduct;
	 public void clickbagproduct()
	 {
		 bagproduct.click();
	 }
	 
	 @FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement addtocart;
	 public String getTextfromaddtocart()
	 {
		 String actualproductselected= addtocart.getText();
		return actualproductselected;
	 }
	 
	 @FindBy(xpath="//button[text()='Add to cart']")
	 List<WebElement> multiproducts;
	 public void clickonmultiproducts()
	 {
		for(int i=0;i<multiproducts.size();i++)
		{
			multiproducts.get(i).click();

		}
			
	 }
	 
	 @FindBy(xpath="//select[@class='product_sort_container']") WebElement dropdown;
	 public void clickdropdown()
	 {
		 dropdown.click();
		 s.selectByValue("za");
	 }
	 
	 public Homepomclass(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 s=new Select(dropdown);
}
	 
}



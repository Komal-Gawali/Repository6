package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

import Utility.UtilityOfSelectClass;

public class InventaryPage extends TestBase {

//Object Repository

	@FindBy(xpath = "//div[@class='peek']") private WebElement peek1Logo;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement 	appLogo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
	
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement dropdown;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkedIn;
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement infoAbout;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement robotlogo;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backpackBtn;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement boltTShirt;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") private WebElement tShirt;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement fleeceJacket;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartBtn;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement countItems;
	
	
	public InventaryPage() 
	{
		PageFactory.initElements(driver, this);
	}

    public String verifyURL()
    {
    	 return driver.getCurrentUrl();
    }
	
    public boolean verifypeek1Logo() throws Exception 
    {
		Thread.sleep(3000);
		return peek1Logo.isDisplayed();
	}
	
    public boolean verifyAppLogo() {
    	  return appLogo.isDisplayed();
    }
	
    public boolean verifyMenuBtn() 
    {
    	   return menuBtn.isDisplayed();
    }
   
    public boolean verifycartbtn() 
    {
    	   return cartBtn.isDisplayed();
    }
   
    public boolean verifydropdown() 
    {
    	    return dropdown.isDisplayed();
    }
   
    public boolean verifytwitterLogo() 
    {
    	    return twitterLogo.isDisplayed();
    }
   
    public boolean verifyfacebookLogo()
    {
    	   return facebookLogo.isDisplayed();
    }
   
    public boolean verifylinkedIn() 
    {
    	   return linkedIn.isDisplayed();
    }
  
    public String verifyinfoAbout()
    {
    	   return infoAbout.getText();
    }
    
    public boolean verifyrobotlogo() {
    	  return robotlogo.isDisplayed();
    }
    
    public Object verifycartBtnClickable() throws InterruptedException {
    	dropdown.click();
    	Thread.sleep(1000);
    	UtilityOfSelectClass.selectClass(dropdown, "PRICE (LOW AND HIGH)");
    	Thread.sleep(1000);
    	backpackBtn.click();
    	Thread.sleep(500);
    	boltTShirt.click();
    	Thread.sleep(300);
    	tShirt.click();
    	Thread.sleep(300);
    	fleeceJacket.click(); 
    	Thread.sleep(300);
    	cartBtn.click();
		return countItems.getText();
	  }
    public String verifyCartPageOpen() throws InterruptedException {
    	verifycartBtnClickable();
    	  return driver.getCurrentUrl();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   



}
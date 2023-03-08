package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;
import Utility.ScreenshotTake;

public class LogInPage extends TestBase{
	
	//object repository 
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//span[@class='title']") private WebElement productLable;
	@FindBy(xpath = "//div[@class='peek']") private WebElement productLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortDropDown;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement shoppingCart;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySauceLabURL() {
		   return driver.getCurrentUrl();
	}
	
	public String verifysucelabtitle() {
		  return driver.getTitle();
	}
	
	public boolean verifyLoginBtn() {
		  return loginBtn.isEnabled();
	}
	
	public void verifyUsernameTextbox() {
		 usernameTextbox.click();
	}
	
	public void verifyPasswordTextbox() {
		passwordTextbox.click();
	}
	
	public boolean verifyloginLogo() {
		  return  loginLogo.isDisplayed();
	}
	
	public boolean verifyUsernameDisplayed() throws Exception {
		    usernameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		    return usernameTextbox.isDisplayed();
	}
	
	public boolean verifyPasswordDisplayed() throws Exception {
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		 return passwordTextbox.isDisplayed();
	}
	
	public String verifyLoginpage() throws Exception {
		usernameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		 return driver.getCurrentUrl();
		}
	public String verifyproductLable() throws Exception {
		verifyLoginpage();
		 return productLable.getText();
	}
	public boolean verifyProductLogo() throws Exception {
		verifyLoginpage();
		  return productLogo.isDisplayed();
	}
	public boolean verifysortDropDown() throws Exception {
		verifyLoginpage();
		sortDropDown.click();
		   return sortDropDown.isDisplayed();
	 }
	public boolean verifyshoppingCart() throws Exception {
		verifysortDropDown();
		ScreenshotTake.takeScreenshot();
		return shoppingCart.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ScreenshotTake;

public class CartPage extends TestBase{
//
	
	//Object Repository
	@FindBy(xpath = "//span[@class='title']") private WebElement titleCart;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement qltLable;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement discripLable;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement contiBtn;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkOutBtn;
	@FindBy(id = "remove-sauce-labs-backpack") private WebElement backpackRemove;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement countItems;
	@FindBy(xpath = "//input[@id ='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id ='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id ='postal-code']") private WebElement postalCode;
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCartPageTitle() {
		   return titleCart.getText();
	}
	
	public String verifyqltlable() {
		 return qltLable.getText();
	}
	
	public String verifydescripLable() {
		 return discripLable.getText();
	}
	public boolean verifycontinueBtn() {
		 return contiBtn.isDisplayed();
	}
	
	public boolean verifycheckOutBtn() {
		 return checkOutBtn.isDisplayed();
	}
	public boolean verifybackpackRemove() {
		   return backpackRemove.isDisplayed();
	}
	public String verifybackpackremoveBtn() throws Exception {
		backpackRemove.click();
		ScreenshotTake.takeScreenshot();
		return countItems.getText();
	}
    public String verifycontinueBtnClick() {
    	contiBtn.click();
    	 return driver.getCurrentUrl();
    	
    }
    public String verifycheckOutBtnClick() {
    	checkOutBtn.click();
    	 return driver.getCurrentUrl();
    	
    }
	public void verifyfirstNameFocused() {
		verifycheckOutBtnClick();
		firstName.click();
		
	}
	public void verifylastNameFocused() {
		verifycheckOutBtnClick();
		lastName.click();
	}
	
	public void verifypostalCodeFocused() {
		verifycheckOutBtnClick();
		postalCode.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

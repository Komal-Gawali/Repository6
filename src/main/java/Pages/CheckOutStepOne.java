package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckOutStepOne extends TestBase {

	//Object Repository
	@FindBy(xpath = "//button[@id ='cancel']") private WebElement cancelBtn;
	@FindBy(xpath = "//span[@class ='title']") private WebElement checkoutTitle;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id ='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id ='postal-code']") private WebElement postalCode;
	@FindBy(xpath = "//input[@type='submit']") private WebElement continueBtn;
	
	public CheckOutStepOne() {
		PageFactory.initElements(driver, this);
	}
	public String verifyURL() {
		return driver.getCurrentUrl();
	}
	public String verifycheckoutTitle() {
		 return checkoutTitle.getText();
	}
	public boolean verifycancelBtn() {
		return cancelBtn.isDisplayed();
	}
	public String verifycancelBtnClick() {
		cancelBtn.click();
		 return driver.getCurrentUrl();
	}
	public void verifyfirstNameData() throws Exception {
		firstName.sendKeys(ReadData.readPropertyFile2(0, 0));
		
	}
	public void verifylastNameData() throws Exception {
		lastName.sendKeys(ReadData.readPropertyFile2(0, 1));
	}
	public void verifyPostalCode() throws Exception {
		postalCode.sendKeys(ReadData.readPropertyFile2(0, 2));
	}
	
	public boolean verifyContinueBtn() {
		 return continueBtn.isEnabled();
		
	}
	
	public void insertInfo() throws Exception {
//		Thread.sleep(300);
		firstName.sendKeys(ReadData.readPropertyFile2(0, 0));
		Thread.sleep(300);
		lastName.sendKeys(ReadData.readPropertyFile2(0, 1));
		Thread.sleep(300);
		postalCode.sendKeys(ReadData.readPropertyFile2(0, 2));
		Thread.sleep(300);
		continueBtn.click();
//		Thread.sleep(300);
//		return driver.getCurrentUrl();
	}
	
//	Click on checkout btn
	public String verifyCheckoutBtn() throws Exception {
		insertInfo();
		 return driver.getCurrentUrl();
		
	}
	
	
	
}

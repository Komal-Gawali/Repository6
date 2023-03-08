package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CkeckOutSecondStep extends TestBase {

	
//	Object Repository
	@FindBy(xpath = "//span[@class='title']") private WebElement titleSeconCheckOut;
	@FindBy(xpath = "//div[@class='summary_info']") private WebElement orderDetails;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;
	@FindBy(xpath = "//span[@class ='title']") private WebElement completeStatus;
	@FindBy(xpath = "//h2[@class='complete-header']") private WebElement headline;
	@FindBy(xpath = "//div[@class='complete-text']") private WebElement aboutOrder;
	@FindBy(xpath = "//img[@class='pony_express']") private WebElement ponyExp;
	@FindBy(xpath = "//button[@id='back-to-products']") private WebElement backBtn;
	
	public CkeckOutSecondStep() {
		PageFactory.initElements(driver, this);
	}
	public String verifytitleSeconCheckOut() {
		titleSeconCheckOut.isDisplayed();
		  return titleSeconCheckOut.getText();
	}
	public String verifyorderDetails() {
		 return orderDetails.getText();
	}
	public void verifyfinishBtn() {
		  finishBtn.click();
	}
	public String verifyorderComplete() {
		verifyfinishBtn();
		return completeStatus.getText();
	}
	public String verifyOrderDone() {
		verifyfinishBtn();
		 return headline.getText();
	}
	public String verifyaboutOrder() {
		verifyfinishBtn();
		 return aboutOrder.getText();
	}
	public boolean verifyponyExp() {
		verifyfinishBtn();
		return ponyExp.isDisplayed();
	}
	public String verifybackBtn() throws Exception {
		verifyfinishBtn();
		Thread.sleep(300);
	     backBtn.isDisplayed();
		 backBtn.click();
		return driver.getCurrentUrl();
	}
	
}

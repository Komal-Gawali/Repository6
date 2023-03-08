package OrangePages ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.OrangeURL;

public class OrangeDashBoard extends OrangeURL{
	
//	Object Repository
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") private WebElement dashBoardLabel;
	@FindBy(xpath = "//img[@alt='client brand banner']") private WebElement oraLogo;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']") private WebElement searchTextBox;
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]") private WebElement adminInfo;
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]") private WebElement aboutPIM;
	
	
	public OrangeDashBoard() {
		PageFactory.initElements(driver, this);
	}
	
//	URL of OrangeHRM
	public String verifyLoginOrangeDashBoard() {
		 return driver.getCurrentUrl();
	}
	
//	Dashboard logo displayed
	public String  verifyDashboardlabel() {
		 dashBoardLabel.isDisplayed();
		 return dashBoardLabel.getText();
	}
	
//	orange logo
	public boolean verifyOrangeLogo() {
		   return oraLogo.isDisplayed();
	}
	
//	Check search textbox
	public boolean verifysearchTextbox() {
		  return searchTextBox.isEnabled();
	}
	
//	Admin details information
	public boolean verifyadminInfo() {
		  return adminInfo.isDisplayed();
	}
	
	public boolean verifyaboutPIM() {
		  return aboutPIM.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
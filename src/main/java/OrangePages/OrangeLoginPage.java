package OrangePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.OrangeURL;
import Utility.ReadData;

public class OrangeLoginPage extends OrangeURL {

	//Object repository
	@FindBy(xpath = "//img[@alt='company-branding']") private WebElement orangeLogo;
	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement orangeHRForAlllogo;
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']") private WebElement loginLlogo;
	@FindBy(xpath = "//label[@class='oxd-label']") private WebElement nsernamelabel;
	@FindBy(xpath = "//input[@name='username']") private WebElement usernameTextbox;
	@FindBy(xpath = "//label[text()='Password']") private WebElement passwordLabel;
	@FindBy(xpath = "//input[@name='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]") private WebElement aboutVersion;
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/div[3]/div[1]/a[1]") private WebElement linkedinLink;
	
	
	public OrangeLoginPage() {
		PageFactory.initElements(driver, this);
	}
//	get url of orangeHRM
	public String verifyOrangeUrl() {
		return driver.getCurrentUrl();
	}
	
//	Check Title of login OrangeHRM page
	public String verifyOrangeTitle() {
		  return driver.getTitle();
	}
	
	
//	Check a Logo of OrangeHRM
	public boolean verifyOrangeLogo() {
		return orangeLogo.isDisplayed();
	}
	
// Check logo of HR for all orange logo
	public boolean verifyorangeHRForAlllogo() {
		return orangeHRForAlllogo.isDisplayed();
	}
	
//	Check login logo
	public boolean verifyloginLlogo() {
		 return loginLlogo.isDisplayed();
	}
	
//	label-1= "username"
	public String verifyUsernameLabel() {
		  return nsernamelabel.getText();
	}
	
//	Check username Textbox
	public boolean verifyusernameTextbox() {
		  return usernameTextbox.isDisplayed();
	}
	
//	label-2="password"
	public String verifypasswordLabel() {
		 return passwordLabel.getText();
	}
	
	
//	Check password textbox
	public boolean verifypasswordTextbox() {
	       return passwordTextbox.isDisplayed();
	}
	
//	login button
	public boolean verifyloginBtn() {
		return loginBtn.isEnabled();
	}
	
//	insert nsername in usernameTextbox
	public void verifyUsername() throws Exception {
		Thread.sleep(200);
//		usernameTextbox.sendKeys("Admin");
		usernameTextbox.sendKeys(ReadData.readPropertyFile("Username1"));
	}
	
//	insert password
	public void verifyPassword() throws Exception {
		passwordTextbox.sendKeys(ReadData.readPropertyFile("Password1"));
	}
	
//	version number
	public String verifyaboutVersion() {
		 return aboutVersion.getText();
	}
	
//	login to app
	public String loginOrange() throws Exception {
		Thread.sleep(200);
		usernameTextbox.sendKeys(ReadData.readPropertyFile("Username1"));
		Thread.sleep(200);
		passwordTextbox.sendKeys(ReadData.readPropertyFile("Password1"));
		Thread.sleep(200);
		loginBtn.click();
		 return driver.getCurrentUrl();
		}
	
//	Linkedin Logo
	public boolean verifyLinkedLogo() {
		  return linkedinLink.isDisplayed();
	}
	
}

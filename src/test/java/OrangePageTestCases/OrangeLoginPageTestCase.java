package OrangePageTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.OrangeURL;
import OrangePages.OrangeLoginPage;

public class OrangeLoginPageTestCase extends OrangeURL {
   
	OrangeLoginPage orange;
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception {
		enterURL();
		Thread.sleep(3000);
	    orange = new OrangeLoginPage();
		}
	@Test(priority = 1, groups = "Smoke")
	public void verifyOrangeUrlTest() {
	    String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actUrl = orange.verifyOrangeUrl();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log(actUrl);
	}
	
	@Test (priority = 3, dependsOnMethods = "verifyOrangeUrlTest", groups = "Smoke")
	public void verifyOrangeLogoTest() {
		 boolean actLogo = orange.verifyOrangeLogo();
		 Assert.assertEquals(actLogo, true);
	}
	
	@Test (priority = 2, groups = "Sanity")
	public void verifyOrangetitle() {
		 String expTitle = "OrangeHRM";
		 String actTitle = orange.verifyOrangeTitle();
		 Assert.assertEquals(expTitle, actTitle);
		 Reporter.log("Title:- " + actTitle);
	}
	
	@Test (priority = 4, groups = "Sanity")
	public void verifyorangeHRForAlllogoTest() {
		  boolean actLogo1 = orange.verifyorangeHRForAlllogo();
		  Assert.assertEquals(actLogo1, true);
	}
	
	@Test (priority = 5, groups = "Smoke")
	public void verifyloginLlogoTest() {
		boolean log = orange.verifyloginLlogo();
		Assert.assertEquals(log, true);
	}
	
	@Test(groups = "Regression")
	public void verifyUsernameLabelTest() {
		 
		  String realLogo = orange.verifyUsernameLabel();
		  Assert.assertEquals(realLogo, "Username");
		  Reporter.log(realLogo);
	}
	@Test (priority = 6, groups = {"Smoke", "Regression"})
	public void verifyusernameTextboxtest() {
		    boolean untextbox = orange.verifyusernameTextbox();
		    Assert.assertEquals(untextbox, true);
	}
	
	@Test (priority = 8, groups = {"Smoke", "Regression"})
	public void verifypasswordTextboxTest() {
		 boolean passTextbox = orange.verifypasswordTextbox();
		 Assert.assertEquals(passTextbox, true);
	}
	
	@Test (priority = 10, groups = {"Sanity", "Regression"})
	public void verifyloginBtnTest() {
	        boolean loginBtn = orange.verifyloginBtn();
	        Assert.assertEquals(loginBtn, true);
	}
	
	@Test (priority = 7, groups = {"Sanity", "Regression"})
	public  void verifyUsernameTest() throws Exception {
		  orange.verifyUsername();
	}
	
	
	
	@Test (priority = 9, groups = {"Sanity", "Regression"})
	public void verifyPasswordTest() throws Exception {
		orange.verifyPassword();
	}
	
	@Test (groups = "Regression")
	public void verifypasswordLabelTest() {
		String actResult = orange.verifypasswordLabel();
		Assert.assertEquals(actResult, "Password");
		Reporter.log(actResult);
	}
	
	@Test (groups =  "Regression")
	public void verifyaboutVersionTest() {
		 String expVer = "OrangeHRM OS 5.3";
		 String actVer = orange.verifyaboutVersion();
		 Assert.assertEquals(expVer, actVer);
		 Reporter.log(actVer);
	}
	
	
	
	@Test (priority = 11, groups = {"Sanity", "Regression"})
	public void loginOrangeTest() throws Exception {
		    String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		   String result = orange.loginOrange();
		   Assert.assertEquals(expected, result);
		   Reporter.log("Home URL:-" + result);
	}
	
	@Test
	public void verifyLinkedLogotest() {
		     boolean linkLogo = orange.verifyLinkedLogo();
		     Assert.assertEquals(linkLogo, true);
	}
	
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() throws Exception {
		
		Thread.sleep(3000);
		driver.close();
	}
	
}

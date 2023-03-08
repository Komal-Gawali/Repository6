package TestCase;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LogInPage;
import Utility.ScreenshotTake;

public class InventarPageTest extends TestBase {
	LogInPage login;
	InventaryPage inventory;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception 
	{
		initialization();
		 login = new LogInPage();
		 Thread.sleep(3000);
		 login.verifyLoginpage();
		 inventory = new InventaryPage();
		 
	}

	@Test (invocationTimeOut = 3)
	public void verifyURLTest()
	{
		  String expurl = "https://www.saucedemo.com/inventory.html";
		  String acturl = inventory.verifyURL();
		  Assert.assertEquals(expurl, acturl);
    }
	
	@Test (dependsOnMethods = "verifyURLTest"  , priority = 2)
	public void verifypeek1LogoTest() throws Exception {
		  boolean actPeekLogo = inventory.verifypeek1Logo();
		  Thread.sleep(3000);
		  Assert.assertEquals(actPeekLogo, true);
	}
	
	@Test
	public void verifyAppLogoTest() {
		  boolean actLogo = inventory.verifyAppLogo();
		  Assert.assertEquals(actLogo, true);
		  
	}
	
	@Test
	public void verifyMenuBtnTest()
	{
		     boolean menu = inventory.verifyMenuBtn();
		     Assert.assertEquals(menu, true);
	}
	
	@Test
	public void verifycartbtnTest()
	{
		      boolean cart = inventory.verifycartbtn();
		      Assert.assertEquals(cart, true);
	}
	
	@Test
	public void verifydropdownTest() {
		      boolean dropD = inventory.verifydropdown();
		      Assert.assertEquals(dropD, true);
	}
	
	@Test (groups = "Regression")
	public void verifytwitterLogoTest() {
		         boolean tLogo = inventory.verifytwitterLogo();
		         Assert.assertEquals(tLogo, true);
	}
	
	@Test (groups = "Regression")
	public void verifyfacebookLogoTest() {
		       boolean fLogo = inventory.verifyfacebookLogo();
		       Assert.assertEquals(fLogo, true);
	}
	
	@Test
	public void verifylinkedInTest() {
		        boolean lLogo = inventory.verifylinkedIn();
		        Assert.assertEquals(lLogo, true);
	}
	
	@Test
	public void verifyinfoAboutTest() {
		          String expInfo = "© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		          String actInfo = inventory.verifyinfoAbout();
		          Assert.assertEquals(expInfo, actInfo);
		          Reporter.log("Info :- " + actInfo);
		          
	}
	
	@Test
	public void verifyrobotlogoTest() {
		   boolean actLogo = inventory.verifyrobotlogo();
		   Assert.assertEquals(actLogo, true);
	}
	
	
	@Test
	public void verifycartBtnClickableTest() throws Exception {
		  Object counts = inventory.verifycartBtnClickable();
		Assert.assertEquals(counts, "4");
		   Reporter.log("CartURL:-" + counts);
	}
	
	@Test
	public void verifyCartPageOpenTest() throws Exception {
		  String url = inventory.verifyCartPageOpen();
		  Reporter.log("Cart url :-"+ url);
	}
	
	
	@AfterMethod (alwaysRun = true)
	public void closebrowser(ITestResult a) throws Exception {
		if(ITestResult.FAILURE== a.getStatus())
		{
			ScreenshotTake.captureScreenshot(a.getName());
		}
		Thread.sleep(3000);
		driver.close();
	}
}

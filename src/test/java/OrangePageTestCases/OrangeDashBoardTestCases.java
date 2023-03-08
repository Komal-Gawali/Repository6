package OrangePageTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.OrangeURL;
import OrangePages.OrangeDashBoard;
import OrangePages.OrangeLoginPage;

public class OrangeDashBoardTestCases extends OrangeURL {
	 
	OrangeLoginPage oragLP;
	OrangeDashBoard dashBoard;
	
	@BeforeMethod
	public void setup() throws Exception {
		enterURL();
		Thread.sleep(3000);
		oragLP = new OrangeLoginPage();
		oragLP.loginOrange();
		Thread.sleep(300);
		dashBoard = new OrangeDashBoard();
	}
	
	@Test
	public void verifyCurrentURL() {
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String urlOrange = dashBoard.verifyLoginOrangeDashBoard();
		Assert.assertEquals(expected, urlOrange);
		Reporter.log("Orange HomePage:- " + urlOrange);
	}
	
	@Test
	public void verifyDashboardlabelTest() {
	     String result = dashBoard.verifyDashboardlabel();	
		 Assert.assertEquals(result, "Dashboard");
		 Reporter.log("DashBoard label:- "  + result);
	}
	
	@Test
	public void verifyOrangeLogoTest() {
	      boolean actLogo = dashBoard.verifyOrangeLogo();	
	      Assert.assertEquals(actLogo, true);
	}
	
	@Test
	public void verifysearchTextboxTest() {
		    boolean textbox = dashBoard.verifysearchTextbox();
		    Assert.assertEquals(textbox, true);
	}
	
	@Test(priority = 1)
	public void verifyadminInfoTest() {
		   boolean actResult = dashBoard.verifyadminInfo();
		   Assert.assertEquals(actResult, true);
	}
	
	@Test (timeOut = 2000)
	public void verifyaboutPIMTest() {
		System.out.println("Soft Assertion");
		   SoftAssert soft = new SoftAssert();
		     boolean actresult = dashBoard.verifyaboutPIM();
		     soft.assertAll();
		     System.out.println("Hard assrtion");
		     Assert.assertEquals(actresult, true);
		     
//		     Assert.assertEquals(actresult, true);
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
}